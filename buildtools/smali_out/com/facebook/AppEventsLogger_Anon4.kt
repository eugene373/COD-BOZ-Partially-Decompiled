package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 0 fields, 2 methods.

class AppEventsLogger_Anon4: Runnable {
    constructor()

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->access$400()Ljava/lang/Object;
    //         move-result-object v2
    //         monitor-enter v2
    //         :try_start_0
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->access$500()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         invoke-virtual {v0}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const/4 v2, 0x1
    //         invoke-static {v0, v2}, Lcom/facebook/internal/Utility;->queryAppSettings(Ljava/lang/String;Z)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         goto :goto_1
    //         :cond_1
    //         return-void
    */

}
