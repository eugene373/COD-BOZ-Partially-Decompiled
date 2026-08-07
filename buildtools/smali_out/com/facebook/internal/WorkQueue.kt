package com.facebook.internal

// Auto-emitted from smali source: WorkQueue.java.
// 8 fields, 14 methods.

open class WorkQueue {
    private val executor: java.util.concurrent.Executor
    private val maxConcurrent: Int
    private var pendingJobs: com.facebook.internal.WorkQueue.WorkNode
    private var runningCount: Int
    private var runningJobs: com.facebook.internal.WorkQueue.WorkNode
    private val workLock: Object

    constructor()

    constructor(p0: Int)

    constructor(p0: Int, p1: java.util.concurrent.Executor)

    private fun execute(p0: com.facebook.internal.WorkQueue.WorkNode) { /* TODO(body): (Lcom/facebook/internal/WorkQueue$WorkNode;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/internal/WorkQueue;->executor:Ljava/util/concurrent/Executor;
    //         new-instance v1, Lcom/facebook/internal/WorkQueue$1;
    //         invoke-direct {v1, p0, p1}, Lcom/facebook/internal/WorkQueue$1;-><init>(Lcom/facebook/internal/WorkQueue;Lcom/facebook/internal/WorkQueue$WorkNode;)V
    //         invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    private fun finishItemAndStartNew(p0: com.facebook.internal.WorkQueue.WorkNode) { /* TODO(body): (Lcom/facebook/internal/WorkQueue$WorkNode;)V */ }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/internal/WorkQueue;->workLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         if-eqz p1, :cond_0
    //         :try_start_0
    //         iget-object v2, p0, Lcom/facebook/internal/WorkQueue;->runningJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         invoke-virtual {p1, v2}, Lcom/facebook/internal/WorkQueue$WorkNode;->removeFromList(Lcom/facebook/internal/WorkQueue$WorkNode;)Lcom/facebook/internal/WorkQueue$WorkNode;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/facebook/internal/WorkQueue;->runningJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         iget v2, p0, Lcom/facebook/internal/WorkQueue;->runningCount:I
    //         add-int/lit8 v2, v2, -0x1
    //         iput v2, p0, Lcom/facebook/internal/WorkQueue;->runningCount:I
    //         :cond_0
    //         iget v2, p0, Lcom/facebook/internal/WorkQueue;->runningCount:I
    //         iget v3, p0, Lcom/facebook/internal/WorkQueue;->maxConcurrent:I
    //         if-ge v2, v3, :cond_1
    //         iget-object v0, p0, Lcom/facebook/internal/WorkQueue;->pendingJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         if-eqz v0, :cond_1
    //         iget-object v2, p0, Lcom/facebook/internal/WorkQueue;->pendingJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         invoke-virtual {v0, v2}, Lcom/facebook/internal/WorkQueue$WorkNode;->removeFromList(Lcom/facebook/internal/WorkQueue$WorkNode;)Lcom/facebook/internal/WorkQueue$WorkNode;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/facebook/internal/WorkQueue;->pendingJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         iget-object v2, p0, Lcom/facebook/internal/WorkQueue;->runningJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v2, v3}, Lcom/facebook/internal/WorkQueue$WorkNode;->addToList(Lcom/facebook/internal/WorkQueue$WorkNode;Z)Lcom/facebook/internal/WorkQueue$WorkNode;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/facebook/internal/WorkQueue;->runningJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         iget v2, p0, Lcom/facebook/internal/WorkQueue;->runningCount:I
    //         add-int/lit8 v2, v2, 0x1
    //         iput v2, p0, Lcom/facebook/internal/WorkQueue;->runningCount:I
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Lcom/facebook/internal/WorkQueue$WorkNode;->setIsRunning(Z)V
    //         :cond_1
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_2
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/WorkQueue;->execute(Lcom/facebook/internal/WorkQueue$WorkNode;)V
    //         :cond_2
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    private fun startItem() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/WorkQueue;->finishItemAndStartNew(Lcom/facebook/internal/WorkQueue$WorkNode;)V
    //         return-void
    */

    fun addActiveWorkItem(p0: Runnable): com.facebook.internal.WorkQueue.WorkItem { return TODO("body: (Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1, v0}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;Z)Lcom/facebook/internal/WorkQueue$WorkItem;
    //         move-result-object v0
    //         return-object v0
    */

    fun addActiveWorkItem(p0: Runnable, p1: Boolean): com.facebook.internal.WorkQueue.WorkItem { return TODO("body: (Ljava/lang/Runnable;Z)Lcom/facebook/internal/WorkQueue$WorkItem;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/facebook/internal/WorkQueue$WorkNode;
    //         invoke-direct {v0, p0, p1}, Lcom/facebook/internal/WorkQueue$WorkNode;-><init>(Lcom/facebook/internal/WorkQueue;Ljava/lang/Runnable;)V
    //         iget-object v1, p0, Lcom/facebook/internal/WorkQueue;->workLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lcom/facebook/internal/WorkQueue;->pendingJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         invoke-virtual {v0, v2, p2}, Lcom/facebook/internal/WorkQueue$WorkNode;->addToList(Lcom/facebook/internal/WorkQueue$WorkNode;Z)Lcom/facebook/internal/WorkQueue$WorkNode;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/facebook/internal/WorkQueue;->pendingJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-direct {p0}, Lcom/facebook/internal/WorkQueue;->startItem()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    fun validate() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Lcom/facebook/internal/WorkQueue;->workLock:Ljava/lang/Object;
    //         monitor-enter v2
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/facebook/internal/WorkQueue;->runningJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/internal/WorkQueue;->runningJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         :cond_0
    //         const/4 v3, 0x1
    //         invoke-virtual {v1, v3}, Lcom/facebook/internal/WorkQueue$WorkNode;->verify(Z)V
    //         add-int/lit8 v0, v0, 0x1
    //         invoke-virtual {v1}, Lcom/facebook/internal/WorkQueue$WorkNode;->getNext()Lcom/facebook/internal/WorkQueue$WorkNode;
    //         move-result-object v1
    //         iget-object v3, p0, Lcom/facebook/internal/WorkQueue;->runningJobs:Lcom/facebook/internal/WorkQueue$WorkNode;
    //         if-ne v1, v3, :cond_0
    //         :cond_1
    //         sget-boolean v1, Lcom/facebook/internal/WorkQueue;->$assertionsDisabled:Z
    //         if-nez v1, :cond_2
    //         iget v1, p0, Lcom/facebook/internal/WorkQueue;->runningCount:I
    //         if-eq v1, v0, :cond_2
    //         new-instance v0, Ljava/lang/AssertionError;
    //         invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    companion object {
    val $assertionsDisabled: Boolean = false
    @JvmField public val DEFAULT_MAX_CONCURRENT: Int = 0x8
    }
}
