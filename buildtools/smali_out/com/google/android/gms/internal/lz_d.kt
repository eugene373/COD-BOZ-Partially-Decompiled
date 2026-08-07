package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 5 methods.

class lz_d: com.google.android.gms.common.internal.e.b() {
    private val HF: Int
    private val afb: Array<String>
    val afc: com.google.android.gms.internal.lz
    private val afg: Int
    private val mPendingIntent: android.app.PendingIntent

    public constructor(p0: com.google.android.gms.internal.lz, p1: Int, p2: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener, p3: Int, p4: android.app.PendingIntent)

    public constructor(p0: com.google.android.gms.internal.lz, p1: Int, p2: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener, p3: Int, p4: Array<String>)

    protected fun a(p0: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener) { /* TODO(body): (Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/internal/lz$d;->afg:I
    //         packed-switch v0, :pswitch_data_0
    //         const-string v0, "LocationClientImpl"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unsupported action: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/internal/lz$d;->afg:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget v0, p0, Lcom/google/android/gms/internal/lz$d;->HF:I
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lz$d;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;->onRemoveGeofencesByPendingIntentResult(ILandroid/app/PendingIntent;)V
    //         goto :goto_0
    //         :pswitch_1
    //         iget v0, p0, Lcom/google/android/gms/internal/lz$d;->HF:I
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lz$d;->afb:[Ljava/lang/String;
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;->onRemoveGeofencesByRequestIdsResult(I[Ljava/lang/String;)V
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    protected fun g(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lz$d;->a(Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V
    //         return-void
    */

    protected fun gT() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
