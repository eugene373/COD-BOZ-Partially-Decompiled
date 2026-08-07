package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class gk: java.util.concurrent.Future {
    private val mw: Object
    private var pS: Boolean
    private var wq: Object
    private var wr: Boolean

    public constructor()

    public fun a(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)V"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->wr:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v2, "Provided CallbackFuture with multiple values."
    //         invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         :try_start_1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gk;->wr:Z
    //         iput-object p1, p0, Lcom/google/android/gms/internal/gk;->wq:Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    public fun cancel(mayInterruptIfRunning: Boolean): Boolean { return TODO("body: (Z)Z") }
    /*
    //         .locals 4
    //         .local p0, "this":Lcom/google/android/gms/internal/gk;, "Lcom/google/android/gms/internal/gk<TT;>;"
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         if-nez p1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-boolean v3, p0, Lcom/google/android/gms/internal/gk;->wr:Z
    //         if-eqz v3, :cond_1
    //         monitor-exit v2
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x1
    //         :try_start_1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gk;->pS:Z
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gk;->wr:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move v0, v1
    //         goto :goto_0
    */

    public fun get(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->wr:Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-nez v0, :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :cond_0
    //         :goto_0
    //         :try_start_2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->pS:Z
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/util/concurrent/CancellationException;
    //         const-string v2, "CallbackFuture was cancelled."
    //         invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gk;->wq:Ljava/lang/Object;
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun get(timeout: Long, unit: java.util.concurrent.TimeUnit): Object { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/util/concurrent/TimeoutException;
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/gk;, "Lcom/google/android/gms/internal/gk<TT;>;"
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->wr:Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-nez v0, :cond_0
    //         :try_start_1
    //         invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v2
    //         const-wide/16 v4, 0x0
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :cond_0
    //         :goto_0
    //         :try_start_2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->wr:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/util/concurrent/TimeoutException;
    //         const-string v2, "CallbackFuture timed out."
    //         invoke-direct {v0, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_3
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->pS:Z
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/util/concurrent/CancellationException;
    //         const-string v2, "CallbackFuture was cancelled."
    //         invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gk;->wq:Ljava/lang/Object;
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun isCancelled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->pS:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isDone(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gk;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gk;->wr:Z
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
