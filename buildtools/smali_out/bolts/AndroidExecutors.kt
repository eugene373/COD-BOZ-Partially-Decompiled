package bolts

// Auto-emitted from smali source: AndroidExecutors.java.
// 7 fields, 6 methods.

class AndroidExecutors {
    private val uiThread: java.util.concurrent.Executor

    private constructor()

    companion object {
    val CORE_POOL_SIZE: Int = 0
    private val CPU_COUNT: Int = 0
    private val INSTANCE: bolts.AndroidExecutors = null!!
    val KEEP_ALIVE_TIME: Long = 0x1L
    val MAX_POOL_SIZE: Int = 0
    val MAX_QUEUE_SIZE: Int = 0x80

    public @JvmStatic fun allowCoreThreadTimeout(executor: java.util.concurrent.ThreadPoolExecutor, value: Boolean) { /* TODO(body): (Ljava/util/concurrent/ThreadPoolExecutor;Z)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x9
    //         if-lt v0, v1, :cond_0
    //         invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun newCachedThreadPool(): java.util.concurrent.ExecutorService { return TODO("body: ()Ljava/util/concurrent/ExecutorService;") }
    /*
    //         .locals 8
    //         new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;
    //         sget v2, Lbolts/AndroidExecutors;->CORE_POOL_SIZE:I
    //         sget v3, Lbolts/AndroidExecutors;->MAX_POOL_SIZE:I
    //         const-wide/16 v4, 0x1
    //         sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    //         new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;
    //         const/16 v0, 0x80
    //         invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V
    //         invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V
    //         .local v1, "executor":Ljava/util/concurrent/ThreadPoolExecutor;
    //         const/4 v0, 0x1
    //         invoke-static {v1, v0}, Lbolts/AndroidExecutors;->allowCoreThreadTimeout(Ljava/util/concurrent/ThreadPoolExecutor;Z)V
    //         return-object v1
    */

    public @JvmStatic fun newCachedThreadPool(threadFactory: java.util.concurrent.ThreadFactory): java.util.concurrent.ExecutorService { return TODO("body: (Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;") }
    /*
    //         .locals 9
    //         new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;
    //         sget v2, Lbolts/AndroidExecutors;->CORE_POOL_SIZE:I
    //         sget v3, Lbolts/AndroidExecutors;->MAX_POOL_SIZE:I
    //         const-wide/16 v4, 0x1
    //         sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    //         new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;
    //         const/16 v0, 0x80
    //         invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V
    //         move-object v8, p0
    //         invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    //         .local v1, "executor":Ljava/util/concurrent/ThreadPoolExecutor;
    //         const/4 v0, 0x1
    //         invoke-static {v1, v0}, Lbolts/AndroidExecutors;->allowCoreThreadTimeout(Ljava/util/concurrent/ThreadPoolExecutor;Z)V
    //         return-object v1
    */

    public @JvmStatic fun uiThread(): java.util.concurrent.Executor { return TODO("body: ()Ljava/util/concurrent/Executor;") }
    /*
    //         .locals 1
    //         sget-object v0, Lbolts/AndroidExecutors;->INSTANCE:Lbolts/AndroidExecutors;
    //         iget-object v0, v0, Lbolts/AndroidExecutors;->uiThread:Ljava/util/concurrent/Executor;
    //         return-object v0
    */

    }
}
