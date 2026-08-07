package android.support.v4.content

// Auto-emitted from smali source: ModernAsyncTask.java.
// 1 fields, 2 methods.

class ModernAsyncTask_Anon1: java.util.concurrent.ThreadFactory {
    private val mCount: java.util.concurrent.atomic.AtomicInteger

    constructor()

    public fun newThread(r: Runnable): Thread { return TODO("body: (Ljava/lang/Runnable;)Ljava/lang/Thread;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/Thread;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "ModernAsyncTask #"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Landroid/support/v4/content/ModernAsyncTask$1;->mCount:Ljava/util/concurrent/atomic/AtomicInteger;
    //         invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V
    //         return-object v0
    */

}
