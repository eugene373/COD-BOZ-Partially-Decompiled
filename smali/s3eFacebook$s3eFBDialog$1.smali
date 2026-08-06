.class Ls3eFacebook$s3eFBDialog$1;
.super Ljava/lang/Object;
.source "s3eFacebook.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls3eFacebook$s3eFBDialog;->Show()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Ls3eFacebook$s3eFBDialog;


# direct methods
.method constructor <init>(Ls3eFacebook$s3eFBDialog;)V
    .locals 0

    .prologue
    .line 536
    iput-object p1, p0, Ls3eFacebook$s3eFBDialog$1;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 538
    iget-object v6, p0, Ls3eFacebook$s3eFBDialog$1;->this$1:Ls3eFacebook$s3eFBDialog;

    new-instance v0, Lcom/facebook/widget/WebDialog;

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog$1;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v2, v2, Ls3eFacebook$s3eFBDialog;->m_Action:Ljava/lang/String;

    iget-object v3, p0, Ls3eFacebook$s3eFBDialog$1;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v3, v3, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;

    const v4, 0x1030010

    invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/WebDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/widget/WebDialog$OnCompleteListener;)V

    iput-object v0, v6, Ls3eFacebook$s3eFBDialog;->m_Dialog:Lcom/facebook/widget/WebDialog;

    .line 539
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$1;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_Dialog:Lcom/facebook/widget/WebDialog;

    new-instance v1, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;

    iget-object v2, p0, Ls3eFacebook$s3eFBDialog$1;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-direct {v1, v2, v5}, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;-><init>(Ls3eFacebook$s3eFBDialog;Ls3eFacebook$1;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/WebDialog;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)V

    .line 540
    iget-object v0, p0, Ls3eFacebook$s3eFBDialog$1;->this$1:Ls3eFacebook$s3eFBDialog;

    iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_Dialog:Lcom/facebook/widget/WebDialog;

    invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->show()V

    .line 541
    return-void
.end method
