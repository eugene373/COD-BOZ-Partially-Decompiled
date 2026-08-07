package bolts

// Auto-emitted from smali source: AndroidExecutors.java.
// 0 fields, 3 methods.

open class AndroidExecutors_UIThreadExecutor: java.util.concurrent.Executor {
    private constructor()

    constructor(x0: bolts.AndroidExecutors.1)

    public fun execute(command: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/os/Handler;
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

}
