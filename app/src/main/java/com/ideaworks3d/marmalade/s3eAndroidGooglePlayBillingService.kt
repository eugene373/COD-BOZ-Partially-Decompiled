package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Base64
import android.util.Log

class s3eAndroidGooglePlayBillingService {

    companion object {
        private const val TAG = "s3eAndroidGooglePlayBilling"
        private var s_Instance: s3eAndroidGooglePlayBillingService? = null

        @JvmStatic
        fun GetInstance(): s3eAndroidGooglePlayBillingService {
            if (s_Instance == null) {
                s_Instance = s3eAndroidGooglePlayBillingService()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null
    private var m_Activity: Activity? = null
    private var m_PublicKey: String = ""

    fun s3eAndroidGooglePlayBillingInit(context: Context?): Int {
        m_Context = context
        m_Activity = context as? Activity
        return 0
    }

    fun s3eAndroidGooglePlayBillingTerm() {
    }

    fun s3eAndroidGooglePlayBillingSetup(base64Key: String): Int {
        m_PublicKey = base64Key
        // Native callback
        s3eAndroidGooglePlayBillingSetupNotify(0)
        return 0
    }

    fun s3eAndroidGooglePlayBillingPurchase(sku: String, payload: String?): Int {
        // Native callback for purchase
        s3eAndroidGooglePlayBillingPurchaseNotify(0, "{}", "", payload)
        return 0
    }

    fun s3eAndroidGooglePlayBillingConsume(purchaseJson: String, signature: String): Int {
        s3eAndroidGooglePlayBillingConsumeNotify(0)
        return 0
    }

    fun s3eAndroidGooglePlayBillingQueryInventory(skus: Array<String>?): Int {
        s3eAndroidGooglePlayBillingQueryInventoryNotify(0, "[]")
        return 0
    }

    fun s3eAndroidGooglePlayBillingOnActivityResult(requestCode: Int, resultCode: Int, data: Intent?): Boolean {
        return false
    }

    // Native callbacks
    external fun s3eAndroidGooglePlayBillingSetupNotify(result: Int): Unit
    external fun s3eAndroidGooglePlayBillingPurchaseNotify(result: Int, json: String, signature: String, payload: String?): Unit
    external fun s3eAndroidGooglePlayBillingConsumeNotify(result: Int): Unit
    external fun s3eAndroidGooglePlayBillingQueryInventoryNotify(result: Int, json: String): Unit
}