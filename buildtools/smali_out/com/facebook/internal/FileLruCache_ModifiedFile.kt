package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 4 fields, 7 methods.

class FileLruCache_ModifiedFile: Comparable {
    private val file: java.io.File
    private val modified: Long

    constructor(p0: java.io.File)

    public fun compareTo(p0: com.facebook.internal.FileLruCache.ModifiedFile): Int { return TODO("body: (Lcom/facebook/internal/FileLruCache$ModifiedFile;)I") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getModified()J
    //         move-result-wide v0
    //         invoke-virtual {p1}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getModified()J
    //         move-result-wide v2
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_0
    //         const/4 v0, -0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getModified()J
    //         move-result-wide v0
    //         invoke-virtual {p1}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getModified()J
    //         move-result-wide v2
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getFile()Ljava/io/File;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getFile()Ljava/io/File;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/io/File;->compareTo(Ljava/io/File;)I
    //         move-result v0
    //         goto :goto_0
    */

    public fun compareTo(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Lcom/facebook/internal/FileLruCache$ModifiedFile;
    //         invoke-virtual {p0, p1}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->compareTo(Lcom/facebook/internal/FileLruCache$ModifiedFile;)I
    //         move-result v0
    //         return v0
    */

    public fun equals(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p1, Lcom/facebook/internal/FileLruCache$ModifiedFile;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Lcom/facebook/internal/FileLruCache$ModifiedFile;
    //         invoke-virtual {p0, p1}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->compareTo(Lcom/facebook/internal/FileLruCache$ModifiedFile;)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun getFile(): java.io.File { return TODO("body: ()Ljava/io/File;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$ModifiedFile;->file:Ljava/io/File;
    //         return-object v0
    */

    fun getModified(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/facebook/internal/FileLruCache$ModifiedFile;->modified:J
    //         return-wide v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$ModifiedFile;->file:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->hashCode()I
    //         move-result v0
    //         add-int/lit16 v0, v0, 0x431
    //         mul-int/lit8 v0, v0, 0x25
    //         iget-wide v2, p0, Lcom/facebook/internal/FileLruCache$ModifiedFile;->modified:J
    //         const-wide/32 v4, 0x7fffffff
    //         rem-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         return v0
    */

    companion object {
    private val HASH_MULTIPLIER: Int = 0x25
    private val HASH_SEED: Int = 0x1d
    }
}
