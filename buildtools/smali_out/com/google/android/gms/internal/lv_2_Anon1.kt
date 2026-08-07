package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class lv_2_Anon1: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener {
    val aeO: com.google.android.gms.internal.lv.2

    constructor(p0: com.google.android.gms.internal.lv.2)

    public fun onRemoveGeofencesByPendingIntentResult(statusCode: Int, pendingIntent: android.app.PendingIntent) { /* TODO(body): (ILandroid/app/PendingIntent;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lv$2$1;->aeO:Lcom/google/android/gms/internal/lv$2;
    //         invoke-static {p1}, Lcom/google/android/gms/location/LocationStatusCodes;->eg(I)Lcom/google/android/gms/common/api/Status;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/lv$2;->b(Lcom/google/android/gms/common/api/Result;)V
    //         return-void
    */

    public fun onRemoveGeofencesByRequestIdsResult(statusCode: Int, geofenceRequestIds: Array<String>) { /* TODO(body): (I[Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "GeofencingImpl"
    //         const-string v1, "Request ID callback shouldn\'t have been called"
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

}
