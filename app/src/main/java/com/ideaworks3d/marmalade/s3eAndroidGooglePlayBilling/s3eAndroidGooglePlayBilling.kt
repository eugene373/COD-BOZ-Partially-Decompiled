package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling

import android.app.Activity

class s3eAndroidGooglePlayBilling : Activity() {

    companion object {
        @JvmStatic
        var mHelper: Any? = null

        @JvmStatic
        external fun native_CONSUME_CALLBACK(resultCode: Int, productId: String?)
        @JvmStatic
        external fun native_LIST_PRODUCTS_CALLBACK(resultCode: Int, errorMessage: String?, itemInfos: Array<S3eBillingItemInfo>)
        @JvmStatic
        external fun native_PURCHASE_CALLBACK(resultCode: Int, productId: String?, purchase: S3eBillingPurchase?)
        @JvmStatic
        external fun native_RESTORE_CALLBACK(resultCode: Int, errorMessage: String?, purchases: Array<S3eBillingPurchase>?)

        @JvmStatic
        fun safe_native_CONSUME_CALLBACK(iabResult: Any?) {}

        @JvmStatic
        fun safe_native_LIST_PRODUCTS_CALLBACK(iabResult: Any?, inventory: Any?) {}

        @JvmStatic
        fun safe_native_PURCHASE_CALLBACK(iabResult: Any?, purchase: Any?) {}

        @JvmStatic
        fun safe_native_RESTORE_CALLBACK(iabResult: Any?, inventory: Any?) {}
    }

    interface OnIabPurchaseFinishedListener {
        fun onIabPurchaseFinished(result: Any?, info: Any?)
    }

    var m_Play: Boolean = false

    fun s3eAndroidGooglePlayBillingConsumeItem(productId: String?) {}

    fun s3eAndroidGooglePlayBillingIsSupported(): Int = 0

    fun s3eAndroidGooglePlayBillingRequestProductInformation(products: Array<String>, productTypes: Array<String>) {}

    fun s3eAndroidGooglePlayBillingRequestPurchase(productId: String?, isConsumable: Boolean, developerPayload: String?) {}

    fun s3eAndroidGooglePlayBillingRestoreTransactions() {}

    fun s3eAndroidGooglePlayBillingTerminate() {}

    class S3eBillingItemInfo
    class S3eBillingPurchase
}