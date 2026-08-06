.class Lcom/facebook/widget/ToolTipPopup$PopupContentView;
.super Landroid/widget/FrameLayout;
.source "ToolTipPopup.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/ToolTipPopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PopupContentView"
.end annotation


# instance fields
.field private bodyFrame:Landroid/view/View;

.field private bottomArrow:Landroid/widget/ImageView;

.field final synthetic this$0:Lcom/facebook/widget/ToolTipPopup;

.field private topArrow:Landroid/widget/ImageView;

.field private xOut:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/ToolTipPopup;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->this$0:Lcom/facebook/widget/ToolTipPopup;

    .line 205
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 206
    invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->init()V

    .line 207
    return-void
.end method

.method static synthetic access$300(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/view/View;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bodyFrame:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$400(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bottomArrow:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$500(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->topArrow:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$600(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->xOut:Landroid/widget/ImageView;

    return-object v0
.end method

.method private init()V
    .locals 2

    .prologue
    .line 210
    invoke-virtual {p0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 211
    sget v1, Lcom/facebook/android/R$layout;->com_facebook_tooltip_bubble:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 212
    sget v0, Lcom/facebook/android/R$id;->com_facebook_tooltip_bubble_view_top_pointer:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->topArrow:Landroid/widget/ImageView;

    .line 213
    sget v0, Lcom/facebook/android/R$id;->com_facebook_tooltip_bubble_view_bottom_pointer:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bottomArrow:Landroid/widget/ImageView;

    .line 215
    sget v0, Lcom/facebook/android/R$id;->com_facebook_body_frame:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bodyFrame:Landroid/view/View;

    .line 216
    sget v0, Lcom/facebook/android/R$id;->com_facebook_button_xout:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->xOut:Landroid/widget/ImageView;

    .line 217
    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .locals 0

    .prologue
    .line 232
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 233
    return-void
.end method

.method public showBottomArrow()V
    .locals 2

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->topArrow:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bottomArrow:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 227
    return-void
.end method

.method public showTopArrow()V
    .locals 2

    .prologue
    .line 220
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->topArrow:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bottomArrow:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 222
    return-void
.end method
