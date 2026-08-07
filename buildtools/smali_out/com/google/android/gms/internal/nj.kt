package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 9 methods.

open class nj {
    private val akK: java.util.ArrayList
    private var akL: Int

    public constructor()

    public constructor(p0: Int)

    private fun mX() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/nj;->getSize()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/nj;->getCapacity()I
    //         move-result v1
    //         if-le v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nj;->akK:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.nm, p1: com.google.android.gms.internal.ni) { /* TODO(body): (Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nj;->akK:Ljava/util/ArrayList;
    //         new-instance v1, Lcom/google/android/gms/internal/nj$a;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/nj$a;-><init>(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;Lcom/google/android/gms/internal/nj$1;)V
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/nj;->mX()V
    //         return-void
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nj;->akK:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    //         return-void
    */

    public fun getCapacity(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/nj;->akL:I
    //         return v0
    */

    public fun getSize(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nj;->akK:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         return v0
    */

    public fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nj;->akK:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         return v0
    */

    public fun mW(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/nj$a;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nj;->akK:Ljava/util/ArrayList;
    //         return-object v0
    */

}
