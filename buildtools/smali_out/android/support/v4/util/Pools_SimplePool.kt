package android.support.v4.util

// Auto-emitted from smali source: Pools.java.
// 2 fields, 4 methods.

open class Pools_SimplePool: android.support.v4.util.Pools.Pool {
    private val mPool: Array<Object>
    private var mPoolSize: Int

    public constructor(maxPoolSize: Int)

    private fun isInPool(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/Pools$SimplePool;, "Landroid/support/v4/util/Pools$SimplePool<TT;>;"
    //         .local p1, "instance":Ljava/lang/Object;, "TT;"
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         iget v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         if-ge v0, v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
    //         aget-object v1, v1, v0
    //         if-ne v1, p1, :cond_0
    //         const/4 v1, 0x1
    //         :goto_1
    //         return v1
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_1
    */

    public fun acquire(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/Pools$SimplePool;, "Landroid/support/v4/util/Pools$SimplePool<TT;>;"
    //         const/4 v2, 0x0
    //         iget v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         if-lez v3, :cond_0
    //         iget v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         add-int/lit8 v1, v3, -0x1
    //         .local v1, "lastPooledIndex":I
    //         iget-object v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
    //         aget-object v0, v3, v1
    //         .local v0, "instance":Ljava/lang/Object;, "TT;"
    //         iget-object v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
    //         aput-object v2, v3, v1
    //         iget v2, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         add-int/lit8 v2, v2, -0x1
    //         iput v2, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         .end local v0    # "instance":Ljava/lang/Object;, "TT;"
    //         .end local v1    # "lastPooledIndex":I
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         move-object v0, v2
    //         goto :goto_0
    */

    public fun release(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/Pools$SimplePool;, "Landroid/support/v4/util/Pools$SimplePool<TT;>;"
    //         .local p1, "instance":Ljava/lang/Object;, "TT;"
    //         invoke-direct {p0, p1}, Landroid/support/v4/util/Pools$SimplePool;->isInPool(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Already in the pool!"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         iget-object v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
    //         array-length v1, v1
    //         if-ge v0, v1, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
    //         iget v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         aput-object p1, v0, v1
    //         iget v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
