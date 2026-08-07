package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 7 methods.

open class kl: com.google.android.gms.common.internal.e(), com.google.android.gms.internal.kk {
    private val Dd: String

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p4: String, p5: Array<String>)

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const v2, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/kl;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/internal/kl;->Dd:Ljava/lang/String;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/kl;->gR()[Ljava/lang/String;
    //         move-result-object v5
    //         new-instance v6, Landroid/os/Bundle;
    //         invoke-direct {v6}, Landroid/os/Bundle;-><init>()V
    //         move-object v0, p1
    //         move-object v1, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/common/internal/l;->a(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    protected fun ao(p0: android.os.IBinder): com.google.android.gms.internal.kp { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/kp;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/kp$a;->as(Landroid/os/IBinder;)Lcom/google/android/gms/internal/kp;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.fitness.internal.IGoogleFitnessService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.fitness.GoogleFitnessService.START"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kl;->ao(Landroid/os/IBinder;)Lcom/google/android/gms/internal/kp;
    //         move-result-object v0
    //         return-object v0
    */

    public fun jb(): com.google.android.gms.internal.kp { return TODO("body: ()Lcom/google/android/gms/internal/kp;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/kl;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/kp;
    //         return-object v0
    */

}
