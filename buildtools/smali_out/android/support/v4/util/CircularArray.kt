package android.support.v4.util

// Auto-emitted from smali source: CircularArray.java.
// 4 fields, 12 methods.

open class CircularArray {
    private var mCapacityBitmask: Int
    private var mElements: Array<Object>
    private var mHead: Int
    private var mTail: Int

    public constructor()

    public constructor(minCapacity: Int)

    private fun doubleCapacity() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         const/4 v6, 0x0
    //         iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         array-length v1, v4
    //         .local v1, "n":I
    //         iget v4, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         sub-int v3, v1, v4
    //         .local v3, "r":I
    //         shl-int/lit8 v2, v1, 0x1
    //         .local v2, "newCapacity":I
    //         if-gez v2, :cond_0
    //         new-instance v4, Ljava/lang/RuntimeException;
    //         const-string v5, "Too big"
    //         invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v4
    //         :cond_0
    //         new-array v0, v2, [Ljava/lang/Object;
    //         .local v0, "a":[Ljava/lang/Object;
    //         iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v5, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         invoke-static {v4, v5, v0, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v5, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         invoke-static {v4, v6, v0, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         check-cast v0, [Ljava/lang/Object;
    //         .end local v0    # "a":[Ljava/lang/Object;
    //         iput-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iput v6, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iput v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         add-int/lit8 v4, v2, -0x1
    //         iput v4, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         return-void
    */

    public fun addFirst(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TE;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         .local p1, "e":Ljava/lang/Object;, "TE;"
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         add-int/lit8 v0, v0, -0x1
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         and-int/2addr v0, v1
    //         iput v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         aput-object p1, v0, v1
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         if-ne v0, v1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/CircularArray;->doubleCapacity()V
    //         :cond_0
    //         return-void
    */

    public fun addLast(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TE;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         .local p1, "e":Ljava/lang/Object;, "TE;"
    //         iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         aput-object p1, v0, v1
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         add-int/lit8 v0, v0, 0x1
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         and-int/2addr v0, v1
    //         iput v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         if-ne v0, v1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/CircularArray;->doubleCapacity()V
    //         :cond_0
    //         return-void
    */

    public fun get(i: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         if-ltz p1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/util/CircularArray;->size()I
    //         move-result v1
    //         if-lt p1, v1, :cond_1
    //         :cond_0
    //         new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;
    //         invoke-direct {v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
    //         throw v1
    //         :cond_1
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         add-int/2addr v1, p1
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         and-int v0, v1, v2
    //         .local v0, "p":I
    //         iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         aget-object v1, v1, v0
    //         return-object v1
    */

    public fun getFirst(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TE;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;
    //         invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         aget-object v0, v0, v1
    //         return-object v0
    */

    public fun getLast(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TE;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;
    //         invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         add-int/lit8 v1, v1, -0x1
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         and-int/2addr v1, v2
    //         aget-object v0, v0, v1
    //         return-object v0
    */

    public fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun popFirst(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TE;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         if-ne v1, v2, :cond_0
    //         new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;
    //         invoke-direct {v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
    //         throw v1
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         aget-object v0, v1, v2
    //         .local v0, "result":Ljava/lang/Object;, "TE;"
    //         iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         const/4 v3, 0x0
    //         aput-object v3, v1, v2
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         add-int/lit8 v1, v1, 0x1
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         and-int/2addr v1, v2
    //         iput v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         return-object v0
    */

    public fun popLast(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TE;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         iget v3, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         if-ne v2, v3, :cond_0
    //         new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;
    //         invoke-direct {v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
    //         throw v2
    //         :cond_0
    //         iget v2, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         add-int/lit8 v2, v2, -0x1
    //         iget v3, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         and-int v1, v2, v3
    //         .local v1, "t":I
    //         iget-object v2, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         aget-object v0, v2, v1
    //         .local v0, "result":Ljava/lang/Object;, "TE;"
    //         iget-object v2, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object v3, v2, v1
    //         iput v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         return-object v0
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
    //         iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
    //         sub-int/2addr v0, v1
    //         iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
    //         and-int/2addr v0, v1
    //         return v0
    */

}
