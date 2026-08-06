.class Lcom/ideaworks3d/studio/IsDevice;
.super Ljava/lang/Object;
.source "IsDevice.java"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final TAG:Ljava/lang/String; = "IsDevice"

.field public static s_Instance:Lcom/ideaworks3d/studio/IsDevice;


# instance fields
.field public TabletThreshold:I

.field final eGeneric:I

.field final eSmartphone:I

.field final eTablet:I

.field private m_CurrentDirectory:Ljava/io/File;

.field public m_DeviceMetrics:Landroid/util/DisplayMetrics;

.field private m_IsActivated:Z

.field m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

.field private m_StatFs:Landroid/os/StatFs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    sput-object v0, Lcom/ideaworks3d/studio/IsDevice;->s_Instance:Lcom/ideaworks3d/studio/IsDevice;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/studio/IsDevice;->eGeneric:I

    .line 43
    const/4 v0, 0x2

    iput v0, p0, Lcom/ideaworks3d/studio/IsDevice;->eSmartphone:I

    .line 44
    const/4 v0, 0x3

    iput v0, p0, Lcom/ideaworks3d/studio/IsDevice;->eTablet:I

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_IsActivated:Z

    .line 49
    const/16 v0, 0x1cd

    iput v0, p0, Lcom/ideaworks3d/studio/IsDevice;->TabletThreshold:I

    .line 50
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;

    .line 54
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;

    .line 55
    new-instance v0, Landroid/os/StatFs;

    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    .line 125
    sput-object p0, Lcom/ideaworks3d/studio/IsDevice;->s_Instance:Lcom/ideaworks3d/studio/IsDevice;

    .line 126
    return-void
.end method

.method public static declared-synchronized GetInstance()Lcom/ideaworks3d/studio/IsDevice;
    .locals 2

    .prologue
    .line 135
    const-class v1, Lcom/ideaworks3d/studio/IsDevice;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/ideaworks3d/studio/IsDevice;->s_Instance:Lcom/ideaworks3d/studio/IsDevice;

    if-nez v0, :cond_0

    .line 136
    new-instance v0, Lcom/ideaworks3d/studio/IsDevice;

    invoke-direct {v0}, Lcom/ideaworks3d/studio/IsDevice;-><init>()V

    sput-object v0, Lcom/ideaworks3d/studio/IsDevice;->s_Instance:Lcom/ideaworks3d/studio/IsDevice;

    .line 138
    :cond_0
    sget-object v0, Lcom/ideaworks3d/studio/IsDevice;->s_Instance:Lcom/ideaworks3d/studio/IsDevice;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 135
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public Activate()V
    .locals 1

    .prologue
    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_IsActivated:Z

    .line 149
    return-void
.end method

.method public GetExpansionPath()Ljava/lang/String;
    .locals 4

    .prologue
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-static {v1}, Lcom/android/vending/expansion/downloader/Helpers;->getSaveFilePath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 116
    const-string v1, "IsDevice"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expansion Path: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    return-object v0
.end method

.method public GetMainExpansionFileSize()J
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J

    .line 81
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public GetMainExpansionFilename()Ljava/lang/String;
    .locals 4

    .prologue
    .line 86
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    .line 89
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 90
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "main."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".obb"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 93
    :goto_0
    return-object v0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    const-string v0, ""

    goto :goto_0
.end method

.method public GetMainExpansionUri()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;

    .line 73
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public IsActivated()Z
    .locals 1

    .prologue
    .line 143
    iget-boolean v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_IsActivated:Z

    return v0
.end method

.method public IsDeviceGetAbsolutePath()Ljava/lang/String;
    .locals 4

    .prologue
    .line 187
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/Android/data/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 188
    const-string v1, "IsDevice"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AbsolutePath returning: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    return-object v0
.end method

.method public IsDeviceGetAvailableBlocks()I
    .locals 2

    .prologue
    .line 194
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    return v0
.end method

.method public IsDeviceGetBlockCount()I
    .locals 2

    .prologue
    .line 200
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    return v0
.end method

.method public IsDeviceGetBlockSize()I
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    return v0
.end method

.method public IsDeviceGetDisplayType()I
    .locals 3

    .prologue
    .line 159
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 160
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->xdpi:F

    div-float/2addr v0, v1

    .line 161
    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/ideaworks3d/studio/IsDevice;->m_DeviceMetrics:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->ydpi:F

    div-float/2addr v1, v2

    .line 162
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 165
    iget v1, p0, Lcom/ideaworks3d/studio/IsDevice;->TabletThreshold:I

    if-lt v0, v1, :cond_0

    .line 167
    const/4 v0, 0x3

    .line 175
    :goto_0
    return v0

    .line 169
    :cond_0
    if-lez v0, :cond_1

    .line 171
    const/4 v0, 0x2

    goto :goto_0

    .line 175
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public IsDeviceGetExternalResources(II)[Ljava/lang/String;
    .locals 3

    .prologue
    .line 223
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "stub"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "stub"

    aput-object v2, v0, v1

    .line 224
    return-object v0
.end method

.method public IsDeviceGetFreeBlocks()I
    .locals 2

    .prologue
    .line 212
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    iget-object v1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_CurrentDirectory:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V

    .line 213
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDevice;->m_StatFs:Landroid/os/StatFs;

    invoke-virtual {v0}, Landroid/os/StatFs;->getFreeBlocks()I

    move-result v0

    return v0
.end method

.method public IsDeviceGetFreeStorage()I
    .locals 1

    .prologue
    .line 182
    const/4 v0, -0x1

    return v0
.end method

.method public IsDeviceGetMainExpansionFileSize()I
    .locals 8

    .prologue
    .line 101
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/ideaworks3d/studio/IsDevice;->GetExpansionPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/studio/IsDevice;->GetMainExpansionFilename()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 102
    const-string v1, "IsDevice"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IsDeviceGetMainExpansionFileSize value "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    const/4 v0, 0x0

    .line 109
    :goto_0
    return v0

    .line 108
    :cond_0
    const-string v0, "IsDevice"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IsDeviceGetMainExpansionFileSize size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v4

    const-wide/16 v6, 0x400

    div-long/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v0, v0

    div-int/lit16 v0, v0, 0x400

    goto :goto_0
.end method

.method public native IsDeviceKeyCallback(I)V
.end method

.method public IsDeviceSetPublicKey(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 219
    return-void
.end method

.method public IsDeviceSetTabletThreshold(I)I
    .locals 1

    .prologue
    .line 153
    iput p1, p0, Lcom/ideaworks3d/studio/IsDevice;->TabletThreshold:I

    .line 154
    iget v0, p0, Lcom/ideaworks3d/studio/IsDevice;->TabletThreshold:I

    return v0
.end method

.method public SetDownloadInfo(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/ideaworks3d/studio/IsDevice;->m_MainExpansion:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    .line 66
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 129
    new-instance v0, Ljava/lang/CloneNotSupportedException;

    invoke-direct {v0}, Ljava/lang/CloneNotSupportedException;-><init>()V

    throw v0
.end method
