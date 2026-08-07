package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class nd: com.google.android.gms.common.internal.e() {
    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const v1, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/nd;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/common/internal/l;->a(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun bB(p0: android.os.IBinder): com.google.android.gms.internal.nb { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/nb;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/nb$a;->bA(Landroid/os/IBinder;)Lcom/google/android/gms/internal/nb;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.panorama.internal.IPanoramaService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.panorama.service.START"
    //         return-object v0
    */

    public fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/nd;->bB(Landroid/os/IBinder;)Lcom/google/android/gms/internal/nb;
    //         move-result-object v0
    //         return-object v0
    */

}
