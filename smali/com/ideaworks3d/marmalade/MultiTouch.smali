.class Lcom/ideaworks3d/marmalade/MultiTouch;
.super Ljava/lang/Object;
.source "MultiTouch.java"


# static fields
.field private static final POINTER_DOWN:I = 0x1

.field private static final POINTER_MOVE:I = 0x3

.field private static final POINTER_UP:I = 0x2

.field private static final TOUCH_CANCEL:I = 0x7

.field private static final TOUCH_DOWN:I = 0x4

.field private static final TOUCH_MOVE:I = 0x6

.field private static final TOUCH_UP:I = 0x5


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static onTouchEvent(Lcom/ideaworks3d/marmalade/LoaderThread;Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v6, 0x6

    const/4 v1, 0x5

    const/4 v5, 0x1

    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 16
    and-int/lit16 v2, v2, 0xff

    .line 17
    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    .line 20
    :goto_0
    if-ge v0, v1, :cond_3

    .line 22
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    float-to-int v3, v3

    .line 24
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    float-to-int v4, v4

    .line 25
    invoke-virtual {p0, v2, v6, v3, v4}, Lcom/ideaworks3d/marmalade/LoaderThread;->onMotionEvent(IIII)V

    .line 20
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 31
    :cond_0
    if-eqz v2, :cond_1

    if-ne v2, v1, :cond_4

    .line 33
    :cond_1
    const/4 v0, 0x4

    .line 39
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 41
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const v2, 0xff00

    and-int/2addr v1, v2

    ushr-int/lit8 v1, v1, 0x8

    .line 42
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 43
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    float-to-int v3, v3

    .line 44
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    .line 45
    invoke-virtual {p0, v2, v0, v3, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->onMotionEvent(IIII)V

    .line 48
    :cond_3
    return v5

    .line 34
    :cond_4
    if-eq v2, v5, :cond_5

    if-ne v2, v6, :cond_6

    :cond_5
    move v0, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_6
    const/4 v1, 0x3

    if-ne v2, v1, :cond_2

    .line 38
    const/4 v0, 0x7

    goto :goto_1
.end method
