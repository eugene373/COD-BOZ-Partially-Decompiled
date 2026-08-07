package bolts

// Auto-emitted from smali source: Task.java.
// 2 fields, 3 methods.

open class Task_Anon8: bolts.Continuation {
    val this$0: bolts.Task
    val val$continuation: bolts.Continuation

    constructor(p0: bolts.Task, p1: bolts.Continuation)

    public fun then(p0: bolts.Task): bolts.Task { return TODO("body: (Lbolts/Task;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;)",
    //                 "Lbolts/Task",
    //                 "<TTContinuationResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task$8;, "Lbolts/Task.8;"
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         invoke-virtual {p1}, Lbolts/Task;->isFaulted()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Lbolts/Task;->getError()Ljava/lang/Exception;
    //         move-result-object v0
    //         invoke-static {v0}, Lbolts/Task;->forError(Ljava/lang/Exception;)Lbolts/Task;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p1}, Lbolts/Task;->isCancelled()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-static {}, Lbolts/Task;->cancelled()Lbolts/Task;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lbolts/Task$8;->val$continuation:Lbolts/Continuation;
    //         invoke-virtual {p1, v0}, Lbolts/Task;->continueWithTask(Lbolts/Continuation;)Lbolts/Task;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lbolts/Task$8;, "Lbolts/Task.8;"
    //         invoke-virtual {p0, p1}, Lbolts/Task$8;->then(Lbolts/Task;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

}
