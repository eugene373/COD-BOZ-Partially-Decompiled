package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class z: com.google.android.gms.tagmanager.aj() {
    private val mContext: android.content.Context

    public constructor(p0: android.content.Context)

    public fun C(p0: java.util.Map): com.google.android.gms.internal.d.a { return TODO("body: (Ljava/util/Map;)Lcom/google/android/gms/internal/d$a;") }
    /*
    //         .locals 1
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
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/z;->mContext:Landroid/content/Context;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/z;->Y(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->u(Ljava/lang/Object;)Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun Y(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         const-string v1, "android_id"
    //         invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
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
