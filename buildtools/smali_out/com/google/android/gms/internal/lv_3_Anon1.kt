package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class lv_3_Anon1: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener {
    val aeQ: com.google.android.gms.internal.lv.3

    constructor(p0: com.google.android.gms.internal.lv.3)

    public fun onRemoveGeofencesByPendingIntentResult(statusCode: Int, pendingIntent: android.app.PendingIntent) { /* TODO(body): (ILandroid/app/PendingIntent;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "GeofencingImpl"
    //         const-string v1, "PendingIntent callback shouldn\'t have been called"
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun onRemoveGeofencesByRequestIdsResult(statusCode: Int, geofenceRequestIds: Array<String>) { /* TODO(body): (I[Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lv$3$1;->aeQ:Lcom/google/android/gms/internal/lv$3;
    //         invoke-static {p1}, Lcom/google/android/gms/location/LocationStatusCodes;->eg(I)Lcom/google/android/gms/common/api/Status;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/lv$3;->b(Lcom/google/android/gms/common/api/Result;)V
    //         return-void
    */

}
