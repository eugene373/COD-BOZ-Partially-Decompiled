.class final Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;
.super Ljava/lang/Object;
.source "s3eFacebook.java"

# interfaces
.implements Lcom/facebook/widget/WebDialog$OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3eFacebook$s3eFBDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "FBDialogOnCompleteListener"
.end annotation


# instance fields
.field final synthetic this$1:Ls3eFacebook$s3eFBDialog;


# direct methods
.method private constructor <init>(Ls3eFacebook$s3eFBDialog;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ls3eFacebook$s3eFBDialog;Ls3eFacebook$1;)V
    .locals 0

    .prologue
    .line 429
    invoke-direct {p0, p1}, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;-><init>(Ls3eFacebook$s3eFBDialog;)V

    return-void
.end method


# virtual methods
.method public onComplete(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 434
    if-eqz p1, :cond_0

    .line 437
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v1, v0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;

    .line 438
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dialog onComplete: values: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 440
    :cond_0
    if-nez p2, :cond_1

    .line 443
    const-string v0, "s3eFacebook"

    const-string v1, "Dialog onComplete: success"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 444
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Complete:Z

    .line 445
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V

    .line 475
    :goto_0
    return-void

    .line 447
    :cond_1
    instance-of v0, p2, Lcom/facebook/FacebookOperationCanceledException;

    if-eqz v0, :cond_2

    .line 450
    const-string v0, "s3eFacebook"

    const-string v1, "Dialog onComplete: cancelled"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 451
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Cancelled:Z

    .line 452
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V

    goto :goto_0

    .line 454
    :cond_2
    instance-of v0, p2, Lcom/facebook/FacebookDialogException;

    if-eqz v0, :cond_3

    .line 457
    check-cast p2, Lcom/facebook/FacebookDialogException;

    .line 458
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    new-instance v1, Ls3eFacebook$s3eFBDialog$DialogErrorData;

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-direct {v1, v2, v5}, Ls3eFacebook$s3eFBDialog$DialogErrorData;-><init>(Ls3eFacebook$s3eFBDialog;Ls3eFacebook$1;)V

    iput-object v1, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    .line 459
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getErrorCode()I

    move-result v1

    iput v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorCode:I

    .line 460
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;

    .line 461
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getFailingUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->failingURL:Ljava/lang/String;

    .line 462
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Error:Z

    .line 463
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dialog onComplete: exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v2, v2, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    iget-object v2, v2, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 464
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V

    goto :goto_0

    .line 469
    :cond_3
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dialog onComplete: error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 470
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    new-instance v1, Ls3eFacebook$s3eFBDialog$DialogErrorData;

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-direct {v1, v2, v5}, Ls3eFacebook$s3eFBDialog$DialogErrorData;-><init>(Ls3eFacebook$s3eFBDialog;Ls3eFacebook$1;)V

    iput-object v1, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    .line 471
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    invoke-virtual {p2}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;

    .line 472
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Error:Z

    .line 473
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V

    goto/16 :goto_0
.end method
