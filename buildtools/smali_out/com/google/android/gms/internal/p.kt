package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class p: com.google.android.gms.internal.n {
    private var kY: com.google.android.gms.internal.pg
    private var kZ: ByteArray
    private val la: Int

    public constructor(p0: Int)

    public fun A(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/p;->kY:Lcom/google/android/gms/internal/pg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/pg;->qx()I
    //         move-result v0
    //         if-gez v0, :cond_0
    //         new-instance v0, Ljava/io/IOException;
    //         invoke-direct {v0}, Ljava/io/IOException;-><init>()V
    //         throw v0
    //         :cond_0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/p;->kZ:[B
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/p;->kZ:[B
    //         array-length v1, v1
    //         sub-int v0, v1, v0
    //         new-array v0, v0, [B
    //         iget-object v1, p0, Lcom/google/android/gms/internal/p;->kZ:[B
    //         array-length v2, v0
    //         invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         goto :goto_0
    */

    public fun b(p0: Int, p1: Long) { /* TODO(body): (IJ)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/p;->kY:Lcom/google/android/gms/internal/pg;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/pg;->b(IJ)V
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
    //         iget-object v0, p0, Lcom/google/android/gms/internal/p;->kY:Lcom/google/android/gms/internal/pg;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V
    //         return-void
    */

    public fun reset() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/p;->la:I
    //         new-array v0, v0, [B
    //         iput-object v0, p0, Lcom/google/android/gms/internal/p;->kZ:[B
    //         iget-object v0, p0, Lcom/google/android/gms/internal/p;->kZ:[B
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pg;->q([B)Lcom/google/android/gms/internal/pg;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/p;->kY:Lcom/google/android/gms/internal/pg;
    //         return-void
    */

}
