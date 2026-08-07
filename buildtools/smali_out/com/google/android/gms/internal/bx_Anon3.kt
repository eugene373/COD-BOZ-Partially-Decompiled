package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

class bx_Anon3: com.google.android.gms.internal.by {
    constructor()

    public fun a(p0: com.google.android.gms.internal.gv, p1: java.util.Map) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/util/Map;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/gv;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "u"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, "URL missing from click GMSG."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v1
    //         :try_start_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->dw()Lcom/google/android/gms/internal/k;
    //         move-result-object v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/k;->b(Landroid/net/Uri;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v3
    //         invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/k;->a(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/internal/l; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_1
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/gq;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v3
    //         iget-object v3, v3, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/internal/gq;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gq;->start()V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unable to append parameter to URL: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_1
    */

}
