package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCamera2.java.
// 36 fields, 30 methods.

open class s3eCamera2: com.ideaworks3d.marmalade.SuspendResumeListener {
    private val mOnImageAvailableListener: android.media.ImageReader.OnImageAvailableListener
    private val mStateCallback: android.hardware.camera2.CameraDevice.StateCallback
    var m_AutoFocus: Int
    private var m_Camera: android.hardware.camera2.CameraDevice
    private var m_CameraAFAvailableFront: Boolean
    private var m_CameraAFAvailableRear: Boolean
    private var m_CameraIdFront: String
    private var m_CameraIdRear: String
    private var m_CaptureSession: android.hardware.camera2.CameraCaptureSession
    var m_Facing: Int
    private var m_ImageReader: android.media.ImageReader
    var m_PixelFormat: Int
    private var m_PreviewRequestBuilder: android.hardware.camera2.CaptureRequest.Builder
    var m_Quality: Int
    private var m_Running: Boolean
    var m_SizeHint: Int

    public constructor()

    private fun CameraRestart(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->isCameraOpen()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->CloseCamera()V
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->OpenCamera()Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    private fun ChooseOptimalSize(p0: Array<android.util.Size>): android.util.Size { return TODO("body: ([Landroid/util/Size;)Landroid/util/Size;") }
    /*
    //         .locals 3
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->GetIdealSize()Landroid/util/Size;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;-><init>(Landroid/util/Size;)V
    //         invoke-static {v0, v1}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/util/Size;
    //         return-object v0
    */

    private fun CloseCamera() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Camera:Landroid/hardware/camera2/CameraDevice;
    //         if-nez v0, :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CaptureSession:Landroid/hardware/camera2/CameraCaptureSession;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CaptureSession:Landroid/hardware/camera2/CameraCaptureSession;
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V
    //         :try_end_1
    //         .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_1
    //         :try_start_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CaptureSession:Landroid/hardware/camera2/CameraCaptureSession;
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CaptureSession:Landroid/hardware/camera2/CameraCaptureSession;
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Camera:Landroid/hardware/camera2/CameraDevice;
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Camera:Landroid/hardware/camera2/CameraDevice;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_ImageReader:Landroid/media/ImageReader;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_ImageReader:Landroid/media/ImageReader;
    //         invoke-virtual {v0}, Landroid/media/ImageReader;->close()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_ImageReader:Landroid/media/ImageReader;
    //         :cond_2
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         :try_start_3
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->printStackTrace()V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         goto :goto_1
    */

    private fun GetCameraId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Facing:I
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdRear:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdFront:Ljava/lang/String;
    //         goto :goto_0
    */

    private fun GetIdealSize(): android.util.Size { return TODO("body: ()Landroid/util/Size;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_SizeHint:I
    //         if-ne v1, v0, :cond_1
    //         const/4 v0, 0x2
    //         :cond_0
    //         :goto_0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v2, v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         new-instance v1, Landroid/util/Size;
    //         iget v3, v2, Lcom/ideaworks3d/marmalade/LoaderView;->m_Width:I
    //         div-int/2addr v3, v0
    //         iget v2, v2, Lcom/ideaworks3d/marmalade/LoaderView;->m_Height:I
    //         div-int v0, v2, v0
    //         invoke-direct {v1, v3, v0}, Landroid/util/Size;-><init>(II)V
    //         invoke-virtual {v1}, Landroid/util/Size;->getWidth()I
    //         move-result v0
    //         invoke-virtual {v1}, Landroid/util/Size;->getHeight()I
    //         move-result v2
    //         if-ge v0, v2, :cond_2
    //         new-instance v0, Landroid/util/Size;
    //         invoke-virtual {v1}, Landroid/util/Size;->getHeight()I
    //         move-result v2
    //         invoke-virtual {v1}, Landroid/util/Size;->getWidth()I
    //         move-result v1
    //         invoke-direct {v0, v2, v1}, Landroid/util/Size;-><init>(II)V
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_SizeHint:I
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x4
    //         goto :goto_0
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_1
    */

    private fun OpenCamera(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->isCameraOpen()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->GetCameraId()Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v2, "camera"
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/hardware/camera2/CameraManager;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->GetCameraId()Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->mStateCallback:Landroid/hardware/camera2/CameraDevice$StateCallback;
    //         sget-object v4, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v4, v4, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v4, v4, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         invoke-virtual {v0, v2, v3, v4}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraOpenSem:Ljava/util/concurrent/Semaphore;
    //         invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V
    //         :try_end_0
    //         .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->isCameraOpen()Z
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->printStackTrace()V
    //         move v0, v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         move v0, v1
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         move v0, v1
    //         goto :goto_0
    */

    private fun ResetCameraIds() { /* TODO(body): ()V */ }
    /*
    //         .locals 13
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "camera"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/hardware/camera2/CameraManager;
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;
    //         move-result-object v7
    //         array-length v8, v7
    //         move v6, v4
    //         :goto_0
    //         if-ge v6, v8, :cond_6
    //         aget-object v9, v7, v6
    //         invoke-virtual {v0, v9}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;
    //         move-result-object v10
    //         sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;
    //         invoke-virtual {v10, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, [I
    //         array-length v11, v1
    //         move v5, v4
    //         move v2, v4
    //         :goto_1
    //         if-ge v5, v11, :cond_0
    //         aget v2, v1, v5
    //         const/4 v12, 0x4
    //         if-ne v2, v12, :cond_2
    //         move v2, v3
    //         :goto_2
    //         if-eqz v2, :cond_3
    //         :cond_0
    //         sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;
    //         invoke-virtual {v10, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/Integer;
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         move-result v1
    //         if-nez v1, :cond_4
    //         iput-object v9, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdFront:Ljava/lang/String;
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraAFAvailableFront:Z
    //         :cond_1
    //         :goto_3
    //         add-int/lit8 v1, v6, 0x1
    //         move v6, v1
    //         goto :goto_0
    //         :cond_2
    //         move v2, v4
    //         goto :goto_2
    //         :cond_3
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_1
    //         :cond_4
    //         sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;
    //         invoke-virtual {v10, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/Integer;
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         move-result v1
    //         if-ne v1, v3, :cond_1
    //         iput-object v9, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdRear:Ljava/lang/String;
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraAFAvailableRear:Z
    //         :try_end_0
    //         .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_3
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->printStackTrace()V
    //         :cond_5
    //         :goto_4
    //         return-void
    //         :cond_6
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdRear:Ljava/lang/String;
    //         if-nez v0, :cond_5
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdFront:Ljava/lang/String;
    //         if-eqz v0, :cond_5
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Facing:I
    //         :try_end_1
    //         .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_4
    */

    private fun ResetPreviewSize() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "camera"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/hardware/camera2/CameraManager;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->GetCameraId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;
    //         move-result-object v0
    //         sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;
    //         invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;
    //         const/16 v1, 0x23
    //         invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->ChooseOptimalSize([Landroid/util/Size;)Landroid/util/Size;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/util/Size;->getWidth()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/util/Size;->getHeight()I
    //         move-result v0
    //         const/16 v2, 0x23
    //         const/4 v3, 0x2
    //         invoke-static {v1, v0, v2, v3}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_ImageReader:Landroid/media/ImageReader;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_ImageReader:Landroid/media/ImageReader;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->mOnImageAvailableListener:Landroid/media/ImageReader$OnImageAvailableListener;
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v2, v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v2, v2, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         invoke-virtual {v0, v1, v2}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V
    //         :try_end_0
    //         .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->printStackTrace()V
    //         goto :goto_0
    */

    private fun createCameraPreviewSession() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->ResetPreviewSize()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Camera:Landroid/hardware/camera2/CameraDevice;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_PreviewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_PreviewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_ImageReader:Landroid/media/ImageReader;
    //         invoke-virtual {v1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Camera:Landroid/hardware/camera2/CameraDevice;
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Landroid/view/Surface;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_ImageReader:Landroid/media/ImageReader;
    //         invoke-virtual {v3}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         new-instance v2, Lcom/ideaworks3d/marmalade/s3eCamera2$2;
    //         invoke-direct {v2, p0}, Lcom/ideaworks3d/marmalade/s3eCamera2$2;-><init>(Lcom/ideaworks3d/marmalade/s3eCamera2;)V
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v3, v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v3, v3, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    //         :try_end_0
    //         .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->printStackTrace()V
    //         goto :goto_0
    */

    private fun isCameraOpen(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Camera:Landroid/hardware/camera2/CameraDevice;
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

    private external fun previewCallback(p0: ByteArray, p1: Int, p2: Int, p3: Int, p4: Int)

    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Running:Z
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_SizeHint:I
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_PixelFormat:I
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Quality:I
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eCamera2;->s3eCameraStart(III)I
    //         :cond_2
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_3
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->s3eCameraStop()I
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Running:Z
    //         :cond_3
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->s3eCameraStop()I
    //         goto :goto_0
    */

    public fun s3eCameraGetInt(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         packed-switch p1, :pswitch_data_0
    //         :pswitch_0
    //         const/4 v0, -0x1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :pswitch_1
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->isCameraOpen()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Facing:I
    //         goto :goto_0
    //         :pswitch_3
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
    //         :pswitch_4
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_AutoFocus:I
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_3
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_4
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun s3eCameraIsFormatSupported(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0x1002
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
    //         .locals 3
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         const/4 v2, 0x7
    //         if-ne p1, v2, :cond_4
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Facing:I
    //         if-ne v2, p2, :cond_0
    //         move v2, v1
    //         :goto_0
    //         if-eqz v2, :cond_9
    //         :goto_1
    //         return v0
    //         :cond_0
    //         if-ne p2, v1, :cond_1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdFront:Ljava/lang/String;
    //         if-nez v2, :cond_2
    //         :cond_1
    //         if-nez p2, :cond_3
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraIdRear:Ljava/lang/String;
    //         if-eqz v2, :cond_3
    //         :cond_2
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Facing:I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->CameraRestart()Z
    //         move-result v2
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_AutoFocus:I
    //         goto :goto_0
    //         :cond_3
    //         move v2, v0
    //         goto :goto_0
    //         :cond_4
    //         const/4 v2, 0x3
    //         if-ne p1, v2, :cond_a
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_AutoFocus:I
    //         if-ne v2, p2, :cond_5
    //         move v2, v1
    //         goto :goto_0
    //         :cond_5
    //         if-eqz p2, :cond_8
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Facing:I
    //         if-ne v2, v1, :cond_6
    //         iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraAFAvailableFront:Z
    //         if-eqz v2, :cond_7
    //         :cond_6
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Facing:I
    //         if-nez v2, :cond_8
    //         iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_CameraAFAvailableRear:Z
    //         if-nez v2, :cond_8
    //         :cond_7
    //         move v2, v0
    //         goto :goto_0
    //         :cond_8
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_AutoFocus:I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->CameraRestart()Z
    //         move-result v2
    //         goto :goto_0
    //         :cond_9
    //         move v0, v1
    //         goto :goto_1
    //         :cond_a
    //         move v2, v0
    //         goto :goto_0
    */

    public fun s3eCameraStart(p0: Int, p1: Int, p2: Int): Int { return TODO("body: (III)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p2}, Lcom/ideaworks3d/marmalade/s3eCamera2;->s3eCameraIsFormatSupported(I)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iput p1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_SizeHint:I
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_PixelFormat:I
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Quality:I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->OpenCamera()Z
    //         move-result v1
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Running:Z
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Running:Z
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun s3eCameraStop(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_Running:Z
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->CloseCamera()V
    //         return v0
    */

    companion object {
    val DefaultAutoFocusMode: Int = 0x4
    val S3E_CAMERA_AUTO_FOCUS: Int = 0x3
    val S3E_CAMERA_AVAILABLE: Int = 0x0
    val S3E_CAMERA_BRIGHTNESS: Int = 0x4
    val S3E_CAMERA_CONTRAST: Int = 0x5
    val S3E_CAMERA_IDLE: Int = 0x0
    val S3E_CAMERA_PIXEL_TYPE_NV12: Int = 0x1002
    val S3E_CAMERA_QUALITY: Int = 0x6
    val S3E_CAMERA_STATUS: Int = 0x1
    val S3E_CAMERA_STREAMING: Int = 0x1
    val S3E_CAMERA_STREAMING_SIZE_HINT_LARGEST: Int = 0x2
    val S3E_CAMERA_STREAMING_SIZE_HINT_MEDIUM: Int = 0x1
    val S3E_CAMERA_STREAMING_SIZE_HINT_SMALLEST: Int = 0x0
    val S3E_CAMERA_TYPE: Int = 0x7
    val S3E_CAMERA_TYPE_FRONT: Int = 0x1
    val S3E_CAMERA_TYPE_REAR: Int = 0x0
    val S3E_RESULT_ERROR: Int = 0x1
    val S3E_RESULT_SUCCESS: Int = 0
    private val m_CameraLock: Object = null!!
    private val m_CameraOpenSem: java.util.concurrent.Semaphore = null!!

    private @JvmStatic fun CopyLines(p0: ByteArray, p1: Int, p2: Int, p3: Int, p4: android.media.Image.Plane): Int { return TODO("body: ([BIIILandroid/media/Image$Plane;)I") }
    /*
    //         .locals 4
    //         invoke-virtual {p4}, Landroid/media/Image$Plane;->getRowStride()I
    //         move-result v1
    //         invoke-virtual {p4}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;
    //         move-result-object v2
    //         if-ne v1, p2, :cond_0
    //         mul-int v0, v1, p3
    //         invoke-virtual {v2, p0, p1, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    //         mul-int v0, p2, p3
    //         add-int/2addr v0, p1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_1
    //         add-int/lit8 v3, p3, -0x1
    //         if-ge v0, v3, :cond_1
    //         invoke-virtual {v2, p0, p1, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    //         add-int/2addr p1, p2
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_1
    //         invoke-virtual {v2, p0, p1, p2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    //         add-int v0, p1, p2
    //         goto :goto_0
    */

    }
}
