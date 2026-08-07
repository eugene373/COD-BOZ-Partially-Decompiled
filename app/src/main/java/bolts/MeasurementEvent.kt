package bolts

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.lang.reflect.Method

class MeasurementEvent private constructor(
    context: Context,
    private val name: String?,
    private val args: Bundle?
) {
    private val appContext: Context = context.applicationContext

    private fun sendBroadcast() {
        if (name == null) {
            Log.d(javaClass.name, "Event name is required")
        }
        try {
            val localBroadcastManagerClass = Class.forName("android.support.v4.content.LocalBroadcastManager")
            val getInstanceMethod: Method = localBroadcastManagerClass.getMethod("getInstance", Context::class.java)
            val sendBroadcastMethod: Method = localBroadcastManagerClass.getMethod("sendBroadcast", Intent::class.java)
            val localBroadcastManager = getInstanceMethod.invoke(null, appContext)
            val intent = Intent(MEASUREMENT_EVENT_NOTIFICATION_NAME)
            intent.putExtra(MEASUREMENT_EVENT_NAME_KEY, name)
            intent.putExtra(MEASUREMENT_EVENT_ARGS_KEY, args)
            sendBroadcastMethod.invoke(localBroadcastManager, intent)
        } catch (_: Exception) {
            Log.d(javaClass.name, "LocalBroadcastManager in android support library is required to raise bolts event.")
        }
    }

    companion object {
        const val MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event"
        const val MEASUREMENT_EVENT_NAME_KEY = "event_name"
        const val MEASUREMENT_EVENT_ARGS_KEY = "event_args"
        const val APP_LINK_NAVIGATE_OUT_EVENT_NAME = "al_nav_out"
        const val APP_LINK_NAVIGATE_IN_EVENT_NAME = "al_nav_in"

        @JvmStatic
        fun sendBroadcastEvent(
            context: Context,
            name: String,
            intent: Intent?,
            intentArgs: Map<String, String>?
        ) {
            val logArgs = Bundle()
            if (intent != null) {
                val appLinkData = AppLinks.getAppLinkData(intent)
                if (appLinkData != null) {
                    logArgs.putAll(getApplinkLogData(context, name, appLinkData, intent))
                } else {
                    val intentData = intent.data
                    if (intentData != null) {
                        logArgs.putString("intentData", intentData.toString())
                    }
                    val extras = intent.extras
                    if (extras != null) {
                        for (key in extras.keySet()) {
                            val value = extras.get(key)
                            val jsonString = objectToJSONString(value)
                            logArgs.putString(key, jsonString)
                        }
                    }
                }
            }
            if (intentArgs != null) {
                for ((key, value) in intentArgs) {
                    logArgs.putString(key, value)
                }
            }
            MeasurementEvent(context, name, logArgs).sendBroadcast()
        }

        private fun getApplinkLogData(
            context: Context,
            name: String,
            appLinkData: Bundle,
            intent: Intent
        ): Bundle {
            val logArgs = Bundle()
            val componentName: ComponentName? = intent.resolveActivity(context.packageManager)
            if (componentName != null) {
                logArgs.putString("class", componentName.shortClassName)
            }
            if (APP_LINK_NAVIGATE_OUT_EVENT_NAME == name) {
                if (componentName != null) {
                    logArgs.putString("package", componentName.packageName)
                }
                if (intent.data != null) {
                    logArgs.putString("outputURL", intent.data.toString())
                }
                if (intent.scheme != null) {
                    logArgs.putString("outputURLScheme", intent.scheme)
                }
            } else if (APP_LINK_NAVIGATE_IN_EVENT_NAME == name) {
                if (intent.data != null) {
                    logArgs.putString("inputURL", intent.data.toString())
                }
                if (intent.scheme != null) {
                    logArgs.putString("inputURLScheme", intent.scheme)
                }
            }
            for (key in appLinkData.keySet()) {
                val value = appLinkData.get(key)
                if (value is Bundle) {
                    for (subKey in value.keySet()) {
                        val jsonValue = objectToJSONString(value.get(subKey))
                        if (key == "referer_app_link") {
                            when {
                                subKey.equals("url", ignoreCase = true) -> logArgs.putString("refererURL", jsonValue)
                                subKey.equals("app_name", ignoreCase = true) -> logArgs.putString("refererAppName", jsonValue)
                                subKey.equals("package", ignoreCase = true) -> logArgs.putString("sourceApplication", jsonValue)
                                else -> logArgs.putString("$key/$subKey", jsonValue)
                            }
                        } else {
                            logArgs.putString("$key/$subKey", jsonValue)
                        }
                    }
                } else {
                    val jsonValue = objectToJSONString(value)
                    if (key == "target_url") {
                        val targetUri = Uri.parse(jsonValue)
                        logArgs.putString("targetURL", targetUri.toString())
                        logArgs.putString("targetURLHost", targetUri.host)
                    } else {
                        logArgs.putString(key, jsonValue)
                    }
                }
            }
            return logArgs
        }

        private fun objectToJSONString(value: Any?): String? {
            if (value == null) return null
            if (value is JSONArray || value is JSONObject) {
                return value.toString()
            }
            return try {
                when (value) {
                    is Collection<*> -> JSONArray(value).toString()
                    is Map<*, *> -> JSONObject(value).toString()
                    else -> value.toString()
                }
            } catch (_: Exception) {
                null
            }
        }
    }
}
