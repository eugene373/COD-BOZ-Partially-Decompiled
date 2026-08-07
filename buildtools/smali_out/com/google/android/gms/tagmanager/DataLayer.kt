package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 10 fields, 28 methods.

open class DataLayer {
    private val aoI: java.util.concurrent.ConcurrentHashMap
    private val aoJ: java.util.Map
    private val aoK: java.util.concurrent.locks.ReentrantLock
    private val aoL: java.util.LinkedList
    private val aoM: com.google.android.gms.tagmanager.DataLayer.c
    private val aoN: java.util.concurrent.CountDownLatch

    constructor()

    constructor(persistentStore: com.google.android.gms.tagmanager.DataLayer.c)

    private fun F(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoK:Ljava/util/concurrent/locks/ReentrantLock;
    //         invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoL:Ljava/util/LinkedList;
    //         invoke-virtual {v0, p1}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoK:Ljava/util/concurrent/locks/ReentrantLock;
    //         invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->getHoldCount()I
    //         move-result v0
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/DataLayer;->of()V
    //         :cond_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/DataLayer;->G(Ljava/util/Map;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoK:Ljava/util/concurrent/locks/ReentrantLock;
    //         invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoK:Ljava/util/concurrent/locks/ReentrantLock;
    //         invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    //         throw v0
    */

    private fun G(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/DataLayer;->H(Ljava/util/Map;)Ljava/lang/Long;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/DataLayer;->J(Ljava/util/Map;)Ljava/util/List;
    //         move-result-object v1
    //         const-string v2, "gtm.lifetime"
    //         invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoM:Lcom/google/android/gms/tagmanager/DataLayer$c;
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v4
    //         invoke-interface {v2, v1, v4, v5}, Lcom/google/android/gms/tagmanager/DataLayer$c;->a(Ljava/util/List;J)V
    //         goto :goto_0
    */

    private fun H(p0: java.util.Map): Long { return TODO("body: (Ljava/util/Map;)Ljava/lang/Long;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)",
    //                 "Ljava/lang/Long;"
    //             }
    //         .end annotation
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/DataLayer;->I(Ljava/util/Map;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/DataLayer;->cw(Ljava/lang/String;)Ljava/lang/Long;
    //         move-result-object v0
    //         goto :goto_0
    */

    private fun I(p0: java.util.Map): Object { return TODO("body: (Ljava/util/Map;)Ljava/lang/Object;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)",
    //                 "Ljava/lang/Object;"
    //             }
    //         .end annotation
    //         sget-object v2, Lcom/google/android/gms/tagmanager/DataLayer;->aoG:[Ljava/lang/String;
    //         array-length v3, v2
    //         const/4 v0, 0x0
    //         move v1, v0
    //         move-object v0, p1
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         aget-object v4, v2, v1
    //         instance-of v5, v0, Ljava/util/Map;
    //         if-nez v5, :cond_1
    //         const/4 v0, 0x0
    //         :cond_0
    //         return-object v0
    //         :cond_1
    //         check-cast v0, Ljava/util/Map;
    //         invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object p1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         move-object v0, p1
    //         goto :goto_0
    */

    private fun J(p0: java.util.Map): java.util.List { return TODO("body: (Ljava/util/Map;)Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/tagmanager/DataLayer$a;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         const-string v1, ""
    //         invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Collection;)V
    //         return-object v0
    */

    private fun K(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoJ:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/tagmanager/DataLayer;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;
    //         move-result-object v0
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoJ:Ljava/util/Map;
    //         invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/tagmanager/DataLayer;->a(Ljava/util/Map;Ljava/util/Map;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/DataLayer;->L(Ljava/util/Map;)V
    //         return-void
    */

    private fun L(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoI:Ljava/util/concurrent/ConcurrentHashMap;
    //         invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/tagmanager/DataLayer$b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/DataLayer$b;->D(Ljava/util/Map;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    private fun a(p0: java.util.Map, p1: String, p2: java.util.Collection) { /* TODO(body): (Ljava/util/Map;Ljava/lang/String;Ljava/util/Collection;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/google/android/gms/tagmanager/DataLayer$a;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {p2}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const-string v1, ""
    //         :goto_1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v3
    //         instance-of v3, v3, Ljava/util/Map;
    //         if-eqz v3, :cond_2
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         invoke-direct {p0, v0, v1, p3}, Lcom/google/android/gms/tagmanager/DataLayer;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Collection;)V
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "."
    //         goto :goto_1
    //         :cond_2
    //         const-string v3, "gtm.lifetime"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         new-instance v3, Lcom/google/android/gms/tagmanager/DataLayer$a;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {v3, v1, v0}, Lcom/google/android/gms/tagmanager/DataLayer$a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-interface {p3, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_3
    //         return-void
    */

    private fun oe() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoM:Lcom/google/android/gms/tagmanager/DataLayer$c;
    //         new-instance v1, Lcom/google/android/gms/tagmanager/DataLayer$2;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/DataLayer$2;-><init>(Lcom/google/android/gms/tagmanager/DataLayer;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/DataLayer$c;->a(Lcom/google/android/gms/tagmanager/DataLayer$c$a;)V
    //         return-void
    */

    private fun of() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoL:Ljava/util/LinkedList;
    //         invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->K(Ljava/util/Map;)V
    //         add-int/lit8 v0, v1, 0x1
    //         const/16 v1, 0x1f4
    //         if-le v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoL:Ljava/util/LinkedList;
    //         invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         const-string v1, "Seems like an infinite loop of pushing to the data layer"
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    //         :cond_1
    //         move v1, v0
    //         goto :goto_0
    */

    fun a(p0: com.google.android.gms.tagmanager.DataLayer.b) { /* TODO(body): (Lcom/google/android/gms/tagmanager/DataLayer$b;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoI:Ljava/util/concurrent/ConcurrentHashMap;
    //         const/4 v1, 0x0
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    fun a(p0: java.util.Map, p1: java.util.Map) { /* TODO(body): (Ljava/util/Map;Ljava/util/Map;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v3, v1, Ljava/util/List;
    //         if-eqz v3, :cond_1
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         instance-of v3, v3, Ljava/util/List;
    //         if-nez v3, :cond_0
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         check-cast v1, Ljava/util/List;
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->b(Ljava/util/List;Ljava/util/List;)V
    //         goto :goto_0
    //         :cond_1
    //         instance-of v3, v1, Ljava/util/Map;
    //         if-eqz v3, :cond_3
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         instance-of v3, v3, Ljava/util/Map;
    //         if-nez v3, :cond_2
    //         new-instance v3, Ljava/util/HashMap;
    //         invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
    //         invoke-interface {p2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_2
    //         check-cast v1, Ljava/util/Map;
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->a(Ljava/util/Map;Ljava/util/Map;)V
    //         goto :goto_0
    //         :cond_3
    //         invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_4
    //         return-void
    */

    fun b(p0: java.util.List, p1: java.util.List) { /* TODO(body): (Ljava/util/List;Ljava/util/List;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/Object;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         :goto_0
    //         invoke-interface {p2}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v1
    //         if-ge v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         const/4 v0, 0x0
    //         move v2, v0
    //         :goto_1
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge v2, v0, :cond_6
    //         invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v1, v0, Ljava/util/List;
    //         if-eqz v1, :cond_3
    //         invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v1, v1, Ljava/util/List;
    //         if-nez v1, :cond_1
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p2, v2, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         check-cast v0, Ljava/util/List;
    //         invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/List;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/tagmanager/DataLayer;->b(Ljava/util/List;Ljava/util/List;)V
    //         :cond_2
    //         :goto_2
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         goto :goto_1
    //         :cond_3
    //         instance-of v1, v0, Ljava/util/Map;
    //         if-eqz v1, :cond_5
    //         invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v1, v1, Ljava/util/Map;
    //         if-nez v1, :cond_4
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         invoke-interface {p2, v2, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         :cond_4
    //         check-cast v0, Ljava/util/Map;
    //         invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/Map;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/tagmanager/DataLayer;->a(Ljava/util/Map;Ljava/util/Map;)V
    //         goto :goto_2
    //         :cond_5
    //         sget-object v1, Lcom/google/android/gms/tagmanager/DataLayer;->OBJECT_NOT_PRESENT:Ljava/lang/Object;
    //         if-eq v0, v1, :cond_2
    //         invoke-interface {p2, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_2
    //         :cond_6
    //         return-void
    */

    fun c(p0: String, p1: Object): java.util.Map { return TODO("body: (Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ")",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "\\."
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v4
    //         const/4 v0, 0x0
    //         move-object v1, v2
    //         :goto_0
    //         array-length v3, v4
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v0, v3, :cond_0
    //         new-instance v3, Ljava/util/HashMap;
    //         invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
    //         aget-object v5, v4, v0
    //         invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         add-int/lit8 v0, v0, 0x1
    //         move-object v1, v3
    //         goto :goto_0
    //         :cond_0
    //         array-length v0, v4
    //         add-int/lit8 v0, v0, -0x1
    //         aget-object v0, v4, v0
    //         invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object v2
    */

    fun cv(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/lang/String;Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoM:Lcom/google/android/gms/tagmanager/DataLayer$c;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/DataLayer$c;->cx(Ljava/lang/String;)V
    //         return-void
    */

    public fun get(key: String): Object { return TODO("body: (Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 9
    //         const/4 v1, 0x0
    //         iget-object v4, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoJ:Ljava/util/Map;
    //         monitor-enter v4
    //         :try_start_0
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoJ:Ljava/util/Map;
    //         const-string v0, "\\."
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v5
    //         array-length v6, v5
    //         const/4 v0, 0x0
    //         move v8, v0
    //         move-object v0, v2
    //         move v2, v8
    //         :goto_0
    //         if-ge v2, v6, :cond_2
    //         aget-object v3, v5, v2
    //         instance-of v7, v0, Ljava/util/Map;
    //         if-nez v7, :cond_0
    //         monitor-exit v4
    //         move-object v0, v1
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         check-cast v0, Ljava/util/Map;
    //         invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         if-nez v3, :cond_1
    //         monitor-exit v4
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_1
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         move-object v0, v3
    //         goto :goto_0
    //         :cond_2
    //         monitor-exit v4
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v4
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun push(key: String, value: Object) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/tagmanager/DataLayer;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/util/Map;)V
    //         return-void
    */

    public fun push(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "update":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoN:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/DataLayer;->F(Ljava/util/Map;)V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "DataLayer.push: unexpected InterruptedException"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun pushEvent(eventName: String, p1: java.util.Map) { /* TODO(body): (Ljava/lang/String;Ljava/util/Map;)V */ }
    /*
    //         .locals 2
    //         .local p2, "update":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
    //         const-string v1, "event"
    //         invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/util/Map;)V
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 8
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoJ:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoJ:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         const-string v4, "{\n\tKey: %s\n\tValue: %s\n}\n"
    //         const/4 v5, 0x2
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v7
    //         aput-object v7, v5, v6
    //         const/4 v6, 0x1
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         aput-object v0, v5, v6
    //         invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-object v0
    */

    companion object {
    @JvmField public val EVENT_KEY: String = "event"
    @JvmField public val OBJECT_NOT_PRESENT: Object = null!!
    val aoG: Array<String> = null!!
    private val aoH: java.util.regex.Pattern = null!!

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.DataLayer): java.util.concurrent.CountDownLatch { return TODO("body: (Lcom/google/android/gms/tagmanager/DataLayer;)Ljava/util/concurrent/CountDownLatch;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/DataLayer;->aoN:Ljava/util/concurrent/CountDownLatch;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.DataLayer, p1: java.util.Map) { /* TODO(body): (Lcom/google/android/gms/tagmanager/DataLayer;Ljava/util/Map;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/DataLayer;->F(Ljava/util/Map;)V
    //         return-void
    */

    @JvmStatic fun cw(p0: String): Long { return TODO("body: (Ljava/lang/String;)Ljava/lang/Long;") }
    /*
    //         .locals 10
    //         const-wide/16 v4, 0x0
    //         const/4 v0, 0x0
    //         const-wide/16 v8, 0x3e8
    //         const-wide/16 v6, 0x3c
    //         sget-object v1, Lcom/google/android/gms/tagmanager/DataLayer;->aoH:Ljava/util/regex/Pattern;
    //         invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "unknown _lifetime: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/bh;->U(Ljava/lang/String;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v2, 0x1
    //         :try_start_0
    //         invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v2
    //         :goto_1
    //         cmp-long v4, v2, v4
    //         if-gtz v4, :cond_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "non-positive _lifetime: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/bh;->U(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "illegal number in _lifetime value: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         move-wide v2, v4
    //         goto :goto_1
    //         :cond_1
    //         const/4 v4, 0x2
    //         invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v4
    //         if-nez v4, :cond_2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         const/4 v4, 0x0
    //         invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         sparse-switch v1, :sswitch_data_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "unknown units in _lifetime: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_0
    //         mul-long v0, v2, v8
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         goto :goto_0
    //         :sswitch_1
    //         mul-long v0, v2, v8
    //         mul-long/2addr v0, v6
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         goto :goto_0
    //         :sswitch_2
    //         mul-long v0, v2, v8
    //         mul-long/2addr v0, v6
    //         mul-long/2addr v0, v6
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :sswitch_3
    //         mul-long v0, v2, v8
    //         mul-long/2addr v0, v6
    //         mul-long/2addr v0, v6
    //         const-wide/16 v2, 0x18
    //         mul-long/2addr v0, v2
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x64 -> :sswitch_3
    //             0x68 -> :sswitch_2
    //             0x6d -> :sswitch_1
    //             0x73 -> :sswitch_0
    //         .end sparse-switch
    */

    public @JvmStatic fun listOf(objects: Array<Object>): java.util.List { return TODO("body: ([Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 3
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         const/4 v0, 0x0
    //         :goto_0
    //         array-length v2, p0
    //         if-ge v0, v2, :cond_0
    //         aget-object v2, p0, v0
    //         invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public @JvmStatic fun mapOf(objects: Array<Object>): java.util.Map { return TODO("body: ([Ljava/lang/Object;)Ljava/util/Map;") }
    /*
    //         .locals 4
    //         array-length v0, p0
    //         rem-int/lit8 v0, v0, 0x2
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "expected even number of key-value pairs"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         array-length v0, p0
    //         if-ge v1, v0, :cond_2
    //         aget-object v0, p0, v1
    //         instance-of v0, v0, Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "key is not a string: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         aget-object v1, p0, v1
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         aget-object v0, p0, v1
    //         check-cast v0, Ljava/lang/String;
    //         add-int/lit8 v3, v1, 0x1
    //         aget-object v3, p0, v3
    //         invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         add-int/lit8 v0, v1, 0x2
    //         move v1, v0
    //         goto :goto_0
    //         :cond_2
    //         return-object v2
    */

    }
}
