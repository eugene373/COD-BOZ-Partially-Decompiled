package com.google.android.gms.internal

// Auto-emitted from smali.
// 12 fields, 8 methods.

class pr_c: com.google.android.gms.internal.ph() {
    public var axj: Long
    public var axk: Int
    public var axl: Int
    public var axm: Boolean
    public var axn: Array<com.google.android.gms.internal.pr.d>
    public var axo: com.google.android.gms.internal.pr.b
    public var axp: ByteArray
    public var axq: ByteArray
    public var axr: ByteArray
    public var axs: com.google.android.gms.internal.pr.a
    public var axt: String
    public var tag: String

    public constructor()

    public fun a(p0: com.google.android.gms.internal.pg) { /* TODO(body): (Lcom/google/android/gms/internal/pg;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->b(IJ)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         const-string v1, ""
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         array-length v0, v0
    //         if-lez v0, :cond_3
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         array-length v1, v1
    //         if-ge v0, v1, :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         aget-object v1, v1, v0
    //         if-eqz v1, :cond_2
    //         const/4 v2, 0x3
    //         invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V
    //         :cond_2
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         sget-object v1, Lcom/google/android/gms/internal/pq;->axd:[B
    //         invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         const/4 v0, 0x6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->a(I[B)V
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         if-eqz v0, :cond_5
    //         const/4 v0, 0x7
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         sget-object v1, Lcom/google/android/gms/internal/pq;->axd:[B
    //         invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v0
    //         if-nez v0, :cond_6
    //         const/16 v0, 0x8
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->a(I[B)V
    //         :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         if-eqz v0, :cond_7
    //         const/16 v0, 0x9
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V
    //         :cond_7
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         if-eqz v0, :cond_8
    //         const/16 v0, 0xa
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(IZ)V
    //         :cond_8
    //         iget v0, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         if-eqz v0, :cond_9
    //         const/16 v0, 0xb
    //         iget v1, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         :cond_9
    //         iget v0, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         if-eqz v0, :cond_a
    //         const/16 v0, 0xc
    //         iget v1, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->s(II)V
    //         :cond_a
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         sget-object v1, Lcom/google/android/gms/internal/pq;->axd:[B
    //         invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v0
    //         if-nez v0, :cond_b
    //         const/16 v0, 0xd
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->a(I[B)V
    //         :cond_b
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         const-string v1, ""
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_c
    //         const/16 v0, 0xe
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V
    //         :cond_c
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pr$c;->x(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pr$c;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun c(): Int { return TODO("body: ()I") }
    /*
    //         .locals 7
    //         invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I
    //         move-result v0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         const-wide/16 v4, 0x0
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->d(IJ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         const-string v2, ""
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->j(ILjava/lang/String;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         if-eqz v1, :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         array-length v1, v1
    //         if-lez v1, :cond_4
    //         const/4 v1, 0x0
    //         move v6, v1
    //         move v1, v0
    //         move v0, v6
    //         :goto_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         array-length v2, v2
    //         if-ge v0, v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         aget-object v2, v2, v0
    //         if-eqz v2, :cond_2
    //         const/4 v3, 0x3
    //         invoke-static {v3, v2}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I
    //         move-result v2
    //         add-int/2addr v1, v2
    //         :cond_2
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         sget-object v2, Lcom/google/android/gms/internal/pq;->axd:[B
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v1
    //         if-nez v1, :cond_5
    //         const/4 v1, 0x6
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->b(I[B)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_5
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         if-eqz v1, :cond_6
    //         const/4 v1, 0x7
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         sget-object v2, Lcom/google/android/gms/internal/pq;->axd:[B
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v1
    //         if-nez v1, :cond_7
    //         const/16 v1, 0x8
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->b(I[B)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_7
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         if-eqz v1, :cond_8
    //         const/16 v1, 0x9
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_8
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         if-eqz v1, :cond_9
    //         const/16 v1, 0xa
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->c(IZ)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_9
    //         iget v1, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         if-eqz v1, :cond_a
    //         const/16 v1, 0xb
    //         iget v2, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_a
    //         iget v1, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         if-eqz v1, :cond_b
    //         const/16 v1, 0xc
    //         iget v2, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->u(II)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_b
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         sget-object v2, Lcom/google/android/gms/internal/pq;->axd:[B
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v1
    //         if-nez v1, :cond_c
    //         const/16 v1, 0xd
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->b(I[B)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_c
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         const-string v2, ""
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_d
    //         const/16 v1, 0xe
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pg;->j(ILjava/lang/String;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         :cond_d
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
    //         instance-of v1, p1, Lcom/google/android/gms/internal/pr$c;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/pr$c;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         if-nez v1, :cond_6
    //         iget-object v1, p1, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         :cond_2
    //         iget v1, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         iget v2, p1, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         if-ne v1, v2, :cond_0
    //         iget v1, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         iget v2, p1, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         if-ne v1, v2, :cond_0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         iget-boolean v2, p1, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         if-nez v1, :cond_7
    //         iget-object v1, p1, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         if-nez v1, :cond_0
    //         :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         if-nez v1, :cond_8
    //         iget-object v1, p1, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         if-nez v1, :cond_0
    //         :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         if-nez v1, :cond_9
    //         iget-object v1, p1, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         :cond_5
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pr$c;->a(Lcom/google/android/gms/internal/ph;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         goto :goto_0
    //         :cond_7
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/pr$b;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_3
    //         goto/16 :goto_0
    //         :cond_8
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/pr$a;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_4
    //         goto/16 :goto_0
    //         :cond_9
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_5
    //         goto/16 :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         const/16 v0, 0x20
    //         ushr-long/2addr v4, v0
    //         xor-long/2addr v2, v4
    //         long-to-int v0, v2
    //         add-int/lit16 v0, v0, 0x20f
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v2, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v2, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         if-eqz v0, :cond_1
    //         const/16 v0, 0x4cf
    //         :goto_1
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         invoke-static {v2}, Lcom/google/android/gms/internal/pl;->hashCode([Ljava/lang/Object;)I
    //         move-result v2
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_2
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I
    //         move-result v2
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I
    //         move-result v2
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I
    //         move-result v2
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         if-nez v0, :cond_3
    //         move v0, v1
    //         :goto_3
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         if-nez v2, :cond_4
    //         :goto_4
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/pr$c;->qz()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         const/16 v0, 0x4d5
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/pr$b;->hashCode()I
    //         move-result v0
    //         goto :goto_2
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/pr$a;->hashCode()I
    //         move-result v0
    //         goto :goto_3
    //         :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
    //         move-result v1
    //         goto :goto_4
    */

    public fun qL(): com.google.android.gms.internal.pr.c { return TODO("body: ()Lcom/google/android/gms/internal/pr$c;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         const/4 v2, 0x0
    //         const-wide/16 v0, 0x0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         iput v2, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         iput v2, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         iput-boolean v2, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         invoke-static {}, Lcom/google/android/gms/internal/pr$d;->qM()[Lcom/google/android/gms/internal/pr$d;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         iput-object v3, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         sget-object v0, Lcom/google/android/gms/internal/pq;->axd:[B
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         sget-object v0, Lcom/google/android/gms/internal/pq;->axd:[B
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         sget-object v0, Lcom/google/android/gms/internal/pq;->axd:[B
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         iput-object v3, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         iput-object v3, p0, Lcom/google/android/gms/internal/pr$c;->awJ:Lcom/google/android/gms/internal/pj;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/pr$c;->awU:I
    //         return-object p0
    */

    public fun x(p0: com.google.android.gms.internal.pf): com.google.android.gms.internal.pr.c { return TODO("body: (Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pr$c;") }
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
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pr$c;->a(Lcom/google/android/gms/internal/pf;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :sswitch_0
    //         return-object p0
    //         :sswitch_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J
    //         move-result-wide v2
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/pr$c;->axj:J
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->tag:Ljava/lang/String;
    //         goto :goto_0
    //         :sswitch_3
    //         const/16 v0, 0x1a
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I
    //         move-result v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_1
    //         add-int/2addr v2, v0
    //         new-array v2, v2, [Lcom/google/android/gms/internal/pr$d;
    //         if-eqz v0, :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         :cond_1
    //         :goto_2
    //         array-length v3, v2
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v0, v3, :cond_3
    //         new-instance v3, Lcom/google/android/gms/internal/pr$d;
    //         invoke-direct {v3}, Lcom/google/android/gms/internal/pr$d;-><init>()V
    //         aput-object v3, v2, v0
    //         aget-object v3, v2, v0
    //         invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         array-length v0, v0
    //         goto :goto_1
    //         :cond_3
    //         new-instance v3, Lcom/google/android/gms/internal/pr$d;
    //         invoke-direct {v3}, Lcom/google/android/gms/internal/pr$d;-><init>()V
    //         aput-object v3, v2, v0
    //         aget-object v0, v2, v0
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/pr$c;->axn:[Lcom/google/android/gms/internal/pr$d;
    //         goto :goto_0
    //         :sswitch_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readBytes()[B
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axp:[B
    //         goto :goto_0
    //         :sswitch_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         if-nez v0, :cond_4
    //         new-instance v0, Lcom/google/android/gms/internal/pr$a;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/pr$a;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axs:Lcom/google/android/gms/internal/pr$a;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         goto :goto_0
    //         :sswitch_6
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readBytes()[B
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axq:[B
    //         goto :goto_0
    //         :sswitch_7
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         if-nez v0, :cond_5
    //         new-instance v0, Lcom/google/android/gms/internal/pr$b;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/pr$b;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axo:Lcom/google/android/gms/internal/pr$b;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V
    //         goto/16 :goto_0
    //         :sswitch_8
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qm()Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/pr$c;->axm:Z
    //         goto/16 :goto_0
    //         :sswitch_9
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/pr$c;->axk:I
    //         goto/16 :goto_0
    //         :sswitch_a
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/internal/pr$c;->axl:I
    //         goto/16 :goto_0
    //         :sswitch_b
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readBytes()[B
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axr:[B
    //         goto/16 :goto_0
    //         :sswitch_c
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/pr$c;->axt:Ljava/lang/String;
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x8 -> :sswitch_1
    //             0x12 -> :sswitch_2
    //             0x1a -> :sswitch_3
    //             0x32 -> :sswitch_4
    //             0x3a -> :sswitch_5
    //             0x42 -> :sswitch_6
    //             0x4a -> :sswitch_7
    //             0x50 -> :sswitch_8
    //             0x58 -> :sswitch_9
    //             0x60 -> :sswitch_a
    //             0x6a -> :sswitch_b
    //             0x72 -> :sswitch_c
    //         .end sparse-switch
    */

}
