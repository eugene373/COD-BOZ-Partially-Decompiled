package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class j: com.google.android.gms.internal.i() {
    protected constructor(p0: android.content.Context, p1: com.google.android.gms.internal.m, p2: com.google.android.gms.internal.n)

    protected fun b(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 4
    //         invoke-super {p0, p1}, Lcom/google/android/gms/internal/i;->b(Landroid/content/Context;)V
    //         :try_start_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/j;->h(Landroid/content/Context;)Lcom/google/android/gms/internal/j$a;
    //         move-result-object v2
    //         const/16 v3, 0x1c
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/j$a;->isLimitAdTrackingEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-wide/16 v0, 0x1
    //         :goto_0
    //         invoke-virtual {p0, v3, v0, v1}, Lcom/google/android/gms/internal/j;->a(IJ)V
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/j$a;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const/16 v1, 0x1a
    //         const-wide/16 v2, 0x5
    //         invoke-virtual {p0, v1, v2, v3}, Lcom/google/android/gms/internal/j;->a(IJ)V
    //         const/16 v1, 0x18
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/j;->a(ILjava/lang/String;)V
    //         :try_end_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Lcom/google/android/gms/internal/i$a; {:try_start_0 .. :try_end_0} :catch_2
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const-wide/16 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/16 v0, 0x18
    //         :try_start_1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/j;->d(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/j;->a(ILjava/lang/String;)V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catch Lcom/google/android/gms/internal/i$a; {:try_start_1 .. :try_end_1} :catch_2
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         goto :goto_1
    //         :catch_2
    //         move-exception v0
    //         goto :goto_1
    */

    fun h(p0: android.content.Context): com.google.android.gms.internal.j.a { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/internal/j$a;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         const/16 v7, 0x10
    //         :try_start_0
    //         invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;
    //         move-result-object v2
    //         if-eqz v2, :cond_3
    //         const-string v1, "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"
    //         invoke-virtual {v2, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         new-array v4, v7, [B
    //         move v1, v0
    //         :goto_0
    //         invoke-virtual {v2}, Ljava/lang/String;->length()I
    //         move-result v5
    //         if-ge v0, v5, :cond_2
    //         const/16 v5, 0x8
    //         if-eq v0, v5, :cond_0
    //         const/16 v5, 0xd
    //         if-eq v0, v5, :cond_0
    //         const/16 v5, 0x12
    //         if-eq v0, v5, :cond_0
    //         const/16 v5, 0x17
    //         if-ne v0, v5, :cond_1
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         :cond_1
    //         invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C
    //         move-result v5
    //         invoke-static {v5, v7}, Ljava/lang/Character;->digit(CI)I
    //         move-result v5
    //         shl-int/lit8 v5, v5, 0x4
    //         add-int/lit8 v6, v0, 0x1
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C
    //         move-result v6
    //         invoke-static {v6, v7}, Ljava/lang/Character;->digit(CI)I
    //         move-result v6
    //         add-int/2addr v5, v6
    //         int-to-byte v5, v5
    //         aput-byte v5, v4, v1
    //         add-int/lit8 v1, v1, 0x1
    //         add-int/lit8 v0, v0, 0x2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/j;->ky:Lcom/google/android/gms/internal/m;
    //         const/4 v1, 0x1
    //         invoke-interface {v0, v4, v1}, Lcom/google/android/gms/internal/m;->a([BZ)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         new-instance v1, Lcom/google/android/gms/internal/j$a;
    //         invoke-virtual {v3}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z
    //         move-result v2
    //         invoke-direct {v1, p0, v0, v2}, Lcom/google/android/gms/internal/j$a;-><init>(Lcom/google/android/gms/internal/j;Ljava/lang/String;Z)V
    //         return-object v1
    //         :cond_3
    //         move-object v0, v2
    //         goto :goto_1
    */

    companion object {
    public @JvmStatic fun a(p0: String, p1: android.content.Context): com.google.android.gms.internal.j { return TODO("body: (Ljava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/internal/j;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/internal/e;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/e;-><init>()V
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/j;->a(Ljava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/m;)V
    //         new-instance v1, Lcom/google/android/gms/internal/j;
    //         new-instance v2, Lcom/google/android/gms/internal/p;
    //         const/16 v3, 0xef
    //         invoke-direct {v2, v3}, Lcom/google/android/gms/internal/p;-><init>(I)V
    //         invoke-direct {v1, p1, v0, v2}, Lcom/google/android/gms/internal/j;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/m;Lcom/google/android/gms/internal/n;)V
    //         return-object v1
    */

    }
}
