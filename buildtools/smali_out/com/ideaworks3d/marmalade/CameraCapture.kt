package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCameraCapture.java.
// 7 fields, 9 methods.

open class CameraCapture {
    constructor()

    private fun CheckCamera(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x9
    //         if-lt v1, v2, :cond_0
    //         invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;
    //         move-result-object v1
    //         :goto_0
    //         if-nez v1, :cond_1
    //         :goto_1
    //         return v0
    //         :cond_0
    //         invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v1}, Landroid/hardware/Camera;->release()V
    //         const/4 v0, 0x1
    //         goto :goto_1
    */

    private fun startCaptureImage(): java.io.File { return TODO("body: ()Ljava/io/File;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v1, 0x0
    //         new-instance v0, Landroid/content/ContentValues;
    //         invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
    //         new-instance v2, Landroid/content/Intent;
    //         const-string v3, "android.media.action.IMAGE_CAPTURE"
    //         invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v3, "title"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "New image "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         sget v5, Lcom/ideaworks3d/marmalade/CameraCapture;->videos:I
    //         add-int/lit8 v6, v5, 0x1
    //         sput v6, Lcom/ideaworks3d/marmalade/CameraCapture;->videos:I
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v3, "description"
    //         const-string v4, "Image captured by s3eCamera"
    //         invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_0
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v3
    //         sget-object v4, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;
    //         invoke-virtual {v3, v4, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //         :try_end_0
    //         .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         const-string v3, "output"
    //         invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         const-string v3, "android.intent.extra.videoQuality"
    //         invoke-virtual {v2, v3, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v3, "Executing Camera Capture intent"
    //         invoke-static {v3}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v3, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->ExecuteIntent(Landroid/content/Intent;)Landroid/content/Intent;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         const-string v2, "Activity returned null, assuming cancelled"
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v2
    //         invoke-virtual {v2, v0, v1, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //         move-object v0, v1
    //         :goto_1
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/io/File;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "/sdcard/image"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         sget v4, Lcom/ideaworks3d/marmalade/CameraCapture;->images:I
    //         add-int/lit8 v5, v4, 0x1
    //         sput v5, Lcom/ideaworks3d/marmalade/CameraCapture;->images:I
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_0
    //         const-string v1, "Retrieving image url"
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/String;
    //         const/4 v2, 0x0
    //         const-string v3, "_data"
    //         aput-object v3, v1, v2
    //         const-string v2, "_id"
    //         aput-object v2, v1, v7
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/CameraCapture;->convertUriToFile(Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v0
    //         goto :goto_1
    */

    private fun startCaptureVideo(): java.io.File { return TODO("body: ()Ljava/io/File;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "android.media.action.VIDEO_CAPTURE"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v1, "android.intent.extra.videoQuality"
    //         invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->ExecuteIntent(Landroid/content/Intent;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/String;
    //         const/4 v2, 0x0
    //         const-string v3, "_data"
    //         aput-object v3, v1, v2
    //         const-string v2, "_id"
    //         aput-object v2, v1, v4
    //         invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/CameraCapture;->convertUriToFile(Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun s3eCameraCaptureIsFormatSupported(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         if-eq v1, p1, :cond_0
    //         const/4 v1, 0x4
    //         if-eq v1, p1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/CameraCapture;->CheckCamera()I
    //         :try_end_0
    //         .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun s3eCameraCaptureToFile(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         const/4 v1, 0x4
    //         if-ne p1, v1, :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/CameraCapture;->startCaptureVideo()Ljava/io/File;
    //         move-result-object v1
    //         :goto_0
    //         if-nez v1, :cond_1
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         const/4 v1, 0x1
    //         if-ne p1, v1, :cond_2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/CameraCapture;->startCaptureImage()Ljava/io/File;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "raw://"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_2
    //         move-object v1, v0
    //         goto :goto_0
    */

    companion object {
    val S3E_CAMERACAPTURE_BMP: Int = 0x3
    val S3E_CAMERACAPTURE_JPG: Int = 0x1
    val S3E_CAMERACAPTURE_PNG: Int = 0x2
    val S3E_CAMERACAPTURE_VIDEO: Int = 0x4
    private var images: Int
    private var m_WaitingForFile: Boolean
    private var videos: Int

    public @JvmStatic fun convertUriToFile(p0: android.net.Uri, p1: Array<String>): java.io.File { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         new-array v0, v3, [Ljava/io/File;
    //         sput-boolean v3, Lcom/ideaworks3d/marmalade/CameraCapture;->m_WaitingForFile:Z
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         new-instance v2, Lcom/ideaworks3d/marmalade/CameraCapture$1;
    //         invoke-direct {v2, v0}, Lcom/ideaworks3d/marmalade/CameraCapture$1;-><init>([Ljava/io/File;)V
    //         invoke-virtual {v1, p0, p1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getCursor(Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V
    //         :goto_0
    //         sget-boolean v1, Lcom/ideaworks3d/marmalade/CameraCapture;->m_WaitingForFile:Z
    //         if-eqz v1, :cond_0
    //         invoke-static {v3}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDeviceYield(I)V
    //         goto :goto_0
    //         :cond_0
    //         const/4 v1, 0x0
    //         aget-object v0, v0, v1
    //         return-object v0
    */

    }
}
