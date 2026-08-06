.class public Lcom/ideaworks3d/marmalade/LoaderView;
.super Landroid/view/SurfaceView;
.source "LoaderView.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;
    }
.end annotation


# static fields
.field private static g_PixelsLast:[I

.field private static m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;


# instance fields
.field private final m_BacklightOn:Ljava/lang/Runnable;

.field private m_EditText:Landroid/widget/EditText;

.field private m_ErrorBody:Ljava/lang/String;

.field private m_ErrorDialog:Landroid/app/Dialog;

.field private m_ErrorRtn:I

.field public m_ErrorRunning:Z

.field private m_ErrorTitle:Ljava/lang/String;

.field private m_ErrorType:I

.field private m_FullScreenBitmap:Landroid/graphics/Bitmap;

.field public m_GL:Ljavax/microedition/khronos/opengles/GL;

.field m_Handler:Landroid/os/Handler;

.field public m_Height:I

.field private m_InputDialog:Landroid/app/Dialog;

.field private m_InputTextDefault:Ljava/lang/String;

.field private m_InputTextFlags:I

.field private m_InputTextResult:Ljava/lang/String;

.field public m_InputTextRunning:Z

.field private m_InputTextTitle:Ljava/lang/String;

.field public m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

.field public m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

.field public m_NewlyCreated:Z

.field private m_Paint:Landroid/graphics/Paint;

.field private m_Pixels:[I

.field private final m_RunOnOSThread:Ljava/lang/Runnable;

.field private final m_ShowError:Ljava/lang/Runnable;

.field private final m_ShowInputText:Ljava/lang/Runnable;

.field private m_SurfaceHolder:Landroid/view/SurfaceHolder;

.field public m_TerminateApplication:Z

.field private m_UseGL:Z

.field private m_Vibrator:Landroid/os/Vibrator;

.field private m_VideoState:I

.field private m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

.field public m_Width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;-><init>()V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    return-void
.end method

.method public constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Z)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 71
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Paint:Landroid/graphics/Paint;

    .line 46
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;

    .line 52
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;

    .line 53
    iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRunning:Z

    .line 58
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;

    .line 59
    iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    .line 62
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextResult:Ljava/lang/String;

    .line 63
    iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z

    .line 65
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    .line 66
    iput v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    .line 68
    iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_TerminateApplication:Z

    .line 221
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$1;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderView$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowError:Ljava/lang/Runnable;

    .line 228
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$2;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderView$2;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowInputText:Ljava/lang/Runnable;

    .line 235
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$3;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderView$3;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_BacklightOn:Ljava/lang/Runnable;

    .line 244
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$4;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderView$4;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;

    .line 72
    iput-boolean p2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    .line 73
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    .line 74
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;

    .line 75
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    .line 76
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 77
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    .line 79
    if-eqz p2, :cond_1

    .line 81
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 82
    new-array v0, v4, [I

    .line 83
    const-string v1, "GL"

    const-string v2, "AndroidSurfaceHolder"

    invoke-static {v1, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I

    move-result v1

    if-nez v1, :cond_0

    .line 86
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    aget v0, v0, v3

    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 93
    :cond_0
    :goto_0
    invoke-virtual {p0, v4}, Lcom/ideaworks3d/marmalade/LoaderView;->setFocusable(Z)V

    .line 94
    invoke-virtual {p0, v4}, Lcom/ideaworks3d/marmalade/LoaderView;->setFocusableInTouchMode(Z)V

    .line 95
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->requestFocus()Z

    .line 96
    const v0, 0x1e432a

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderView;->setId(I)V

    .line 97
    return-void

    .line 91
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v0, v4}, Landroid/view/SurfaceHolder;->setType(I)V

    goto :goto_0
.end method

.method static synthetic access$000(Lcom/ideaworks3d/marmalade/LoaderView;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->showErrorReal()V

    return-void
.end method

.method static synthetic access$100(Lcom/ideaworks3d/marmalade/LoaderView;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$200(Lcom/ideaworks3d/marmalade/LoaderView;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->runOnOSThreadNative()V

    return-void
.end method

.method static synthetic access$300(Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/S3EVideoView;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    return-object v0
.end method

.method static synthetic access$302(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/S3EVideoView;)Lcom/ideaworks3d/marmalade/S3EVideoView;
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    return-object p1
.end method

.method private backlightOn()V
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_BacklightOn:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 139
    return-void
.end method

.method private native runOnOSThreadNative()V
.end method

.method private native setInputText(Ljava/lang/String;)V
.end method

.method private native setPixelsNative(II[IZ)V
.end method

.method private showErrorReal()V
    .locals 3

    .prologue
    .line 464
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 465
    const/4 v1, 0x0

    iput v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I

    .line 466
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 467
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorBody:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 468
    const-string v1, "Continue"

    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 469
    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorType:I

    if-lez v1, :cond_0

    .line 471
    const-string v1, "Stop"

    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 473
    :cond_0
    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorType:I

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    .line 475
    const-string v1, "Ignore"

    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 477
    :cond_1
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;

    .line 478
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 479
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 481
    return-void
.end method

.method private terminateApplication()V
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_TerminateApplication:Z

    .line 143
    return-void
.end method

.method private videoIsPlaying()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 415
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoGetStatus()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private native videoStoppedNotify()V
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 670
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public doDraw()V
    .locals 9

    .prologue
    .line 772
    const/4 v8, 0x0

    .line 775
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 796
    if-eqz v8, :cond_0

    .line 797
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v0, v8}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 799
    :cond_0
    :goto_0
    return-void

    .line 780
    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    .line 796
    if-eqz v8, :cond_0

    .line 797
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v0, v8}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 785
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    const/4 v2, 0x0

    iget v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget v6, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    iget v7, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 786
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v1

    .line 787
    if-nez v1, :cond_3

    .line 796
    if-eqz v1, :cond_0

    .line 797
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 792
    :cond_3
    :try_start_3
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Paint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 796
    if-eqz v1, :cond_0

    .line 797
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 796
    :catchall_0
    move-exception v0

    move-object v1, v8

    :goto_1
    if-eqz v1, :cond_4

    .line 797
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    :cond_4
    throw v0

    .line 796
    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method public doneInputText(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 510
    return-void
.end method

.method public enableRespondingToRotation()V
    .locals 1

    .prologue
    .line 378
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->onSplashFinished()V

    .line 379
    return-void
.end method

.method public getCurrentOrientation()I
    .locals 8

    .prologue
    const/16 v4, 0x8

    const/4 v5, -0x1

    const/16 v3, 0x9

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 100
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v3, :cond_1

    .line 102
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    packed-switch v0, :pswitch_data_0

    move v2, v5

    .line 124
    :cond_0
    :goto_0
    :pswitch_0
    return v2

    :pswitch_1
    move v2, v1

    .line 107
    goto :goto_0

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v6, "window"

    invoke-virtual {v0, v6}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 112
    invoke-virtual {v6}, Landroid/view/Display;->getWidth()I

    move-result v0

    invoke-virtual {v6}, Landroid/view/Display;->getHeight()I

    move-result v7

    if-lt v0, v7, :cond_2

    move v0, v1

    .line 113
    :goto_1
    invoke-virtual {v6}, Landroid/view/Display;->getRotation()I

    move-result v6

    packed-switch v6, :pswitch_data_1

    move v2, v5

    .line 124
    goto :goto_0

    :cond_2
    move v0, v2

    .line 112
    goto :goto_1

    .line 116
    :pswitch_2
    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    .line 118
    :pswitch_3
    if-nez v0, :cond_0

    move v2, v3

    goto :goto_0

    .line 120
    :pswitch_4
    if-eqz v0, :cond_3

    move v3, v4

    :cond_3
    move v2, v3

    goto :goto_0

    .line 122
    :pswitch_5
    if-eqz v0, :cond_4

    :goto_2
    move v2, v4

    goto :goto_0

    :cond_4
    move v4, v1

    goto :goto_2

    .line 102
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 113
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public getInputString(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 546
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextTitle:Ljava/lang/String;

    .line 547
    iput-object p2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextDefault:Ljava/lang/String;

    .line 548
    iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I

    .line 549
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowInputText:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 550
    return-void
.end method

.method public getLocale()Ljava/lang/String;
    .locals 1

    .prologue
    .line 577
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public glInit(I)Z
    .locals 2

    .prologue
    .line 582
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    if-eqz v0, :cond_0

    .line 584
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z

    move-result v0

    if-nez v0, :cond_0

    .line 586
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1, p1}, Lcom/ideaworks3d/marmalade/LoaderGL;->startGL(Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;

    .line 590
    :cond_0
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    return v0
.end method

.method public glPause()V
    .locals 3

    .prologue
    .line 607
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    if-eqz v0, :cond_0

    .line 609
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 611
    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 612
    const-string v1, "GL"

    const-string v2, "AndroidTerminateGLOnPause"

    invoke-static {v1, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    aget v0, v0, v1

    if-eqz v0, :cond_1

    .line 613
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stopGL()V

    .line 616
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;

    .line 620
    :cond_0
    return-void

    .line 615
    :cond_1
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->pauseGL()V

    goto :goto_0
.end method

.method public glReInit()V
    .locals 2

    .prologue
    .line 595
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    if-eqz v0, :cond_0

    .line 597
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 599
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->restartGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;

    .line 603
    :cond_0
    return-void
.end method

.method public glResume()V
    .locals 3

    .prologue
    .line 624
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    if-eqz v0, :cond_0

    .line 626
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z

    move-result v0

    if-nez v0, :cond_0

    .line 628
    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 629
    const-string v1, "GL"

    const-string v2, "AndroidTerminateGLOnPause"

    invoke-static {v1, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    aget v0, v0, v1

    if-eqz v0, :cond_1

    .line 630
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->restartGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;

    .line 636
    :cond_0
    :goto_0
    return-void

    .line 632
    :cond_1
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->resumeGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;

    goto :goto_0
.end method

.method public glSwapBuffers()V
    .locals 1

    .prologue
    .line 652
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z

    move-result v0

    if-nez v0, :cond_0

    .line 658
    :goto_0
    return-void

    .line 657
    :cond_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->swap()V

    goto :goto_0
.end method

.method public glTerm()V
    .locals 1

    .prologue
    .line 640
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z

    if-eqz v0, :cond_0

    .line 642
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 644
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stopGL()V

    .line 645
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;

    .line 649
    :cond_0
    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;

    if-ne p1, v0, :cond_2

    .line 179
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextResult:Ljava/lang/String;

    .line 181
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 204
    :cond_1
    :goto_0
    return-void

    .line 183
    :cond_2
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;

    if-ne p1, v0, :cond_1

    .line 185
    packed-switch p2, :pswitch_data_0

    .line 198
    :goto_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    goto :goto_0

    .line 188
    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I

    goto :goto_1

    .line 191
    :pswitch_1
    const/4 v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I

    goto :goto_1

    .line 194
    :pswitch_2
    const/4 v0, 0x2

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I

    goto :goto_1

    .line 185
    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .prologue
    .line 130
    if-eqz p1, :cond_0

    .line 132
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v1, 0x10000000

    or-int/2addr v0, v1

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 134
    :cond_0
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 153
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 158
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;

    if-ne p1, v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextResult:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderView;->setInputText(Ljava/lang/String;)V

    .line 161
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z

    .line 162
    iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;

    .line 173
    :cond_0
    :goto_0
    return-void

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;

    if-ne p1, v0, :cond_0

    .line 166
    iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;

    .line 167
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRunning:Z

    goto :goto_0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 675
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onDraw(Landroid/graphics/Canvas;)V

    .line 677
    return-void
.end method

.method public onKeyEvent(IILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 207
    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z

    if-eqz v1, :cond_1

    .line 209
    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    .line 211
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z

    .line 219
    :cond_0
    :goto_0
    return v0

    .line 215
    :cond_1
    invoke-virtual {p0, p3}, Lcom/ideaworks3d/marmalade/LoaderView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 219
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->onKeyEvent(IILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 662
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 663
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 665
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public runOnOSThread()V
    .locals 3

    .prologue
    .line 257
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;

    monitor-enter v1

    .line 259
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 268
    :goto_0
    :try_start_2
    monitor-exit v1

    .line 269
    return-void

    .line 268
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 264
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public showError(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 485
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 505
    :goto_0
    return v0

    .line 491
    :cond_0
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowError:Ljava/lang/Runnable;

    monitor-enter v1

    .line 493
    :try_start_0
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorTitle:Ljava/lang/String;

    .line 494
    iput-object p2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorBody:Ljava/lang/String;

    .line 495
    iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorType:I

    .line 496
    const/4 v0, 0x0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I

    .line 497
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRunning:Z

    .line 498
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowError:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 500
    :goto_1
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRunning:Z

    if-eqz v0, :cond_1

    .line 502
    const/16 v0, 0x14

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDeviceYield(I)V

    goto :goto_1

    .line 506
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 505
    :cond_1
    :try_start_1
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public showInputTextReal()V
    .locals 2

    .prologue
    .line 513
    new-instance v0, Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    .line 514
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextDefault:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 515
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 517
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 518
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    new-instance v1, Landroid/text/method/PasswordTransformationMethod;

    invoke-direct {v1}, Landroid/text/method/PasswordTransformationMethod;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 532
    :cond_0
    :goto_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 533
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 534
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 535
    const-string v1, "OK"

    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 536
    const-string v1, "Cancel"

    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 537
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;

    .line 538
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z

    .line 539
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextResult:Ljava/lang/String;

    .line 540
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 541
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 542
    return-void

    .line 520
    :cond_1
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    .line 522
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_0

    .line 524
    :cond_2
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    .line 526
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_0

    .line 528
    :cond_3
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_0
.end method

.method public declared-synchronized surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 5

    .prologue
    .line 707
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v0

    .line 708
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->skipSurfaceChange()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 711
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 742
    :goto_0
    monitor-exit p0

    return-void

    .line 714
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->suspendForSurfaceChange()V

    .line 715
    iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    .line 716
    iput p4, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    .line 717
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    .line 719
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 720
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;

    .line 722
    :cond_1
    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;

    .line 723
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    array-length v1, v1

    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    iget v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    mul-int/2addr v2, v3

    if-eq v1, v2, :cond_3

    .line 725
    :cond_2
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderView;->g_PixelsLast:[I

    if-eqz v1, :cond_4

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderView;->g_PixelsLast:[I

    array-length v1, v1

    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    iget v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    mul-int/2addr v2, v3

    if-lt v1, v2, :cond_4

    .line 727
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderView;->g_PixelsLast:[I

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    .line 737
    :cond_3
    :goto_1
    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    iget-boolean v4, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_NewlyCreated:Z

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/ideaworks3d/marmalade/LoaderView;->setPixelsNative(II[IZ)V

    .line 738
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_NewlyCreated:Z

    .line 739
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->resumeAfterSurfaceChange()V

    .line 740
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 707
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 732
    :cond_4
    :try_start_2
    iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    mul-int/2addr v1, v2

    new-array v1, v1, [I

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    .line 733
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    sput-object v1, Lcom/ideaworks3d/marmalade/LoaderView;->g_PixelsLast:[I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 681
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_NewlyCreated:Z

    .line 682
    return-void
.end method

.method public declared-synchronized surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 5

    .prologue
    .line 686
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 687
    if-nez v0, :cond_0

    .line 703
    :goto_0
    monitor-exit p0

    return-void

    .line 689
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->suspendForSurfaceChange()V

    .line 690
    const/4 v1, 0x0

    iput v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I

    .line 691
    const/4 v1, 0x0

    iput v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I

    .line 692
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 694
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->stopGL()V

    .line 695
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;

    .line 697
    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;

    .line 698
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/ideaworks3d/marmalade/LoaderView;->setPixelsNative(II[IZ)V

    .line 699
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    .line 700
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->resumeAfterSurfaceChange()V

    .line 701
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 686
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public vibrateAvailable()Z
    .locals 3

    .prologue
    .line 566
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 567
    const-string v1, "hasVibrator"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 568
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 572
    :goto_0
    return v0

    .line 570
    :catch_0
    move-exception v0

    .line 572
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public vibrateStart(J)V
    .locals 1

    .prologue
    .line 554
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;

    invoke-virtual {v0, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 555
    return-void
.end method

.method public vibrateStop()V
    .locals 1

    .prologue
    .line 559
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    .line 560
    return-void
.end method

.method public videoGetPosition()I
    .locals 1

    .prologue
    .line 446
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoGetPosition()I

    move-result v0

    .line 449
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public videoGetStatus()I
    .locals 1

    .prologue
    .line 442
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    return v0
.end method

.method public videoPause()I
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 392
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 394
    iput v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    .line 395
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V

    .line 396
    invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setState(I)V

    .line 397
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I

    move-result v0

    .line 399
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public videoPlay(Ljava/lang/String;IIIIIIZJJ)I
    .locals 15

    .prologue
    .line 384
    const/4 v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    .line 385
    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    .line 386
    invoke-virtual/range {v1 .. v13}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->play(Ljava/lang/String;IIIIIIZJJ)V

    .line 387
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I

    move-result v0

    return v0
.end method

.method public videoResume()I
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 404
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 406
    iput v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    .line 407
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V

    .line 408
    invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setState(I)V

    .line 409
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I

    move-result v0

    .line 411
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public videoSetVolume(I)V
    .locals 2

    .prologue
    .line 436
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V

    .line 437
    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setVolume(I)V

    .line 438
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I

    .line 439
    return-void
.end method

.method public videoStop()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 420
    .line 421
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    if-eqz v0, :cond_1

    .line 423
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V

    .line 424
    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setState(I)V

    .line 425
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I

    .line 426
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoIsPlaying()Z

    move-result v0

    .line 427
    iput v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    .line 429
    :goto_0
    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoIsPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    .line 431
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStopped()V

    .line 433
    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public videoStopped()V
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    if-eqz v0, :cond_0

    .line 455
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoRemoveView()V

    .line 456
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;

    .line 458
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I

    .line 459
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStoppedNotify()V

    .line 460
    return-void
.end method

.method public waitForSurface()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 746
    monitor-enter p0

    .line 748
    :try_start_0
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 753
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 761
    :cond_0
    :try_start_2
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I

    if-nez v1, :cond_1

    .line 764
    monitor-exit p0

    .line 768
    :goto_0
    return v0

    .line 755
    :catch_0
    move-exception v1

    .line 758
    monitor-exit p0

    goto :goto_0

    .line 766
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 768
    const/4 v0, 0x1

    goto :goto_0
.end method
