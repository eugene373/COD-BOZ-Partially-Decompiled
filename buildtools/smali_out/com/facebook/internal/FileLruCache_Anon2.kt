package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 2 fields, 2 methods.

open class FileLruCache_Anon2: Runnable {
    val this$0: com.facebook.internal.FileLruCache
    val val$filesToDelete: Array<java.io.File>

    constructor(p0: com.facebook.internal.FileLruCache, p1: Array<java.io.File>)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache$2;->val$filesToDelete:[Ljava/io/File;
    //         array-length v2, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         aget-object v3, v1, v0
    //         invoke-virtual {v3}, Ljava/io/File;->delete()Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

}
