package com.google.android.gms.gcm

// Auto-emitted from smali.
// 11 fields, 11 methods.

open class GoogleCloudMessaging {
    private var adw: android.app.PendingIntent
    val adx: java.util.concurrent.BlockingQueue
    private var ady: android.os.Handler
    private var adz: android.os.Messenger
    private var lB: android.content.Context

    public constructor()

    private fun a(p0: String, p1: String, p2: Long, p3: Int, p4: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;JILandroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "MAIN_THREAD"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         if-nez p1, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Missing \'to\'"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "com.google.android.gcm.intent.SEND"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0, p6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->j(Landroid/content/Intent;)V
    //         const-string v1, "com.google.android.gms"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "google.to"
    //         invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "google.message_id"
    //         invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "google.ttl"
    //         invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "google.delay"
    //         invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->lB:Landroid/content/Context;
    //         const-string v2, "com.google.android.gtalkservice.permission.GTALK_SERVICE"
    //         invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
    //         return-void
    */

    private fun d(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->e([Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "com.google.android.c2dm.intent.REGISTER"
    //         invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v2, "com.google.android.gms"
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "google.messenger"
    //         iget-object v3, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->adz:Landroid/os/Messenger;
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->j(Landroid/content/Intent;)V
    //         const-string v2, "sender"
    //         invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->lB:Landroid/content/Context;
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         return-void
    */

    private fun lN() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "com.google.android.c2dm.intent.UNREGISTER"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v1, "com.google.android.gms"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->adx:Ljava/util/concurrent/BlockingQueue;
    //         invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->clear()V
    //         const-string v1, "google.messenger"
    //         iget-object v2, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->adz:Landroid/os/Messenger;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->j(Landroid/content/Intent;)V
    //         iget-object v1, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->lB:Landroid/content/Context;
    //         invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         return-void
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->lO()V
    //         return-void
    */

    fun e(p0: Array<String>): String { return TODO("body: ([Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         if-eqz p1, :cond_0
    //         array-length v0, p1
    //         if-nez v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "No senderIds"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const/4 v0, 0x0
    //         aget-object v0, p1, v0
    //         invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         array-length v2, p1
    //         if-ge v0, v2, :cond_2
    //         const/16 v2, 0x2c
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         aget-object v3, p1, v0
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMessageType(intent: android.content.Intent): String { return TODO("body: (Landroid/content/Intent;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "com.google.android.c2dm.intent.RECEIVE"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v0, "message_type"
    //         invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "gcm"
    //         goto :goto_0
    */

    public fun register(senderIds: Array<String>): String { return TODO("body: ([Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "MAIN_THREAD"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->adx:Ljava/util/concurrent/BlockingQueue;
    //         invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->d([Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->adx:Ljava/util/concurrent/BlockingQueue;
    //         const-wide/16 v2, 0x1388
    //         sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "SERVICE_NOT_AVAILABLE"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_1
    //         :try_start_1
    //         const-string v1, "registration_id"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         return-object v1
    //         :cond_2
    //         const-string v1, "error"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         const-string v1, "error"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_3
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "SERVICE_NOT_AVAILABLE"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    */

    public fun send(to: String, msgId: String, timeToLive: Long, data: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V */ }
    /*
    //         .locals 9
    //         const/4 v6, -0x1
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-wide v4, p3
    //         move-object v7, p5
    //         invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->a(Ljava/lang/String;Ljava/lang/String;JILandroid/os/Bundle;)V
    //         return-void
    */

    public fun send(to: String, msgId: String, data: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 7
    //         const-wide/16 v4, -0x1
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v6, p3
    //         invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->send(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V
    //         return-void
    */

    public fun unregister() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "MAIN_THREAD"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->lN()V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->adx:Ljava/util/concurrent/BlockingQueue;
    //         const-wide/16 v2, 0x1388
    //         sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "SERVICE_NOT_AVAILABLE"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_1
    //         :try_start_1
    //         const-string v1, "unregistered"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         return-void
    //         :cond_2
    //         const-string v1, "error"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_3
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "SERVICE_NOT_AVAILABLE"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    */

    companion object {
    @JvmField public val ERROR_MAIN_THREAD: String = "MAIN_THREAD"
    @JvmField public val ERROR_SERVICE_NOT_AVAILABLE: String = "SERVICE_NOT_AVAILABLE"
    @JvmField public val MESSAGE_TYPE_DELETED: String = "deleted_messages"
    @JvmField public val MESSAGE_TYPE_MESSAGE: String = "gcm"
    @JvmField public val MESSAGE_TYPE_SEND_ERROR: String = "send_error"
    var adv: com.google.android.gms.gcm.GoogleCloudMessaging
    }
}
