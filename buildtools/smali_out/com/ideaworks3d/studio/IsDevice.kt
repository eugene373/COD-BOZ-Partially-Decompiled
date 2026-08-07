package com.ideaworks3d.studio

// Auto-emitted from smali source: IsDevice.java.
// 11 fields, 22 methods.

open class IsDevice: Cloneable {
    public var TabletThreshold: Int
    val eGeneric: Int
    val eSmartphone: Int
    val eTablet: Int
    private var m_CurrentDirectory: java.io.File
    public var m_DeviceMetrics: android.util.DisplayMetrics
    private var m_IsActivated: Boolean
    var m_MainExpansion: com.android.vending.expansion.downloader.impl.DownloadInfo
    private var m_StatFs: android.os.StatFs

    private constructor()

    public fun Activate() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_IsActivated:Z
    //         return-void
    */

    public fun GetExpansionPath(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-static {v1}, Lcom/android/vending/expansion/downloader/Helpers;->getSaveFilePath(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "IsDevice"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Expansion Path: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         return-object v0
    */

    public fun GetMainExpansionFileSize(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         const-wide/16 v0, 0x0
    //         goto :goto_0
    */

    public fun GetMainExpansionFilename(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         :try_start_0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v1
    //         iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "main."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "."
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ".obb"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, ""
    //         goto :goto_0
    */

    public fun GetMainExpansionUri(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, ""
    //         goto :goto_0
    */

    public fun IsActivated(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_IsActivated:Z
    //         return v0
    */

    public fun IsDeviceGetAbsolutePath(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "/Android/data/"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    //         const-string v1, "IsDevice"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "AbsolutePath returning: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         return-object v0
    */

    public fun IsDeviceGetAvailableBlocks(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I
    //         move-result v0
    //         return v0
    */

    public fun IsDeviceGetBlockCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I
    //         move-result v0
    //         return v0
    */

    public fun IsDeviceGetBlockSize(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
    //         move-result v0
    //         return v0
    */

    public fun IsDeviceGetDisplayType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindowManager()Landroid/view/WindowManager;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;
    //         invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;
    //         iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I
    //         int-to-float v0, v0
    //         iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;
    //         iget v1, v1, Landroid/util/DisplayMetrics;->xdpi:F
    //         div-float/2addr v0, v1
    //         iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;
    //         iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I
    //         int-to-float v1, v1
    //         iget-object v2, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;
    //         iget v2, v2, Landroid/util/DisplayMetrics;->ydpi:F
    //         div-float/2addr v1, v2
    //         mul-float/2addr v0, v0
    //         mul-float/2addr v1, v1
    //         mul-float/2addr v0, v1
    //         float-to-int v0, v0
    //         iget v1, p0, Lcom/ideaworks3d/studio/IsDevice;->TabletThreshold:I
    //         if-lt v0, v1, :cond_0
    //         const/4 v0, 0x3
    //         :goto_0
    //         return v0
    //         :cond_0
    //         if-lez v0, :cond_1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun IsDeviceGetExternalResources(p0: Int, p1: Int): Array<String> { return TODO("body: (II)[Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/String;
    //         const/4 v1, 0x0
    //         const-string v2, "stub"
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         const-string v2, "stub"
    //         aput-object v2, v0, v1
    //         return-object v0
    */

    public fun IsDeviceGetFreeBlocks(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;
    //         invoke-virtual {v0}, Landroid/os/StatFs;->getFreeBlocks()I
    //         move-result v0
    //         return v0
    */

    public fun IsDeviceGetFreeStorage(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, -0x1
    //         return v0
    */

    public fun IsDeviceGetMainExpansionFileSize(): Int { return TODO("body: ()I") }
    /*
    //         .locals 8
    //         new-instance v0, Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/studio/IsDevice;->GetExpansionPath()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/studio/IsDevice;->GetMainExpansionFilename()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    //         const-string v1, "IsDevice"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "IsDeviceGetMainExpansionFileSize value "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v1, Ljava/io/File;
    //         invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1}, Ljava/io/File;->exists()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "IsDevice"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "IsDeviceGetMainExpansionFileSize size "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v1}, Ljava/io/File;->length()J
    //         move-result-wide v4
    //         const-wide/16 v6, 0x400
    //         div-long/2addr v4, v6
    //         invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v1}, Ljava/io/File;->length()J
    //         move-result-wide v0
    //         long-to-int v0, v0
    //         div-int/lit16 v0, v0, 0x400
    //         goto :goto_0
    */

    public external fun IsDeviceKeyCallback(p0: Int)

    public fun IsDeviceSetPublicKey(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun IsDeviceSetTabletThreshold(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         iput p1, p0, Lcom/ideaworks3d/studio/IsDevice;->TabletThreshold:I
    //         iget v0, p0, Lcom/ideaworks3d/studio/IsDevice;->TabletThreshold:I
    //         return v0
    */

    public fun SetDownloadInfo(p0: com.android.vending.expansion.downloader.impl.DownloadInfo) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         return-void
    */

    public fun clone(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/CloneNotSupportedException;
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/lang/CloneNotSupportedException;
    //         invoke-direct {v0}, Ljava/lang/CloneNotSupportedException;-><init>()V
    //         throw v0
    */

    companion object {
    @JvmField public val TAG: String = "IsDevice"
    @JvmField public var s_Instance: com.ideaworks3d.studio.IsDevice
    }
}
