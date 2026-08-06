.class Lcom/ideaworks3d/marmalade/s3eTouchpad;
.super Ljava/lang/Object;
.source "s3eTouchpad.java"


# static fields
.field static final S3E_TOUCHPAD_AVAILABLE:I = 0x0

.field static final S3E_TOUCHPAD_HEIGHT:I = 0x2

.field static final S3E_TOUCHPAD_WIDTH:I = 0x1

.field private static m_Height:I

.field private static m_Width:I


# instance fields
.field private inputDeviceId:I

.field private processPositionEvents:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 15
    sput v0, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Width:I

    sput v0, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Height:I

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eTouchpad;->inputDeviceId:I

    return-void
.end method

.method public static native onMotionEvent(IIII)V
.end method

.method public static onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 22
    const v2, 0x100008

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    if-eq v2, v3, :cond_0

    .line 47
    :goto_0
    return v0

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 25
    const v3, 0xff00

    and-int/2addr v3, v2

    ushr-int/lit8 v3, v3, 0x8

    .line 26
    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    .line 28
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    .line 29
    :goto_1
    if-ge v0, v3, :cond_3

    .line 30
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    add-int/lit8 v5, v2, 0x4

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    float-to-int v6, v6

    sget v7, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Height:I

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v8

    float-to-int v8, v8

    sub-int/2addr v7, v8

    invoke-static {v4, v5, v6, v7}, Lcom/ideaworks3d/marmalade/s3eTouchpad;->onMotionEvent(IIII)V

    .line 29
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 32
    :cond_1
    if-eqz v2, :cond_2

    if-ne v2, v1, :cond_4

    .line 34
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 35
    add-int/lit8 v2, v2, 0x4

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    sget v4, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Height:I

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    sub-int/2addr v4, v5

    invoke-static {v0, v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eTouchpad;->onMotionEvent(IIII)V

    :cond_3
    :goto_2
    move v0, v1

    .line 47
    goto :goto_0

    .line 39
    :cond_4
    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 40
    and-int/lit16 v2, v2, 0xff

    .line 41
    const/4 v4, 0x6

    if-eq v2, v4, :cond_5

    const/4 v4, 0x5

    if-ne v2, v4, :cond_3

    .line 43
    :cond_5
    add-int/lit8 v2, v2, -0x5

    .line 44
    add-int/lit8 v2, v2, 0x4

    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    sget v5, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Height:I

    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    float-to-int v3, v3

    sub-int v3, v5, v3

    invoke-static {v0, v2, v4, v3}, Lcom/ideaworks3d/marmalade/s3eTouchpad;->onMotionEvent(IIII)V

    goto :goto_2
.end method


# virtual methods
.method public s3eTouchpadGetInt(I)I
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 90
    if-nez p1, :cond_5

    .line 92
    const-string v2, "Touchpad GetInt S3E_TOUCHPAD_AVAILABLE"

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 93
    iget v2, p0, Lcom/ideaworks3d/marmalade/s3eTouchpad;->inputDeviceId:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 119
    :cond_0
    :goto_0
    return v1

    .line 95
    :cond_1
    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 96
    const-string v3, "3.0.A.2."

    .line 99
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Android build: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 100
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Checking for legacy Xperia Play build ID: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 101
    sget-object v4, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0xb5

    if-gt v3, v4, :cond_3

    .line 103
    const-string v3, "Found... Using legacy Configuration enum"

    invoke-static {v3}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 104
    iget v2, v2, Landroid/content/res/Configuration;->hardKeyboardHidden:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v2, v6, :cond_2

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    .line 107
    :catch_0
    move-exception v3

    .line 109
    const-string v3, "Error parsing build ID"

    invoke-static {v3}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 111
    :cond_3
    iget v2, v2, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v2, v6, :cond_4

    .line 112
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Touchpad available: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    move v1, v0

    .line 113
    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 111
    goto :goto_2

    .line 115
    :cond_5
    if-ne p1, v0, :cond_6

    .line 116
    sget v1, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Width:I

    goto/16 :goto_0

    .line 117
    :cond_6
    if-ne p1, v6, :cond_0

    .line 118
    sget v1, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Height:I

    goto/16 :goto_0
.end method

.method public s3eTouchpadInit()Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 51
    invoke-static {}, Landroid/view/InputDevice;->getDeviceIds()[I

    move-result-object v3

    .line 52
    array-length v4, v3

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_2

    aget v5, v3, v2

    .line 54
    invoke-static {v5}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v6

    .line 55
    invoke-virtual {v6}, Landroid/view/InputDevice;->getSources()I

    move-result v7

    const v8, 0x100008

    and-int/2addr v7, v8

    if-lez v7, :cond_1

    .line 57
    invoke-virtual {v6, v1}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    move-result-object v7

    .line 58
    invoke-virtual {v6, v0}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    move-result-object v6

    .line 59
    if-eqz v7, :cond_1

    if-eqz v6, :cond_1

    .line 61
    invoke-virtual {v7}, Landroid/view/InputDevice$MotionRange;->getMax()F

    move-result v7

    float-to-int v7, v7

    sput v7, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Width:I

    .line 62
    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getMax()F

    move-result v6

    float-to-int v6, v6

    sput v6, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Height:I

    .line 64
    sget v6, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Width:I

    if-lez v6, :cond_1

    sget v6, Lcom/ideaworks3d/marmalade/s3eTouchpad;->m_Height:I

    if-lez v6, :cond_1

    .line 66
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eTouchpad;->setProcessPositionEvents(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 68
    iput v5, p0, Lcom/ideaworks3d/marmalade/s3eTouchpad;->inputDeviceId:I

    .line 81
    :goto_1
    return v0

    :cond_0
    move v0, v1

    .line 74
    goto :goto_1

    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 81
    goto :goto_1
.end method

.method public s3eTouchpadTerminate()V
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eTouchpad;->processPositionEvents:Z

    if-eqz v0, :cond_0

    .line 86
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eTouchpad;->setProcessPositionEvents(Z)Z

    .line 87
    :cond_0
    return-void
.end method

.method public setProcessPositionEvents(Z)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 124
    sget-object v2, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x9

    if-lt v2, v3, :cond_0

    .line 128
    :try_start_0
    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    .line 129
    const-string v3, "android.view.ViewRoot"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 130
    const-string v4, "setProcessPositionEvents"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 131
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :goto_0
    return v0

    .line 134
    :catch_0
    move-exception v0

    :cond_0
    move v0, v1

    .line 139
    goto :goto_0
.end method
