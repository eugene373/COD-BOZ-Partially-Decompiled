package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class ao: com.google.android.gms.tagmanager.aj() {
    public constructor()

    private fun d(p0: String, p1: ByteArray): ByteArray { return TODO("body: (Ljava/lang/String;[B)[B") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/security/NoSuchAlgorithmException;
    //             }
    //         .end annotation
    //         invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->update([B)V
    //         invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun C(p0: java.util.Map): com.google.android.gms.internal.d.a { return TODO("body: (Ljava/util/Map;)Lcom/google/android/gms/internal/d$a;") }
    /*
    //         .locals 4
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
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ao;->apf:Ljava/lang/String;
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
    //         move-result-object v2
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ao;->apl:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         if-nez v0, :cond_2
    //         const-string v0, "MD5"
    //         move-object v1, v0
    //         :goto_1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ao;->aph:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         if-nez v0, :cond_3
    //         const-string v0, "text"
    //         :goto_2
    //         const-string v3, "text"
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v0
    //         :goto_3
    //         :try_start_0
    //         invoke-direct {p0, v1, v0}, Lcom/google/android/gms/tagmanager/ao;->d(Ljava/lang/String;[B)[B
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/j;->d([B)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->u(Ljava/lang/Object;)Lcom/google/android/gms/internal/d$a;
    //         :try_end_0
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
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
    //         goto :goto_2
    //         :cond_4
    //         const-string v3, "base16"
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_5
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/j;->cm(Ljava/lang/String;)[B
    //         move-result-object v0
    //         goto :goto_3
    //         :cond_5
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Hash: unknown input format: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Hash: unknown algorithm: "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto/16 :goto_0
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
    private val aph: String = null!!
    private val apl: String = null!!
    }
}
