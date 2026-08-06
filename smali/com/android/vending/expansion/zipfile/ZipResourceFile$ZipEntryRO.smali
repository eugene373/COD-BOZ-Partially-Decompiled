.class public final Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
.super Ljava/lang/Object;
.source "ZipResourceFile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/zipfile/ZipResourceFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ZipEntryRO"
.end annotation


# instance fields
.field public mCRC32:J

.field public mCompressedLength:J

.field public final mFile:Ljava/io/File;

.field public final mFileName:Ljava/lang/String;

.field public mLocalHdrOffset:J

.field public mMethod:I

.field public mOffset:J

.field public mUncompressedLength:J

.field public mWhenModified:J

.field public final mZipFileName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mOffset:J

    .line 102
    iput-object p3, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFileName:Ljava/lang/String;

    .line 103
    iput-object p1, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mZipFileName:Ljava/lang/String;

    .line 104
    iput-object p2, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFile:Ljava/io/File;

    .line 105
    return-void
.end method


# virtual methods
.method public getAssetFileDescriptor()Landroid/content/res/AssetFileDescriptor;
    .locals 6

    .prologue
    .line 160
    iget v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mMethod:I

    if-nez v0, :cond_0

    .line 163
    :try_start_0
    iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFile:Ljava/io/File;

    const/high16 v1, 0x10000000

    invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    .line 164
    new-instance v0, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getOffset()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mUncompressedLength:J

    invoke-direct/range {v0 .. v5}, Landroid/content/res/AssetFileDescriptor;-><init>(Landroid/os/ParcelFileDescriptor;JJ)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    :goto_0
    return-object v0

    .line 165
    :catch_0
    move-exception v0

    .line 167
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 170
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getOffset()J
    .locals 2

    .prologue
    .line 147
    iget-wide v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mOffset:J

    return-wide v0
.end method

.method public getZipFile()Ljava/io/File;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFile:Ljava/io/File;

    return-object v0
.end method

.method public getZipFileName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mZipFileName:Ljava/lang/String;

    return-object v0
.end method

.method public isUncompressed()Z
    .locals 1

    .prologue
    .line 156
    iget v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mMethod:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setOffsetFromFile(Ljava/io/RandomAccessFile;Ljava/nio/ByteBuffer;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const v4, 0xffff

    .line 122
    iget-wide v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mLocalHdrOffset:J

    .line 124
    :try_start_0
    invoke-virtual {p1, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 125
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 126
    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    const v3, 0x4034b50

    if-eq v2, v3, :cond_0

    .line 127
    const-string v0, "zipro"

    const-string v1, "didn\'t find signature at start of lfh"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 133
    :catch_0
    move-exception v0

    .line 134
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 138
    :goto_0
    return-void

    .line 130
    :cond_0
    const/16 v2, 0x1a

    :try_start_1
    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v2

    and-int/2addr v2, v4

    .line 131
    const/16 v3, 0x1c

    invoke-virtual {p2, v3}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v3

    and-int/2addr v3, v4

    .line 132
    const-wide/16 v4, 0x1e

    add-long/2addr v0, v4

    int-to-long v4, v2

    add-long/2addr v0, v4

    int-to-long v2, v3

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mOffset:J
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 135
    :catch_1
    move-exception v0

    .line 136
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
