.class Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SessionTracker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/SessionTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ActiveSessionBroadcastReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/SessionTracker;


# direct methods
.method private constructor <init>(Lcom/facebook/internal/SessionTracker;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;->this$0:Lcom/facebook/internal/SessionTracker;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/internal/SessionTracker;Lcom/facebook/internal/SessionTracker$1;)V
    .locals 0

    .prologue
    .line 208
    invoke-direct {p0, p1}, Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;-><init>(Lcom/facebook/internal/SessionTracker;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 211
    const-string v0, "com.facebook.sdk.ACTIVE_SESSION_SET"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 213
    if-eqz v0, :cond_0

    .line 214
    iget-object v1, p0, Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;->this$0:Lcom/facebook/internal/SessionTracker;

    invoke-static {v1}, Lcom/facebook/internal/SessionTracker;->access$100(Lcom/facebook/internal/SessionTracker;)Lcom/facebook/Session$StatusCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 217
    :cond_0
    return-void
.end method
