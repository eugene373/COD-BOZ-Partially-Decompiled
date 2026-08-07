package com.ideaworks3d.marmalade;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

public class LoaderSMSReceiver extends BroadcastReceiver {
      static final String ACTION = "android.provider.Telephony.SMS_RECEIVED";

      public void onReceive(Context var1, Intent var2) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onReceive");
            if (var2.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
                  new StringBuilder();
                  Bundle var4 = var2.getExtras();
                  if (var4 != null) {
                        Object[] var5 = (Object[])((Object[])var4.get("pdus"));
                        SmsMessage[] var6 = new SmsMessage[var5.length];

                        int var7;
                        for(var7 = 0; var7 < var5.length; ++var7) {
                              var6[var7] = SmsMessage.createFromPdu((byte[])((byte[])var5[var7]));
                        }

                        for(var7 = 0; var7 < var6.length; ++var7) {
                              SmsMessage var8 = var6[var7];
                              onReceiveCallback(var8.getDisplayOriginatingAddress(), var8.getDisplayMessageBody(), var8.getTimestampMillis());
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "SMS from " + var8.getDisplayOriginatingAddress() + " - " + var8.getDisplayMessageBody());
                        }
                  }
            }

      }

      public static native void onReceiveCallback(String var0, String var1, long var2);
}
