package bolts

// Auto-emitted from smali source: Task.java.
// 5 fields, 3 methods.

open class Task_Anon4: bolts.Continuation {
    val this$0: bolts.Task
    val val$continuation: bolts.Continuation
    val val$executor: java.util.concurrent.Executor
    val val$predicate: java.util.concurrent.Callable
    val val$predicateContinuation: bolts.Capture

    constructor(p0: bolts.Task, p1: java.util.concurrent.Callable, p2: bolts.Continuation, p3: java.util.concurrent.Executor, p4: bolts.Capture)

    public fun then(p0: bolts.Task): bolts.Task { return TODO("body: (Lbolts/Task;)Lbolts/Task;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;)",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task$4;, "Lbolts/Task.4;"
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<Ljava/lang/Void;>;"
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lbolts/Task$4;->val$predicate:Ljava/util/concurrent/Callable;
    //         invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {v1}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;
    //         move-result-object v0
    //         iget-object v1, p0, Lbolts/Task$4;->val$continuation:Lbolts/Continuation;
    //         iget-object v2, p0, Lbolts/Task$4;->val$executor:Ljava/util/concurrent/Executor;
    //         invoke-virtual {v0, v1, v2}, Lbolts/Task;->onSuccessTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v1
    //         iget-object v0, p0, Lbolts/Task$4;->val$predicateContinuation:Lbolts/Capture;
    //         invoke-virtual {v0}, Lbolts/Capture;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lbolts/Continuation;
    //         iget-object v2, p0, Lbolts/Task$4;->val$executor:Ljava/util/concurrent/Executor;
    //         invoke-virtual {v1, v0, v2}, Lbolts/Task;->onSuccessTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {v1}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lbolts/Task$4;, "Lbolts/Task.4;"
    //         invoke-virtual {p0, p1}, Lbolts/Task$4;->then(Lbolts/Task;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

}
