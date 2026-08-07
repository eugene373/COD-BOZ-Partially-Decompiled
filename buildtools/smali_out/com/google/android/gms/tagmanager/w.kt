package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class w: com.google.android.gms.tagmanager.dg() {
    private val aod: com.google.android.gms.tagmanager.DataLayer

    public constructor(p0: com.google.android.gms.tagmanager.DataLayer)

    private fun a(p0: com.google.android.gms.internal.d.a) { /* TODO(body): (Lcom/google/android/gms/internal/d$a;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pE()Ljava/lang/Object;
    //         move-result-object v0
    //         if-ne p1, v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-static {p1}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pJ()Ljava/lang/String;
    //         move-result-object v1
    //         if-eq v0, v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/w;->aod:Lcom/google/android/gms/tagmanager/DataLayer;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->cv(Ljava/lang/String;)V
    //         goto :goto_0
    */

    private fun b(p0: com.google.android.gms.internal.d.a) { /* TODO(body): (Lcom/google/android/gms/internal/d$a;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pE()Ljava/lang/Object;
    //         move-result-object v0
    //         if-ne p1, v0, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         invoke-static {p1}, Lcom/google/android/gms/tagmanager/di;->o(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v1, v0, Ljava/util/List;
    //         if-eqz v1, :cond_0
    //         check-cast v0, Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_2
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v2, v0, Ljava/util/Map;
    //         if-eqz v2, :cond_2
    //         check-cast v0, Ljava/util/Map;
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/w;->aod:Lcom/google/android/gms/tagmanager/DataLayer;
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/util/Map;)V
    //         goto :goto_0
    */

    public fun E(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/d$a;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/tagmanager/w;->VALUE:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/w;->b(Lcom/google/android/gms/internal/d$a;)V
    //         sget-object v0, Lcom/google/android/gms/tagmanager/w;->apa:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/w;->a(Lcom/google/android/gms/internal/d$a;)V
    //         return-void
    */

    companion object {
    private val ID: String = null!!
    private val VALUE: String = null!!
    private val apa: String = null!!
    }
}
