package com.google.android.gms.games.internal.events

// Auto-emitted from smali.
// 5 fields, 6 methods.

open class EventIncrementCache {
    val aaq: Object
    private var aar: android.os.Handler
    private var aas: Boolean
    private var aat: java.util.HashMap
    private var aau: Int

    public constructor(looper: android.os.Looper, flushIntervalMillis: Int)

    private fun kQ() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aaq:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aas:Z
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->flush()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun flush() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aaq:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aat:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
    //         move-result v0
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->q(Ljava/lang/String;I)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aat:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    protected fun q(p0: String, p1: Int)

    public fun w(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 6
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aaq:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aas:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aas:Z
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aar:Landroid/os/Handler;
    //         new-instance v2, Lcom/google/android/gms/games/internal/events/EventIncrementCache$1;
    //         invoke-direct {v2, p0}, Lcom/google/android/gms/games/internal/events/EventIncrementCache$1;-><init>(Lcom/google/android/gms/games/internal/events/EventIncrementCache;)V
    //         iget v3, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aau:I
    //         int-to-long v4, v3
    //         invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aat:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;
    //         invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->aat:Ljava/util/HashMap;
    //         invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.games.internal.events.EventIncrementCache) { /* TODO(body): (Lcom/google/android/gms/games/internal/events/EventIncrementCache;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->kQ()V
    //         return-void
    */

    }
}
