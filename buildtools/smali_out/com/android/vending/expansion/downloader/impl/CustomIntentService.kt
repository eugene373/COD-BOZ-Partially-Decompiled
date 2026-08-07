package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: CustomIntentService.java.
// 6 fields, 9 methods.

open class CustomIntentService: android.app.Service() {
    private var mName: String
    private var mRedelivery: Boolean
    private var mServiceHandler: com.android.vending.expansion.downloader.impl.CustomIntentService.ServiceHandler
    private var mServiceLooper: android.os.Looper

    public constructor(p0: String)

    public fun onBind(p0: android.content.Intent): android.os.IBinder { return TODO("body: (Landroid/content/Intent;)Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onCreate() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-super {p0}, Landroid/app/Service;->onCreate()V
    //         new-instance v0, Landroid/os/HandlerThread;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "IntentService["
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mName:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "]"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
    //         invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceLooper:Landroid/os/Looper;
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceLooper:Landroid/os/Looper;
    //         invoke-direct {v0, p0, v1}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;-><init>(Lcom/android/vending/expansion/downloader/impl/CustomIntentService;Landroid/os/Looper;)V
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceHandler:Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;
    //         return-void
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceLooper:Landroid/os/Looper;
    //         invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceLooper:Landroid/os/Looper;
    //         invoke-virtual {v0}, Landroid/os/Looper;->quit()V
    //         const-string v0, "CancellableIntentService"
    //         const-string v1, "onDestroy"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    protected fun onHandleIntent(p0: android.content.Intent)

    public fun onStart(p0: android.content.Intent, p1: Int) { /* TODO(body): (Landroid/content/Intent;I)V */ }
    /*
    //         .locals 2
    //         const/16 v1, -0xa
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceHandler:Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;->hasMessages(I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceHandler:Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;->obtainMessage()Landroid/os/Message;
    //         move-result-object v0
    //         iput p2, v0, Landroid/os/Message;->arg1:I
    //         iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         iput v1, v0, Landroid/os/Message;->what:I
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mServiceHandler:Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;
    //         invoke-virtual {v1, v0}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;->sendMessage(Landroid/os/Message;)Z
    //         :cond_0
    //         return-void
    */

    public fun onStartCommand(p0: android.content.Intent, p1: Int, p2: Int): Int { return TODO("body: (Landroid/content/Intent;II)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p3}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->onStart(Landroid/content/Intent;I)V
    //         iget-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mRedelivery:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x3
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x2
    //         goto :goto_0
    */

    public fun setIntentRedelivery(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->mRedelivery:Z
    //         return-void
    */

    protected fun shouldStop(): Boolean

    companion object {
    private val LOG_TAG: String = "CancellableIntentService"
    private val WHAT_MESSAGE: Int = 0
    }
}
