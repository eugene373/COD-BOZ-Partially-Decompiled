package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 8 methods.

class fr: com.google.android.gms.internal.fm.a() {
    private val mContext: android.content.Context
    private val uh: com.google.android.gms.internal.fx
    private val ui: com.google.android.gms.internal.ci
    private val uj: com.google.android.gms.internal.bm

    constructor(p0: android.content.Context, p1: com.google.android.gms.internal.bm, p2: com.google.android.gms.internal.ci, p3: com.google.android.gms.internal.fx)

    public fun b(p0: com.google.android.gms.internal.fi): com.google.android.gms.internal.fk { return TODO("body: (Lcom/google/android/gms/internal/fi;)Lcom/google/android/gms/internal/fk;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fr;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fr;->uj:Lcom/google/android/gms/internal/bm;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fr;->ui:Lcom/google/android/gms/internal/ci;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/fr;->uh:Lcom/google/android/gms/internal/fx;
    //         invoke-static {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/fr;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/fx;Lcom/google/android/gms/internal/fi;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val uf: Object = null!!
    private var ug: com.google.android.gms.internal.fr

    private @JvmStatic fun I(p0: String): com.google.android.gms.internal.gw.a { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/internal/gw$a;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/fr$2;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fr$2;-><init>(Ljava/lang/String;)V
    //         return-object v0
    */

    private @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.internal.bm, p2: com.google.android.gms.internal.ci, p3: com.google.android.gms.internal.fx, p4: com.google.android.gms.internal.fi): com.google.android.gms.internal.fk { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/fx;Lcom/google/android/gms/internal/fi;)Lcom/google/android/gms/internal/fk;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         const-string v0, "Starting ad request from service."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-interface {p2}, Lcom/google/android/gms/internal/ci;->init()V
    //         new-instance v0, Lcom/google/android/gms/internal/fw;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fw;-><init>(Landroid/content/Context;)V
    //         iget v1, v0, Lcom/google/android/gms/internal/fw;->vd:I
    //         const/4 v2, -0x1
    //         if-ne v1, v2, :cond_0
    //         const-string v0, "Device is offline."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         new-instance v0, Lcom/google/android/gms/internal/fk;
    //         const/4 v1, 0x2
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v3, Lcom/google/android/gms/internal/ft;
    //         iget-object v1, p4, Lcom/google/android/gms/internal/fi;->applicationInfo:Landroid/content/pm/ApplicationInfo;
    //         iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
    //         invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ft;-><init>(Ljava/lang/String;)V
    //         iget-object v1, p4, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/av;->extras:Landroid/os/Bundle;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p4, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/av;->extras:Landroid/os/Bundle;
    //         const-string v2, "_ad"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         invoke-static {p0, p4, v1}, Lcom/google/android/gms/internal/fs;->a(Landroid/content/Context;Lcom/google/android/gms/internal/fi;Ljava/lang/String;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         const-wide/16 v4, 0xfa
    //         invoke-interface {p2, v4, v5}, Lcom/google/android/gms/internal/ci;->a(J)Landroid/location/Location;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/bm;->bp()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/bm;->bq()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/bm;->br()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {p4, v0, v1, v2, v4}, Lcom/google/android/gms/internal/fs;->a(Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/fw;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         new-instance v0, Lcom/google/android/gms/internal/fk;
    //         invoke-direct {v0, v7}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         goto :goto_0
    //         :cond_2
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fr;->I(Ljava/lang/String;)Lcom/google/android/gms/internal/gw$a;
    //         move-result-object v4
    //         sget-object v6, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v0, Lcom/google/android/gms/internal/fr$1;
    //         move-object v1, p0
    //         move-object v2, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fr$1;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/ft;Lcom/google/android/gms/internal/gw$a;Ljava/lang/String;)V
    //         invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :try_start_0
    //         invoke-virtual {v3}, Lcom/google/android/gms/internal/ft;->cK()Ljava/util/concurrent/Future;
    //         move-result-object v0
    //         const-wide/16 v2, 0xa
    //         sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/fv;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         if-nez v0, :cond_3
    //         new-instance v0, Lcom/google/android/gms/internal/fk;
    //         invoke-direct {v0, v7}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Lcom/google/android/gms/internal/fk;
    //         invoke-direct {v0, v7}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fv;->getErrorCode()I
    //         move-result v1
    //         const/4 v2, -0x2
    //         if-eq v1, v2, :cond_4
    //         new-instance v1, Lcom/google/android/gms/internal/fk;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fv;->getErrorCode()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_4
    //         const/4 v1, 0x0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fv;->cN()Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         iget-object v1, p4, Lcom/google/android/gms/internal/fi;->ty:Landroid/content/pm/PackageInfo;
    //         iget-object v1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    //         invoke-interface {p3, v1}, Lcom/google/android/gms/internal/fx;->K(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         :cond_5
    //         iget-object v2, p4, Lcom/google/android/gms/internal/fi;->lD:Lcom/google/android/gms/internal/gt;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fv;->getUrl()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {p0, v2, v3, v1, v0}, Lcom/google/android/gms/internal/fr;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/fv;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v0
    //         goto/16 :goto_0
    */

    public @JvmStatic fun a(p0: android.content.Context, p1: String, p2: String, p3: String, p4: com.google.android.gms.internal.fv): com.google.android.gms.internal.fk { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/fv;)Lcom/google/android/gms/internal/fk;") }
    /*
    //         .locals 10
    //         const/16 v9, 0x12c
    //         const/4 v0, 0x0
    //         :try_start_0
    //         new-instance v3, Lcom/google/android/gms/internal/fu;
    //         invoke-direct {v3}, Lcom/google/android/gms/internal/fu;-><init>()V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "AdRequestServiceImpl: Sending request: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         new-instance v1, Ljava/net/URL;
    //         invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v4
    //         move-object v2, v1
    //         move v1, v0
    //         :goto_0
    //         invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    //         move-result-object v0
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v6, 0x0
    //         :try_start_1
    //         invoke-static {p0, p1, v6, v0}, Lcom/google/android/gms/internal/gj;->a(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //         invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v6
    //         if-nez v6, :cond_0
    //         const-string v6, "x-afma-drt-cookie"
    //         invoke-virtual {v0, v6, p3}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         if-eqz p4, :cond_1
    //         invoke-virtual {p4}, Lcom/google/android/gms/internal/fv;->cM()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v6
    //         if-nez v6, :cond_1
    //         const/4 v6, 0x1
    //         invoke-virtual {v0, v6}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
    //         invoke-virtual {p4}, Lcom/google/android/gms/internal/fv;->cM()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v6
    //         array-length v7, v6
    //         invoke-virtual {v0, v7}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    //         new-instance v7, Ljava/io/BufferedOutputStream;
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    //         move-result-object v8
    //         invoke-direct {v7, v8}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    //         invoke-virtual {v7, v6}, Ljava/io/BufferedOutputStream;->write([B)V
    //         invoke-virtual {v7}, Ljava/io/BufferedOutputStream;->close()V
    //         :cond_1
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v6
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;
    //         move-result-object v7
    //         const/16 v8, 0xc8
    //         if-lt v6, v8, :cond_2
    //         if-ge v6, v9, :cond_2
    //         invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Ljava/io/InputStreamReader;
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v8
    //         invoke-direct {v2, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    //         invoke-static {v2}, Lcom/google/android/gms/internal/gj;->a(Ljava/lang/Readable;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v7, v2, v6}, Lcom/google/android/gms/internal/fr;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //         invoke-virtual {v3, v1, v7, v2}, Lcom/google/android/gms/internal/fu;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    //         invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/fu;->i(J)Lcom/google/android/gms/internal/fk;
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-result-object v1
    //         :try_start_2
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :try_end_2
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    //         move-object v0, v1
    //         :goto_1
    //         return-object v0
    //         :cond_2
    //         :try_start_3
    //         invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v8, 0x0
    //         invoke-static {v2, v7, v8, v6}, Lcom/google/android/gms/internal/fr;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //         if-lt v6, v9, :cond_4
    //         const/16 v2, 0x190
    //         if-ge v6, v2, :cond_4
    //         const-string v2, "Location"
    //         invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         const-string v1, "No location header to follow redirect."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v1, Lcom/google/android/gms/internal/fk;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         :try_start_4
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :try_end_4
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_3
    //         :try_start_5
    //         new-instance v2, Ljava/net/URL;
    //         invoke-direct {v2, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         add-int/lit8 v1, v1, 0x1
    //         const/4 v6, 0x5
    //         if-le v1, v6, :cond_5
    //         const-string v1, "Too many redirects."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v1, Lcom/google/android/gms/internal/fk;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         :try_start_6
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :try_end_6
    //         .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_4
    //         :try_start_7
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Received error HTTP response code: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v1, Lcom/google/android/gms/internal/fk;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         :try_end_7
    //         .catchall {:try_start_7 .. :try_end_7} :catchall_0
    //         :try_start_8
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :try_end_8
    //         .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_5
    //         :try_start_9
    //         invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/fu;->e(Ljava/util/Map;)V
    //         :try_end_9
    //         .catchall {:try_start_9 .. :try_end_9} :catchall_0
    //         :try_start_a
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :try_end_a
    //         .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error while connecting to ad server: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         new-instance v0, Lcom/google/android/gms/internal/fk;
    //         const/4 v1, 0x2
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         goto/16 :goto_1
    //         :catchall_0
    //         move-exception v1
    //         :try_start_b
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         throw v1
    //         :try_end_b
    //         .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    */

    public @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.internal.bm, p2: com.google.android.gms.internal.ci, p3: com.google.android.gms.internal.fx): com.google.android.gms.internal.fr { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/fx;)Lcom/google/android/gms/internal/fr;") }
    /*
    //         .locals 3
    //         sget-object v1, Lcom/google/android/gms/internal/fr;->uf:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/internal/fr;->ug:Lcom/google/android/gms/internal/fr;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/fr;
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-direct {v0, v2, p1, p2, p3}, Lcom/google/android/gms/internal/fr;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/fx;)V
    //         sput-object v0, Lcom/google/android/gms/internal/fr;->ug:Lcom/google/android/gms/internal/fr;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/fr;->ug:Lcom/google/android/gms/internal/fr;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private @JvmStatic fun a(p0: String, p1: java.util.Map, p2: String, p3: Int) { /* TODO(body): (Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;>;",
    //                 "Ljava/lang/String;",
    //                 "I)V"
    //             }
    //         .end annotation
    //         const/4 v0, 0x2
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->u(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Http Response: {\n  URL:\n    "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\n  Headers:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "    "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ":"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "      "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "  Body:"
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         if-eqz p2, :cond_2
    //         const/4 v0, 0x0
    //         :goto_1
    //         invoke-virtual {p2}, Ljava/lang/String;->length()I
    //         move-result v1
    //         const v2, 0x186a0
    //         invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         if-ge v0, v1, :cond_3
    //         invoke-virtual {p2}, Ljava/lang/String;->length()I
    //         move-result v1
    //         add-int/lit16 v2, v0, 0x3e8
    //         invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         add-int/lit16 v0, v0, 0x3e8
    //         goto :goto_1
    //         :cond_2
    //         const-string v0, "    null"
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         :cond_3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "  Response Code:\n    "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\n}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         :cond_4
    //         return-void
    */

    }
}
