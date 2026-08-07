package com.android.vending.expansion.zipfile

// Auto-emitted from smali source: ZipResourceFile.java.
// 10 fields, 7 methods.

class ZipResourceFile_ZipEntryRO {
    public var mCRC32: Long
    public var mCompressedLength: Long
    public val mFile: java.io.File
    public val mFileName: String
    public var mLocalHdrOffset: Long
    public var mMethod: Int
    public var mOffset: Long
    public var mUncompressedLength: Long
    public var mWhenModified: Long
    public val mZipFileName: String

    public constructor(p0: String, p1: java.io.File, p2: String)

    public fun getAssetFileDescriptor(): android.content.res.AssetFileDescriptor { return TODO("body: ()Landroid/content/res/AssetFileDescriptor;") }
    /*
    //         .locals 6
    //         iget v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mMethod:I
    //         if-nez v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFile:Ljava/io/File;
    //         const/high16 v1, 0x10000000
    //         invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         move-result-object v1
    //         new-instance v0, Landroid/content/res/AssetFileDescriptor;
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getOffset()J
    //         move-result-wide v2
    //         iget-wide v4, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mUncompressedLength:J
    //         invoke-direct/range {v0 .. v5}, Landroid/content/res/AssetFileDescriptor;-><init>(Landroid/os/ParcelFileDescriptor;JJ)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getOffset(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mOffset:J
    //         return-wide v0
    */

    public fun getZipFile(): java.io.File { return TODO("body: ()Ljava/io/File;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFile:Ljava/io/File;
    //         return-object v0
    */

    public fun getZipFileName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mZipFileName:Ljava/lang/String;
    //         return-object v0
    */

    public fun isUncompressed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mMethod:I
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setOffsetFromFile(p0: java.io.RandomAccessFile, p1: java.nio.ByteBuffer) { /* TODO(body): (Ljava/io/RandomAccessFile;Ljava/nio/ByteBuffer;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const v4, 0xffff
    //         iget-wide v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mLocalHdrOffset:J
    //         :try_start_0
    //         invoke-virtual {p1, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V
    //         invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B
    //         move-result-object v2
    //         invoke-virtual {p1, v2}, Ljava/io/RandomAccessFile;->readFully([B)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->getInt(I)I
    //         move-result v2
    //         const v3, 0x4034b50
    //         if-eq v2, v3, :cond_0
    //         const-string v0, "zipro"
    //         const-string v1, "didn\'t find signature at start of lfh"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Ljava/io/IOException;
    //         invoke-direct {v0}, Ljava/io/IOException;-><init>()V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/16 v2, 0x1a
    //         :try_start_1
    //         invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->getShort(I)S
    //         move-result v2
    //         and-int/2addr v2, v4
    //         const/16 v3, 0x1c
    //         invoke-virtual {p2, v3}, Ljava/nio/ByteBuffer;->getShort(I)S
    //         move-result v3
    //         and-int/2addr v3, v4
    //         const-wide/16 v4, 0x1e
    //         add-long/2addr v0, v4
    //         int-to-long v4, v2
    //         add-long/2addr v0, v4
    //         int-to-long v2, v3
    //         add-long/2addr v0, v2
    //         iput-wide v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mOffset:J
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    //         goto :goto_0
    */

}
