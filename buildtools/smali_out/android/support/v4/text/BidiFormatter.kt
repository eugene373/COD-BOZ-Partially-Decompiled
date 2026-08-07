package android.support.v4.text

// Auto-emitted from smali source: BidiFormatter.java.
// 19 fields, 22 methods.

class BidiFormatter {
    private val mDefaultTextDirectionHeuristicCompat: android.support.v4.text.TextDirectionHeuristicCompat
    private val mFlags: Int
    private val mIsRtlContext: Boolean

    private constructor(isRtlContext: Boolean, flags: Int, heuristic: android.support.v4.text.TextDirectionHeuristicCompat)

    constructor(x0: Boolean, x1: Int, x2: android.support.v4.text.TextDirectionHeuristicCompat, x3: android.support.v4.text.BidiFormatter.1)

    private fun markAfter(str: String, heuristic: android.support.v4.text.TextDirectionHeuristicCompat): String { return TODO("body: (Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-interface {p2, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
    //         move-result v0
    //         .local v0, "isRtl":Z
    //         iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
    //         if-nez v1, :cond_1
    //         if-nez v0, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getExitDir(Ljava/lang/String;)I
    //         move-result v1
    //         const/4 v2, 0x1
    //         if-ne v1, v2, :cond_1
    //         :cond_0
    //         sget-object v1, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
    //         if-eqz v1, :cond_3
    //         if-eqz v0, :cond_2
    //         invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getExitDir(Ljava/lang/String;)I
    //         move-result v1
    //         const/4 v2, -0x1
    //         if-ne v1, v2, :cond_3
    //         :cond_2
    //         sget-object v1, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_3
    //         const-string v1, ""
    //         goto :goto_0
    */

    private fun markBefore(str: String, heuristic: android.support.v4.text.TextDirectionHeuristicCompat): String { return TODO("body: (Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-interface {p2, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
    //         move-result v0
    //         .local v0, "isRtl":Z
    //         iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
    //         if-nez v1, :cond_1
    //         if-nez v0, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getEntryDir(Ljava/lang/String;)I
    //         move-result v1
    //         const/4 v2, 0x1
    //         if-ne v1, v2, :cond_1
    //         :cond_0
    //         sget-object v1, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
    //         if-eqz v1, :cond_3
    //         if-eqz v0, :cond_2
    //         invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getEntryDir(Ljava/lang/String;)I
    //         move-result v1
    //         const/4 v2, -0x1
    //         if-ne v1, v2, :cond_3
    //         :cond_2
    //         sget-object v1, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_3
    //         const-string v1, ""
    //         goto :goto_0
    */

    public fun getStereoReset(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/text/BidiFormatter;->mFlags:I
    //         and-int/lit8 v0, v0, 0x2
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isRtl(str: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-interface {v0, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
    //         move-result v0
    //         return v0
    */

    public fun isRtlContext(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
    //         return v0
    */

    public fun unicodeWrap(str: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         const/4 v1, 0x1
    //         invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun unicodeWrap(str: String, heuristic: android.support.v4.text.TextDirectionHeuristicCompat): String { return TODO("body: (Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun unicodeWrap(str: String, heuristic: android.support.v4.text.TextDirectionHeuristicCompat, isolate: Boolean): String { return TODO("body: (Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v3
    //         invoke-interface {p2, p1, v2, v3}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
    //         move-result v0
    //         .local v0, "isRtl":Z
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         .local v1, "result":Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter;->getStereoReset()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         if-eqz p3, :cond_0
    //         if-eqz v0, :cond_2
    //         sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         :goto_0
    //         invoke-direct {p0, p1, v2}, Landroid/support/v4/text/BidiFormatter;->markBefore(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         iget-boolean v2, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
    //         if-eq v0, v2, :cond_4
    //         if-eqz v0, :cond_3
    //         const/16 v2, 0x202b
    //         :goto_1
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const/16 v2, 0x202c
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         :goto_2
    //         if-eqz p3, :cond_1
    //         if-eqz v0, :cond_5
    //         sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         :goto_3
    //         invoke-direct {p0, p1, v2}, Landroid/support/v4/text/BidiFormatter;->markAfter(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         return-object v2
    //         :cond_2
    //         sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         goto :goto_0
    //         :cond_3
    //         const/16 v2, 0x202a
    //         goto :goto_1
    //         :cond_4
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_2
    //         :cond_5
    //         sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         goto :goto_3
    */

    public fun unicodeWrap(str: String, isolate: Boolean): String { return TODO("body: (Ljava/lang/String;Z)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         invoke-virtual {p0, p1, v0, p2}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val DEFAULT_FLAGS: Int = 0x2
    private val DEFAULT_LTR_INSTANCE: android.support.v4.text.BidiFormatter = null!!
    private val DEFAULT_RTL_INSTANCE: android.support.v4.text.BidiFormatter = null!!
    private var DEFAULT_TEXT_DIRECTION_HEURISTIC: android.support.v4.text.TextDirectionHeuristicCompat
    private val DIR_LTR: Int = 0
    private val DIR_RTL: Int = 0x1
    private val DIR_UNKNOWN: Int = 0x0
    private val EMPTY_STRING: String = ""
    private val FLAG_STEREO_RESET: Int = 0x2
    private val LRE: Char = '\u0000'
    private val LRM: Char = '\u0000'
    private val LRM_STRING: String = null!!
    private val PDF: Char = '\u0000'
    private val RLE: Char = '\u0000'
    private val RLM: Char = '\u0000'
    private val RLM_STRING: String = null!!

    private @JvmStatic fun getEntryDir(str: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;-><init>(Ljava/lang/String;Z)V
    //         invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getEntryDir()I
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun getExitDir(str: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;-><init>(Ljava/lang/String;Z)V
    //         invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getExitDir()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getInstance(): android.support.v4.text.BidiFormatter { return TODO("body: ()Landroid/support/v4/text/BidiFormatter;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;
    //         invoke-direct {v0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>()V
    //         invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getInstance(locale: java.util.Locale): android.support.v4.text.BidiFormatter { return TODO("body: (Ljava/util/Locale;)Landroid/support/v4/text/BidiFormatter;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;
    //         invoke-direct {v0, p0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>(Ljava/util/Locale;)V
    //         invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getInstance(rtlContext: Boolean): android.support.v4.text.BidiFormatter { return TODO("body: (Z)Landroid/support/v4/text/BidiFormatter;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;
    //         invoke-direct {v0, p0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>(Z)V
    //         invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun isRtlLocale(locale: java.util.Locale): Boolean { return TODO("body: (Ljava/util/Locale;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-static {p0}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
