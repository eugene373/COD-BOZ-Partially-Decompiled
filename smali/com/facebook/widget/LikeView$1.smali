.class Lcom/facebook/widget/LikeView$1;
.super Ljava/lang/Object;
.source "LikeView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/LikeView;->initializeLikeButton(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/LikeView;


# direct methods
.method constructor <init>(Lcom/facebook/widget/LikeView;)V
    .locals 0

    .prologue
    .line 427
    iput-object p1, p0, Lcom/facebook/widget/LikeView$1;->this$0:Lcom/facebook/widget/LikeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lcom/facebook/widget/LikeView$1;->this$0:Lcom/facebook/widget/LikeView;

    invoke-static {v0}, Lcom/facebook/widget/LikeView;->access$300(Lcom/facebook/widget/LikeView;)V

    .line 431
    return-void
.end method
