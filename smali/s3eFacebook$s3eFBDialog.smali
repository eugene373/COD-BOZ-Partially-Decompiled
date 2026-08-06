.class Ls3eFacebook$s3eFBDialog;
.super Ljava/lang/Object;
.source "s3eFacebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3eFacebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "s3eFBDialog"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3eFacebook$s3eFBDialog$DialogErrorData;,
        Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;
    }
.end annotation


# instance fields
.field m_Action:Ljava/lang/String;

.field m_Bundle:Landroid/os/Bundle;

.field m_Cancelled:Z

.field m_Complete:Z

.field m_Dialog:Lcom/facebook/widget/WebDialog;

.field m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

.field m_Error:Z

.field m_Params:Landroid/os/Bundle;

.field m_s3eSession:Ls3eFacebook$s3eFBSession;

.field final synthetic this$0:Ls3eFacebook;


# direct methods
.method constructor <init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 503
    iput-object p1, p0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 504
    iput-object p3, p0, Ls3eFacebook$s3eFBDialog;->m_Action:Ljava/lang/String;

    .line 505
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    .line 506
    iput-object p2, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    .line 513
    const-string v0, "ouath"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 514
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    const-string v1, "type"

    const-string v2, "user_agent"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    const-string v1, "client_id"

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    iget-object v2, v2, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    :goto_0
    return-void

    .line 518
    :cond_0
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBDialog app_id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    iget-object v2, v2, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " access_token="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    invoke-virtual {v2}, Ls3eFacebook$s3eFBSession;->GetAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 519
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    const-string v1, "app_id"

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    iget-object v2, v2, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    const-string v1, "access_token"

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    invoke-virtual {v2}, Ls3eFacebook$s3eFBSession;->GetAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private isSessionValid()Z
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    iget-object v0, v0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method AddParamLong(Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 531
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    return-void
.end method

.method AddParamString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 526
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    return-void
.end method

.method GetCancelled()Z
    .locals 1

    .prologue
    .line 558
    iget-boolean v0, p0, Ls3eFacebook$s3eFBDialog;->m_Cancelled:Z

    return v0
.end method

.method GetComplete()Z
    .locals 1

    .prologue
    .line 548
    iget-boolean v0, p0, Ls3eFacebook$s3eFBDialog;->m_Complete:Z

    return v0
.end method

.method GetError()Z
    .locals 1

    .prologue
    .line 553
    iget-boolean v0, p0, Ls3eFacebook$s3eFBDialog;->m_Error:Z

    return v0
.end method

.method GetErrorCode()I
    .locals 1

    .prologue
    .line 563
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    if-eqz v0, :cond_0

    .line 564
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    iget v0, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorCode:I

    .line 565
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method GetErrorString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 570
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    if-eqz v0, :cond_0

    .line 571
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;

    .line 572
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method GetFailureURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 577
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    if-eqz v0, :cond_0

    .line 578
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->failingURL:Ljava/lang/String;

    .line 579
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method GetSuccessURL(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 584
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;

    if-nez v0, :cond_1

    .line 585
    const/4 v1, 0x0

    .line 600
    :cond_0
    :goto_0
    return-object v1

    .line 587
    :cond_1
    if-nez p1, :cond_3

    .line 590
    const-string v1, ""

    .line 591
    const/4 v0, 0x0

    .line 592
    iget-object v2, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;

    invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 593
    if-lez v2, :cond_2

    .line 594
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "&"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 595
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 596
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 597
    goto :goto_1

    .line 600
    :cond_3
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method Show()I
    .locals 2

    .prologue
    .line 536
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    new-instance v1, Ls3eFacebook$s3eFBDialog$1;

    invoke-direct {v1, p0}, Ls3eFacebook$s3eFBDialog$1;-><init>(Ls3eFacebook$s3eFBDialog;)V

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 543
    const/4 v0, 0x0

    return v0
.end method
