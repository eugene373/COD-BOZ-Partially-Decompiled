package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Context

class s3eAmazonInAppPurchasing {

    companion object {
        private const val TAG = "s3eAmazonInAppPurchasing"
        private var s_Instance: s3eAmazonInAppPurchasing? = null

        @JvmStatic
        fun GetInstance(): s3eAmazonInAppPurchasing {
            if (s_Instance == null) {
                s_Instance = s3eAmazonInAppPurchasing()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null
    private var m_Activity: Activity? = null

    fun s3eAmazonInAppPurchasingInit(context: Context?): Int {
        m_Context = context
        m_Activity = context as? Activity
        return 0
    }

    fun s3eAmazonInAppPurchasingTerm() {
    }

    fun s3eAmazonInAppPurchasingGetProductData(skus: Array<String>?): Int {
        return 0
    }

    fun s3eAmazonInAppPurchasingPurchase(sku: String): Int {
        return 0
    }

    fun s3eAmazonInAppPurchasingGetUserData(): Int {
        return 0
    }

    fun s3eAmazonInAppPurchasingGetPurchaseUpdates(reset: Boolean): Int {
        return 0
    }

    external fun s3eAmazonInAppPurchasingProductDataNotify(status: Int, json: String, unavailableSkus: String): Unit
    external fun s3eAmazonInAppPurchasingPurchaseNotify(status: Int, json: String): Unit
    external fun s3eAmazonInAppPurchasingPurchaseUpdatesNotify(status: Int, json: String, hasMore: Boolean): Unit
    external fun s3eAmazonInAppPurchasingUserDataNotify(status: Int, userId: String, marketplace: String): Unit
}