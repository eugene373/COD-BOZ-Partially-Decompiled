package bolts

// Auto-emitted from smali source: Task.java.
// 3 fields, 2 methods.

class Task_Anon9: Runnable {
    val val$continuation: bolts.Continuation
    val val$task: bolts.Task
    val val$tcs: bolts.Task.TaskCompletionSource

    constructor(p0: bolts.Continuation, p1: bolts.Task, p2: bolts.Task.TaskCompletionSource)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v2, p0, Lbolts/Task$9;->val$continuation:Lbolts/Continuation;
    //         iget-object v3, p0, Lbolts/Task$9;->val$task:Lbolts/Task;
    //         invoke-interface {v2, v3}, Lbolts/Continuation;->then(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "result":Ljava/lang/Object;, "TTContinuationResult;"
    //         iget-object v2, p0, Lbolts/Task$9;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v2, v1}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v1    # "result":Ljava/lang/Object;, "TTContinuationResult;"
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         iget-object v2, p0, Lbolts/Task$9;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v2, v0}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         goto :goto_0
    */

}
