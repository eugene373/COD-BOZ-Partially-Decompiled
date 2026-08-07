package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 8 methods.

class ll_a: com.google.android.gms.internal.ph() {
    public var adE: Array<com.google.android.gms.internal.ll.a.a>

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         array-length v0, v0
    //         if-lez v0, :cond_1
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         array-length v1, v1
    //         if-ge v0, v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         aget-object v1, v1, v0
    //         if-eqz v1, :cond_0
    //         const/4 v2, 0x1
    //         invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ll$a;->n(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/ll$a;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         array-length v0, v0
    //         if-lez v0, :cond_1
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         array-length v2, v2
    //         if-ge v0, v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         aget-object v2, v2, v0
    //         if-eqz v2, :cond_0
    //         const/4 v3, 0x1
    //         invoke-static {v3, v2}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I
    //         move-result v2
    //         add-int/2addr v1, v2
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return v1
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
    //         instance-of v1, p1, Lcom/google/android/gms/internal/ll$a;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/ll$a;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ll$a;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pl;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ll$a;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun lP(): com.google.android.gms.internal.ll.a { return TODO("body: ()Lcom/google/android/gms/internal/ll$a;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/ll$a$a;->lQ()[Lcom/google/android/gms/internal/ll$a$a;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ll$a;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/ll$a;->awU:I
    //         return-object p0
    */

    public fun n(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.ll.a { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/ll$a;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         move-result v0
    //         sparse-switch v0, :sswitch_data_0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ll$a;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         const/16 v0, 0xa
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I
    //         move-result v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_1
    //         add-int/2addr v2, v0
    //         new-array v2, v2, [Lcom/google/android/gms/internal/ll$a$a;
    //         if-eqz v0, :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_1
    //         :goto_2
    //         array-length v3, v2
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v0, v3, :cond_3
    //         new-instance v3, Lcom/google/android/gms/internal/ll$a$a;
    //         invoke-direct {v3}, Lcom/google/android/gms/internal/ll$a$a;-><init>()V
    //         aput-object v3, v2, v0
    //         aget-object v3, v2, v0
    //         invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         array-length v0, v0
    //         goto :goto_1
    //         :cond_3
    //         new-instance v3, Lcom/google/android/gms/internal/ll$a$a;
    //         invoke-direct {v3}, Lcom/google/android/gms/internal/ll$a$a;-><init>()V
    //         aput-object v3, v2, v0
    //         aget-object v0, v2, v0
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/ll$a;->adE:[Lcom/google/android/gms/internal/ll$a$a;
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0xa -> :sswitch_1
    //         .end sparse-switch
    */

}
