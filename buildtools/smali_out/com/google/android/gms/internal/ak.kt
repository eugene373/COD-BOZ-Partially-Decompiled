package com.google.android.gms.internal

// Auto-emitted from smali.
// 11 fields, 18 methods.

open class ak {
    private val mw: Object
    private val nf: Int
    private val ng: Int
    private val nh: Int
    private val ni: com.google.android.gms.internal.ap
    private var nj: java.util.ArrayList
    private var nk: Int
    private var nl: Int
    private var nm: Int
    private var nn: Int
    private var no: String

    public constructor(p0: Int, p1: Int, p2: Int, p3: Int)

    private fun a(p0: java.util.ArrayList, p1: Int): String { return TODO("body: (Ljava/util/ArrayList;I)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;I)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, ""
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         new-instance v1, Ljava/lang/StringBuffer;
    //         invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
    //         invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         const/16 v0, 0x20
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
    //         invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I
    //         move-result v0
    //         if-le v0, p2, :cond_2
    //         :cond_3
    //         invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
    //         invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-lt v1, p2, :cond_0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private fun j(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         iget v1, p0, Lcom/google/android/gms/internal/ak;->nh:I
    //         if-ge v0, v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ak;->nj:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nk:I
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         add-int/2addr v0, v2
    //         iput v0, p0, Lcom/google/android/gms/internal/ak;->nk:I
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun a(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nf:I
    //         mul-int/2addr v0, p1
    //         iget v1, p0, Lcom/google/android/gms/internal/ak;->ng:I
    //         mul-int/2addr v1, p2
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun aN(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nm:I
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         monitor-exit v1
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun aO(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ak;->no:Ljava/lang/String;
    //         return-object v0
    */

    public fun aP() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nn:I
    //         add-int/lit8 v0, v0, -0x64
    //         iput v0, p0, Lcom/google/android/gms/internal/ak;->nn:I
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun aQ() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nm:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/ak;->nm:I
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun aR() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nm:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/ak;->nm:I
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun aS() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nk:I
    //         iget v2, p0, Lcom/google/android/gms/internal/ak;->nl:I
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/ak;->a(II)I
    //         move-result v0
    //         iget v2, p0, Lcom/google/android/gms/internal/ak;->nn:I
    //         if-le v0, v2, :cond_0
    //         iput v0, p0, Lcom/google/android/gms/internal/ak;->nn:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ak;->ni:Lcom/google/android/gms/internal/ap;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ak;->nj:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ap;->a(Ljava/util/ArrayList;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ak;->no:Ljava/lang/String;
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun aT(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nk:I
    //         return v0
    */

    public fun c(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/internal/ak;->nl:I
    //         return-void
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/internal/ak;
    //         if-nez v2, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         if-ne p1, p0, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/internal/ak;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ak;->aO()Ljava/lang/String;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/ak;->aO()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ak;->aO()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getScore(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nn:I
    //         return v0
    */

    public fun h(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ak;->j(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/ak;->nm:I
    //         if-gez v0, :cond_0
    //         const-string v0, "ActivityContent: negative number of WebViews."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ak;->aS()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ak;->aO()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun i(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ak;->j(Ljava/lang/String;)V
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "ActivityContent fetchId: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/internal/ak;->nl:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " score:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/internal/ak;->nn:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " total_length:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/internal/ak;->nk:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\n text: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->nj:Ljava/util/ArrayList;
    //         const/16 v2, 0xc8
    //         invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ak;->a(Ljava/util/ArrayList;I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\n signture: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ak;->no:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
