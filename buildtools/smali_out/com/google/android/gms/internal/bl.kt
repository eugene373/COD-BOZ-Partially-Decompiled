package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 8 methods.

open class bl {
    private val mContext: android.content.Context

    public constructor(p0: android.content.Context)

    public fun a(p0: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const-string v1, "Intent can not be null"
    //         invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bl;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/List;->isEmpty()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

    public fun bj(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "android.intent.action.DIAL"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v1, "tel:"
    //         invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bl;->a(Landroid/content/Intent;)Z
    //         move-result v0
    //         return v0
    */

    public fun bk(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "android.intent.action.VIEW"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v1, "sms:"
    //         invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bl;->a(Landroid/content/Intent;)Z
    //         move-result v0
    //         return v0
    */

    public fun bl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/google/android/gms/internal/bl;->bn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bl;->mContext:Landroid/content/Context;
    //         const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun bm(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun bo(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "android.intent.action.INSERT"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v1, "vnd.android.cursor.dir/event"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0xe
    //         if-lt v1, v2, :cond_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bl;->a(Landroid/content/Intent;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    public @JvmStatic fun bn(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const-string v0, "mounted"
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    }
}
