package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 6 fields, 5 methods.

open class y: com.google.android.gms.tagmanager.aq {
    private var aos: com.google.android.gms.tagmanager.cg
    private var apc: String
    private var apd: String
    private var ape: com.google.android.gms.tagmanager.ar

    private constructor(p0: android.content.Context)

    constructor(p0: com.google.android.gms.tagmanager.ar, p1: com.google.android.gms.tagmanager.cg)

    public fun cz(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/y;->aos:Lcom/google/android/gms/tagmanager/cg;
    //         invoke-interface {v1}, Lcom/google/android/gms/tagmanager/cg;->eJ()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "Too many urls sent too quickly with the TagManagerSender, rate limiting invoked."
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/y;->apc:Ljava/lang/String;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/y;->apd:Ljava/lang/String;
    //         if-eqz v1, :cond_1
    //         :try_start_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/y;->apc:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "?"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/y;->apd:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "UTF-8"
    //         invoke-static {p1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Sending wrapped url hit: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/y;->ape:Lcom/google/android/gms/tagmanager/ar;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/ar;->cC(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "Error wrapping URL for testing."
    //         invoke-static {v2, v1}, Lcom/google/android/gms/tagmanager/bh;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    companion object {
    private var apb: com.google.android.gms.tagmanager.y
    private val xz: Object = null!!

    public @JvmStatic fun X(p0: android.content.Context): com.google.android.gms.tagmanager.aq { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/tagmanager/aq;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/google/android/gms/tagmanager/y;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/y;->apb:Lcom/google/android/gms/tagmanager/y;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/y;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/y;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/tagmanager/y;->apb:Lcom/google/android/gms/tagmanager/y;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/y;->apb:Lcom/google/android/gms/tagmanager/y;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
