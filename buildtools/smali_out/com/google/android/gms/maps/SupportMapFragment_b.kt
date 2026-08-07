package com.google.android.gms.maps

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class SupportMapFragment_b: com.google.android.gms.dynamic.a() {
    private val Lt: android.support.v4.app.Fragment
    protected var aiT: com.google.android.gms.dynamic.f
    private var nr: android.app.Activity

    constructor(p0: android.support.v4.app.Fragment)

    private fun setActivity(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->nr:Landroid/app/Activity;
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->mA()V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.dynamic.f) { /* TODO(body): (Lcom/google/android/gms/dynamic/f;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/dynamic/f",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/SupportMapFragment$a;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->aiT:Lcom/google/android/gms/dynamic/f;
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->mA()V
    //         return-void
    */

    public fun mA() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->nr:Landroid/app/Activity;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->aiT:Lcom/google/android/gms/dynamic/f;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportMapFragment$b;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->nr:Landroid/app/Activity;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I
    //         iget-object v0, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->nr:Landroid/app/Activity;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/u;->S(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/c;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->nr:Landroid/app/Activity;
    //         invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/c;->j(Lcom/google/android/gms/dynamic/d;)Lcom/google/android/gms/maps/internal/IMapFragmentDelegate;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->aiT:Lcom/google/android/gms/dynamic/f;
    //         new-instance v2, Lcom/google/android/gms/maps/SupportMapFragment$a;
    //         iget-object v3, p0, Lcom/google/android/gms/maps/SupportMapFragment$b;->Lt:Landroid/support/v4/app/Fragment;
    //         invoke-direct {v2, v3, v0}, Lcom/google/android/gms/maps/SupportMapFragment$a;-><init>(Landroid/support/v4/app/Fragment;Lcom/google/android/gms/maps/internal/IMapFragmentDelegate;)V
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

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.maps.SupportMapFragment.b, p1: android.app.Activity) { /* TODO(body): (Lcom/google/android/gms/maps/SupportMapFragment$b;Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/maps/SupportMapFragment$b;->setActivity(Landroid/app/Activity;)V
    //         return-void
    */

    }
}
