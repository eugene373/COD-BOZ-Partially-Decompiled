package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 7 methods.

open class ph: com.google.android.gms.internal.pn() {
    protected var awJ: com.google.android.gms.internal.pj

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pi): Object { return TODO("body: (Lcom/google/android/gms/internal/pi;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/internal/pi",
    //                 "<TM;TT;>;)TT;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         iget v2, p1, Lcom/google/android/gms/internal/pi;->tag:I
    //         invoke-static {v2}, Lcom/google/android/gms/internal/pq;->gI(I)I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/pj;->gE(I)Lcom/google/android/gms/internal/pk;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/pk;->b(Lcom/google/android/gms/internal/pi;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/pj;->size()I
    //         move-result v1
    //         if-ge v0, v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/pj;->gF(I)Lcom/google/android/gms/internal/pk;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/pk;->a(Lcom/google/android/gms/internal/pg;)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    protected fun a(p0: com.google.android.gms.internal.pf, p1: Int): Boolean { return TODO("body: (Lcom/google/android/gms/internal/pf;I)Z") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->getPosition()I
    //         move-result v0
    //         invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/pf;->gn(I)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-static {p2}, Lcom/google/android/gms/internal/pq;->gI(I)I
    //         move-result v1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->getPosition()I
    //         move-result v2
    //         sub-int/2addr v2, v0
    //         invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pf;->r(II)[B
    //         move-result-object v0
    //         new-instance v2, Lcom/google/android/gms/internal/pp;
    //         invoke-direct {v2, p2, v0}, Lcom/google/android/gms/internal/pp;-><init>(I[B)V
    //         const/4 v0, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         if-nez v3, :cond_2
    //         new-instance v3, Lcom/google/android/gms/internal/pj;
    //         invoke-direct {v3}, Lcom/google/android/gms/internal/pj;-><init>()V
    //         iput-object v3, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         :goto_1
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/pk;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/pk;-><init>()V
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v3, v1, v0}, Lcom/google/android/gms/internal/pj;->a(ILcom/google/android/gms/internal/pk;)V
    //         :cond_1
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/pk;->a(Lcom/google/android/gms/internal/pp;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/pj;->gE(I)Lcom/google/android/gms/internal/pk;
    //         move-result-object v0
    //         goto :goto_1
    */

    protected fun a(p0: com.google.android.gms.internal.ph): Boolean { return TODO("body: (Lcom/google/android/gms/internal/ph;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TM;)Z"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/pj;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :cond_0
    //         iget-object v0, p1, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p1, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/pj;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         iget-object v1, p1, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/pj;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         if-eqz v1, :cond_0
    //         move v1, v0
    //         :goto_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/pj;->size()I
    //         move-result v2
    //         if-ge v0, v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/pj;->gF(I)Lcom/google/android/gms/internal/pk;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/pk;->c()I
    //         move-result v2
    //         add-int/2addr v1, v2
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         move v1, v0
    //         :cond_1
    //         return v1
    */

    protected fun qz(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/pj;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ph;->awJ:Lcom/google/android/gms/internal/pj;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/pj;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

}
