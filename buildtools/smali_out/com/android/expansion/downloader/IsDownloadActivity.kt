package com.android.expansion.downloader

// Auto-emitted from smali source: IsDownloadActivity.java.
// 18 fields, 21 methods.

open class IsDownloadActivity: android.app.Activity(), com.android.vending.expansion.downloader.IDownloaderClient {
    private var mAverageSpeed: android.widget.TextView
    private var mCancelValidation: Boolean
    private var mCellMessage: android.view.View
    private var mDashboard: android.view.View
    private var mDownloaderClientStub: com.android.vending.expansion.downloader.IStub
    private var mPB: android.widget.ProgressBar
    private var mPauseButton: android.widget.Button
    private var mProgressFraction: android.widget.TextView
    private var mProgressPercent: android.widget.TextView
    private var mRemoteService: com.android.vending.expansion.downloader.IDownloaderService
    private var mState: Int
    private var mStatePaused: Boolean
    private var mStatusText: android.widget.TextView
    private var mTimeRemaining: android.widget.TextView
    private var mWiFiSettingsButton: android.widget.Button

    public constructor()

    private fun initializeDownloadUI() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const-class v0, Lcom/ideaworks3d/studio/IsDownloaderService;
    //         invoke-static {p0, v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller;->CreateStub(Lcom/android/vending/expansion/downloader/IDownloaderClient;Ljava/lang/Class;)Lcom/android/vending/expansion/downloader/IStub;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;
    //         return-void
    */

    private fun setButtonPausedState(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         iput-boolean p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mStatePaused:Z
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPauseButton:Landroid/widget/Button;
    //         const-string v1, "text_button_pause"
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    //         return-void
    */

    private fun setState(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mState:I
    //         if-eq v0, p1, :cond_0
    //         iput p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mState:I
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mStatusText:Landroid/widget/TextView;
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         :cond_0
    //         return-void
    */

    fun expansionFilesDelivered(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 8
    //         const/4 v0, 0x0
    //         sget-object v2, Lcom/android/expansion/downloader/IsDownloadActivity;->xAPKS:[Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;
    //         array-length v3, v2
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_1
    //         aget-object v4, v2, v1
    //         iget-boolean v5, v4, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mIsMain:Z
    //         iget v6, v4, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileVersion:I
    //         invoke-static {p0, v5, v6}, Lcom/android/vending/expansion/downloader/Helpers;->getExpansionAPKFileName(Landroid/content/Context;ZI)Ljava/lang/String;
    //         move-result-object v5
    //         iget-wide v6, v4, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileSize:J
    //         invoke-static {p0, v5, v6, v7, v0}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         :goto_1
    //         return v0
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_1
    */

    public fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         invoke-direct {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->initializeDownloadUI()V
    //         invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->expansionFilesDelivered()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->getIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         const/high16 v2, 0x14000000
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    //         invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-virtual {v0}, Landroid/content/Intent;->getCategories()Ljava/util/Set;
    //         move-result-object v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v0}, Landroid/content/Intent;->getCategories()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "LVLDownloader"
    //         const-string v2, "Cannot find own package! MAYDAY!"
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         const/high16 v2, 0x8000000
    //         :try_start_1
    //         invoke-static {p0, v0, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //         move-result-object v0
    //         const-class v1, Lcom/ideaworks3d/studio/IsDownloaderService;
    //         invoke-static {p0, v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->initializeDownloadUI()V
    //         :try_end_1
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->validateXAPKZipFiles()V
    //         goto :goto_1
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCancelValidation:Z
    //         invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
    //         return-void
    */

    public fun onDownloadProgress(p0: com.android.vending.expansion.downloader.DownloadProgressInfo) { /* TODO(body): (Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V */ }
    /*
    //         .locals 6
    //         const/16 v4, 0x8
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mAverageSpeed:Landroid/widget/TextView;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "%1$s KB/s"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mCurrentSpeed:F
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/Helpers;->getSpeedString(F)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mTimeRemaining:Landroid/widget/TextView;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Time remaining: %1$s"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mTimeRemaining:J
    //         invoke-static {v2, v3}, Lcom/android/vending/expansion/downloader/Helpers;->getTimeRemaining(J)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-wide v0, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         iput-wide v0, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPB:Landroid/widget/ProgressBar;
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         shr-long/2addr v2, v4
    //         long-to-int v1, v2
    //         invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPB:Landroid/widget/ProgressBar;
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J
    //         shr-long/2addr v2, v4
    //         long-to-int v1, v2
    //         invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mProgressPercent:Landroid/widget/TextView;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J
    //         const-wide/16 v4, 0x64
    //         mul-long/2addr v2, v4
    //         iget-wide v4, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         div-long/2addr v2, v4
    //         invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "%"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mProgressFraction:Landroid/widget/TextView;
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J
    //         iget-wide v4, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         invoke-static {v2, v3, v4, v5}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloadProgressString(JJ)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun onDownloadStateChanged(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 7
    //         const/16 v2, 0x8
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-direct {p0, p1}, Lcom/android/expansion/downloader/IsDownloadActivity;->setState(I)V
    //         packed-switch p1, :pswitch_data_0
    //         :pswitch_0
    //         move v3, v0
    //         move v4, v0
    //         move v5, v1
    //         :goto_0
    //         if-eqz v0, :cond_2
    //         move v0, v1
    //         :goto_1
    //         iget-object v6, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDashboard:Landroid/view/View;
    //         invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
    //         move-result v6
    //         if-eq v6, v0, :cond_0
    //         iget-object v6, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDashboard:Landroid/view/View;
    //         invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V
    //         :cond_0
    //         if-eqz v5, :cond_3
    //         :goto_2
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCellMessage:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
    //         move-result v0
    //         if-eq v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCellMessage:Landroid/view/View;
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPB:Landroid/widget/ProgressBar;
    //         invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V
    //         invoke-direct {p0, v4}, Lcom/android/expansion/downloader/IsDownloadActivity;->setButtonPausedState(Z)V
    //         :goto_3
    //         return-void
    //         :pswitch_1
    //         move v3, v0
    //         move v4, v1
    //         move v5, v1
    //         goto :goto_0
    //         :pswitch_2
    //         move v3, v0
    //         move v4, v1
    //         move v5, v1
    //         goto :goto_0
    //         :pswitch_3
    //         move v3, v1
    //         move v4, v1
    //         move v5, v1
    //         goto :goto_0
    //         :pswitch_4
    //         move v3, v1
    //         move v4, v0
    //         move v5, v1
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_5
    //         move v3, v1
    //         move v4, v0
    //         move v5, v0
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_6
    //         move v3, v1
    //         move v4, v0
    //         move v5, v1
    //         goto :goto_0
    //         :pswitch_7
    //         move v3, v1
    //         move v4, v0
    //         move v5, v1
    //         goto :goto_0
    //         :pswitch_8
    //         invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->validateXAPKZipFiles()V
    //         goto :goto_3
    //         :cond_2
    //         move v0, v2
    //         goto :goto_1
    //         :cond_3
    //         move v1, v2
    //         goto :goto_2
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_8
    //             :pswitch_0
    //             :pswitch_6
    //             :pswitch_5
    //             :pswitch_5
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_7
    //             :pswitch_0
    //             :pswitch_7
    //             :pswitch_4
    //             :pswitch_4
    //             :pswitch_0
    //             :pswitch_4
    //             :pswitch_4
    //         .end packed-switch
    */

    public fun onServiceConnected(p0: android.os.Messenger) { /* TODO(body): (Landroid/os/Messenger;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller;->CreateProxy(Landroid/os/Messenger;)Lcom/android/vending/expansion/downloader/IDownloaderService;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mRemoteService:Lcom/android/vending/expansion/downloader/IDownloaderService;
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mRemoteService:Lcom/android/vending/expansion/downloader/IDownloaderService;
    //         iget-object v1, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;
    //         invoke-interface {v1}, Lcom/android/vending/expansion/downloader/IStub;->getMessenger()Landroid/os/Messenger;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderService;->onClientUpdated(Landroid/os/Messenger;)V
    //         return-void
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;
    //         invoke-interface {v0, p0}, Lcom/android/vending/expansion/downloader/IStub;->connect(Landroid/content/Context;)V
    //         :cond_0
    //         invoke-super {p0}, Landroid/app/Activity;->onStart()V
    //         return-void
    */

    protected fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;
    //         invoke-interface {v0, p0}, Lcom/android/vending/expansion/downloader/IStub;->disconnect(Landroid/content/Context;)V
    //         :cond_0
    //         invoke-super {p0}, Landroid/app/Activity;->onStop()V
    //         return-void
    */

    fun validateXAPKZipFiles() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;
    //         invoke-direct {v0, p0}, Lcom/android/expansion/downloader/IsDownloadActivity$1;-><init>(Lcom/android/expansion/downloader/IsDownloadActivity;)V
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         new-instance v3, Ljava/lang/Object;
    //         invoke-direct {v3}, Ljava/lang/Object;-><init>()V
    //         aput-object v3, v1, v2
    //         invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         return-void
    */

    companion object {
    private val LOG_TAG: String = "LVLDownloader"
    private val SMOOTHING_FACTOR: Float = 0.0f
    private val xAPKS: Array<com.android.expansion.downloader.IsDownloadActivity.XAPKFile> = null!!
    }
}
