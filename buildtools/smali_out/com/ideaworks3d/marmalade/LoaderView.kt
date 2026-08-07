package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderView.java.
// 35 fields, 52 methods.

open class LoaderView: android.view.SurfaceView(), android.view.SurfaceHolder.Callback, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener {
    private val m_BacklightOn: Runnable
    private var m_EditText: android.widget.EditText
    private var m_ErrorBody: String
    private var m_ErrorDialog: android.app.Dialog
    private var m_ErrorRtn: Int
    public var m_ErrorRunning: Boolean
    private var m_ErrorTitle: String
    private var m_ErrorType: Int
    private var m_FullScreenBitmap: android.graphics.Bitmap
    public var m_GL: javax.microedition.khronos.opengles.GL
    var m_Handler: android.os.Handler
    public var m_Height: Int
    private var m_InputDialog: android.app.Dialog
    private var m_InputTextDefault: String
    private var m_InputTextFlags: Int
    private var m_InputTextResult: String
    public var m_InputTextRunning: Boolean
    private var m_InputTextTitle: String
    public var m_LoaderActivity: com.ideaworks3d.marmalade.LoaderActivity
    public var m_LoaderKeyboard: com.ideaworks3d.marmalade.LoaderKeyboard
    public var m_NewlyCreated: Boolean
    private var m_Paint: android.graphics.Paint
    private var m_Pixels: IntArray
    private val m_RunOnOSThread: Runnable
    private val m_ShowError: Runnable
    private val m_ShowInputText: Runnable
    private var m_SurfaceHolder: android.view.SurfaceHolder
    public var m_TerminateApplication: Boolean
    private var m_UseGL: Boolean
    private var m_Vibrator: android.os.Vibrator
    private var m_VideoState: Int
    private var m_VideoView: com.ideaworks3d.marmalade.S3EVideoView
    public var m_Width: Int

    public constructor(p0: com.ideaworks3d.marmalade.LoaderActivity, p1: Boolean)

    private fun backlightOn() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_BacklightOn:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    private external fun runOnOSThreadNative()

    private external fun setInputText(p0: String)

    private external fun setPixelsNative(p0: Int, p1: Int, p2: IntArray, p3: Boolean)

    private fun showErrorReal() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/app/AlertDialog$Builder;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
    //         const/4 v1, 0x0
    //         iput v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorTitle:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorBody:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         const-string v1, "Continue"
    //         invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorType:I
    //         if-lez v1, :cond_0
    //         const-string v1, "Stop"
    //         invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         :cond_0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorType:I
    //         const/4 v2, 0x1
    //         if-le v1, v2, :cond_1
    //         const-string v1, "Ignore"
    //         invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         :cond_1
    //         invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    //         return-void
    */

    private fun terminateApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_TerminateApplication:Z
    //         return-void
    */

    private fun videoIsPlaying(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoGetStatus()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private external fun videoStoppedNotify()

    public fun dispatchKeyEvent(p0: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/view/SurfaceView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun doDraw() { /* TODO(body): ()V */ }
    /*
    //         .locals 9
    //         const/4 v8, 0x0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-nez v0, :cond_1
    //         if-eqz v8, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-interface {v0, v8}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         :try_start_1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         if-eqz v0, :cond_2
    //         if-eqz v8, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-interface {v0, v8}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    //         goto :goto_0
    //         :cond_2
    //         :try_start_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I
    //         const/4 v2, 0x0
    //         iget v3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         iget v6, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I
    //         iget v7, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I
    //         invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-interface {v0}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         move-result-object v1
    //         if-nez v1, :cond_3
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    //         goto :goto_0
    //         :cond_3
    //         :try_start_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_FullScreenBitmap:Landroid/graphics/Bitmap;
    //         const/4 v2, 0x0
    //         const/4 v3, 0x0
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Paint:Landroid/graphics/Paint;
    //         invoke-virtual {v1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         move-object v1, v8
    //         :goto_1
    //         if-eqz v1, :cond_4
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-interface {v2, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    //         :cond_4
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_1
    */

    public fun doneInputText(p0: android.content.DialogInterface, p1: Int) { /* TODO(body): (Landroid/content/DialogInterface;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun enableRespondingToRotation() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->onSplashFinished()V
    //         return-void
    */

    public fun getCurrentOrientation(): Int { return TODO("body: ()I") }
    /*
    //         .locals 8
    //         const/16 v4, 0x8
    //         const/4 v5, -0x1
    //         const/16 v3, 0x9
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         if-ge v0, v3, :cond_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
    //         move-result-object v0
    //         iget v0, v0, Landroid/content/res/Configuration;->orientation:I
    //         packed-switch v0, :pswitch_data_0
    //         move v2, v5
    //         :cond_0
    //         :goto_0
    //         :pswitch_0
    //         return v2
    //         :pswitch_1
    //         move v2, v1
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v6, "window"
    //         invoke-virtual {v0, v6}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/WindowManager;
    //         invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v6
    //         invoke-virtual {v6}, Landroid/view/Display;->getWidth()I
    //         move-result v0
    //         invoke-virtual {v6}, Landroid/view/Display;->getHeight()I
    //         move-result v7
    //         if-lt v0, v7, :cond_2
    //         move v0, v1
    //         :goto_1
    //         invoke-virtual {v6}, Landroid/view/Display;->getRotation()I
    //         move-result v6
    //         packed-switch v6, :pswitch_data_1
    //         move v2, v5
    //         goto :goto_0
    //         :cond_2
    //         move v0, v2
    //         goto :goto_1
    //         :pswitch_2
    //         if-nez v0, :cond_0
    //         move v2, v1
    //         goto :goto_0
    //         :pswitch_3
    //         if-nez v0, :cond_0
    //         move v2, v3
    //         goto :goto_0
    //         :pswitch_4
    //         if-eqz v0, :cond_3
    //         move v3, v4
    //         :cond_3
    //         move v2, v3
    //         goto :goto_0
    //         :pswitch_5
    //         if-eqz v0, :cond_4
    //         :goto_2
    //         move v2, v4
    //         goto :goto_0
    //         :cond_4
    //         move v4, v1
    //         goto :goto_2
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    //         :pswitch_data_1
    //         .packed-switch 0x0
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //         .end packed-switch
    */

    public fun getInputString(p0: String, p1: String, p2: Int) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextTitle:Ljava/lang/String;
    //         iput-object p2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextDefault:Ljava/lang/String;
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowInputText:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun getLocale(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun glInit(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-virtual {v0, v1, p1}, Lcom/ideaworks3d/marmalade/LoaderGL;->startGL(Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    //         return v0
    */

    public fun glPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         new-array v0, v0, [I
    //         const-string v1, "GL"
    //         const-string v2, "AndroidTerminateGLOnPause"
    //         invoke-static {v1, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const/4 v1, 0x0
    //         aget v0, v0, v1
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stopGL()V
    //         :goto_0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;
    //         :cond_0
    //         return-void
    //         :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->pauseGL()V
    //         goto :goto_0
    */

    public fun glReInit() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->restartGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;
    //         :cond_0
    //         return-void
    */

    public fun glResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         new-array v0, v0, [I
    //         const-string v1, "GL"
    //         const-string v2, "AndroidTerminateGLOnPause"
    //         invoke-static {v1, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const/4 v1, 0x0
    //         aget v0, v0, v1
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->restartGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_SurfaceHolder:Landroid/view/SurfaceHolder;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderGL;->resumeGL(Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;
    //         goto :goto_0
    */

    public fun glSwapBuffers() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->swap()V
    //         goto :goto_0
    */

    public fun glTerm() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_UseGL:Z
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->started()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderGL:Lcom/ideaworks3d/marmalade/LoaderGL;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderGL;->stopGL()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_GL:Ljavax/microedition/khronos/opengles/GL;
    //         :cond_0
    //         return-void
    */

    public fun onClick(p0: android.content.DialogInterface, p1: Int) { /* TODO(body): (Landroid/content/DialogInterface;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;
    //         if-ne p1, v0, :cond_2
    //         const/4 v0, -0x1
    //         if-ne p2, v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextResult:Ljava/lang/String;
    //         :cond_0
    //         invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;
    //         if-ne p1, v0, :cond_1
    //         packed-switch p2, :pswitch_data_0
    //         :goto_1
    //         invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V
    //         goto :goto_0
    //         :pswitch_0
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I
    //         goto :goto_1
    //         :pswitch_1
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I
    //         goto :goto_1
    //         :pswitch_2
    //         const/4 v0, 0x2
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I
    //         goto :goto_1
    //         :pswitch_data_0
    //         .packed-switch -0x3
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun onCreateInputConnection(p0: android.view.inputmethod.EditorInfo): android.view.inputmethod.InputConnection { return TODO("body: (Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;") }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I
    //         const/high16 v1, 0x10000000
    //         or-int/2addr v0, v1
    //         iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I
    //         :cond_0
    //         invoke-super {p0, p1}, Landroid/view/SurfaceView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onDismiss(p0: android.content.DialogInterface) { /* TODO(body): (Landroid/content/DialogInterface;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;
    //         if-ne p1, v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextResult:Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderView;->setInputText(Ljava/lang/String;)V
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;
    //         if-ne p1, v0, :cond_0
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorDialog:Landroid/app/Dialog;
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRunning:Z
    //         goto :goto_0
    */

    protected fun onDraw(p0: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Landroid/view/SurfaceView;->onDraw(Landroid/graphics/Canvas;)V
    //         return-void
    */

    public fun onKeyEvent(p0: Int, p1: Int, p2: android.view.KeyEvent): Boolean { return TODO("body: (IILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z
    //         if-eqz v1, :cond_1
    //         const/4 v1, 0x4
    //         if-ne p1, v1, :cond_1
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-virtual {p0, p3}, Lcom/ideaworks3d/marmalade/LoaderView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->onKeyEvent(IILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun onKeyPreIme(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->onKeyPreIme(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun onTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->onTouchEvent(Landroid/view/MotionEvent;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun runOnOSThread() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_RunOnOSThread:Ljava/lang/Runnable;
    //         invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_0
    //         :try_start_2
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun showError(p0: String, p1: String, p2: Int): Int { return TODO("body: (Ljava/lang/String;Ljava/lang/String;I)I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->isFinishing()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowError:Ljava/lang/Runnable;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorTitle:Ljava/lang/String;
    //         iput-object p2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorBody:Ljava/lang/String;
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorType:I
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRunning:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ShowError:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRunning:Z
    //         if-eqz v0, :cond_1
    //         const/16 v0, 0x14
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDeviceYield(I)V
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_ErrorRtn:I
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    */

    public fun showInputTextReal() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/widget/EditText;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextDefault:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I
    //         and-int/lit8 v0, v0, 0x1
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         const/16 v1, 0x80
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         new-instance v1, Landroid/text/method/PasswordTransformationMethod;
    //         invoke-direct {v1}, Landroid/text/method/PasswordTransformationMethod;-><init>()V
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
    //         :cond_0
    //         :goto_0
    //         new-instance v0, Landroid/app/AlertDialog$Builder;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderActivity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextTitle:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
    //         const-string v1, "OK"
    //         invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         const-string v1, "Cancel"
    //         invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextRunning:Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextResult:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputDialog:Landroid/app/Dialog;
    //         invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    //         return-void
    //         :cond_1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I
    //         and-int/lit8 v0, v0, 0x2
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         const/16 v1, 0x21
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V
    //         goto :goto_0
    //         :cond_2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I
    //         and-int/lit8 v0, v0, 0x4
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         const/16 v1, 0x11
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V
    //         goto :goto_0
    //         :cond_3
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_InputTextFlags:I
    //         and-int/lit8 v0, v0, 0x8
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_EditText:Landroid/widget/EditText;
    //         const/16 v1, 0x2002
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V
    //         goto :goto_0
    */

    public fun surfaceCreated(p0: android.view.SurfaceHolder) { /* TODO(body): (Landroid/view/SurfaceHolder;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_NewlyCreated:Z
    //         return-void
    */

    public fun vibrateAvailable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-string v1, "hasVibrator"
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Class;
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun vibrateStart(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;
    //         invoke-virtual {v0, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V
    //         return-void
    */

    public fun vibrateStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Vibrator:Landroid/os/Vibrator;
    //         invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V
    //         return-void
    */

    public fun videoGetPosition(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoGetPosition()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun videoGetStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         return v0
    */

    public fun videoPause(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_0
    //         iput v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setState(I)V
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    public fun videoPlay(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Boolean, p8: Long, p9: Long): Int { return TODO("body: (Ljava/lang/String;IIIIIIZJJ)I") }
    /*
    //         .locals 15
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;
    //         const/4 v0, 0x0
    //         invoke-direct {v1, p0, v0}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V
    //         move-object/from16 v2, p1
    //         move/from16 v3, p2
    //         move/from16 v4, p3
    //         move/from16 v5, p4
    //         move/from16 v6, p5
    //         move/from16 v7, p6
    //         move/from16 v8, p7
    //         move/from16 v9, p8
    //         move-wide/from16 v10, p9
    //         move-wide/from16 v12, p11
    //         invoke-virtual/range {v1 .. v13}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->play(Ljava/lang/String;IIIIIIZJJ)V
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I
    //         move-result v0
    //         return v0
    */

    public fun videoResume(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         iput v2, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setState(I)V
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    public fun videoSetVolume(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setVolume(I)V
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I
    //         return-void
    */

    public fun videoStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, p0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;-><init>(Lcom/ideaworks3d/marmalade/LoaderView;Lcom/ideaworks3d/marmalade/LoaderView$1;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->setState(I)V
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->runOnUiThread(Z)I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoIsPlaying()Z
    //         move-result v0
    //         iput v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         :goto_0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoIsPlaying()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStopped()V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         move v0, v1
    //         goto :goto_0
    */

    public fun videoStopped() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/S3EVideoView;->videoRemoveView()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoView:Lcom/ideaworks3d/marmalade/S3EVideoView;
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_VideoState:I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoStoppedNotify()V
    //         return-void
    */

    public fun waitForSurface(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         monitor-enter p0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-nez v1, :cond_0
    //         :try_start_1
    //         invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :cond_0
    //         :try_start_2
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderView;->m_Pixels:[I
    //         if-nez v1, :cond_1
    //         monitor-exit p0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         monitor-exit p0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_3
    //         monitor-exit p0
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    companion object {
    private var g_PixelsLast: IntArray
    private var m_LoaderGL: com.ideaworks3d.marmalade.LoaderGL
    }
}
