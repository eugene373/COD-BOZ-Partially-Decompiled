package com.facebook.widget

// Auto-emitted from smali source: PlacePickerFragment.java.
// 1 fields, 5 methods.

open class PlacePickerFragment_SearchTextWatcher: android.text.TextWatcher {
    val this$0: com.facebook.widget.PlacePickerFragment

    private constructor(p0: com.facebook.widget.PlacePickerFragment)

    constructor(p0: com.facebook.widget.PlacePickerFragment, p1: com.facebook.widget.PlacePickerFragment.1)

    public fun afterTextChanged(p0: android.text.Editable) { /* TODO(body): (Landroid/text/Editable;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun beforeTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int) { /* TODO(body): (Ljava/lang/CharSequence;III)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int) { /* TODO(body): (Ljava/lang/CharSequence;III)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$SearchTextWatcher;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Lcom/facebook/widget/PlacePickerFragment;->onSearchBoxTextChanged(Ljava/lang/String;Z)V
    //         return-void
    */

}
