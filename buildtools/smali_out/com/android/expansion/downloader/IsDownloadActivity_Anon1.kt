package com.android.expansion.downloader

// Auto-emitted from smali source: IsDownloadActivity.java.
// 1 fields, 8 methods.

open class IsDownloadActivity_Anon1: android.os.AsyncTask() {
    val this$0: com.android.expansion.downloader.IsDownloadActivity

    constructor(p0: com.android.expansion.downloader.IsDownloadActivity)

    protected fun doInBackground(p0: Array<Object>): Boolean { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Boolean;") }
    /*
    //         .locals 30
    //         invoke-static {}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$500()[Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;
    //         move-result-object v22
    //         move-object/from16 v0, v22
    //         array-length v0, v0
    //         move/from16 v23, v0
    //         const/4 v2, 0x0
    //         move/from16 v21, v2
    //         :goto_0
    //         move/from16 v0, v21
    //         move/from16 v1, v23
    //         if-ge v0, v1, :cond_b
    //         aget-object v2, v22, v21
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         iget-boolean v4, v2, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mIsMain:Z
    //         iget v5, v2, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileVersion:I
    //         invoke-static {v3, v4, v5}, Lcom/android/vending/expansion/downloader/Helpers;->getExpansionAPKFileName(Landroid/content/Context;ZI)Ljava/lang/String;
    //         move-result-object v3
    //         move-object/from16 v0, p0
    //         iget-object v4, v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         iget-wide v6, v2, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileSize:J
    //         const/4 v2, 0x0
    //         invoke-static {v4, v3, v6, v7, v2}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         const/4 v2, 0x0
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         :cond_0
    //         :goto_1
    //         return-object v2
    //         :cond_1
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v2, v3}, Lcom/android/vending/expansion/downloader/Helpers;->generateSaveFileName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const/high16 v3, 0x40000
    //         new-array v0, v3, [B
    //         move-object/from16 v24, v0
    //         :try_start_0
    //         new-instance v25, Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         move-object/from16 v0, v25
    //         invoke-direct {v0, v2}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;-><init>(Ljava/lang/String;)V
    //         invoke-virtual/range {v25 .. v25}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->getAllEntries()[Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         move-result-object v26
    //         const-wide/16 v4, 0x0
    //         move-object/from16 v0, v26
    //         array-length v3, v0
    //         const/4 v2, 0x0
    //         :goto_2
    //         if-ge v2, v3, :cond_2
    //         aget-object v6, v26, v2
    //         iget-wide v6, v6, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mCompressedLength:J
    //         add-long/2addr v4, v6
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_2
    //         :cond_2
    //         const/4 v6, 0x0
    //         move-object/from16 v0, v26
    //         array-length v0, v0
    //         move/from16 v27, v0
    //         const/4 v2, 0x0
    //         move/from16 v20, v2
    //         move-wide v2, v4
    //         :goto_3
    //         move/from16 v0, v20
    //         move/from16 v1, v27
    //         if-ge v0, v1, :cond_a
    //         aget-object v28, v26, v20
    //         const-wide/16 v8, -0x1
    //         move-object/from16 v0, v28
    //         iget-wide v10, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mCRC32:J
    //         cmp-long v7, v8, v10
    //         if-eqz v7, :cond_8
    //         move-object/from16 v0, v28
    //         iget-wide v12, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mUncompressedLength:J
    //         new-instance v29, Ljava/util/zip/CRC32;
    //         invoke-direct/range {v29 .. v29}, Ljava/util/zip/CRC32;-><init>()V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v7, 0x0
    //         :try_start_1
    //         new-instance v11, Ljava/io/DataInputStream;
    //         move-object/from16 v0, v28
    //         iget-object v8, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFileName:Ljava/lang/String;
    //         move-object/from16 v0, v25
    //         invoke-virtual {v0, v8}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->getInputStream(Ljava/lang/String;)Ljava/io/InputStream;
    //         move-result-object v8
    //         invoke-direct {v11, v8}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v8
    //         move-wide v14, v8
    //         :goto_4
    //         const-wide/16 v8, 0x0
    //         cmp-long v7, v12, v8
    //         if-lez v7, :cond_6
    //         move-object/from16 v0, v24
    //         array-length v7, v0
    //         int-to-long v8, v7
    //         cmp-long v7, v12, v8
    //         if-lez v7, :cond_4
    //         move-object/from16 v0, v24
    //         array-length v7, v0
    //         int-to-long v8, v7
    //         :goto_5
    //         long-to-int v7, v8
    //         const/4 v8, 0x0
    //         move-object/from16 v0, v24
    //         invoke-virtual {v11, v0, v8, v7}, Ljava/io/DataInputStream;->readFully([BII)V
    //         const/4 v8, 0x0
    //         move-object/from16 v0, v29
    //         move-object/from16 v1, v24
    //         invoke-virtual {v0, v1, v8, v7}, Ljava/util/zip/CRC32;->update([BII)V
    //         int-to-long v8, v7
    //         sub-long v18, v12, v8
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v16
    //         sub-long v8, v16, v14
    //         const-wide/16 v12, 0x0
    //         cmp-long v10, v8, v12
    //         if-lez v10, :cond_c
    //         int-to-float v10, v7
    //         long-to-float v8, v8
    //         div-float/2addr v10, v8
    //         const/4 v8, 0x0
    //         cmpl-float v8, v8, v6
    //         if-eqz v8, :cond_3
    //         const v8, 0x3ba3d70a    # 0.005f
    //         mul-float/2addr v8, v10
    //         const v9, 0x3f7eb852    # 0.995f
    //         mul-float/2addr v6, v9
    //         add-float v10, v8, v6
    //         :cond_3
    //         int-to-long v6, v7
    //         sub-long v12, v2, v6
    //         long-to-float v2, v12
    //         div-float/2addr v2, v10
    //         float-to-long v8, v2
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Lcom/android/vending/expansion/downloader/DownloadProgressInfo;
    //         const/4 v14, 0x0
    //         new-instance v3, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;
    //         sub-long v6, v4, v12
    //         invoke-direct/range {v3 .. v10}, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;-><init>(JJJF)V
    //         aput-object v3, v2, v14
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v2}, Lcom/android/expansion/downloader/IsDownloadActivity$1;->publishProgress([Ljava/lang/Object;)V
    //         move-wide v2, v12
    //         :goto_6
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v6}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$300(Lcom/android/expansion/downloader/IsDownloadActivity;)Z
    //         move-result v6
    //         if-eqz v6, :cond_5
    //         const/4 v2, 0x1
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         move-result-object v2
    //         if-eqz v11, :cond_0
    //         :try_start_3
    //         invoke-virtual {v11}, Ljava/io/DataInputStream;->close()V
    //         :try_end_3
    //         .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    //         goto/16 :goto_1
    //         :catch_0
    //         move-exception v2
    //         invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    //         const/4 v2, 0x0
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         goto/16 :goto_1
    //         :cond_4
    //         move-wide v8, v12
    //         goto :goto_5
    //         :cond_5
    //         move-wide/from16 v14, v16
    //         move-wide/from16 v12, v18
    //         move v6, v10
    //         goto/16 :goto_4
    //         :cond_6
    //         :try_start_4
    //         invoke-virtual/range {v29 .. v29}, Ljava/util/zip/CRC32;->getValue()J
    //         move-result-wide v8
    //         move-object/from16 v0, v28
    //         iget-wide v12, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mCRC32:J
    //         cmp-long v7, v8, v12
    //         if-eqz v7, :cond_7
    //         const-string v2, "LVLDL"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "CRC does not match for entry: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         move-object/from16 v0, v28
    //         iget-object v4, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v2, "LVLDL"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "In file: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual/range {v28 .. v28}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getZipFileName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v2, 0x0
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_1
    //         move-result-object v2
    //         if-eqz v11, :cond_0
    //         :try_start_5
    //         invoke-virtual {v11}, Ljava/io/DataInputStream;->close()V
    //         goto/16 :goto_1
    //         :cond_7
    //         if-eqz v11, :cond_8
    //         invoke-virtual {v11}, Ljava/io/DataInputStream;->close()V
    //         :cond_8
    //         add-int/lit8 v7, v20, 0x1
    //         move/from16 v20, v7
    //         goto/16 :goto_3
    //         :catchall_0
    //         move-exception v2
    //         move-object v3, v7
    //         :goto_7
    //         if-eqz v3, :cond_9
    //         invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V
    //         :cond_9
    //         throw v2
    //         :try_end_5
    //         .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    //         :cond_a
    //         add-int/lit8 v2, v21, 0x1
    //         move/from16 v21, v2
    //         goto/16 :goto_0
    //         :cond_b
    //         const/4 v2, 0x1
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         goto/16 :goto_1
    //         :catchall_1
    //         move-exception v2
    //         move-object v3, v11
    //         goto :goto_7
    //         :cond_c
    //         move v10, v6
    //         goto/16 :goto_6
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/android/expansion/downloader/IsDownloadActivity$1;->doInBackground([Ljava/lang/Object;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(p0: Boolean) { /* TODO(body): (Ljava/lang/Boolean;)V */ }
    /*
    //         .locals 3
    //         const/16 v2, 0x8
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$000(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$100(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$200(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/TextView;
    //         move-result-object v0
    //         const-string v1, "text_validation_complete"
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$400(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/Button;
    //         move-result-object v0
    //         new-instance v1, Lcom/android/expansion/downloader/IsDownloadActivity$1$2;
    //         invoke-direct {v1, p0}, Lcom/android/expansion/downloader/IsDownloadActivity$1$2;-><init>(Lcom/android/expansion/downloader/IsDownloadActivity$1;)V
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$400(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/Button;
    //         move-result-object v0
    //         const-string v1, "ok"
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    //         :goto_0
    //         invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$000(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$100(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$200(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/TextView;
    //         move-result-object v0
    //         const-string v1, "text_validation_failed"
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$400(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/Button;
    //         move-result-object v0
    //         new-instance v1, Lcom/android/expansion/downloader/IsDownloadActivity$1$3;
    //         invoke-direct {v1, p0}, Lcom/android/expansion/downloader/IsDownloadActivity$1$3;-><init>(Lcom/android/expansion/downloader/IsDownloadActivity$1;)V
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$400(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/Button;
    //         move-result-object v0
    //         const-string v1, "cancel"
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    //         goto :goto_0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Boolean;
    //         invoke-virtual {p0, p1}, Lcom/android/expansion/downloader/IsDownloadActivity$1;->onPostExecute(Ljava/lang/Boolean;)V
    //         return-void
    */

    protected fun onPreExecute() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$000(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$100(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    //         move-result-object v0
    //         const/16 v1, 0x8
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$200(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/TextView;
    //         move-result-object v0
    //         const-string v1, "text_verifying_download"
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$400(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/Button;
    //         move-result-object v0
    //         new-instance v1, Lcom/android/expansion/downloader/IsDownloadActivity$1$1;
    //         invoke-direct {v1, p0}, Lcom/android/expansion/downloader/IsDownloadActivity$1$1;-><init>(Lcom/android/expansion/downloader/IsDownloadActivity$1;)V
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         invoke-static {v0}, Lcom/android/expansion/downloader/IsDownloadActivity;->access$400(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/Button;
    //         move-result-object v0
    //         const-string v1, "text_button_cancel_verify"
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    //         invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V
    //         return-void
    */

    protected fun onProgressUpdate(p0: Array<com.android.vending.expansion.downloader.DownloadProgressInfo>) { /* TODO(body): ([Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity$1;->this$0:Lcom/android/expansion/downloader/IsDownloadActivity;
    //         const/4 v1, 0x0
    //         aget-object v1, p1, v1
    //         invoke-virtual {v0, v1}, Lcom/android/expansion/downloader/IsDownloadActivity;->onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    //         invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V
    //         return-void
    */

    protected fun onProgressUpdate(p0: Array<Object>) { /* TODO(body): ([Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, [Lcom/android/vending/expansion/downloader/DownloadProgressInfo;
    //         invoke-virtual {p0, p1}, Lcom/android/expansion/downloader/IsDownloadActivity$1;->onProgressUpdate([Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    //         return-void
    */

}
