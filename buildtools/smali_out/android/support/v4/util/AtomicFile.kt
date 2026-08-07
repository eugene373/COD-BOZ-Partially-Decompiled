package android.support.v4.util

// Auto-emitted from smali source: AtomicFile.java.
// 2 fields, 9 methods.

open class AtomicFile {
    private val mBackupName: java.io.File
    private val mBaseName: java.io.File

    public constructor(baseName: java.io.File)

    public fun delete() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         return-void
    */

    public fun failWrite(str: java.io.FileOutputStream) { /* TODO(body): (Ljava/io/FileOutputStream;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/util/AtomicFile;->sync(Ljava/io/FileOutputStream;)Z
    //         :try_start_0
    //         invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    //         iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->delete()Z
    //         iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         iget-object v2, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/io/IOException;
    //         const-string v1, "AtomicFile"
    //         const-string v2, "failWrite: Got exception:"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public fun finishWrite(str: java.io.FileOutputStream) { /* TODO(body): (Ljava/io/FileOutputStream;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/util/AtomicFile;->sync(Ljava/io/FileOutputStream;)Z
    //         :try_start_0
    //         invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    //         iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->delete()Z
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/io/IOException;
    //         const-string v1, "AtomicFile"
    //         const-string v2, "finishWrite: Got exception:"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public fun getBaseFile(): java.io.File { return TODO("body: ()Ljava/io/File;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         return-object v0
    */

    public fun openRead(): java.io.FileInputStream { return TODO("body: ()Ljava/io/FileInputStream;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->exists()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    //         :cond_0
    //         new-instance v0, Ljava/io/FileInputStream;
    //         iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    //         return-object v0
    */

    public fun readFully(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/support/v4/util/AtomicFile;->openRead()Ljava/io/FileInputStream;
    //         move-result-object v5
    //         .local v5, "stream":Ljava/io/FileInputStream;
    //         const/4 v4, 0x0
    //         .local v4, "pos":I
    //         :try_start_0
    //         invoke-virtual {v5}, Ljava/io/FileInputStream;->available()I
    //         move-result v1
    //         .local v1, "avail":I
    //         new-array v2, v1, [B
    //         .local v2, "data":[B
    //         :cond_0
    //         :goto_0
    //         array-length v6, v2
    //         sub-int/2addr v6, v4
    //         invoke-virtual {v5, v2, v4, v6}, Ljava/io/FileInputStream;->read([BII)I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         .local v0, "amt":I
    //         if-gtz v0, :cond_1
    //         invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    //         return-object v2
    //         :cond_1
    //         add-int/2addr v4, v0
    //         :try_start_1
    //         invoke-virtual {v5}, Ljava/io/FileInputStream;->available()I
    //         move-result v1
    //         array-length v6, v2
    //         sub-int/2addr v6, v4
    //         if-le v1, v6, :cond_0
    //         add-int v6, v4, v1
    //         new-array v3, v6, [B
    //         .local v3, "newData":[B
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         invoke-static {v2, v6, v3, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-object v2, v3
    //         goto :goto_0
    //         .end local v0    # "amt":I
    //         .end local v1    # "avail":I
    //         .end local v2    # "data":[B
    //         .end local v3    # "newData":[B
    //         :catchall_0
    //         move-exception v6
    //         invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    //         throw v6
    */

    public fun startWrite(): java.io.FileOutputStream { return TODO("body: ()Ljava/io/FileOutputStream;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v4}, Ljava/io/File;->exists()Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         invoke-virtual {v4}, Ljava/io/File;->exists()Z
    //         move-result v4
    //         if-nez v4, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         iget-object v5, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         const-string v4, "AtomicFile"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Couldn\'t rename file "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v6, " to backup file "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :goto_0
    //         const/4 v3, 0x0
    //         .local v3, "str":Ljava/io/FileOutputStream;
    //         :try_start_0
    //         new-instance v3, Ljava/io/FileOutputStream;
    //         .end local v3    # "str":Ljava/io/FileOutputStream;
    //         iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .restart local v3    # "str":Ljava/io/FileOutputStream;
    //         :goto_1
    //         return-object v3
    //         .end local v3    # "str":Ljava/io/FileOutputStream;
    //         :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v4}, Ljava/io/File;->delete()Z
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/io/FileNotFoundException;
    //         iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;
    //         move-result-object v2
    //         .local v2, "parent":Ljava/io/File;
    //         invoke-virtual {v2}, Ljava/io/File;->mkdir()Z
    //         move-result v4
    //         if-nez v4, :cond_2
    //         new-instance v4, Ljava/io/IOException;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Couldn\'t create directory "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v4
    //         :cond_2
    //         :try_start_1
    //         new-instance v3, Ljava/io/FileOutputStream;
    //         iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    //         .restart local v3    # "str":Ljava/io/FileOutputStream;
    //         goto :goto_1
    //         .end local v3    # "str":Ljava/io/FileOutputStream;
    //         :catch_1
    //         move-exception v1
    //         .local v1, "e2":Ljava/io/FileNotFoundException;
    //         new-instance v4, Ljava/io/IOException;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Couldn\'t create "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v4
    */

    companion object {
    @JvmStatic fun sync(stream: java.io.FileOutputStream): Boolean { return TODO("body: (Ljava/io/FileOutputStream;)Z") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         :try_start_0
    //         invoke-virtual {p0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
