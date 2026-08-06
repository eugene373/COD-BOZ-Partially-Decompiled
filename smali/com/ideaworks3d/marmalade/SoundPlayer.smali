.class public Lcom/ideaworks3d/marmalade/SoundPlayer;
.super Ljava/lang/Object;
.source "SoundPlayer.java"

# interfaces
.implements Landroid/media/AudioTrack$OnPlaybackPositionUpdateListener;


# static fields
.field private static final PERIODS_IN_BUFFER:I = 0x4


# instance fields
.field private m_BufSize:I

.field private m_FrameSize:I

.field private m_NeedsPrime:Z

.field private m_Period:I

.field private m_SampleData:[S

.field private m_SampleRate:I

.field private m_Stereo:Z

.field private m_Track:Landroid/media/AudioTrack;

.field private m_Volume:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z

    .line 16
    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_NeedsPrime:Z

    .line 17
    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    return-void
.end method

.method private declared-synchronized applyVolume()V
    .locals 2

    .prologue
    .line 159
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Volume:I

    int-to-float v0, v0

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    .line 160
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v1, v0, v0}, Landroid/media/AudioTrack;->setStereoVolume(FF)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    monitor-exit p0

    return-void

    .line 159
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private native generateAudio([SI)V
.end method

.method private writeSamples(I)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 89
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S

    if-nez v1, :cond_1

    .line 104
    :cond_0
    :goto_0
    return v0

    .line 91
    :cond_1
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S

    invoke-direct {p0, v1, p1}, Lcom/ideaworks3d/marmalade/SoundPlayer;->generateAudio([SI)V

    .line 93
    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z

    if-eqz v1, :cond_2

    .line 94
    mul-int/lit8 p1, p1, 0x2

    .line 95
    :cond_2
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S

    if-eqz v1, :cond_0

    .line 97
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 98
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S

    invoke-virtual {v1, v4, v0, p1}, Landroid/media/AudioTrack;->write([SII)I

    .line 99
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    .line 100
    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 104
    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method init(IZI)I
    .locals 9

    .prologue
    const/4 v7, 0x0

    const/4 v3, 0x3

    const/4 v0, 0x2

    const/4 v8, 0x1

    .line 22
    iput p3, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    .line 23
    iput-boolean p2, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z

    .line 24
    iput p1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Volume:I

    .line 25
    iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    if-nez v1, :cond_0

    .line 27
    invoke-static {v3}, Landroid/media/AudioTrack;->getNativeOutputSampleRate(I)I

    move-result v1

    iput v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    .line 29
    :cond_0
    const/4 v4, 0x2

    .line 30
    const/4 v6, 0x1

    .line 32
    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z

    if-eqz v1, :cond_3

    .line 34
    :goto_0
    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I

    .line 35
    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z

    if-eqz v1, :cond_1

    .line 36
    iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I

    mul-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I

    .line 37
    :cond_1
    iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    invoke-static {v1, v3, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    .line 38
    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I

    .line 39
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I

    iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_FrameSize:I

    div-int/2addr v0, v1

    .line 40
    div-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I

    .line 49
    :try_start_0
    new-instance v0, Landroid/media/AudioTrack;

    const/4 v1, 0x3

    iget v2, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    iget v5, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I

    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    .line 50
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->applyVolume()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    move-result v0

    if-eq v0, v8, :cond_2

    move v0, v7

    .line 68
    :goto_1
    return v0

    .line 52
    :catch_0
    move-exception v0

    move v0, v7

    .line 55
    goto :goto_1

    .line 62
    :cond_2
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_BufSize:I

    new-array v0, v0, [S

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleData:[S

    .line 63
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0, p0}, Landroid/media/AudioTrack;->setPlaybackPositionUpdateListener(Landroid/media/AudioTrack$OnPlaybackPositionUpdateListener;)V

    .line 64
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setPositionNotificationPeriod(I)I

    .line 67
    iput-boolean v8, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_NeedsPrime:Z

    .line 68
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    goto :goto_1

    :cond_3
    move v3, v0

    goto :goto_0
.end method

.method public onMarkerReached(Landroid/media/AudioTrack;)V
    .locals 0

    .prologue
    .line 86
    return-void
.end method

.method public declared-synchronized onPeriodicNotification(Landroid/media/AudioTrack;)V
    .locals 1

    .prologue
    .line 109
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->writeSamples(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 110
    if-nez v0, :cond_0

    .line 114
    :cond_0
    monitor-exit p0

    return-void

    .line 109
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized pause()V
    .locals 2

    .prologue
    .line 129
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 137
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 132
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 135
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 129
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized resume()V
    .locals 2

    .prologue
    .line 140
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 149
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 143
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 146
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->start()V

    .line 147
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I

    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0x2

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->writeSamples(I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 140
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized setVolume(I)V
    .locals 1

    .prologue
    .line 152
    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Volume:I

    .line 153
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 156
    :goto_0
    monitor-exit p0

    return-void

    .line 155
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->applyVolume()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 152
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method start()V
    .locals 3

    .prologue
    .line 72
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    if-nez v0, :cond_0

    .line 73
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Volume:I

    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Stereo:Z

    iget v2, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_SampleRate:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/SoundPlayer;->init(IZI)I

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 76
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_NeedsPrime:Z

    if-eqz v0, :cond_1

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_NeedsPrime:Z

    .line 79
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Period:I

    mul-int/lit8 v0, v0, 0x4

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->writeSamples(I)Z

    .line 81
    :cond_1
    return-void
.end method

.method declared-synchronized stop()V
    .locals 2

    .prologue
    .line 117
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 126
    :goto_0
    monitor-exit p0

    return-void

    .line 120
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setPlaybackPositionUpdateListener(Landroid/media/AudioTrack$OnPlaybackPositionUpdateListener;)V

    .line 121
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 122
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    .line 123
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 124
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundPlayer;->m_Track:Landroid/media/AudioTrack;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
