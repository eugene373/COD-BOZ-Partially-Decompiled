package android.support.v4.text

// Auto-emitted from smali source: BidiFormatter.java.
// 3 fields, 8 methods.

class BidiFormatter_Builder {
    private var mFlags: Int
    private var mIsRtlContext: Boolean
    private var mTextDirectionHeuristicCompat: android.support.v4.text.TextDirectionHeuristicCompat

    public constructor()

    public constructor(locale: java.util.Locale)

    public constructor(rtlContext: Boolean)

    private fun initialize(isRtlContext: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iput-boolean p1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z
    //         invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         const/4 v0, 0x2
    //         iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
    //         return-void
    */

    public fun build(): android.support.v4.text.BidiFormatter { return TODO("body: ()Landroid/support/v4/text/BidiFormatter;") }
    /*
    //         .locals 5
    //         iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z
    //         invoke-static {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->getDefaultInstanceFromContext(Z)Landroid/support/v4/text/BidiFormatter;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/text/BidiFormatter;
    //         iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z
    //         iget v2, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
    //         iget-object v3, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         const/4 v4, 0x0
    //         invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;Landroid/support/v4/text/BidiFormatter$1;)V
    //         goto :goto_0
    */

    public fun setTextDirectionHeuristic(heuristic: android.support.v4.text.TextDirectionHeuristicCompat): android.support.v4.text.BidiFormatter.Builder { return TODO("body: (Landroid/support/v4/text/TextDirectionHeuristicCompat;)Landroid/support/v4/text/BidiFormatter$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
    //         return-object p0
    */

    public fun stereoReset(stereoReset: Boolean): android.support.v4.text.BidiFormatter.Builder { return TODO("body: (Z)Landroid/support/v4/text/BidiFormatter$Builder;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
    //         or-int/lit8 v0, v0, 0x2
    //         iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
    //         and-int/lit8 v0, v0, -0x3
    //         iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
    //         goto :goto_0
    */

    companion object {
    private @JvmStatic fun getDefaultInstanceFromContext(isRtlContext: Boolean): android.support.v4.text.BidiFormatter { return TODO("body: (Z)Landroid/support/v4/text/BidiFormatter;") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$200()Landroid/support/v4/text/BidiFormatter;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$300()Landroid/support/v4/text/BidiFormatter;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
