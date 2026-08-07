package android.support.v4.text

// Auto-emitted from smali source: TextDirectionHeuristicsCompat.java.
// 1 fields, 3 methods.

open class TextDirectionHeuristicsCompat_FirstStrong: android.support.v4.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
    private constructor()

    public fun checkRtl(cs: CharSequence, start: Int, count: Int): Int { return TODO("body: (Ljava/lang/CharSequence;II)I") }
    /*
    //         .locals 4
    //         const/4 v2, 0x2
    //         .local v2, "result":I
    //         move v1, p2
    //         .local v1, "i":I
    //         add-int v0, p2, p3
    //         .local v0, "e":I
    //         :goto_0
    //         if-ge v1, v0, :cond_0
    //         const/4 v3, 0x2
    //         if-ne v2, v3, :cond_0
    //         invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Character;->getDirectionality(C)B
    //         move-result v3
    //         invoke-static {v3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->access$100(I)I
    //         move-result v2
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return v2
    */

    companion object {
    @JvmField public val INSTANCE: android.support.v4.text.TextDirectionHeuristicsCompat.FirstStrong = null!!
    }
}
