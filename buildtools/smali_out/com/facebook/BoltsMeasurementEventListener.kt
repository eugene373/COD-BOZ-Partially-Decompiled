package com.facebook

// Auto-emitted from smali source: BoltsMeasurementEventListener.java.
// 6 fields, 6 methods.

open class BoltsMeasurementEventListener: android.content.BroadcastReceiver() {
    private var applicationContext: android.content.Context

    private constructor(p0: android.content.Context)

    private fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/BoltsMeasurementEventListener;->applicationContext:Landroid/content/Context;
    //         invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         return-void
    */

    private fun open() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/BoltsMeasurementEventListener;->applicationContext:Landroid/content/Context;
    //         invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/IntentFilter;
    //         const-string v2, "com.parse.bolts.measurement_event"
    //         invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0, p0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    //         return-void
    */

    protected fun finalize() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Throwable;
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-direct {p0}, Lcom/facebook/BoltsMeasurementEventListener;->close()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-super {p0}, Ljava/lang/Object;->finalize()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-super {p0}, Ljava/lang/Object;->finalize()V
    //         throw v0
    */

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 9
    //         invoke-static {p1}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "bf_"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, "event_name"
    //         invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "event_args"
    //         invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v3
    //         new-instance v4, Landroid/os/Bundle;
    //         invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v6, "[^0-9a-zA-Z _-]"
    //         const-string v7, "-"
    //         invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         const-string v7, "^[ -]*"
    //         const-string v8, ""
    //         invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         const-string v7, "[ -]*$"
    //         const-string v8, ""
    //         invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v4, v6, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v1, v2, v4}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    companion object {
    private val BOLTS_MEASUREMENT_EVENT_PREFIX: String = "bf_"
    private val MEASUREMENT_EVENT_ARGS_KEY: String = "event_args"
    private val MEASUREMENT_EVENT_NAME_KEY: String = "event_name"
    private val MEASUREMENT_EVENT_NOTIFICATION_NAME: String = "com.parse.bolts.measurement_event"
    private var _instance: com.facebook.BoltsMeasurementEventListener

    @JvmStatic fun getInstance(p0: android.content.Context): com.facebook.BoltsMeasurementEventListener { return TODO("body: (Landroid/content/Context;)Lcom/facebook/BoltsMeasurementEventListener;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/BoltsMeasurementEventListener;->_instance:Lcom/facebook/BoltsMeasurementEventListener;
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/facebook/BoltsMeasurementEventListener;->_instance:Lcom/facebook/BoltsMeasurementEventListener;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/facebook/BoltsMeasurementEventListener;
    //         invoke-direct {v0, p0}, Lcom/facebook/BoltsMeasurementEventListener;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/facebook/BoltsMeasurementEventListener;->_instance:Lcom/facebook/BoltsMeasurementEventListener;
    //         sget-object v0, Lcom/facebook/BoltsMeasurementEventListener;->_instance:Lcom/facebook/BoltsMeasurementEventListener;
    //         invoke-direct {v0}, Lcom/facebook/BoltsMeasurementEventListener;->open()V
    //         sget-object v0, Lcom/facebook/BoltsMeasurementEventListener;->_instance:Lcom/facebook/BoltsMeasurementEventListener;
    //         goto :goto_0
    */

    }
}
