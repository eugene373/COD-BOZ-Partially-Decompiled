// Auto-emitted from smali source: IsIOSUtils.java.
// 3 fields, 17 methods.

open class IsIOSUtils {
    public constructor()

    public fun Test(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    protected fun finalize() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Throwable;
    //             }
    //         .end annotation
    //         invoke-super {p0}, Ljava/lang/Object;->finalize()V
    //         return-void
    */

    companion object {
    @JvmField public var fileName: String
    var initKobjMap: Boolean
    @JvmField public var kobjMap: java.util.HashMap

    public @JvmStatic fun IsInstallExceptionHandler() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public @JvmStatic fun IsInstallMemoryWarningHandler(p0: String, p1: String, p2: Boolean) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public @JvmStatic fun IsKeychainInit(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 12
    //         const/16 v11, 0x23
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v5
    //         sget-boolean v0, LIsIOSUtils;->initKobjMap:Z
    //         if-eqz v0, :cond_5
    //         :try_start_0
    //         sget-object v0, LIsIOSUtils;->fileName:Ljava/lang/String;
    //         invoke-virtual {v5, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    //         move-result-object v6
    //         const v0, 0xffff
    //         new-array v0, v0, [B
    //         invoke-virtual {v6, v0}, Ljava/io/FileInputStream;->read([B)I
    //         move-result v7
    //         const/4 v3, -0x1
    //         if-ne v7, v3, :cond_0
    //         :goto_0
    //         return v1
    //         :cond_0
    //         invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
    //         move-result-object v8
    //         move v0, v1
    //         :cond_1
    //         new-instance v9, LKeychainObject;
    //         invoke-direct {v9}, LKeychainObject;-><init>()V
    //         const-string v3, ""
    //         move v4, v0
    //         move-object v0, v3
    //         :goto_1
    //         invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getChar()C
    //         move-result v10
    //         if-eq v10, v11, :cond_3
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         :goto_2
    //         add-int/lit8 v0, v4, 0x2
    //         if-ne v10, v11, :cond_4
    //         invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getInt()I
    //         move-result v4
    //         iput v4, v9, LKeychainObject;->crc:I
    //         add-int/lit8 v0, v0, 0x4
    //         const/4 v4, 0x1
    //         iput-boolean v4, v9, LKeychainObject;->valid:Z
    //         sget-object v4, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v4, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         if-lt v0, v7, :cond_1
    //         invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         move v0, v1
    //         :goto_3
    //         sput-boolean v1, LIsIOSUtils;->initKobjMap:Z
    //         :goto_4
    //         if-eqz v0, :cond_2
    //         :try_start_1
    //         sget-object v0, LIsIOSUtils;->fileName:Ljava/lang/String;
    //         const/4 v3, 0x0
    //         invoke-virtual {v5, v0, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         :cond_2
    //         move v1, v2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move v0, v2
    //         goto :goto_3
    //         :catch_1
    //         move-exception v0
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         goto :goto_0
    //         :cond_3
    //         move-object v3, v0
    //         goto :goto_2
    //         :cond_4
    //         move v4, v0
    //         move-object v0, v3
    //         goto :goto_1
    //         :cond_5
    //         move v0, v1
    //         goto :goto_4
    */

    public @JvmStatic fun IsKeychainReadKey(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, LKeychainObject;
    //         iget-boolean v2, v0, LKeychainObject;->valid:Z
    //         if-eqz v2, :cond_1
    //         iget v2, v0, LKeychainObject;->crc:I
    //         const/4 v3, -0x1
    //         if-eq v2, v3, :cond_1
    //         iget v0, v0, LKeychainObject;->crc:I
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun IsKeychainSearchKey(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, LKeychainObject;
    //         iget-boolean v2, v0, LKeychainObject;->valid:Z
    //         if-eqz v2, :cond_1
    //         iget v0, v0, LKeychainObject;->crc:I
    //         const/4 v2, -0x1
    //         if-ne v0, v2, :cond_2
    //         :cond_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public @JvmStatic fun IsKeychainTerminate() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         return-void
    */

    public @JvmStatic fun IsKeychainWriteKey(p0: String, p1: String): Boolean { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Z") }
    /*
    //         .locals 9
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, LKeychainObject;
    //         invoke-direct {v0}, LKeychainObject;-><init>()V
    //         iput-boolean v2, v0, LKeychainObject;->valid:Z
    //         const/4 v1, -0x1
    //         iput v1, v0, LKeychainObject;->crc:I
    //         sget-object v1, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         :try_start_0
    //         invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v1
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, LKeychainObject;
    //         iget v0, v0, LKeychainObject;->crc:I
    //         if-ne v0, v1, :cond_1
    //         move v0, v2
    //         :goto_0
    //         return v0
    //         :cond_1
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, LKeychainObject;
    //         iput v1, v0, LKeychainObject;->crc:I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    //         :goto_1
    //         :try_start_1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v0
    //         sget-object v1, LIsIOSUtils;->fileName:Ljava/lang/String;
    //         const/4 v4, 0x0
    //         invoke-virtual {v0, v1, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //         move-result-object v4
    //         sget-object v0, LIsIOSUtils;->kobjMap:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_2
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, LKeychainObject;
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v6
    //         mul-int/lit8 v6, v6, 0x2
    //         add-int/lit8 v6, v6, 0x2
    //         add-int/lit8 v6, v6, 0x4
    //         invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
    //         move-result-object v6
    //         invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C
    //         move-result-object v7
    //         move v1, v3
    //         :goto_3
    //         array-length v8, v7
    //         if-ge v1, v8, :cond_2
    //         aget-char v8, v7, v1
    //         invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_3
    //         :cond_2
    //         const/16 v1, 0x23
    //         invoke-virtual {v6, v1}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;
    //         iget v0, v0, LKeychainObject;->crc:I
    //         invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
    //         invoke-virtual {v6}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
    //         invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/io/FileOutputStream;->write([B)V
    //         goto :goto_2
    //         :catch_0
    //         move-exception v0
    //         move v0, v3
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         move v0, v2
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         move v0, v3
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         goto :goto_1
    */

    public @JvmStatic fun IsOSFree() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public @JvmStatic fun IsOSMalloc(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public @JvmStatic fun IsOSRealloc(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public @JvmStatic fun IsSimulateMemoryWarning() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public @JvmStatic fun IsUninstallExceptionHandler() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public @JvmStatic fun IsUninstallMemoryWarningHandler() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    }
}
