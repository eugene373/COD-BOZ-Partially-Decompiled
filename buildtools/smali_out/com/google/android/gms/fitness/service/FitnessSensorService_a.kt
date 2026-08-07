package com.google.android.gms.fitness.service

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class FitnessSensorService_a: com.google.android.gms.internal.lk.a() {
    private val Vb: com.google.android.gms.fitness.service.FitnessSensorService

    private constructor(p0: com.google.android.gms.fitness.service.FitnessSensorService)

    constructor(p0: com.google.android.gms.fitness.service.FitnessSensorService, p1: com.google.android.gms.fitness.service.FitnessSensorService.1)

    private fun jM() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/SecurityException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Binder;->getCallingUid()I
    //         move-result v1
    //         const-string v0, "com.google.android.gms"
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hI()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->Vb:Lcom/google/android/gms/fitness/service/FitnessSensorService;
    //         const-string v2, "appops"
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/AppOpsManager;
    //         const-string v2, "com.google.android.gms"
    //         invoke-virtual {v0, v1, v2}, Landroid/app/AppOpsManager;->checkPackage(ILjava/lang/String;)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->Vb:Lcom/google/android/gms/fitness/service/FitnessSensorService;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         array-length v2, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_2
    //         aget-object v3, v1, v0
    //         const-string v4, "com.google.android.gms"
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         new-instance v0, Ljava/lang/SecurityException;
    //         const-string v1, "Unauthorized caller"
    //         invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.fitness.service.FitnessSensorServiceRequest, p1: com.google.android.gms.internal.kt) { /* TODO(body): (Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;Lcom/google/android/gms/internal/kt;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->jM()V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->Vb:Lcom/google/android/gms/fitness/service/FitnessSensorService;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->onRegister(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-interface {p2, v0}, Lcom/google/android/gms/internal/kt;->k(Lcom/google/android/gms/common/api/Status;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0xd
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p2, v0}, Lcom/google/android/gms/internal/kt;->k(Lcom/google/android/gms/common/api/Status;)V
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.lg, p1: com.google.android.gms.internal.kn) { /* TODO(body): (Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/kn;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->jM()V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->Vb:Lcom/google/android/gms/fitness/service/FitnessSensorService;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->getDataTypes()Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->onFindDataSources(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/fitness/result/DataSourcesResult;
    //         sget-object v2, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v1, v0, v2}, Lcom/google/android/gms/fitness/result/DataSourcesResult;-><init>(Ljava/util/List;Lcom/google/android/gms/common/api/Status;)V
    //         invoke-interface {p2, v1}, Lcom/google/android/gms/internal/kn;->a(Lcom/google/android/gms/fitness/result/DataSourcesResult;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.li, p1: com.google.android.gms.internal.kt) { /* TODO(body): (Lcom/google/android/gms/internal/li;Lcom/google/android/gms/internal/kt;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->jM()V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->Vb:Lcom/google/android/gms/fitness/service/FitnessSensorService;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/li;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->onUnregister(Lcom/google/android/gms/fitness/data/DataSource;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-interface {p2, v0}, Lcom/google/android/gms/internal/kt;->k(Lcom/google/android/gms/common/api/Status;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0xd
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p2, v0}, Lcom/google/android/gms/internal/kt;->k(Lcom/google/android/gms/common/api/Status;)V
    //         goto :goto_0
    */

}
