package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 8 fields, 9 methods.

open class co: Runnable {
    private val aoc: String
    private var aoy: String
    private val aqr: com.google.android.gms.tagmanager.bn
    private val aqs: String
    private var aqt: com.google.android.gms.tagmanager.bg
    private var aqu: com.google.android.gms.tagmanager.r
    private var aqv: String
    private val mContext: android.content.Context

    constructor(p0: android.content.Context, p1: String, p2: com.google.android.gms.tagmanager.bn, p3: com.google.android.gms.tagmanager.r)

    public constructor(p0: android.content.Context, p1: String, p2: com.google.android.gms.tagmanager.r)

    private fun oM(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->mContext:Landroid/content/Context;
    //         const-string v1, "connectivity"
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/ConnectivityManager;
    //         invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const-string v0, "...no network connectivity"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    private fun oN() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/co;->oM()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         sget-object v1, Lcom/google/android/gms/tagmanager/bg$a;->apM:Lcom/google/android/gms/tagmanager/bg$a;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/bg;->a(Lcom/google/android/gms/tagmanager/bg$a;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "Start loading resource from network ..."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/co;->oO()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqr:Lcom/google/android/gms/tagmanager/bn;
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->ox()Lcom/google/android/gms/tagmanager/bm;
    //         move-result-object v2
    //         :try_start_0
    //         invoke-interface {v2, v1}, Lcom/google/android/gms/tagmanager/bm;->cD(Ljava/lang/String;)Ljava/io/InputStream;
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         :try_start_1
    //         new-instance v3, Ljava/io/ByteArrayOutputStream;
    //         invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    //         invoke-static {v0, v3}, Lcom/google/android/gms/tagmanager/cr;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //         invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/c$j;->b([B)Lcom/google/android/gms/internal/c$j;
    //         move-result-object v0
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Successfully loaded supplemented resource: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         iget-object v3, v0, Lcom/google/android/gms/internal/c$j;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-nez v3, :cond_1
    //         iget-object v3, v0, Lcom/google/android/gms/internal/c$j;->gr:[Lcom/google/android/gms/internal/c$i;
    //         array-length v3, v3
    //         if-nez v3, :cond_1
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "No change for container: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/tagmanager/co;->aoc:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         invoke-interface {v3, v0}, Lcom/google/android/gms/tagmanager/bg;->l(Ljava/lang/Object;)V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-interface {v2}, Lcom/google/android/gms/tagmanager/bm;->close()V
    //         const-string v0, "Load resource from network finished."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :try_start_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "No data is retrieved from the given url: "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ". Make sure container_id: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/co;->aoc:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " is correct."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         sget-object v1, Lcom/google/android/gms/tagmanager/bg$a;->apO:Lcom/google/android/gms/tagmanager/bg$a;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/bg;->a(Lcom/google/android/gms/tagmanager/bg$a;)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         invoke-interface {v2}, Lcom/google/android/gms/tagmanager/bm;->close()V
    //         goto/16 :goto_0
    //         :catch_1
    //         move-exception v0
    //         :try_start_3
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error when loading resources from url: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v3, " "
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1, v0}, Lcom/google/android/gms/tagmanager/bh;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         sget-object v1, Lcom/google/android/gms/tagmanager/bg$a;->apN:Lcom/google/android/gms/tagmanager/bg$a;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/bg;->a(Lcom/google/android/gms/tagmanager/bg$a;)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         invoke-interface {v2}, Lcom/google/android/gms/tagmanager/bm;->close()V
    //         goto/16 :goto_0
    //         :catch_2
    //         move-exception v0
    //         :try_start_4
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error when parsing downloaded resources from url: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v3, " "
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1, v0}, Lcom/google/android/gms/tagmanager/bh;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         sget-object v1, Lcom/google/android/gms/tagmanager/bg$a;->apO:Lcom/google/android/gms/tagmanager/bg$a;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/bg;->a(Lcom/google/android/gms/tagmanager/bg$a;)V
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         invoke-interface {v2}, Lcom/google/android/gms/tagmanager/bm;->close()V
    //         goto/16 :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-interface {v2}, Lcom/google/android/gms/tagmanager/bm;->close()V
    //         throw v0
    */

    fun a(p0: com.google.android.gms.tagmanager.bg) { /* TODO(body): (Lcom/google/android/gms/tagmanager/bg;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/tagmanager/bg",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/c$j;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         return-void
    */

    fun cJ(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Setting previous container version: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->S(Ljava/lang/String;)V
    //         iput-object p1, p0, Lcom/google/android/gms/tagmanager/co;->aqv:Ljava/lang/String;
    //         return-void
    */

    fun cu(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqs:Ljava/lang/String;
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aoy:Ljava/lang/String;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Setting CTFE URL path: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->S(Ljava/lang/String;)V
    //         iput-object p1, p0, Lcom/google/android/gms/tagmanager/co;->aoy:Ljava/lang/String;
    //         goto :goto_0
    */

    fun oO(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/co;->aqu:Lcom/google/android/gms/tagmanager/r;
    //         invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/r;->od()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/co;->aoy:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "&v=a65833898"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/co;->aqv:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/co;->aqv:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, ""
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "&pv="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/co;->aqv:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/ce;->oJ()Lcom/google/android/gms/tagmanager/ce;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ce;->oK()Lcom/google/android/gms/tagmanager/ce$a;
    //         move-result-object v1
    //         sget-object v2, Lcom/google/android/gms/tagmanager/ce$a;->aqj:Lcom/google/android/gms/tagmanager/ce$a;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/tagmanager/ce$a;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "&gtm_debug=x"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_1
    //         return-object v0
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "callback must be set before execute"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/co;->aqt:Lcom/google/android/gms/tagmanager/bg;
    //         invoke-interface {v0}, Lcom/google/android/gms/tagmanager/bg;->ob()V
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/co;->oN()V
    //         return-void
    */

}
