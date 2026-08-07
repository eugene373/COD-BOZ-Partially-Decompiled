package com.facebook

// Auto-emitted from smali source: Session.java.
// 3 fields, 7 methods.

open class Session_TokenRefreshRequest: android.content.ServiceConnection {
    val messageReceiver: android.os.Messenger
    var messageSender: android.os.Messenger
    val this$0: com.facebook.Session

    constructor(p0: com.facebook.Session)

    private fun cleanup() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/Session$TokenRefreshRequest;->this$0:Lcom/facebook/Session;
    //         invoke-static {v0}, Lcom/facebook/Session;->access$1600(Lcom/facebook/Session;)Lcom/facebook/Session$TokenRefreshRequest;
    //         move-result-object v0
    //         if-ne v0, p0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session$TokenRefreshRequest;->this$0:Lcom/facebook/Session;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/facebook/Session;->access$1602(Lcom/facebook/Session;Lcom/facebook/Session$TokenRefreshRequest;)Lcom/facebook/Session$TokenRefreshRequest;
    //         :cond_0
    //         return-void
    */

    private fun refreshToken() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "access_token"
    //         iget-object v2, p0, Lcom/facebook/Session$TokenRefreshRequest;->this$0:Lcom/facebook/Session;
    //         invoke-virtual {v2}, Lcom/facebook/Session;->getTokenInfo()Lcom/facebook/AccessToken;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/Session$TokenRefreshRequest;->messageReceiver:Landroid/os/Messenger;
    //         iput-object v0, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session$TokenRefreshRequest;->messageSender:Landroid/os/Messenger;
    //         invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-direct {p0}, Lcom/facebook/Session$TokenRefreshRequest;->cleanup()V
    //         goto :goto_0
    */

    public fun bind() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/facebook/Session;->getStaticContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/NativeProtocol;->createTokenRefreshIntent(Landroid/content/Context;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Session;->access$1500()Landroid/content/Context;
    //         move-result-object v1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session$TokenRefreshRequest;->this$0:Lcom/facebook/Session;
    //         new-instance v1, Ljava/util/Date;
    //         invoke-direct {v1}, Ljava/util/Date;-><init>()V
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->setLastAttemptedTokenExtendDate(Ljava/util/Date;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/Session$TokenRefreshRequest;->cleanup()V
    //         goto :goto_0
    */

    public fun onServiceConnected(p0: android.content.ComponentName, p1: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/os/Messenger;
    //         invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V
    //         iput-object v0, p0, Lcom/facebook/Session$TokenRefreshRequest;->messageSender:Landroid/os/Messenger;
    //         invoke-direct {p0}, Lcom/facebook/Session$TokenRefreshRequest;->refreshToken()V
    //         return-void
    */

    public fun onServiceDisconnected(p0: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/facebook/Session$TokenRefreshRequest;->cleanup()V
    //         :try_start_0
    //         invoke-static {}, Lcom/facebook/Session;->access$1500()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

}
