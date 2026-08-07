package com.facebook

// Auto-emitted from smali source: Settings.java.
// 1 fields, 2 methods.

class Settings_Anon1: java.util.concurrent.ThreadFactory {
    private val counter: java.util.concurrent.atomic.AtomicInteger

    constructor()

    public fun newThread(p0: Runnable): Thread { return TODO("body: (Ljava/lang/Runnable;)Ljava/lang/Thread;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/Thread;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "FacebookSdk #"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/Settings$1;->counter:Ljava/util/concurrent/atomic/AtomicInteger;
    //         invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V
    //         return-object v0
    */

}
