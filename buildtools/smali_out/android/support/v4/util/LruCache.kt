package android.support.v4.util

// Auto-emitted from smali source: LruCache.java.
// 8 fields, 11 methods.

open class LruCache {
    private var createCount: Int
    private var evictionCount: Int
    private var hitCount: Int
    private val map: java.util.LinkedHashMap
    private var maxSize: Int
    private var missCount: Int
    private var putCount: Int
    private var size: Int

    public constructor(maxSize: Int)

    private fun safeSizeOf(p0: Object, p1: Object): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)I") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;TV;)I"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         .local p2, "value":Ljava/lang/Object;, "TV;"
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/LruCache;->sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v0
    //         .local v0, "result":I
    //         if-gez v0, :cond_0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Negative size: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         return v0
    */

    protected fun create(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;)TV;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         const/4 v0, 0x0
    //         return-object v0
    */

    protected fun entryRemoved(evicted: Boolean, p1: Object, p2: Object, p3: Object) { /* TODO(body): (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         .local p2, "key":Ljava/lang/Object;, "TK;"
    //         .local p3, "oldValue":Ljava/lang/Object;, "TV;"
    //         .local p4, "newValue":Ljava/lang/Object;, "TV;"
    //         return-void
    */

    public fun evictAll() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         const/4 v0, -0x1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/util/LruCache;->trimToSize(I)V
    //         return-void
    */

    public fun get(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;)TV;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         if-nez p1, :cond_0
    //         new-instance v2, Ljava/lang/NullPointerException;
    //         const-string v3, "key == null"
    //         invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_0
    //         monitor-enter p0
    //         :try_start_0
    //         iget-object v2, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "mapValue":Ljava/lang/Object;, "TV;"
    //         if-eqz v1, :cond_1
    //         iget v2, p0, Landroid/support/v4/util/LruCache;->hitCount:I
    //         add-int/lit8 v2, v2, 0x1
    //         iput v2, p0, Landroid/support/v4/util/LruCache;->hitCount:I
    //         monitor-exit p0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget v2, p0, Landroid/support/v4/util/LruCache;->missCount:I
    //         add-int/lit8 v2, v2, 0x1
    //         iput v2, p0, Landroid/support/v4/util/LruCache;->missCount:I
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/util/LruCache;->create(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "createdValue":Ljava/lang/Object;, "TV;"
    //         if-nez v0, :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         .end local v0    # "createdValue":Ljava/lang/Object;, "TV;"
    //         .end local v1    # "mapValue":Ljava/lang/Object;, "TV;"
    //         :catchall_0
    //         move-exception v2
    //         :try_start_1
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v2
    //         .restart local v0    # "createdValue":Ljava/lang/Object;, "TV;"
    //         .restart local v1    # "mapValue":Ljava/lang/Object;, "TV;"
    //         :cond_2
    //         monitor-enter p0
    //         :try_start_2
    //         iget v2, p0, Landroid/support/v4/util/LruCache;->createCount:I
    //         add-int/lit8 v2, v2, 0x1
    //         iput v2, p0, Landroid/support/v4/util/LruCache;->createCount:I
    //         iget-object v2, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v2, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-eqz v1, :cond_3
    //         iget-object v2, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v2, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :goto_1
    //         monitor-exit p0
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         if-eqz v1, :cond_4
    //         const/4 v2, 0x0
    //         invoke-virtual {p0, v2, p1, v0, v1}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_3
    //         :try_start_3
    //         iget v2, p0, Landroid/support/v4/util/LruCache;->size:I
    //         invoke-direct {p0, p1, v0}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v3
    //         add-int/2addr v2, v3
    //         iput v2, p0, Landroid/support/v4/util/LruCache;->size:I
    //         goto :goto_1
    //         :catchall_1
    //         move-exception v2
    //         monitor-exit p0
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         throw v2
    //         :cond_4
    //         iget v2, p0, Landroid/support/v4/util/LruCache;->maxSize:I
    //         invoke-virtual {p0, v2}, Landroid/support/v4/util/LruCache;->trimToSize(I)V
    //         goto :goto_0
    */

    public fun put(p0: Object, p1: Object): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;TV;)TV;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         .local p2, "value":Ljava/lang/Object;, "TV;"
    //         if-eqz p1, :cond_0
    //         if-nez p2, :cond_1
    //         :cond_0
    //         new-instance v1, Ljava/lang/NullPointerException;
    //         const-string v2, "key == null || value == null"
    //         invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_1
    //         monitor-enter p0
    //         :try_start_0
    //         iget v1, p0, Landroid/support/v4/util/LruCache;->putCount:I
    //         add-int/lit8 v1, v1, 0x1
    //         iput v1, p0, Landroid/support/v4/util/LruCache;->putCount:I
    //         iget v1, p0, Landroid/support/v4/util/LruCache;->size:I
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v2
    //         add-int/2addr v1, v2
    //         iput v1, p0, Landroid/support/v4/util/LruCache;->size:I
    //         iget-object v1, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v1, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "previous":Ljava/lang/Object;, "TV;"
    //         if-eqz v0, :cond_2
    //         iget v1, p0, Landroid/support/v4/util/LruCache;->size:I
    //         invoke-direct {p0, p1, v0}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v2
    //         sub-int/2addr v1, v2
    //         iput v1, p0, Landroid/support/v4/util/LruCache;->size:I
    //         :cond_2
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_3
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v1, p1, v0, p2}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //         :cond_3
    //         iget v1, p0, Landroid/support/v4/util/LruCache;->maxSize:I
    //         invoke-virtual {p0, v1}, Landroid/support/v4/util/LruCache;->trimToSize(I)V
    //         return-object v0
    //         .end local v0    # "previous":Ljava/lang/Object;, "TV;"
    //         :catchall_0
    //         move-exception v1
    //         :try_start_1
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v1
    */

    public fun remove(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;)TV;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         if-nez p1, :cond_0
    //         new-instance v1, Ljava/lang/NullPointerException;
    //         const-string v2, "key == null"
    //         invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         monitor-enter p0
    //         :try_start_0
    //         iget-object v1, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "previous":Ljava/lang/Object;, "TV;"
    //         if-eqz v0, :cond_1
    //         iget v1, p0, Landroid/support/v4/util/LruCache;->size:I
    //         invoke-direct {p0, p1, v0}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v2
    //         sub-int/2addr v1, v2
    //         iput v1, p0, Landroid/support/v4/util/LruCache;->size:I
    //         :cond_1
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_2
    //         const/4 v1, 0x0
    //         const/4 v2, 0x0
    //         invoke-virtual {p0, v1, p1, v0, v2}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //         :cond_2
    //         return-object v0
    //         .end local v0    # "previous":Ljava/lang/Object;, "TV;"
    //         :catchall_0
    //         move-exception v1
    //         :try_start_1
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v1
    */

    public fun resize(maxSize: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         if-gtz p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "maxSize <= 0"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         monitor-enter p0
    //         :try_start_0
    //         iput p1, p0, Landroid/support/v4/util/LruCache;->maxSize:I
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/util/LruCache;->trimToSize(I)V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    protected fun sizeOf(p0: Object, p1: Object): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;TV;)I"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         .local p2, "value":Ljava/lang/Object;, "TV;"
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun trimToSize(maxSize: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 6
    //         .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
    //         :goto_0
    //         monitor-enter p0
    //         :try_start_0
    //         iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
    //         if-ltz v3, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v3}, Ljava/util/LinkedHashMap;->isEmpty()Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
    //         if-eqz v3, :cond_1
    //         :cond_0
    //         new-instance v3, Ljava/lang/IllegalStateException;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ".sizeOf() is reporting inconsistent results!"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v3
    //         :catchall_0
    //         move-exception v3
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v3
    //         :cond_1
    //         :try_start_1
    //         iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
    //         if-le v3, p1, :cond_2
    //         iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v3}, Ljava/util/LinkedHashMap;->isEmpty()Z
    //         move-result v3
    //         if-eqz v3, :cond_3
    //         :cond_2
    //         monitor-exit p0
    //         return-void
    //         :cond_3
    //         iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v3
    //         invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/Map$Entry;
    //         .local v1, "toEvict":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    //         invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "key":Ljava/lang/Object;, "TK;"
    //         invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v2
    //         .local v2, "value":Ljava/lang/Object;, "TV;"
    //         iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
    //         invoke-direct {p0, v0, v2}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v4
    //         sub-int/2addr v3, v4
    //         iput v3, p0, Landroid/support/v4/util/LruCache;->size:I
    //         iget v3, p0, Landroid/support/v4/util/LruCache;->evictionCount:I
    //         add-int/lit8 v3, v3, 0x1
    //         iput v3, p0, Landroid/support/v4/util/LruCache;->evictionCount:I
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         invoke-virtual {p0, v3, v0, v2, v4}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //         goto :goto_0
    */

}
