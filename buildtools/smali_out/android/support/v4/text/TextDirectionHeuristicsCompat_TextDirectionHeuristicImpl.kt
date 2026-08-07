package android.support.v4.text

// Auto-emitted from smali source: TextDirectionHeuristicsCompat.java.
// 1 fields, 5 methods.

open class TextDirectionHeuristicsCompat_TextDirectionHeuristicImpl: android.support.v4.text.TextDirectionHeuristicCompat {
    private val mAlgorithm: android.support.v4.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm

    public constructor(algorithm: android.support.v4.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm)

    private fun doCheck(cs: CharSequence, start: Int, count: Int): Boolean { return TODO("body: (Ljava/lang/CharSequence;II)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;->checkRtl(Ljava/lang/CharSequence;II)I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         invoke-virtual {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->defaultIsRtl()Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :pswitch_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    protected fun defaultIsRtl(): Boolean

    public fun isRtl(cs: CharSequence, start: Int, count: Int): Boolean { return TODO("body: (Ljava/lang/CharSequence;II)Z") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         if-ltz p2, :cond_0
    //         if-ltz p3, :cond_0
    //         invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
    //         move-result v0
    //         sub-int/2addr v0, p3
    //         if-ge v0, p2, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
    //         if-nez v0, :cond_2
    //         invoke-virtual {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->defaultIsRtl()Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_2
    //         invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->doCheck(Ljava/lang/CharSequence;II)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun isRtl(array: CharArray, start: Int, count: Int): Boolean { return TODO("body: ([CII)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/nio/CharBuffer;->wrap([C)Ljava/nio/CharBuffer;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->isRtl(Ljava/lang/CharSequence;II)Z
    //         move-result v0
    //         return v0
    */

}
