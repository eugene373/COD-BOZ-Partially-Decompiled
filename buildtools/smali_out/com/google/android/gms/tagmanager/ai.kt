package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 0 fields, 5 methods.

open class ai {
    companion object {
    private @JvmStatic fun a(p0: com.google.android.gms.tagmanager.DataLayer, p1: com.google.android.gms.internal.c.d) { /* TODO(body): (Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/c$d;)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p1, Lcom/google/android/gms/internal/c$d;->fB:[Lcom/google/android/gms/internal/d$a;
    //         array-length v2, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         aget-object v3, v1, v0
    //         invoke-static {v3}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v3}, Lcom/google/android/gms/tagmanager/DataLayer;->cv(Ljava/lang/String;)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun a(p0: com.google.android.gms.tagmanager.DataLayer, p1: com.google.android.gms.internal.c.i) { /* TODO(body): (Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/c$i;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p1, Lcom/google/android/gms/internal/c$i;->gq:Lcom/google/android/gms/internal/c$d;
    //         if-nez v0, :cond_0
    //         const-string v0, "supplemental missing experimentSupplemental"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p1, Lcom/google/android/gms/internal/c$i;->gq:Lcom/google/android/gms/internal/c$d;
    //         invoke-static {p0, v0}, Lcom/google/android/gms/tagmanager/ai;->a(Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/c$d;)V
    //         iget-object v0, p1, Lcom/google/android/gms/internal/c$i;->gq:Lcom/google/android/gms/internal/c$d;
    //         invoke-static {p0, v0}, Lcom/google/android/gms/tagmanager/ai;->b(Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/c$d;)V
    //         iget-object v0, p1, Lcom/google/android/gms/internal/c$i;->gq:Lcom/google/android/gms/internal/c$d;
    //         invoke-static {p0, v0}, Lcom/google/android/gms/tagmanager/ai;->c(Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/c$d;)V
    //         goto :goto_0
    */

    private @JvmStatic fun b(p0: com.google.android.gms.tagmanager.DataLayer, p1: com.google.android.gms.internal.c.d) { /* TODO(body): (Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/c$d;)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p1, Lcom/google/android/gms/internal/c$d;->fA:[Lcom/google/android/gms/internal/d$a;
    //         array-length v2, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_1
    //         aget-object v3, v1, v0
    //         invoke-static {v3}, Lcom/google/android/gms/tagmanager/ai;->c(Lcom/google/android/gms/internal/d$a;)Ljava/util/Map;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {p0, v3}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/util/Map;)V
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    private @JvmStatic fun c(p0: com.google.android.gms.internal.d.a): java.util.Map { return TODO("body: (Lcom/google/android/gms/internal/d$a;)Ljava/util/Map;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/d$a;",
    //                 ")",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/google/android/gms/tagmanager/di;->o(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v1, v0, Ljava/util/Map;
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "value: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " is not a map value, ignored."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         check-cast v0, Ljava/util/Map;
    //         goto :goto_0
    */

    private @JvmStatic fun c(p0: com.google.android.gms.tagmanager.DataLayer, p1: com.google.android.gms.internal.c.d) { /* TODO(body): (Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/c$d;)V */ }
    /*
    //         .locals 14
    //         const/4 v3, 0x0
    //         iget-object v4, p1, Lcom/google/android/gms/internal/c$d;->fC:[Lcom/google/android/gms/internal/c$c;
    //         array-length v5, v4
    //         move v2, v3
    //         :goto_0
    //         if-ge v2, v5, :cond_8
    //         aget-object v6, v4, v2
    //         iget-object v0, v6, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, "GaExperimentRandom: No key"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         :goto_1
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, v6, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v0, v1, Ljava/lang/Number;
    //         if-nez v0, :cond_4
    //         const/4 v0, 0x0
    //         :goto_2
    //         iget-wide v8, v6, Lcom/google/android/gms/internal/c$c;->fw:J
    //         iget-wide v10, v6, Lcom/google/android/gms/internal/c$c;->fx:J
    //         iget-boolean v7, v6, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         if-eqz v7, :cond_1
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v12
    //         cmp-long v7, v12, v8
    //         if-ltz v7, :cond_1
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v12
    //         cmp-long v0, v12, v10
    //         if-lez v0, :cond_2
    //         :cond_1
    //         cmp-long v0, v8, v10
    //         if-gtz v0, :cond_5
    //         invoke-static {}, Ljava/lang/Math;->random()D
    //         move-result-wide v0
    //         sub-long/2addr v10, v8
    //         long-to-double v10, v10
    //         mul-double/2addr v0, v10
    //         long-to-double v8, v8
    //         add-double/2addr v0, v8
    //         invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v1
    //         :cond_2
    //         iget-object v0, v6, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->cv(Ljava/lang/String;)V
    //         iget-object v0, v6, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/tagmanager/DataLayer;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;
    //         move-result-object v1
    //         iget-wide v8, v6, Lcom/google/android/gms/internal/c$c;->fz:J
    //         const-wide/16 v10, 0x0
    //         cmp-long v0, v8, v10
    //         if-lez v0, :cond_3
    //         const-string v0, "gtm"
    //         invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_6
    //         const-string v0, "gtm"
    //         const/4 v7, 0x2
    //         new-array v7, v7, [Ljava/lang/Object;
    //         const-string v8, "lifetime"
    //         aput-object v8, v7, v3
    //         const/4 v8, 0x1
    //         iget-wide v10, v6, Lcom/google/android/gms/internal/c$c;->fz:J
    //         invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v6
    //         aput-object v6, v7, v8
    //         invoke-static {v7}, Lcom/google/android/gms/tagmanager/DataLayer;->mapOf([Ljava/lang/Object;)Ljava/util/Map;
    //         move-result-object v6
    //         invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_3
    //         :goto_3
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/util/Map;)V
    //         goto :goto_1
    //         :cond_4
    //         move-object v0, v1
    //         check-cast v0, Ljava/lang/Number;
    //         invoke-virtual {v0}, Ljava/lang/Number;->longValue()J
    //         move-result-wide v8
    //         invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         goto :goto_2
    //         :cond_5
    //         const-string v0, "GaExperimentRandom: random range invalid"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         goto/16 :goto_1
    //         :cond_6
    //         const-string v0, "gtm"
    //         invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v7, v0, Ljava/util/Map;
    //         if-eqz v7, :cond_7
    //         check-cast v0, Ljava/util/Map;
    //         const-string v7, "lifetime"
    //         iget-wide v8, v6, Lcom/google/android/gms/internal/c$c;->fz:J
    //         invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v6
    //         invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_3
    //         :cond_7
    //         const-string v0, "GaExperimentRandom: gtm not a map"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         goto :goto_3
    //         :cond_8
    //         return-void
    */

    }
}
