package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class n_b: android.os.Handler() {
    private val aop: com.google.android.gms.tagmanager.ContainerHolder.ContainerAvailableListener
    val aoq: com.google.android.gms.tagmanager.n

    public constructor(p0: com.google.android.gms.tagmanager.n, p1: com.google.android.gms.tagmanager.ContainerHolder.ContainerAvailableListener, p2: android.os.Looper)

    public fun cs(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/tagmanager/n$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/n$b;->sendMessage(Landroid/os/Message;)Z
    //         return-void
    */

    protected fun ct(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/n$b;->aop:Lcom/google/android/gms/tagmanager/ContainerHolder$ContainerAvailableListener;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/n$b;->aoq:Lcom/google/android/gms/tagmanager/n;
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/tagmanager/ContainerHolder$ContainerAvailableListener;->onContainerAvailable(Lcom/google/android/gms/tagmanager/ContainerHolder;Ljava/lang/String;)V
    //         return-void
    */

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 1
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         packed-switch v0, :pswitch_data_0
    //         const-string v0, "Don\'t know how to handle this message."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/n$b;->ct(Ljava/lang/String;)V
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //         .end packed-switch
    */

}
