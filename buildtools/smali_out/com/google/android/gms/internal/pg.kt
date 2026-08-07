package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 62 methods.

class pg {
    private val awI: Int
    private val buffer: ByteArray
    private var position: Int

    private constructor(p0: ByteArray, p1: Int, p2: Int)

    public fun B(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pg;->F(J)V
    //         return-void
    */

    public fun C(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->I(J)J
    //         move-result-wide v0
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->F(J)V
    //         return-void
    */

    public fun F(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         :goto_0
    //         const-wide/16 v0, -0x80
    //         and-long/2addr v0, p1
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         long-to-int v0, p1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         return-void
    //         :cond_0
    //         long-to-int v0, p1
    //         and-int/lit8 v0, v0, 0x7f
    //         or-int/lit16 v0, v0, 0x80
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/4 v0, 0x7
    //         ushr-long/2addr p1, v0
    //         goto :goto_0
    */

    public fun H(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         long-to-int v0, p1
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/16 v0, 0x8
    //         shr-long v0, p1, v0
    //         long-to-int v0, v0
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/16 v0, 0x10
    //         shr-long v0, p1, v0
    //         long-to-int v0, v0
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/16 v0, 0x18
    //         shr-long v0, p1, v0
    //         long-to-int v0, v0
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/16 v0, 0x20
    //         shr-long v0, p1, v0
    //         long-to-int v0, v0
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/16 v0, 0x28
    //         shr-long v0, p1, v0
    //         long-to-int v0, v0
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/16 v0, 0x30
    //         shr-long v0, p1, v0
    //         long-to-int v0, v0
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         const/16 v0, 0x38
    //         shr-long v0, p1, v0
    //         long-to-int v0, v0
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         return-void
    */

    public fun U(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun a(p0: Int, p1: Double) { /* TODO(body): (ID)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/pg;->e(D)V
    //         return-void
    */

    public fun a(p0: Int, p1: com.google.android.gms.internal.pn) { /* TODO(body): (ILcom/google/android/gms/internal/pn;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x2
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->c(Lcom/google/android/gms/internal/pn;)V
    //         return-void
    */

    public fun a(p0: Int, p1: ByteArray) { /* TODO(body): (I[B)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x2
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->r([B)V
    //         return-void
    */

    public fun b(p0: Byte) { /* TODO(body): (B)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget v0, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         iget v1, p0, Lcom/google/android/gms/internal/pg;->awI:I
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/pg$a;
    //         iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         iget v2, p0, Lcom/google/android/gms/internal/pg;->awI:I
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/pg$a;-><init>(II)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pg;->buffer:[B
    //         iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         add-int/lit8 v2, v1, 0x1
    //         iput v2, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         aput-byte p1, v0, v1
    //         return-void
    */

    public fun b(p0: Int, p1: Float) { /* TODO(body): (IF)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x5
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->d(F)V
    //         return-void
    */

    public fun b(p0: Int, p1: Long) { /* TODO(body): (IJ)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/pg;->B(J)V
    //         return-void
    */

    public fun b(p0: Int, p1: String) { /* TODO(body): (ILjava/lang/String;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x2
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->dh(Ljava/lang/String;)V
    //         return-void
    */

    public fun b(p0: Int, p1: Boolean) { /* TODO(body): (IZ)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->U(Z)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.internal.pn) { /* TODO(body): (Lcom/google/android/gms/internal/pn;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/pg;)V
    //         return-void
    */

    public fun c(p0: Int, p1: Long) { /* TODO(body): (IJ)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/pg;->C(J)V
    //         return-void
    */

    public fun c(p0: com.google.android.gms.internal.pn) { /* TODO(body): (Lcom/google/android/gms/internal/pn;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/pn;->qH()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/pg;)V
    //         return-void
    */

    public fun c(p0: ByteArray, p1: Int, p2: Int) { /* TODO(body): ([BII)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget v0, p0, Lcom/google/android/gms/internal/pg;->awI:I
    //         iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         sub-int/2addr v0, v1
    //         if-lt v0, p3, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/pg;->buffer:[B
    //         iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         iget v0, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         add-int/2addr v0, p3
    //         iput v0, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/pg$a;
    //         iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         iget v2, p0, Lcom/google/android/gms/internal/pg;->awI:I
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/pg$a;-><init>(II)V
    //         throw v0
    */

    public fun d(p0: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gC(I)V
    //         return-void
    */

    public fun dh(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const-string v0, "UTF-8"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         move-result-object v0
    //         array-length v1, v0
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->t([B)V
    //         return-void
    */

    public fun e(p0: Double) { /* TODO(body): (D)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v0
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->H(J)V
    //         return-void
    */

    public fun gA(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         :goto_0
    //         and-int/lit8 v0, p1, -0x80
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         return-void
    //         :cond_0
    //         and-int/lit8 v0, p1, 0x7f
    //         or-int/lit16 v0, v0, 0x80
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         ushr-int/lit8 p1, p1, 0x7
    //         goto :goto_0
    */

    public fun gC(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         and-int/lit16 v0, p1, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         shr-int/lit8 v0, p1, 0x8
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         shr-int/lit8 v0, p1, 0x10
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         shr-int/lit8 v0, p1, 0x18
    //         and-int/lit16 v0, v0, 0xff
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V
    //         return-void
    */

    public fun gu(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         if-ltz p1, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         int-to-long v0, p1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->F(J)V
    //         goto :goto_0
    */

    public fun gv(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->gD(I)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         return-void
    */

    public fun gy(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         int-to-byte v0, p1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->b(B)V
    //         return-void
    */

    public fun qx(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/internal/pg;->awI:I
    //         iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I
    //         sub-int/2addr v0, v1
    //         return v0
    */

    public fun qy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/pg;->qx()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Did not write as much data as expected."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun r(p0: ByteArray) { /* TODO(body): ([B)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         array-length v0, p1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pg;->t([B)V
    //         return-void
    */

    public fun s(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->gu(I)V
    //         return-void
    */

    public fun t(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->gv(I)V
    //         return-void
    */

    public fun t(p0: ByteArray) { /* TODO(body): ([B)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         array-length v1, p1
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/pg;->c([BII)V
    //         return-void
    */

    public fun w(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {p1, p2}, Lcom/google/android/gms/internal/pq;->x(II)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V
    //         return-void
    */

    companion object {
    public @JvmStatic fun D(p0: Long): Int { return TODO("body: (J)I") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/google/android/gms/internal/pg;->G(J)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun E(p0: Long): Int { return TODO("body: (J)I") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/google/android/gms/internal/pg;->I(J)J
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/pg;->G(J)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun G(p0: Long): Int { return TODO("body: (J)I") }
    /*
    //         .locals 4
    //         const-wide/16 v2, 0x0
    //         const-wide/16 v0, -0x80
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-wide/16 v0, -0x4000
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :cond_1
    //         const-wide/32 v0, -0x200000
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_2
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         :cond_2
    //         const-wide/32 v0, -0x10000000
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_3
    //         const/4 v0, 0x4
    //         goto :goto_0
    //         :cond_3
    //         const-wide v0, -0x800000000L
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_4
    //         const/4 v0, 0x5
    //         goto :goto_0
    //         :cond_4
    //         const-wide v0, -0x40000000000L
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_5
    //         const/4 v0, 0x6
    //         goto :goto_0
    //         :cond_5
    //         const-wide/high16 v0, -0x2000000000000L
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_6
    //         const/4 v0, 0x7
    //         goto :goto_0
    //         :cond_6
    //         const-wide/high16 v0, -0x100000000000000L
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_7
    //         const/16 v0, 0x8
    //         goto :goto_0
    //         :cond_7
    //         const-wide/high16 v0, -0x8000000000000000L
    //         and-long/2addr v0, p0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_8
    //         const/16 v0, 0x9
    //         goto :goto_0
    //         :cond_8
    //         const/16 v0, 0xa
    //         goto :goto_0
    */

    public @JvmStatic fun I(p0: Long): Long { return TODO("body: (J)J") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         shl-long v0, p0, v0
    //         const/16 v2, 0x3f
    //         shr-long v2, p0, v2
    //         xor-long/2addr v0, v2
    //         return-wide v0
    */

    public @JvmStatic fun V(p0: Boolean): Int { return TODO("body: (Z)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public @JvmStatic fun b(p0: Int, p1: Double): Int { return TODO("body: (ID)I") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->f(D)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun b(p0: Int, p1: com.google.android.gms.internal.pn): Int { return TODO("body: (ILcom/google/android/gms/internal/pn;)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         mul-int/lit8 v0, v0, 0x2
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->d(Lcom/google/android/gms/internal/pn;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun b(p0: Int, p1: ByteArray): Int { return TODO("body: (I[B)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->s([B)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun b(p0: ByteArray, p1: Int, p2: Int): com.google.android.gms.internal.pg { return TODO("body: ([BII)Lcom/google/android/gms/internal/pg;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/pg;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/pg;-><init>([BII)V
    //         return-object v0
    */

    public @JvmStatic fun c(p0: Int, p1: Float): Int { return TODO("body: (IF)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->e(F)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun c(p0: Int, p1: com.google.android.gms.internal.pn): Int { return TODO("body: (ILcom/google/android/gms/internal/pn;)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->e(Lcom/google/android/gms/internal/pn;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun c(p0: Int, p1: Boolean): Int { return TODO("body: (IZ)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->V(Z)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun d(p0: Int, p1: Long): Int { return TODO("body: (IJ)I") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->D(J)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun d(p0: com.google.android.gms.internal.pn): Int { return TODO("body: (Lcom/google/android/gms/internal/pn;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/pn;->qI()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun di(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         const-string v0, "UTF-8"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         move-result-object v0
    //         array-length v1, v0
    //         invoke-static {v1}, Lcom/google/android/gms/internal/pg;->gB(I)I
    //         move-result v1
    //         array-length v0, v0
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         add-int/2addr v0, v1
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         const-string v1, "UTF-8 not supported."
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun e(p0: Float): Int { return TODO("body: (F)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         return v0
    */

    public @JvmStatic fun e(p0: Int, p1: Long): Int { return TODO("body: (IJ)I") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->E(J)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun e(p0: com.google.android.gms.internal.pn): Int { return TODO("body: (Lcom/google/android/gms/internal/pn;)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/pn;->qI()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun f(p0: Double): Int { return TODO("body: (D)I") }
    /*
    //         .locals 1
    //         const/16 v0, 0x8
    //         return v0
    */

    public @JvmStatic fun gB(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         and-int/lit8 v0, p0, -0x80
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         and-int/lit16 v0, p0, -0x4000
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :cond_1
    //         const/high16 v0, -0x200000
    //         and-int/2addr v0, p0
    //         if-nez v0, :cond_2
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         :cond_2
    //         const/high16 v0, -0x10000000
    //         and-int/2addr v0, p0
    //         if-nez v0, :cond_3
    //         const/4 v0, 0x4
    //         goto :goto_0
    //         :cond_3
    //         const/4 v0, 0x5
    //         goto :goto_0
    */

    public @JvmStatic fun gD(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         shl-int/lit8 v0, p0, 0x1
    //         shr-int/lit8 v1, p0, 0x1f
    //         xor-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun gw(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         if-ltz p0, :cond_0
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gB(I)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/16 v0, 0xa
    //         goto :goto_0
    */

    public @JvmStatic fun gx(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gD(I)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun gz(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/internal/pq;->x(II)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun j(p0: Int, p1: String): Int { return TODO("body: (ILjava/lang/String;)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->di(Ljava/lang/String;)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun q(p0: ByteArray): com.google.android.gms.internal.pg { return TODO("body: ([B)Lcom/google/android/gms/internal/pg;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         array-length v1, p0
    //         invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->b([BII)Lcom/google/android/gms/internal/pg;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun s(p0: ByteArray): Int { return TODO("body: ([B)I") }
    /*
    //         .locals 2
    //         array-length v0, p0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I
    //         move-result v0
    //         array-length v1, p0
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun u(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->gw(I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public @JvmStatic fun v(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I
    //         move-result v0
    //         invoke-static {p1}, Lcom/google/android/gms/internal/pg;->gx(I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    }
}
