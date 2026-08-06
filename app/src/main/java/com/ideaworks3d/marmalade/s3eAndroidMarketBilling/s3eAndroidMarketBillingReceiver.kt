package com.ideaworks3d.marmalade.s3eAndroidMarketBilling

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle

class s3eAndroidMarketBillingReceiver : BroadcastReceiver() {

    companion object {
        const val S3E_ANDROIDMARKETBILLING_SECURITY_INVALID_NONCE = 0x20
        const val S3E_ANDROIDMARKETBILLING_SECURITY_INVALID_SIGNATURE = 0x2
        const val S3E_ANDROIDMARKETBILLING_SECURITY_NO_NONCE = 0x10
        const val S3E_ANDROIDMARKETBILLING_SECURITY_NO_SIGNATURE = 0x1
        const val S3E_ANDROIDMARKETBILLING_SECURITY_UNCHECKED_SIGNATURE = 0x4
        const val S3E_ANDROIDMARKETBILLING_SECURITY_VALID = 0x0

        const val TAG = "s3eAndroidMarketBilling"
    }

    class Order {
        var m_DeveloperPayload: String? = null
        var m_NotificationID: String? = null
        var m_OrderID: String? = null
        var m_PackageName: String? = null
        var m_ProductID: String? = null
        var m_PurchaseState: Int = 0
        var m_PurchaseTime: Long = 0L
    }

    override fun onReceive(context: Context?, intent: Intent?) {}

    private external fun native_onInAppNotifyCallback(notificationId: String?)
    private external fun native_onPurchaseStateChangedCallback(orders: Array<Order>, resultCode: Int)
    private external fun native_onResponseCodeCallback(nonce: Long, responseCode: Int)

    fun onInAppNotify(intent: Intent?) {}

    fun onPurchaseStateChanged(intent: Intent?) {}

    fun onResponseCode(intent: Intent?) {}
}