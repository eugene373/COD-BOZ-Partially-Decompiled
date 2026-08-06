.class Lcom/ideaworks3d/marmalade/LoaderActivity$1;
.super Landroid/view/OrientationEventListener;
.source "LoaderActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/LoaderActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/Context;I)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {p0, p2, p3}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->access$300(Lcom/ideaworks3d/marmalade/LoaderActivity;)V

    .line 167
    return-void
.end method
