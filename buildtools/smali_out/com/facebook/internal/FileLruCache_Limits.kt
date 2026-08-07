package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 2 fields, 5 methods.

class FileLruCache_Limits {
    private var byteCount: Int
    private var fileCount: Int

    public constructor()

    fun getByteCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/internal/FileLruCache$Limits;->byteCount:I
    //         return v0
    */

    fun getFileCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/internal/FileLruCache$Limits;->fileCount:I
    //         return v0
    */

    fun setByteCount(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         if-gez p1, :cond_0
    //         new-instance v0, Ljava/security/InvalidParameterException;
    //         const-string v1, "Cache byte-count limit must be >= 0"
    //         invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput p1, p0, Lcom/facebook/internal/FileLruCache$Limits;->byteCount:I
    //         return-void
    */

    fun setFileCount(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         if-gez p1, :cond_0
    //         new-instance v0, Ljava/security/InvalidParameterException;
    //         const-string v1, "Cache file count limit must be >= 0"
    //         invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput p1, p0, Lcom/facebook/internal/FileLruCache$Limits;->fileCount:I
    //         return-void
    */

}
