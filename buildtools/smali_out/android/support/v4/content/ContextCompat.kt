package android.support.v4.content

// Auto-emitted from smali source: ContextCompat.java.
// 6 fields, 10 methods.

open class ContextCompat {
    public constructor()

    public fun getCodeCacheDir(context: android.content.Context): java.io.File { return TODO("body: (Landroid/content/Context;)Ljava/io/File;") }
    /*
    //         .locals 5
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v1, "version":I
    //         const/16 v2, 0x15
    //         if-lt v1, v2, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/content/ContextCompatApi21;->getCodeCacheDir(Landroid/content/Context;)Ljava/io/File;
    //         move-result-object v2
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v0
    //         .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    //         new-instance v2, Ljava/io/File;
    //         iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;
    //         const-string v4, "code_cache"
    //         invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {v2}, Landroid/support/v4/content/ContextCompat;->createFilesDir(Ljava/io/File;)Ljava/io/File;
    //         move-result-object v2
    //         goto :goto_0
    */

    public fun getNoBackupFilesDir(context: android.content.Context): java.io.File { return TODO("body: (Landroid/content/Context;)Ljava/io/File;") }
    /*
    //         .locals 5
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v1, "version":I
    //         const/16 v2, 0x15
    //         if-lt v1, v2, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/content/ContextCompatApi21;->getNoBackupFilesDir(Landroid/content/Context;)Ljava/io/File;
    //         move-result-object v2
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v0
    //         .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    //         new-instance v2, Ljava/io/File;
    //         iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;
    //         const-string v4, "no_backup"
    //         invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {v2}, Landroid/support/v4/content/ContextCompat;->createFilesDir(Ljava/io/File;)Ljava/io/File;
    //         move-result-object v2
    //         goto :goto_0
    */

    companion object {
    private val DIR_ANDROID: String = "Android"
    private val DIR_CACHE: String = "cache"
    private val DIR_DATA: String = "data"
    private val DIR_FILES: String = "files"
    private val DIR_OBB: String = "obb"
    private val TAG: String = "ContextCompat"

    private @JvmStatic fun buildPath(base: java.io.File, segments: Array<String>): java.io.File { return TODO("body: (Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;") }
    /*
    //         .locals 6
    //         move-object v1, p0
    //         .local v1, "cur":Ljava/io/File;
    //         move-object v0, p1
    //         .local v0, "arr$":[Ljava/lang/String;
    //         array-length v4, v0
    //         .local v4, "len$":I
    //         const/4 v3, 0x0
    //         .local v3, "i$":I
    //         move-object v2, v1
    //         .end local v1    # "cur":Ljava/io/File;
    //         .local v2, "cur":Ljava/io/File;
    //         :goto_0
    //         if-ge v3, v4, :cond_1
    //         aget-object v5, v0, v3
    //         .local v5, "segment":Ljava/lang/String;
    //         if-nez v2, :cond_0
    //         new-instance v1, Ljava/io/File;
    //         invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         .end local v2    # "cur":Ljava/io/File;
    //         .restart local v1    # "cur":Ljava/io/File;
    //         :goto_1
    //         add-int/lit8 v3, v3, 0x1
    //         move-object v2, v1
    //         .end local v1    # "cur":Ljava/io/File;
    //         .restart local v2    # "cur":Ljava/io/File;
    //         goto :goto_0
    //         :cond_0
    //         if-eqz v5, :cond_2
    //         new-instance v1, Ljava/io/File;
    //         invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         .end local v2    # "cur":Ljava/io/File;
    //         .restart local v1    # "cur":Ljava/io/File;
    //         goto :goto_1
    //         .end local v1    # "cur":Ljava/io/File;
    //         .end local v5    # "segment":Ljava/lang/String;
    //         .restart local v2    # "cur":Ljava/io/File;
    //         :cond_1
    //         return-object v2
    //         .restart local v5    # "segment":Ljava/lang/String;
    //         :cond_2
    //         move-object v1, v2
    //         .end local v2    # "cur":Ljava/io/File;
    //         .restart local v1    # "cur":Ljava/io/File;
    //         goto :goto_1
    */

    public @JvmStatic fun getDrawable(context: android.content.Context, id: Int): android.graphics.drawable.Drawable { return TODO("body: (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v0, "version":I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatApi21;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v1
    //         goto :goto_0
    */

    public @JvmStatic fun getExternalCacheDirs(context: android.content.Context): Array<java.io.File> { return TODO("body: (Landroid/content/Context;)[Ljava/io/File;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v1, "version":I
    //         const/16 v2, 0x13
    //         if-lt v1, v2, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/content/ContextCompatKitKat;->getExternalCacheDirs(Landroid/content/Context;)[Ljava/io/File;
    //         move-result-object v2
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         const/16 v2, 0x8
    //         if-lt v1, v2, :cond_1
    //         invoke-static {p0}, Landroid/support/v4/content/ContextCompatFroyo;->getExternalCacheDir(Landroid/content/Context;)Ljava/io/File;
    //         move-result-object v0
    //         .local v0, "single":Ljava/io/File;
    //         :goto_1
    //         new-array v2, v7, [Ljava/io/File;
    //         aput-object v0, v2, v6
    //         goto :goto_0
    //         .end local v0    # "single":Ljava/io/File;
    //         :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v2
    //         const/4 v3, 0x4
    //         new-array v3, v3, [Ljava/lang/String;
    //         const-string v4, "Android"
    //         aput-object v4, v3, v6
    //         const-string v4, "data"
    //         aput-object v4, v3, v7
    //         const/4 v4, 0x2
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x3
    //         const-string v5, "cache"
    //         aput-object v5, v3, v4
    //         invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v0
    //         .restart local v0    # "single":Ljava/io/File;
    //         goto :goto_1
    */

    public @JvmStatic fun getExternalFilesDirs(context: android.content.Context, type: String): Array<java.io.File> { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v1, "version":I
    //         const/16 v2, 0x13
    //         if-lt v1, v2, :cond_0
    //         invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatKitKat;->getExternalFilesDirs(Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;
    //         move-result-object v2
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         const/16 v2, 0x8
    //         if-lt v1, v2, :cond_1
    //         invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatFroyo;->getExternalFilesDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v0
    //         .local v0, "single":Ljava/io/File;
    //         :goto_1
    //         new-array v2, v7, [Ljava/io/File;
    //         aput-object v0, v2, v6
    //         goto :goto_0
    //         .end local v0    # "single":Ljava/io/File;
    //         :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v2
    //         const/4 v3, 0x5
    //         new-array v3, v3, [Ljava/lang/String;
    //         const-string v4, "Android"
    //         aput-object v4, v3, v6
    //         const-string v4, "data"
    //         aput-object v4, v3, v7
    //         const/4 v4, 0x2
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x3
    //         const-string v5, "files"
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x4
    //         aput-object p1, v3, v4
    //         invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v0
    //         .restart local v0    # "single":Ljava/io/File;
    //         goto :goto_1
    */

    public @JvmStatic fun getObbDirs(context: android.content.Context): Array<java.io.File> { return TODO("body: (Landroid/content/Context;)[Ljava/io/File;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v1, "version":I
    //         const/16 v2, 0x13
    //         if-lt v1, v2, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/content/ContextCompatKitKat;->getObbDirs(Landroid/content/Context;)[Ljava/io/File;
    //         move-result-object v2
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         const/16 v2, 0xb
    //         if-lt v1, v2, :cond_1
    //         invoke-static {p0}, Landroid/support/v4/content/ContextCompatHoneycomb;->getObbDir(Landroid/content/Context;)Ljava/io/File;
    //         move-result-object v0
    //         .local v0, "single":Ljava/io/File;
    //         :goto_1
    //         new-array v2, v7, [Ljava/io/File;
    //         aput-object v0, v2, v6
    //         goto :goto_0
    //         .end local v0    # "single":Ljava/io/File;
    //         :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v2
    //         const/4 v3, 0x3
    //         new-array v3, v3, [Ljava/lang/String;
    //         const-string v4, "Android"
    //         aput-object v4, v3, v6
    //         const-string v4, "obb"
    //         aput-object v4, v3, v7
    //         const/4 v4, 0x2
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v0
    //         .restart local v0    # "single":Ljava/io/File;
    //         goto :goto_1
    */

    public @JvmStatic fun startActivities(context: android.content.Context, intents: Array<android.content.Intent>): Boolean { return TODO("body: (Landroid/content/Context;[Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, p1, v0}, Landroid/support/v4/content/ContextCompat;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun startActivities(context: android.content.Context, intents: Array<android.content.Intent>, options: android.os.Bundle): Boolean { return TODO("body: (Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v0, "version":I
    //         const/16 v2, 0x10
    //         if-lt v0, v2, :cond_0
    //         invoke-static {p0, p1, p2}, Landroid/support/v4/content/ContextCompatJellybean;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/16 v2, 0xb
    //         if-lt v0, v2, :cond_1
    //         invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatHoneycomb;->startActivities(Landroid/content/Context;[Landroid/content/Intent;)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    }
}
