package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 9 methods.

class ol_a: com.google.android.gms.internal.ph() {
    public var asr: Long
    public var ass: com.google.android.gms.internal.c.j
    public var gs: com.google.android.gms.internal.c.f

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->b(IJ)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V
    //         :cond_1
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ol$a;->p(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/ol$a;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->d(IJ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         if-eqz v1, :cond_1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_1
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         if-ne p1, p0, :cond_1
    //         const/4 v0, 0x1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v1, p1, Lcom/google/android/gms/internal/ol$a;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/ol$a;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-nez v1, :cond_4
    //         iget-object v1, p1, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-nez v1, :cond_0
    //         :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         if-nez v1, :cond_5
    //         iget-object v1, p1, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         if-nez v1, :cond_0
    //         :cond_3
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ol$a;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/c$f;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         goto :goto_0
    //         :cond_5
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/c$j;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_3
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         const/16 v0, 0x20
    //         ushr-long/2addr v4, v0
    //         xor-long/2addr v2, v4
    //         long-to-int v0, v2
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         if-nez v2, :cond_1
    //         :goto_1
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ol$a;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/c$f;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/c$j;->hashCode()I
    //         move-result v1
    //         goto :goto_1
    */

    public fun p(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.ol.a { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/ol$a;") }
    /*
    //         .locals 2
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
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ol$a;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         goto :goto_0
    //         :sswitch_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/c$f;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/c$f;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         goto :goto_0
    //         :sswitch_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         if-nez v0, :cond_2
    //         new-instance v0, Lcom/google/android/gms/internal/c$j;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/c$j;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x8 -> :sswitch_1
    //             0x12 -> :sswitch_2
    //             0x1a -> :sswitch_3
    //         .end sparse-switch
    */

    public fun pL(): com.google.android.gms.internal.ol.a { return TODO("body: ()Lcom/google/android/gms/internal/ol$a;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         const-wide/16 v0, 0x0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/ol$a;->asr:J
    //         iput-object v2, p0, Lcom/google/android/gms/internal/ol$a;->gs:Lcom/google/android/gms/internal/c$f;
    //         iput-object v2, p0, Lcom/google/android/gms/internal/ol$a;->ass:Lcom/google/android/gms/internal/c$j;
    //         iput-object v2, p0, Lcom/google/android/gms/internal/ol$a;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/ol$a;->awU:I
    //         return-object p0
    */

    companion object {
    public @JvmStatic fun l(p0: ByteArray): com.google.android.gms.internal.ol.a { return TODO("body: ([B)Lcom/google/android/gms/internal/ol$a;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/google/android/gms/internal/pm;
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/ol$a;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/ol$a;-><init>()V
    //         invoke-static {v0, p0}, Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/pn;[B)Lcom/google/android/gms/internal/pn;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ol$a;
    //         return-object v0
    */

    }
}
