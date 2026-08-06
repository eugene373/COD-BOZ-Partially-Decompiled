package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Context
import android.telephony.TelephonyManager

class TelephonyManagerProxy(activity: Activity) {
    private val m_TelephonyManager: TelephonyManager

    init {
        m_TelephonyManager = activity.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
    }

    fun getDeviceId(): String? {
        return try {
            m_TelephonyManager.deviceId
        } catch (e: SecurityException) {
            null
        }
    }

    fun getSubscriberId(): String? {
        return try {
            m_TelephonyManager.subscriberId
        } catch (e: SecurityException) {
            null
        }
    }

    fun getLine1Number(): String? {
        return try {
            m_TelephonyManager.line1Number
        } catch (e: SecurityException) {
            null
        }
    }
}
