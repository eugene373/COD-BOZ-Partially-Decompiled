package com.google.android.gms.maps

// Auto-emitted from smali.
// 1 fields, 4 methods.

class Projection {
    private val aja: com.google.android.gms.maps.internal.IProjectionDelegate

    constructor(delegate: com.google.android.gms.maps.internal.IProjectionDelegate)

    public fun fromScreenLocation(point: android.graphics.Point): com.google.android.gms.maps.model.LatLng { return TODO("body: (Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/Projection;->aja:Lcom/google/android/gms/maps/internal/IProjectionDelegate;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IProjectionDelegate;->fromScreenLocation(Lcom/google/android/gms/dynamic/d;)Lcom/google/android/gms/maps/model/LatLng;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getVisibleRegion(): com.google.android.gms.maps.model.VisibleRegion { return TODO("body: ()Lcom/google/android/gms/maps/model/VisibleRegion;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/Projection;->aja:Lcom/google/android/gms/maps/internal/IProjectionDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IProjectionDelegate;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun toScreenLocation(location: com.google.android.gms.maps.model.LatLng): android.graphics.Point { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/Projection;->aja:Lcom/google/android/gms/maps/internal/IProjectionDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IProjectionDelegate;->toScreenLocation(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/Point;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

}
