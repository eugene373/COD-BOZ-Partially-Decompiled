.class Lcom/facebook/widget/ToolTipPopup$3;
.super Ljava/lang/Object;
.source "ToolTipPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/ToolTipPopup;->show()V
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
    .line 147
    iput-object p1, p0, Lcom/facebook/widget/ToolTipPopup$3;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$3;->this$0:Lcom/facebook/widget/ToolTipPopup;

    invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup;->dismiss()V

    .line 151
    return-void
.end method
