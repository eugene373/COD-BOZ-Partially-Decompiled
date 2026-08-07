package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class as {
    companion object {
    @JvmStatic fun a(p0: Int, p1: Int, p2: Long, p3: Long, p4: Long): Long { return TODO("body: (IIJJJ)J") }
    /*
    //         .locals 8
    //         const-wide/32 v6, 0x7fffffff
    //         const-wide/32 v4, 0x4000ffff
    //         int-to-long v0, p0
    //         add-long/2addr v0, v6
    //         rem-long/2addr v0, v4
    //         mul-long/2addr v0, p4
    //         rem-long/2addr v0, v4
    //         add-long v2, p2, v4
    //         sub-long v0, v2, v0
    //         rem-long/2addr v0, v4
    //         mul-long/2addr v0, p6
    //         rem-long/2addr v0, v4
    //         int-to-long v2, p1
    //         add-long/2addr v2, v6
    //         rem-long/2addr v2, v4
    //         add-long/2addr v0, v2
    //         rem-long/2addr v0, v4
    //         return-wide v0
    */

    @JvmStatic fun a(p0: Long, p1: Int): Long { return TODO("body: (JI)J") }
    /*
    //         .locals 6
    //         const-wide/32 v4, 0x4000ffff
    //         if-nez p2, :cond_1
    //         const-wide/16 p0, 0x1
    //         :cond_0
    //         :goto_0
    //         return-wide p0
    //         :cond_1
    //         const/4 v0, 0x1
    //         if-eq p2, v0, :cond_0
    //         rem-int/lit8 v0, p2, 0x2
    //         if-nez v0, :cond_2
    //         mul-long v0, p0, p0
    //         rem-long/2addr v0, v4
    //         div-int/lit8 v2, p2, 0x2
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/as;->a(JI)J
    //         move-result-wide v0
    //         rem-long p0, v0, v4
    //         goto :goto_0
    //         :cond_2
    //         mul-long v0, p0, p0
    //         rem-long/2addr v0, v4
    //         div-int/lit8 v2, p2, 0x2
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/as;->a(JI)J
    //         move-result-wide v0
    //         rem-long/2addr v0, v4
    //         mul-long/2addr v0, p0
    //         rem-long p0, v0, v4
    //         goto :goto_0
    */

    @JvmStatic fun a(p0: Array<String>, p1: Int, p2: Int): String { return TODO("body: ([Ljava/lang/String;II)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         array-length v0, p0
    //         add-int v1, p1, p2
    //         if-ge v0, v1, :cond_0
    //         const-string v0, "Unable to construct shingle"
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/lang/StringBuffer;
    //         invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
    //         move v0, p1
    //         :goto_1
    //         add-int v2, p1, p2
    //         add-int/lit8 v2, v2, -0x1
    //         if-ge v0, v2, :cond_1
    //         aget-object v2, p0, v0
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         const/16 v2, 0x20
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_1
    //         add-int v0, p1, p2
    //         add-int/lit8 v0, v0, -0x1
    //         aget-object v0, p0, v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private @JvmStatic fun a(p0: Int, p1: Long, p2: Int, p3: Array<String>, p4: Int, p5: java.util.PriorityQueue) { /* TODO(body): (IJI[Ljava/lang/String;ILjava/util/PriorityQueue;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(IJI[",
    //                 "Ljava/lang/String;",
    //                 "I",
    //                 "Ljava/util/PriorityQueue",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/as$a;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/as$a;
    //         invoke-static {p4, p3, p5}, Lcom/google/android/gms/internal/as;->a([Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/as$a;-><init>(JLjava/lang/String;)V
    //         invoke-virtual {p6, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z
    //         invoke-virtual {p6}, Ljava/util/PriorityQueue;->size()I
    //         move-result v0
    //         if-le v0, p0, :cond_0
    //         invoke-virtual {p6}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun a(p0: Array<String>, p1: Int, p2: Int, p3: java.util.PriorityQueue) { /* TODO(body): ([Ljava/lang/String;IILjava/util/PriorityQueue;)V */ }
    /*
    //         .locals 16
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([",
    //                 "Ljava/lang/String;",
    //                 "II",
    //                 "Ljava/util/PriorityQueue",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/as$a;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         move-object/from16 v0, p0
    //         move/from16 v1, p2
    //         invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/as;->b([Ljava/lang/String;II)J
    //         move-result-wide v4
    //         const/4 v6, 0x0
    //         move/from16 v3, p1
    //         move-object/from16 v7, p0
    //         move/from16 v8, p2
    //         move-object/from16 v9, p3
    //         invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/as;->a(IJI[Ljava/lang/String;ILjava/util/PriorityQueue;)V
    //         const-wide/32 v2, 0x1001fff
    //         add-int/lit8 v6, p2, -0x1
    //         invoke-static {v2, v3, v6}, Lcom/google/android/gms/internal/as;->a(JI)J
    //         move-result-wide v6
    //         const/4 v12, 0x1
    //         :goto_0
    //         move-object/from16 v0, p0
    //         array-length v2, v0
    //         sub-int v2, v2, p2
    //         add-int/lit8 v2, v2, 0x1
    //         if-ge v12, v2, :cond_0
    //         add-int/lit8 v2, v12, -0x1
    //         aget-object v2, p0, v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/aq;->o(Ljava/lang/String;)I
    //         move-result v2
    //         add-int v3, v12, p2
    //         add-int/lit8 v3, v3, -0x1
    //         aget-object v3, p0, v3
    //         invoke-static {v3}, Lcom/google/android/gms/internal/aq;->o(Ljava/lang/String;)I
    //         move-result v3
    //         const-wide/32 v8, 0x1001fff
    //         invoke-static/range {v2 .. v9}, Lcom/google/android/gms/internal/as;->a(IIJJJ)J
    //         move-result-wide v10
    //         move/from16 v9, p1
    //         move-object/from16 v13, p0
    //         move/from16 v14, p2
    //         move-object/from16 v15, p3
    //         invoke-static/range {v9 .. v15}, Lcom/google/android/gms/internal/as;->a(IJI[Ljava/lang/String;ILjava/util/PriorityQueue;)V
    //         add-int/lit8 v12, v12, 0x1
    //         move-wide v4, v10
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    private @JvmStatic fun b(p0: Array<String>, p1: Int, p2: Int): Long { return TODO("body: ([Ljava/lang/String;II)J") }
    /*
    //         .locals 10
    //         const-wide/32 v8, 0x7fffffff
    //         const-wide/32 v6, 0x4000ffff
    //         aget-object v0, p0, p1
    //         invoke-static {v0}, Lcom/google/android/gms/internal/aq;->o(Ljava/lang/String;)I
    //         move-result v0
    //         int-to-long v0, v0
    //         add-long/2addr v0, v8
    //         rem-long v2, v0, v6
    //         add-int/lit8 v0, p1, 0x1
    //         :goto_0
    //         add-int v1, p1, p2
    //         if-ge v0, v1, :cond_0
    //         const-wide/32 v4, 0x1001fff
    //         mul-long/2addr v2, v4
    //         rem-long/2addr v2, v6
    //         aget-object v1, p0, v0
    //         invoke-static {v1}, Lcom/google/android/gms/internal/aq;->o(Ljava/lang/String;)I
    //         move-result v1
    //         int-to-long v4, v1
    //         add-long/2addr v4, v8
    //         rem-long/2addr v4, v6
    //         add-long/2addr v2, v4
    //         rem-long/2addr v2, v6
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-wide v2
    */

    }
}
