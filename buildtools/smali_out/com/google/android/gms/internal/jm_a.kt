package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class jm_a: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val ML: java.util.ArrayList
    val className: String
    val versionCode: Int

    constructor(p0: Int, p1: String, p2: java.util.ArrayList)

    constructor(p0: String, p1: java.util.HashMap)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jm$a;->CREATOR:Lcom/google/android/gms/internal/jo;
    //         const/4 v0, 0x0
    //         return v0
    */

    fun hw(): java.util.HashMap { return TODO("body: ()Ljava/util/HashMap;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm$a;->ML:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm$a;->ML:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/jm$b;
    //         iget-object v4, v0, Lcom/google/android/gms/internal/jm$b;->fv:Ljava/lang/String;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/jm$b;->MM:Lcom/google/android/gms/internal/ji$a;
    //         invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jm$a;->CREATOR:Lcom/google/android/gms/internal/jo;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jo;->a(Lcom/google/android/gms/internal/jm$a;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.jo = null!!

    private @JvmStatic fun a(p0: java.util.HashMap): java.util.ArrayList { return TODO("body: (Ljava/util/HashMap;)Ljava/util/ArrayList;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;)",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/jm$b;",
    //                 ">;"
    //             }
    //         .end annotation
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         new-instance v4, Lcom/google/android/gms/internal/jm$b;
    //         invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/ji$a;
    //         invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/jm$b;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ji$a;)V
    //         invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_1
    //         move-object v0, v2
    //         goto :goto_0
    */

    }
}
