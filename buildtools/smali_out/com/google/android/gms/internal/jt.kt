package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 5 methods.

class jt {
    companion object {
    private var MR: java.util.regex.Pattern

    public @JvmStatic fun K(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         const-string v1, "android.hardware.type.watch"
    //         invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun aN(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         div-int/lit16 v0, p0, 0x3e8
    //         return v0
    */

    public @JvmStatic fun aO(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         rem-int/lit16 v0, p0, 0x3e8
    //         div-int/lit8 v0, v0, 0x64
    //         return v0
    */

    public @JvmStatic fun aP(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/jt;->aO(I)I
    //         move-result v0
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
