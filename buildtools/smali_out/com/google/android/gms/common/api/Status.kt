package com.google.android.gms.common.api

// Auto-emitted from smali.
// 10 fields, 23 methods.

class Status: com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val HF: Int
    private val JA: String
    private val mPendingIntent: android.app.PendingIntent

    public constructor(statusCode: Int)

    constructor(versionCode: Int, statusCode: Int, statusMessage: String, pendingIntent: android.app.PendingIntent)

    public constructor(statusCode: Int, statusMessage: String)

    public constructor(statusCode: Int, statusMessage: String, pendingIntent: android.app.PendingIntent)

    private fun fX(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->JA:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->JA:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/CommonStatusCodes;->getStatusCodeString(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/common/api/Status;
    //         if-nez v1, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/common/api/Status;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget v1, p0, Lcom/google/android/gms/common/api/Status;->BR:I
    //         iget v2, p1, Lcom/google/android/gms/common/api/Status;->BR:I
    //         if-ne v1, v2, :cond_0
    //         iget v1, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         iget v2, p1, Lcom/google/android/gms/common/api/Status;->HF:I
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/Status;->JA:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/common/api/Status;->JA:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         iget-object v2, p1, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    fun getPendingIntent(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun getResolution(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun getStatusCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         return v0
    */

    public fun getStatusMessage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->JA:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/api/Status;->BR:I
    //         return v0
    */

    public fun gt(): com.google.android.gms.common.ConnectionResult { return TODO("body: ()Lcom/google/android/gms/common/ConnectionResult;") }
    /*
    //         .locals 3
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/common/ConnectionResult;
    //         iget v1, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V
    //         return-object v0
    */

    public fun hasResolution(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/common/api/Status;->BR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/Status;->JA:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isCanceled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         const/16 v1, 0x10
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isInterrupted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         const/16 v1, 0xe
    //         if-ne v0, v1, :cond_0
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
    //         iget v0, p0, Lcom/google/android/gms/common/api/Status;->HF:I
    //         if-gtz v0, :cond_0
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
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->hasResolution()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
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
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/Status;->fX()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "resolution"
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/Status;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/api/StatusCreator;->a(Lcom/google/android/gms/common/api/Status;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.common.api.StatusCreator = null!!
    @JvmField public val Jv: com.google.android.gms.common.api.Status = null!!
    @JvmField public val Jw: com.google.android.gms.common.api.Status = null!!
    @JvmField public val Jx: com.google.android.gms.common.api.Status = null!!
    @JvmField public val Jy: com.google.android.gms.common.api.Status = null!!
    @JvmField public val Jz: com.google.android.gms.common.api.Status = null!!
    }
}
