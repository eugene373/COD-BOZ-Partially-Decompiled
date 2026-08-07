package bolts

// Auto-emitted from smali source: Task.java.
// 1 fields, 9 methods.

open class Task_TaskCompletionSource {
    val this$0: bolts.Task

    private constructor(p0: bolts.Task)

    constructor(x0: bolts.Task, x1: bolts.Task.1)

    public fun getTask(): bolts.Task { return TODO("body: ()Lbolts/Task;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lbolts/Task",
    //                 "<TTResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         iget-object v0, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         return-object v0
    */

    public fun setCancelled() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         invoke-virtual {p0}, Lbolts/Task$TaskCompletionSource;->trySetCancelled()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot cancel a completed task."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun setError(error: Exception) { /* TODO(body): (Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         invoke-virtual {p0, p1}, Lbolts/Task$TaskCompletionSource;->trySetError(Ljava/lang/Exception;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot set the error on a completed task."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun setResult(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TTResult;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         .local p1, "result":Ljava/lang/Object;, "TTResult;"
    //         invoke-virtual {p0, p1}, Lbolts/Task$TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot set the result of a completed task."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun trySetCancelled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v1}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$400(Lbolts/Task;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         const/4 v0, 0x0
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         const/4 v3, 0x1
    //         invoke-static {v2, v3}, Lbolts/Task;->access$402(Lbolts/Task;Z)Z
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         const/4 v3, 0x1
    //         invoke-static {v2, v3}, Lbolts/Task;->access$502(Lbolts/Task;Z)Z
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$600(Lbolts/Task;)V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun trySetError(error: Exception): Boolean { return TODO("body: (Ljava/lang/Exception;)Z") }
    /*
    //         .locals 4
    //         .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v1}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$400(Lbolts/Task;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         const/4 v0, 0x0
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         const/4 v3, 0x1
    //         invoke-static {v2, v3}, Lbolts/Task;->access$402(Lbolts/Task;Z)Z
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2, p1}, Lbolts/Task;->access$802(Lbolts/Task;Ljava/lang/Exception;)Ljava/lang/Exception;
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$600(Lbolts/Task;)V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun trySetResult(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TTResult;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    //         .local p1, "result":Ljava/lang/Object;, "TTResult;"
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v1}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$400(Lbolts/Task;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         const/4 v0, 0x0
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         const/4 v3, 0x1
    //         invoke-static {v2, v3}, Lbolts/Task;->access$402(Lbolts/Task;Z)Z
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2, p1}, Lbolts/Task;->access$702(Lbolts/Task;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    //         iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;
    //         invoke-static {v2}, Lbolts/Task;->access$600(Lbolts/Task;)V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
