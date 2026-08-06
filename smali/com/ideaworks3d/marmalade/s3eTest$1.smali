.class Lcom/ideaworks3d/marmalade/s3eTest$1;
.super Ljava/lang/Object;
.source "s3eTest.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eTest;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eTest;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eTest;)V
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eTest$1;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 21
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$1;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/s3eTest;->access$002(Lcom/ideaworks3d/marmalade/s3eTest;Landroid/os/Handler;)Landroid/os/Handler;

    .line 22
    return-void
.end method
