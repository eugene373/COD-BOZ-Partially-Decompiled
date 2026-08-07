package com.google.android.gms.analytics

// Auto-emitted from smali.
// 1 fields, 7 methods.

open class ah_a: com.google.android.gms.analytics.j.a {
    private val BB: com.google.android.gms.analytics.ai

    public constructor()

    public fun c(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         const-string v0, "ga_sessionTimeout"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         iput p2, v0, Lcom/google/android/gms/analytics/ai;->BE:I
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
    //         .locals 3
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         const-string v2, "ga_autoActivityTracking"
    //         invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         if-eqz p2, :cond_0
    //         :goto_0
    //         iput v0, v2, Lcom/google/android/gms/analytics/ai;->BF:I
    //         :goto_1
    //         return-void
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         const-string v2, "ga_anonymizeIp"
    //         invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         if-eqz p2, :cond_2
    //         :goto_2
    //         iput v0, v2, Lcom/google/android/gms/analytics/ai;->BG:I
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :cond_3
    //         const-string v2, "ga_reportUncaughtExceptions"
    //         invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         if-eqz p2, :cond_4
    //         :goto_3
    //         iput v0, v2, Lcom/google/android/gms/analytics/ai;->BH:I
    //         goto :goto_1
    //         :cond_4
    //         move v0, v1
    //         goto :goto_3
    //         :cond_5
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
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ah$a;->eY()Lcom/google/android/gms/analytics/ai;
    //         move-result-object v0
    //         return-object v0
    */

    public fun eY(): com.google.android.gms.analytics.ai { return TODO("body: ()Lcom/google/android/gms/analytics/ai;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         return-object v0
    */

    public fun f(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         iget-object v0, v0, Lcom/google/android/gms/analytics/ai;->BI:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun g(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         const-string v0, "ga_trackingId"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         iput-object p2, v0, Lcom/google/android/gms/analytics/ai;->BC:Ljava/lang/String;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "ga_sampleFrequency"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ah$a;->BB:Lcom/google/android/gms/analytics/ai;
    //         invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    //         move-result-wide v2
    //         iput-wide v2, v0, Lcom/google/android/gms/analytics/ai;->BD:D
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Error parsing ga_sampleFrequency value: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
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
