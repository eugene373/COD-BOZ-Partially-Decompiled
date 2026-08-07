package com.google.android.gms.maps

// Auto-emitted from smali.
// 3 fields, 13 methods.

open class MapView_a: com.google.android.gms.dynamic.LifecycleDelegate {
    private val aiV: android.view.ViewGroup
    private val aiW: com.google.android.gms.maps.internal.IMapViewDelegate
    private var aiX: android.view.View

    public constructor(p0: android.view.ViewGroup, p1: com.google.android.gms.maps.internal.IMapViewDelegate)

    public fun mB(): com.google.android.gms.maps.internal.IMapViewDelegate { return TODO("body: ()Lcom/google/android/gms/maps/internal/IMapViewDelegate;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         return-object v0
    */

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->onCreate(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->getView()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         iput-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiX:Landroid/view/View;
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiV:Landroid/view/ViewGroup;
    //         invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiV:Landroid/view/ViewGroup;
    //         iget-object v1, p0, Lcom/google/android/gms/maps/MapView$a;->aiX:Landroid/view/View;
    //         invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onCreateView(inflater: android.view.LayoutInflater, container: android.view.ViewGroup, savedInstanceState: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "onCreateView not allowed on MapViewDelegate"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->onDestroy()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onDestroyView() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "onDestroyView not allowed on MapViewDelegate"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun onInflate(activity: android.app.Activity, attrs: android.os.Bundle, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "onInflate not allowed on MapViewDelegate"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->onLowMemory()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->onPause()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->onResume()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/MapView$a;->aiW:Lcom/google/android/gms/maps/internal/IMapViewDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
