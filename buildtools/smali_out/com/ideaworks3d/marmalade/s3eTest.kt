package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eTest.java.
// 4 fields, 13 methods.

open class s3eTest {
    private var m_Handler: android.os.Handler
    private var suspendResumeCompletionFlag: Boolean
    private val suspendResumeLock: Object
    var thread: Thread

    public constructor()

    public fun GetAndroidTargetAPILevel(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget v0, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    public fun PostResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "PostResume"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$3;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eTest$3;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun PostRotate(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         const-string v0, "PostRotate"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$6;
    //         invoke-direct {v1, p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eTest$6;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;II)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun PostSetFocus(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         const-string v0, "PostSetFocus"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$4;
    //         invoke-direct {v1, p0, p1}, Lcom/ideaworks3d/marmalade/s3eTest$4;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;Z)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun PostSuspend() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "PostSuspend"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$2;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eTest$2;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun PostSuspendResume(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/Thread;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$5;
    //         invoke-direct {v1, p0, p2, p1}, Lcom/ideaworks3d/marmalade/s3eTest$5;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;II)V
    //         invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;
    //         invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    //         return-void
    */

    public fun QueryThreadFinished(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun TakeScreenShot(p0: IntArray): IntArray { return TODO("body: ([I)[I") }
    /*
    //         .locals 10
    //         const/4 v9, 0x1
    //         const/4 v2, 0x0
    //         const-string v0, "TakeScreenShot"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
    //         move-result-object v0
    //         const v1, 0x1020002
    //         invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v8
    //         invoke-virtual {v8, v9}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
    //         invoke-virtual {v8}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
    //         move-result v3
    //         invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
    //         move-result v7
    //         mul-int v1, v3, v7
    //         new-array v1, v1, [I
    //         move v4, v2
    //         move v5, v2
    //         move v6, v3
    //         invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
    //         aput v3, p1, v2
    //         aput v7, p1, v9
    //         invoke-virtual {v8, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
    //         return-object v1
    */

}
