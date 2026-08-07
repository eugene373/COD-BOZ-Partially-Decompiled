package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 9 methods.

class ah: com.google.android.gms.internal.ph() {
    public var Pl: String
    public var Pm: Long
    public var Pn: Long
    public var versionCode: Int

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
    //         iget v1, p0, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         const/4 v0, 0x2
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V
    //         const/4 v0, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->c(IJ)V
    //         const/4 v0, 0x4
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->c(IJ)V
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/ah;->m(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/drive/internal/ah;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->j(ILjava/lang/String;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         const/4 v1, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->e(IJ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         const/4 v1, 0x4
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->e(IJ)I
    //         move-result v1
    //         add-int/2addr v0, v1
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
    //         instance-of v1, p1, Lcom/google/android/gms/drive/internal/ah;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/drive/internal/ah;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget v1, p0, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         iget v2, p1, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         if-nez v1, :cond_3
    //         iget-object v1, p1, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         :cond_2
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         iget-wide v4, p1, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         iget-wide v4, p1, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/ah;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 7
    //         const/16 v6, 0x20
    //         iget v0, p0, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v1, v0, 0x1f
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         iget-wide v4, p0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         ushr-long/2addr v4, v6
    //         xor-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         iget-wide v4, p0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         ushr-long/2addr v4, v6
    //         xor-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/ah;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun ic(): com.google.android.gms.drive.internal.ah { return TODO("body: ()Lcom/google/android/gms/drive/internal/ah;") }
    /*
    //         .locals 4
    //         const-wide/16 v2, -0x1
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         iput-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         iput-wide v2, p0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/ah;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/drive/internal/ah;->awU:I
    //         return-object p0
    */

    public fun m(p0: com.google.android.gms.internal.pf): com.google.android.gms.drive.internal.ah { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/drive/internal/ah;") }
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
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/drive/internal/ah;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qo()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         goto :goto_0
    //         :sswitch_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qo()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x8 -> :sswitch_1
    //             0x12 -> :sswitch_2
    //             0x18 -> :sswitch_3
    //             0x20 -> :sswitch_4
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun g(p0: ByteArray): com.google.android.gms.drive.internal.ah { return TODO("body: ([B)Lcom/google/android/gms/drive/internal/ah;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/google/android/gms/internal/pm;
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/drive/internal/ah;
    //         invoke-direct {v0}, Lcom/google/android/gms/drive/internal/ah;-><init>()V
    //         invoke-static {v0, p0}, Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/pn;[B)Lcom/google/android/gms/internal/pn;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/ah;
    //         return-object v0
    */

    }
}
