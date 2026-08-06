.class Lcom/ideaworks3d/marmalade/LoaderView$3;
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
    .line 236
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$3;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 239
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$3;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 240
    const/16 v1, 0x1a

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    .line 241
    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v2, v3}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 242
    return-void
.end method
