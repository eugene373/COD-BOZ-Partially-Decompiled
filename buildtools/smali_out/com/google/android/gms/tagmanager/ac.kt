package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 5 fields, 4 methods.

open class ac: com.google.android.gms.tagmanager.aj() {
    public constructor()

    public fun C(p0: java.util.Map): com.google.android.gms.internal.d.a { return TODO("body: (Ljava/util/Map;)Lcom/google/android/gms/internal/d$a;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/d$a;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/internal/d$a;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ac;->apf:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v4
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ac;->aph:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         if-nez v0, :cond_2
    //         const-string v0, "text"
    //         move-object v1, v0
    //         :goto_1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ac;->api:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         if-nez v0, :cond_3
    //         const-string v0, "base16"
    //         move-object v2, v0
    //         :goto_2
    //         const/4 v3, 0x2
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ac;->apg:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         if-eqz v0, :cond_b
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->n(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_b
    //         const/4 v0, 0x3
    //         :goto_3
    //         :try_start_0
    //         const-string v3, "text"
    //         invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         :goto_4
    //         const-string v3, "base16"
    //         invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_8
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/j;->d([B)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_5
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->u(Ljava/lang/Object;)Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v0
    //         move-object v1, v0
    //         goto :goto_1
    //         :cond_3
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v0
    //         move-object v2, v0
    //         goto :goto_2
    //         :cond_4
    //         :try_start_1
    //         const-string v3, "base16"
    //         invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_5
    //         invoke-static {v4}, Lcom/google/android/gms/tagmanager/j;->cm(Ljava/lang/String;)[B
    //         move-result-object v1
    //         goto :goto_4
    //         :cond_5
    //         const-string v3, "base64"
    //         invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_6
    //         invoke-static {v4, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    //         move-result-object v1
    //         goto :goto_4
    //         :cond_6
    //         const-string v3, "base64url"
    //         invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_7
    //         or-int/lit8 v1, v0, 0x8
    //         invoke-static {v4, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    //         move-result-object v1
    //         goto :goto_4
    //         :cond_7
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Encode: unknown input format: "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         :try_end_1
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "Encode: invalid input:"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :cond_8
    //         const-string v3, "base64"
    //         invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_9
    //         invoke-static {v1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_5
    //         :cond_9
    //         const-string v3, "base64url"
    //         invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_a
    //         or-int/lit8 v0, v0, 0x8
    //         invoke-static {v1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_5
    //         :cond_a
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Encode: unknown output format: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :cond_b
    //         move v0, v3
    //         goto/16 :goto_3
    */

    public fun nN(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    companion object {
    private val ID: String = null!!
    private val apf: String = null!!
    private val apg: String = null!!
    private val aph: String = null!!
    private val api: String = null!!
    }
}
