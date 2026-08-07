package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 15 methods.

class ib: com.google.android.gms.common.internal.e() {
    private val Dd: String

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p4: String, p5: Array<String>)

    protected fun I(p0: android.os.IBinder): com.google.android.gms.internal.id { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/id;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/id$a;->K(Landroid/os/IBinder;)Lcom/google/android/gms/internal/id;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/appstate/AppStateManager$StateListResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         new-instance v1, Lcom/google/android/gms/internal/ib$c;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ib$c;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/id;->a(Lcom/google/android/gms/internal/ic;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;I)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/appstate/AppStateManager$StateDeletedResult;",
    //                 ">;I)V"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         new-instance v1, Lcom/google/android/gms/internal/ib$a;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ib$a;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/id;->b(Lcom/google/android/gms/internal/ic;I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: Int, p2: String, p3: ByteArray) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;[B)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
    //                 ">;I",
    //                 "Ljava/lang/String;",
    //                 "[B)V"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         new-instance v1, Lcom/google/android/gms/internal/ib$e;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ib$e;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/internal/id;->a(Lcom/google/android/gms/internal/ic;ILjava/lang/String;[B)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: Int, p2: ByteArray) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;I[B)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
    //                 ">;I[B)V"
    //             }
    //         .end annotation
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         move-object v1, v0
    //         :goto_0
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/internal/id;->a(Lcom/google/android/gms/internal/ic;I[B)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/ib$e;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ib$e;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-object v1, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const v2, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/internal/ib;->Dd:Ljava/lang/String;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gR()[Ljava/lang/String;
    //         move-result-object v5
    //         move-object v0, p1
    //         move-object v1, p2
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/common/internal/l;->a(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         new-instance v1, Lcom/google/android/gms/internal/ib$g;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ib$g;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/id;->b(Lcom/google/android/gms/internal/ic;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun b(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;I)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/appstate/AppStateManager$StateResult;",
    //                 ">;I)V"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         new-instance v1, Lcom/google/android/gms/internal/ib$e;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ib$e;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/id;->a(Lcom/google/android/gms/internal/ic;I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    protected fun c(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         const/4 v3, 0x1
    //         const/4 v1, 0x0
    //         move v0, v1
    //         move v2, v1
    //         :goto_0
    //         array-length v4, p1
    //         if-ge v0, v4, :cond_1
    //         aget-object v4, p1, v0
    //         const-string v5, "https://www.googleapis.com/auth/appstate"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         move v2, v3
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "App State APIs requires %s to function."
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const-string v4, "https://www.googleapis.com/auth/appstate"
    //         aput-object v4, v3, v1
    //         invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         return-void
    */

    public fun fq(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v1, 0x2
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/id;->fq()I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v2, "service died"
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         move v0, v1
    //         goto :goto_0
    */

    public fun fr(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v1, 0x2
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ib;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/id;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/id;->fr()I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "AppStateClient"
    //         const-string v2, "service died"
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         move v0, v1
    //         goto :goto_0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.appstate.internal.IAppStateService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.appstate.service.START"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ib;->I(Landroid/os/IBinder;)Lcom/google/android/gms/internal/id;
    //         move-result-object v0
    //         return-object v0
    */

}
