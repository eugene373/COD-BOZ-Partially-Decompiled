package com.facebook.internal

// Auto-emitted from smali source: SessionTracker.java.
// 5 fields, 13 methods.

open class SessionTracker {
    private val broadcastManager: android.support.v4.content.LocalBroadcastManager
    private val callback: com.facebook.Session.StatusCallback
    private var isTracking: Boolean
    private val receiver: android.content.BroadcastReceiver
    private var session: com.facebook.Session

    public constructor(p0: android.content.Context, p1: com.facebook.Session.StatusCallback)

    constructor(p0: android.content.Context, p1: com.facebook.Session.StatusCallback, p2: com.facebook.Session)

    public constructor(p0: android.content.Context, p1: com.facebook.Session.StatusCallback, p2: com.facebook.Session, p3: Boolean)

    private fun addBroadcastReceiver() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/IntentFilter;
    //         invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
    //         const-string v1, "com.facebook.sdk.ACTIVE_SESSION_SET"
    //         invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         const-string v1, "com.facebook.sdk.ACTIVE_SESSION_UNSET"
    //         invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;
    //         iget-object v2, p0, Lcom/facebook/internal/SessionTracker;->receiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v1, v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    //         return-void
    */

    public fun getOpenSession(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getSession(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         goto :goto_0
    */

    public fun isTracking(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z
    //         return v0
    */

    public fun isTrackingActiveSession(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_1
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         invoke-direct {p0}, Lcom/facebook/internal/SessionTracker;->addBroadcastReceiver()V
    //         invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         if-nez v0, :cond_3
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->receiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         :goto_1
    //         iput-object p1, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         goto :goto_0
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         goto :goto_1
    */

    public fun startTracking() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;
    //         if-nez v0, :cond_1
    //         invoke-direct {p0}, Lcom/facebook/internal/SessionTracker;->addBroadcastReceiver()V
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_2
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z
    //         goto :goto_0
    */

    public fun stopTracking() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->receiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z
    //         goto :goto_0
    */

}
