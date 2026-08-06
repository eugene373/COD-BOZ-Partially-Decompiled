.class public Lcom/ideaworks3d/studio/IsDeviceActivity;
.super Lcom/ideaworks3d/marmalade/LoaderActivity;
.source "IsDeviceActivity.java"


# static fields
.field private static final SALT:[B

.field public static final STATUS_SUCCESS:I = 0xc8

.field private static m_Activity:Lcom/ideaworks3d/studio/IsDeviceActivity;


# instance fields
.field private final NO_FILE:Ljava/lang/String;

.field private final TAG:Ljava/lang/String;

.field private mAPKExtensionFile:Lcom/android/vending/expansion/zipfile/ZipResourceFile;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 81
    const/16 v0, 0x14

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ideaworks3d/studio/IsDeviceActivity;->SALT:[B

    return-void

    :array_0
    .array-data 1
        -0x2et
        0x41t
        0x1et
        -0x80t
        -0x67t
        -0x39t
        0x4at
        -0x40t
        0x33t
        0x58t
        -0x5ft
        -0x2dt
        0x4dt
        -0x75t
        -0x24t
        -0x71t
        -0xbt
        0x20t
        -0x40t
        0x59t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 76
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;-><init>()V

    .line 85
    new-instance v0, Ljava/lang/String;

    const-string v1, "IsDeviceActivity"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    .line 86
    iput-object v2, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->NO_FILE:Ljava/lang/String;

    .line 90
    iput-object v2, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->mAPKExtensionFile:Lcom/android/vending/expansion/zipfile/ZipResourceFile;

    return-void
.end method


# virtual methods
.method public handleFileUpdated(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;ILjava/lang/String;J)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 182
    invoke-virtual {p1, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloadInfoByFileName(Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    move-result-object v2

    .line 183
    if-eqz v2, :cond_2

    .line 184
    iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;

    .line 186
    if-eqz v2, :cond_2

    .line 187
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 200
    :goto_0
    return v1

    .line 192
    :cond_0
    invoke-static {p0, v2}, Lcom/android/vending/expansion/downloader/Helpers;->generateSaveFileName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 193
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 195
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 197
    :cond_1
    iget-object v2, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    const-string v3, "Deleting Partial Download file"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    :cond_2
    invoke-static {p0, p3, p4, p5, v0}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public hasActiveInternetConnection(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 127
    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/studio/IsDeviceActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 128
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    const/4 v0, 0x1

    .line 133
    :goto_0
    return v0

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    const-string v1, "No network available!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 95
    invoke-super {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onCreate(Landroid/os/Bundle;)V

    .line 96
    sput-object p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->m_Activity:Lcom/ideaworks3d/studio/IsDeviceActivity;

    .line 97
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 205
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onDestroy()V

    .line 206
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    .line 154
    const/16 v0, 0x1a

    if-eq v0, p1, :cond_0

    const/4 v0, 0x3

    if-ne v0, p1, :cond_1

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onKeyDown Recieved: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/studio/IsDevice;->IsActivated()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/studio/IsDevice;->IsDeviceKeyCallback(I)V

    .line 164
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    const-string v1, "onPause"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onPause()V

    .line 109
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    const-string v1, "onResume"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onResume()V

    .line 116
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 101
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onStart()V

    .line 102
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    const-string v1, "onStart"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    return-void
.end method

.method protected onUserLeaveHint()V
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/ideaworks3d/studio/IsDeviceActivity;->TAG:Ljava/lang/String;

    const-string v1, "onUserLeaveHint"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onUserLeaveHint()V

    .line 123
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .prologue
    .line 140
    if-nez p1, :cond_0

    invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/studio/IsDevice;->IsActivated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-static {}, Lcom/ideaworks3d/studio/IsDevice;->GetInstance()Lcom/ideaworks3d/studio/IsDevice;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/studio/IsDevice;->IsDeviceKeyCallback(I)V

    .line 144
    :cond_0
    return-void
.end method
