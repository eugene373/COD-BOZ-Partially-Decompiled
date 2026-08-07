package android.support.v4.util

// Auto-emitted from smali source: Pools.java.
// 1 fields, 3 methods.

open class Pools_SynchronizedPool: android.support.v4.util.Pools.SimplePool() {
    private val mLock: Object

    public constructor(maxPoolSize: Int)

    public fun acquire(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/Pools$SynchronizedPool;, "Landroid/support/v4/util/Pools$SynchronizedPool<TT;>;"
    //         iget-object v1, p0, Landroid/support/v4/util/Pools$SynchronizedPool;->mLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-super {p0}, Landroid/support/v4/util/Pools$SimplePool;->acquire()Ljava/lang/Object;
    //         move-result-object v0
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun release(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/Pools$SynchronizedPool;, "Landroid/support/v4/util/Pools$SynchronizedPool<TT;>;"
    //         .local p1, "element":Ljava/lang/Object;, "TT;"
    //         iget-object v1, p0, Landroid/support/v4/util/Pools$SynchronizedPool;->mLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-super {p0, p1}, Landroid/support/v4/util/Pools$SimplePool;->release(Ljava/lang/Object;)Z
    //         move-result v0
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
