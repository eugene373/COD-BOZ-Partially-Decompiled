package bolts

// Auto-emitted from smali source: Task.java.
// 4 fields, 3 methods.

open class Task_Anon6: bolts.Continuation {
    val this$0: bolts.Task
    val val$continuation: bolts.Continuation
    val val$executor: java.util.concurrent.Executor
    val val$tcs: bolts.Task.TaskCompletionSource

    constructor(p0: bolts.Task, p1: bolts.Task.TaskCompletionSource, p2: bolts.Continuation, p3: java.util.concurrent.Executor)

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lbolts/Task$6;, "Lbolts/Task.6;"
    //         invoke-virtual {p0, p1}, Lbolts/Task$6;->then(Lbolts/Task;)Ljava/lang/Void;
    //         move-result-object v0
    //         return-object v0
    */

    public fun then(p0: bolts.Task): Void { return TODO("body: (Lbolts/Task;)Ljava/lang/Void;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;)",
    //                 "Ljava/lang/Void;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task$6;, "Lbolts/Task.6;"
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         iget-object v0, p0, Lbolts/Task$6;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         iget-object v1, p0, Lbolts/Task$6;->val$continuation:Lbolts/Continuation;
    //         iget-object v2, p0, Lbolts/Task$6;->val$executor:Ljava/util/concurrent/Executor;
    //         invoke-static {v0, v1, p1, v2}, Lbolts/Task;->access$200(Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Lbolts/Task;Ljava/util/concurrent/Executor;)V
    //         const/4 v0, 0x0
    //         return-object v0
    */

}
