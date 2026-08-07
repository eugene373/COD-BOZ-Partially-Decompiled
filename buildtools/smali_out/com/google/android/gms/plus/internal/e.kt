package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 2 fields, 22 methods.

open class e: com.google.android.gms.common.internal.e() {
    private var alt: com.google.android.gms.plus.model.people.Person
    private val alu: com.google.android.gms.plus.internal.h

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p4: com.google.android.gms.plus.internal.h)

    public constructor(p0: android.content.Context, p1: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, p2: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, p3: com.google.android.gms.plus.internal.h)

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: Int, p2: String): com.google.android.gms.common.internal.j { return TODO("body: (Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;)Lcom/google/android/gms/common/internal/j;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
    //                 ">;I",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/internal/j;"
    //             }
    //         .end annotation
    //         const/4 v6, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         new-instance v1, Lcom/google/android/gms/plus/internal/e$e;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/internal/e$e;-><init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         const/4 v2, 0x1
    //         const/4 v4, -0x1
    //         move v3, p2
    //         move-object v5, p3
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/plus/internal/d;->a(Lcom/google/android/gms/plus/internal/b;IIILjava/lang/String;)Lcom/google/android/gms/common/internal/j;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/16 v0, 0x8
    //         invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         invoke-virtual {v1, v0, v6}, Lcom/google/android/gms/plus/internal/e$e;->a(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V
    //         move-object v0, v6
    //         goto :goto_0
    */

    protected fun a(p0: Int, p1: android.os.IBinder, p2: android.os.Bundle) { /* TODO(body): (ILandroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         if-eqz p3, :cond_0
    //         const-string v0, "loaded_person"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "loaded_person"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/nz;->i([B)Lcom/google/android/gms/internal/nz;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/plus/internal/e;->alt:Lcom/google/android/gms/plus/model/people/Person;
    //         :cond_0
    //         invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/e;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: Int, p2: String, p3: android.net.Uri, p4: String, p5: String) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/Moments$LoadMomentsResult;",
    //                 ">;I",
    //                 "Ljava/lang/String;",
    //                 "Landroid/net/Uri;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         const/4 v7, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         if-eqz p1, :cond_0
    //         new-instance v1, Lcom/google/android/gms/plus/internal/e$b;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/internal/e$b;-><init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         :goto_0
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         move v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/d;->a(Lcom/google/android/gms/plus/internal/b;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         return-void
    //         :cond_0
    //         move-object v1, v7
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/16 v0, 0x8
    //         invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         invoke-virtual {v1, v0, v7, v7}, Lcom/google/android/gms/plus/internal/e$b;->a(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.plus.model.moments.Moment) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/plus/model/moments/Moment;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/plus/model/moments/Moment;",
    //                 ")V"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         if-eqz p1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/plus/internal/e$a;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/plus/internal/e$a;-><init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         move-object v1, v0
    //         :goto_0
    //         :try_start_0
    //         check-cast p2, Lcom/google/android/gms/internal/nw;
    //         invoke-static {p2}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ji;)Lcom/google/android/gms/internal/jp;
    //         move-result-object v3
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         invoke-interface {v0, v1, v3}, Lcom/google/android/gms/plus/internal/d;->a(Lcom/google/android/gms/plus/internal/b;Lcom/google/android/gms/internal/jp;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         return-void
    //         :cond_0
    //         move-object v1, v2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         if-nez v1, :cond_1
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v3, 0x8
    //         invoke-direct {v0, v3, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/plus/internal/e$a;->aB(Lcom/google/android/gms/common/api/Status;)V
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: java.util.Collection) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/util/Collection;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
    //                 ">;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         new-instance v1, Lcom/google/android/gms/plus/internal/e$e;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/internal/e$e;-><init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/plus/internal/d;->a(Lcom/google/android/gms/plus/internal/b;Ljava/util/List;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const/16 v0, 0x8
    //         invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/plus/internal/e$e;->a(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V
    //         goto :goto_0
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e;->alu:Lcom/google/android/gms/plus/internal/h;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/h;->no()Landroid/os/Bundle;
    //         move-result-object v7
    //         const-string v0, "request_visible_actions"
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/e;->alu:Lcom/google/android/gms/plus/internal/h;
    //         invoke-virtual {v1}, Lcom/google/android/gms/plus/internal/h;->nh()[Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
    //         const v2, 0x5e2978
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e;->alu:Lcom/google/android/gms/plus/internal/h;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/h;->nk()Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e;->alu:Lcom/google/android/gms/plus/internal/h;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/h;->nj()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gR()[Ljava/lang/String;
    //         move-result-object v5
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e;->alu:Lcom/google/android/gms/plus/internal/h;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/h;->getAccountName()Ljava/lang/String;
    //         move-result-object v6
    //         move-object v0, p1
    //         move-object v1, p2
    //         invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/common/internal/l;->a(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    protected fun bH(p0: android.os.IBinder): com.google.android.gms.plus.internal.d { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/d;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/plus/internal/d$a;->bG(Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/d;
    //         move-result-object v0
    //         return-object v0
    */

    public fun cg(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gR()[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun clearDefaultAccount() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iput-object v0, p0, Lcom/google/android/gms/plus/internal/e;->alt:Lcom/google/android/gms/plus/model/people/Person;
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/plus/internal/d;->clearDefaultAccount()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun d(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;[Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
    //                 ">;[",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/util/Collection;)V
    //         return-void
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/plus/internal/d;->getAccountName()Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun getCurrentPerson(): com.google.android.gms.plus.model.people.Person { return TODO("body: ()Lcom/google/android/gms/plus/model/people/Person;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e;->alt:Lcom/google/android/gms/plus/model/people/Person;
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.plus.service.START"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/internal/e;->bH(Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/d;
    //         move-result-object v0
    //         return-object v0
    */

    public fun k(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/Moments$LoadMomentsResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v3, 0x0
    //         const/16 v2, 0x14
    //         const-string v6, "me"
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v4, v3
    //         move-object v5, v3
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun l(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v6, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         new-instance v1, Lcom/google/android/gms/plus/internal/e$e;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/internal/e$e;-><init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         const/4 v2, 0x2
    //         const/4 v3, 0x1
    //         const/4 v4, -0x1
    //         const/4 v5, 0x0
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/plus/internal/d;->a(Lcom/google/android/gms/plus/internal/b;IIILjava/lang/String;)Lcom/google/android/gms/common/internal/j;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const/16 v0, 0x8
    //         invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         invoke-virtual {v1, v0, v6}, Lcom/google/android/gms/plus/internal/e$e;->a(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun m(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->clearDefaultAccount()V
    //         new-instance v1, Lcom/google/android/gms/plus/internal/e$g;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/internal/e$g;-><init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/plus/internal/d;->b(Lcom/google/android/gms/plus/internal/b;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const/16 v0, 0x8
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/plus/internal/e$g;->h(ILandroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun r(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: String): com.google.android.gms.common.internal.j { return TODO("body: (Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)Lcom/google/android/gms/common/internal/j;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/internal/j;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0, p2}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;)Lcom/google/android/gms/common/internal/j;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeMoment(momentId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->dJ()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/d;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/plus/internal/d;->removeMoment(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

}
