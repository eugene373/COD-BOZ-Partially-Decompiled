.class public Lcom/facebook/internal/SessionTracker;
.super Ljava/lang/Object;
.source "SessionTracker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/SessionTracker$1;,
        Lcom/facebook/internal/SessionTracker$CallbackWrapper;,
        Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;
    }
.end annotation


# instance fields
.field private final broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

.field private final callback:Lcom/facebook/Session$StatusCallback;

.field private isTracking:Z

.field private final receiver:Landroid/content/BroadcastReceiver;

.field private session:Lcom/facebook/Session;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/internal/SessionTracker;-><init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;Lcom/facebook/Session;)V

    .line 49
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;Lcom/facebook/Session;)V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/internal/SessionTracker;-><init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;Lcom/facebook/Session;Z)V

    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;Lcom/facebook/Session;Z)V
    .locals 2

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z

    .line 73
    new-instance v0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;

    invoke-direct {v0, p0, p2}, Lcom/facebook/internal/SessionTracker$CallbackWrapper;-><init>(Lcom/facebook/internal/SessionTracker;Lcom/facebook/Session$StatusCallback;)V

    iput-object v0, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    .line 74
    iput-object p3, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    .line 75
    new-instance v0, Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;-><init>(Lcom/facebook/internal/SessionTracker;Lcom/facebook/internal/SessionTracker$1;)V

    iput-object v0, p0, Lcom/facebook/internal/SessionTracker;->receiver:Landroid/content/BroadcastReceiver;

    .line 76
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/SessionTracker;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    .line 78
    if-eqz p4, :cond_0

    .line 79
    invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->startTracking()V

    .line 81
    :cond_0
    return-void
.end method

.method static synthetic access$100(Lcom/facebook/internal/SessionTracker;)Lcom/facebook/Session$StatusCallback;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    return-object v0
.end method

.method static synthetic access$200(Lcom/facebook/internal/SessionTracker;)Lcom/facebook/Session;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    return-object v0
.end method

.method private addBroadcastReceiver()V
    .locals 3

    .prologue
    .line 195
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 196
    const-string v1, "com.facebook.sdk.ACTIVE_SESSION_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 197
    const-string v1, "com.facebook.sdk.ACTIVE_SESSION_UNSET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 201
    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v2, p0, Lcom/facebook/internal/SessionTracker;->receiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 202
    return-void
.end method


# virtual methods
.method public getOpenSession()Lcom/facebook/Session;
    .locals 2

    .prologue
    .line 99
    invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;

    move-result-object v0

    .line 100
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 103
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getSession()Lcom/facebook/Session;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    goto :goto_0
.end method

.method public isTracking()Z
    .locals 1

    .prologue
    .line 182
    iget-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z

    return v0
.end method

.method public isTrackingActiveSession()Z
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setSession(Lcom/facebook/Session;)V
    .locals 2

    .prologue
    .line 112
    if-nez p1, :cond_1

    .line 113
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    .line 118
    invoke-direct {p0}, Lcom/facebook/internal/SessionTracker;->addBroadcastReceiver()V

    .line 119
    invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    if-nez v0, :cond_3

    .line 127
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 128
    if-eqz v0, :cond_2

    .line 129
    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 131
    :cond_2
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->receiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 138
    :goto_1
    iput-object p1, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    .line 139
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V

    goto :goto_0

    .line 136
    :cond_3
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    goto :goto_1
.end method

.method public startTracking()V
    .locals 2

    .prologue
    .line 147
    iget-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z

    if-eqz v0, :cond_0

    .line 158
    :goto_0
    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->session:Lcom/facebook/Session;

    if-nez v0, :cond_1

    .line 151
    invoke-direct {p0}, Lcom/facebook/internal/SessionTracker;->addBroadcastReceiver()V

    .line 154
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 155
    invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 157
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z

    goto :goto_0
.end method

.method public stopTracking()V
    .locals 2

    .prologue
    .line 165
    iget-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z

    if-nez v0, :cond_0

    .line 174
    :goto_0
    return-void

    .line 168
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;

    move-result-object v0

    .line 169
    if-eqz v0, :cond_1

    .line 170
    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/facebook/internal/SessionTracker;->receiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/internal/SessionTracker;->isTracking:Z

    goto :goto_0
.end method
