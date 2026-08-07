package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCamera2.java.
// 1 fields, 2 methods.

open class s3eCamera2_Anon1: android.media.ImageReader.OnImageAvailableListener {
    val this$0: com.ideaworks3d.marmalade.s3eCamera2

    constructor(p0: com.ideaworks3d.marmalade.s3eCamera2)

    public fun onImageAvailable(p0: android.media.ImageReader) { /* TODO(body): (Landroid/media/ImageReader;)V */ }
    /*
    //         .locals 8
    //         const/4 v3, 0x1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$000()Ljava/lang/Object;
    //         move-result-object v6
    //         monitor-enter v6
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$1;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$100(Lcom/ideaworks3d/marmalade/s3eCamera2;)Landroid/hardware/camera2/CameraDevice;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         monitor-exit v6
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/media/ImageReader;->acquireNextImage()Landroid/media/Image;
    //         move-result-object v7
    //         invoke-virtual {v7}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;
    //         move-result-object v0
    //         array-length v1, v0
    //         const/4 v2, 0x3
    //         if-ne v1, v2, :cond_1
    //         const/4 v1, 0x0
    //         aget-object v1, v0, v1
    //         invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I
    //         move-result v1
    //         if-ne v1, v3, :cond_1
    //         const/4 v1, 0x1
    //         aget-object v1, v0, v1
    //         invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I
    //         move-result v1
    //         if-ne v1, v3, :cond_1
    //         const/4 v1, 0x2
    //         aget-object v1, v0, v1
    //         invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I
    //         move-result v1
    //         if-ne v1, v3, :cond_1
    //         const/4 v1, 0x0
    //         aget-object v1, v0, v1
    //         invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I
    //         move-result v1
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v2
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v3
    //         mul-int/2addr v2, v3
    //         if-lt v1, v2, :cond_1
    //         const/4 v1, 0x1
    //         aget-object v1, v0, v1
    //         invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I
    //         move-result v1
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v2
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v3
    //         mul-int/2addr v2, v3
    //         div-int/lit8 v2, v2, 0x4
    //         if-lt v1, v2, :cond_1
    //         const/4 v1, 0x2
    //         aget-object v1, v0, v1
    //         invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I
    //         move-result v1
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v2
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v3
    //         mul-int/2addr v2, v3
    //         div-int/lit8 v2, v2, 0x4
    //         if-ge v1, v2, :cond_2
    //         :cond_1
    //         invoke-virtual {v7}, Landroid/media/Image;->close()V
    //         monitor-exit v6
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v6
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v1
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v2
    //         mul-int/2addr v1, v2
    //         mul-int/lit8 v1, v1, 0x3
    //         div-int/lit8 v1, v1, 0x2
    //         add-int/lit16 v1, v1, 0x200
    //         new-array v1, v1, [B
    //         const/4 v2, 0x0
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v3
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v4
    //         const/4 v5, 0x0
    //         aget-object v5, v0, v5
    //         invoke-static {v1, v2, v3, v4, v5}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$200([BIIILandroid/media/Image$Plane;)I
    //         move-result v2
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v3
    //         div-int/lit8 v3, v3, 0x2
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v4
    //         div-int/lit8 v4, v4, 0x2
    //         const/4 v5, 0x1
    //         aget-object v5, v0, v5
    //         invoke-static {v1, v2, v3, v4, v5}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$200([BIIILandroid/media/Image$Plane;)I
    //         move-result v2
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v3
    //         div-int/lit8 v3, v3, 0x2
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v4
    //         div-int/lit8 v4, v4, 0x2
    //         const/4 v5, 0x2
    //         aget-object v0, v0, v5
    //         invoke-static {v1, v2, v3, v4, v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$200([BIIILandroid/media/Image$Plane;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$1;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;
    //         const v2, 0x32315659
    //         invoke-virtual {v7}, Landroid/media/Image;->getWidth()I
    //         move-result v3
    //         invoke-virtual {v7}, Landroid/media/Image;->getHeight()I
    //         move-result v4
    //         sget-object v5, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v5}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v5
    //         invoke-virtual {v5}, Lcom/ideaworks3d/marmalade/LoaderThread;->getOrientation()I
    //         move-result v5
    //         invoke-static/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$300(Lcom/ideaworks3d/marmalade/s3eCamera2;[BIIII)V
    //         invoke-virtual {v7}, Landroid/media/Image;->close()V
    //         monitor-exit v6
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto/16 :goto_0
    */

}
