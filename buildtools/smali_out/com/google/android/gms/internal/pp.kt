package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 5 methods.

class pp {
    val awV: ByteArray
    val tag: Int

    constructor(p0: Int, p1: ByteArray)

    fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget v0, p0, Lcom/google/android/gms/internal/pp;->tag:I
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pp;->awV:[B
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pg;->t([B)V
    //         return-void
    */

    fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget v1, p0, Lcom/google/android/gms/internal/pp;->tag:I
    //         invoke-static {v1}, Lcom/google/android/gms/internal/pg;->gB(I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pp;->awV:[B
    //         array-length v1, v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p1, p0, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/internal/pp;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/internal/pp;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/internal/pp;->tag:I
    //         iget v3, p1, Lcom/google/android/gms/internal/pp;->tag:I
    //         if-ne v2, v3, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pp;->awV:[B
    //         iget-object v3, p1, Lcom/google/android/gms/internal/pp;->awV:[B
    //         invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/internal/pp;->tag:I
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pp;->awV:[B
    //         invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

}
