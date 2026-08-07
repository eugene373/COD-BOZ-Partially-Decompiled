package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCamera2.java.
// 1 fields, 4 methods.

open class s3eCamera2_Anon3: android.hardware.camera2.CameraDevice.StateCallback() {
    val this$0: com.ideaworks3d.marmalade.s3eCamera2

    constructor(p0: com.ideaworks3d.marmalade.s3eCamera2)

    public fun onDisconnected(p0: android.hardware.camera2.CameraDevice) { /* TODO(body): (Landroid/hardware/camera2/CameraDevice;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V
    //         return-void
    */

    public fun onError(p0: android.hardware.camera2.CameraDevice, p1: Int) { /* TODO(body): (Landroid/hardware/camera2/CameraDevice;I)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V
    //         return-void
    */

    public fun onOpened(p0: android.hardware.camera2.CameraDevice) { /* TODO(body): (Landroid/hardware/camera2/CameraDevice;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$000()Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$3;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v0, p1}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$102(Lcom/ideaworks3d/marmalade/s3eCamera2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$3;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$600(Lcom/ideaworks3d/marmalade/s3eCamera2;)V
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$700()Ljava/util/concurrent/Semaphore;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
