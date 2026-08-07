package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 9 methods.

class pr_d: com.google.android.gms.internal.ph() {
    public var fv: String
    public var value: String

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         const-string v1, ""
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         const-string v1, ""
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pr$d;->y(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pr$d;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         const-string v2, ""
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->j(ILjava/lang/String;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         const-string v2, ""
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->j(ILjava/lang/String;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_1
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
    //         instance-of v1, p1, Lcom/google/android/gms/internal/pr$d;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/pr$d;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         if-nez v1, :cond_4
    //         iget-object v1, p1, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         if-nez v1, :cond_5
    //         iget-object v1, p1, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         :cond_3
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pr$d;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         goto :goto_0
    //         :cond_5
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_3
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         if-nez v2, :cond_1
    //         :goto_1
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/pr$d;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
    //         move-result v1
    //         goto :goto_1
    */

    public fun qN(): com.google.android.gms.internal.pr.d { return TODO("body: ()Lcom/google/android/gms/internal/pr$d;") }
    /*
    //         .locals 1
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$d;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/pr$d;->awU:I
    //         return-object p0
    */

    public fun y(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.pr.d { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pr$d;") }
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
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pr$d;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$d;->fv:Ljava/lang/String;
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$d;->value:Ljava/lang/String;
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0xa -> :sswitch_1
    //             0x12 -> :sswitch_2
    //         .end sparse-switch
    */

    companion object {
    private var axu: Array<com.google.android.gms.internal.pr.d>

    public @JvmStatic fun qM(): Array<com.google.android.gms.internal.pr.d> { return TODO("body: ()[Lcom/google/android/gms/internal/pr$d;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/internal/pr$d;->axu:[Lcom/google/android/gms/internal/pr$d;
    //         if-nez v0, :cond_1
    //         sget-object v1, Lcom/google/android/gms/internal/pl;->awT:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/internal/pr$d;->axu:[Lcom/google/android/gms/internal/pr$d;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Lcom/google/android/gms/internal/pr$d;
    //         sput-object v0, Lcom/google/android/gms/internal/pr$d;->axu:[Lcom/google/android/gms/internal/pr$d;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/pr$d;->axu:[Lcom/google/android/gms/internal/pr$d;
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
