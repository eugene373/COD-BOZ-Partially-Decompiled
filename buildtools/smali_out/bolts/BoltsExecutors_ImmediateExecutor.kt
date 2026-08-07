package bolts

// Auto-emitted from smali source: BoltsExecutors.java.
// 2 fields, 5 methods.

open class BoltsExecutors_ImmediateExecutor: java.util.concurrent.Executor {
    private var executionDepth: ThreadLocal

    private constructor()

    constructor(x0: bolts.BoltsExecutors.1)

    private fun decrementDepth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         iget-object v2, p0, Lbolts/BoltsExecutors$ImmediateExecutor;->executionDepth:Ljava/lang/ThreadLocal;
    //         invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/Integer;
    //         .local v1, "oldDepth":Ljava/lang/Integer;
    //         if-nez v1, :cond_0
    //         const/4 v2, 0x0
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         :cond_0
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         move-result v2
    //         add-int/lit8 v0, v2, -0x1
    //         .local v0, "newDepth":I
    //         if-nez v0, :cond_1
    //         iget-object v2, p0, Lbolts/BoltsExecutors$ImmediateExecutor;->executionDepth:Ljava/lang/ThreadLocal;
    //         invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v2, p0, Lbolts/BoltsExecutors$ImmediateExecutor;->executionDepth:Ljava/lang/ThreadLocal;
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    //         goto :goto_0
    */

    private fun incrementDepth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         iget-object v2, p0, Lbolts/BoltsExecutors$ImmediateExecutor;->executionDepth:Ljava/lang/ThreadLocal;
    //         invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/Integer;
    //         .local v1, "oldDepth":Ljava/lang/Integer;
    //         if-nez v1, :cond_0
    //         const/4 v2, 0x0
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         :cond_0
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         move-result v2
    //         add-int/lit8 v0, v2, 0x1
    //         .local v0, "newDepth":I
    //         iget-object v2, p0, Lbolts/BoltsExecutors$ImmediateExecutor;->executionDepth:Ljava/lang/ThreadLocal;
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    //         return v0
    */

    public fun execute(command: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lbolts/BoltsExecutors$ImmediateExecutor;->incrementDepth()I
    //         move-result v0
    //         .local v0, "depth":I
    //         const/16 v1, 0xf
    //         if-gt v0, v1, :cond_0
    //         :try_start_0
    //         invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-direct {p0}, Lbolts/BoltsExecutors$ImmediateExecutor;->decrementDepth()I
    //         return-void
    //         :cond_0
    //         :try_start_1
    //         invoke-static {}, Lbolts/BoltsExecutors;->background()Ljava/util/concurrent/ExecutorService;
    //         move-result-object v1
    //         invoke-interface {v1, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         invoke-direct {p0}, Lbolts/BoltsExecutors$ImmediateExecutor;->decrementDepth()I
    //         throw v1
    */

    companion object {
    private val MAX_DEPTH: Int = 0xf
    }
}
