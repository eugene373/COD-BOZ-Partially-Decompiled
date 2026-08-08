package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class PurchaseProxy : Activity() {

    companion object {
        const val RC_REQUEST = 0xc4b
        const val TAG = "PurchaseProxy"
    }

    var mProxyPurchaseFinishedListener: s3eAndroidGooglePlayBilling.OnIabPurchaseFinishedListener? = null
        get() {
            if (field == null) {
                field = object : s3eAndroidGooglePlayBilling.OnIabPurchaseFinishedListener {
                    override fun onIabPurchaseFinished(result: Any?, info: Any?) {}
                }
            }
            return field
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (s3eAndroidGooglePlayBilling.mHelper != null) {
            // Placeholder - actual IabHelper.handleActivityResult would go here
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }
}