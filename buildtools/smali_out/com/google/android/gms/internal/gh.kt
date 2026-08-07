package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

class gh {
    companion object {
    public @JvmStatic fun a(p0: android.content.Context, p1: Boolean) { /* TODO(body): (Landroid/content/Context;Z)V */ }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/gh;->n(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         const-string v1, "use_https"
    //         invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    //         return-void
    */

    private @JvmStatic fun n(p0: android.content.Context): android.content.SharedPreferences { return TODO("body: (Landroid/content/Context;)Landroid/content/SharedPreferences;") }
    /*
    //         .locals 2
    //         const-string v0, "admob"
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun o(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/internal/gh;->n(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         const-string v1, "use_https"
    //         const/4 v2, 0x1
    //         invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         return v0
    */

    }
}
