package bolts

// Auto-emitted from smali source: Task.java.
// 2 fields, 2 methods.

class Task_Anon2: Runnable {
    val val$callable: java.util.concurrent.Callable
    val val$tcs: bolts.Task.TaskCompletionSource

    constructor(p0: bolts.Task.TaskCompletionSource, p1: java.util.concurrent.Callable)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v1, p0, Lbolts/Task$2;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         iget-object v2, p0, Lbolts/Task$2;->val$callable:Ljava/util/concurrent/Callable;
    //         invoke-interface {v2}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         iget-object v1, p0, Lbolts/Task$2;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v1, v0}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         goto :goto_0
    */

}
