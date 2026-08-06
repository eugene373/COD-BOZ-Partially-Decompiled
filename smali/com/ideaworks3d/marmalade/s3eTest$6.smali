.class Lcom/ideaworks3d/marmalade/s3eTest$6;
.super Ljava/lang/Object;
.source "s3eTest.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eTest;->PostRotate(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eTest;

.field final synthetic val$h:I

.field final synthetic val$w:I


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eTest;II)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eTest$6;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    iput p2, p0, Lcom/ideaworks3d/marmalade/s3eTest$6;->val$w:I

    iput p3, p0, Lcom/ideaworks3d/marmalade/s3eTest$6;->val$h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 113
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v3, p0, Lcom/ideaworks3d/marmalade/s3eTest$6;->val$w:I

    iget v4, p0, Lcom/ideaworks3d/marmalade/s3eTest$6;->val$h:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/ideaworks3d/marmalade/LoaderView;->surfaceChanged(Landroid/view/SurfaceHolder;III)V

    .line 114
    return-void
.end method
