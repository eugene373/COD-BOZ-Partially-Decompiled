package com.facebook.widget

// Auto-emitted from smali source: PickerFragment.java.
// 2 fields, 9 methods.

open class PickerFragment_MultiSelectionStrategy: com.facebook.widget.PickerFragment.SelectionStrategy() {
    private var selectedIds: java.util.Set
    val this$0: com.facebook.widget.PickerFragment

    constructor(p0: com.facebook.widget.PickerFragment)

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->clear()V
    //         return-void
    */

    public fun getSelectedIds(): java.util.Collection { return TODO("body: ()Ljava/util/Collection;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         return-object v0
    */

    fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z
    //         move-result v0
    //         return v0
    */

    fun isSelected(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
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
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v1, ","
    //         invoke-static {v0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v1}, Ljava/util/Set;->clear()V
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z
    //         :cond_0
    //         return-void
    */

    fun saveSelectionToBundle(p0: android.os.Bundle, p1: String) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, ","
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    fun shouldShowCheckBoxIfUnselected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    fun toggleSelection(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;->selectedIds:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    */

}
