package android.support.v4.view

// Auto-emitted from smali source: PagerTitleStripIcs.java.
// 2 fields, 2 methods.

open class PagerTitleStripIcs_SingleLineAllCapsTransform: android.text.method.SingleLineTransformationMethod() {
    private var mLocale: java.util.Locale

    public constructor(context: android.content.Context)

    public fun getTransformation(source: CharSequence, view: android.view.View): CharSequence { return TODO("body: (Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         invoke-super {p0, p1, p2}, Landroid/text/method/SingleLineTransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
    //         move-result-object p1
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;->mLocale:Ljava/util/Locale;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    private val TAG: String = "SingleLineAllCapsTransform"
    }
}
