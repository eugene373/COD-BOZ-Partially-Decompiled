.class public final Lcom/google/android/gms/plus/PlusOneButton;
.super Landroid/widget/FrameLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;,
        Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;
    }
.end annotation


# static fields
.field public static final ANNOTATION_BUBBLE:I = 0x1

.field public static final ANNOTATION_INLINE:I = 0x2

.field public static final ANNOTATION_NONE:I = 0x0

.field public static final DEFAULT_ACTIVITY_REQUEST_CODE:I = -0x1

.field public static final SIZE_MEDIUM:I = 0x1

.field public static final SIZE_SMALL:I = 0x0

.field public static final SIZE_STANDARD:I = 0x3

.field public static final SIZE_TALL:I = 0x2


# instance fields
.field private all:Landroid/view/View;

.field private alm:I

.field private aln:I

.field private alo:Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;

.field private mSize:I

.field private uR:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/plus/PlusOneButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {p1, p2}, Lcom/google/android/gms/plus/PlusOneButton;->getSize(Landroid/content/Context;Landroid/util/AttributeSet;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->mSize:I

    invoke-static {p1, p2}, Lcom/google/android/gms/plus/PlusOneButton;->getAnnotation(Landroid/content/Context;Landroid/util/AttributeSet;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->alm:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_0
    return-void
.end method

.method private G(Landroid/content/Context;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->removeView(Landroid/view/View;)V

    :cond_0
    iget v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->mSize:I

    iget v1, p0, Lcom/google/android/gms/plus/PlusOneButton;->alm:I

    iget-object v2, p0, Lcom/google/android/gms/plus/PlusOneButton;->uR:Ljava/lang/String;

    iget v3, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I

    invoke-static {p1, v0, v1, v2, v3}, Lcom/google/android/gms/plus/internal/g;->a(Landroid/content/Context;IILjava/lang/String;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->alo:Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->setOnPlusOneClickListener(Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->addView(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/plus/PlusOneButton;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/plus/PlusOneButton;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I

    return v0
.end method

.method protected static getAnnotation(Landroid/content/Context;Landroid/util/AttributeSet;)I
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v0, "http://schemas.android.com/apk/lib/com.google.android.gms.plus"

    const-string v1, "annotation"

    const-string v6, "PlusOneButton"

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "INLINE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v5, 0x2

    :cond_0
    :goto_0
    return v5

    :cond_1
    const-string v1, "NONE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    move v5, v4

    goto :goto_0
.end method

.method protected static getSize(Landroid/content/Context;Landroid/util/AttributeSet;)I
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v0, "http://schemas.android.com/apk/lib/com.google.android.gms.plus"

    const-string v1, "size"

    const-string v6, "PlusOneButton"

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SMALL"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v5

    :cond_0
    const-string v1, "MEDIUM"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v5, v4

    goto :goto_0

    :cond_1
    const-string v1, "TALL"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x2

    goto :goto_0

    :cond_2
    const/4 v5, 0x3

    goto :goto_0
.end method


# virtual methods
.method public initialize(Ljava/lang/String;I)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "activityRequestCode"    # I

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    const-string v1, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener)."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->uR:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V

    return-void
.end method

.method public initialize(Ljava/lang/String;Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "plusOneClickListener"    # Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->uR:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/plus/PlusOneButton;->setOnPlusOneClickListener(Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .prologue
    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/plus/PlusOneButton;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/plus/PlusOneButton;->setMeasuredDimension(II)V

    return-void
.end method

.method public setAnnotation(I)V
    .locals 1
    .param p1, "annotation"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->alm:I

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V

    return-void
.end method

.method public setOnPlusOneClickListener(Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->alo:Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;

    new-instance v1, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;-><init>(Lcom/google/android/gms/plus/PlusOneButton;Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setSize(I)V
    .locals 1
    .param p1, "size"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->mSize:I

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V

    return-void
.end method
