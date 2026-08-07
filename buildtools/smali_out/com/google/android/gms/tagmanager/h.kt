package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class h: com.google.android.gms.tagmanager.aj() {
    private val mContext: android.content.Context

    public constructor(p0: android.content.Context)

    public fun C(p0: java.util.Map): com.google.android.gms.internal.d.a { return TODO("body: (Ljava/util/Map;)Lcom/google/android/gms/internal/d$a;") }
    /*
    //         .locals 3
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
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/h;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/h;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v0
    //         iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->u(Ljava/lang/Object;)Lcom/google/android/gms/internal/d$a;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Package name "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/h;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " not found. "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun nN(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    companion object {
    private val ID: String = null!!
    }
}
