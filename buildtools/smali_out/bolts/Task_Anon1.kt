package bolts

// Auto-emitted from smali source: Task.java.
// 1 fields, 3 methods.

open class Task_Anon1: bolts.Continuation {
    val this$0: bolts.Task

    constructor(p0: bolts.Task)

    public fun then(p0: bolts.Task): bolts.Task { return TODO("body: (Lbolts/Task;)Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;)",
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
    //         .local p0, "this":Lbolts/Task$1;, "Lbolts/Task.1;"
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<TTResult;>;"
    //         invoke-virtual {p1}, Lbolts/Task;->isCancelled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lbolts/Task;->cancelled()Lbolts/Task;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p1}, Lbolts/Task;->isFaulted()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p1}, Lbolts/Task;->getError()Ljava/lang/Exception;
    //         move-result-object v0
    //         invoke-static {v0}, Lbolts/Task;->forError(Ljava/lang/Exception;)Lbolts/Task;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lbolts/Task$1;, "Lbolts/Task.1;"
    //         invoke-virtual {p0, p1}, Lbolts/Task$1;->then(Lbolts/Task;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

}
