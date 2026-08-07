package com.ideaworks3d.marmalade

// Auto-emitted from smali source: VFSProvider.java.
// 4 fields, 11 methods.

open class VFSProvider: android.content.ContentProvider() {
    public constructor()

    public fun delete(p0: android.net.Uri, p1: String, p2: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAssetFileDescriptor(p0: String): android.content.res.AssetFileDescriptor { return TODO("body: (Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;") }
    /*
    //         .locals 9
    //         const/4 v6, 0x0
    //         const-string v0, "/"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v7
    //         array-length v0, v7
    //         const/4 v1, 0x3
    //         if-ge v0, v1, :cond_0
    //         move-object v0, v6
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         array-length v0, v7
    //         add-int/lit8 v0, v0, -0x2
    //         aget-object v0, v7, v0
    //         invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         array-length v0, v7
    //         add-int/lit8 v0, v0, -0x1
    //         aget-object v0, v7, v0
    //         invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         move-result-wide v4
    //         const/4 v0, 0x0
    //         aget-object v1, v7, v0
    //         const/4 v0, 0x1
    //         :goto_1
    //         array-length v8, v7
    //         add-int/lit8 v8, v8, -0x2
    //         if-ge v0, v8, :cond_1
    //         new-instance v8, Ljava/lang/StringBuilder;
    //         invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v8, "/"
    //         invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         aget-object v8, v7, v0
    //         invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_1
    //         new-instance v0, Ljava/io/File;
    //         invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         const/high16 v1, 0x10000000
    //         invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         move-result-object v1
    //         new-instance v0, Landroid/content/res/AssetFileDescriptor;
    //         invoke-direct/range {v0 .. v5}, Landroid/content/res/AssetFileDescriptor;-><init>(Landroid/os/ParcelFileDescriptor;JJ)V
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :goto_2
    //         move-object v0, v6
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    //         goto :goto_2
    */

    public fun getType(p0: android.net.Uri): String { return TODO("body: (Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "vnd.android.cursor.item/asset"
    //         return-object v0
    */

    public fun insert(p0: android.net.Uri, p1: android.content.ContentValues): android.net.Uri { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onCreate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun openAssetFile(p0: android.net.Uri, p1: String): android.content.res.AssetFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/VFSProvider;->getAssetFileDescriptor(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //         move-result-object v0
    //         return-object v0
    */

    public fun openFile(p0: android.net.Uri, p1: String): android.os.ParcelFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/VFSProvider;->openAssetFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun query(p0: android.net.Uri, p1: Array<String>, p2: String, p3: Array<String>, p4: String): android.database.Cursor { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun update(p0: android.net.Uri, p1: android.content.ContentValues, p2: String, p3: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    companion object {
    @JvmField public var ASSET_URI: android.net.Uri
    private var AUTHORITY: String
    private var CONTENT_PREFIX: String
    private var EXP_PATH: String
    }
}
