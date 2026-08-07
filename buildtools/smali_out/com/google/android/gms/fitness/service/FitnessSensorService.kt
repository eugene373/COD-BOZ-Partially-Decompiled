package com.google.android.gms.fitness.service

// Auto-emitted from smali.
// 2 fields, 6 methods.

open class FitnessSensorService: android.app.Service() {
    private var Va: com.google.android.gms.fitness.service.FitnessSensorService.a

    public constructor()

    public fun onBind(intent: android.content.Intent): android.os.IBinder { return TODO("body: (Landroid/content/Intent;)Landroid/os/IBinder;") }
    /*
    //         .locals 3
    //         const-string v0, "com.google.android.gms.fitness.service.FitnessSensorService"
    //         invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "FitnessSensorService"
    //         const/4 v1, 0x3
    //         invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "FitnessSensorService"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Intent "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " received by "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService;->Va:Lcom/google/android/gms/fitness/service/FitnessSensorService$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onCreate() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Service;->onCreate()V
    //         new-instance v0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;-><init>(Lcom/google/android/gms/fitness/service/FitnessSensorService;Lcom/google/android/gms/fitness/service/FitnessSensorService$1;)V
    //         iput-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService;->Va:Lcom/google/android/gms/fitness/service/FitnessSensorService$a;
    //         return-void
    */

    public fun onFindDataSources(p0: java.util.List): java.util.List

    public fun onRegister(p0: com.google.android.gms.fitness.service.FitnessSensorServiceRequest): Boolean

    public fun onUnregister(p0: com.google.android.gms.fitness.data.DataSource): Boolean

    companion object {
    @JvmField public val SERVICE_INTERFACE: String = "com.google.android.gms.fitness.service.FitnessSensorService"
    }
}
