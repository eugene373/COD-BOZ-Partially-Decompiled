package bolts

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 5 fields, 4 methods.

open class AndroidExecutors {
        private val uiThread: java.util.concurrent.Executor

    companion object {
        private val INSTANCE: bolts.AndroidExecutors = null!!
        private val CPU_COUNT: Int = 0
        val CORE_POOL_SIZE: Int = 0
        val MAX_POOL_SIZE: Int = 0

        public @JvmStatic fun newCachedThreadPool(): java.util.concurrent.ExecutorService { return TODO("body: ()Ljava/util/concurrent/ExecutorService;") }
        public @JvmStatic fun newCachedThreadPool(p0: java.util.concurrent.ThreadFactory): java.util.concurrent.ExecutorService { return TODO("body: (Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;") }
        public @JvmStatic fun allowCoreThreadTimeout(p0: java.util.concurrent.ThreadPoolExecutor, p1: Boolean) { /* TODO(body): (Ljava/util/concurrent/ThreadPoolExecutor;Z)V */ }
        public @JvmStatic fun uiThread(): java.util.concurrent.Executor { return TODO("body: ()Ljava/util/concurrent/Executor;") }
    }
}
