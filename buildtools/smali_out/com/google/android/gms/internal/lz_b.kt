package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 5 methods.

class lz_b: com.google.android.gms.internal.lw.a() {
    private var afd: com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener
    private var afe: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener
    private var aff: com.google.android.gms.internal.lz

    public constructor(p0: com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener, p1: com.google.android.gms.internal.lz)

    public constructor(p0: com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener, p1: com.google.android.gms.internal.lz)

    public fun onAddGeofencesResult(statusCode: Int, geofenceRequestIds: Array<String>) { /* TODO(body): (I[Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         if-nez v0, :cond_0
    //         const-string v0, "LocationClientImpl"
    //         const-string v1, "onAddGeofenceResult called multiple times"
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         new-instance v1, Lcom/google/android/gms/internal/lz$a;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/lz$b;->afd:Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/lz$a;-><init>(Lcom/google/android/gms/internal/lz;Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;I[Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         iput-object v4, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         iput-object v4, p0, Lcom/google/android/gms/internal/lz$b;->afd:Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;
    //         iput-object v4, p0, Lcom/google/android/gms/internal/lz$b;->afe:Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    //         goto :goto_0
    */

    public fun onRemoveGeofencesByPendingIntentResult(statusCode: Int, pendingIntent: android.app.PendingIntent) { /* TODO(body): (ILandroid/app/PendingIntent;)V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         if-nez v0, :cond_0
    //         const-string v0, "LocationClientImpl"
    //         const-string v1, "onRemoveGeofencesByPendingIntentResult called multiple times"
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v6, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         new-instance v0, Lcom/google/android/gms/internal/lz$d;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/lz$b;->afe:Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    //         move v4, p1
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/lz$d;-><init>(Lcom/google/android/gms/internal/lz;ILcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;ILandroid/app/PendingIntent;)V
    //         invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         iput-object v7, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         iput-object v7, p0, Lcom/google/android/gms/internal/lz$b;->afd:Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;
    //         iput-object v7, p0, Lcom/google/android/gms/internal/lz$b;->afe:Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    //         goto :goto_0
    */

    public fun onRemoveGeofencesByRequestIdsResult(statusCode: Int, geofenceRequestIds: Array<String>) { /* TODO(body): (I[Ljava/lang/String;)V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         if-nez v0, :cond_0
    //         const-string v0, "LocationClientImpl"
    //         const-string v1, "onRemoveGeofencesByRequestIdsResult called multiple times"
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v6, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         new-instance v0, Lcom/google/android/gms/internal/lz$d;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/internal/lz$b;->afe:Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    //         move v4, p1
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/lz$d;-><init>(Lcom/google/android/gms/internal/lz;ILcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;I[Ljava/lang/String;)V
    //         invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         iput-object v7, p0, Lcom/google/android/gms/internal/lz$b;->aff:Lcom/google/android/gms/internal/lz;
    //         iput-object v7, p0, Lcom/google/android/gms/internal/lz$b;->afd:Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;
    //         iput-object v7, p0, Lcom/google/android/gms/internal/lz$b;->afe:Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    //         goto :goto_0
    */

}
