package com.google.android.gms.analytics

// Auto-emitted from smali.
// 8 fields, 9 methods.

open class a: com.google.android.gms.analytics.l {
    private var mContext: android.content.Context
    private var xB: com.google.android.gms.ads.identifier.AdvertisingIdClient.Info
    private var xC: Long
    private var xD: String
    private var xE: Boolean
    private var xF: Object

    constructor(p0: android.content.Context)

    private fun a(p0: com.google.android.gms.ads.identifier.AdvertisingIdClient.Info, p1: com.google.android.gms.ads.identifier.AdvertisingIdClient.Info): Boolean { return TODO("body: (Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;)Z") }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         const/4 v2, 0x1
    //         if-nez p2, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         move v0, v2
    //         :goto_1
    //         return v0
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/a;->mContext:Landroid/content/Context;
    //         invoke-static {v3}, Lcom/google/android/gms/analytics/h;->y(Landroid/content/Context;)V
    //         invoke-static {}, Lcom/google/android/gms/analytics/h;->dQ()Lcom/google/android/gms/analytics/h;
    //         move-result-object v4
    //         const-string v3, "&cid"
    //         invoke-virtual {v4, v3}, Lcom/google/android/gms/analytics/h;->getValue(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v5, p0, Lcom/google/android/gms/analytics/a;->xF:Ljava/lang/Object;
    //         monitor-enter v5
    //         :try_start_0
    //         iget-boolean v6, p0, Lcom/google/android/gms/analytics/a;->xE:Z
    //         if-nez v6, :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/a;->mContext:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/a;->x(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/google/android/gms/analytics/a;->xD:Ljava/lang/String;
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Lcom/google/android/gms/analytics/a;->xE:Z
    //         :cond_2
    //         :goto_2
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/a;->aa(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v6
    //         if-eqz v6, :cond_6
    //         const/4 v0, 0x0
    //         monitor-exit v5
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v5
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_3
    //         :try_start_1
    //         iget-object v6, p0, Lcom/google/android/gms/analytics/a;->xD:Ljava/lang/String;
    //         invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v6
    //         if-eqz v6, :cond_2
    //         if-nez p1, :cond_4
    //         :goto_3
    //         if-nez v1, :cond_5
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/a;->ab(Ljava/lang/String;)Z
    //         move-result v0
    //         monitor-exit v5
    //         goto :goto_1
    //         :cond_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_3
    //         :cond_5
    //         new-instance v6, Ljava/lang/StringBuilder;
    //         invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/a;->aa(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/google/android/gms/analytics/a;->xD:Ljava/lang/String;
    //         goto :goto_2
    //         :cond_6
    //         iget-object v6, p0, Lcom/google/android/gms/analytics/a;->xD:Ljava/lang/String;
    //         invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_7
    //         monitor-exit v5
    //         move v0, v2
    //         goto/16 :goto_1
    //         :cond_7
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/a;->xD:Ljava/lang/String;
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_8
    //         const-string v1, "Resetting the client id because Advertising Id changed."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         invoke-virtual {v4}, Lcom/google/android/gms/analytics/h;->dR()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "New client Id: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :goto_4
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/a;->ab(Ljava/lang/String;)Z
    //         move-result v0
    //         monitor-exit v5
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto/16 :goto_1
    //         :cond_8
    //         move-object v1, v3
    //         goto :goto_4
    */

    private fun ab(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/a;->aa(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Storing hashed adid."
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/a;->mContext:Landroid/content/Context;
    //         const-string v3, "gaClientIdData"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //         move-result-object v2
    //         invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/io/FileOutputStream;->write([B)V
    //         invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    //         iput-object v1, p0, Lcom/google/android/gms/analytics/a;->xD:Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         const-string v1, "Error creating hash file."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         const-string v1, "Error writing to hash file."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V
    //         goto :goto_0
    */

    fun dG(): com.google.android.gms.ads.identifier.AdvertisingIdClient.Info { return TODO("body: ()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/a;->mContext:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_3
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         const-string v1, "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added \'<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />\' to your application manifest file. See http://goo.gl/naFqQk for details."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         const-string v1, "GooglePlayServicesRepairableException getting Ad Id Info"
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_2
    //         move-exception v1
    //         const-string v1, "IOException getting Ad Id Info"
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_3
    //         move-exception v1
    //         const-string v1, "GooglePlayServicesNotAvailableException getting Ad Id Info"
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_4
    //         move-exception v1
    //         const-string v1, "Unknown exception. Could not get the ad Id."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun getValue(field: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         iget-wide v2, p0, Lcom/google/android/gms/analytics/a;->xC:J
    //         sub-long v2, v0, v2
    //         const-wide/16 v4, 0x3e8
    //         cmp-long v2, v2, v4
    //         if-lez v2, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/a;->dG()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         invoke-direct {p0, v3, v2}, Lcom/google/android/gms/analytics/a;->a(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         iput-object v2, p0, Lcom/google/android/gms/analytics/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         :goto_0
    //         iput-wide v0, p0, Lcom/google/android/gms/analytics/a;->xC:J
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         if-eqz v0, :cond_4
    //         const-string v0, "&adid"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         new-instance v2, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         const-string v3, ""
    //         const/4 v4, 0x0
    //         invoke-direct {v2, v3, v4}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;-><init>(Ljava/lang/String;Z)V
    //         iput-object v2, p0, Lcom/google/android/gms/analytics/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         goto :goto_0
    //         :cond_2
    //         const-string v0, "&ate"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "0"
    //         goto :goto_1
    //         :cond_3
    //         const-string v0, "1"
    //         goto :goto_1
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    companion object {
    private var xA: com.google.android.gms.analytics.a
    private var xz: Object

    @JvmStatic fun aa(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const-string v0, "MD5"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/aj;->ap(Ljava/lang/String;)Ljava/security/MessageDigest;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v2, "%032X"
    //         new-array v3, v7, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         new-instance v5, Ljava/math/BigInteger;
    //         invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v6
    //         invoke-virtual {v0, v6}, Ljava/security/MessageDigest;->digest([B)[B
    //         move-result-object v0
    //         invoke-direct {v5, v7, v0}, Ljava/math/BigInteger;-><init>(I[B)V
    //         aput-object v5, v3, v4
    //         invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun w(p0: android.content.Context): com.google.android.gms.analytics.l { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/analytics/l;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/analytics/a;->xA:Lcom/google/android/gms/analytics/a;
    //         if-nez v0, :cond_1
    //         sget-object v1, Lcom/google/android/gms/analytics/a;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/a;->xA:Lcom/google/android/gms/analytics/a;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/a;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/analytics/a;->xA:Lcom/google/android/gms/analytics/a;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/analytics/a;->xA:Lcom/google/android/gms/analytics/a;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    @JvmStatic fun x(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         :try_start_0
    //         const-string v1, "gaClientIdData"
    //         invoke-virtual {p0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    //         move-result-object v2
    //         const/16 v1, 0x80
    //         new-array v3, v1, [B
    //         const/4 v1, 0x0
    //         const/16 v4, 0x80
    //         invoke-virtual {v2, v3, v1, v4}, Ljava/io/FileInputStream;->read([BII)I
    //         move-result v4
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->available()I
    //         move-result v1
    //         if-lez v1, :cond_0
    //         const-string v1, "Hash file seems corrupted, deleting it."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    //         const-string v1, "gaClientIdData"
    //         invoke-virtual {p0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         if-gtz v4, :cond_1
    //         const-string v1, "Hash file is empty."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->U(Ljava/lang/String;)V
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :cond_1
    //         new-instance v1, Ljava/lang/String;
    //         const/4 v5, 0x0
    //         invoke-direct {v1, v3, v5, v4}, Ljava/lang/String;-><init>([BII)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         :try_start_1
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         :goto_1
    //         const-string v1, "Error reading Hash file, deleting it."
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         const-string v1, "gaClientIdData"
    //         invoke-virtual {p0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
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

    }
}
