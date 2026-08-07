package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eCameraCapture.java.
// 1 fields, 2 methods.

class CameraCapture_Anon1: com.ideaworks3d.marmalade.LoaderActivity.CursorCompleteListener {
    val val$holder: Array<java.io.File>

    constructor(p0: Array<java.io.File>)

    public fun cursorLoadComplete(p0: android.database.Cursor) { /* TODO(body): (Landroid/database/Cursor;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         :try_start_0
    //         const-string v0, "_data"
    //         invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
    //         move-result v0
    //         invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/CameraCapture$1;->val$holder:[Ljava/io/File;
    //         const/4 v2, 0x0
    //         new-instance v3, Ljava/io/File;
    //         invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         aput-object v3, v1, v2
    //         :try_end_0
    //         .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Landroid/database/Cursor;->close()V
    //         :cond_1
    //         const-string v0, "Finished waiting for file cursor"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         invoke-static {v4}, Lcom/ideaworks3d/marmalade/CameraCapture;->access$002(Z)Z
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         :try_start_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Exception in convertUriToFile: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         if-eqz p1, :cond_2
    //         invoke-interface {p1}, Landroid/database/Cursor;->close()V
    //         :cond_2
    //         const-string v0, "Finished waiting for file cursor"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         invoke-static {v4}, Lcom/ideaworks3d/marmalade/CameraCapture;->access$002(Z)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         if-eqz p1, :cond_3
    //         invoke-interface {p1}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         const-string v1, "Finished waiting for file cursor"
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         invoke-static {v4}, Lcom/ideaworks3d/marmalade/CameraCapture;->access$002(Z)Z
    //         throw v0
    */

}
