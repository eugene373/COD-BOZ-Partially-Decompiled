package com.google.android.gms.fitness

// Auto-emitted from smali.
// 0 fields, 2 methods.

class a {
    companion object {
    public @JvmStatic fun bq(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "https://www.googleapis.com/auth/fitness.activity.read"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string p0, "https://www.googleapis.com/auth/fitness.activity.write"
    //         :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         const-string v0, "https://www.googleapis.com/auth/fitness.location.read"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string p0, "https://www.googleapis.com/auth/fitness.location.write"
    //         goto :goto_0
    //         :cond_2
    //         const-string v0, "https://www.googleapis.com/auth/fitness.body.read"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string p0, "https://www.googleapis.com/auth/fitness.body.write"
    //         goto :goto_0
    */

    public @JvmStatic fun d(p0: java.util.List): Array<String> { return TODO("body: (Ljava/util/List;)[Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)[",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V
    //         invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Lcom/google/android/gms/fitness/a;->bq(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-nez v4, :cond_1
    //         invoke-interface {p0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         :cond_1
    //         invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_2
    //         invoke-interface {v1}, Ljava/util/Set;->size()I
    //         move-result v0
    //         new-array v0, v0, [Ljava/lang/String;
    //         invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/String;
    //         return-object v0
    */

    }
}
