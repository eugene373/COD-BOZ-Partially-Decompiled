package com.google.android.gms.internal

// Auto-emitted from smali.
// 8 fields, 9 methods.

open class ja {
    private val Mj: java.util.LinkedHashMap
    private var Mk: Int
    private var Ml: Int
    private var Mm: Int
    private var Mn: Int
    private var Mo: Int
    private var Mp: Int
    private var size: Int

    public constructor(p0: Int)

    private fun c(p0: Object, p1: Object): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)I") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;TV;)I"
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ja;->sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v0
    //         if-gez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Negative size: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
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
    //         .local p0, "this":Lcom/google/android/gms/internal/ja;, "Lcom/google/android/gms/internal/ja<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         const/4 v0, 0x0
    //         return-object v0
    */

    protected fun entryRemoved(evicted: Boolean, p1: Object, p2: Object, p3: Object) { /* TODO(body): (ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Lcom/google/android/gms/internal/ja;, "Lcom/google/android/gms/internal/ja<TK;TV;>;"
    //         .local p2, "key":Ljava/lang/Object;, "TK;"
    //         .local p3, "oldValue":Ljava/lang/Object;, "TV;"
    //         .local p4, "newValue":Ljava/lang/Object;, "TV;"
    //         return-void
    */

    public fun evictAll() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, -0x1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ja;->trimToSize(I)V
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
    //         .local p0, "this":Lcom/google/android/gms/internal/ja;, "Lcom/google/android/gms/internal/ja<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         const-string v1, "key == null"
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         monitor-enter p0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget v1, p0, Lcom/google/android/gms/internal/ja;->Mo:I
    //         add-int/lit8 v1, v1, 0x1
    //         iput v1, p0, Lcom/google/android/gms/internal/ja;->Mo:I
    //         monitor-exit p0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->Mp:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/ja;->Mp:I
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ja;->create(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-nez v1, :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_2
    //         monitor-enter p0
    //         :try_start_2
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->Mm:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/ja;->Mm:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v0, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v2, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :goto_1
    //         monitor-exit p0
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         if-eqz v0, :cond_4
    //         const/4 v2, 0x0
    //         invoke-virtual {p0, v2, p1, v1, v0}, Lcom/google/android/gms/internal/ja;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_3
    //         :try_start_3
    //         iget v2, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/ja;->c(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v3
    //         add-int/2addr v2, v3
    //         iput v2, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         goto :goto_1
    //         :catchall_1
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         throw v0
    //         :cond_4
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->Mk:I
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ja;->trimToSize(I)V
    //         move-object v0, v1
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
    //         .local p0, "this":Lcom/google/android/gms/internal/ja;, "Lcom/google/android/gms/internal/ja<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         .local p2, "value":Ljava/lang/Object;, "TV;"
    //         if-eqz p1, :cond_0
    //         if-nez p2, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         const-string v1, "key == null || value == null"
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         monitor-enter p0
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->Ml:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/ja;->Ml:I
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ja;->c(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         iput v0, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         iget v1, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ja;->c(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v2
    //         sub-int/2addr v1, v2
    //         iput v1, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         :cond_2
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_3
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v1, p1, v0, p2}, Lcom/google/android/gms/internal/ja;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //         :cond_3
    //         iget v1, p0, Lcom/google/android/gms/internal/ja;->Mk:I
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ja;->trimToSize(I)V
    //         return-object v0
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
    //         .local p0, "this":Lcom/google/android/gms/internal/ja;, "Lcom/google/android/gms/internal/ja<TK;TV;>;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         .local p2, "value":Ljava/lang/Object;, "TV;"
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun trimToSize(maxSize: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         .local p0, "this":Lcom/google/android/gms/internal/ja;, "Lcom/google/android/gms/internal/ja<TK;TV;>;"
    //         :goto_0
    //         monitor-enter p0
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         if-ltz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ".sizeOf() is reporting inconsistent results!"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         iget v0, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         if-le v0, p1, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :cond_2
    //         monitor-exit p0
    //         return-void
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ja;->Mj:Ljava/util/LinkedHashMap;
    //         invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ja;->c(Ljava/lang/Object;Ljava/lang/Object;)I
    //         move-result v3
    //         sub-int/2addr v2, v3
    //         iput v2, p0, Lcom/google/android/gms/internal/ja;->size:I
    //         iget v2, p0, Lcom/google/android/gms/internal/ja;->Mn:I
    //         add-int/lit8 v2, v2, 0x1
    //         iput v2, p0, Lcom/google/android/gms/internal/ja;->Mn:I
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         invoke-virtual {p0, v2, v1, v0, v3}, Lcom/google/android/gms/internal/ja;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //         goto :goto_0
    */

}
