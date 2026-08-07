package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 9 methods.

class c_e: com.google.android.gms.internal.ph() {
    public var key: Int
    public var value: Int

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/google/android/gms/internal/c$e;->key:I
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         const/4 v0, 0x2
    //         iget v1, p0, Lcom/google/android/gms/internal/c$e;->value:I
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         invoke-super {p0, p1}, Lcom/google/android/gms/internal/ph;->a(Lcom/google/android/gms/internal/pg;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.pn { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pn;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/c$e;->f(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/c$e;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/internal/c$e;->key:I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/internal/c$e;->value:I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-ne p1, p0, :cond_1
    //         const/4 v0, 0x1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v1, p1, Lcom/google/android/gms/internal/c$e;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/c$e;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget v1, p0, Lcom/google/android/gms/internal/c$e;->key:I
    //         iget v2, p1, Lcom/google/android/gms/internal/c$e;->key:I
    //         if-ne v1, v2, :cond_0
    //         iget v1, p0, Lcom/google/android/gms/internal/c$e;->value:I
    //         iget v2, p1, Lcom/google/android/gms/internal/c$e;->value:I
    //         if-ne v1, v2, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/c$e;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun f(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.c.e { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/c$e;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         move-result v0
    //         sparse-switch v0, :sswitch_data_0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/c$e;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/c$e;->key:I
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/c$e;->value:I
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x8 -> :sswitch_1
    //             0x10 -> :sswitch_2
    //         .end sparse-switch
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/internal/c$e;->key:I
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v1, p0, Lcom/google/android/gms/internal/c$e;->value:I
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/c$e;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun j(): com.google.android.gms.internal.c.e { return TODO("body: ()Lcom/google/android/gms/internal/c$e;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/google/android/gms/internal/c$e;->key:I
    //         iput v0, p0, Lcom/google/android/gms/internal/c$e;->value:I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$e;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/c$e;->awU:I
    //         return-object p0
    */

    companion object {
    private var fD: Array<com.google.android.gms.internal.c.e>

    public @JvmStatic fun i(): Array<com.google.android.gms.internal.c.e> { return TODO("body: ()[Lcom/google/android/gms/internal/c$e;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/internal/c$e;->fD:[Lcom/google/android/gms/internal/c$e;
    //         if-nez v0, :cond_1
    //         sget-object v1, Lcom/google/android/gms/internal/pl;->awT:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/internal/c$e;->fD:[Lcom/google/android/gms/internal/c$e;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Lcom/google/android/gms/internal/c$e;
    //         sput-object v0, Lcom/google/android/gms/internal/c$e;->fD:[Lcom/google/android/gms/internal/c$e;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/c$e;->fD:[Lcom/google/android/gms/internal/c$e;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    }
}
