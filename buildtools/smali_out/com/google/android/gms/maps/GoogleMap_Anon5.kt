package com.google.android.gms.maps

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class GoogleMap_Anon5: com.google.android.gms.maps.internal.s.a() {
    val aiq: com.google.android.gms.maps.GoogleMap
    val aiu: com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback

    constructor(p0: com.google.android.gms.maps.GoogleMap, p1: com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback)

    public fun h(p0: com.google.android.gms.dynamic.d) { /* TODO(body): (Lcom/google/android/gms/dynamic/d;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap$5;->aiu:Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/Bitmap;
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;->onSnapshotReady(Landroid/graphics/Bitmap;)V
    //         return-void
    */

    public fun onSnapshotReady(snapshot: android.graphics.Bitmap) { /* TODO(body): (Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$5;->aiu:Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;->onSnapshotReady(Landroid/graphics/Bitmap;)V
    //         return-void
    */

}
