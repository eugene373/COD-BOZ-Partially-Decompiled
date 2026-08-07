package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class d: com.google.android.gms.tagmanager.DataLayer.b {
    private val lB: android.content.Context

    public constructor(p0: android.content.Context)

    public fun D(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "gtm.url"
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-nez v1, :cond_2
    //         const-string v0, "gtm"
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         instance-of v2, v0, Ljava/util/Map;
    //         if-eqz v2, :cond_2
    //         check-cast v0, Ljava/util/Map;
    //         const-string v1, "url"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         if-eqz v0, :cond_0
    //         instance-of v1, v0, Ljava/lang/String;
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         const-string v1, "referrer"
    //         invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/d;->lB:Landroid/content/Context;
    //         invoke-static {v1, v0}, Lcom/google/android/gms/tagmanager/ay;->f(Landroid/content/Context;Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    */

}
