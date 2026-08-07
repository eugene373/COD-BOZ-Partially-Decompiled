package com.facebook.internal

// Auto-emitted from smali source: PlatformServiceClient.java.
// 9 fields, 11 methods.

open class PlatformServiceClient: android.content.ServiceConnection {
    private val applicationId: String
    private val context: android.content.Context
    private val handler: android.os.Handler
    private var listener: com.facebook.internal.PlatformServiceClient.CompletedListener
    private val protocolVersion: Int
    private var replyMessage: Int
    private var requestMessage: Int
    private var running: Boolean
    private var sender: android.os.Messenger

    public constructor(p0: android.content.Context, p1: Int, p2: Int, p3: Int, p4: String)

    private fun callback(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z
    //         iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->listener:Lcom/facebook/internal/PlatformServiceClient$CompletedListener;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p1}, Lcom/facebook/internal/PlatformServiceClient$CompletedListener;->completed(Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    private fun sendMessage() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "com.facebook.platform.extra.APPLICATION_ID"
    //         iget-object v2, p0, Lcom/facebook/internal/PlatformServiceClient;->applicationId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/PlatformServiceClient;->populateRequestBundle(Landroid/os/Bundle;)V
    //         iget v1, p0, Lcom/facebook/internal/PlatformServiceClient;->requestMessage:I
    //         invoke-static {v3, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
    //         move-result-object v1
    //         iget v2, p0, Lcom/facebook/internal/PlatformServiceClient;->protocolVersion:I
    //         iput v2, v1, Landroid/os/Message;->arg1:I
    //         invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
    //         new-instance v0, Landroid/os/Messenger;
    //         iget-object v2, p0, Lcom/facebook/internal/PlatformServiceClient;->handler:Landroid/os/Handler;
    //         invoke-direct {v0, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V
    //         iput-object v0, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->sender:Landroid/os/Messenger;
    //         invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-direct {p0, v3}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z
    //         return-void
    */

    protected fun getContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;
    //         return-object v0
    */

    protected fun handleMessage(p0: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 2
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         iget v1, p0, Lcom/facebook/internal/PlatformServiceClient;->replyMessage:I
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "com.facebook.platform.status.ERROR_TYPE"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun onServiceConnected(p0: android.content.ComponentName, p1: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/os/Messenger;
    //         invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V
    //         iput-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->sender:Landroid/os/Messenger;
    //         invoke-direct {p0}, Lcom/facebook/internal/PlatformServiceClient;->sendMessage()V
    //         return-void
    */

    public fun onServiceDisconnected(p0: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/facebook/internal/PlatformServiceClient;->sender:Landroid/os/Messenger;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         invoke-direct {p0, v1}, Lcom/facebook/internal/PlatformServiceClient;->callback(Landroid/os/Bundle;)V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    protected fun populateRequestBundle(p0: android.os.Bundle)

    public fun setCompletedListener(p0: com.facebook.internal.PlatformServiceClient.CompletedListener) { /* TODO(body): (Lcom/facebook/internal/PlatformServiceClient$CompletedListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/internal/PlatformServiceClient;->listener:Lcom/facebook/internal/PlatformServiceClient$CompletedListener;
    //         return-void
    */

    public fun start(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         iget-boolean v2, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z
    //         if-eqz v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v2, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;
    //         iget v3, p0, Lcom/facebook/internal/PlatformServiceClient;->protocolVersion:I
    //         invoke-static {v2, v3}, Lcom/facebook/internal/NativeProtocol;->getLatestAvailableProtocolVersionForService(Landroid/content/Context;I)I
    //         move-result v2
    //         const/4 v3, -0x1
    //         if-eq v2, v3, :cond_0
    //         iget-object v2, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;
    //         invoke-static {v2}, Lcom/facebook/internal/NativeProtocol;->createPlatformServiceIntent(Landroid/content/Context;)Landroid/content/Intent;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         iput-boolean v1, p0, Lcom/facebook/internal/PlatformServiceClient;->running:Z
    //         iget-object v0, p0, Lcom/facebook/internal/PlatformServiceClient;->context:Landroid/content/Context;
    //         invoke-virtual {v0, v2, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move v0, v1
    //         goto :goto_0
    */

}
