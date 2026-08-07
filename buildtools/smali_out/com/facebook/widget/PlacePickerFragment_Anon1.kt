package com.facebook.widget

// Auto-emitted from smali source: PlacePickerFragment.java.
// 1 fields, 6 methods.

open class PlacePickerFragment_Anon1: com.facebook.widget.PickerFragment.PickerFragmentAdapter() {
    val this$0: com.facebook.widget.PlacePickerFragment

    constructor(p0: com.facebook.widget.PlacePickerFragment, p1: android.content.Context)

    protected fun getDefaultPicture(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_place_default_icon:I
    //         return v0
    */

    protected fun getGraphObjectRowLayoutId(p0: com.facebook.model.GraphObject): Int { return TODO("body: (Lcom/facebook/model/GraphObject;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Lcom/facebook/model/GraphPlace;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/PlacePickerFragment$1;->getGraphObjectRowLayoutId(Lcom/facebook/model/GraphPlace;)I
    //         move-result v0
    //         return v0
    */

    protected fun getGraphObjectRowLayoutId(p0: com.facebook.model.GraphPlace): Int { return TODO("body: (Lcom/facebook/model/GraphPlace;)I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$layout;->com_facebook_placepickerfragment_list_row:I
    //         return v0
    */

    protected fun getSubTitleOfGraphObject(p0: com.facebook.model.GraphObject): CharSequence { return TODO("body: (Lcom/facebook/model/GraphObject;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p1, Lcom/facebook/model/GraphPlace;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/PlacePickerFragment$1;->getSubTitleOfGraphObject(Lcom/facebook/model/GraphPlace;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getSubTitleOfGraphObject(p0: com.facebook.model.GraphPlace): CharSequence { return TODO("body: (Lcom/facebook/model/GraphPlace;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         const/4 v5, 0x0
    //         invoke-interface {p1}, Lcom/facebook/model/GraphPlace;->getCategory()Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "were_here_count"
    //         invoke-interface {p1, v0}, Lcom/facebook/model/GraphPlace;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         const/4 v1, 0x0
    //         if-eqz v2, :cond_0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment$1;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         sget v3, Lcom/facebook/android/R$string;->com_facebook_placepicker_subtitle_format:I
    //         const/4 v4, 0x2
    //         new-array v4, v4, [Ljava/lang/Object;
    //         aput-object v2, v4, v5
    //         aput-object v0, v4, v6
    //         invoke-virtual {v1, v3, v4}, Lcom/facebook/widget/PlacePickerFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         if-nez v2, :cond_1
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment$1;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         sget v2, Lcom/facebook/android/R$string;->com_facebook_placepicker_subtitle_were_here_only_format:I
    //         new-array v3, v6, [Ljava/lang/Object;
    //         aput-object v0, v3, v5
    //         invoke-virtual {v1, v2, v3}, Lcom/facebook/widget/PlacePickerFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         if-eqz v2, :cond_2
    //         if-nez v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$1;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         sget v1, Lcom/facebook/android/R$string;->com_facebook_placepicker_subtitle_catetory_only_format:I
    //         new-array v3, v6, [Ljava/lang/Object;
    //         aput-object v2, v3, v5
    //         invoke-virtual {v0, v1, v3}, Lcom/facebook/widget/PlacePickerFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    */

}
