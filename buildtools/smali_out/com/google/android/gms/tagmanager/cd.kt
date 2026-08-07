package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class cd: com.google.android.gms.tagmanager.aj() {
    public constructor(p0: String)

    public fun C(p0: java.util.Map): com.google.android.gms.internal.d.a { return TODO("body: (Ljava/util/Map;)Lcom/google/android/gms/internal/d$a;") }
    /*
    //         .locals 4
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
    //         const/4 v2, 0x0
    //         invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v3
    //         if-ne v0, v3, :cond_0
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->u(Ljava/lang/Object;)Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/cd;->apf:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         sget-object v1, Lcom/google/android/gms/tagmanager/cd;->aqb:Ljava/lang/String;
    //         invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/d$a;
    //         if-eqz v0, :cond_2
    //         if-nez v1, :cond_3
    //         :cond_2
    //         move v0, v2
    //         :goto_1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->u(Ljava/lang/Object;)Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/gms/tagmanager/cd;->a(Lcom/google/android/gms/internal/d$a;Lcom/google/android/gms/internal/d$a;Ljava/util/Map;)Z
    //         move-result v0
    //         goto :goto_1
    */

    protected fun a(p0: com.google.android.gms.internal.d.a, p1: com.google.android.gms.internal.d.a, p2: java.util.Map): Boolean

    public fun nN(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    companion object {
    private val apf: String = null!!
    private val aqb: String = null!!
    }
}
