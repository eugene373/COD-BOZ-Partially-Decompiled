package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 13 methods.

open class pi {
    protected val awK: Class
    protected val awL: Boolean
    protected val tag: Int
    protected val type: Int

    private constructor(p0: Int, p1: Class, p2: Int, p3: Boolean)

    private fun m(p0: java.util.List): Object { return TODO("body: (Ljava/util/List;)Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/pp;",
    //                 ">;)TT;"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    //         move v1, v2
    //         :goto_0
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_1
    //         invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/pp;
    //         iget-object v4, v0, Lcom/google/android/gms/internal/pp;->awV:[B
    //         array-length v4, v4
    //         if-eqz v4, :cond_0
    //         invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/internal/pi;->a(Lcom/google/android/gms/internal/pp;Ljava/util/List;)V
    //         :cond_0
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-interface {v3}, Ljava/util/List;->size()I
    //         move-result v1
    //         if-nez v1, :cond_3
    //         const/4 v0, 0x0
    //         :cond_2
    //         return-object v0
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pi;->awK:Ljava/lang/Class;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/pi;->awK:Ljava/lang/Class;
    //         invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
    //         move-result-object v4
    //         invoke-static {v4, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-virtual {v0, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_1
    //         if-ge v2, v1, :cond_2
    //         invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-static {v0, v2, v4}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_1
    */

    private fun n(p0: java.util.List): Object { return TODO("body: (Ljava/util/List;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/pp;",
    //                 ">;)TT;"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/pp;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pi;->awK:Ljava/lang/Class;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/pp;->awV:[B
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pf;->p([B)Lcom/google/android/gms/internal/pf;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pi;->u(Lcom/google/android/gms/internal/pf;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    */

    fun A(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pi;->awL:Z
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pi;->B(Ljava/lang/Object;)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pi;->C(Ljava/lang/Object;)I
    //         move-result v0
    //         goto :goto_0
    */

    protected fun B(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I
    //         move-result v2
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v2, :cond_1
    //         invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/pi;->C(Ljava/lang/Object;)I
    //         move-result v3
    //         add-int/2addr v0, v3
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return v0
    */

    protected fun C(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 3
    //         iget v0, p0, Lcom/google/android/gms/internal/pi;->tag:I
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pq;->gI(I)I
    //         move-result v0
    //         iget v1, p0, Lcom/google/android/gms/internal/pi;->type:I
    //         packed-switch v1, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown type "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/internal/pi;->type:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         check-cast p1, Lcom/google/android/gms/internal/pn;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/pg;->b(ILcom/google/android/gms/internal/pn;)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :pswitch_1
    //         check-cast p1, Lcom/google/android/gms/internal/pn;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I
    //         move-result v0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0xa
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    protected fun a(p0: com.google.android.gms.internal.pp, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/internal/pp;Ljava/util/List;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/pp;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/Object;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p1, Lcom/google/android/gms/internal/pp;->awV:[B
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pf;->p([B)Lcom/google/android/gms/internal/pf;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pi;->u(Lcom/google/android/gms/internal/pf;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    fun a(p0: Object, p1: com.google.android.gms.internal.pg) { /* TODO(body): (Ljava/lang/Object;Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pi;->awL:Z
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pi;->c(Ljava/lang/Object;Lcom/google/android/gms/internal/pg;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pi;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/pg;)V
    //         goto :goto_0
    */

    protected fun b(p0: Object, p1: com.google.android.gms.internal.pg) { /* TODO(body): (Ljava/lang/Object;Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/pi;->tag:I
    //         invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         iget v0, p0, Lcom/google/android/gms/internal/pi;->type:I
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown type "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/internal/pi;->type:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :pswitch_0
    //         :try_start_1
    //         check-cast p1, Lcom/google/android/gms/internal/pn;
    //         iget v0, p0, Lcom/google/android/gms/internal/pi;->tag:I
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pq;->gI(I)I
    //         move-result v0
    //         invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/pg;->b(Lcom/google/android/gms/internal/pn;)V
    //         const/4 v1, 0x4
    //         invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         :goto_0
    //         return-void
    //         :pswitch_1
    //         check-cast p1, Lcom/google/android/gms/internal/pn;
    //         invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/pg;->c(Lcom/google/android/gms/internal/pn;)V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0xa
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    protected fun c(p0: Object, p1: com.google.android.gms.internal.pg) { /* TODO(body): (Ljava/lang/Object;Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 3
    //         invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I
    //         move-result v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v1, :cond_1
    //         invoke-static {p1, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {p0, v2, p2}, Lcom/google/android/gms/internal/pi;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/pg;)V
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    fun l(p0: java.util.List): Object { return TODO("body: (Ljava/util/List;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/pp;",
    //                 ">;)TT;"
    //             }
    //         .end annotation
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pi;->awL:Z
    //         if-eqz v0, :cond_1
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pi;->m(Ljava/util/List;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pi;->n(Ljava/util/List;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun u(p0: com.google.android.gms.internal.pf): Object { return TODO("body: (Lcom/google/android/gms/internal/pf;)Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pi;->awL:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pi;->awK:Ljava/lang/Class;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_0
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/internal/pi;->type:I
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unknown type "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget v3, p0, Lcom/google/android/gms/internal/pi;->type:I
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         :catch_0
    //         move-exception v0
    //         new-instance v2, Ljava/lang/IllegalArgumentException;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error creating instance of class "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v2, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v2
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pi;->awK:Ljava/lang/Class;
    //         move-object v1, v0
    //         goto :goto_0
    //         :pswitch_0
    //         :try_start_1
    //         invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/pn;
    //         iget v2, p0, Lcom/google/android/gms/internal/pi;->tag:I
    //         invoke-static {v2}, Lcom/google/android/gms/internal/pq;->gI(I)I
    //         move-result v2
    //         invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;I)V
    //         :goto_1
    //         return-object v0
    //         :pswitch_1
    //         invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/pn;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         :try_end_1
    //         .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         new-instance v2, Ljava/lang/IllegalArgumentException;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error creating instance of class "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v2, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v2
    //         :catch_2
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         const-string v2, "Error reading extension field"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    //         :pswitch_data_0
    //         .packed-switch 0xa
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    companion object {
    public @JvmStatic fun a(p0: Int, p1: Class, p2: Int): com.google.android.gms.internal.pi { return TODO("body: (ILjava/lang/Class;I)Lcom/google/android/gms/internal/pi;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<M:",
    //                 "Lcom/google/android/gms/internal/ph",
    //                 "<TM;>;T:",
    //                 "Lcom/google/android/gms/internal/pn;",
    //                 ">(I",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;I)",
    //                 "Lcom/google/android/gms/internal/pi",
    //                 "<TM;TT;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/pi;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/pi;-><init>(ILjava/lang/Class;IZ)V
    //         return-object v0
    */

    }
}
