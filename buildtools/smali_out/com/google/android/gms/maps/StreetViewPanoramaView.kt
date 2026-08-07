package com.google.android.gms.maps

// Auto-emitted from smali.
// 2 fields, 11 methods.

open class StreetViewPanoramaView: android.widget.FrameLayout() {
    private var ajh: com.google.android.gms.maps.StreetViewPanorama
    private val ajq: com.google.android.gms.maps.StreetViewPanoramaView.a

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet, defStyle: Int)

    public constructor(context: android.content.Context, options: com.google.android.gms.maps.StreetViewPanoramaOptions)

    public fun getStreetViewPanorama(): com.google.android.gms.maps.StreetViewPanorama { return TODO("body: ()Lcom/google/android/gms/maps/StreetViewPanorama;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->mA()V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         :try_start_0
    //         new-instance v1, Lcom/google/android/gms/maps/StreetViewPanorama;
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->mH()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;->getStreetViewPanorama()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/StreetViewPanorama;-><init>(Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;)V
    //         iput-object v1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onCreate(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-static {p0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->b(Landroid/widget/FrameLayout;)V
    //         :cond_0
    //         return-void
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onDestroy()V
    //         return-void
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onLowMemory()V
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onPause()V
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onResume()V
    //         return-void
    */

    public fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         return-void
    */

}
