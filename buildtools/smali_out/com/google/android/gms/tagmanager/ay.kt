package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 8 methods.

open class ay {
    constructor()

    companion object {
    private var apy: String
    var apz: java.util.Map

    @JvmStatic fun cF(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const-class v1, Lcom/google/android/gms/tagmanager/ay;
    //         monitor-enter v1
    //         :try_start_0
    //         sput-object p0, Lcom/google/android/gms/tagmanager/ay;->apy:Ljava/lang/String;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    @JvmStatic fun d(p0: android.content.Context, p1: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "gtm_install_referrer"
    //         const-string v1, "referrer"
    //         invoke-static {p0, v0, v1, p1}, Lcom/google/android/gms/tagmanager/cz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {p0, p1}, Lcom/google/android/gms/tagmanager/ay;->f(Landroid/content/Context;Ljava/lang/String;)V
    //         return-void
    */

    @JvmStatic fun e(p0: android.content.Context, p1: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ay;->apy:Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         const-class v1, Lcom/google/android/gms/tagmanager/ay;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ay;->apy:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, "gtm_install_referrer"
    //         const/4 v2, 0x0
    //         invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         const-string v2, "referrer"
    //         const-string v3, ""
    //         invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         sput-object v0, Lcom/google/android/gms/tagmanager/ay;->apy:Ljava/lang/String;
    //         :cond_0
    //         :goto_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ay;->apy:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/ay;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_2
    //         :try_start_1
    //         const-string v0, ""
    //         sput-object v0, Lcom/google/android/gms/tagmanager/ay;->apy:Ljava/lang/String;
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    @JvmStatic fun f(p0: android.content.Context, p1: String, p2: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ay;->apz:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, "gtm_click_referrers"
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         const-string v1, ""
    //         invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         sget-object v1, Lcom/google/android/gms/tagmanager/ay;->apz:Ljava/util/Map;
    //         invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         invoke-static {v0, p2}, Lcom/google/android/gms/tagmanager/ay;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         const-string v0, ""
    //         goto :goto_0
    */

    @JvmStatic fun f(p0: android.content.Context, p1: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "conv"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/tagmanager/ay;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-lez v1, :cond_0
    //         sget-object v1, Lcom/google/android/gms/tagmanager/ay;->apz:Ljava/util/Map;
    //         invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v1, "gtm_click_referrers"
    //         invoke-static {p0, v1, v0, p1}, Lcom/google/android/gms/tagmanager/cz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    @JvmStatic fun x(p0: String, p1: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_1
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         const/4 p0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "http://hostname/?"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object p0
    //         goto :goto_0
    */

    }
}
