package com.google.android.gms.common

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class a: android.content.ServiceConnection {
    var HC: Boolean
    private val HD: java.util.concurrent.BlockingQueue

    public constructor()

    public fun fW(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/InterruptedException;
    //             }
    //         .end annotation
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/a;->HC:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/a;->HC:Z
    //         iget-object v0, p0, Lcom/google/android/gms/common/a;->HD:Ljava/util/concurrent/BlockingQueue;
    //         invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/IBinder;
    //         return-object v0
    */

    public fun onServiceConnected(name: android.content.ComponentName, service: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/a;->HD:Ljava/util/concurrent/BlockingQueue;
    //         invoke-interface {v0, p2}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun onServiceDisconnected(name: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
