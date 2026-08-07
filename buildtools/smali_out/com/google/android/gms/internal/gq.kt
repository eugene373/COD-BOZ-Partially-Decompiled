package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

class gq: com.google.android.gms.internal.gg() {
    private val mContext: android.content.Context
    private val mv: String
    private val uR: String
    private var vW: String

    public constructor(p0: android.content.Context, p1: String, p2: String)

    public constructor(p0: android.content.Context, p1: String, p2: String, p3: String)

    public fun co() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         :try_start_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Pinging URL: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gq;->uR:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         new-instance v0, Ljava/net/URL;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gq;->uR:Ljava/lang/String;
    //         invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    //         move-result-object v0
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         :try_end_0
    //         .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         :try_start_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gq;->vW:Ljava/lang/String;
    //         if-nez v1, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gq;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gq;->mv:Ljava/lang/String;
    //         const/4 v3, 0x1
    //         invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/gj;->a(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //         :goto_0
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v1
    //         const/16 v2, 0xc8
    //         if-lt v1, v2, :cond_0
    //         const/16 v2, 0x12c
    //         if-lt v1, v2, :cond_1
    //         :cond_0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Received non-success response code "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " from pinging URL: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gq;->uR:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :cond_1
    //         :try_start_2
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :try_end_2
    //         .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    //         :goto_1
    //         return-void
    //         :cond_2
    //         :try_start_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gq;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gq;->mv:Ljava/lang/String;
    //         const/4 v3, 0x1
    //         iget-object v4, p0, Lcom/google/android/gms/internal/gq;->vW:Ljava/lang/String;
    //         invoke-static {v1, v2, v3, v0, v4}, Lcom/google/android/gms/internal/gj;->a(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;Ljava/lang/String;)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         :try_start_4
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         throw v1
    //         :try_end_4
    //         .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error while parsing ping URL: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gq;->uR:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ". "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error while pinging URL: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gq;->uR:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ". "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_1
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
