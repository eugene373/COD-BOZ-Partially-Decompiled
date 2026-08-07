package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 5 fields, 4 methods.

open class ch: com.google.android.gms.tagmanager.aj() {
    public constructor()

    public fun C(p0: java.util.Map): com.google.android.gms.internal.d.a { return TODO("body: (Ljava/util/Map;)Lcom/google/android/gms/internal/d$a;") }
    /*
    //         .locals 5
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
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ch;->aqn:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         sget-object v1, Lcom/google/android/gms/tagmanager/ch;->aqo:Ljava/lang/String;
    //         invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/d$a;
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v2
    //         if-eq v0, v2, :cond_0
    //         if-eqz v1, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v2
    //         if-ne v1, v2, :cond_1
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/16 v3, 0x40
    //         sget-object v2, Lcom/google/android/gms/tagmanager/ch;->aqp:Ljava/lang/String;
    //         invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/di;->n(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         const/16 v2, 0x42
    //         move v3, v2
    //         :cond_2
    //         const/4 v4, 0x1
    //         sget-object v2, Lcom/google/android/gms/tagmanager/ch;->aqq:Ljava/lang/String;
    //         invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/google/android/gms/internal/d$a;
    //         if-eqz v2, :cond_4
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/di;->l(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pF()Ljava/lang/Long;
    //         move-result-object v4
    //         if-ne v2, v4, :cond_3
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {v2}, Ljava/lang/Long;->intValue()I
    //         move-result v2
    //         if-gez v2, :cond_5
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_4
    //         move v2, v4
    //         :cond_5
    //         :try_start_0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v0, 0x0
    //         invoke-static {v1, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
    //         move-result v3
    //         if-eqz v3, :cond_6
    //         invoke-virtual {v1}, Ljava/util/regex/Matcher;->groupCount()I
    //         move-result v3
    //         if-lt v3, v2, :cond_6
    //         invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_6
    //         if-nez v0, :cond_7
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_7
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->u(Ljava/lang/Object;)Lcom/google/android/gms/internal/d$a;
    //         :try_end_0
    //         .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pK()Lcom/google/android/gms/internal/d$a;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun nN(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    companion object {
    private val ID: String = null!!
    private val aqn: String = null!!
    private val aqo: String = null!!
    private val aqp: String = null!!
    private val aqq: String = null!!
    }
}
