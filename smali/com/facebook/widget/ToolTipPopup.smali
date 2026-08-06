.class public Lcom/facebook/widget/ToolTipPopup;
.super Ljava/lang/Object;
.source "ToolTipPopup.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/widget/ToolTipPopup$PopupContentView;,
        Lcom/facebook/widget/ToolTipPopup$Style;
    }
.end annotation


# static fields
.field public static final DEFAULT_POPUP_DISPLAY_TIME:J = 0x1770L


# instance fields
.field private final mAnchorViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private mNuxDisplayTime:J

.field private mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

.field private mPopupWindow:Landroid/widget/PopupWindow;

.field private final mScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private mStyle:Lcom/facebook/widget/ToolTipPopup$Style;

.field private final mText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    sget-object v0, Lcom/facebook/widget/ToolTipPopup$Style;->BLUE:Lcom/facebook/widget/ToolTipPopup$Style;

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mStyle:Lcom/facebook/widget/ToolTipPopup$Style;

    .line 60
    const-wide/16 v0, 0x1770

    iput-wide v0, p0, Lcom/facebook/widget/ToolTipPopup;->mNuxDisplayTime:J

    .line 62
    new-instance v0, Lcom/facebook/widget/ToolTipPopup$1;

    invoke-direct {v0, p0}, Lcom/facebook/widget/ToolTipPopup$1;-><init>(Lcom/facebook/widget/ToolTipPopup;)V

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 84
    iput-object p1, p0, Lcom/facebook/widget/ToolTipPopup;->mText:Ljava/lang/String;

    .line 85
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    .line 86
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mContext:Landroid/content/Context;

    .line 87
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/widget/ToolTipPopup;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic access$100(Lcom/facebook/widget/ToolTipPopup;)Landroid/widget/PopupWindow;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method static synthetic access$200(Lcom/facebook/widget/ToolTipPopup;)Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    return-object v0
.end method

.method private registerObserver()V
    .locals 2

    .prologue
    .line 186
    invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->unregisterObserver()V

    .line 187
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 190
    :cond_0
    return-void
.end method

.method private unregisterObserver()V
    .locals 2

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 196
    :cond_0
    return-void
.end method

.method private updateArrows()V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isAboveAnchor()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->showBottomArrow()V

    .line 173
    :cond_0
    :goto_0
    return-void

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->showTopArrow()V

    goto :goto_0
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .prologue
    .line 179
    invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->unregisterObserver()V

    .line 180
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 183
    :cond_0
    return-void
.end method

.method public setNuxDisplayTime(J)V
    .locals 1

    .prologue
    .line 162
    iput-wide p1, p0, Lcom/facebook/widget/ToolTipPopup;->mNuxDisplayTime:J

    .line 163
    return-void
.end method

.method public setStyle(Lcom/facebook/widget/ToolTipPopup$Style;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/facebook/widget/ToolTipPopup;->mStyle:Lcom/facebook/widget/ToolTipPopup$Style;

    .line 95
    return-void
.end method

.method public show()V
    .locals 4

    .prologue
    const/high16 v3, -0x80000000

    .line 101
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 102
    new-instance v0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mContext:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;-><init>(Lcom/facebook/widget/ToolTipPopup;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    .line 103
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    sget v1, Lcom/facebook/android/R$id;->com_facebook_tooltip_bubble_view_text_body:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 105
    iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mStyle:Lcom/facebook/widget/ToolTipPopup$Style;

    sget-object v1, Lcom/facebook/widget/ToolTipPopup$Style;->BLUE:Lcom/facebook/widget/ToolTipPopup$Style;

    if-ne v0, v1, :cond_2

    .line 107
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$300(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_background:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 109
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$400(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_bottomnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 111
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$500(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_topnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$600(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_xout:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 124
    :goto_0
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 127
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 128
    invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->registerObserver()V

    .line 129
    iget-object v2, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->onMeasure(II)V

    .line 132
    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    iget-object v2, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-virtual {v2}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->getMeasuredWidth()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-virtual {v3}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->getMeasuredHeight()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    .line 136
    iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    .line 137
    invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->updateArrows()V

    .line 138
    iget-wide v0, p0, Lcom/facebook/widget/ToolTipPopup;->mNuxDisplayTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    new-instance v1, Lcom/facebook/widget/ToolTipPopup$2;

    invoke-direct {v1, p0}, Lcom/facebook/widget/ToolTipPopup$2;-><init>(Lcom/facebook/widget/ToolTipPopup;)V

    iget-wide v2, p0, Lcom/facebook/widget/ToolTipPopup;->mNuxDisplayTime:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 147
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    new-instance v1, Lcom/facebook/widget/ToolTipPopup$3;

    invoke-direct {v1, p0}, Lcom/facebook/widget/ToolTipPopup$3;-><init>(Lcom/facebook/widget/ToolTipPopup;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    :cond_1
    return-void

    .line 115
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$300(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_background:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 117
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$400(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_bottomnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 119
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$500(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_topnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 121
    iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;

    invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$600(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_xout:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_0
.end method
