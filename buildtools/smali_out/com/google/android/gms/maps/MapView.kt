package com.google.android.gms.maps

// Auto-emitted from smali.
// 2 fields, 11 methods.

open class MapView: android.widget.FrameLayout() {
    private var aiR: com.google.android.gms.maps.GoogleMap
    private val aiU: com.google.android.gms.maps.MapView.b

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet, defStyle: Int)

    public constructor(context: android.content.Context, options: com.google.android.gms.maps.GoogleMapOptions)

    public fun getMap(): com.google.android.gms.maps.GoogleMap { return TODO("body: ()Lcom/google/android/gms/maps/GoogleMap;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiR:Lcom/google/android/gms/maps/GoogleMap;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiR:Lcom/google/android/gms/maps/GoogleMap;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->mA()V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         :try_start_0
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap;
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/MapView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$a;->mB()Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->getMap()Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/GoogleMap;-><init>(Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;)V
    //         iput-object v1, p0, Lcom/google/android/gms/maps/MapView;->aiR:Lcom/google/android/gms/maps/GoogleMap;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiR:Lcom/google/android/gms/maps/GoogleMap;
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView$b;->onCreate(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-static {p0}, Lcom/google/android/gms/maps/MapView$b;->b(Landroid/widget/FrameLayout;)V
    //         :cond_0
    //         return-void
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->onDestroy()V
    //         return-void
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->onLowMemory()V
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->onPause()V
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$b;->onResume()V
    //         return-void
    */

    public fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->aiU:Lcom/google/android/gms/maps/MapView$b;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView$b;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         return-void
    */

}
