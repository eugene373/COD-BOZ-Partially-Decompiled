package com.ideaworks3d.marmalade

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage

class LoaderSMSReceiver : BroadcastReceiver() {

    companion object {
        const val ACTION = "android.provider.Telephony.SMS_RECEIVED"

        @JvmStatic
        external fun onReceiveCallback(address: String, message: String, timestamp: Long)
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == ACTION) {
            val bundle = intent.extras ?: return
            val pdus = bundle.get("pdus") as? Array<*> ?: return
            val messages = arrayOfNulls<SmsMessage>(pdus.size)

            for (i in pdus.indices) {
                messages[i] = SmsMessage.createFromPdu(pdus[i] as ByteArray)
            }

            for (i in pdus.indices) {
                val msg = messages[i] ?: continue
                val address = msg.displayOriginatingAddress
                val body = msg.displayMessageBody
                val timestamp = msg.timestampMillis
                onReceiveCallback(address, body, timestamp)
            }
        }
    }
}
