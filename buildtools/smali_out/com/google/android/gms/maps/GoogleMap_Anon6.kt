package com.google.android.gms.maps

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class GoogleMap_Anon6: com.google.android.gms.maps.internal.ILocationSourceDelegate.a() {
    val aiq: com.google.android.gms.maps.GoogleMap
    val aiv: com.google.android.gms.maps.LocationSource

    constructor(p0: com.google.android.gms.maps.GoogleMap, p1: com.google.android.gms.maps.LocationSource)

    public fun activate(listener: com.google.android.gms.maps.internal.h) { /* TODO(body): (Lcom/google/android/gms/maps/internal/h;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$6;->aiv:Lcom/google/android/gms/maps/LocationSource;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$6$1;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$6$1;-><init>(Lcom/google/android/gms/maps/GoogleMap$6;Lcom/google/android/gms/maps/internal/h;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/LocationSource;->activate(Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;)V
    //         return-void
    */

    public fun deactivate() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$6;->aiv:Lcom/google/android/gms/maps/LocationSource;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/LocationSource;->deactivate()V
    //         return-void
    */

}
