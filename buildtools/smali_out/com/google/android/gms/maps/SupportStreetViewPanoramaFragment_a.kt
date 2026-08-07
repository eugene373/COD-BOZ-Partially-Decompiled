package com.google.android.gms.maps

// Auto-emitted from smali.
// 2 fields, 13 methods.

open class SupportStreetViewPanoramaFragment_a: com.google.android.gms.dynamic.LifecycleDelegate {
    private val Lt: android.support.v4.app.Fragment
    private val aji: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate

    public constructor(p0: android.support.v4.app.Fragment, p1: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate)

    public fun mD(): com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate { return TODO("body: ()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         return-object v0
    */

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         .end local p1    # "savedInstanceState":Landroid/os/Bundle;
    //         .local v0, "savedInstanceState":Landroid/os/Bundle;
    //         move-object p1, v0
    //         .end local v0    # "savedInstanceState":Landroid/os/Bundle;
    //         .restart local p1    # "savedInstanceState":Landroid/os/Bundle;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->Lt:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v1}, Landroid/support/v4/app/Fragment;->getArguments()Landroid/os/Bundle;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         const-string v2, "StreetViewPanoramaOptions"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         const-string v2, "StreetViewPanoramaOptions"
    //         const-string v3, "StreetViewPanoramaOptions"
    //         invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         invoke-static {p1, v2, v1}, Lcom/google/android/gms/maps/internal/t;->a(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-interface {v1, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onCreate(Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         new-instance v2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v2, v1}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v2
    */

    public fun onCreateView(inflater: android.view.LayoutInflater, container: android.view.ViewGroup, savedInstanceState: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-static {p2}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2, p3}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onCreateView(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/dynamic/d;Landroid/os/Bundle;)Lcom/google/android/gms/dynamic/d;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onDestroy()V
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
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onDestroyView()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onInflate(activity: android.app.Activity, attrs: android.os.Bundle, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v2, p3}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onInflate(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onLowMemory()V
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onPause()V
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onResume()V
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->aji:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->onSaveInstanceState(Landroid/os/Bundle;)V
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
