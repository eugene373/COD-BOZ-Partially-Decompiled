package com.ideaworks3d.marmalade

// Auto-emitted from smali source: S3EVideoView.java.
// 14 fields, 15 methods.

open class S3EVideoView: android.widget.VideoView(), android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener {
    private var m_Fullscreen: Boolean
    private var m_Height: Int
    private var m_LoaderActivity: com.ideaworks3d.marmalade.LoaderActivity
    private var m_MediaPlayer: android.media.MediaPlayer
    private var m_Path: String
    private var m_Repeats: Int
    private var m_Uri: android.net.Uri
    private var m_Volume: Float
    private var m_Width: Int

    public constructor(p0: com.ideaworks3d.marmalade.LoaderActivity)

    public fun onCompletion(p0: android.media.MediaPlayer) { /* TODO(body): (Landroid/media/MediaPlayer;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I
    //         if-gtz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoStop()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStopped()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->stopPlayback()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoURI(Landroid/net/Uri;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Path:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoPath(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun onError(p0: android.media.MediaPlayer, p1: Int, p2: Int): Boolean { return TODO("body: (Landroid/media/MediaPlayer;II)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStopped()V
    //         const/4 v0, 0x1
    //         return v0
    */

    protected fun onMeasure(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1, p2}, Landroid/widget/VideoView;->onMeasure(II)V
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I
    //         invoke-virtual {p0, v0, v1}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setMeasuredDimension(II)V
    //         :cond_0
    //         return-void
    */

    public fun onPrepared(p0: android.media.MediaPlayer) { /* TODO(body): (Landroid/media/MediaPlayer;)V */ }
    /*
    //         .locals 3
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F
    //         invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->start()V
    //         return-void
    */

    public fun onTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x2
    //         new-array v1, v1, [I
    //         invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/S3EVideoView;->getLocationOnScreen([I)V
    //         aget v0, v1, v0
    //         int-to-float v0, v0
    //         const/4 v2, 0x1
    //         aget v1, v1, v2
    //         int-to-float v1, v1
    //         invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->onTouchEvent(Landroid/view/MotionEvent;)Z
    //         move-result v0
    //         :cond_0
    //         return v0
    */

    public fun videoAddView(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) { /* TODO(body): (ZIIII)V */ }
    /*
    //         .locals 5
    //         const/4 v3, -0x1
    //         const/4 v2, 0x0
    //         iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Fullscreen:Z
    //         iput p4, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I
    //         iput p5, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/S3EVideoView;->requiresSeparateWindow()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/view/WindowManager$LayoutParams;
    //         invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V
    //         iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         or-int/lit8 v1, v1, 0x8
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         or-int/lit16 v1, v1, 0x200
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         or-int/lit16 v1, v1, 0x400
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         const/16 v1, 0x33
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
    //         iput p2, v0, Landroid/view/WindowManager$LayoutParams;->x:I
    //         iput p3, v0, Landroid/view/WindowManager$LayoutParams;->y:I
    //         iput p4, v0, Landroid/view/WindowManager$LayoutParams;->width:I
    //         iput p5, v0, Landroid/view/WindowManager$LayoutParams;->height:I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
    //         move-result-object v1
    //         invoke-interface {v1, p0, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
    //         const/16 v1, 0x11
    //         invoke-direct {v0, v3, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V
    //         iput v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Width:I
    //         iput v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Height:I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;
    //         invoke-virtual {v1, p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         :goto_1
    //         :try_start_0
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-string v1, "setZOrderOnTop"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Class;
    //         const/4 v3, 0x0
    //         sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
    //         aput-object v4, v2, v3
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         const/4 v3, 0x1
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
    //         invoke-direct {v0, p4, p5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
    //         iput p2, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
    //         iput p3, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TopLevel:Landroid/widget/RelativeLayout;
    //         invoke-virtual {v1, p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         goto :goto_1
    */

    public fun videoGetPosition(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->getCurrentPosition()I
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun videoPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->pause()V
    //         return-void
    */

    public fun videoPlay(p0: String, p1: Int, p2: Long, p3: Long): Int { return TODO("body: (Ljava/lang/String;IJJ)I") }
    /*
    //         .locals 3
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Repeats:I
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p5, v0
    //         if-nez v0, :cond_0
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Path:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Path:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoPath(Ljava/lang/String;)V
    //         :goto_0
    //         const/4 v0, 0x0
    //         return v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         sget-object v1, Lcom/ideaworks3d/marmalade/VFSProvider;->ASSET_URI:Landroid/net/Uri;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Uri:Landroid/net/Uri;
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->setVideoURI(Landroid/net/Uri;)V
    //         goto :goto_0
    */

    public fun videoRemoveView() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/S3EVideoView;->requiresSeparateWindow()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
    //         move-result-object v0
    //         invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Fullscreen:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;
    //         invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TopLevel:Landroid/widget/RelativeLayout;
    //         invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
    //         goto :goto_0
    */

    public fun videoResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->start()V
    //         return-void
    */

    public fun videoSetVolume(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         int-to-float v0, p1
    //         const/high16 v1, 0x43800000    # 256.0f
    //         div-float/2addr v0, v1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_Volume:F
    //         invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
    //         :cond_0
    //         return-void
    */

    public fun videoStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/S3EVideoView;->m_MediaPlayer:Landroid/media/MediaPlayer;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->stopPlayback()V
    //         return-void
    */

    companion object {
    @JvmField public val S3E_VIDEO_FAILED: Int = 0x3
    @JvmField public val S3E_VIDEO_MAX_VOLUME: Int = 0x100
    @JvmField public val S3E_VIDEO_PAUSED: Int = 0x2
    @JvmField public val S3E_VIDEO_PLAYING: Int = 0x1
    @JvmField public val S3E_VIDEO_STOPPED: Int = 0

    private @JvmStatic fun requiresSeparateWindow(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         const/4 v1, 0x4
    //         if-gt v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
