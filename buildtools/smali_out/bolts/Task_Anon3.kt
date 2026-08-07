package bolts

// Auto-emitted from smali source: Task.java.
// 5 fields, 3 methods.

class Task_Anon3: bolts.Continuation {
    val val$allFinished: bolts.Task.TaskCompletionSource
    val val$count: java.util.concurrent.atomic.AtomicInteger
    val val$errorLock: Object
    val val$errors: java.util.ArrayList
    val val$isCancelled: java.util.concurrent.atomic.AtomicBoolean

    constructor(p0: Object, p1: java.util.ArrayList, p2: java.util.concurrent.atomic.AtomicBoolean, p3: java.util.concurrent.atomic.AtomicInteger, p4: bolts.Task.TaskCompletionSource)

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lbolts/Task$3;->then(Lbolts/Task;)Ljava/lang/Void;
    //         move-result-object v0
    //         return-object v0
    */

    public fun then(p0: bolts.Task): Void { return TODO("body: (Lbolts/Task;)Ljava/lang/Void;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Object;",
    //                 ">;)",
    //                 "Ljava/lang/Void;"
    //             }
    //         .end annotation
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<Ljava/lang/Object;>;"
    //         const/4 v4, 0x0
    //         const/4 v3, 0x1
    //         invoke-virtual {p1}, Lbolts/Task;->isFaulted()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lbolts/Task$3;->val$errorLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lbolts/Task$3;->val$errors:Ljava/util/ArrayList;
    //         invoke-virtual {p1}, Lbolts/Task;->getError()Ljava/lang/Exception;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         invoke-virtual {p1}, Lbolts/Task;->isCancelled()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lbolts/Task$3;->val$isCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    //         :cond_1
    //         iget-object v0, p0, Lbolts/Task$3;->val$count:Ljava/util/concurrent/atomic/AtomicInteger;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I
    //         move-result v0
    //         if-nez v0, :cond_2
    //         iget-object v0, p0, Lbolts/Task$3;->val$errors:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lbolts/Task$3;->val$errors:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-ne v0, v3, :cond_3
    //         iget-object v1, p0, Lbolts/Task$3;->val$allFinished:Lbolts/Task$TaskCompletionSource;
    //         iget-object v0, p0, Lbolts/Task$3;->val$errors:Ljava/util/ArrayList;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Exception;
    //         invoke-virtual {v1, v0}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         :cond_2
    //         :goto_0
    //         return-object v4
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_3
    //         iget-object v0, p0, Lbolts/Task$3;->val$allFinished:Lbolts/Task$TaskCompletionSource;
    //         new-instance v1, Lbolts/AggregateException;
    //         iget-object v2, p0, Lbolts/Task$3;->val$errors:Ljava/util/ArrayList;
    //         invoke-direct {v1, v2}, Lbolts/AggregateException;-><init>(Ljava/util/List;)V
    //         invoke-virtual {v0, v1}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         goto :goto_0
    //         :cond_4
    //         iget-object v0, p0, Lbolts/Task$3;->val$isCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lbolts/Task$3;->val$allFinished:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->setCancelled()V
    //         goto :goto_0
    //         :cond_5
    //         iget-object v0, p0, Lbolts/Task$3;->val$allFinished:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v0, v4}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         goto :goto_0
    */

}
