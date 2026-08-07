package android.support.v4.provider

// Auto-emitted from smali source: TreeDocumentFile.java.
// 2 fields, 16 methods.

open class TreeDocumentFile: android.support.v4.provider.DocumentFile() {
    private var mContext: android.content.Context
    private var mUri: android.net.Uri

    constructor(parent: android.support.v4.provider.DocumentFile, context: android.content.Context, uri: android.net.Uri)

    public fun canRead(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->canRead(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun canWrite(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->canWrite(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun createDirectory(displayName: String): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v1, v2, p1}, Landroid/support/v4/provider/DocumentsContractApi21;->createDirectory(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         .local v0, "result":Landroid/net/Uri;
    //         if-eqz v0, :cond_0
    //         new-instance v1, Landroid/support/v4/provider/TreeDocumentFile;
    //         iget-object v2, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         invoke-direct {v1, p0, v2, v0}, Landroid/support/v4/provider/TreeDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Landroid/content/Context;Landroid/net/Uri;)V
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun createFile(mimeType: String, displayName: String): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v1, v2, p1, p2}, Landroid/support/v4/provider/DocumentsContractApi21;->createFile(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         .local v0, "result":Landroid/net/Uri;
    //         if-eqz v0, :cond_0
    //         new-instance v1, Landroid/support/v4/provider/TreeDocumentFile;
    //         iget-object v2, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         invoke-direct {v1, p0, v2, v0}, Landroid/support/v4/provider/TreeDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Landroid/content/Context;Landroid/net/Uri;)V
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun delete(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->delete(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun exists(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->exists(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->getName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->getType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         return-object v0
    */

    public fun isDirectory(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->isDirectory(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun isFile(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->isFile(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun lastModified(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->lastModified(Landroid/content/Context;Landroid/net/Uri;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun length(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->length(Landroid/content/Context;Landroid/net/Uri;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun listFiles(): Array<android.support.v4.provider.DocumentFile> { return TODO("body: ()[Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 6
    //         iget-object v3, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v4, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v3, v4}, Landroid/support/v4/provider/DocumentsContractApi21;->listFiles(Landroid/content/Context;Landroid/net/Uri;)[Landroid/net/Uri;
    //         move-result-object v1
    //         .local v1, "result":[Landroid/net/Uri;
    //         array-length v3, v1
    //         new-array v2, v3, [Landroid/support/v4/provider/DocumentFile;
    //         .local v2, "resultFiles":[Landroid/support/v4/provider/DocumentFile;
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         array-length v3, v1
    //         if-ge v0, v3, :cond_0
    //         new-instance v3, Landroid/support/v4/provider/TreeDocumentFile;
    //         iget-object v4, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         aget-object v5, v1, v0
    //         invoke-direct {v3, p0, v4, v5}, Landroid/support/v4/provider/TreeDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Landroid/content/Context;Landroid/net/Uri;)V
    //         aput-object v3, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public fun renameTo(displayName: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/provider/TreeDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v1, v2, p1}, Landroid/support/v4/provider/DocumentsContractApi21;->renameTo(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         .local v0, "result":Landroid/net/Uri;
    //         if-eqz v0, :cond_0
    //         iput-object v0, p0, Landroid/support/v4/provider/TreeDocumentFile;->mUri:Landroid/net/Uri;
    //         const/4 v1, 0x1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

}
