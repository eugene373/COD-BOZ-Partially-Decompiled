.class public Lcom/facebook/internal/LikeBoxCountView;
.super Landroid/widget/FrameLayout;
.source "LikeBoxCountView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/LikeBoxCountView$1;,
        Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;
    }
.end annotation


# instance fields
.field private additionalTextPadding:I

.field private borderPaint:Landroid/graphics/Paint;

.field private borderRadius:F

.field private caretHeight:F

.field private caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

.field private caretWidth:F

.field private likeCountLabel:Landroid/widget/TextView;

.field private textPadding:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 43
    sget-object v0, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->LEFT:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    iput-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/internal/LikeBoxCountView;->initialize(Landroid/content/Context;)V

    .line 60
    return-void
.end method

.method private drawBorder(Landroid/graphics/Canvas;FFFF)V
    .locals 7

    .prologue
    const/high16 v6, 0x42b40000    # 90.0f

    const/high16 v5, 0x40000000    # 2.0f

    .line 165
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 167
    iget v1, p0, Lcom/facebook/internal/LikeBoxCountView;->borderRadius:F

    mul-float/2addr v1, v5

    .line 170
    new-instance v2, Landroid/graphics/RectF;

    add-float v3, p2, v1

    add-float v4, p3, v1

    invoke-direct {v2, p2, p3, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v3, -0x3ccc0000    # -180.0f

    invoke-virtual {v0, v2, v3, v6}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 173
    iget-object v2, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    sget-object v3, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->TOP:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    if-ne v2, v3, :cond_0

    .line 174
    sub-float v2, p4, p2

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    sub-float/2addr v2, v3

    div-float/2addr v2, v5

    add-float/2addr v2, p2

    invoke-virtual {v0, v2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 175
    sub-float v2, p4, p2

    div-float/2addr v2, v5

    add-float/2addr v2, p2

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    sub-float v3, p3, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 176
    sub-float v2, p4, p2

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    add-float/2addr v2, v3

    div-float/2addr v2, v5

    add-float/2addr v2, p2

    invoke-virtual {v0, v2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 180
    :cond_0
    iget v2, p0, Lcom/facebook/internal/LikeBoxCountView;->borderRadius:F

    sub-float v2, p4, v2

    invoke-virtual {v0, v2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 183
    new-instance v2, Landroid/graphics/RectF;

    sub-float v3, p4, v1

    add-float v4, p3, v1

    invoke-direct {v2, v3, p3, p4, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v3, -0x3d4c0000    # -90.0f

    invoke-virtual {v0, v2, v3, v6}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 186
    iget-object v2, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    sget-object v3, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->RIGHT:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    if-ne v2, v3, :cond_1

    .line 187
    sub-float v2, p5, p3

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    sub-float/2addr v2, v3

    div-float/2addr v2, v5

    add-float/2addr v2, p3

    invoke-virtual {v0, p4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 188
    iget v2, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    add-float/2addr v2, p4

    sub-float v3, p5, p3

    div-float/2addr v3, v5

    add-float/2addr v3, p3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 189
    sub-float v2, p5, p3

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    add-float/2addr v2, v3

    div-float/2addr v2, v5

    add-float/2addr v2, p3

    invoke-virtual {v0, p4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 193
    :cond_1
    iget v2, p0, Lcom/facebook/internal/LikeBoxCountView;->borderRadius:F

    sub-float v2, p5, v2

    invoke-virtual {v0, p4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 196
    new-instance v2, Landroid/graphics/RectF;

    sub-float v3, p4, v1

    sub-float v4, p5, v1

    invoke-direct {v2, v3, v4, p4, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v6}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 199
    iget-object v2, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    sget-object v3, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->BOTTOM:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    if-ne v2, v3, :cond_2

    .line 200
    sub-float v2, p4, p2

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    add-float/2addr v2, v3

    div-float/2addr v2, v5

    add-float/2addr v2, p2

    invoke-virtual {v0, v2, p5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 201
    sub-float v2, p4, p2

    div-float/2addr v2, v5

    add-float/2addr v2, p2

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    add-float/2addr v3, p5

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 202
    sub-float v2, p4, p2

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    sub-float/2addr v2, v3

    div-float/2addr v2, v5

    add-float/2addr v2, p2

    invoke-virtual {v0, v2, p5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 206
    :cond_2
    iget v2, p0, Lcom/facebook/internal/LikeBoxCountView;->borderRadius:F

    add-float/2addr v2, p2

    invoke-virtual {v0, v2, p5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 209
    new-instance v2, Landroid/graphics/RectF;

    sub-float v3, p5, v1

    add-float/2addr v1, p2

    invoke-direct {v2, p2, v3, v1, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, v2, v6, v6}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 212
    iget-object v1, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    sget-object v2, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->LEFT:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    if-ne v1, v2, :cond_3

    .line 213
    sub-float v1, p5, p3

    iget v2, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    add-float/2addr v1, v2

    div-float/2addr v1, v5

    add-float/2addr v1, p3

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 214
    iget v1, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    sub-float v1, p2, v1

    sub-float v2, p5, p3

    div-float/2addr v2, v5

    add-float/2addr v2, p3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 215
    sub-float v1, p5, p3

    iget v2, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    sub-float/2addr v1, v2

    div-float/2addr v1, v5

    add-float/2addr v1, p3

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 219
    :cond_3
    iget v1, p0, Lcom/facebook/internal/LikeBoxCountView;->borderRadius:F

    add-float/2addr v1, p3

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 221
    iget-object v1, p0, Lcom/facebook/internal/LikeBoxCountView;->borderPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 222
    return-void
.end method

.method private initialize(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 122
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeBoxCountView;->setWillNotDraw(Z)V

    .line 123
    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likeboxcountview_caret_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    .line 124
    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likeboxcountview_caret_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/facebook/internal/LikeBoxCountView;->caretWidth:F

    .line 125
    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likeboxcountview_border_radius:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/facebook/internal/LikeBoxCountView;->borderRadius:F

    .line 127
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->borderPaint:Landroid/graphics/Paint;

    .line 128
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->borderPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/android/R$color;->com_facebook_likeboxcountview_border_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 129
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->borderPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/android/R$dimen;->com_facebook_likeboxcountview_border_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 130
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->borderPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 132
    invoke-direct {p0, p1}, Lcom/facebook/internal/LikeBoxCountView;->initializeLikeCountLabel(Landroid/content/Context;)V

    .line 134
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeBoxCountView;->addView(Landroid/view/View;)V

    .line 136
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V

    .line 137
    return-void
.end method

.method private initializeLikeCountLabel(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 140
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    .line 141
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 144
    iget-object v1, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 146
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/android/R$dimen;->com_facebook_likeboxcountview_text_size:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 149
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/android/R$color;->com_facebook_likeboxcountview_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likeboxcountview_text_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/internal/LikeBoxCountView;->textPadding:I

    .line 153
    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likeboxcountview_caret_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/internal/LikeBoxCountView;->additionalTextPadding:I

    .line 154
    return-void
.end method

.method private setAdditionalTextPadding(IIII)V
    .locals 5

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    iget v1, p0, Lcom/facebook/internal/LikeBoxCountView;->textPadding:I

    add-int/2addr v1, p1

    iget v2, p0, Lcom/facebook/internal/LikeBoxCountView;->textPadding:I

    add-int/2addr v2, p2

    iget v3, p0, Lcom/facebook/internal/LikeBoxCountView;->textPadding:I

    add-int/2addr v3, p3

    iget v4, p0, Lcom/facebook/internal/LikeBoxCountView;->textPadding:I

    add-int/2addr v4, p4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 162
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    .line 98
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 100
    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getPaddingLeft()I

    move-result v2

    .line 101
    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/internal/LikeBoxCountView;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v0, v4

    .line 103
    sget-object v4, Lcom/facebook/internal/LikeBoxCountView$1;->$SwitchMap$com$facebook$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition:[I

    iget-object v5, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    invoke-virtual {v5}, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 118
    :goto_0
    int-to-float v2, v2

    int-to-float v3, v3

    int-to-float v4, v1

    int-to-float v5, v0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/internal/LikeBoxCountView;->drawBorder(Landroid/graphics/Canvas;FFFF)V

    .line 119
    return-void

    .line 105
    :pswitch_0
    int-to-float v0, v0

    iget v4, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    sub-float/2addr v0, v4

    float-to-int v0, v0

    .line 106
    goto :goto_0

    .line 108
    :pswitch_1
    int-to-float v2, v2

    iget v4, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    add-float/2addr v2, v4

    float-to-int v2, v2

    .line 109
    goto :goto_0

    .line 111
    :pswitch_2
    int-to-float v3, v3

    iget v4, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 112
    goto :goto_0

    .line 114
    :pswitch_3
    int-to-float v1, v1

    iget v4, p0, Lcom/facebook/internal/LikeBoxCountView;->caretHeight:F

    sub-float/2addr v1, v4

    float-to-int v1, v1

    goto :goto_0

    .line 103
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public setCaretPosition(Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 75
    iput-object p1, p0, Lcom/facebook/internal/LikeBoxCountView;->caretPosition:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    .line 79
    sget-object v0, Lcom/facebook/internal/LikeBoxCountView$1;->$SwitchMap$com$facebook$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition:[I

    invoke-virtual {p1}, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 94
    :goto_0
    return-void

    .line 81
    :pswitch_0
    iget v0, p0, Lcom/facebook/internal/LikeBoxCountView;->additionalTextPadding:I

    invoke-direct {p0, v0, v2, v2, v2}, Lcom/facebook/internal/LikeBoxCountView;->setAdditionalTextPadding(IIII)V

    goto :goto_0

    .line 84
    :pswitch_1
    iget v0, p0, Lcom/facebook/internal/LikeBoxCountView;->additionalTextPadding:I

    invoke-direct {p0, v2, v0, v2, v2}, Lcom/facebook/internal/LikeBoxCountView;->setAdditionalTextPadding(IIII)V

    goto :goto_0

    .line 87
    :pswitch_2
    iget v0, p0, Lcom/facebook/internal/LikeBoxCountView;->additionalTextPadding:I

    invoke-direct {p0, v2, v2, v0, v2}, Lcom/facebook/internal/LikeBoxCountView;->setAdditionalTextPadding(IIII)V

    goto :goto_0

    .line 90
    :pswitch_3
    iget v0, p0, Lcom/facebook/internal/LikeBoxCountView;->additionalTextPadding:I

    invoke-direct {p0, v2, v2, v2, v0}, Lcom/facebook/internal/LikeBoxCountView;->setAdditionalTextPadding(IIII)V

    goto :goto_0

    .line 79
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/internal/LikeBoxCountView;->likeCountLabel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    return-void
.end method
