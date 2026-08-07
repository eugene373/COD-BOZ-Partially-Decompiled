package com.google.android.gms.common

// Auto-emitted from smali.
// 20 fields, 9 methods.

class ConnectionResult {
    private val HF: Int
    private val mPendingIntent: android.app.PendingIntent

    public constructor(statusCode: Int, pendingIntent: android.app.PendingIntent)

    private fun fX(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/ConnectionResult;->HF:I
    //         sparse-switch v0, :sswitch_data_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "unknown status code "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/common/ConnectionResult;->HF:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :sswitch_0
    //         const-string v0, "SUCCESS"
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "SERVICE_MISSING"
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "SERVICE_VERSION_UPDATE_REQUIRED"
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "SERVICE_DISABLED"
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "SIGN_IN_REQUIRED"
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "INVALID_ACCOUNT"
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "RESOLUTION_REQUIRED"
    //         goto :goto_0
    //         :sswitch_7
    //         const-string v0, "NETWORK_ERROR"
    //         goto :goto_0
    //         :sswitch_8
    //         const-string v0, "INTERNAL_ERROR"
    //         goto :goto_0
    //         :sswitch_9
    //         const-string v0, "SERVICE_INVALID"
    //         goto :goto_0
    //         :sswitch_a
    //         const-string v0, "DEVELOPER_ERROR"
    //         goto :goto_0
    //         :sswitch_b
    //         const-string v0, "LICENSE_CHECK_FAILED"
    //         goto :goto_0
    //         :sswitch_c
    //         const-string v0, "CANCELED"
    //         goto :goto_0
    //         :sswitch_d
    //         const-string v0, "TIMEOUT"
    //         goto :goto_0
    //         :sswitch_e
    //         const-string v0, "INTERRUPTED"
    //         goto :goto_0
    //         :sswitch_f
    //         const-string v0, "API_UNAVAILABLE"
    //         goto :goto_0
    //         :sswitch_10
    //         const-string v0, "UPDATE_ANDROID_WEAR"
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x5 -> :sswitch_5
    //             0x6 -> :sswitch_6
    //             0x7 -> :sswitch_7
    //             0x8 -> :sswitch_8
    //             0x9 -> :sswitch_9
    //             0xa -> :sswitch_a
    //             0xb -> :sswitch_b
    //             0xd -> :sswitch_c
    //             0xe -> :sswitch_d
    //             0xf -> :sswitch_e
    //             0x10 -> :sswitch_f
    //             0x2a -> :sswitch_10
    //         .end sparse-switch
    */

    public fun getErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/ConnectionResult;->HF:I
    //         return v0
    */

    public fun getResolution(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/ConnectionResult;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun hasResolution(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/ConnectionResult;->HF:I
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/ConnectionResult;->mPendingIntent:Landroid/app/PendingIntent;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isSuccess(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/ConnectionResult;->HF:I
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun startResolutionForResult(activity: android.app.Activity, requestCode: Int) { /* TODO(body): (Landroid/app/Activity;I)V */ }
    /*
    //         .locals 7
    //         const/4 v4, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/ConnectionResult;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;
    //         move-result-object v1
    //         const/4 v3, 0x0
    //         move-object v0, p1
    //         move v2, p2
    //         move v5, v4
    //         move v6, v4
    //         invoke-virtual/range {v0 .. v6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "statusCode"
    //         invoke-direct {p0}, Lcom/google/android/gms/common/ConnectionResult;->fX()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "resolution"
    //         iget-object v2, p0, Lcom/google/android/gms/common/ConnectionResult;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val API_UNAVAILABLE: Int = 0x10
    @JvmField public val CANCELED: Int = 0xd
    @JvmField public val DEVELOPER_ERROR: Int = 0xa
    @JvmField public val DRIVE_EXTERNAL_STORAGE_REQUIRED: Int = 0x5dc
    @JvmField public val HE: com.google.android.gms.common.ConnectionResult = null!!
    @JvmField public val INTERNAL_ERROR: Int = 0x8
    @JvmField public val INTERRUPTED: Int = 0xf
    @JvmField public val INVALID_ACCOUNT: Int = 0x5
    @JvmField public val LICENSE_CHECK_FAILED: Int = 0xb
    @JvmField public val NETWORK_ERROR: Int = 0x7
    @JvmField public val RESOLUTION_REQUIRED: Int = 0x6
    @JvmField public val SERVICE_DISABLED: Int = 0x3
    @JvmField public val SERVICE_INVALID: Int = 0x9
    @JvmField public val SERVICE_MISSING: Int = 0x1
    @JvmField public val SERVICE_VERSION_UPDATE_REQUIRED: Int = 0x2
    @JvmField public val SIGN_IN_REQUIRED: Int = 0x4
    @JvmField public val SUCCESS: Int = 0x0
    @JvmField public val TIMEOUT: Int = 0xe
    }
}
