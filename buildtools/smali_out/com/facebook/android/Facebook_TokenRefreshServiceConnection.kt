package com.facebook.android

// Auto-emitted from smali source: Facebook.java.
// 5 fields, 4 methods.

open class Facebook_TokenRefreshServiceConnection: android.content.ServiceConnection {
    val applicationsContext: android.content.Context
    val messageReceiver: android.os.Messenger
    var messageSender: android.os.Messenger
    val serviceListener: com.facebook.android.Facebook.ServiceListener
    val this$0: com.facebook.android.Facebook

    public constructor(p0: com.facebook.android.Facebook, p1: android.content.Context, p2: com.facebook.android.Facebook.ServiceListener)

    private fun refreshToken() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "access_token"
    //         iget-object v2, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {v2}, Lcom/facebook/android/Facebook;->access$100(Lcom/facebook/android/Facebook;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageReceiver:Landroid/os/Messenger;
    //         iput-object v0, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;
    //         invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;
    //         new-instance v1, Ljava/lang/Error;
    //         const-string v2, "Service connection error"
    //         invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V
    //         invoke-interface {v0, v1}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V
    //         goto :goto_0
    */

    public fun onServiceConnected(p0: android.content.ComponentName, p1: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/os/Messenger;
    //         invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V
    //         iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;
    //         invoke-direct {p0}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->refreshToken()V
    //         return-void
    */

    public fun onServiceDisconnected(p0: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;
    //         new-instance v1, Ljava/lang/Error;
    //         const-string v2, "Service disconnected"
    //         invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V
    //         invoke-interface {v0, v1}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->applicationsContext:Landroid/content/Context;
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
