package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 7 methods.

open class hy: com.google.android.gms.common.internal.e() {
    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)

    protected fun H(p0: android.os.IBinder): com.google.android.gms.internal.hv { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/hv;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/hv$a;->F(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hv;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const v0, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/hy;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/common/internal/l;->b(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;)V
    //         return-void
    */

    public fun fn(): com.google.android.gms.internal.hv { return TODO("body: ()Lcom/google/android/gms/internal/hv;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/hy;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hv;
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hy;->H(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hv;
    //         move-result-object v0
    //         return-object v0
    */

}
