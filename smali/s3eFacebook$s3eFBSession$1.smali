.class Ls3eFacebook$s3eFBSession$1;
.super Ljava/lang/Object;
.source "s3eFacebook.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls3eFacebook$s3eFBSession;->ReauthorizeWithPermissions([Ljava/lang/String;IZ)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Ls3eFacebook$s3eFBSession;


# direct methods
.method constructor <init>(Ls3eFacebook$s3eFBSession;)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 352
    if-eqz p1, :cond_0

    .line 353
    invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 355
    :cond_0
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

    .line 356
    if-nez p3, :cond_1

    .line 358
    iget-object v0, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ls3eFacebook;->nativeReauthorizeCallback(Ljava/lang/Object;Z)V

    .line 365
    :goto_0
    return-void

    .line 362
    :cond_1
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 363
    iget-object v0, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ls3eFacebook;->nativeReauthorizeCallback(Ljava/lang/Object;Z)V

    goto :goto_0
.end method
