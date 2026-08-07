package com.facebook

// Auto-emitted from smali source: Session.java.
// 2 fields, 2 methods.

open class Session_TokenRefreshRequestHandler: android.os.Handler() {
    private var refreshRequestWeakReference: java.lang.ref.WeakReference
    private var sessionWeakReference: java.lang.ref.WeakReference

    constructor(p0: com.facebook.Session, p1: com.facebook.Session.TokenRefreshRequest)

    public fun handleMessage(p0: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "access_token"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/facebook/Session$TokenRefreshRequestHandler;->sessionWeakReference:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->extendTokenCompleted(Landroid/os/Bundle;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session$TokenRefreshRequestHandler;->refreshRequestWeakReference:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Session$TokenRefreshRequest;
    //         if-eqz v0, :cond_1
    //         invoke-static {}, Lcom/facebook/Session;->access$1500()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         invoke-static {v0}, Lcom/facebook/Session$TokenRefreshRequest;->access$1700(Lcom/facebook/Session$TokenRefreshRequest;)V
    //         :cond_1
    //         return-void
    */

}
