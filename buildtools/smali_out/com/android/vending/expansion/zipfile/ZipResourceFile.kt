package com.android.vending.expansion.zipfile

// Auto-emitted from smali source: ZipResourceFile.java.
// 30 fields, 9 methods.

open class ZipResourceFile {
    private var mHashMap: java.util.HashMap
    var mLEByteBuffer: java.nio.ByteBuffer
    public var mZipFiles: java.util.HashMap

    public constructor(p0: String)

    fun addPatchFile(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 20
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v10, Ljava/io/File;
    //         move-object/from16 v0, p1
    //         invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         new-instance v11, Ljava/io/RandomAccessFile;
    //         const-string v2, "r"
    //         invoke-direct {v11, v10, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         invoke-virtual {v11}, Ljava/io/RandomAccessFile;->length()J
    //         move-result-wide v8
    //         const-wide/16 v2, 0x16
    //         cmp-long v2, v8, v2
    //         if-gez v2, :cond_0
    //         new-instance v2, Ljava/io/IOException;
    //         invoke-direct {v2}, Ljava/io/IOException;-><init>()V
    //         throw v2
    //         :cond_0
    //         const-wide/32 v2, 0x10015
    //         cmp-long v4, v2, v8
    //         if-lez v4, :cond_1
    //         move-wide v2, v8
    //         :cond_1
    //         const-wide/16 v4, 0x0
    //         invoke-virtual {v11, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V
    //         invoke-static {v11}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->read4LE(Ljava/io/RandomAccessFile;)I
    //         move-result v4
    //         const v5, 0x6054b50
    //         if-ne v4, v5, :cond_2
    //         const-string v2, "zipro"
    //         const-string v3, "Found Zip archive, but it looks empty"
    //         invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v2, Ljava/io/IOException;
    //         invoke-direct {v2}, Ljava/io/IOException;-><init>()V
    //         throw v2
    //         :cond_2
    //         const v5, 0x4034b50
    //         if-eq v4, v5, :cond_3
    //         const-string v2, "zipro"
    //         const-string v3, "Not a Zip archive"
    //         invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v2, Ljava/io/IOException;
    //         invoke-direct {v2}, Ljava/io/IOException;-><init>()V
    //         throw v2
    //         :cond_3
    //         sub-long v4, v8, v2
    //         invoke-virtual {v11, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V
    //         long-to-int v2, v2
    //         invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B
    //         move-result-object v4
    //         invoke-virtual {v11, v4}, Ljava/io/RandomAccessFile;->readFully([B)V
    //         sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;
    //         invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //         array-length v2, v4
    //         add-int/lit8 v2, v2, -0x16
    //         :goto_0
    //         if-ltz v2, :cond_4
    //         aget-byte v5, v4, v2
    //         const/16 v6, 0x50
    //         if-ne v5, v6, :cond_6
    //         invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->getInt(I)I
    //         move-result v5
    //         const v6, 0x6054b50
    //         if-ne v5, v6, :cond_6
    //         :cond_4
    //         if-gez v2, :cond_5
    //         const-string v4, "zipro"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Zip: EOCD not found, "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         move-object/from16 v0, p1
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v6, " is not zip"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_5
    //         add-int/lit8 v4, v2, 0x8
    //         invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->getShort(I)S
    //         move-result v12
    //         add-int/lit8 v4, v2, 0xc
    //         invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->getInt(I)I
    //         move-result v4
    //         int-to-long v4, v4
    //         const-wide v6, 0xffffffffL
    //         and-long/2addr v6, v4
    //         add-int/lit8 v4, v2, 0x10
    //         invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->getInt(I)I
    //         move-result v3
    //         int-to-long v4, v3
    //         const-wide v14, 0xffffffffL
    //         and-long/2addr v4, v14
    //         add-long v14, v4, v6
    //         cmp-long v3, v14, v8
    //         if-lez v3, :cond_7
    //         const-string v3, "zipro"
    //         new-instance v8, Ljava/lang/StringBuilder;
    //         invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v9, "bad offsets (dir "
    //         invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v8
    //         invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ", size "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ", eocd "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v4, ")"
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v2, Ljava/io/IOException;
    //         invoke-direct {v2}, Ljava/io/IOException;-><init>()V
    //         throw v2
    //         :cond_6
    //         add-int/lit8 v2, v2, -0x1
    //         goto/16 :goto_0
    //         :cond_7
    //         if-nez v12, :cond_8
    //         const-string v2, "zipro"
    //         const-string v3, "empty archive?"
    //         invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v2, Ljava/io/IOException;
    //         invoke-direct {v2}, Ljava/io/IOException;-><init>()V
    //         throw v2
    //         :cond_8
    //         invoke-virtual {v11}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
    //         move-result-object v2
    //         sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
    //         invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //         move-result-object v4
    //         sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;
    //         invoke-virtual {v4, v2}, Ljava/nio/MappedByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //         const v2, 0xffff
    //         new-array v5, v2, [B
    //         const/4 v3, 0x0
    //         const/16 v2, 0x1e
    //         invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
    //         move-result-object v6
    //         sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;
    //         invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //         const/4 v2, 0x0
    //         :goto_1
    //         if-ge v2, v12, :cond_a
    //         invoke-virtual {v4, v3}, Ljava/nio/MappedByteBuffer;->getInt(I)I
    //         move-result v7
    //         const v8, 0x2014b50
    //         if-eq v7, v8, :cond_9
    //         const-string v2, "zipro"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Missed a central dir sig (at "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ")"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v2, Ljava/io/IOException;
    //         invoke-direct {v2}, Ljava/io/IOException;-><init>()V
    //         throw v2
    //         :cond_9
    //         add-int/lit8 v7, v3, 0x1c
    //         invoke-virtual {v4, v7}, Ljava/nio/MappedByteBuffer;->getShort(I)S
    //         move-result v7
    //         const v8, 0xffff
    //         and-int/2addr v7, v8
    //         add-int/lit8 v8, v3, 0x1e
    //         invoke-virtual {v4, v8}, Ljava/nio/MappedByteBuffer;->getShort(I)S
    //         move-result v8
    //         const v9, 0xffff
    //         and-int/2addr v8, v9
    //         add-int/lit8 v9, v3, 0x20
    //         invoke-virtual {v4, v9}, Ljava/nio/MappedByteBuffer;->getShort(I)S
    //         move-result v9
    //         const v13, 0xffff
    //         and-int/2addr v9, v13
    //         add-int/lit8 v13, v3, 0x2e
    //         invoke-virtual {v4, v13}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;
    //         const/4 v13, 0x0
    //         invoke-virtual {v4, v5, v13, v7}, Ljava/nio/MappedByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    //         const/4 v13, 0x0
    //         invoke-virtual {v4, v13}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;
    //         new-instance v13, Ljava/lang/String;
    //         const/4 v14, 0x0
    //         invoke-direct {v13, v5, v14, v7}, Ljava/lang/String;-><init>([BII)V
    //         new-instance v14, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         move-object/from16 v0, p1
    //         invoke-direct {v14, v0, v10, v13}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;-><init>(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
    //         add-int/lit8 v15, v3, 0xa
    //         invoke-virtual {v4, v15}, Ljava/nio/MappedByteBuffer;->getShort(I)S
    //         move-result v15
    //         const v16, 0xffff
    //         and-int v15, v15, v16
    //         iput v15, v14, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mMethod:I
    //         add-int/lit8 v15, v3, 0xc
    //         invoke-virtual {v4, v15}, Ljava/nio/MappedByteBuffer;->getInt(I)I
    //         move-result v15
    //         int-to-long v0, v15
    //         move-wide/from16 v16, v0
    //         const-wide v18, 0xffffffffL
    //         and-long v16, v16, v18
    //         move-wide/from16 v0, v16
    //         iput-wide v0, v14, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mWhenModified:J
    //         add-int/lit8 v15, v3, 0x10
    //         invoke-virtual {v4, v15}, Ljava/nio/MappedByteBuffer;->getLong(I)J
    //         move-result-wide v16
    //         const-wide v18, 0xffffffffL
    //         and-long v16, v16, v18
    //         move-wide/from16 v0, v16
    //         iput-wide v0, v14, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mCRC32:J
    //         add-int/lit8 v15, v3, 0x14
    //         invoke-virtual {v4, v15}, Ljava/nio/MappedByteBuffer;->getLong(I)J
    //         move-result-wide v16
    //         const-wide v18, 0xffffffffL
    //         and-long v16, v16, v18
    //         move-wide/from16 v0, v16
    //         iput-wide v0, v14, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mCompressedLength:J
    //         add-int/lit8 v15, v3, 0x18
    //         invoke-virtual {v4, v15}, Ljava/nio/MappedByteBuffer;->getLong(I)J
    //         move-result-wide v16
    //         const-wide v18, 0xffffffffL
    //         and-long v16, v16, v18
    //         move-wide/from16 v0, v16
    //         iput-wide v0, v14, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mUncompressedLength:J
    //         add-int/lit8 v15, v3, 0x2a
    //         invoke-virtual {v4, v15}, Ljava/nio/MappedByteBuffer;->getInt(I)I
    //         move-result v15
    //         int-to-long v0, v15
    //         move-wide/from16 v16, v0
    //         const-wide v18, 0xffffffffL
    //         and-long v16, v16, v18
    //         move-wide/from16 v0, v16
    //         iput-wide v0, v14, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mLocalHdrOffset:J
    //         invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
    //         invoke-virtual {v14, v11, v6}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->setOffsetFromFile(Ljava/io/RandomAccessFile;Ljava/nio/ByteBuffer;)V
    //         move-object/from16 v0, p0
    //         iget-object v15, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->mHashMap:Ljava/util/HashMap;
    //         invoke-virtual {v15, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         add-int/lit8 v7, v7, 0x2e
    //         add-int/2addr v7, v8
    //         add-int/2addr v7, v9
    //         add-int/2addr v3, v7
    //         add-int/lit8 v2, v2, 0x1
    //         goto/16 :goto_1
    //         :cond_a
    //         return-void
    */

    public fun getAllEntries(): Array<com.android.vending.expansion.zipfile.ZipResourceFile.ZipEntryRO> { return TODO("body: ()[Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->mHashMap:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->size()I
    //         move-result v1
    //         new-array v1, v1, [Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         return-object v0
    */

    public fun getAssetFileDescriptor(p0: String): android.content.res.AssetFileDescriptor { return TODO("body: (Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->mHashMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getAssetFileDescriptor()Landroid/content/res/AssetFileDescriptor;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun getEntriesAt(p0: String): Array<com.android.vending.expansion.zipfile.ZipResourceFile.ZipEntryRO> { return TODO("body: (Ljava/lang/String;)[Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;") }
    /*
    //         .locals 7
    //         new-instance v1, Ljava/util/Vector;
    //         invoke-direct {v1}, Ljava/util/Vector;-><init>()V
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->mHashMap:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         if-nez p1, :cond_0
    //         const-string p1, ""
    //         :cond_0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_1
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         iget-object v4, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v4, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         const/4 v4, -0x1
    //         iget-object v5, v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFileName:Ljava/lang/String;
    //         const/16 v6, 0x2f
    //         invoke-virtual {v5, v6, v2}, Ljava/lang/String;->indexOf(II)I
    //         move-result v5
    //         if-ne v4, v5, :cond_1
    //         invoke-virtual {v1, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {v1}, Ljava/util/Vector;->size()I
    //         move-result v0
    //         new-array v0, v0, [Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         invoke-virtual {v1, v0}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         return-object v0
    */

    public fun getInputStream(p0: String): java.io.InputStream { return TODO("body: (Ljava/lang/String;)Ljava/io/InputStream;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->mHashMap:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         if-eqz v0, :cond_2
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->isUncompressed()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getAssetFileDescriptor()Landroid/content/res/AssetFileDescriptor;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->mZipFiles:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getZipFile()Ljava/io/File;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/zip/ZipFile;
    //         if-nez v1, :cond_1
    //         new-instance v1, Ljava/util/zip/ZipFile;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getZipFile()Ljava/io/File;
    //         move-result-object v2
    //         const/4 v3, 0x1
    //         invoke-direct {v1, v2, v3}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;I)V
    //         iget-object v2, p0, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->mZipFiles:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getZipFile()Ljava/io/File;
    //         move-result-object v0
    //         invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         invoke-virtual {v1, p1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {v1, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    val LOGV: Boolean = false
    val LOG_TAG: String = "zipro"
    val kCDECRC: Int = 0x10
    val kCDECommentLen: Int = 0x20
    val kCDECompLen: Int = 0x14
    val kCDEExtraLen: Int = 0x1e
    val kCDELen: Int = 0x2e
    val kCDELocalOffset: Int = 0x2a
    val kCDEMethod: Int = 0xa
    val kCDEModWhen: Int = 0xc
    val kCDENameLen: Int = 0x1c
    val kCDESignature: Int = 0x2014b50
    val kCDEUncompLen: Int = 0x18
    val kCompressDeflated: Int = 0x8
    val kCompressStored: Int = 0x0
    val kEOCDFileOffset: Int = 0x10
    val kEOCDLen: Int = 0x16
    val kEOCDNumEntries: Int = 0x8
    val kEOCDSignature: Int = 0x6054b50
    val kEOCDSize: Int = 0xc
    val kLFHExtraLen: Int = 0x1c
    val kLFHLen: Int = 0x1e
    val kLFHNameLen: Int = 0x1a
    val kLFHSignature: Int = 0x4034b50
    val kMaxCommentLen: Int = 0xffff
    val kMaxEOCDSearch: Int = 0x10015
    val kZipEntryAdj: Int = 0x2710

    private @JvmStatic fun read4LE(p0: java.io.RandomAccessFile): Int { return TODO("body: (Ljava/io/RandomAccessFile;)I") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/EOFException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readInt()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->swapEndian(I)I
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun swapEndian(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         and-int/lit16 v0, p0, 0xff
    //         shl-int/lit8 v0, v0, 0x18
    //         const v1, 0xff00
    //         and-int/2addr v1, p0
    //         shl-int/lit8 v1, v1, 0x8
    //         add-int/2addr v0, v1
    //         const/high16 v1, 0xff0000
    //         and-int/2addr v1, p0
    //         ushr-int/lit8 v1, v1, 0x8
    //         add-int/2addr v0, v1
    //         ushr-int/lit8 v1, p0, 0x18
    //         and-int/lit16 v1, v1, 0xff
    //         add-int/2addr v0, v1
    //         return v0
    */

    private @JvmStatic fun swapEndian(p0: Short): Int { return TODO("body: (S)I") }
    /*
    //         .locals 2
    //         and-int/lit16 v0, p0, 0xff
    //         shl-int/lit8 v0, v0, 0x8
    //         const v1, 0xff00
    //         and-int/2addr v1, p0
    //         ushr-int/lit8 v1, v1, 0x8
    //         or-int/2addr v0, v1
    //         return v0
    */

    }
}
