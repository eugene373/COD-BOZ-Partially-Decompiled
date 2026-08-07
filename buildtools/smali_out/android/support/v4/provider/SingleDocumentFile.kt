package android.support.v4.provider

// Auto-emitted from smali source: SingleDocumentFile.java.
// 2 fields, 16 methods.

open class SingleDocumentFile: android.support.v4.provider.DocumentFile() {
    private var mContext: android.content.Context
    private var mUri: android.net.Uri

    constructor(parent: android.support.v4.provider.DocumentFile, context: android.content.Context, uri: android.net.Uri)

    public fun canRead(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->canRead(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun canWrite(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->canWrite(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun createDirectory(displayName: String): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun createFile(mimeType: String, displayName: String): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun delete(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->delete(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun exists(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->exists(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->getName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->getType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         return-object v0
    */

    public fun isDirectory(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->isDirectory(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun isFile(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->isFile(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public fun lastModified(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->lastModified(Landroid/content/Context;Landroid/net/Uri;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun length(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/provider/SingleDocumentFile;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Landroid/support/v4/provider/SingleDocumentFile;->mUri:Landroid/net/Uri;
    //         invoke-static {v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->length(Landroid/content/Context;Landroid/net/Uri;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun listFiles(): Array<android.support.v4.provider.DocumentFile> { return TODO("body: ()[Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun renameTo(displayName: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

}
