package bolts

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle

object AppLinks {
    internal const val KEY_NAME_APPLINK_DATA = "al_applink_data"
    internal const val KEY_NAME_EXTRAS = "extras"
    internal const val KEY_NAME_TARGET = "target_url"

    @JvmStatic
    fun getAppLinkData(intent: Intent): Bundle? =
        intent.getBundleExtra(KEY_NAME_APPLINK_DATA)

    @JvmStatic
    fun getAppLinkExtras(intent: Intent): Bundle? =
        getAppLinkData(intent)?.getBundle(KEY_NAME_EXTRAS)

    @JvmStatic
    fun getTargetUrl(intent: Intent): Uri? {
        val applinkData = getAppLinkData(intent)
        if (applinkData != null) {
            val targetUrlString = applinkData.getString(KEY_NAME_TARGET)
            if (targetUrlString != null) {
                return Uri.parse(targetUrlString)
            }
        }
        return intent.data
    }

    @JvmStatic
    fun getTargetUrlFromInboundIntent(context: Context, intent: Intent): Uri? {
        val applinkData = getAppLinkData(intent)
        if (applinkData != null) {
            val targetUrlString = applinkData.getString(KEY_NAME_TARGET)
            if (targetUrlString != null) {
                MeasurementEvent.sendBroadcastEvent(context, MeasurementEvent.APP_LINK_NAVIGATE_IN_EVENT_NAME, intent, null)
                return Uri.parse(targetUrlString)
            }
        }
        return null
    }
}
