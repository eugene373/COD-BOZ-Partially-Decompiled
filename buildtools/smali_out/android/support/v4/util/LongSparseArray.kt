package android.support.v4.util

// Auto-emitted from smali source: LongSparseArray.java.
// 5 fields, 21 methods.

open class LongSparseArray: Cloneable {
    private var mGarbage: Boolean
    private var mKeys: LongArray
    private var mSize: Int
    private var mValues: Array<Object>

    public constructor()

    public constructor(initialCapacity: Int)

    private fun gc() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         .local v2, "n":I
    //         const/4 v3, 0x0
    //         .local v3, "o":I
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         .local v1, "keys":[J
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         .local v5, "values":[Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         if-ge v0, v2, :cond_2
    //         aget-object v4, v5, v0
    //         .local v4, "val":Ljava/lang/Object;
    //         sget-object v6, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
    //         if-eq v4, v6, :cond_1
    //         if-eq v0, v3, :cond_0
    //         aget-wide v6, v1, v0
    //         aput-wide v6, v1, v3
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
    //         iput-boolean v6, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         iput v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         return-void
    */

    public fun append(key: Long, p1: Object) { /* TODO(body): (JLjava/lang/Object;)V */ }
    /*
    //         .locals 7
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         .local p3, "value":Ljava/lang/Object;, "TE;"
    //         const/4 v6, 0x0
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         add-int/lit8 v5, v5, -0x1
    //         aget-wide v4, v4, v5
    //         cmp-long v4, p1, v4
    //         if-gtz v4, :cond_0
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v4, :cond_1
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         array-length v5, v5
    //         if-lt v4, v5, :cond_1
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         :cond_1
    //         iget v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         .local v3, "pos":I
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         array-length v4, v4
    //         if-lt v3, v4, :cond_2
    //         add-int/lit8 v4, v3, 0x1
    //         invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I
    //         move-result v0
    //         .local v0, "n":I
    //         new-array v1, v0, [J
    //         .local v1, "nkeys":[J
    //         new-array v2, v0, [Ljava/lang/Object;
    //         .local v2, "nvalues":[Ljava/lang/Object;
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         array-length v5, v5
    //         invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         array-length v5, v5
    //         invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iput-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         .end local v0    # "n":I
    //         .end local v1    # "nkeys":[J
    //         .end local v2    # "nvalues":[Ljava/lang/Object;
    //         :cond_2
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         aput-wide p1, v4, v3
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aput-object p3, v4, v3
    //         add-int/lit8 v4, v3, 0x1
    //         iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         goto :goto_0
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         const/4 v4, 0x0
    //         iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         .local v1, "n":I
    //         iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
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
    //         iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         iput-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         return-void
    */

    public fun clone(): android.support.v4.util.LongSparseArray { return TODO("body: ()Landroid/support/v4/util/LongSparseArray;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Landroid/support/v4/util/LongSparseArray",
    //                 "<TE;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         const/4 v1, 0x0
    //         .local v1, "clone":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         :try_start_0
    //         invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    //         move-result-object v2
    //         move-object v0, v2
    //         check-cast v0, Landroid/support/v4/util/LongSparseArray;
    //         move-object v1, v0
    //         iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         invoke-virtual {v2}, [J->clone()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, [J
    //         iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, [Ljava/lang/Object;
    //         iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
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
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         invoke-virtual {p0}, Landroid/support/v4/util/LongSparseArray;->clone()Landroid/support/v4/util/LongSparseArray;
    //         move-result-object v0
    //         return-object v0
    */

    public fun delete(key: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         invoke-static {v1, v2, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
    //         move-result v0
    //         .local v0, "i":I
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aget-object v1, v1, v0
    //         sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
    //         if-eq v1, v2, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
    //         aput-object v2, v1, v0
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         :cond_0
    //         return-void
    */

    public fun get(key: Long): Object { return TODO("body: (J)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun get(key: Long, p1: Object): Object { return TODO("body: (JLjava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         .local p3, "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         invoke-static {v1, v2, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
    //         move-result v0
    //         .local v0, "i":I
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aget-object v1, v1, v0
    //         sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
    //         if-ne v1, v2, :cond_1
    //         .end local p3    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
    //         :cond_0
    //         :goto_0
    //         return-object p3
    //         .restart local p3    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aget-object p3, v1, v0
    //         goto :goto_0
    */

    public fun indexOfKey(key: Long): Int { return TODO("body: (J)I") }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         invoke-static {v0, v1, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
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
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         .local p1, "value":Ljava/lang/Object;, "TE;"
    //         iget-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         if-ge v0, v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
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

    public fun keyAt(index: Int): Long { return TODO("body: (I)J") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         aget-wide v0, v0, p1
    //         return-wide v0
    */

    public fun put(key: Long, p1: Object) { /* TODO(body): (JLjava/lang/Object;)V */ }
    /*
    //         .locals 9
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         .local p3, "value":Ljava/lang/Object;, "TE;"
    //         const/4 v6, 0x0
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         invoke-static {v4, v5, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
    //         move-result v0
    //         .local v0, "i":I
    //         if-ltz v0, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aput-object p3, v4, v0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         xor-int/lit8 v0, v0, -0x1
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         if-ge v0, v4, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aget-object v4, v4, v0
    //         sget-object v5, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
    //         if-ne v4, v5, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         aput-wide p1, v4, v0
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aput-object p3, v4, v0
    //         goto :goto_0
    //         :cond_1
    //         iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v4, :cond_2
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         array-length v5, v5
    //         if-lt v4, v5, :cond_2
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         invoke-static {v4, v5, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
    //         move-result v4
    //         xor-int/lit8 v0, v4, -0x1
    //         :cond_2
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         array-length v5, v5
    //         if-lt v4, v5, :cond_3
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         add-int/lit8 v4, v4, 0x1
    //         invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I
    //         move-result v1
    //         .local v1, "n":I
    //         new-array v2, v1, [J
    //         .local v2, "nkeys":[J
    //         new-array v3, v1, [Ljava/lang/Object;
    //         .local v3, "nvalues":[Ljava/lang/Object;
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         array-length v5, v5
    //         invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         array-length v5, v5
    //         invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iput-object v3, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         .end local v1    # "n":I
    //         .end local v2    # "nkeys":[J
    //         .end local v3    # "nvalues":[Ljava/lang/Object;
    //         :cond_3
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         sub-int/2addr v4, v0
    //         if-eqz v4, :cond_4
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         add-int/lit8 v6, v0, 0x1
    //         iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         sub-int/2addr v7, v0
    //         invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         add-int/lit8 v6, v0, 0x1
    //         iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         sub-int/2addr v7, v0
    //         invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_4
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
    //         aput-wide p1, v4, v0
    //         iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aput-object p3, v4, v0
    //         iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         add-int/lit8 v4, v4, 0x1
    //         iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         goto/16 :goto_0
    */

    public fun remove(key: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->delete(J)V
    //         return-void
    */

    public fun removeAt(index: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aget-object v0, v0, p1
    //         sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
    //         aput-object v1, v0, p1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         :cond_0
    //         return-void
    */

    public fun setValueAt(index: Int, p1: Object) { /* TODO(body): (ILjava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         .local p2, "value":Ljava/lang/Object;, "TE;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aput-object p2, v0, p1
    //         return-void
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         invoke-virtual {p0}, Landroid/support/v4/util/LongSparseArray;->size()I
    //         move-result v5
    //         if-gtz v5, :cond_0
    //         const-string v5, "{}"
    //         :goto_0
    //         return-object v5
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         mul-int/lit8 v5, v5, 0x1c
    //         invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v0, "buffer":Ljava/lang/StringBuilder;
    //         const/16 v5, 0x7b
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_1
    //         iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
    //         if-ge v1, v5, :cond_3
    //         if-lez v1, :cond_1
    //         const-string v5, ", "
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         invoke-virtual {p0, v1}, Landroid/support/v4/util/LongSparseArray;->keyAt(I)J
    //         move-result-wide v2
    //         .local v2, "key":J
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         const/16 v5, 0x3d
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0, v1}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;
    //         move-result-object v4
    //         .local v4, "value":Ljava/lang/Object;
    //         if-eq v4, p0, :cond_2
    //         invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         :goto_2
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_2
    //         const-string v5, "(this Map)"
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_2
    //         .end local v2    # "key":J
    //         .end local v4    # "value":Ljava/lang/Object;
    //         :cond_3
    //         const/16 v5, 0x7d
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         goto :goto_0
    */

    public fun valueAt(index: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    //         aget-object v0, v0, p1
    //         return-object v0
    */

    companion object {
    private val DELETED: Object = null!!
    }
}
