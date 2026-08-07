package com.google.android.gms.common.data

// Auto-emitted from smali.
// 0 fields, 4 methods.

class FreezableUtils {
    public constructor()

    companion object {
    public @JvmStatic fun freeze(p0: java.util.ArrayList): java.util.ArrayList { return TODO("body: (Ljava/util/ArrayList;)Ljava/util/ArrayList;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 "E::",
    //                 "Lcom/google/android/gms/common/data/Freezable",
    //                 "<TT;>;>(",
    //                 "Ljava/util/ArrayList",
    //                 "<TE;>;)",
    //                 "Ljava/util/ArrayList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         .local p0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<TE;>;"
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/data/Freezable;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/data/Freezable;->freeze()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public @JvmStatic fun freeze(p0: Array<com.google.android.gms.common.data.Freezable>): java.util.ArrayList { return TODO("body: ([Lcom/google/android/gms/common/data/Freezable;)Ljava/util/ArrayList;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 "E::",
    //                 "Lcom/google/android/gms/common/data/Freezable",
    //                 "<TT;>;>([TE;)",
    //                 "Ljava/util/ArrayList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         .local p0, "array":[Lcom/google/android/gms/common/data/Freezable;, "[TE;"
    //         new-instance v1, Ljava/util/ArrayList;
    //         array-length v0, p0
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         array-length v2, p0
    //         if-ge v0, v2, :cond_0
    //         aget-object v2, p0, v0
    //         invoke-interface {v2}, Lcom/google/android/gms/common/data/Freezable;->freeze()Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public @JvmStatic fun freezeIterable(p0: Iterable): java.util.ArrayList { return TODO("body: (Ljava/lang/Iterable;)Ljava/util/ArrayList;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 "E::",
    //                 "Lcom/google/android/gms/common/data/Freezable",
    //                 "<TT;>;>(",
    //                 "Ljava/lang/Iterable",
    //                 "<TE;>;)",
    //                 "Ljava/util/ArrayList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         .local p0, "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<TE;>;"
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/data/Freezable;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/data/Freezable;->freeze()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    }
}
