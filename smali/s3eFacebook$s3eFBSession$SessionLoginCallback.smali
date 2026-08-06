.class Ls3eFacebook$s3eFBSession$SessionLoginCallback;
.super Ljava/lang/Object;
.source "s3eFacebook.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3eFacebook$s3eFBSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SessionLoginCallback"
.end annotation


# instance fields
.field final synthetic this$1:Ls3eFacebook$s3eFBSession;


# direct methods
.method private constructor <init>(Ls3eFacebook$s3eFBSession;)V
    .locals 0

    .prologue
    .line 389
    iput-object p1, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ls3eFacebook$s3eFBSession;Ls3eFacebook$1;)V
    .locals 0

    .prologue
    .line 389
    invoke-direct {p0, p1}, Ls3eFacebook$s3eFBSession$SessionLoginCallback;-><init>(Ls3eFacebook$s3eFBSession;)V

    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 393
    const-string v0, "s3eFacebook"

    const-string v1, "Login callback call"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 394
    if-eqz p3, :cond_1

    .line 397
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Login exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 398
    invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 399
    iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V

    .line 423
    :cond_0
    :goto_0
    return-void

    .line 403
    :cond_1
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "StatusCallback state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/SessionState;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 404
    sget-object v0, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;

    if-ne p2, v0, :cond_3

    .line 406
    iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v1

    .line 407
    const-string v0, "Opened with "

    .line 408
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 410
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 411
    goto :goto_1

    .line 412
    :cond_2
    const-string v0, "s3eFacebook"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 414
    invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 415
    iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V

    goto :goto_0

    .line 417
    :cond_3
    sget-object v0, Lcom/facebook/SessionState;->CLOSED_LOGIN_FAILED:Lcom/facebook/SessionState;

    if-ne p2, v0, :cond_0

    .line 419
    invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 420
    iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;

    invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V

    goto :goto_0
.end method
