package com.google.android.gms.games.internal.events

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class EventIncrementManager {
    private val aaw: java.util.concurrent.atomic.AtomicReference

    public constructor()

    public fun flush() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->aaw:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->flush()V
    //         :cond_0
    //         return-void
    */

    protected fun ky(): com.google.android.gms.games.internal.events.EventIncrementCache

    public fun n(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->aaw:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->ky()Lcom/google/android/gms/games/internal/events/EventIncrementCache;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->aaw:Ljava/util/concurrent/atomic/AtomicReference;
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->aaw:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/internal/events/EventIncrementCache;
    //         :cond_0
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->w(Ljava/lang/String;I)V
    //         return-void
    */

}
