.class Lcom/ideaworks3d/marmalade/s3eTest$4;
.super Ljava/lang/Object;
.source "s3eTest.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eTest;->PostSetFocus(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eTest;

.field final synthetic val$focus:Z


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eTest;Z)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eTest$4;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    iput-boolean p2, p0, Lcom/ideaworks3d/marmalade/s3eTest$4;->val$focus:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 58
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$4;->val$focus:Z

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView;->onWindowFocusChanged(Z)V

    .line 59
    return-void
.end method
