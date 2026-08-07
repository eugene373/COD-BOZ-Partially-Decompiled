package bolts

// Auto-emitted from smali source: Task.java.
// 1 fields, 3 methods.

open class Task_10_Anon1: bolts.Continuation {
    val this$0: bolts.Task.10

    constructor(p0: bolts.Task.10)

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lbolts/Task$10$1;->then(Lbolts/Task;)Ljava/lang/Void;
    //         move-result-object v0
    //         return-object v0
    */

    public fun then(p0: bolts.Task): Void { return TODO("body: (Lbolts/Task;)Ljava/lang/Void;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;)",
    //                 "Ljava/lang/Void;"
    //             }
    //         .end annotation
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    //         invoke-virtual {p1}, Lbolts/Task;->isCancelled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lbolts/Task$10$1;->this$0:Lbolts/Task$10;
    //         iget-object v0, v0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->setCancelled()V
    //         :goto_0
    //         const/4 v0, 0x0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p1}, Lbolts/Task;->isFaulted()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lbolts/Task$10$1;->this$0:Lbolts/Task$10;
    //         iget-object v0, v0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {p1}, Lbolts/Task;->getError()Ljava/lang/Exception;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lbolts/Task$10$1;->this$0:Lbolts/Task$10;
    //         iget-object v0, v0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {p1}, Lbolts/Task;->getResult()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         goto :goto_0
    */

}
