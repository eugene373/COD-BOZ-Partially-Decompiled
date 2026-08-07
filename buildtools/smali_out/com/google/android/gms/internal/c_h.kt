package com.google.android.gms.internal

// Auto-emitted from smali.
// 9 fields, 9 methods.

class c_h: com.google.android.gms.internal.ph() {
    public var gh: IntArray
    public var gi: IntArray
    public var gj: IntArray
    public var gk: Int
    public var gl: IntArray
    public var gm: Int
    public var gn: Int

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         array-length v0, v0
    //         if-lez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         array-length v2, v2
    //         if-ge v0, v2, :cond_0
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         aget v3, v3, v0
    //         invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         array-length v0, v0
    //         if-lez v0, :cond_1
    //         move v0, v1
    //         :goto_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         array-length v2, v2
    //         if-ge v0, v2, :cond_1
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         aget v3, v3, v0
    //         invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         array-length v0, v0
    //         if-lez v0, :cond_2
    //         move v0, v1
    //         :goto_2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         array-length v2, v2
    //         if-ge v0, v2, :cond_2
    //         const/4 v2, 0x3
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         aget v3, v3, v0
    //         invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_2
    //         iget v0, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         if-eqz v0, :cond_3
    //         const/4 v0, 0x4
    //         iget v2, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         array-length v0, v0
    //         if-lez v0, :cond_4
    //         :goto_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         array-length v0, v0
    //         if-ge v1, v0, :cond_4
    //         const/4 v0, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         aget v2, v2, v1
    //         invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_3
    //         :cond_4
    //         iget v0, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         if-eqz v0, :cond_5
    //         const/4 v0, 0x6
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         :cond_5
    //         iget v0, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         if-eqz v0, :cond_6
    //         const/4 v0, 0x7
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         :cond_6
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/c$h;->i(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/c$h;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         if-eqz v0, :cond_a
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         array-length v0, v0
    //         if-lez v0, :cond_a
    //         move v0, v1
    //         move v2, v1
    //         :goto_0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         array-length v4, v4
    //         if-ge v0, v4, :cond_0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         aget v4, v4, v0
    //         invoke-static {v4}, Lcom/google/android/gms/internal/pg;->gw(I)I
    //         move-result v4
    //         add-int/2addr v2, v4
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         add-int v0, v3, v2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         array-length v2, v2
    //         mul-int/lit8 v2, v2, 0x1
    //         add-int/2addr v0, v2
    //         :goto_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         array-length v2, v2
    //         if-lez v2, :cond_2
    //         move v2, v1
    //         move v3, v1
    //         :goto_2
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         array-length v4, v4
    //         if-ge v2, v4, :cond_1
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         aget v4, v4, v2
    //         invoke-static {v4}, Lcom/google/android/gms/internal/pg;->gw(I)I
    //         move-result v4
    //         add-int/2addr v3, v4
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_2
    //         :cond_1
    //         add-int/2addr v0, v3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         array-length v2, v2
    //         mul-int/lit8 v2, v2, 0x1
    //         add-int/2addr v0, v2
    //         :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         if-eqz v2, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         array-length v2, v2
    //         if-lez v2, :cond_4
    //         move v2, v1
    //         move v3, v1
    //         :goto_3
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         array-length v4, v4
    //         if-ge v2, v4, :cond_3
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         aget v4, v4, v2
    //         invoke-static {v4}, Lcom/google/android/gms/internal/pg;->gw(I)I
    //         move-result v4
    //         add-int/2addr v3, v4
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_3
    //         :cond_3
    //         add-int/2addr v0, v3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         array-length v2, v2
    //         mul-int/lit8 v2, v2, 0x1
    //         add-int/2addr v0, v2
    //         :cond_4
    //         iget v2, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         if-eqz v2, :cond_5
    //         const/4 v2, 0x4
    //         iget v3, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v2
    //         add-int/2addr v0, v2
    //         :cond_5
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         if-eqz v2, :cond_7
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         array-length v2, v2
    //         if-lez v2, :cond_7
    //         move v2, v1
    //         :goto_4
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         array-length v3, v3
    //         if-ge v1, v3, :cond_6
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         aget v3, v3, v1
    //         invoke-static {v3}, Lcom/google/android/gms/internal/pg;->gw(I)I
    //         move-result v3
    //         add-int/2addr v2, v3
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_4
    //         :cond_6
    //         add-int/2addr v0, v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         array-length v1, v1
    //         mul-int/lit8 v1, v1, 0x1
    //         add-int/2addr v0, v1
    //         :cond_7
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         if-eqz v1, :cond_8
    //         const/4 v1, 0x6
    //         iget v2, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_8
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         if-eqz v1, :cond_9
    //         const/4 v1, 0x7
    //         iget v2, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_9
    //         return v0
    //         :cond_a
    //         move v0, v3
    //         goto/16 :goto_1
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
    //         instance-of v1, p1, Lcom/google/android/gms/internal/c$h;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/c$h;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         iget-object v2, p1, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([I[I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         iget-object v2, p1, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([I[I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         iget-object v2, p1, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([I[I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         iget v2, p1, Lcom/google/android/gms/internal/c$h;->gk:I
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         iget-object v2, p1, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([I[I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         iget v2, p1, Lcom/google/android/gms/internal/c$h;->gm:I
    //         if-ne v1, v2, :cond_0
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         iget v2, p1, Lcom/google/android/gms/internal/c$h;->gn:I
    //         if-ne v1, v2, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/c$h;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pl;->hashCode([I)I
    //         move-result v0
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v1, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v1, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/c$h;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun i(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.c.h { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/c$h;") }
    /*
    //         .locals 5
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
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/c$h;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         const/16 v0, 0x8
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I
    //         move-result v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_1
    //         add-int/2addr v2, v0
    //         new-array v2, v2, [I
    //         if-eqz v0, :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_1
    //         :goto_2
    //         array-length v3, v2
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v0, v3, :cond_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         array-length v0, v0
    //         goto :goto_1
    //         :cond_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         iput-object v2, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qp()I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->gp(I)I
    //         move-result v3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->getPosition()I
    //         move-result v2
    //         move v0, v1
    //         :goto_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qu()I
    //         move-result v4
    //         if-lez v4, :cond_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_3
    //         :cond_4
    //         invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pf;->gr(I)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         if-nez v2, :cond_6
    //         move v2, v1
    //         :goto_4
    //         add-int/2addr v0, v2
    //         new-array v0, v0, [I
    //         if-eqz v2, :cond_5
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_5
    //         :goto_5
    //         array-length v4, v0
    //         if-ge v2, v4, :cond_7
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v4
    //         aput v4, v0, v2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_5
    //         :cond_6
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         array-length v2, v2
    //         goto :goto_4
    //         :cond_7
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->gq(I)V
    //         goto/16 :goto_0
    //         :sswitch_3
    //         const/16 v0, 0x10
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I
    //         move-result v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         if-nez v0, :cond_9
    //         move v0, v1
    //         :goto_6
    //         add-int/2addr v2, v0
    //         new-array v2, v2, [I
    //         if-eqz v0, :cond_8
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_8
    //         :goto_7
    //         array-length v3, v2
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v0, v3, :cond_a
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_7
    //         :cond_9
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         array-length v0, v0
    //         goto :goto_6
    //         :cond_a
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         iput-object v2, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         goto/16 :goto_0
    //         :sswitch_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qp()I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->gp(I)I
    //         move-result v3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->getPosition()I
    //         move-result v2
    //         move v0, v1
    //         :goto_8
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qu()I
    //         move-result v4
    //         if-lez v4, :cond_b
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_8
    //         :cond_b
    //         invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pf;->gr(I)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         if-nez v2, :cond_d
    //         move v2, v1
    //         :goto_9
    //         add-int/2addr v0, v2
    //         new-array v0, v0, [I
    //         if-eqz v2, :cond_c
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_c
    //         :goto_a
    //         array-length v4, v0
    //         if-ge v2, v4, :cond_e
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v4
    //         aput v4, v0, v2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_a
    //         :cond_d
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         array-length v2, v2
    //         goto :goto_9
    //         :cond_e
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->gq(I)V
    //         goto/16 :goto_0
    //         :sswitch_5
    //         const/16 v0, 0x18
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I
    //         move-result v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         if-nez v0, :cond_10
    //         move v0, v1
    //         :goto_b
    //         add-int/2addr v2, v0
    //         new-array v2, v2, [I
    //         if-eqz v0, :cond_f
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_f
    //         :goto_c
    //         array-length v3, v2
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v0, v3, :cond_11
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_c
    //         :cond_10
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         array-length v0, v0
    //         goto :goto_b
    //         :cond_11
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         iput-object v2, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         goto/16 :goto_0
    //         :sswitch_6
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qp()I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->gp(I)I
    //         move-result v3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->getPosition()I
    //         move-result v2
    //         move v0, v1
    //         :goto_d
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qu()I
    //         move-result v4
    //         if-lez v4, :cond_12
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_d
    //         :cond_12
    //         invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pf;->gr(I)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         if-nez v2, :cond_14
    //         move v2, v1
    //         :goto_e
    //         add-int/2addr v0, v2
    //         new-array v0, v0, [I
    //         if-eqz v2, :cond_13
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_13
    //         :goto_f
    //         array-length v4, v0
    //         if-ge v2, v4, :cond_15
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v4
    //         aput v4, v0, v2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_f
    //         :cond_14
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         array-length v2, v2
    //         goto :goto_e
    //         :cond_15
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->gq(I)V
    //         goto/16 :goto_0
    //         :sswitch_7
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         goto/16 :goto_0
    //         :sswitch_8
    //         const/16 v0, 0x28
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I
    //         move-result v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         if-nez v0, :cond_17
    //         move v0, v1
    //         :goto_10
    //         add-int/2addr v2, v0
    //         new-array v2, v2, [I
    //         if-eqz v0, :cond_16
    //         iget-object v3, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_16
    //         :goto_11
    //         array-length v3, v2
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v0, v3, :cond_18
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_11
    //         :cond_17
    //         iget-object v0, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         array-length v0, v0
    //         goto :goto_10
    //         :cond_18
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v3
    //         aput v3, v2, v0
    //         iput-object v2, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         goto/16 :goto_0
    //         :sswitch_9
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qp()I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->gp(I)I
    //         move-result v3
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->getPosition()I
    //         move-result v2
    //         move v0, v1
    //         :goto_12
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qu()I
    //         move-result v4
    //         if-lez v4, :cond_19
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_12
    //         :cond_19
    //         invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pf;->gr(I)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         if-nez v2, :cond_1b
    //         move v2, v1
    //         :goto_13
    //         add-int/2addr v0, v2
    //         new-array v0, v0, [I
    //         if-eqz v2, :cond_1a
    //         iget-object v4, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_1a
    //         :goto_14
    //         array-length v4, v0
    //         if-ge v2, v4, :cond_1c
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v4
    //         aput v4, v0, v2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_14
    //         :cond_1b
    //         iget-object v2, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         array-length v2, v2
    //         goto :goto_13
    //         :cond_1c
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->gq(I)V
    //         goto/16 :goto_0
    //         :sswitch_a
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         goto/16 :goto_0
    //         :sswitch_b
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         goto/16 :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x8 -> :sswitch_1
    //             0xa -> :sswitch_2
    //             0x10 -> :sswitch_3
    //             0x12 -> :sswitch_4
    //             0x18 -> :sswitch_5
    //             0x1a -> :sswitch_6
    //             0x20 -> :sswitch_7
    //             0x28 -> :sswitch_8
    //             0x2a -> :sswitch_9
    //             0x30 -> :sswitch_a
    //             0x38 -> :sswitch_b
    //         .end sparse-switch
    */

    public fun n(): com.google.android.gms.internal.c.h { return TODO("body: ()Lcom/google/android/gms/internal/c$h;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         sget-object v0, Lcom/google/android/gms/internal/pq;->awW:[I
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gh:[I
    //         sget-object v0, Lcom/google/android/gms/internal/pq;->awW:[I
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gi:[I
    //         sget-object v0, Lcom/google/android/gms/internal/pq;->awW:[I
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gj:[I
    //         iput v1, p0, Lcom/google/android/gms/internal/c$h;->gk:I
    //         sget-object v0, Lcom/google/android/gms/internal/pq;->awW:[I
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->gl:[I
    //         iput v1, p0, Lcom/google/android/gms/internal/c$h;->gm:I
    //         iput v1, p0, Lcom/google/android/gms/internal/c$h;->gn:I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/c$h;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/c$h;->awU:I
    //         return-object p0
    */

    companion object {
    @JvmField public val gf: com.google.android.gms.internal.pi = null!!
    private val gg: Array<com.google.android.gms.internal.c.h> = null!!
    }
}
