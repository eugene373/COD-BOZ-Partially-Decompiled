.class Lcom/ideaworks3d/marmalade/CameraCapture;
.super Ljava/lang/Object;
.source "s3eCameraCapture.java"


# static fields
.field static final S3E_CAMERACAPTURE_BMP:I = 0x3

.field static final S3E_CAMERACAPTURE_JPG:I = 0x1

.field static final S3E_CAMERACAPTURE_PNG:I = 0x2

.field static final S3E_CAMERACAPTURE_VIDEO:I = 0x4

.field private static images:I

.field private static volatile m_WaitingForFile:Z

.field private static videos:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 14
    sput v0, Lcom/ideaworks3d/marmalade/CameraCapture;->images:I

    .line 15
    sput v0, Lcom/ideaworks3d/marmalade/CameraCapture;->videos:I

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private CheckCamera()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 23
    .line 24
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-lt v1, v2, :cond_0

    .line 25
    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v1

    .line 28
    :goto_0
    if-nez v1, :cond_1

    .line 31
    :goto_1
    return v0

    .line 27
    :cond_0
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v1

    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    .line 31
    const/4 v0, 0x1

    goto :goto_1
.end method

.method static synthetic access$002(Z)Z
    .locals 0

    .prologue
    .line 12
    sput-boolean p0, Lcom/ideaworks3d/marmalade/CameraCapture;->m_WaitingForFile:Z

    return p0
.end method

.method public static convertUriToFile(Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 100
    new-array v0, v3, [Ljava/io/File;

    .line 101
    sput-boolean v3, Lcom/ideaworks3d/marmalade/CameraCapture;->m_WaitingForFile:Z

    .line 102
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    new-instance v2, Lcom/ideaworks3d/marmalade/CameraCapture$1;

    invoke-direct {v2, v0}, Lcom/ideaworks3d/marmalade/CameraCapture$1;-><init>([Ljava/io/File;)V

    invoke-virtual {v1, p0, p1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getCursor(Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V

    .line 129
    :goto_0
    sget-boolean v1, Lcom/ideaworks3d/marmalade/CameraCapture;->m_WaitingForFile:Z

    if-eqz v1, :cond_0

    .line 131
    invoke-static {v3}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDeviceYield(I)V

    goto :goto_0

    .line 133
    :cond_0
    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method private startCaptureImage()Ljava/io/File;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 72
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 73
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 74
    const-string v3, "title"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "New image "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget v5, Lcom/ideaworks3d/marmalade/CameraCapture;->videos:I

    add-int/lit8 v6, v5, 0x1

    sput v6, Lcom/ideaworks3d/marmalade/CameraCapture;->videos:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v3, "description"

    const-string v4, "Image captured by s3eCamera"

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    :try_start_0
    sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    sget-object v4, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 85
    :goto_0
    const-string v3, "output"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 86
    const-string v3, "android.intent.extra.videoQuality"

    invoke-virtual {v2, v3, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 87
    const-string v3, "Executing Camera Capture intent"

    invoke-static {v3}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 88
    sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v3, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->ExecuteIntent(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v2

    if-nez v2, :cond_0

    .line 90
    const-string v2, "Activity returned null, assuming cancelled"

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 91
    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v0, v1, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-object v0, v1

    .line 96
    :goto_1
    return-object v0

    .line 80
    :catch_0
    move-exception v0

    .line 82
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "/sdcard/image"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/ideaworks3d/marmalade/CameraCapture;->images:I

    add-int/lit8 v5, v4, 0x1

    sput v5, Lcom/ideaworks3d/marmalade/CameraCapture;->images:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    .line 94
    :cond_0
    const-string v1, "Retrieving image url"

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 95
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "_data"

    aput-object v3, v1, v2

    const-string v2, "_id"

    aput-object v2, v1, v7

    .line 96
    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/CameraCapture;->convertUriToFile(Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    goto :goto_1
.end method

.method private startCaptureVideo()Ljava/io/File;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 61
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 62
    const-string v1, "android.intent.extra.videoQuality"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 63
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->ExecuteIntent(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    .line 64
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_1

    .line 65
    :cond_0
    const/4 v0, 0x0

    .line 67
    :goto_0
    return-object v0

    .line 66
    :cond_1
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "_data"

    aput-object v3, v1, v2

    const-string v2, "_id"

    aput-object v2, v1, v4

    .line 67
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/CameraCapture;->convertUriToFile(Landroid/net/Uri;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public s3eCameraCaptureIsFormatSupported(I)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 35
    const/4 v1, 0x1

    if-eq v1, p1, :cond_0

    const/4 v1, 0x4

    if-eq v1, p1, :cond_0

    .line 42
    :goto_0
    return v0

    .line 39
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/CameraCapture;->CheckCamera()I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 41
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public s3eCameraCaptureToFile(I)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 46
    .line 47
    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    .line 49
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/CameraCapture;->startCaptureVideo()Ljava/io/File;

    move-result-object v1

    .line 55
    :goto_0
    if-nez v1, :cond_1

    .line 57
    :goto_1
    return-object v0

    .line 51
    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    .line 53
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/CameraCapture;->startCaptureImage()Ljava/io/File;

    move-result-object v1

    goto :goto_0

    .line 57
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "raw://"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method
