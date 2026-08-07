package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 16 methods.

open class pj {
    private var awN: Boolean
    private var awO: IntArray
    private var awP: Array<com.google.android.gms.internal.pk>
    private var mSize: Int

    public constructor()

    public constructor(p0: Int)

    private fun a(p0: IntArray, p1: IntArray, p2: Int): Boolean { return TODO("body: ([I[II)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, p3, :cond_1
    //         aget v2, p1, v1
    //         aget v3, p2, v1
    //         if-eq v2, v3, :cond_0
    //         :goto_1
    //         return v0
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_1
    */

    private fun a(p0: Array<com.google.android.gms.internal.pk>, p1: Array<com.google.android.gms.internal.pk>, p2: Int): Boolean { return TODO("body: ([Lcom/google/android/gms/internal/pk;[Lcom/google/android/gms/internal/pk;I)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, p3, :cond_1
    //         aget-object v2, p1, v1
    //         aget-object v3, p2, v1
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/pk;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :goto_1
    //         return v0
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_1
    */

    private fun gG(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget v0, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         add-int/lit8 v0, v0, -0x1
    //         :goto_0
    //         if-gt v1, v0, :cond_2
    //         add-int v2, v1, v0
    //         ushr-int/lit8 v2, v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         aget v3, v3, v2
    //         if-ge v3, p1, :cond_0
    //         add-int/lit8 v1, v2, 0x1
    //         goto :goto_0
    //         :cond_0
    //         if-le v3, p1, :cond_1
    //         add-int/lit8 v0, v2, -0x1
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         :goto_1
    //         return v0
    //         :cond_2
    //         xor-int/lit8 v0, v1, -0x1
    //         goto :goto_1
    */

    private fun gc() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         const/4 v2, 0x0
    //         iget v3, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         iget-object v4, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         iget-object v5, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         move v1, v2
    //         move v0, v2
    //         :goto_0
    //         if-ge v1, v3, :cond_2
    //         aget-object v6, v5, v1
    //         sget-object v7, Lcom/google/android/gms/internal/pj;->awM:Lcom/google/android/gms/internal/pk;
    //         if-eq v6, v7, :cond_1
    //         if-eq v1, v0, :cond_0
    //         aget v7, v4, v1
    //         aput v7, v4, v0
    //         aput-object v6, v5, v0
    //         const/4 v6, 0x0
    //         aput-object v6, v5, v1
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         :cond_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_2
    //         iput-boolean v2, p0, Lcom/google/android/gms/internal/pj;->awN:Z
    //         iput v0, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         return-void
    */

    private fun idealByteArraySize(need: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         const/4 v0, 0x4
    //         :goto_0
    //         const/16 v1, 0x20
    //         if-ge v0, v1, :cond_0
    //         shl-int v1, v2, v0
    //         add-int/lit8 v1, v1, -0xc
    //         if-gt p1, v1, :cond_1
    //         shl-int v0, v2, v0
    //         add-int/lit8 p1, v0, -0xc
    //         .end local p1    # "need":I
    //         :cond_0
    //         return p1
    //         .restart local p1    # "need":I
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    private fun idealIntArraySize(need: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         mul-int/lit8 v0, p1, 0x4
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pj;->idealByteArraySize(I)I
    //         move-result v0
    //         div-int/lit8 v0, v0, 0x4
    //         return v0
    */

    public fun a(p0: Int, p1: com.google.android.gms.internal.pk) { /* TODO(body): (ILcom/google/android/gms/internal/pk;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pj;->gG(I)I
    //         move-result v0
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aput-object p2, v1, v0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         xor-int/lit8 v0, v0, -0x1
    //         iget v1, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         if-ge v0, v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aget-object v1, v1, v0
    //         sget-object v2, Lcom/google/android/gms/internal/pj;->awM:Lcom/google/android/gms/internal/pk;
    //         if-ne v1, v2, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         aput p1, v1, v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aput-object p2, v1, v0
    //         goto :goto_0
    //         :cond_1
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/pj;->awN:Z
    //         if-eqz v1, :cond_2
    //         iget v1, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         array-length v2, v2
    //         if-lt v1, v2, :cond_2
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/pj;->gc()V
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pj;->gG(I)I
    //         move-result v0
    //         xor-int/lit8 v0, v0, -0x1
    //         :cond_2
    //         iget v1, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         array-length v2, v2
    //         if-lt v1, v2, :cond_3
    //         iget v1, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         add-int/lit8 v1, v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/pj;->idealIntArraySize(I)I
    //         move-result v1
    //         new-array v2, v1, [I
    //         new-array v1, v1, [Lcom/google/android/gms/internal/pk;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         iget-object v4, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         array-length v4, v4
    //         invoke-static {v3, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v3, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         array-length v4, v4
    //         invoke-static {v3, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         iput-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         :cond_3
    //         iget v1, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         sub-int/2addr v1, v0
    //         if-eqz v1, :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         add-int/lit8 v3, v0, 0x1
    //         iget v4, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         sub-int/2addr v4, v0
    //         invoke-static {v1, v0, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         add-int/lit8 v3, v0, 0x1
    //         iget v4, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         sub-int/2addr v4, v0
    //         invoke-static {v1, v0, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         aput p1, v1, v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aput-object p2, v1, v0
    //         iget v0, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         goto :goto_0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p1, p0, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/internal/pj;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/internal/pj;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/pj;->size()I
    //         move-result v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pj;->size()I
    //         move-result v3
    //         if-eq v2, v3, :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         iget-object v3, p1, Lcom/google/android/gms/internal/pj;->awO:[I
    //         iget v4, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         invoke-direct {p0, v2, v3, v4}, Lcom/google/android/gms/internal/pj;->a([I[II)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         iget-object v3, p1, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         iget v4, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         invoke-direct {p0, v2, v3, v4}, Lcom/google/android/gms/internal/pj;->a([Lcom/google/android/gms/internal/pk;[Lcom/google/android/gms/internal/pk;I)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_4
    //         move v0, v1
    //         goto :goto_0
    */

    public fun gE(p0: Int): com.google.android.gms.internal.pk { return TODO("body: (I)Lcom/google/android/gms/internal/pk;") }
    /*
    //         .locals 3
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pj;->gG(I)I
    //         move-result v0
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aget-object v1, v1, v0
    //         sget-object v2, Lcom/google/android/gms/internal/pj;->awM:Lcom/google/android/gms/internal/pk;
    //         if-ne v1, v2, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aget-object v0, v1, v0
    //         goto :goto_0
    */

    public fun gF(p0: Int): com.google.android.gms.internal.pk { return TODO("body: (I)Lcom/google/android/gms/internal/pk;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pj;->awN:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/pj;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aget-object v0, v0, p1
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pj;->awN:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/pj;->gc()V
    //         :cond_0
    //         const/16 v1, 0x11
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget v2, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         if-ge v0, v2, :cond_1
    //         mul-int/lit8 v1, v1, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awO:[I
    //         aget v2, v2, v0
    //         add-int/2addr v1, v2
    //         mul-int/lit8 v1, v1, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pj;->awP:[Lcom/google/android/gms/internal/pk;
    //         aget-object v2, v2, v0
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/pk;->hashCode()I
    //         move-result v2
    //         add-int/2addr v1, v2
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return v1
    */

    public fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/pj;->size()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pj;->awN:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/pj;->gc()V
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/internal/pj;->mSize:I
    //         return v0
    */

    companion object {
    private val awM: com.google.android.gms.internal.pk = null!!
    }
}
