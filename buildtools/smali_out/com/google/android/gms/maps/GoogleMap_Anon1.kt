package com.google.android.gms.maps

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class GoogleMap_Anon1: com.google.android.gms.maps.internal.f.a() {
    val aip: com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
    val aiq: com.google.android.gms.maps.GoogleMap

    constructor(p0: com.google.android.gms.maps.GoogleMap, p1: com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener)

    public fun a(p0: com.google.android.gms.maps.model.internal.d) { /* TODO(body): (Lcom/google/android/gms/maps/model/internal/d;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$1;->aip:Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;
    //         new-instance v1, Lcom/google/android/gms/maps/model/IndoorBuilding;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/IndoorBuilding;-><init>(Lcom/google/android/gms/maps/model/internal/d;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;->onIndoorLevelActivated(Lcom/google/android/gms/maps/model/IndoorBuilding;)V
    //         return-void
    */

    public fun onIndoorBuildingFocused() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$1;->aip:Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;->onIndoorBuildingFocused()V
    //         return-void
    */

}
