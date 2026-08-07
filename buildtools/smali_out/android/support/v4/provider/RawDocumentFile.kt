package android.support.v4.provider

// Auto-emitted from smali source: RawDocumentFile.java.
// 1 fields, 18 methods.

open class RawDocumentFile: android.support.v4.provider.DocumentFile() {
    private var mFile: java.io.File

    constructor(parent: android.support.v4.provider.DocumentFile, file: java.io.File)

    public fun canRead(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->canRead()Z
    //         move-result v0
    //         return v0
    */

    public fun canWrite(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->canWrite()Z
    //         move-result v0
    //         return v0
    */

    public fun createDirectory(displayName: String): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/io/File;
    //         iget-object v1, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         .local v0, "target":Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {v0}, Ljava/io/File;->mkdir()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         new-instance v1, Landroid/support/v4/provider/RawDocumentFile;
    //         invoke-direct {v1, p0, v0}, Landroid/support/v4/provider/RawDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Ljava/io/File;)V
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun createFile(mimeType: String, displayName: String): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 6
    //         invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;
    //         move-result-object v3
    //         invoke-virtual {v3, p1}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "extension":Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, "."
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p2
    //         :cond_0
    //         new-instance v2, Ljava/io/File;
    //         iget-object v3, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-direct {v2, v3, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         .local v2, "target":Ljava/io/File;
    //         :try_start_0
    //         invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
    //         new-instance v3, Landroid/support/v4/provider/RawDocumentFile;
    //         invoke-direct {v3, p0, v2}, Landroid/support/v4/provider/RawDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Ljava/io/File;)V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v3
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/io/IOException;
    //         const-string v3, "DocumentFile"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Failed to createFile: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v3, 0x0
    //         goto :goto_0
    */

    public fun delete(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-static {v0}, Landroid/support/v4/provider/RawDocumentFile;->deleteContents(Ljava/io/File;)Z
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         move-result v0
    //         return v0
    */

    public fun exists(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->exists()Z
    //         move-result v0
    //         return v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/provider/RawDocumentFile;->getTypeForName(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isDirectory(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
    //         move-result v0
    //         return v0
    */

    public fun isFile(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->isFile()Z
    //         move-result v0
    //         return v0
    */

    public fun lastModified(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->lastModified()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun length(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->length()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun listFiles(): Array<android.support.v4.provider.DocumentFile> { return TODO("body: ()[Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 7
    //         new-instance v5, Ljava/util/ArrayList;
    //         invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    //         .local v5, "results":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/provider/DocumentFile;>;"
    //         iget-object v6, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;
    //         move-result-object v2
    //         .local v2, "files":[Ljava/io/File;
    //         if-eqz v2, :cond_0
    //         move-object v0, v2
    //         .local v0, "arr$":[Ljava/io/File;
    //         array-length v4, v0
    //         .local v4, "len$":I
    //         const/4 v3, 0x0
    //         .local v3, "i$":I
    //         :goto_0
    //         if-ge v3, v4, :cond_0
    //         aget-object v1, v0, v3
    //         .local v1, "file":Ljava/io/File;
    //         new-instance v6, Landroid/support/v4/provider/RawDocumentFile;
    //         invoke-direct {v6, p0, v1}, Landroid/support/v4/provider/RawDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Ljava/io/File;)V
    //         invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v0    # "arr$":[Ljava/io/File;
    //         .end local v1    # "file":Ljava/io/File;
    //         .end local v3    # "i$":I
    //         .end local v4    # "len$":I
    //         :cond_0
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
    //         move-result v6
    //         new-array v6, v6, [Landroid/support/v4/provider/DocumentFile;
    //         invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, [Landroid/support/v4/provider/DocumentFile;
    //         return-object v6
    */

    public fun renameTo(displayName: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/io/File;
    //         iget-object v1, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         .local v0, "target":Ljava/io/File;
    //         iget-object v1, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iput-object v0, p0, Landroid/support/v4/provider/RawDocumentFile;->mFile:Ljava/io/File;
    //         const/4 v1, 0x1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    companion object {
    private @JvmStatic fun deleteContents(dir: java.io.File): Boolean { return TODO("body: (Ljava/io/File;)Z") }
    /*
    //         .locals 9
    //         invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
    //         move-result-object v2
    //         .local v2, "files":[Ljava/io/File;
    //         const/4 v5, 0x1
    //         .local v5, "success":Z
    //         if-eqz v2, :cond_2
    //         move-object v0, v2
    //         .local v0, "arr$":[Ljava/io/File;
    //         array-length v4, v0
    //         .local v4, "len$":I
    //         const/4 v3, 0x0
    //         .local v3, "i$":I
    //         :goto_0
    //         if-ge v3, v4, :cond_2
    //         aget-object v1, v0, v3
    //         .local v1, "file":Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
    //         move-result v6
    //         if-eqz v6, :cond_0
    //         invoke-static {v1}, Landroid/support/v4/provider/RawDocumentFile;->deleteContents(Ljava/io/File;)Z
    //         move-result v6
    //         and-int/2addr v5, v6
    //         :cond_0
    //         invoke-virtual {v1}, Ljava/io/File;->delete()Z
    //         move-result v6
    //         if-nez v6, :cond_1
    //         const-string v6, "DocumentFile"
    //         new-instance v7, Ljava/lang/StringBuilder;
    //         invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v8, "Failed to delete "
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v5, 0x0
    //         :cond_1
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v0    # "arr$":[Ljava/io/File;
    //         .end local v1    # "file":Ljava/io/File;
    //         .end local v3    # "i$":I
    //         .end local v4    # "len$":I
    //         :cond_2
    //         return v5
    */

    private @JvmStatic fun getTypeForName(name: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/16 v3, 0x2e
    //         invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I
    //         move-result v1
    //         .local v1, "lastDot":I
    //         if-ltz v1, :cond_0
    //         add-int/lit8 v3, v1, 0x1
    //         invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "extension":Ljava/lang/String;
    //         invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         .local v2, "mime":Ljava/lang/String;
    //         if-eqz v2, :cond_0
    //         .end local v0    # "extension":Ljava/lang/String;
    //         .end local v2    # "mime":Ljava/lang/String;
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         const-string v2, "application/octet-stream"
    //         goto :goto_0
    */

    }
}
