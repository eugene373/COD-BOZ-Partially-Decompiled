package com.google.android.gms.wallet.fragment

// Auto-emitted from smali.
// 8 fields, 6 methods.

open class Dimension {
    private constructor()

    companion object {
    @JvmField public val MATCH_PARENT: Int = 0
    @JvmField public val UNIT_DIP: Int = 0x1
    @JvmField public val UNIT_IN: Int = 0x4
    @JvmField public val UNIT_MM: Int = 0x5
    @JvmField public val UNIT_PT: Int = 0x3
    @JvmField public val UNIT_PX: Int = 0x0
    @JvmField public val UNIT_SP: Int = 0x2
    @JvmField public val WRAP_CONTENT: Int = 0

    public @JvmStatic fun a(p0: Long, p1: android.util.DisplayMetrics): Int { return TODO("body: (JLandroid/util/DisplayMetrics;)I") }
    /*
    //         .locals 4
    //         const/16 v0, 0x20
    //         ushr-long v0, p0, v0
    //         long-to-int v0, v0
    //         long-to-int v1, p0
    //         sparse-switch v0, :sswitch_data_0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unexpected unit or type: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :sswitch_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :sswitch_1
    //         invoke-static {v1, p2}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I
    //         move-result v0
    //         goto :goto_0
    //         :sswitch_2
    //         const/4 v0, 0x0
    //         :goto_1
    //         invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F
    //         move-result v1
    //         invoke-static {v0, v1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Math;->round(F)I
    //         move-result v0
    //         goto :goto_0
    //         :sswitch_3
    //         const/4 v0, 0x1
    //         goto :goto_1
    //         :sswitch_4
    //         const/4 v0, 0x2
    //         goto :goto_1
    //         :sswitch_5
    //         const/4 v0, 0x3
    //         goto :goto_1
    //         :sswitch_6
    //         const/4 v0, 0x4
    //         goto :goto_1
    //         :sswitch_7
    //         const/4 v0, 0x5
    //         goto :goto_1
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_2
    //             0x1 -> :sswitch_3
    //             0x2 -> :sswitch_4
    //             0x3 -> :sswitch_5
    //             0x4 -> :sswitch_6
    //             0x5 -> :sswitch_7
    //             0x80 -> :sswitch_1
    //             0x81 -> :sswitch_0
    //         .end sparse-switch
    */

    public @JvmStatic fun a(p0: Int, p1: Float): Long { return TODO("body: (IF)J") }
    /*
    //         .locals 3
    //         packed-switch p0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unrecognized unit: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/wallet/fragment/Dimension;->o(II)J
    //         move-result-wide v0
    //         return-wide v0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //         .end packed-switch
    */

    public @JvmStatic fun a(p0: android.util.TypedValue): Long { return TODO("body: (Landroid/util/TypedValue;)J") }
    /*
    //         .locals 3
    //         iget v0, p0, Landroid/util/TypedValue;->type:I
    //         sparse-switch v0, :sswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unexpected dimension type: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Landroid/util/TypedValue;->type:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :sswitch_0
    //         iget v0, p0, Landroid/util/TypedValue;->data:I
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/Dimension;->fE(I)J
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :sswitch_1
    //         const/16 v0, 0x80
    //         iget v1, p0, Landroid/util/TypedValue;->data:I
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/Dimension;->o(II)J
    //         move-result-wide v0
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x5 -> :sswitch_1
    //             0x10 -> :sswitch_0
    //         .end sparse-switch
    */

    public @JvmStatic fun fE(p0: Int): Long { return TODO("body: (I)J") }
    /*
    //         .locals 3
    //         if-gez p0, :cond_2
    //         const/4 v0, -0x1
    //         if-eq p0, v0, :cond_0
    //         const/4 v0, -0x2
    //         if-ne p0, v0, :cond_1
    //         :cond_0
    //         const/16 v0, 0x81
    //         invoke-static {v0, p0}, Lcom/google/android/gms/wallet/fragment/Dimension;->o(II)J
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unexpected dimension value: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         const/4 v0, 0x0
    //         int-to-float v1, p0
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/Dimension;->a(IF)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    private @JvmStatic fun o(p0: Int, p1: Int): Long { return TODO("body: (II)J") }
    /*
    //         .locals 6
    //         int-to-long v0, p0
    //         const/16 v2, 0x20
    //         shl-long/2addr v0, v2
    //         int-to-long v2, p1
    //         const-wide v4, 0xffffffffL
    //         and-long/2addr v2, v4
    //         or-long/2addr v0, v2
    //         return-wide v0
    */

    }
}
