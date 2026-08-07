package bolts

// Auto-emitted from smali source: Task.java.
// 3 fields, 2 methods.

class Task_Anon10: Runnable {
    val val$continuation: bolts.Continuation
    val val$task: bolts.Task
    val val$tcs: bolts.Task.TaskCompletionSource

    constructor(p0: bolts.Continuation, p1: bolts.Task, p2: bolts.Task.TaskCompletionSource)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v2, p0, Lbolts/Task$10;->val$continuation:Lbolts/Continuation;
    //         iget-object v3, p0, Lbolts/Task$10;->val$task:Lbolts/Task;
    //         invoke-interface {v2, v3}, Lbolts/Continuation;->then(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lbolts/Task;
    //         .local v1, "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    //         if-nez v1, :cond_0
    //         iget-object v2, p0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         const/4 v3, 0x0
    //         invoke-virtual {v2, v3}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         .end local v1    # "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    //         :goto_0
    //         return-void
    //         .restart local v1    # "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    //         :cond_0
    //         new-instance v2, Lbolts/Task$10$1;
    //         invoke-direct {v2, p0}, Lbolts/Task$10$1;-><init>(Lbolts/Task$10;)V
    //         invoke-virtual {v1, v2}, Lbolts/Task;->continueWith(Lbolts/Continuation;)Lbolts/Task;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         .end local v1    # "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         iget-object v2, p0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v2, v0}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         goto :goto_0
    */

}
