package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 4 fields, 2 methods.

open class FileLruCache_Anon1: com.facebook.internal.FileLruCache.StreamCloseCallback {
    val this$0: com.facebook.internal.FileLruCache
    val val$buffer: java.io.File
    val val$bufferFileCreateTime: Long
    val val$key: String

    constructor(p0: com.facebook.internal.FileLruCache, p1: Long, p2: java.io.File, p3: String)

    public fun onClose() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/facebook/internal/FileLruCache$1;->val$bufferFileCreateTime:J
    //         iget-object v2, p0, Lcom/facebook/internal/FileLruCache$1;->this$0:Lcom/facebook/internal/FileLruCache;
    //         invoke-static {v2}, Lcom/facebook/internal/FileLruCache;->access$000(Lcom/facebook/internal/FileLruCache;)Ljava/util/concurrent/atomic/AtomicLong;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J
    //         move-result-wide v2
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$1;->val$buffer:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$1;->this$0:Lcom/facebook/internal/FileLruCache;
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache$1;->val$key:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/internal/FileLruCache$1;->val$buffer:Ljava/io/File;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/FileLruCache;->access$100(Lcom/facebook/internal/FileLruCache;Ljava/lang/String;Ljava/io/File;)V
    //         goto :goto_0
    */

}
