.class Lcom/facebook/widget/ToolTipPopup$1;
.super Ljava/lang/Object;
.source "ToolTipPopup.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/ToolTipPopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/ToolTipPopup;


# direct methods
.method constructor <init>(Lcom/facebook/widget/ToolTipPopup;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/widget/ToolTipPopup$1;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollChanged()V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$1;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup;->access$000(Lcom/facebook/widget/ToolTipPopup;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$1;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup;->access$100(Lcom/facebook/widget/ToolTipPopup;)Landroid/widget/PopupWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$1;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup;->access$100(Lcom/facebook/widget/ToolTipPopup;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$1;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup;->access$100(Lcom/facebook/widget/ToolTipPopup;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isAboveAnchor()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$1;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup;->access$200(Lcom/facebook/widget/ToolTipPopup;)Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->showBottomArrow()V

    .line 75
    :cond_0
    :goto_0
    return-void

    .line 72
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$1;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup;->access$200(Lcom/facebook/widget/ToolTipPopup;)Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->showTopArrow()V

    goto :goto_0
.end method
