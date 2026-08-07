package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 7 methods.

open class fh: com.google.android.gms.common.internal.e() {
    val pP: Int

    public constructor(p0: android.content.Context, p1: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, p2: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, p3: Int)

    protected fun C(p0: android.os.IBinder): com.google.android.gms.internal.fm { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/fm;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/fm$a;->D(Landroid/os/IBinder;)Lcom/google/android/gms/internal/fm;
    //         move-result-object v0
    //         return-object v0
    */

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
    //         iget v1, p0, Lcom/google/android/gms/internal/fh;->pP:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fh;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/common/internal/l;->g(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun cE(): com.google.android.gms.internal.fm { return TODO("body: ()Lcom/google/android/gms/internal/fm;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/fm;
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.ads.internal.request.IAdRequestService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.ads.service.START"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fh;->C(Landroid/os/IBinder;)Lcom/google/android/gms/internal/fm;
    //         move-result-object v0
    //         return-object v0
    */

}
