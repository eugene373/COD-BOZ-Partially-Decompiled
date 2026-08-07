package android.support.v4.util

// Auto-emitted from smali source: SparseArrayCompat.java.
// 5 fields, 22 methods.

open class SparseArrayCompat: Cloneable {
    private var mGarbage: Boolean
    private var mKeys: IntArray
    private var mSize: Int
    private var mValues: Array<Object>

    public constructor()

    public constructor(initialCapacity: Int)

    private fun gc() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         .local v2, "n":I
    //         const/4 v3, 0x0
    //         .local v3, "o":I
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         .local v1, "keys":[I
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         .local v5, "values":[Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         if-ge v0, v2, :cond_2
    //         aget-object v4, v5, v0
    //         .local v4, "val":Ljava/lang/Object;
    //         sget-object v6, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
    //         if-eq v4, v6, :cond_1
    //         if-eq v0, v3, :cond_0
    //         aget v6, v1, v0
    //         aput v6, v1, v3
    //         aput-object v4, v5, v3
    //         const/4 v6, 0x0
    //         aput-object v6, v5, v0
    //         :cond_0
    //         add-int/lit8 v3, v3, 0x1
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         .end local v4    # "val":Ljava/lang/Object;
    //         :cond_2
    //         const/4 v6, 0x0
    //         iput-boolean v6, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         iput v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         return-void
    */

    public fun append(key: Int, p1: Object) { /* TODO(body): (ILjava/lang/Object;)V */ }
    /*
    //         .locals 7
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         .local p2, "value":Ljava/lang/Object;, "TE;"
    //         const/4 v6, 0x0
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         add-int/lit8 v5, v5, -0x1
    //         aget v4, v4, v5
    //         if-gt p1, v4, :cond_0
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v4, :cond_1
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         array-length v5, v5
    //         if-lt v4, v5, :cond_1
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         :cond_1
    //         iget v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         .local v3, "pos":I
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         array-length v4, v4
    //         if-lt v3, v4, :cond_2
    //         add-int/lit8 v4, v3, 0x1
    //         invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I
    //         move-result v0
    //         .local v0, "n":I
    //         new-array v1, v0, [I
    //         .local v1, "nkeys":[I
    //         new-array v2, v0, [Ljava/lang/Object;
    //         .local v2, "nvalues":[Ljava/lang/Object;
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         array-length v5, v5
    //         invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         array-length v5, v5
    //         invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iput-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         .end local v0    # "n":I
    //         .end local v1    # "nkeys":[I
    //         .end local v2    # "nvalues":[Ljava/lang/Object;
    //         :cond_2
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         aput p1, v4, v3
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aput-object p2, v4, v3
    //         add-int/lit8 v4, v3, 0x1
    //         iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         goto :goto_0
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         const/4 v4, 0x0
    //         iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         .local v1, "n":I
    //         iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         .local v2, "values":[Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         if-ge v0, v1, :cond_0
    //         const/4 v3, 0x0
    //         aput-object v3, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         iput-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         return-void
    */

    public fun clone(): android.support.v4.util.SparseArrayCompat { return TODO("body: ()Landroid/support/v4/util/SparseArrayCompat;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Landroid/support/v4/util/SparseArrayCompat",
    //                 "<TE;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         const/4 v1, 0x0
    //         .local v1, "clone":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         :try_start_0
    //         invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    //         move-result-object v2
    //         move-object v0, v2
    //         check-cast v0, Landroid/support/v4/util/SparseArrayCompat;
    //         move-object v1, v0
    //         iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         invoke-virtual {v2}, [I->clone()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, [I
    //         iput-object v2, v1, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, [Ljava/lang/Object;
    //         iput-object v2, v1, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v1
    //         :catch_0
    //         move-exception v2
    //         goto :goto_0
    */

    public fun clone(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/CloneNotSupportedException;
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         invoke-virtual {p0}, Landroid/support/v4/util/SparseArrayCompat;->clone()Landroid/support/v4/util/SparseArrayCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun delete(key: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         invoke-static {v1, v2, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
    //         move-result v0
    //         .local v0, "i":I
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aget-object v1, v1, v0
    //         sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
    //         if-eq v1, v2, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
    //         aput-object v2, v1, v0
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         :cond_0
    //         return-void
    */

    public fun get(key: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun get(key: Int, p1: Object): Object { return TODO("body: (ILjava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         .local p2, "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         invoke-static {v1, v2, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
    //         move-result v0
    //         .local v0, "i":I
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aget-object v1, v1, v0
    //         sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
    //         if-ne v1, v2, :cond_1
    //         .end local p2    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
    //         :cond_0
    //         :goto_0
    //         return-object p2
    //         .restart local p2    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aget-object p2, v1, v0
    //         goto :goto_0
    */

    public fun indexOfKey(key: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         invoke-static {v0, v1, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
    //         move-result v0
    //         return v0
    */

    public fun indexOfValue(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TE;)I"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         .local p1, "value":Ljava/lang/Object;, "TE;"
    //         iget-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         if-ge v0, v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aget-object v1, v1, v0
    //         if-ne v1, p1, :cond_1
    //         .end local v0    # "i":I
    //         :goto_1
    //         return v0
    //         .restart local v0    # "i":I
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, -0x1
    //         goto :goto_1
    */

    public fun keyAt(index: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         aget v0, v0, p1
    //         return v0
    */

    public fun put(key: Int, p1: Object) { /* TODO(body): (ILjava/lang/Object;)V */ }
    /*
    //         .locals 8
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         .local p2, "value":Ljava/lang/Object;, "TE;"
    //         const/4 v6, 0x0
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         invoke-static {v4, v5, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
    //         move-result v0
    //         .local v0, "i":I
    //         if-ltz v0, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aput-object p2, v4, v0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         xor-int/lit8 v0, v0, -0x1
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         if-ge v0, v4, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aget-object v4, v4, v0
    //         sget-object v5, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
    //         if-ne v4, v5, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         aput p1, v4, v0
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aput-object p2, v4, v0
    //         goto :goto_0
    //         :cond_1
    //         iget-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v4, :cond_2
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         array-length v5, v5
    //         if-lt v4, v5, :cond_2
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         invoke-static {v4, v5, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
    //         move-result v4
    //         xor-int/lit8 v0, v4, -0x1
    //         :cond_2
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         array-length v5, v5
    //         if-lt v4, v5, :cond_3
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         add-int/lit8 v4, v4, 0x1
    //         invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I
    //         move-result v1
    //         .local v1, "n":I
    //         new-array v2, v1, [I
    //         .local v2, "nkeys":[I
    //         new-array v3, v1, [Ljava/lang/Object;
    //         .local v3, "nvalues":[Ljava/lang/Object;
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         array-length v5, v5
    //         invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         array-length v5, v5
    //         invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iput-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         .end local v1    # "n":I
    //         .end local v2    # "nkeys":[I
    //         .end local v3    # "nvalues":[Ljava/lang/Object;
    //         :cond_3
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         sub-int/2addr v4, v0
    //         if-eqz v4, :cond_4
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         add-int/lit8 v6, v0, 0x1
    //         iget v7, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         sub-int/2addr v7, v0
    //         invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         add-int/lit8 v6, v0, 0x1
    //         iget v7, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         sub-int/2addr v7, v0
    //         invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_4
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
    //         aput p1, v4, v0
    //         iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aput-object p2, v4, v0
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         add-int/lit8 v4, v4, 0x1
    //         iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         goto/16 :goto_0
    */

    public fun remove(key: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         invoke-virtual {p0, p1}, Landroid/support/v4/util/SparseArrayCompat;->delete(I)V
    //         return-void
    */

    public fun removeAt(index: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aget-object v0, v0, p1
    //         sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
    //         aput-object v1, v0, p1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         :cond_0
    //         return-void
    */

    public fun removeAtRange(index: Int, size: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 4
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         add-int v3, p1, p2
    //         invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I
    //         move-result v0
    //         .local v0, "end":I
    //         move v1, p1
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v0, :cond_0
    //         invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun setValueAt(index: Int, p1: Object) { /* TODO(body): (ILjava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         .local p2, "value":Ljava/lang/Object;, "TE;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aput-object p2, v0, p1
    //         return-void
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         invoke-virtual {p0}, Landroid/support/v4/util/SparseArrayCompat;->size()I
    //         move-result v4
    //         if-gtz v4, :cond_0
    //         const-string v4, "{}"
    //         :goto_0
    //         return-object v4
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         mul-int/lit8 v4, v4, 0x1c
    //         invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v0, "buffer":Ljava/lang/StringBuilder;
    //         const/16 v4, 0x7b
    //         invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_1
    //         iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
    //         if-ge v1, v4, :cond_3
    //         if-lez v1, :cond_1
    //         const-string v4, ", "
    //         invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->keyAt(I)I
    //         move-result v2
    //         .local v2, "key":I
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         const/16 v4, 0x3d
    //         invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
    //         move-result-object v3
    //         .local v3, "value":Ljava/lang/Object;
    //         if-eq v3, p0, :cond_2
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         :goto_2
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_2
    //         const-string v4, "(this Map)"
    //         invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_2
    //         .end local v2    # "key":I
    //         .end local v3    # "value":Ljava/lang/Object;
    //         :cond_3
    //         const/16 v4, 0x7d
    //         invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         goto :goto_0
    */

    public fun valueAt(index: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    //         aget-object v0, v0, p1
    //         return-object v0
    */

    companion object {
    private val DELETED: Object = null!!
    }
}
