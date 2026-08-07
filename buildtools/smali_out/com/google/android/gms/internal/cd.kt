package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

class cd: com.google.android.gms.internal.by {
    private val pL: com.google.android.gms.internal.bz
    private val pM: com.google.android.gms.internal.v

    public constructor(p0: com.google.android.gms.internal.bz, p1: com.google.android.gms.internal.v)

    public fun a(p0: com.google.android.gms.internal.gv, p1: java.util.Map) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/util/Map;)V */ }
    /*
    //         .locals 9
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
    //         const-string v0, "a"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         const-string v0, "Action missing from an open GMSG."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cd;->pM:Lcom/google/android/gms/internal/v;
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cd;->pM:Lcom/google/android/gms/internal/v;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/v;->av()Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cd;->pM:Lcom/google/android/gms/internal/v;
    //         const-string v0, "u"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/v;->d(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v8
    //         const-string v1, "expand"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->dy()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "Cannot expand WebView that is already expanded."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_3
    //         invoke-static {p2}, Lcom/google/android/gms/internal/cd;->b(Ljava/util/Map;)Z
    //         move-result v0
    //         invoke-static {p2}, Lcom/google/android/gms/internal/cd;->c(Ljava/util/Map;)I
    //         move-result v1
    //         invoke-virtual {v8, v0, v1}, Lcom/google/android/gms/internal/gw;->a(ZI)V
    //         goto :goto_0
    //         :cond_4
    //         const-string v1, "webapp"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_6
    //         const-string v0, "u"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-eqz v0, :cond_5
    //         invoke-static {p2}, Lcom/google/android/gms/internal/cd;->b(Ljava/util/Map;)Z
    //         move-result v1
    //         invoke-static {p2}, Lcom/google/android/gms/internal/cd;->c(Ljava/util/Map;)I
    //         move-result v2
    //         invoke-virtual {v8, v1, v2, v0}, Lcom/google/android/gms/internal/gw;->a(ZILjava/lang/String;)V
    //         goto :goto_0
    //         :cond_5
    //         invoke-static {p2}, Lcom/google/android/gms/internal/cd;->b(Ljava/util/Map;)Z
    //         move-result v2
    //         invoke-static {p2}, Lcom/google/android/gms/internal/cd;->c(Ljava/util/Map;)I
    //         move-result v3
    //         const-string v0, "html"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v1, "baseurl"
    //         invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v8, v2, v3, v0, v1}, Lcom/google/android/gms/internal/gw;->a(ZILjava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_6
    //         const-string v1, "in_app_purchase"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         const-string v0, "product_id"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v1, "report_urls"
    //         invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cd;->pL:Lcom/google/android/gms/internal/bz;
    //         if-eqz v2, :cond_0
    //         if-eqz v1, :cond_7
    //         invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z
    //         move-result v2
    //         if-nez v2, :cond_7
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cd;->pL:Lcom/google/android/gms/internal/bz;
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-interface {v2, v0, v3}, Lcom/google/android/gms/internal/bz;->a(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :cond_7
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cd;->pL:Lcom/google/android/gms/internal/bz;
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/bz;->a(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :cond_8
    //         new-instance v0, Lcom/google/android/gms/internal/dj;
    //         const-string v1, "i"
    //         invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v2, "u"
    //         invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         const-string v3, "m"
    //         invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         const-string v4, "p"
    //         invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v4
    //         check-cast v4, Ljava/lang/String;
    //         const-string v5, "c"
    //         invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v5
    //         check-cast v5, Ljava/lang/String;
    //         const-string v6, "f"
    //         invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, Ljava/lang/String;
    //         const-string v7, "e"
    //         invoke-interface {p2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v7
    //         check-cast v7, Ljava/lang/String;
    //         invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/dj;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/dj;)V
    //         goto/16 :goto_0
    */

    companion object {
    private @JvmStatic fun b(p0: java.util.Map): Boolean { return TODO("body: (Ljava/util/Map;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)Z"
    //             }
    //         .end annotation
    //         const-string v0, "1"
    //         const-string v1, "custom_close"
    //         invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun c(p0: java.util.Map): Int { return TODO("body: (Ljava/util/Map;)I") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)I"
    //             }
    //         .end annotation
    //         const-string v0, "o"
    //         invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         const-string v1, "p"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/gj;->dm()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v1, "l"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-static {}, Lcom/google/android/gms/internal/gj;->dl()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    }
}
