package com.facebook.widget

// Auto-emitted from smali source: FriendPickerFragment.java.
// 1 fields, 4 methods.

open class FriendPickerFragment_Anon1: com.facebook.widget.PickerFragment.PickerFragmentAdapter() {
    val this$0: com.facebook.widget.FriendPickerFragment

    constructor(p0: com.facebook.widget.FriendPickerFragment, p1: android.content.Context)

    protected fun getDefaultPicture(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_profile_default_icon:I
    //         return v0
    */

    protected fun getGraphObjectRowLayoutId(p0: com.facebook.model.GraphObject): Int { return TODO("body: (Lcom/facebook/model/GraphObject;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Lcom/facebook/model/GraphUser;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FriendPickerFragment$1;->getGraphObjectRowLayoutId(Lcom/facebook/model/GraphUser;)I
    //         move-result v0
    //         return v0
    */

    protected fun getGraphObjectRowLayoutId(p0: com.facebook.model.GraphUser): Int { return TODO("body: (Lcom/facebook/model/GraphUser;)I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$layout;->com_facebook_picker_list_row:I
    //         return v0
    */

}
