package com.google.android.gms.internal

// Auto-emitted from smali.
// 23 fields, 4 methods.

class fw {
    public val uS: Int
    public val uT: Boolean
    public val uU: Boolean
    public val uV: String
    public val uW: String
    public val uX: Boolean
    public val uY: Boolean
    public val uZ: Boolean
    public val va: String
    public val vb: String
    public val vc: Int
    public val vd: Int
    public val ve: Int
    public val vf: Int
    public val vg: Int
    public val vh: Int
    public val vi: Float
    public val vj: Int
    public val vk: Int
    public val vl: Double
    public val vm: Boolean
    public val vn: Boolean
    public val vo: Int

    public constructor(p0: android.content.Context)

    companion object {
    private @JvmStatic fun a(p0: android.content.Context, p1: android.net.ConnectivityManager, p2: android.content.pm.PackageManager): Int { return TODO("body: (Landroid/content/Context;Landroid/net/ConnectivityManager;Landroid/content/pm/PackageManager;)I") }
    /*
    //         .locals 3
    //         const/4 v0, -0x2
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "android.permission.ACCESS_NETWORK_STATE"
    //         invoke-static {p2, v1, v2}, Lcom/google/android/gms/internal/gj;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    //         move-result v0
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    private @JvmStatic fun a(p0: android.content.pm.PackageManager, p1: String): android.content.pm.ResolveInfo { return TODO("body: (Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "android.intent.action.VIEW"
    //         invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    //         const/high16 v1, 0x10000
    //         invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun a(p0: android.content.pm.PackageManager): String { return TODO("body: (Landroid/content/pm/PackageManager;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const-string v1, "market://details?id=com.google.android.gms.ads"
    //         invoke-static {p0, v1}, Lcom/google/android/gms/internal/fw;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         iget-object v2, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
    //         const/4 v3, 0x0
    //         invoke-virtual {p0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    }
}
