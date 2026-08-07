package bolts

// Auto-emitted from smali source: Task.java.
// 9 fields, 40 methods.

open class Task {
    private var cancelled: Boolean
    private var complete: Boolean
    private var continuations: java.util.List
    private var error: Exception
    private val lock: Object
    private var result: Object

    private constructor()

    private fun runContinuations() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v4, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v4
    //         :try_start_0
    //         iget-object v3, p0, Lbolts/Task;->continuations:Ljava/util/List;
    //         invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         .local v2, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lbolts/Continuation;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         .local v0, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;*>;"
    //         :try_start_1
    //         invoke-interface {v0, p0}, Lbolts/Continuation;->then(Lbolts/Task;)Ljava/lang/Object;
    //         :try_end_1
    //         .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/RuntimeException;
    //         :try_start_2
    //         throw v1
    //         .end local v0    # "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;*>;"
    //         .end local v1    # "e":Ljava/lang/RuntimeException;
    //         .end local v2    # "i$":Ljava/util/Iterator;
    //         :catchall_0
    //         move-exception v3
    //         monitor-exit v4
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v3
    //         .restart local v0    # "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;*>;"
    //         .restart local v2    # "i$":Ljava/util/Iterator;
    //         :catch_1
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         :try_start_3
    //         new-instance v3, Ljava/lang/RuntimeException;
    //         invoke-direct {v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v3
    //         .end local v0    # "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;*>;"
    //         .end local v1    # "e":Ljava/lang/Exception;
    //         :cond_0
    //         const/4 v3, 0x0
    //         iput-object v3, p0, Lbolts/Task;->continuations:Ljava/util/List;
    //         monitor-exit v4
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         return-void
    */

    public fun cast(): bolts.Task { return TODO("body: ()Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TOut:",
    //                 "Ljava/lang/Object;",
    //                 ">()",
    //                 "Lbolts/Task",
    //                 "<TTOut;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         move-object v0, p0
    //         .local v0, "task":Lbolts/Task;, "Lbolts/Task<TTOut;>;"
    //         return-object v0
    */

    public fun continueWhile(p0: java.util.concurrent.Callable, p1: bolts.Continuation): bolts.Task { return TODO("body: (Ljava/util/concurrent/Callable;Lbolts/Continuation;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/concurrent/Callable",
    //                 "<",
    //                 "Ljava/lang/Boolean;",
    //                 ">;",
    //                 "Lbolts/Continuation",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;>;)",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "predicate":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
    //         .local p2, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<Ljava/lang/Void;Lbolts/Task<Ljava/lang/Void;>;>;"
    //         sget-object v0, Lbolts/Task;->IMMEDIATE_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-virtual {p0, p1, p2, v0}, Lbolts/Task;->continueWhile(Ljava/util/concurrent/Callable;Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun continueWhile(executor: java.util.concurrent.Callable, p1: bolts.Continuation, p2: java.util.concurrent.Executor): bolts.Task { return TODO("body: (Ljava/util/concurrent/Callable;Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;") }
    /*
    //         .locals 6
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "predicate":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
    //         .local p2, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<Ljava/lang/Void;Lbolts/Task<Ljava/lang/Void;>;>;"
    //         new-instance v5, Lbolts/Capture;
    //         invoke-direct {v5}, Lbolts/Capture;-><init>()V
    //         .local v5, "predicateContinuation":Lbolts/Capture;, "Lbolts/Capture<Lbolts/Continuation<Ljava/lang/Void;Lbolts/Task<Ljava/lang/Void;>;>;>;"
    //         new-instance v0, Lbolts/Task$4;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v4, p3
    //         invoke-direct/range {v0 .. v5}, Lbolts/Task$4;-><init>(Lbolts/Task;Ljava/util/concurrent/Callable;Lbolts/Continuation;Ljava/util/concurrent/Executor;Lbolts/Capture;)V
    //         invoke-virtual {v5, v0}, Lbolts/Capture;->set(Ljava/lang/Object;)V
    //         invoke-virtual {p0}, Lbolts/Task;->makeVoid()Lbolts/Task;
    //         move-result-object v1
    //         invoke-virtual {v5}, Lbolts/Capture;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lbolts/Continuation;
    //         invoke-virtual {v1, v0, p3}, Lbolts/Task;->continueWithTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun continueWith(p0: bolts.Continuation): bolts.Task { return TODO("body: (Lbolts/Continuation;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TContinuationResult:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lbolts/Continuation",
    //                 "<TTResult;TTContinuationResult;>;)",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;TTContinuationResult;>;"
    //         sget-object v0, Lbolts/Task;->IMMEDIATE_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-virtual {p0, p1, v0}, Lbolts/Task;->continueWith(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun continueWith(executor: bolts.Continuation, p1: java.util.concurrent.Executor): bolts.Task { return TODO("body: (Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;") }
    /*
    //         .locals 5
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;TTContinuationResult;>;"
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v1
    //         .local v1, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTContinuationResult;>.TaskCompletionSource;"
    //         iget-object v3, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v3
    //         :try_start_0
    //         invoke-virtual {p0}, Lbolts/Task;->isCompleted()Z
    //         move-result v0
    //         .local v0, "completed":Z
    //         if-nez v0, :cond_0
    //         iget-object v2, p0, Lbolts/Task;->continuations:Ljava/util/List;
    //         new-instance v4, Lbolts/Task$5;
    //         invoke-direct {v4, p0, v1, p1, p2}, Lbolts/Task$5;-><init>(Lbolts/Task;Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Ljava/util/concurrent/Executor;)V
    //         invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         invoke-static {v1, p1, p0, p2}, Lbolts/Task;->completeImmediately(Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Lbolts/Task;Ljava/util/concurrent/Executor;)V
    //         :cond_1
    //         invoke-virtual {v1}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v2
    //         return-object v2
    //         .end local v0    # "completed":Z
    //         :catchall_0
    //         move-exception v2
    //         :try_start_1
    //         monitor-exit v3
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v2
    */

    public fun continueWithTask(p0: bolts.Continuation): bolts.Task { return TODO("body: (Lbolts/Continuation;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TContinuationResult:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lbolts/Continuation",
    //                 "<TTResult;",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;>;)",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;Lbolts/Task<TTContinuationResult;>;>;"
    //         sget-object v0, Lbolts/Task;->IMMEDIATE_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-virtual {p0, p1, v0}, Lbolts/Task;->continueWithTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun continueWithTask(executor: bolts.Continuation, p1: java.util.concurrent.Executor): bolts.Task { return TODO("body: (Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;") }
    /*
    //         .locals 5
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;Lbolts/Task<TTContinuationResult;>;>;"
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v1
    //         .local v1, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTContinuationResult;>.TaskCompletionSource;"
    //         iget-object v3, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v3
    //         :try_start_0
    //         invoke-virtual {p0}, Lbolts/Task;->isCompleted()Z
    //         move-result v0
    //         .local v0, "completed":Z
    //         if-nez v0, :cond_0
    //         iget-object v2, p0, Lbolts/Task;->continuations:Ljava/util/List;
    //         new-instance v4, Lbolts/Task$6;
    //         invoke-direct {v4, p0, v1, p1, p2}, Lbolts/Task$6;-><init>(Lbolts/Task;Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Ljava/util/concurrent/Executor;)V
    //         invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         invoke-static {v1, p1, p0, p2}, Lbolts/Task;->completeAfterTask(Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Lbolts/Task;Ljava/util/concurrent/Executor;)V
    //         :cond_1
    //         invoke-virtual {v1}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v2
    //         return-object v2
    //         .end local v0    # "completed":Z
    //         :catchall_0
    //         move-exception v2
    //         :try_start_1
    //         monitor-exit v3
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v2
    */

    public fun getError(): Exception { return TODO("body: ()Ljava/lang/Exception;") }
    /*
    //         .locals 2
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v1, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lbolts/Task;->error:Ljava/lang/Exception;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getResult(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TTResult;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v1, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lbolts/Task;->result:Ljava/lang/Object;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isCancelled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v1, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lbolts/Task;->cancelled:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isCompleted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v1, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lbolts/Task;->complete:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isFaulted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v1, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lbolts/Task;->error:Ljava/lang/Exception;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         monitor-exit v1
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun makeVoid(): bolts.Task { return TODO("body: ()Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         new-instance v0, Lbolts/Task$1;
    //         invoke-direct {v0, p0}, Lbolts/Task$1;-><init>(Lbolts/Task;)V
    //         invoke-virtual {p0, v0}, Lbolts/Task;->continueWithTask(Lbolts/Continuation;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onSuccess(p0: bolts.Continuation): bolts.Task { return TODO("body: (Lbolts/Continuation;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TContinuationResult:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lbolts/Continuation",
    //                 "<TTResult;TTContinuationResult;>;)",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;TTContinuationResult;>;"
    //         sget-object v0, Lbolts/Task;->IMMEDIATE_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-virtual {p0, p1, v0}, Lbolts/Task;->onSuccess(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onSuccess(executor: bolts.Continuation, p1: java.util.concurrent.Executor): bolts.Task { return TODO("body: (Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;TTContinuationResult;>;"
    //         new-instance v0, Lbolts/Task$7;
    //         invoke-direct {v0, p0, p1}, Lbolts/Task$7;-><init>(Lbolts/Task;Lbolts/Continuation;)V
    //         invoke-virtual {p0, v0, p2}, Lbolts/Task;->continueWithTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onSuccessTask(p0: bolts.Continuation): bolts.Task { return TODO("body: (Lbolts/Continuation;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TContinuationResult:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lbolts/Continuation",
    //                 "<TTResult;",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;>;)",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;Lbolts/Task<TTContinuationResult;>;>;"
    //         sget-object v0, Lbolts/Task;->IMMEDIATE_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-virtual {p0, p1, v0}, Lbolts/Task;->onSuccessTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onSuccessTask(executor: bolts.Continuation, p1: java.util.concurrent.Executor): bolts.Task { return TODO("body: (Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;Lbolts/Task<TTContinuationResult;>;>;"
    //         new-instance v0, Lbolts/Task$8;
    //         invoke-direct {v0, p0, p1}, Lbolts/Task$8;-><init>(Lbolts/Task;Lbolts/Continuation;)V
    //         invoke-virtual {p0, v0, p2}, Lbolts/Task;->continueWithTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun waitForCompletion() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/InterruptedException;
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v1, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-virtual {p0}, Lbolts/Task;->isCompleted()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lbolts/Task;->lock:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    //         :cond_0
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
    @JvmField public val BACKGROUND_EXECUTOR: java.util.concurrent.ExecutorService = null!!
    private val IMMEDIATE_EXECUTOR: java.util.concurrent.Executor = null!!
    @JvmField public val UI_THREAD_EXECUTOR: java.util.concurrent.Executor = null!!

    public @JvmStatic fun call(p0: java.util.concurrent.Callable): bolts.Task { return TODO("body: (Ljava/util/concurrent/Callable;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TResult:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/concurrent/Callable",
    //                 "<TTResult;>;)",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TTResult;>;"
    //         sget-object v0, Lbolts/Task;->IMMEDIATE_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-static {p0, v0}, Lbolts/Task;->call(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun call(executor: java.util.concurrent.Callable, p1: java.util.concurrent.Executor): bolts.Task { return TODO("body: (Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lbolts/Task;") }
    /*
    //         .locals 2
    //         .local p0, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TTResult;>;"
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v0
    //         .local v0, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         new-instance v1, Lbolts/Task$2;
    //         invoke-direct {v1, v0, p0}, Lbolts/Task$2;-><init>(Lbolts/Task$TaskCompletionSource;Ljava/util/concurrent/Callable;)V
    //         invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v1
    //         return-object v1
    */

    public @JvmStatic fun callInBackground(p0: java.util.concurrent.Callable): bolts.Task { return TODO("body: (Ljava/util/concurrent/Callable;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TResult:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/concurrent/Callable",
    //                 "<TTResult;>;)",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TTResult;>;"
    //         sget-object v0, Lbolts/Task;->BACKGROUND_EXECUTOR:Ljava/util/concurrent/ExecutorService;
    //         invoke-static {p0, v0}, Lbolts/Task;->call(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun cancelled(): bolts.Task { return TODO("body: ()Lbolts/Task;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TResult:",
    //                 "Ljava/lang/Object;",
    //                 ">()",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;"
    //             }
    //         .end annotation
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v0
    //         .local v0, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->setCancelled()V
    //         invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v1
    //         return-object v1
    */

    private @JvmStatic fun completeAfterTask(executor: bolts.Task.TaskCompletionSource, p1: bolts.Continuation, p2: bolts.Task, p3: java.util.concurrent.Executor) { /* TODO(body): (Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Lbolts/Task;Ljava/util/concurrent/Executor;)V */ }
    /*
    //         .locals 1
    //         .local p0, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTContinuationResult;>.TaskCompletionSource;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;Lbolts/Task<TTContinuationResult;>;>;"
    //         .local p2, "task":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         new-instance v0, Lbolts/Task$10;
    //         invoke-direct {v0, p1, p2, p0}, Lbolts/Task$10;-><init>(Lbolts/Continuation;Lbolts/Task;Lbolts/Task$TaskCompletionSource;)V
    //         invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    private @JvmStatic fun completeImmediately(executor: bolts.Task.TaskCompletionSource, p1: bolts.Continuation, p2: bolts.Task, p3: java.util.concurrent.Executor) { /* TODO(body): (Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Lbolts/Task;Ljava/util/concurrent/Executor;)V */ }
    /*
    //         .locals 1
    //         .local p0, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTContinuationResult;>.TaskCompletionSource;"
    //         .local p1, "continuation":Lbolts/Continuation;, "Lbolts/Continuation<TTResult;TTContinuationResult;>;"
    //         .local p2, "task":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         new-instance v0, Lbolts/Task$9;
    //         invoke-direct {v0, p1, p2, p0}, Lbolts/Task$9;-><init>(Lbolts/Continuation;Lbolts/Task;Lbolts/Task$TaskCompletionSource;)V
    //         invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    public @JvmStatic fun create(): bolts.Task.TaskCompletionSource { return TODO("body: ()Lbolts/Task$TaskCompletionSource;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TResult:",
    //                 "Ljava/lang/Object;",
    //                 ">()",
    //                 "Lbolts/Task",
    //                 "<TTResult;>.TaskCompletionSource;"
    //             }
    //         .end annotation
    //         new-instance v0, Lbolts/Task;
    //         invoke-direct {v0}, Lbolts/Task;-><init>()V
    //         .local v0, "task":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         new-instance v1, Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v0, v2}, Lbolts/Task$TaskCompletionSource;-><init>(Lbolts/Task;Lbolts/Task$1;)V
    //         return-object v1
    */

    public @JvmStatic fun forError(error: Exception): bolts.Task { return TODO("body: (Ljava/lang/Exception;)Lbolts/Task;") }
    /*
    //         .locals 2
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v0
    //         .local v0, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         invoke-virtual {v0, p0}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v1
    //         return-object v1
    */

    public @JvmStatic fun forResult(p0: Object): bolts.Task { return TODO("body: (Ljava/lang/Object;)Lbolts/Task;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<TResult:",
    //                 "Ljava/lang/Object;",
    //                 ">(TTResult;)",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "value":Ljava/lang/Object;, "TTResult;"
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v0
    //         .local v0, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         invoke-virtual {v0, p0}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v1
    //         return-object v1
    */

    public @JvmStatic fun whenAll(p0: java.util.Collection): bolts.Task { return TODO("body: (Ljava/util/Collection;)Lbolts/Task;") }
    /*
    //         .locals 9
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<+",
    //                 "Lbolts/Task",
    //                 "<*>;>;)",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .local p0, "tasks":Ljava/util/Collection;, "Ljava/util/Collection<+Lbolts/Task<*>;>;"
    //         invoke-interface {p0}, Ljava/util/Collection;->size()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v5
    //         .local v5, "allFinished":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<Ljava/lang/Void;>.TaskCompletionSource;"
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         .local v2, "errors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Exception;>;"
    //         new-instance v1, Ljava/lang/Object;
    //         invoke-direct {v1}, Ljava/lang/Object;-><init>()V
    //         .local v1, "errorLock":Ljava/lang/Object;
    //         new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;
    //         invoke-interface {p0}, Ljava/util/Collection;->size()I
    //         move-result v0
    //         invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
    //         .local v4, "count":Ljava/util/concurrent/atomic/AtomicInteger;
    //         new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;
    //         const/4 v0, 0x0
    //         invoke-direct {v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V
    //         .local v3, "isCancelled":Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v6
    //         .local v6, "i$":Ljava/util/Iterator;
    //         :goto_1
    //         invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v8
    //         check-cast v8, Lbolts/Task;
    //         .local v8, "task":Lbolts/Task;, "Lbolts/Task<*>;"
    //         move-object v7, v8
    //         .local v7, "t":Lbolts/Task;, "Lbolts/Task<Ljava/lang/Object;>;"
    //         new-instance v0, Lbolts/Task$3;
    //         invoke-direct/range {v0 .. v5}, Lbolts/Task$3;-><init>(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicInteger;Lbolts/Task$TaskCompletionSource;)V
    //         invoke-virtual {v7, v0}, Lbolts/Task;->continueWith(Lbolts/Continuation;)Lbolts/Task;
    //         goto :goto_1
    //         .end local v7    # "t":Lbolts/Task;, "Lbolts/Task<Ljava/lang/Object;>;"
    //         .end local v8    # "task":Lbolts/Task;, "Lbolts/Task<*>;"
    //         :cond_1
    //         invoke-virtual {v5}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
