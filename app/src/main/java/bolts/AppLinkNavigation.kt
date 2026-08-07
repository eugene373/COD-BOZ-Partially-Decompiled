package bolts

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.SparseArray
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.net.URL

class AppLinkNavigation(
    private val appLink: AppLink,
    extras: Bundle?,
    appLinkData: Bundle?
) {
    private val extras: Bundle = extras ?: Bundle()
    private val appLinkData: Bundle = appLinkData ?: Bundle()

    fun getAppLink(): AppLink = appLink

    fun getAppLinkData(): Bundle = appLinkData

    fun getExtras(): Bundle = extras

    private fun buildAppLinkDataForNavigation(context: Context?): Bundle {
        val data = Bundle()
        val refererAppLink = Bundle()
        if (context != null) {
            val packageName = context.packageName
            if (packageName != null) {
                refererAppLink.putString("package", packageName)
            }
            val appInfo = context.applicationInfo
            if (appInfo != null) {
                val appName = context.getString(appInfo.labelRes)
                if (appName != null) {
                    refererAppLink.putString("app_name", appName)
                }
            }
        }
        data.putAll(appLinkData)
        data.putString("target_url", appLink.getSourceUrl()?.toString())
        data.putString("version", VERSION)
        data.putString("user_agent", "Bolts Android 1.1.2")
        data.putBundle("referer_app_link", refererAppLink)
        data.putBundle("extras", extras)
        return data
    }

    @Throws(JSONException::class)
    private fun getJSONValue(value: Any?): Any? {
        when (value) {
            is Bundle -> return getJSONForBundle(value)
            is CharSequence -> return value.toString()
            is List<*> -> {
                val jsonArray = JSONArray()
                for (item in value) {
                    jsonArray.put(getJSONValue(item))
                }
                return jsonArray
            }
            is SparseArray<*> -> {
                val jsonArray = JSONArray()
                for (i in 0 until value.size()) {
                    jsonArray.put(value.keyAt(i), getJSONValue(value.valueAt(i)))
                }
                return jsonArray
            }
            is Char -> return value.toString()
            is CharArray -> {
                val jsonArray = JSONArray()
                for (c in value) {
                    jsonArray.put(getJSONValue(c))
                }
                return jsonArray
            }
            is BooleanArray -> {
                val jsonArray = JSONArray()
                for (b in value) {
                    jsonArray.put(getJSONValue(b))
                }
                return jsonArray
            }
            is DoubleArray -> {
                val jsonArray = JSONArray()
                for (d in value) {
                    jsonArray.put(getJSONValue(d))
                }
                return jsonArray
            }
            is FloatArray -> {
                val jsonArray = JSONArray()
                for (f in value) {
                    jsonArray.put(getJSONValue(f))
                }
                return jsonArray
            }
            is IntArray -> {
                val jsonArray = JSONArray()
                for (i in value) {
                    jsonArray.put(getJSONValue(i))
                }
                return jsonArray
            }
            is LongArray -> {
                val jsonArray = JSONArray()
                for (l in value) {
                    jsonArray.put(getJSONValue(l))
                }
                return jsonArray
            }
            is ShortArray -> {
                val jsonArray = JSONArray()
                for (s in value) {
                    jsonArray.put(getJSONValue(s))
                }
                return jsonArray
            }
            is Array<*> -> {
                val jsonArray = JSONArray()
                for (item in value) {
                    jsonArray.put(getJSONValue(item))
                }
                return jsonArray
            }
        }
        return null
    }

    @Throws(JSONException::class)
    private fun getJSONForBundle(bundle: Bundle): JSONObject {
        val jsonObject = JSONObject()
        for (key in bundle.keySet()) {
            jsonObject.put(key, getJSONValue(bundle.get(key)))
        }
        return jsonObject
    }

    fun navigate(context: Context): NavigationResult {
        val packageManager = context.packageManager
        val navigationBundle = buildAppLinkDataForNavigation(context)
        var openIntent: Intent? = null
        for (target in appLink.getTargets()) {
            val intent = Intent("android.intent.action.VIEW")
            val packageName = target.packageName
            val className = target.className
            val url = target.url
            if (url != null) {
                intent.setData(url)
            } else {
                intent.setData(appLink.getSourceUrl())
            }
            if (packageName != null) {
                intent.setPackage(packageName)
            }
            if (className != null) {
                intent.setClassName(packageName!!, className)
            }
            intent.putExtra("al_applink_data", navigationBundle)
            val resolveInfo = packageManager.resolveActivity(intent, 65536)
            if (resolveInfo != null) {
                openIntent = intent
                break
            }
        }
        var webIntent: Intent? = null
        var result = NavigationResult.FAILED
        if (openIntent != null) {
            webIntent = openIntent
            result = NavigationResult.APP
        } else {
            var webUrl = appLink.getWebUrl()
            if (webUrl != null) {
                var jsonAppLinkData: JSONObject? = null
                try {
                    jsonAppLinkData = getJSONForBundle(navigationBundle)
                } catch (e: JSONException) {
                    sendAppLinkNavigateEventBroadcast(context, null, NavigationResult.FAILED, e)
                    throw RuntimeException(e)
                }
                webUrl = webUrl.buildUpon()
                    .appendQueryParameter("al_applink_data", jsonAppLinkData.toString())
                    .build()
                webIntent = Intent("android.intent.action.VIEW", webUrl)
                result = NavigationResult.WEB
            }
        }
        sendAppLinkNavigateEventBroadcast(context, webIntent, result, null)
        webIntent?.let { context.startActivity(it) }
        return result
    }

    private fun sendAppLinkNavigateEventBroadcast(
        context: Context,
        intent: Intent?,
        result: NavigationResult,
        jsonException: JSONException?
    ) {
        val extraData = HashMap<String, String>()
        if (jsonException != null) {
            extraData["error"] = jsonException.localizedMessage
        }
        extraData["success"] = if (result.isSucceeded()) "1" else "0"
        extraData["type"] = result.getCode()
        MeasurementEvent.sendBroadcastEvent(context, "al_nav_out", intent, extraData)
    }

    enum class NavigationResult(private val code: String, private val succeeded: Boolean) {
        FAILED("failed", false),
        WEB("web", true),
        APP("app", true);

        fun getCode(): String = code
        fun isSucceeded(): Boolean = succeeded
    }

    companion object {
        private const val KEY_NAME_USER_AGENT = "user_agent"
        private const val KEY_NAME_VERSION = "version"
        private const val KEY_NAME_REFERER_APP_LINK = "referer_app_link"
        private const val KEY_NAME_REFERER_APP_LINK_APP_NAME = "app_name"
        private const val KEY_NAME_REFERER_APP_LINK_PACKAGE = "package"
        private const val VERSION = "1.0"

        private var defaultResolver: AppLinkResolver? = null

        @JvmStatic
        fun setDefaultResolver(resolver: AppLinkResolver?) {
            defaultResolver = resolver
        }

        @JvmStatic
        fun getDefaultResolver(): AppLinkResolver? = defaultResolver

        private fun getResolver(context: Context): AppLinkResolver =
            defaultResolver ?: WebViewAppLinkResolver(context)

        @JvmStatic
        fun navigate(context: Context, appLink: AppLink): NavigationResult =
            AppLinkNavigation(appLink, null, null).navigate(context)

        @JvmStatic
        fun navigateInBackground(context: Context, destinationUri: Uri, resolver: AppLinkResolver): Task<NavigationResult> =
            resolver.getAppLinkFromUrlInBackground(destinationUri).onSuccess(
                Continuation<AppLink, NavigationResult> { task ->
                    navigate(context, task.getResult()!!)
                },
                Task.UI_THREAD_EXECUTOR
            )

        @JvmStatic
        fun navigateInBackground(context: Context, destinationUrl: URL, resolver: AppLinkResolver): Task<NavigationResult> =
            navigateInBackground(context, Uri.parse(destinationUrl.toString()), resolver)

        @JvmStatic
        fun navigateInBackground(context: Context, destinationUrl: String, resolver: AppLinkResolver): Task<NavigationResult> =
            navigateInBackground(context, Uri.parse(destinationUrl), resolver)

        @JvmStatic
        fun navigateInBackground(context: Context, destinationUri: Uri): Task<NavigationResult> =
            navigateInBackground(context, destinationUri, getResolver(context))

        @JvmStatic
        fun navigateInBackground(context: Context, destinationUrl: URL): Task<NavigationResult> =
            navigateInBackground(context, destinationUrl, getResolver(context))

        @JvmStatic
        fun navigateInBackground(context: Context, destinationUrl: String): Task<NavigationResult> =
            navigateInBackground(context, destinationUrl, getResolver(context))
    }
}
