package bolts

import java.util.Locale
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

internal object BoltsExecutors {
    private val sBackground: ExecutorService = if (isAndroidRuntime()) {
        AndroidExecutors.newCachedThreadPool()
    } else {
        Executors.newCachedThreadPool()
    }
    private val sImmediate: Executor = ImmediateExecutor()

    private fun isAndroidRuntime(): Boolean {
        val runtimeName = System.getProperty("java.runtime.name") ?: return false
        return runtimeName.lowercase(Locale.US).contains("android")
    }

    @JvmStatic
    fun background(): ExecutorService = sBackground

    @JvmStatic
    fun immediate(): Executor = sImmediate

    private class ImmediateExecutor : Executor {
        private val executionDepth = ThreadLocal<Int>()

        companion object {
            private const val MAX_DEPTH = 15
        }

        private fun incrementDepth(): Int {
            var depth = executionDepth.get() ?: 0
            depth += 1
            executionDepth.set(depth)
            return depth
        }

        private fun decrementDepth(): Int {
            var depth = executionDepth.get() ?: 0
            depth -= 1
            if (depth == 0) {
                executionDepth.remove()
            } else {
                executionDepth.set(depth)
            }
            return depth
        }

        override fun execute(command: Runnable) {
            val depth = incrementDepth()
            try {
                if (depth <= MAX_DEPTH) {
                    command.run()
                } else {
                    background().execute(command)
                }
            } finally {
                decrementDepth()
            }
        }
    }
}
