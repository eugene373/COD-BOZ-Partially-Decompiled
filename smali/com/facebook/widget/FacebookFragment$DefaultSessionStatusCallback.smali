.class Lcom/facebook/widget/FacebookFragment$DefaultSessionStatusCallback;
.super Ljava/lang/Object;
.source "FacebookFragment.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DefaultSessionStatusCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/FacebookFragment;


# direct methods
.method private constructor <init>(Lcom/facebook/widget/FacebookFragment;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lcom/facebook/widget/FacebookFragment$DefaultSessionStatusCallback;->this$0:Lcom/facebook/widget/FacebookFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/FacebookFragment;Lcom/facebook/widget/FacebookFragment$1;)V
    .locals 0

    .prologue
    .line 287
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookFragment$DefaultSessionStatusCallback;-><init>(Lcom/facebook/widget/FacebookFragment;)V

    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/widget/FacebookFragment$DefaultSessionStatusCallback;->this$0:Lcom/facebook/widget/FacebookFragment;

    invoke-virtual {v0, p2, p3}, Lcom/facebook/widget/FacebookFragment;->onSessionStateChange(Lcom/facebook/SessionState;Ljava/lang/Exception;)V

    .line 294
    return-void
.end method
