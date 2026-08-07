package com.ideaworks3d.studio

// Auto-emitted from smali source: IsDeviceActivity.java.
// 6 fields, 12 methods.

open class IsDeviceActivity: com.ideaworks3d.marmalade.LoaderActivity() {
    private val NO_FILE: String
    private val TAG: String
    private var mAPKExtensionFile: com.android.vending.expansion.zipfile.ZipResourceFile

    public constructor()

    public fun handleFileUpdated(p0: com.android.vending.expansion.downloader.impl.DownloadsDB, p1: Int, p2: String, p3: Long): Boolean { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadsDB;ILjava/lang/String;J)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloadInfoByFileName(Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         move-result-object v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         if-eqz v2, :cond_2
    //         invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         :goto_0
    //         return v1
    //         :cond_0
    //         invoke-static {p0, v2}, Lcom/android/vending/expansion/downloader/Helpers;->generateSaveFileName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v3, Ljava/io/File;
    //         invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v3}, Ljava/io/File;->exists()Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v3}, Ljava/io/File;->delete()Z
    //         :cond_1
    //         iget-object v2, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;
    //         const-string v3, "Deleting Partial Download file"
    //         invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_2
    //         invoke-static {p0, p3, p4, p5, v0}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z
    //         move-result v2
    //         if-nez v2, :cond_3
    //         :goto_1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_1
    */

    public fun hasActiveInternetConnection(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 2
    //         const-string v0, "wifi"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/studio/IsDeviceActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/wifi/WifiManager;
    //         invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;
    //         const-string v1, "No network available!"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onCreate(Landroid/os/Bundle;)V
    //         sput-object p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->m_Activity:Lcom/ideaworks3d/studio/IsDeviceActivity;
    //         return-void
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onDestroy()V
    //         return-void
    */

    public fun onKeyDown(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 3
    //         const/16 v0, 0x1a
    //         if-eq v0, p1, :cond_0
    //         const/4 v0, 0x3
    //         if-ne v0, p1, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onKeyDown Recieved: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/studio/IsDevice;->IsActivated()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/studio/IsDevice;->IsDeviceKeyCallback(I)V
    //         :cond_1
    //         invoke-super {p0, p1, p2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    protected fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;
    //         const-string v1, "onPause"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onPause()V
    //         return-void
    */

    protected fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;
    //         const-string v1, "onResume"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onResume()V
    //         return-void
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onStart()V
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;
    //         const-string v1, "onStart"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    protected fun onUserLeaveHint() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;
    //         const-string v1, "onUserLeaveHint"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onUserLeaveHint()V
    //         return-void
    */

    public fun onWindowFocusChanged(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/studio/IsDevice;->IsActivated()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;
    //         move-result-object v0
    //         const/4 v1, 0x3
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/studio/IsDevice;->IsDeviceKeyCallback(I)V
    //         :cond_0
    //         return-void
    */

    companion object {
    private val SALT: ByteArray = null!!
    @JvmField public val STATUS_SUCCESS: Int = 0xc8
    private var m_Activity: com.ideaworks3d.studio.IsDeviceActivity
    }
}
