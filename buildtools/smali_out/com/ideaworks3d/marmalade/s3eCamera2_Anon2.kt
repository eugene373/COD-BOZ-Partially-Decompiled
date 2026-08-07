package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCamera2.java.
// 1 fields, 3 methods.

open class s3eCamera2_Anon2: android.hardware.camera2.CameraCaptureSession.StateCallback() {
    val this$0: com.ideaworks3d.marmalade.s3eCamera2

    constructor(p0: com.ideaworks3d.marmalade.s3eCamera2)

    public fun onConfigureFailed(p0: android.hardware.camera2.CameraCaptureSession) { /* TODO(body): (Landroid/hardware/camera2/CameraCaptureSession;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onConfigured(p0: android.hardware.camera2.CameraCaptureSession) { /* TODO(body): (Landroid/hardware/camera2/CameraCaptureSession;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$100(Lcom/ideaworks3d/marmalade/s3eCamera2;)Landroid/hardware/camera2/CameraDevice;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v0, p1}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$402(Lcom/ideaworks3d/marmalade/s3eCamera2;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$500(Lcom/ideaworks3d/marmalade/s3eCamera2;)Landroid/hardware/camera2/CaptureRequest$Builder;
    //         move-result-object v1
    //         sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         iget v0, v0, Lcom/ideaworks3d/marmalade/s3eCamera2;->m_AutoFocus:I
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x4
    //         :goto_1
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-virtual {v1, v2, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$500(Lcom/ideaworks3d/marmalade/s3eCamera2;)Landroid/hardware/camera2/CaptureRequest$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$400(Lcom/ideaworks3d/marmalade/s3eCamera2;)Landroid/hardware/camera2/CameraCaptureSession;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v3, v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v3, v3, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;
    //         invoke-virtual {v1, v0, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    //         :try_end_0
    //         .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->printStackTrace()V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

}
