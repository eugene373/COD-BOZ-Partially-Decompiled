package com.google.android.gms.internal

// Auto-emitted from smali.
// 10 fields, 10 methods.

class mj: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val afr: java.util.List
    private val afs: String
    private val aft: Boolean
    val afu: java.util.List
    val afv: java.util.List
    private val afw: java.util.Set
    private val afx: java.util.Set
    private val afy: java.util.Set

    constructor(p0: Int, p1: java.util.List, p2: String, p3: Boolean, p4: java.util.List, p5: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mj;->CREATOR:Lcom/google/android/gms/internal/mk;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(object: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "object":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "object":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/internal/mj;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/internal/mj;
    //         .end local p1    # "object":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afw:Ljava/util/Set;
    //         iget-object v3, p1, Lcom/google/android/gms/internal/mj;->afw:Ljava/util/Set;
    //         invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/mj;->aft:Z
    //         iget-boolean v3, p1, Lcom/google/android/gms/internal/mj;->aft:Z
    //         if-ne v2, v3, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afx:Ljava/util/Set;
    //         iget-object v3, p1, Lcom/google/android/gms/internal/mj;->afx:Ljava/util/Set;
    //         invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afy:Ljava/util/Set;
    //         iget-object v3, p1, Lcom/google/android/gms/internal/mj;->afy:Ljava/util/Set;
    //         invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afw:Ljava/util/Set;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/mj;->aft:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afx:Ljava/util/Set;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afy:Ljava/util/Set;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun mi(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mj;->afs:Ljava/lang/String;
    //         return-object v0
    */

    public fun mj(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/mj;->aft:Z
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "types"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afw:Ljava/util/Set;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "placeIds"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afy:Ljava/util/Set;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "requireOpenNow"
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/mj;->aft:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "requestedUserDataTypes"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afx:Ljava/util/Set;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mj;->CREATOR:Lcom/google/android/gms/internal/mk;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/mk;->a(Lcom/google/android/gms/internal/mj;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.mk = null!!

    private @JvmStatic fun f(p0: java.util.List): java.util.Set { return TODO("body: (Ljava/util/List;)Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<E:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/List",
    //                 "<TE;>;)",
    //                 "Ljava/util/Set",
    //                 "<TE;>;"
    //             }
    //         .end annotation
    //         invoke-interface {p0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/util/HashSet;
    //         invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
