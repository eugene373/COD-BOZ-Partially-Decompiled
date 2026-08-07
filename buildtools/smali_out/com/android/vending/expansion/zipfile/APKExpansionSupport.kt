package com.android.vending.expansion.zipfile

// Auto-emitted from smali source: APKExpansionSupport.java.
// 1 fields, 4 methods.

open class APKExpansionSupport {
    public constructor()

    companion object {
    private val EXP_PATH: String = "/Android/obb/"

    @JvmStatic fun getAPKExpansionFiles(p0: android.content.Context, p1: Int, p2: Int): Array<String> { return TODO("body: (Landroid/content/Context;II)[Ljava/lang/String;") }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/util/Vector;
    //         invoke-direct {v1}, Ljava/util/Vector;-><init>()V
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
    //         move-result-object v2
    //         const-string v3, "mounted"
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v2
    //         new-instance v3, Ljava/io/File;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v4, "/Android/obb/"
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v3}, Ljava/io/File;->exists()Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         if-lez p1, :cond_0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v4, "main."
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v4, "."
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v4, ".obb"
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v4, Ljava/io/File;
    //         invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v4}, Ljava/io/File;->isFile()Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         invoke-virtual {v1, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         if-lez p2, :cond_1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "patch."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ".obb"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v2, Ljava/io/File;
    //         invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v2}, Ljava/io/File;->isFile()Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    //         :cond_1
    //         invoke-virtual {v1}, Ljava/util/Vector;->size()I
    //         move-result v0
    //         new-array v0, v0, [Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         return-object v0
    */

    public @JvmStatic fun getAPKExpansionZipFile(p0: android.content.Context, p1: Int, p2: Int): com.android.vending.expansion.zipfile.ZipResourceFile { return TODO("body: (Landroid/content/Context;II)Lcom/android/vending/expansion/zipfile/ZipResourceFile;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {p0, p1, p2}, Lcom/android/vending/expansion/zipfile/APKExpansionSupport;->getAPKExpansionFiles(Landroid/content/Context;II)[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/android/vending/expansion/zipfile/APKExpansionSupport;->getResourceZipFile([Ljava/lang/String;)Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getResourceZipFile(p0: Array<String>): com.android.vending.expansion.zipfile.ZipResourceFile { return TODO("body: ([Ljava/lang/String;)Lcom/android/vending/expansion/zipfile/ZipResourceFile;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         array-length v2, p0
    //         const/4 v0, 0x0
    //         move v4, v0
    //         move-object v0, v1
    //         move v1, v4
    //         :goto_0
    //         if-ge v1, v2, :cond_1
    //         aget-object v3, p0, v1
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         invoke-direct {v0, v3}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;-><init>(Ljava/lang/String;)V
    //         :goto_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v0, v3}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->addPatchFile(Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_1
    //         return-object v0
    */

    }
}
