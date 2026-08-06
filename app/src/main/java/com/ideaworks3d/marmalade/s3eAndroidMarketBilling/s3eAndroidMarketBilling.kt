package com.ideaworks3d.marmalade.s3eAndroidMarketBilling

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder

class s3eAndroidMarketBilling : Service(), ServiceConnection {

    companion object {
        const val S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_CANCELLED = 1
        const val S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_PURCHASED = 0
        const val S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_REFUNDED = 2

        const val S3E_ANDROIDMARKETBILLING_RESULT_BILLING_UNAVAILABLE = 3
        const val S3E_ANDROIDMARKETBILLING_RESULT_DEVELOPER_ERROR = 5
        const val S3E_ANDROIDMARKETBILLING_RESULT_ERROR = 6
        const val S3E_ANDROIDMARKETBILLING_RESULT_ITEM_UNAVAILABLE = 4
        const val S3E_ANDROIDMARKETBILLING_RESULT_OK = 0
        const val S3E_ANDROIDMARKETBILLING_RESULT_SERVICE_UNAVAILABLE = 2
        const val S3E_ANDROIDMARKETBILLING_RESULT_USER_CANCELED = 1

        const val TAG = "s3eAndroidMarketBilling"

        @JvmField
        var m_pubKey: String? = null
    }

    var m_Service: Any? = null

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {}

    override fun onServiceDisconnected(name: ComponentName?) {}

    fun s3eAndroidMarketBillingConfirmNotifications(productIds: Array<String>, nonces: LongArray): Int = 0

    fun s3eAndroidMarketBillingGetPurchaseInformation(productIds: Array<String>, nonces: LongArray): Int = 0

    fun s3eAndroidMarketBillingIsSupported(): Int = 0

    fun s3eAndroidMarketBillingRequestPurchase(productId: String, developerPayload: String, nonces: LongArray): Int = 0

    fun s3eAndroidMarketBillingRestoreTransactions(nonces: LongArray): Int = 0

    fun s3eAndroidMarketBillingSetPublicKey(pubKey: String) {
        m_pubKey = pubKey
    }

    fun s3eAndroidMarketBillingUnbind() {}
}