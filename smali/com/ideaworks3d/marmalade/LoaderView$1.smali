.class Lcom/ideaworks3d/marmalade/LoaderView$1;
.super Ljava/lang/Object;
.source "LoaderView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderView;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderView;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$000(Lcom/ideaworks3d/marmalade/LoaderView;)V

    .line 226
    return-void
.end method
