.class public Lcom/ideaworks3d/marmalade/S3EVideoView;
.super Landroid/widget/VideoView;
.source "S3EVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;


# static fields
.field public static final S3E_VIDEO_FAILED:I = 0x3

.field public static final S3E_VIDEO_MAX_VOLUME:I = 0x100

.field public static final S3E_VIDEO_PAUSED:I = 0x2

.field public static final S3E_VIDEO_PLAYING:I = 0x1

.field public static final S3E_VIDEO_STOPPED:I


# instance fields
.field private m_Fullscreen:Z

.field private m_Height:I

.field private m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

.field private m_MediaPlayer:Landroid/media/MediaPlayer;

.field private m_Path:Ljava/lang/String;

.field private m_Repeats:I

.field private m_Uri:Landroid/net/Uri;

.field private m_Volume:F

.field private m_Width:I


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F

    .line 33
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    .line 34
    invoke-virtual {p0, p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 35
    invoke-virtual {p0, p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 36
    invoke-virtual {p0, p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 37
    return-void
.end method

.method private static requiresSeparateWindow()Z
    .locals 2

    .prologue
    .line 79
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;

    .line 167
    iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I

    .line 168
    iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I

    if-gtz v0, :cond_0

    .line 170
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoStop()V

    .line 171
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStopped()V

    .line 181
    :goto_0
    return-void

    .line 175
    :cond_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->stopPlayback()V

    .line 176
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 177
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoURI(Landroid/net/Uri;)V

    goto :goto_0

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Path:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoPath(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStopped()V

    .line 160
    const/4 v0, 0x1

    return v0
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 200
    invoke-super {p0, p1, p2}, Landroid/widget/VideoView;->onMeasure(II)V

    .line 201
    iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I

    if-eqz v0, :cond_0

    .line 202
    iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I

    iget v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I

    invoke-virtual {p0, v0, v1}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setMeasuredDimension(II)V

    .line 203
    :cond_0
    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 3

    .prologue
    .line 151
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;

    .line 152
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F

    iget v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 153
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->start()V

    .line 154
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 185
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 187
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 188
    invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/S3EVideoView;->getLocationOnScreen([I)V

    .line 189
    aget v0, v1, v0

    int-to-float v0, v0

    const/4 v2, 0x1

    aget v1, v1, v2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 190
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 194
    :cond_0
    return v0
.end method

.method public videoAddView(ZIIII)V
    .locals 5

    .prologue
    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 83
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Fullscreen:Z

    .line 84
    iput p4, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I

    .line 85
    iput p5, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I

    .line 86
    invoke-static {}, Lcom/ideaworks3d/marmalade/S3EVideoView;->requiresSeparateWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 89
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit8 v1, v1, 0x8

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 90
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v1, v1, 0x200

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 91
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v1, v1, 0x400

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 92
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 93
    iput p2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 94
    iput p3, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 95
    iput p4, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 96
    iput p5, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 97
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1, p0, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    :goto_0
    return-void

    .line 101
    :cond_0
    if-eqz p1, :cond_1

    .line 103
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v1, 0x11

    invoke-direct {v0, v3, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 107
    iput v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I

    .line 108
    iput v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I

    .line 109
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v1, p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    :goto_1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setZOrderOnTop"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 123
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 125
    :catch_0
    move-exception v0

    goto :goto_0

    .line 113
    :cond_1
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, p4, p5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 115
    iput p2, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 116
    iput p3, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 117
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TopLevel:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1
.end method

.method public videoGetPosition()I
    .locals 1

    .prologue
    .line 42
    :try_start_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->getCurrentPosition()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 46
    :goto_0
    return v0

    .line 44
    :catch_0
    move-exception v0

    .line 46
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public videoPause()V
    .locals 0

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->pause()V

    .line 67
    return-void
.end method

.method public videoPlay(Ljava/lang/String;IJJ)I
    .locals 3

    .prologue
    .line 51
    iput p2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I

    .line 52
    const-wide/16 v0, 0x0

    cmp-long v0, p5, v0

    if-nez v0, :cond_0

    .line 54
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Path:Ljava/lang/String;

    .line 55
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Path:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoPath(Ljava/lang/String;)V

    .line 62
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/ideaworks3d/marmalade/VFSProvider;->ASSET_URI:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;

    .line 60
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoURI(Landroid/net/Uri;)V

    goto :goto_0
.end method

.method public videoRemoveView()V
    .locals 1

    .prologue
    .line 133
    invoke-static {}, Lcom/ideaworks3d/marmalade/S3EVideoView;->requiresSeparateWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 139
    :goto_0
    return-void

    .line 135
    :cond_0
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Fullscreen:Z

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 138
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TopLevel:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    goto :goto_0
.end method

.method public videoResume()V
    .locals 0

    .prologue
    .line 70
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->start()V

    .line 71
    return-void
.end method

.method public videoSetVolume(I)V
    .locals 3

    .prologue
    .line 142
    int-to-float v0, p1

    const/high16 v1, 0x43800000    # 256.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F

    .line 143
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F

    iget v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 147
    :cond_0
    return-void
.end method

.method public videoStop()V
    .locals 1

    .prologue
    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;

    .line 75
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->stopPlayback()V

    .line 76
    return-void
.end method
