package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCamera.java.
// 28 fields, 29 methods.

open class s3eCamera: android.hardware.Camera.PreviewCallback, com.ideaworks3d.marmalade.SuspendResumeListener {
    var m_AutoFocus: Int
    private var m_AutoFocusIsOn: Boolean
    private var m_AutoFocusModes: Array<String>
    private var m_Camera: android.hardware.Camera
    private var m_NeedsRemovePreview: Boolean
    private var m_NonAutoFocusModes: Array<String>
    var m_PixelFormat: Int
    private var m_Preview: com.ideaworks3d.marmalade.s3eCamera.Preview
    var m_Quality: Int
    private var m_Running: Boolean
    var m_SizeHint: Int
    var m_Type: Int

    public constructor()

    private fun CloseCamera() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eCamera;->m_CameraLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         if-nez v0, :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun OpenCamera(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->isCameraOpen()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x9
    //         if-lt v1, v2, :cond_2
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Type:I
    //         invoke-static {v1}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         :goto_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_2
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Type:I
    //         if-eqz v1, :cond_3
    //         const-string v1, "SDK9 method [android.hardware.Camera.open(int)] was not found on the device."
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         :cond_3
    //         invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         goto :goto_1
    */

    private fun chooseFocusMode(p0: Array<String>): Boolean { return TODO("body: ([Ljava/lang/String;)Z") }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         const/4 v0, 0x0
    //         move v1, v2
    //         :goto_0
    //         array-length v3, p1
    //         if-ge v1, v3, :cond_1
    //         if-nez v0, :cond_1
    //         aget-object v3, p1, v1
    //         invoke-direct {p0, v3}, Lcom/ideaworks3d/marmalade/s3eCamera;->isFocusModeSupported(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         aget-object v0, p1, v1
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         if-eqz v0, :cond_3
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->isCameraOpen()Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         const/4 v1, 0x2
    //         :cond_2
    //         :try_start_0
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->setFocusMode(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->forceRefocus(Ljava/lang/String;)V
    //         :cond_3
    //         if-eqz v0, :cond_4
    //         const/4 v2, 0x1
    //         :cond_4
    //         return v2
    //         :catch_0
    //         move-exception v3
    //         add-int/lit8 v1, v1, -0x1
    //         if-nez v1, :cond_2
    //         goto :goto_1
    */

    private fun forceRefocus(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         if-eqz v0, :cond_0
    //         const-string v0, "auto"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eCamera$1;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eCamera$1;-><init>(Lcom/ideaworks3d/marmalade/s3eCamera;)V
    //         invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    //         :cond_0
    //         return-void
    */

    private fun getOptimalPreviewSize(p0: java.util.List, p1: Int, p2: Int): android.hardware.Camera.Size { return TODO("body: (Ljava/util/List;II)Landroid/hardware/Camera$Size;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/hardware/Camera$Size;",
    //                 ">;II)",
    //                 "Landroid/hardware/Camera$Size;"
    //             }
    //         .end annotation
    //         if-le p2, p3, :cond_0
    //         move v4, p2
    //         :goto_0
    //         if-ge p2, p3, :cond_1
    //         :goto_1
    //         const/4 v3, 0x0
    //         const v2, 0x7fffffff
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_2
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/hardware/Camera$Size;
    //         iget v1, v0, Landroid/hardware/Camera$Size;->height:I
    //         sub-int/2addr v1, p2
    //         invoke-static {v1}, Ljava/lang/Math;->abs(I)I
    //         move-result v1
    //         iget v6, v0, Landroid/hardware/Camera$Size;->width:I
    //         sub-int/2addr v6, v4
    //         invoke-static {v6}, Ljava/lang/Math;->abs(I)I
    //         move-result v6
    //         add-int/2addr v1, v6
    //         if-ge v1, v2, :cond_3
    //         move v7, v1
    //         move-object v1, v0
    //         move v0, v7
    //         :goto_3
    //         move v2, v0
    //         move-object v3, v1
    //         goto :goto_2
    //         :cond_0
    //         move v4, p3
    //         goto :goto_0
    //         :cond_1
    //         move p2, p3
    //         goto :goto_1
    //         :cond_2
    //         return-object v3
    //         :cond_3
    //         move v0, v2
    //         move-object v1, v3
    //         goto :goto_3
    */

    private fun isCameraOpen(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eCamera;->m_CameraLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         monitor-exit v1
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun isFocusModeSupported(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->isCameraOpen()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         :cond_0
    //         return v0
    */

    private external fun previewCallback(p0: ByteArray, p1: Int, p2: Int, p3: Int, p4: Int)

    private fun s3ePixelFormatToPlatform(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         const/16 v0, 0x1001
    //         if-ne p1, v0, :cond_0
    //         const/16 v0, 0x11
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun setAutoFocusOffParams(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_NonAutoFocusModes:[Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->chooseFocusMode([Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_AutoFocusIsOn:Z
    //         return v1
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun setAutoFocusOnParams(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_AutoFocusModes:[Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->chooseFocusMode([Ljava/lang/String;)Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_AutoFocusIsOn:Z
    //         return v0
    */

    private fun setFocusMode(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    //         return-void
    */

    private fun waitForPreviewLock() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PreviewLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PreviewLock:Ljava/lang/Object;
    //         const-wide/16 v2, 0x3e8
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         :try_start_1
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun createPreview(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         const/4 v3, 0x0
    //         new-instance v0, Landroid/view/WindowManager$LayoutParams;
    //         invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V
    //         iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         or-int/lit8 v1, v1, 0x8
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         or-int/lit8 v1, v1, 0x10
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         or-int/lit16 v1, v1, 0x200
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         or-int/lit16 v1, v1, 0x400
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
    //         const/16 v1, 0x55
    //         iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
    //         iput v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I
    //         iput v3, v0, Landroid/view/WindowManager$LayoutParams;->y:I
    //         iput v4, v0, Landroid/view/WindowManager$LayoutParams;->width:I
    //         iput v4, v0, Landroid/view/WindowManager$LayoutParams;->height:I
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v1, p0, v2}, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;-><init>(Lcom/ideaworks3d/marmalade/s3eCamera;Landroid/content/Context;)V
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Preview:Lcom/ideaworks3d/marmalade/s3eCamera$Preview;
    //         iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_NeedsRemovePreview:Z
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Preview:Lcom/ideaworks3d/marmalade/s3eCamera$Preview;
    //         invoke-interface {v1, v2, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PreviewLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PreviewLock:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    //         monitor-exit v1
    //         return v3
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun onPreviewFrame(p0: ByteArray, p1: android.hardware.Camera) { /* TODO(body): ([BLandroid/hardware/Camera;)V */ }
    /*
    //         .locals 6
    //         const/16 v2, 0x1001
    //         invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PixelFormat:I
    //         if-ne v1, v2, :cond_0
    //         invoke-direct {p0, v2}, Lcom/ideaworks3d/marmalade/s3eCamera;->s3ePixelFormatToPlatform(I)I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I
    //         move-result v2
    //         if-ne v1, v2, :cond_0
    //         array-length v1, p1
    //         invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;
    //         move-result-object v2
    //         iget v2, v2, Landroid/hardware/Camera$Size;->width:I
    //         invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;
    //         move-result-object v3
    //         iget v3, v3, Landroid/hardware/Camera$Size;->height:I
    //         mul-int/2addr v2, v3
    //         mul-int/lit8 v2, v2, 0x3
    //         div-int/lit8 v2, v2, 0x2
    //         if-ge v1, v2, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I
    //         move-result v2
    //         invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;
    //         move-result-object v1
    //         iget v3, v1, Landroid/hardware/Camera$Size;->width:I
    //         invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;
    //         move-result-object v0
    //         iget v4, v0, Landroid/hardware/Camera$Size;->height:I
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->getOrientation()I
    //         move-result v5
    //         move-object v0, p0
    //         move-object v1, p1
    //         invoke-direct/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eCamera;->previewCallback([BIIII)V
    //         goto :goto_0
    */

    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Running:Z
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_SizeHint:I
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PixelFormat:I
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Quality:I
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eCamera;->s3eCameraStart(III)I
    //         :cond_2
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_3
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->s3eCameraStop()I
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Running:Z
    //         :cond_3
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->s3eCameraStop()I
    //         goto :goto_0
    */

    public fun removePreview(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Preview:Lcom/ideaworks3d/marmalade/s3eCamera$Preview;
    //         if-eqz v1, :cond_0
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_NeedsRemovePreview:Z
    //         if-eqz v1, :cond_0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_NeedsRemovePreview:Z
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Preview:Lcom/ideaworks3d/marmalade/s3eCamera$Preview;
    //         invoke-interface {v1, v2}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Preview:Lcom/ideaworks3d/marmalade/s3eCamera$Preview;
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun s3eCameraGetInt(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         packed-switch p1, :pswitch_data_0
    //         :pswitch_0
    //         move v0, v1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :pswitch_1
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->isCameraOpen()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_2
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v2
    //         const-string v3, "android.hardware.camera"
    //         invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         const-string v3, "android.permission.CAMERA"
    //         sget-object v4, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v4}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v2
    //         if-nez v2, :cond_1
    //         move v2, v0
    //         :goto_1
    //         if-nez v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :pswitch_3
    //         iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_AutoFocusIsOn:Z
    //         if-nez v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_4
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Type:I
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_4
    //         .end packed-switch
    */

    public fun s3eCameraIsFormatSupported(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0x1001
    //         if-ne p1, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun s3eCameraSetInt(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const/4 v1, 0x7
    //         if-ne p1, v1, :cond_1
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Type:I
    //         if-eq v1, p2, :cond_0
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Type:I
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_AutoFocusIsOn:Z
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->isCameraOpen()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->CloseCamera()V
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->OpenCamera()Z
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v1, 0x3
    //         if-ne p1, v1, :cond_0
    //         if-nez p2, :cond_3
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->setAutoFocusOffParams()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :cond_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_3
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->setAutoFocusOnParams()Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         goto :goto_0
    */

    public fun s3eCameraStart(p0: Int, p1: Int, p2: Int): Int { return TODO("body: (III)I") }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         iput p1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_SizeHint:I
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PixelFormat:I
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Quality:I
    //         :try_start_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->OpenCamera()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         const-string v1, "Can\'t open the camera."
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;
    //         iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Running:Z
    //         :goto_0
    //         return v2
    //         :cond_0
    //         :try_start_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->setCameraParameters()Landroid/hardware/Camera$Size;
    //         move-result-object v0
    //         const-string v1, "Creating image buffer"
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget v1, v0, Landroid/hardware/Camera$Size;->width:I
    //         iget v0, v0, Landroid/hardware/Camera$Size;->height:I
    //         mul-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x2
    //         const-string v0, "Invoking preview methods"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v0, p0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xb
    //         if-lt v0, v1, :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eCamera$2;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eCamera$2;-><init>(Lcom/ideaworks3d/marmalade/s3eCamera;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->runOnUiThread(Ljava/lang/Runnable;)V
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->waitForPreviewLock()V
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Running:Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    */

    public fun s3eCameraStop(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Running:Z
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->CloseCamera()V
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_NeedsRemovePreview:Z
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eCamera$3;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eCamera$3;-><init>(Lcom/ideaworks3d/marmalade/s3eCamera;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->runOnUiThread(Ljava/lang/Runnable;)V
    //         :cond_0
    //         return v2
    */

    public fun setCameraParameters(): android.hardware.Camera.Size { return TODO("body: ()Landroid/hardware/Camera$Size;") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         if-nez v2, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v2, "Setting camera parameters"
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
    //         move-result-object v2
    //         :try_start_0
    //         invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFormats()Ljava/util/List;
    //         move-result-object v3
    //         iget v4, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_PixelFormat:I
    //         invoke-direct {p0, v4}, Lcom/ideaworks3d/marmalade/s3eCamera;->s3ePixelFormatToPlatform(I)I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->setPreviewFormat(I)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    //         :cond_1
    //         :goto_1
    //         const-string v3, "Setting preview size"
    //         invoke-static {v3}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_SizeHint:I
    //         if-ne v3, v1, :cond_4
    //         const/4 v1, 0x2
    //         :cond_2
    //         :goto_2
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v3, v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget v4, v3, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I
    //         div-int/2addr v4, v1
    //         iget v3, v3, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I
    //         div-int v1, v3, v1
    //         invoke-direct {p0, v0, v4, v1}, Lcom/ideaworks3d/marmalade/s3eCamera;->getOptimalPreviewSize(Ljava/util/List;II)Landroid/hardware/Camera$Size;
    //         move-result-object v0
    //         iget v1, v0, Landroid/hardware/Camera$Size;->width:I
    //         iget v3, v0, Landroid/hardware/Camera$Size;->height:I
    //         invoke-virtual {v2, v1, v3}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Type:I
    //         if-eqz v1, :cond_3
    //         const-string v1, "Setting camera ID"
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         const-string v1, "camera-id"
    //         iget v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Type:I
    //         add-int/lit8 v3, v3, 0x1
    //         invoke-virtual {v2, v1, v3}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V
    //         :cond_3
    //         :try_start_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v1}, Landroid/hardware/Camera;->stopPreview()V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_Camera:Landroid/hardware/Camera;
    //         invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    //         invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;
    //         move-result-object v0
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_AutoFocusIsOn:Z
    //         if-eqz v1, :cond_5
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->setAutoFocusOnParams()Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :cond_4
    //         iget v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera;->m_SizeHint:I
    //         if-nez v3, :cond_2
    //         const/4 v1, 0x4
    //         goto :goto_2
    //         :cond_5
    //         :try_start_2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera;->setAutoFocusOffParams()Z
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    //         goto :goto_0
    //         :catch_1
    //         move-exception v3
    //         goto :goto_1
    */

    companion object {
    val S3E_CAMERA_AUTO_FOCUS: Int = 0x3
    val S3E_CAMERA_AVAILABLE: Int = 0x0
    val S3E_CAMERA_BRIGHTNESS: Int = 0x4
    val S3E_CAMERA_CONTRAST: Int = 0x5
    val S3E_CAMERA_IDLE: Int = 0x0
    val S3E_CAMERA_PIXEL_TYPE_NV21: Int = 0x1001
    val S3E_CAMERA_QUALITY: Int = 0x6
    val S3E_CAMERA_STATUS: Int = 0x1
    val S3E_CAMERA_STREAMING: Int = 0x1
    val S3E_CAMERA_STREAMING_SIZE_HINT_LARGEST: Int = 0x2
    val S3E_CAMERA_STREAMING_SIZE_HINT_MEDIUM: Int = 0x1
    val S3E_CAMERA_STREAMING_SIZE_HINT_SMALLEST: Int = 0x0
    val S3E_CAMERA_TYPE: Int = 0x7
    private val WAIT_FOR_COMMAND_TO_COMPLETE: Int = 0x3e8
    private val m_CameraLock: Object = null!!
    private val m_PreviewLock: Object = null!!
    }
}
