package com.ideaworks3d.marmalade

// Auto-emitted from smali source: SoundRecord.java.
// 5 fields, 7 methods.

open class SoundRecord: android.media.AudioRecord.OnRecordPositionUpdateListener {
    private var m_AudioRecord: android.media.AudioRecord
    private var m_BufSize: Int
    private var m_Buffer: ShortArray
    private var m_Frequency: Int
    private var m_Period: Int

    public constructor()

    private external fun recordAudio(p0: ShortArray, p1: Int, p2: Int)

    public fun onMarkerReached(p0: android.media.AudioRecord) { /* TODO(body): (Landroid/media/AudioRecord;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPeriodicNotification(p0: android.media.AudioRecord) { /* TODO(body): (Landroid/media/AudioRecord;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S
    //         const/4 v2, 0x0
    //         iget v3, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioRecord;->read([SII)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         invoke-direct {p0, v1, v0, v2}, Lcom/ideaworks3d/marmalade/SoundRecord;->recordAudio([SII)V
    //         return-void
    */

    public fun start(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 7
    //         const/4 v3, 0x2
    //         const/4 v1, -0x2
    //         const/4 v6, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/SoundRecord;->available()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         move v0, v6
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, -0x1
    //         if-eq p1, v0, :cond_2
    //         iput p1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         :cond_2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         invoke-static {v0, v3, v3}, Landroid/media/AudioRecord;->getMinBufferSize(III)I
    //         move-result v0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         if-ne v0, v1, :cond_3
    //         const/16 v0, 0x1f40
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         invoke-static {v0, v3, v3}, Landroid/media/AudioRecord;->getMinBufferSize(III)I
    //         move-result v0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         if-ne v0, v1, :cond_3
    //         move v0, v6
    //         goto :goto_0
    //         :cond_3
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         const/16 v1, 0x1000
    //         if-gt v0, v1, :cond_4
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         mul-int/lit8 v0, v0, 0x2
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         :cond_4
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         div-int/lit8 v0, v0, 0x4
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         new-array v0, v0, [S
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S
    //         new-instance v0, Landroid/media/AudioRecord;
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         iget v5, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I
    //         move v4, v3
    //         invoke-direct/range {v0 .. v5}, Landroid/media/AudioRecord;-><init>(IIIII)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         invoke-virtual {v0, p0}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I
    //         invoke-virtual {v0, v1}, Landroid/media/AudioRecord;->setPositionNotificationPeriod(I)I
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I
    //         invoke-virtual {v0, v1, v6, v2}, Landroid/media/AudioRecord;->read([SII)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         invoke-direct {p0, v1, v0, v2}, Lcom/ideaworks3d/marmalade/SoundRecord;->recordAudio([SII)V
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move v0, v6
    //         goto :goto_0
    */

    public fun stop(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         invoke-virtual {v0, v1}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    public @JvmStatic fun available(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         const-string v1, "android.hardware.microphone"
    //         invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    }
}
