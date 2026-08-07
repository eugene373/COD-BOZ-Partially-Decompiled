package com.ideaworks3d.marmalade

// Auto-emitted from smali source: SoundPlayer.java.
// 10 fields, 6 methods.

open class SoundPlayer: android.media.AudioTrack.OnPlaybackPositionUpdateListener {
    private var m_BufSize: Int
    private var m_FrameSize: Int
    private var m_NeedsPrime: Boolean
    private var m_Period: Int
    private var m_SampleData: ShortArray
    private var m_SampleRate: Int
    private var m_Stereo: Boolean
    private var m_Track: android.media.AudioTrack
    private var m_Volume: Int

    public constructor()

    private external fun generateAudio(p0: ShortArray, p1: Int)

    private fun writeSamples(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S
    //         invoke-direct {p0, v1, p1}, Lcom/ideaworks3d/marmalade/SoundPlayer;->generateAudio([SI)V
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z
    //         if-eqz v1, :cond_2
    //         mul-int/lit8 p1, p1, 0x2
    //         :cond_2
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S
    //         if-eqz v1, :cond_0
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S
    //         invoke-virtual {v1, v4, v0, p1}, Landroid/media/AudioTrack;->write([SII)I
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         sub-long/2addr v0, v2
    //         const-wide/16 v2, 0x1
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_3
    //         :cond_3
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    fun init(p0: Int, p1: Boolean, p2: Int): Int { return TODO("body: (IZI)I") }
    /*
    //         .locals 9
    //         const/4 v7, 0x0
    //         const/4 v3, 0x3
    //         const/4 v0, 0x2
    //         const/4 v8, 0x1
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I
    //         iput-boolean p2, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z
    //         iput p1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Volume:I
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I
    //         if-nez v1, :cond_0
    //         invoke-static {v3}, Landroid/media/AudioTrack;->getNativeOutputSampleRate(I)I
    //         move-result v1
    //         iput v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I
    //         :cond_0
    //         const/4 v4, 0x2
    //         const/4 v6, 0x1
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z
    //         if-eqz v1, :cond_3
    //         :goto_0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z
    //         if-eqz v1, :cond_1
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I
    //         mul-int/lit8 v1, v1, 0x2
    //         iput v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I
    //         :cond_1
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I
    //         invoke-static {v1, v3, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I
    //         move-result v0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I
    //         div-int/2addr v0, v1
    //         div-int/lit8 v0, v0, 0x4
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I
    //         :try_start_0
    //         new-instance v0, Landroid/media/AudioTrack;
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I
    //         iget v5, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I
    //         invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->applyVolume()V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I
    //         move-result v0
    //         if-eq v0, v8, :cond_2
    //         move v0, v7
    //         :goto_1
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         move v0, v7
    //         goto :goto_1
    //         :cond_2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I
    //         new-array v0, v0, [S
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         invoke-virtual {v0, p0}, Landroid/media/AudioTrack;->setPlaybackPositionUpdateListener(Landroid/media/AudioTrack$OnPlaybackPositionUpdateListener;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I
    //         invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setPositionNotificationPeriod(I)I
    //         iput-boolean v8, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_NeedsPrime:Z
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I
    //         goto :goto_1
    //         :cond_3
    //         move v3, v0
    //         goto :goto_0
    */

    public fun onMarkerReached(p0: android.media.AudioTrack) { /* TODO(body): (Landroid/media/AudioTrack;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    fun start() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Volume:I
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/SoundPlayer;->init(IZI)I
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    //         invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_NeedsPrime:Z
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_NeedsPrime:Z
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I
    //         mul-int/lit8 v0, v0, 0x4
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->writeSamples(I)Z
    //         :cond_1
    //         return-void
    */

    companion object {
    private val PERIODS_IN_BUFFER: Int = 0x4
    }
}
