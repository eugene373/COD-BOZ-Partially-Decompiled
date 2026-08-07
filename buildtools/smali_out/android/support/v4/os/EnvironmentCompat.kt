package android.support.v4.os

// Auto-emitted from smali source: EnvironmentCompat.java.
// 2 fields, 2 methods.

open class EnvironmentCompat {
    public constructor()

    companion object {
    @JvmField public val MEDIA_UNKNOWN: String = "unknown"
    private val TAG: String = "EnvironmentCompat"

    public @JvmStatic fun getStorageState(path: java.io.File): String { return TODO("body: (Ljava/io/File;)Ljava/lang/String;") }
    /*
    //         .locals 7
    //         sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v3, "version":I
    //         const/16 v4, 0x13
    //         if-lt v3, v4, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/os/EnvironmentCompatKitKat;->getStorageState(Ljava/io/File;)Ljava/lang/String;
    //         move-result-object v4
    //         :goto_0
    //         return-object v4
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "canonicalPath":Ljava/lang/String;
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "canonicalExternal":Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v4
    //         goto :goto_0
    //         .end local v0    # "canonicalExternal":Ljava/lang/String;
    //         .end local v1    # "canonicalPath":Ljava/lang/String;
    //         :catch_0
    //         move-exception v2
    //         .local v2, "e":Ljava/io/IOException;
    //         const-string v4, "EnvironmentCompat"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Failed to resolve canonical path: "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         .end local v2    # "e":Ljava/io/IOException;
    //         :cond_1
    //         const-string v4, "unknown"
    //         goto :goto_0
    */

    }
}
