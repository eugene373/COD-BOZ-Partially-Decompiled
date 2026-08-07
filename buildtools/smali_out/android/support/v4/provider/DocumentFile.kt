package android.support.v4.provider

// Auto-emitted from smali source: DocumentFile.java.
// 2 fields, 22 methods.

open class DocumentFile {
    private val mParent: android.support.v4.provider.DocumentFile

    constructor(parent: android.support.v4.provider.DocumentFile)

    public fun canRead(): Boolean

    public fun canWrite(): Boolean

    public fun createDirectory(p0: String): android.support.v4.provider.DocumentFile

    public fun createFile(p0: String, p1: String): android.support.v4.provider.DocumentFile

    public fun delete(): Boolean

    public fun exists(): Boolean

    public fun findFile(displayName: String): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Landroid/support/v4/provider/DocumentFile;->listFiles()[Landroid/support/v4/provider/DocumentFile;
    //         move-result-object v0
    //         .local v0, "arr$":[Landroid/support/v4/provider/DocumentFile;
    //         array-length v3, v0
    //         .local v3, "len$":I
    //         const/4 v2, 0x0
    //         .local v2, "i$":I
    //         :goto_0
    //         if-ge v2, v3, :cond_1
    //         aget-object v1, v0, v2
    //         .local v1, "doc":Landroid/support/v4/provider/DocumentFile;
    //         invoke-virtual {v1}, Landroid/support/v4/provider/DocumentFile;->getName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         .end local v1    # "doc":Landroid/support/v4/provider/DocumentFile;
    //         :goto_1
    //         return-object v1
    //         .restart local v1    # "doc":Landroid/support/v4/provider/DocumentFile;
    //         :cond_0
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         .end local v1    # "doc":Landroid/support/v4/provider/DocumentFile;
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_1
    */

    public fun getName(): String

    public fun getParentFile(): android.support.v4.provider.DocumentFile { return TODO("body: ()Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/provider/DocumentFile;->mParent:Landroid/support/v4/provider/DocumentFile;
    //         return-object v0
    */

    public fun getType(): String

    public fun getUri(): android.net.Uri

    public fun isDirectory(): Boolean

    public fun isFile(): Boolean

    public fun lastModified(): Long

    public fun length(): Long

    public fun listFiles(): Array<android.support.v4.provider.DocumentFile>

    public fun renameTo(p0: String): Boolean

    companion object {
    val TAG: String = "DocumentFile"

    public @JvmStatic fun fromFile(file: java.io.File): android.support.v4.provider.DocumentFile { return TODO("body: (Ljava/io/File;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/provider/RawDocumentFile;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1, p0}, Landroid/support/v4/provider/RawDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Ljava/io/File;)V
    //         return-object v0
    */

    public @JvmStatic fun fromSingleUri(context: android.content.Context, singleUri: android.net.Uri): android.support.v4.provider.DocumentFile { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v0, "version":I
    //         const/16 v1, 0x13
    //         if-lt v0, v1, :cond_0
    //         new-instance v1, Landroid/support/v4/provider/SingleDocumentFile;
    //         invoke-direct {v1, v2, p0, p1}, Landroid/support/v4/provider/SingleDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Landroid/content/Context;Landroid/net/Uri;)V
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         move-object v1, v2
    //         goto :goto_0
    */

    public @JvmStatic fun fromTreeUri(context: android.content.Context, treeUri: android.net.Uri): android.support.v4.provider.DocumentFile { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Landroid/support/v4/provider/DocumentFile;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v0, "version":I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         new-instance v1, Landroid/support/v4/provider/TreeDocumentFile;
    //         invoke-static {p1}, Landroid/support/v4/provider/DocumentsContractApi21;->prepareTreeUri(Landroid/net/Uri;)Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-direct {v1, v2, p0, v3}, Landroid/support/v4/provider/TreeDocumentFile;-><init>(Landroid/support/v4/provider/DocumentFile;Landroid/content/Context;Landroid/net/Uri;)V
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         move-object v1, v2
    //         goto :goto_0
    */

    public @JvmStatic fun isDocumentUri(context: android.content.Context, uri: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v0, "version":I
    //         const/16 v1, 0x13
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0, p1}, Landroid/support/v4/provider/DocumentsContractApi19;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    }
}
