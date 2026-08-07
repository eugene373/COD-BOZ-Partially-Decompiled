package com.facebook.widget

// Auto-emitted from smali source: PickerFragment.java.
// 1 fields, 3 methods.

open class PickerFragment_PickerFragmentAdapter: com.facebook.widget.GraphObjectAdapter() {
    val this$0: com.facebook.widget.PickerFragment

    public constructor(p0: com.facebook.widget.PickerFragment, p1: android.content.Context)

    fun isGraphObjectSelected(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->this$0:Lcom/facebook/widget/PickerFragment;
    //         invoke-static {v0}, Lcom/facebook/widget/PickerFragment;->access$700(Lcom/facebook/widget/PickerFragment;)Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->isSelected(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    fun updateCheckboxState(p0: android.widget.CheckBox, p1: Boolean) { /* TODO(body): (Landroid/widget/CheckBox;Z)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V
    //         if-nez p2, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->this$0:Lcom/facebook/widget/PickerFragment;
    //         invoke-static {v0}, Lcom/facebook/widget/PickerFragment;->access$700(Lcom/facebook/widget/PickerFragment;)Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->shouldShowCheckBoxIfUnselected()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setVisibility(I)V
    //         return-void
    //         :cond_1
    //         const/16 v0, 0x8
    //         goto :goto_0
    */

}
