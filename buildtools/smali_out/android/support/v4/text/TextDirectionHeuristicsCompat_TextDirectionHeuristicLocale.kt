package android.support.v4.text

// Auto-emitted from smali source: TextDirectionHeuristicsCompat.java.
// 1 fields, 3 methods.

open class TextDirectionHeuristicsCompat_TextDirectionHeuristicLocale: android.support.v4.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl() {
    public constructor()

    protected fun defaultIsRtl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v2
    //         invoke-static {v2}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I
    //         move-result v0
    //         .local v0, "dir":I
    //         if-ne v0, v1, :cond_0
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val INSTANCE: android.support.v4.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale = null!!
    }
}
