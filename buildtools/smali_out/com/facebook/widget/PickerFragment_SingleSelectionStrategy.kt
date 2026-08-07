package com.facebook.widget

// Auto-emitted from smali source: PickerFragment.java.
// 2 fields, 9 methods.

open class PickerFragment_SingleSelectionStrategy: com.facebook.widget.PickerFragment.SelectionStrategy() {
    private var selectedId: String
    val this$0: com.facebook.widget.PickerFragment

    constructor(p0: com.facebook.widget.PickerFragment)

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         return-void
    */

    public fun getSelectedIds(): java.util.Collection { return TODO("body: ()Ljava/util/Collection;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Ljava/lang/String;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun isSelected(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun readSelectionFromBundle(p0: android.os.Bundle, p1: String) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         :cond_0
    //         return-void
    */

    fun saveSelectionToBundle(p0: android.os.Bundle, p1: String) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    fun shouldShowCheckBoxIfUnselected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun toggleSelection(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;->selectedId:Ljava/lang/String;
    //         goto :goto_0
    */

}
