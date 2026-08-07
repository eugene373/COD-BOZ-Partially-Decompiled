package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class lv: com.google.android.gms.location.GeofencingApi {
    public constructor()

    public fun addGeofences(client: com.google.android.gms.common.api.GoogleApiClient, pendingIntent: java.util.List, p2: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/List;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 5
    //         .local p2, "geofences":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/location/Geofence;>;"
    //         if-eqz p2, :cond_1
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-interface {p2}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/location/Geofence;
    //         instance-of v3, v0, Lcom/google/android/gms/internal/mc;
    //         const-string v4, "Geofence must be created using Geofence.Builder."
    //         invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         check-cast v0, Lcom/google/android/gms/internal/mc;
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         move-object v0, v1
    //         :goto_1
    //         new-instance v1, Lcom/google/android/gms/internal/lv$1;
    //         invoke-direct {v1, p0, v0, p3}, Lcom/google/android/gms/internal/lv$1;-><init>(Lcom/google/android/gms/internal/lv;Ljava/util/List;Landroid/app/PendingIntent;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun removeGeofences(client: com.google.android.gms.common.api.GoogleApiClient, pendingIntent: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lv$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lv$2;-><init>(Lcom/google/android/gms/internal/lv;Landroid/app/PendingIntent;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeGeofences(client: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.List): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .local p2, "geofenceRequestIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         new-instance v0, Lcom/google/android/gms/internal/lv$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lv$3;-><init>(Lcom/google/android/gms/internal/lv;Ljava/util/List;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
