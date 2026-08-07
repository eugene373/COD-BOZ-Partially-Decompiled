package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 1 fields, 3 methods.

class FileLruCache_StreamHeader {
    private constructor()

    companion object {
    private val HEADER_VERSION: Int = 0

    @JvmStatic fun readHeader(p0: java.io.InputStream): org.json.JSONObject { return TODO("body: (Ljava/io/InputStream;)Lorg/json/JSONObject;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Ljava/io/InputStream;->read()I
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         move v2, v0
    //         move v3, v0
    //         :goto_1
    //         const/4 v4, 0x3
    //         if-ge v2, v4, :cond_2
    //         invoke-virtual {p0}, Ljava/io/InputStream;->read()I
    //         move-result v4
    //         const/4 v5, -0x1
    //         if-ne v4, v5, :cond_1
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v2, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         const-string v3, "readHeader: stream.read returned -1 while reading header size"
    //         invoke-static {v0, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         shl-int/lit8 v3, v3, 0x8
    //         and-int/lit16 v4, v4, 0xff
    //         add-int/2addr v3, v4
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_1
    //         :cond_2
    //         new-array v2, v3, [B
    //         :goto_2
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_4
    //         array-length v3, v2
    //         sub-int/2addr v3, v0
    //         invoke-virtual {p0, v2, v0, v3}, Ljava/io/InputStream;->read([BII)I
    //         move-result v3
    //         const/4 v4, 0x1
    //         if-ge v3, v4, :cond_3
    //         sget-object v3, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v4, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "readHeader: stream.read stopped at "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v5, " when expected "
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         array-length v2, v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v3, v4, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_3
    //         add-int/2addr v0, v3
    //         goto :goto_2
    //         :cond_4
    //         new-instance v0, Ljava/lang/String;
    //         invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V
    //         new-instance v2, Lorg/json/JSONTokener;
    //         invoke-direct {v2, v0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-virtual {v2}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v2, v0, Lorg/json/JSONObject;
    //         if-nez v2, :cond_5
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v3, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "readHeader: expected JSONObject, got "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v3, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         move-object v0, v1
    //         goto/16 :goto_0
    //         :cond_5
    //         check-cast v0, Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    */

    @JvmStatic fun writeHeader(p0: java.io.OutputStream, p1: org.json.JSONObject) { /* TODO(body): (Ljava/io/OutputStream;Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
    //         array-length v1, v0
    //         shr-int/lit8 v1, v1, 0x10
    //         and-int/lit16 v1, v1, 0xff
    //         invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
    //         array-length v1, v0
    //         shr-int/lit8 v1, v1, 0x8
    //         and-int/lit16 v1, v1, 0xff
    //         invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
    //         array-length v1, v0
    //         shr-int/lit8 v1, v1, 0x0
    //         and-int/lit16 v1, v1, 0xff
    //         invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V
    //         invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V
    //         return-void
    */

    }
}
