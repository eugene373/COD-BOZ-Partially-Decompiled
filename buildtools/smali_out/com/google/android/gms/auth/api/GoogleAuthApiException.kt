package com.google.android.gms.auth.api

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class GoogleAuthApiException: Exception() {
    private var CM: com.google.android.gms.common.api.Status
    private var mPendingIntent: android.app.PendingIntent

    public constructor(message: String, status: com.google.android.gms.common.api.Status)

    public constructor(message: String, status: com.google.android.gms.common.api.Status, pendingIntent: android.app.PendingIntent)

    public fun getPendingIntent(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiException;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiException;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun isUserRecoverable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiException;->mPendingIntent:Landroid/app/PendingIntent;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
