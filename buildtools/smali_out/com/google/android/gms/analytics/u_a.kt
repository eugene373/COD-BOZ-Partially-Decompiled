package com.google.android.gms.analytics

// Auto-emitted from smali.
// 1 fields, 7 methods.

open class u_a: com.google.android.gms.analytics.j.a {
    private val Ar: com.google.android.gms.analytics.v

    public constructor()

    public fun c(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         const-string v0, "ga_dispatchPeriod"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/u$a;->Ar:Lcom/google/android/gms/analytics/v;
    //         iput p2, v0, Lcom/google/android/gms/analytics/v;->At:I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "int configuration name not recognized:  "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun d(p0: String, p1: Boolean) { /* TODO(body): (Ljava/lang/String;Z)V */ }
    /*
    //         .locals 2
    //         const-string v0, "ga_dryRun"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/u$a;->Ar:Lcom/google/android/gms/analytics/v;
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput v0, v1, Lcom/google/android/gms/analytics/v;->Au:I
    //         :goto_1
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "bool configuration name not recognized:  "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_1
    */

    public fun dW(): com.google.android.gms.analytics.i { return TODO("body: ()Lcom/google/android/gms/analytics/i;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/u$a;->es()Lcom/google/android/gms/analytics/v;
    //         move-result-object v0
    //         return-object v0
    */

    public fun es(): com.google.android.gms.analytics.v { return TODO("body: ()Lcom/google/android/gms/analytics/v;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/u$a;->Ar:Lcom/google/android/gms/analytics/v;
    //         return-object v0
    */

    public fun f(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun g(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "ga_appName"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/u$a;->Ar:Lcom/google/android/gms/analytics/v;
    //         iput-object p2, v0, Lcom/google/android/gms/analytics/v;->xL:Ljava/lang/String;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "ga_appVersion"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/u$a;->Ar:Lcom/google/android/gms/analytics/v;
    //         iput-object p2, v0, Lcom/google/android/gms/analytics/v;->xM:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "ga_logLevel"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/u$a;->Ar:Lcom/google/android/gms/analytics/v;
    //         iput-object p2, v0, Lcom/google/android/gms/analytics/v;->As:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "string configuration name not recognized:  "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    */

}
