package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 9 methods.

class c_c: com.google.android.gms.internal.ph() {
    public var fv: String
    public var fw: Long
    public var fx: Long
    public var fy: Boolean
    public var fz: Long

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const-wide/16 v4, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         const-string v1, ""
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V
    //         :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         cmp-long v0, v0, v4
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->b(IJ)V
    //         :cond_1
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         const-wide/32 v2, 0x7fffffff
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_2
    //         const/4 v0, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->b(IJ)V
    //         :cond_2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         if-eqz v0, :cond_3
    //         const/4 v0, 0x4
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(IZ)V
    //         :cond_3
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         cmp-long v0, v0, v4
    //         if-eqz v0, :cond_4
    //         const/4 v0, 0x5
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->b(IJ)V
    //         :cond_4
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/c$c;->d(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/c$c;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 8
    //         const-wide/16 v6, 0x0
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         const-string v2, ""
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->j(ILjava/lang/String;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         cmp-long v1, v2, v6
    //         if-eqz v1, :cond_1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->d(IJ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_1
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         const-wide/32 v4, 0x7fffffff
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_2
    //         const/4 v1, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->d(IJ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_2
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         if-eqz v1, :cond_3
    //         const/4 v1, 0x4
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->c(IZ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_3
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         cmp-long v1, v2, v6
    //         if-eqz v1, :cond_4
    //         const/4 v1, 0x5
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->d(IJ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_4
    //         return v0
    */

    public fun d(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.c.c { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/c$c;") }
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
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/c$c;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         goto :goto_0
    //         :sswitch_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qm()Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         goto :goto_0
    //         :sswitch_5
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0xa -> :sswitch_1
    //             0x10 -> :sswitch_2
    //             0x18 -> :sswitch_3
    //             0x20 -> :sswitch_4
    //             0x28 -> :sswitch_5
    //         .end sparse-switch
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
    //         instance-of v1, p1, Lcom/google/android/gms/internal/c$c;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/c$c;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         if-nez v1, :cond_3
    //         iget-object v1, p1, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         :cond_2
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/c$c;->fw:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/c$c;->fx:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         iget-boolean v2, p1, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         if-ne v1, v2, :cond_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/c$c;->fz:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/c$c;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         goto :goto_0
    */

    public fun g(): com.google.android.gms.internal.c.c { return TODO("body: ()Lcom/google/android/gms/internal/c$c;") }
    /*
    //         .locals 4
    //         const-wide/16 v2, 0x0
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         const-wide/32 v0, 0x7fffffff
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$c;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/c$c;->awU:I
    //         return-object p0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 7
    //         const/16 v6, 0x20
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/c$c;->fw:J
    //         ushr-long/2addr v4, v6
    //         xor-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/c$c;->fx:J
    //         ushr-long/2addr v4, v6
    //         xor-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v1, v0, 0x1f
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/c$c;->fy:Z
    //         if-eqz v0, :cond_1
    //         const/16 v0, 0x4cf
    //         :goto_1
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/c$c;->fz:J
    //         ushr-long/2addr v4, v6
    //         xor-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/c$c;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$c;->fv:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         const/16 v0, 0x4d5
    //         goto :goto_1
    */

    companion object {
    private var fu: Array<com.google.android.gms.internal.c.c>

    public @JvmStatic fun f(): Array<com.google.android.gms.internal.c.c> { return TODO("body: ()[Lcom/google/android/gms/internal/c$c;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/internal/c$c;->fu:[Lcom/google/android/gms/internal/c$c;
    //         if-nez v0, :cond_1
    //         sget-object v1, Lcom/google/android/gms/internal/pl;->awT:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/internal/c$c;->fu:[Lcom/google/android/gms/internal/c$c;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Lcom/google/android/gms/internal/c$c;
    //         sput-object v0, Lcom/google/android/gms/internal/c$c;->fu:[Lcom/google/android/gms/internal/c$c;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/c$c;->fu:[Lcom/google/android/gms/internal/c$c;
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
