package com.google.android.gms.analytics

// Auto-emitted from smali.
// 6 fields, 15 methods.

open class h: com.google.android.gms.analytics.l {
    private val mContext: android.content.Context
    private var xR: String
    private var xS: Boolean
    private val xT: Object

    protected constructor(p0: android.content.Context)

    private fun ad(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         :try_start_0
    //         const-string v1, "Storing clientId."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/h;->mContext:Landroid/content/Context;
    //         const-string v2, "gaClientId"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //         move-result-object v1
    //         invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V
    //         invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         const-string v1, "Error creating clientId file."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         const-string v1, "Error writing to clientId file."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         goto :goto_0
    */

    private fun dS(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/h;->xS:Z
    //         if-nez v0, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/h;->xT:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/h;->xS:Z
    //         if-nez v0, :cond_1
    //         const-string v0, "Waiting for clientId to load"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/h;->xT:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_0
    //         :try_start_2
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/h;->xS:Z
    //         if-eqz v0, :cond_0
    //         :cond_1
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :cond_2
    //         const-string v0, "Loaded clientId"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/h;->xR:Ljava/lang/String;
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         :try_start_3
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Exception while waiting for clientId: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    */

    private fun dU() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/analytics/h$1;
    //         const-string v1, "client_id_fetcher"
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/analytics/h$1;-><init>(Lcom/google/android/gms/analytics/h;Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    //         return-void
    */

    public fun ac(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "&cid"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    fun dR(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/h;->xT:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/h;->dT()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/h;->xR:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/h;->xR:Ljava/lang/String;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun dT(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    //         move-result-object v0
    //         :try_start_0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/h;->ad(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v0, "0"
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun dV(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/h;->mContext:Landroid/content/Context;
    //         const-string v2, "gaClientId"
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    //         move-result-object v2
    //         const/16 v1, 0x80
    //         new-array v3, v1, [B
    //         const/4 v1, 0x0
    //         const/16 v4, 0x80
    //         invoke-virtual {v2, v3, v1, v4}, Ljava/io/FileInputStream;->read([BII)I
    //         move-result v4
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->available()I
    //         move-result v1
    //         if-lez v1, :cond_1
    //         const-string v1, "clientId file seems corrupted, deleting it."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/h;->mContext:Landroid/content/Context;
    //         const-string v2, "gaClientId"
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         :goto_0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/h;->dT()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    //         :cond_1
    //         if-gtz v4, :cond_2
    //         :try_start_1
    //         const-string v1, "clientId file seems empty, deleting it."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/h;->mContext:Landroid/content/Context;
    //         const-string v2, "gaClientId"
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :cond_2
    //         new-instance v1, Ljava/lang/String;
    //         const/4 v5, 0x0
    //         invoke-direct {v1, v3, v5, v4}, Ljava/lang/String;-><init>([BII)V
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         :try_start_2
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    //         const-string v0, "Loaded client id from disk."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :try_end_2
    //         .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         :goto_1
    //         const-string v1, "Error reading clientId file, deleting it."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/h;->mContext:Landroid/content/Context;
    //         const-string v2, "gaClientId"
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         move-object v0, v1
    //         goto :goto_1
    //         :catch_3
    //         move-exception v0
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun getValue(field: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "&cid"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/h;->dS()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    private var xQ: com.google.android.gms.analytics.h
    private val xz: Object = null!!

    @JvmStatic fun a(p0: com.google.android.gms.analytics.h): Object { return TODO("body: (Lcom/google/android/gms/analytics/h;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/h;->xT:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.analytics.h, p1: String): String { return TODO("body: (Lcom/google/android/gms/analytics/h;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/analytics/h;->xR:Ljava/lang/String;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.analytics.h, p1: Boolean): Boolean { return TODO("body: (Lcom/google/android/gms/analytics/h;Z)Z") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/analytics/h;->xS:Z
    //         return p1
    */

    public @JvmStatic fun dQ(): com.google.android.gms.analytics.h { return TODO("body: ()Lcom/google/android/gms/analytics/h;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/google/android/gms/analytics/h;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/h;->xQ:Lcom/google/android/gms/analytics/h;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun y(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/google/android/gms/analytics/h;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/h;->xQ:Lcom/google/android/gms/analytics/h;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/h;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/h;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/analytics/h;->xQ:Lcom/google/android/gms/analytics/h;
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
