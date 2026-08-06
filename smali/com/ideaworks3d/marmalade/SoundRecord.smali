.class public Lcom/ideaworks3d/marmalade/SoundRecord;
.super Ljava/lang/Object;
.source "SoundRecord.java"

# interfaces
.implements Landroid/media/AudioRecord$OnRecordPositionUpdateListener;


# instance fields
.field private m_AudioRecord:Landroid/media/AudioRecord;

.field private m_BufSize:I

.field private m_Buffer:[S

.field private m_Frequency:I

.field private m_Period:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    return-void
.end method

.method public static available()I
    .locals 2

    .prologue
    .line 18
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.microphone"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 20
    const/4 v0, 0x0

    .line 22
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private native recordAudio([SII)V
.end method


# virtual methods
.method public onMarkerReached(Landroid/media/AudioRecord;)V
    .locals 0

    .prologue
    .line 72
    return-void
.end method

.method public onPeriodicNotification(Landroid/media/AudioRecord;)V
    .locals 4

    .prologue
    .line 76
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S

    const/4 v2, 0x0

    iget v3, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioRecord;->read([SII)I

    move-result v0

    .line 77
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S

    iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    invoke-direct {p0, v1, v0, v2}, Lcom/ideaworks3d/marmalade/SoundRecord;->recordAudio([SII)V

    .line 78
    return-void
.end method

.method public start(I)I
    .locals 7

    .prologue
    const/4 v3, 0x2

    const/4 v1, -0x2

    const/4 v6, 0x0

    .line 26
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/ideaworks3d/marmalade/SoundRecord;->available()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move v0, v6

    .line 67
    :goto_0
    return v0

    .line 30
    :cond_1
    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    .line 31
    iput p1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    .line 34
    :cond_2
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    invoke-static {v0, v3, v3}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    .line 35
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    if-ne v0, v1, :cond_3

    .line 38
    const/16 v0, 0x1f40

    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    .line 39
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    invoke-static {v0, v3, v3}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    .line 40
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    if-ne v0, v1, :cond_3

    move v0, v6

    .line 41
    goto :goto_0

    .line 43
    :cond_3
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    const/16 v1, 0x1000

    if-gt v0, v1, :cond_4

    .line 44
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    .line 45
    :cond_4
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    div-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I

    .line 49
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    new-array v0, v0, [S

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S

    .line 50
    new-instance v0, Landroid/media/AudioRecord;

    const/4 v1, 0x1

    iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    iget v5, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_BufSize:I

    move v4, v3

    invoke-direct/range {v0 .. v5}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    .line 52
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0, p0}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;)V

    .line 53
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    iget v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I

    invoke-virtual {v0, v1}, Landroid/media/AudioRecord;->setPositionNotificationPeriod(I)I

    .line 56
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S

    iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Period:I

    invoke-virtual {v0, v1, v6, v2}, Landroid/media/AudioRecord;->read([SII)I

    move-result v0

    .line 65
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Buffer:[S

    iget v2, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    invoke-direct {p0, v1, v0, v2}, Lcom/ideaworks3d/marmalade/SoundRecord;->recordAudio([SII)V

    .line 67
    iget v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_Frequency:I

    goto :goto_0

    .line 58
    :catch_0
    move-exception v0

    move v0, v6

    .line 61
    goto :goto_0
.end method

.method public stop()I
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 81
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    if-nez v0, :cond_0

    .line 83
    const/4 v0, 0x1

    .line 91
    :goto_0
    return v0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0, v1}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;)V

    .line 87
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    .line 88
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    .line 89
    iput-object v1, p0, Lcom/ideaworks3d/marmalade/SoundRecord;->m_AudioRecord:Landroid/media/AudioRecord;

    .line 91
    const/4 v0, 0x0

    goto :goto_0
.end method
