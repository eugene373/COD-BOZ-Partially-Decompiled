.class Lcom/ideaworks3d/marmalade/LoaderThread$3;
.super Ljava/lang/Object;
.source "LoaderThread.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderThread;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderThread;)V
    .locals 0

    .prologue
    .line 525
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$3;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 528
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$3;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$1000(Lcom/ideaworks3d/marmalade/LoaderThread;)V

    .line 529
    return-void
.end method
