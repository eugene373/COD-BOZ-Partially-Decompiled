package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Context

class s3eSamsungInAppPurchasing {

    companion object {
        private const val TAG = "s3eSamsungInAppPurchasing"
        private var s_Instance: s3eSamsungInAppPurchasing? = null

        @JvmStatic
        fun GetInstance(): s3eSamsungInAppPurchasing {
            if (s_Instance == null) {
                s_Instance = s3eSamsungInAppPurchasing()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null
    private var m_Activity: Activity? = null

    fun s3eSamsungInAppPurchasingInit(context: Context?): Int {
        m_Context = context
        m_Activity = context as? Activity
        return 0
    }

    fun s3eSamsungInAppPurchasingTerm() {
    }

    fun s3eSamsungInAppPurchasingGetProductDetails(skus: Array<String>?): Int {
        return 0
    }

    fun s3eSamsungInAppPurchasingPurchase(sku: String, payload: String?): Int {
        return 0
    }

    external fun s3eSamsungInAppPurchasingProductDataNotify(status: Int, json: String): Unit
    external fun s3eSamsungInAppPurchasingPaymentNotify(status: Int, orderId: String, productId: String): Unit
}