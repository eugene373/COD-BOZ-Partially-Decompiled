package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCamera.java.
// 1 fields, 4 methods.

open class s3eCamera_Preview: android.view.SurfaceView(), android.view.SurfaceHolder.Callback {
    val this$0: com.ideaworks3d.marmalade.s3eCamera

    constructor(p0: com.ideaworks3d.marmalade.s3eCamera, p1: android.content.Context)

    public fun surfaceChanged(p0: android.view.SurfaceHolder, p1: Int, p2: Int, p3: Int) { /* TODO(body): (Landroid/view/SurfaceHolder;III)V */ }
    /*
    //         .locals 2
    //         invoke-interface {p1}, Landroid/view/SurfaceHolder;->isCreating()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$300()Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$100(Lcom/ideaworks3d/marmalade/s3eCamera;)Landroid/hardware/Camera;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->setCameraParameters()Landroid/hardware/Camera$Size;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$100(Lcom/ideaworks3d/marmalade/s3eCamera;)Landroid/hardware/Camera;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    */

    public fun surfaceCreated(p0: android.view.SurfaceHolder) { /* TODO(body): (Landroid/view/SurfaceHolder;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$000(Lcom/ideaworks3d/marmalade/s3eCamera;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$100(Lcom/ideaworks3d/marmalade/s3eCamera;)Landroid/hardware/Camera;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$100(Lcom/ideaworks3d/marmalade/s3eCamera;)Landroid/hardware/Camera;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$200(Lcom/ideaworks3d/marmalade/s3eCamera;)V
    //         goto :goto_0
    */

    public fun surfaceDestroyed(p0: android.view.SurfaceHolder) { /* TODO(body): (Landroid/view/SurfaceHolder;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$Preview;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->access$200(Lcom/ideaworks3d/marmalade/s3eCamera;)V
    //         return-void
    */

}
