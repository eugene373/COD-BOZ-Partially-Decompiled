package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 15 methods.

open class jm: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val MI: java.util.HashMap
    private val MJ: java.util.ArrayList
    private val MK: String

    constructor(p0: Int, p1: java.util.ArrayList, p2: String)

    public constructor(p0: Class)

    public fun a(p0: Class, p1: java.util.HashMap) { /* TODO(body): (Ljava/lang/Class;Ljava/util/HashMap;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<+",
    //                 "Lcom/google/android/gms/internal/ji;",
    //                 ">;",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun b(p0: Class): Boolean { return TODO("body: (Ljava/lang/Class;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<+",
    //                 "Lcom/google/android/gms/internal/ji;",
    //                 ">;)Z"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun be(p0: String): java.util.HashMap { return TODO("body: (Ljava/lang/String;)Ljava/util/HashMap;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/HashMap;
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jm;->CREATOR:Lcom/google/android/gms/internal/jn;
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/jm;->BR:I
    //         return v0
    */

    public fun hs() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/ji$a;
    //         invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ji$a;->a(Lcom/google/android/gms/internal/jm;)V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    public fun ht() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/HashMap;
    //         new-instance v5, Ljava/util/HashMap;
    //         invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
    //         invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v6
    //         :goto_1
    //         invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Lcom/google/android/gms/internal/ji$a;
    //         invoke-virtual {v3}, Lcom/google/android/gms/internal/ji$a;->hi()Lcom/google/android/gms/internal/ji$a;
    //         move-result-object v3
    //         invoke-virtual {v5, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_1
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v1, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    fun hu(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/jm$a;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         new-instance v4, Lcom/google/android/gms/internal/jm$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/HashMap;
    //         invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/jm$a;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V
    //         invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public fun hv(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MK:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 7
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v4, ":\n"
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/jm;->MI:Ljava/util/HashMap;
    //         invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v5, "  "
    //         invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v6, ": "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jm;->CREATOR:Lcom/google/android/gms/internal/jn;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jn;->a(Lcom/google/android/gms/internal/jm;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.jn = null!!

    private @JvmStatic fun c(p0: java.util.ArrayList): java.util.HashMap { return TODO("body: (Ljava/util/ArrayList;)Ljava/util/HashMap;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/jm$a;",
    //                 ">;)",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/HashMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/ji$a",
    //                 "<**>;>;>;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/jm$a;
    //         iget-object v4, v0, Lcom/google/android/gms/internal/jm$a;->className:Ljava/lang/String;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/jm$a;->hw()Ljava/util/HashMap;
    //         move-result-object v0
    //         invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    }
}
