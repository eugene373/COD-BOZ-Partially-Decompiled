package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderThread.java.
// 8 fields, 22 methods.

open class LoaderThread_MediaPlayerManager {
    private var m_AudioIsPaused: Array<Boolean>
    private var m_AudioPlayRepeats: IntArray
    private var m_AudioState: Array<com.ideaworks3d.marmalade.LoaderThread.AudioState>
    private var m_AudioVolume: IntArray
    private var m_MediaPlayer: Array<android.media.MediaPlayer>
    private var m_MediaPlayerListener: Array<com.ideaworks3d.marmalade.LoaderThread.MediaPlayerManager.MediaPlayerListener>
    private val m_NumAudioChannels: Int
    val this$0: com.ideaworks3d.marmalade.LoaderThread

    public constructor(p0: com.ideaworks3d.marmalade.LoaderThread)

    private fun audioChangeState(p0: com.ideaworks3d.marmalade.LoaderThread.AudioState, p1: Int) { /* TODO(body): (Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aput-object p1, v0, p2
    //         return-void
    */

    private fun audioSetVolumeInternal(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p1
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioVolume:[I
    //         aget v0, v0, p1
    //         int-to-float v0, v0
    //         const/high16 v1, 0x42c80000    # 100.0f
    //         div-float/2addr v0, v1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v1, v1, p1
    //         invoke-virtual {v1, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V
    //         goto :goto_0
    */

    private fun audioStopped(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-static {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$400(Lcom/ideaworks3d/marmalade/LoaderThread;I)V
    //         return-void
    */

    public fun audioGetDuration(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p1
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Idle:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Initialized:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p1
    //         invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun audioGetNumChannels(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/16 v0, 0x10
    //         return v0
    */

    public fun audioGetPosition(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p1
    //         invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun audioGetStatus(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$5;->$SwitchMap$com$ideaworks3d$marmalade$LoaderThread$AudioState:[I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v1, v1, p1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->ordinal()I
    //         move-result v1
    //         aget v0, v0, v1
    //         packed-switch v0, :pswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :pswitch_1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :pswitch_2
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun audioIsPlaying(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p1
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun audioPause(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 3
    //         const/4 v0, -0x1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v1, v1, p1
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v1, v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v1, v1, p1
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v1, v1, p1
    //         invoke-virtual {v1}, Landroid/media/MediaPlayer;->pause()V
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         invoke-direct {p0, v1, p1}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun audioPlay(p0: String, p1: Int, p2: Long, p3: Long, p4: Int): Int { return TODO("body: (Ljava/lang/String;IJJI)I") }
    /*
    //         .locals 11
    //         move/from16 v0, p7
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioStop(I)V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         if-nez v2, :cond_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         new-instance v3, Landroid/media/MediaPlayer;
    //         invoke-direct {v3}, Landroid/media/MediaPlayer;-><init>()V
    //         aput-object v3, v2, p7
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayerListener:[Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;
    //         aget-object v3, v3, p7
    //         invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayerListener:[Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager$MediaPlayerListener;
    //         aget-object v3, v3, p7
    //         invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //         :cond_0
    //         :try_start_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         invoke-virtual {v2}, Landroid/media/MediaPlayer;->reset()V
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Idle:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         move/from16 v0, p7
    //         invoke-direct {p0, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         const-wide/16 v2, 0x0
    //         cmp-long v2, p5, v2
    //         if-lez v2, :cond_1
    //         new-instance v2, Ljava/io/File;
    //         invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         const/high16 v3, 0x10000000
    //         invoke-static {v2, v3}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         move-result-object v3
    //         new-instance v2, Landroid/content/res/AssetFileDescriptor;
    //         move-wide v4, p3
    //         move-wide/from16 v6, p5
    //         invoke-direct/range {v2 .. v7}, Landroid/content/res/AssetFileDescriptor;-><init>(Landroid/os/ParcelFileDescriptor;JJ)V
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v4, v4, p7
    //         invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v5
    //         invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
    //         move-result-wide v6
    //         invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getLength()J
    //         move-result-wide v8
    //         invoke-virtual/range {v4 .. v9}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V
    //         invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    //         invoke-virtual {v3}, Landroid/os/ParcelFileDescriptor;->close()V
    //         :goto_0
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Initialized:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         move/from16 v0, p7
    //         invoke-direct {p0, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Prepared:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         move/from16 v0, p7
    //         invoke-direct {p0, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         move/from16 v0, p7
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioSetVolumeInternal(I)V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioPlayRepeats:[I
    //         aput p2, v2, p7
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v3, v2, p7
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioPlayRepeats:[I
    //         aget v2, v2, p7
    //         if-nez v2, :cond_4
    //         const/4 v2, 0x1
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/media/MediaPlayer;->setLooping(Z)V
    //         :try_start_1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         invoke-virtual {v2}, Landroid/media/MediaPlayer;->start()V
    //         :try_end_1
    //         .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         move/from16 v0, p7
    //         invoke-direct {p0, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         const/4 v2, 0x0
    //         :goto_2
    //         return v2
    //         :cond_1
    //         :try_start_2
    //         const-string v2, "http://"
    //         invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
    //         move-result v2
    //         const/4 v3, -0x1
    //         if-ne v2, v3, :cond_2
    //         const-string v2, "https://"
    //         invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
    //         move-result v2
    //         const/4 v3, -0x1
    //         if-eq v2, v3, :cond_3
    //         :cond_2
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         invoke-virtual {v2, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
    //         :try_end_2
    //         .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         move/from16 v0, p7
    //         invoke-direct {p0, v3, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         invoke-virtual {v2}, Ljava/io/FileNotFoundException;->printStackTrace()V
    //         const/4 v2, -0x1
    //         goto :goto_2
    //         :cond_3
    //         :try_start_3
    //         new-instance v2, Ljava/io/FileInputStream;
    //         invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v3, v3, p7
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V
    //         invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    //         :try_end_3
    //         .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    //         goto :goto_0
    //         :catch_1
    //         move-exception v2
    //         :try_start_4
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$500(Lcom/ideaworks3d/marmalade/LoaderThread;)Landroid/content/res/AssetManager;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //         move-result-object v8
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v2, v2, p7
    //         invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v3
    //         invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
    //         move-result-wide v4
    //         invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->getLength()J
    //         move-result-wide v6
    //         invoke-virtual/range {v2 .. v7}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V
    //         invoke-virtual {v8}, Landroid/content/res/AssetFileDescriptor;->close()V
    //         :try_end_4
    //         .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    //         goto/16 :goto_0
    //         :catch_2
    //         move-exception v2
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Error:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         move/from16 v0, p7
    //         invoke-direct {p0, v3, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    //         const/4 v2, -0x2
    //         goto :goto_2
    //         :cond_4
    //         const/4 v2, 0x0
    //         goto :goto_1
    //         :catch_3
    //         move-exception v2
    //         invoke-virtual {v2}, Ljava/lang/IllegalStateException;->printStackTrace()V
    //         const/4 v2, -0x2
    //         goto :goto_2
    */

    public fun audioResume(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 3
    //         const/4 v0, -0x1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v1, v1, p1
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v1, v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v1, v1, p1
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v1, v1, p1
    //         invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         invoke-direct {p0, v1, p1}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun audioSetPosition(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p2
    //         invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V
    //         return-void
    */

    public fun audioSetVolume(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioVolume:[I
    //         aput p1, v0, p2
    //         invoke-direct {p0, p2}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioSetVolumeInternal(I)V
    //         return-void
    */

    public fun audioStop(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, p1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v1, v1, p1
    //         if-eqz v1, :cond_1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Started:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v0, v1, :cond_0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-eq v0, v1, :cond_0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->PlaybackCompleted:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p1
    //         invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Stopped:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         invoke-direct {p0, v0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_MediaPlayer:[Landroid/media/MediaPlayer;
    //         aget-object v0, v0, p1
    //         invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Idle:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         invoke-direct {p0, v0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioChangeState(Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V
    //         invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioStopped(I)V
    //         :cond_1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun audioStopAll() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         :goto_0
    //         const/16 v1, 0x10
    //         if-ge v0, v1, :cond_0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioStop(I)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun doPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         move v2, v1
    //         :goto_0
    //         const/16 v0, 0x10
    //         if-ge v2, v0, :cond_2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioIsPaused:[Ljava/lang/Boolean;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioState:[Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         aget-object v0, v0, v2
    //         sget-object v4, Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;->Paused:Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    //         if-ne v0, v4, :cond_1
    //         const/4 v0, 0x1
    //         :goto_1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         aput-object v0, v3, v2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioIsPaused:[Ljava/lang/Boolean;
    //         aget-object v0, v0, v2
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioPause(I)I
    //         :cond_0
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_1
    //         :cond_2
    //         return-void
    */

    public fun doResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         :goto_0
    //         const/16 v1, 0x10
    //         if-ge v0, v1, :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->m_AudioIsPaused:[Ljava/lang/Boolean;
    //         aget-object v1, v1, v0
    //         invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioResume(I)I
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

}
