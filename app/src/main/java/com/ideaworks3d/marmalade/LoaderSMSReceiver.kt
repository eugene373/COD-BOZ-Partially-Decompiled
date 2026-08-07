package com.ideaworks3d.marmalade

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage

class LoaderSMSReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        LoaderAPI.traceChan(
            className() + "-" + Thread.currentThread().name,
            "onReceive",
        )
        if (intent.action == ACTION) {
            val extras = intent.extras
            if (extras != null) {
                @Suppress("DEPRECATION")
                val pdus = extras.get("pdus") as Array<Any>
                val messages = arrayOfNulls<SmsMessage>(pdus.size)

                for (i in pdus.indices) {
                    @Suppress("DEPRECATION")
                    messages[i] = SmsMessage.createFromPdu(pdus[i] as ByteArray)
                }

                for (msg in messages) {
                    if (msg != null) {
                        onReceiveCallback(
                            msg.displayOriginatingAddress,
                            msg.displayMessageBody,
                            msg.timestampMillis,
                        )
                        LoaderAPI.traceChan(
                            className() + "-" + Thread.currentThread().name,
                            "SMS from " + msg.displayOriginatingAddress + " - " + msg.displayMessageBody,
                        )
                    }
                }
            }
        }
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    companion object {
        const val ACTION = "android.provider.Telephony.SMS_RECEIVED"

        @JvmStatic
        external fun onReceiveCallback(originatingAddress: String?, messageBody: String?, timestamp: Long)
    }
}
