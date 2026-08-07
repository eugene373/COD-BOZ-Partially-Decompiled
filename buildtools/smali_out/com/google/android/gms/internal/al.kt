package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class al {
    private val mw: Object
    private var np: Int
    private var nq: java.util.List

    public constructor()

    public fun a(p0: com.google.android.gms.internal.ak): Boolean { return TODO("body: (Lcom/google/android/gms/internal/ak;)Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/al;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun aU(): com.google.android.gms.internal.ak { return TODO("body: ()Lcom/google/android/gms/internal/ak;") }
    /*
    //         .locals 7
    //         const/4 v3, 0x0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/al;->mw:Ljava/lang/Object;
    //         monitor-enter v4
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "Queue empty"
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         monitor-exit v4
    //         :goto_0
    //         return-object v3
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         const/4 v1, 0x2
    //         if-lt v0, v1, :cond_2
    //         const/high16 v2, -0x80000000
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_1
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ak;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ak;->getScore()I
    //         move-result v1
    //         if-le v1, v2, :cond_3
    //         move v6, v1
    //         move-object v1, v0
    //         move v0, v6
    //         :goto_2
    //         move v2, v0
    //         move-object v3, v1
    //         goto :goto_1
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    //         monitor-exit v4
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v4
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ak;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ak;->aP()V
    //         monitor-exit v4
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-object v3, v0
    //         goto :goto_0
    //         :cond_3
    //         move v0, v2
    //         move-object v1, v3
    //         goto :goto_2
    */

    public fun b(p0: com.google.android.gms.internal.ak): Boolean { return TODO("body: (Lcom/google/android/gms/internal/ak;)Z") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/al;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ak;
    //         if-eq p1, v0, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ak;->aO()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ak;->aO()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    //         const/4 v0, 0x1
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.internal.ak) { /* TODO(body): (Lcom/google/android/gms/internal/ak;)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/al;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         const/16 v2, 0xa
    //         if-lt v0, v2, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Queue is full, current size = "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/internal/al;->np:I
    //         add-int/lit8 v2, v0, 0x1
    //         iput v2, p0, Lcom/google/android/gms/internal/al;->np:I
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ak;->c(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/al;->nq:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
