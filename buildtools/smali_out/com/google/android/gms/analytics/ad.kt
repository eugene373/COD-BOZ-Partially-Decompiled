package com.google.android.gms.analytics

// Auto-emitted from smali.
// 3 fields, 7 methods.

open class ad: com.google.android.gms.analytics.l {
    private val mContext: android.content.Context

    protected constructor(p0: android.content.Context)

    public fun ac(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "&sr"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    protected fun eR(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ad;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "x"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getValue(field: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v1, "&sr"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/ad;->eR()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    companion object {
    private var Bi: com.google.android.gms.analytics.ad
    private var xz: Object

    public @JvmStatic fun eQ(): com.google.android.gms.analytics.ad { return TODO("body: ()Lcom/google/android/gms/analytics/ad;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/google/android/gms/analytics/ad;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/ad;->Bi:Lcom/google/android/gms/analytics/ad;
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
    //         sget-object v1, Lcom/google/android/gms/analytics/ad;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/ad;->Bi:Lcom/google/android/gms/analytics/ad;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/ad;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/ad;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/analytics/ad;->Bi:Lcom/google/android/gms/analytics/ad;
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
