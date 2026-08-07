package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 3 fields, 3 methods.

open class LikeActionController_MRUCacheWorkItem: Runnable {
    private var cacheItem: String
    private var shouldTrim: Boolean

    constructor(p0: String, p1: Boolean)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->cacheItem:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->mruCachedItems:Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->cacheItem:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         sget-object v0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->mruCachedItems:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->cacheItem:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->shouldTrim:Z
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->mruCachedItems:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         const/16 v1, 0x80
    //         if-lt v0, v1, :cond_1
    //         const/16 v1, 0x40
    //         :goto_0
    //         sget-object v0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->mruCachedItems:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_1
    //         sget-object v0, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->mruCachedItems:Ljava/util/ArrayList;
    //         sget-object v2, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;->mruCachedItems:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         add-int/lit8 v2, v2, -0x1
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$400()Ljava/util/concurrent/ConcurrentHashMap;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    companion object {
    private var mruCachedItems: java.util.ArrayList
    }
}
