package com.google.android.gms.maps

// Auto-emitted from smali.
// 2 fields, 2 methods.

open class GoogleMap_6_Anon1: com.google.android.gms.maps.LocationSource.OnLocationChangedListener {
    val aiw: com.google.android.gms.maps.internal.h
    val aix: com.google.android.gms.maps.GoogleMap.6

    constructor(p0: com.google.android.gms.maps.GoogleMap.6, p1: com.google.android.gms.maps.internal.h)

    public fun onLocationChanged(location: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$6$1;->aiw:Lcom/google/android/gms/maps/internal/h;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/h;->l(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

}
