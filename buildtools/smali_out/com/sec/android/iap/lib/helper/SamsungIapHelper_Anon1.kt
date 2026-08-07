package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 2 fields, 3 methods.

open class SamsungIapHelper_Anon1: android.content.ServiceConnection {
    val this$0: com.sec.android.iap.lib.helper.SamsungIapHelper
    private val val$_listener: com.sec.android.iap.lib.listener.OnIapBindListener

    constructor(p0: com.sec.android.iap.lib.helper.SamsungIapHelper, p1: com.sec.android.iap.lib.listener.OnIapBindListener)

    public fun onServiceConnected(_name: android.content.ComponentName, _service: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {p2}, Lcom/sec/android/iap/IAPConnector$Stub;->asInterface(Landroid/os/IBinder;)Lcom/sec/android/iap/IAPConnector;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$4(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/IAPConnector;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$6(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Lcom/sec/android/iap/IAPConnector;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const/4 v1, 0x1
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;
    //         invoke-interface {v0, v2}, Lcom/sec/android/iap/lib/listener/OnIapBindListener;->onBindIapFinished(I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->val$_listener:Lcom/sec/android/iap/lib/listener/OnIapBindListener;
    //         const/4 v1, 0x2
    //         invoke-interface {v0, v1}, Lcom/sec/android/iap/lib/listener/OnIapBindListener;->onBindIapFinished(I)V
    //         goto :goto_0
    */

    public fun onServiceDisconnected(_name: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "IAP Service Disconnected..."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$4(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/IAPConnector;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$5(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Landroid/content/ServiceConnection;)V
    //         return-void
    */

}
