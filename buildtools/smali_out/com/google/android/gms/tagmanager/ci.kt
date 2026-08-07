package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class ci: com.google.android.gms.tagmanager.dd() {
    public constructor()

    protected fun a(p0: String, p1: String, p2: java.util.Map): Boolean { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/d$a;",
    //                 ">;)Z"
    //             }
    //         .end annotation
    //         const/16 v1, 0x40
    //         sget-object v0, Lcom/google/android/gms/tagmanager/ci;->aqp:Ljava/lang/String;
    //         invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->n(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/16 v0, 0x42
    //         :goto_0
    //         :try_start_0
    //         invoke-static {p2, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
    //         :try_end_0
    //         .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_1
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    companion object {
    private val ID: String = null!!
    private val aqp: String = null!!
    }
}
