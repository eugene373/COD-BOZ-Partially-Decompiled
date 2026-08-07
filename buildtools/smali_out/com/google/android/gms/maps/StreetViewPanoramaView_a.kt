package com.google.android.gms.maps

// Auto-emitted from smali.
// 4 fields, 3 methods.

open class StreetViewPanoramaView_a: com.google.android.gms.dynamic.a() {
    protected var aiT: com.google.android.gms.dynamic.f
    private val aiY: android.view.ViewGroup
    private val ajr: com.google.android.gms.maps.StreetViewPanoramaOptions
    private val mContext: android.content.Context

    constructor(p0: android.view.ViewGroup, p1: android.content.Context, p2: com.google.android.gms.maps.StreetViewPanoramaOptions)

    protected fun a(p0: com.google.android.gms.dynamic.f) { /* TODO(body): (Lcom/google/android/gms/dynamic/f;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/dynamic/f",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/StreetViewPanoramaView$b;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->aiT:Lcom/google/android/gms/dynamic/f;
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->mA()V
    //         return-void
    */

    public fun mA() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->aiT:Lcom/google/android/gms/dynamic/f;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/u;->S(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/c;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->mContext:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->ajr:Lcom/google/android/gms/maps/StreetViewPanoramaOptions;
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/maps/internal/c;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->aiT:Lcom/google/android/gms/dynamic/f;
    //         new-instance v2, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;
    //         iget-object v3, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->aiY:Landroid/view/ViewGroup;
    //         invoke-direct {v2, v3, v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;-><init>(Landroid/view/ViewGroup;Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;)V
    //         invoke-interface {v1, v2}, Lcom/google/android/gms/dynamic/f;->a(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         goto :goto_0
    */

}
