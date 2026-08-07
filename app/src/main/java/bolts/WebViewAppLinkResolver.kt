package bolts

import android.content.Context
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection
import java.util.Collections

class WebViewAppLinkResolver(private val context: Context) : AppLinkResolver {

    override fun getAppLinkFromUrlInBackground(destinationUri: Uri): Task<AppLink> {
        val content = Capture<String>()
        val contentType = Capture<String>()
        return Task.callInBackground(java.util.concurrent.Callable<Void> {
            var url: URL? = URL(destinationUri.toString())
            var connection: URLConnection? = null
            while (url != null) {
                connection = url.openConnection()
                if (connection is HttpURLConnection) {
                    connection.instanceFollowRedirects = true
                }
                connection.setRequestProperty(PREFER_HEADER, META_TAG_PREFIX)
                connection.connect()
                if (connection is HttpURLConnection) {
                    val responseCode = connection.responseCode
                    if (responseCode in 300..399) {
                        val newUrl = URL(connection.getHeaderField("Location"))
                        connection.disconnect()
                        url = newUrl
                        continue
                    } else {
                        url = null
                    }
                } else {
                    url = null
                }
                content.set(readFromConnection(connection))
                contentType.set(connection.contentType)
                if (connection is HttpURLConnection) {
                    connection.disconnect()
                }
            }
            null
        }).onSuccessTask(
            { _: Task<Void> ->
                val tcs = Task.create<JSONArray>()
                val webView = WebView(context)
                webView.settings.javaScriptEnabled = true
                webView.setNetworkAvailable(false)
                webView.webViewClient = object : WebViewClient() {
                    private var loaded = false

                    private fun runJavaScript(view: WebView) {
                        if (!loaded) {
                            loaded = true
                            view.loadUrl(TAG_EXTRACTION_JAVASCRIPT)
                        }
                    }

                    override fun onPageFinished(view: WebView, url: String?) {
                        super.onPageFinished(view, url)
                        runJavaScript(view)
                    }

                    override fun onLoadResource(view: WebView, url: String?) {
                        super.onLoadResource(view, url)
                        runJavaScript(view)
                    }
                }
                webView.addJavascriptInterface(object {
                    @Suppress("unused")
                    fun setValue(result: String) {
                        try {
                            tcs.trySetResult(JSONArray(result))
                        } catch (e: JSONException) {
                            tcs.trySetError(e)
                        }
                    }
                }, "boltsWebViewAppLinkResolverResult")
                var mimeType: String? = null
                if (contentType.get() != null) {
                    mimeType = (contentType.get() as String).split(";")[0]
                }
                webView.loadDataWithBaseURL(
                    destinationUri.toString(),
                    content.get() as String,
                    mimeType,
                    null,
                    null
                )
                tcs.task
            },
            Task.UI_THREAD_EXECUTOR
        ).onSuccess { task ->
            val alData = parseAlData(task.getResult()!!)
            makeAppLinkFromAlData(alData, destinationUri)
        }
    }

    companion object {
        private const val TAG_EXTRACTION_JAVASCRIPT = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())"
        private const val PREFER_HEADER = "Prefer-Html-Meta-Tags"
        private const val META_TAG_PREFIX = "al"
        private const val KEY_AL_VALUE = "value"
        private const val KEY_APP_NAME = "app_name"
        private const val KEY_CLASS = "class"
        private const val KEY_PACKAGE = "package"
        private const val KEY_URL = "url"
        private const val KEY_SHOULD_FALLBACK = "should_fallback"
        private const val KEY_WEB_URL = "url"
        private const val KEY_WEB = "web"
        private const val KEY_ANDROID = "android"

        @Throws(JSONException::class)
        private fun parseAlData(jsonArray: JSONArray): Map<String, Any> {
            val data: MutableMap<String, Any> = HashMap()
            for (i in 0 until jsonArray.length()) {
                val jsonEntry = jsonArray.getJSONObject(i)
                val property = jsonEntry.getString("property")
                val keys = property.split(":")
                if (keys[0] != "al") continue
                var currentMap: MutableMap<String, Any> = data
                for (j in 1 until keys.size) {
                    @Suppress("UNCHECKED_CAST")
                    var list = currentMap[keys[j]] as? MutableList<Any>
                    if (list == null) {
                        list = ArrayList()
                        currentMap[keys[j]] = list
                    }
                    val nextMap: MutableMap<String, Any>? =
                        if (list.isNotEmpty()) list[list.size - 1] as? MutableMap<String, Any> else null
                    if (nextMap == null || j == keys.size - 1) {
                        val map: MutableMap<String, Any> = HashMap()
                        list.add(map)
                        currentMap = map
                    } else {
                        currentMap = nextMap
                    }
                }
                if (jsonEntry.has("content")) {
                    if (jsonEntry.isNull("content")) {
                        currentMap["value"] = JSONObject.NULL
                    } else {
                        currentMap["value"] = jsonEntry.getString("content")
                    }
                }
            }
            return data
        }

        private fun getAlList(map: Map<String, Any>, key: String): List<Any> {
            @Suppress("UNCHECKED_CAST")
            val list = map[key] as? List<Any>
            return list ?: Collections.emptyList()
        }

        @Suppress("UNCHECKED_CAST")
        private fun makeAppLinkFromAlData(alData: Map<String, Any>, destinationUri: Uri): AppLink {
            val targets = ArrayList<AppLink.Target>()
            var androidEntries = alData[KEY_ANDROID] as? List<Any>
            if (androidEntries == null) {
                androidEntries = Collections.emptyList()
            }
            for (entry in androidEntries) {
                val entryMap = entry as Map<String, Any>
                val urlList = getAlList(entryMap, KEY_URL)
                val packageList = getAlList(entryMap, KEY_PACKAGE)
                val classList = getAlList(entryMap, KEY_CLASS)
                val appNameList = getAlList(entryMap, KEY_APP_NAME)
                val count = maxOf(urlList.size, packageList.size, classList.size, appNameList.size)
                for (i in 0 until count) {
                    val urlString = if (urlList.size > i) (urlList[i] as Map<String, Any>)["value"] as String? else null
                    val url = tryCreateUrl(urlString)
                    val packageName = if (packageList.size > i) (packageList[i] as Map<String, Any>)["value"] as String? else null
                    val className = if (classList.size > i) (classList[i] as Map<String, Any>)["value"] as String? else null
                    val appName = if (appNameList.size > i) (appNameList[i] as Map<String, Any>)["value"] as String? else null
                    targets.add(AppLink.Target(packageName, className, url, appName))
                }
            }
            var webUrl: Uri? = destinationUri
            val webEntries = alData[KEY_WEB] as? List<Any>
            if (webEntries != null && webEntries.isNotEmpty()) {
                val webEntry = webEntries[0] as Map<String, Any>
                val webUrlList = webEntry[KEY_WEB_URL] as? List<Any>
                val shouldFallbackList = webEntry[KEY_SHOULD_FALLBACK] as? List<Any>
                if (shouldFallbackList != null && shouldFallbackList.isNotEmpty()) {
                    val shouldFallback = (shouldFallbackList[0] as Map<String, Any>)["value"] as String
                    if (listOf("no", "false", "0").contains(shouldFallback.lowercase())) {
                        webUrl = null
                    }
                }
                if (webUrl != null && webUrlList != null && webUrlList.isNotEmpty()) {
                    val urlString = (webUrlList[0] as Map<String, Any>)["value"] as String
                    webUrl = tryCreateUrl(urlString)
                }
            }
            return AppLink(destinationUri, targets, webUrl)
        }

        private fun tryCreateUrl(urlString: String?): Uri? =
            urlString?.let { Uri.parse(it) }

        @Throws(IOException::class)
        private fun readFromConnection(connection: URLConnection): String {
            var inputStream: InputStream?
            if (connection is HttpURLConnection) {
                inputStream = try {
                    connection.inputStream
                } catch (_: Exception) {
                    connection.errorStream
                }
            } else {
                inputStream = connection.getInputStream()
            }
            var encoding = connection.contentEncoding
            val outputStream = ByteArrayOutputStream()
            val buffer = ByteArray(1024)
            var bytesRead = inputStream.read(buffer)
            while (bytesRead != -1) {
                outputStream.write(buffer, 0, bytesRead)
                bytesRead = inputStream.read(buffer)
            }
            if (encoding == null) {
                val contentType = connection.contentType
                val parts = contentType.split(";")
                for (part in parts) {
                    val trimmed = part.trim()
                    if (trimmed.startsWith("charset=")) {
                        encoding = trimmed.substring("charset=".length)
                        break
                    }
                }
                if (encoding == null) {
                    encoding = "UTF-8"
                }
            }
            inputStream.close()
            return String(outputStream.toByteArray(), charset(encoding))
        }
    }
}
