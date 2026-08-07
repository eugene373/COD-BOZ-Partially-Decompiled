package com.facebook.widget

// Auto-emitted from smali source: PlacePickerFragment.java.
// 1 fields, 4 methods.

open class PlacePickerFragment_AsNeededLoadingStrategy: com.facebook.widget.PickerFragment.LoadingStrategy() {
    val this$0: com.facebook.widget.PlacePickerFragment

    private constructor(p0: com.facebook.widget.PlacePickerFragment)

    constructor(p0: com.facebook.widget.PlacePickerFragment, p1: com.facebook.widget.PlacePickerFragment.1)

    public fun attach(p0: com.facebook.widget.GraphObjectAdapter) { /* TODO(body): (Lcom/facebook/widget/GraphObjectAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectAdapter",
    //                 "<",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-super {p0, p1}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->attach(Lcom/facebook/widget/GraphObjectAdapter;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         new-instance v1, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy$1;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy$1;-><init>(Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->setDataNeededListener(Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;)V
    //         return-void
    */

    protected fun onLoadFinished(p0: com.facebook.widget.GraphObjectPagingLoader, p1: com.facebook.widget.SimpleGraphObjectCursor) { /* TODO(body): (Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectPagingLoader",
    //                 "<",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 ">;",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-super {p0, p1, p2}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->onLoadFinished(Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         if-eqz p2, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/widget/GraphObjectPagingLoader;->isLoading()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PlacePickerFragment;->hideActivityCircle()V
    //         invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->isFromCache()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->areMoreObjectsAvailable()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-wide/16 v0, 0x7d0
    //         :goto_1
    //         invoke-virtual {p1, v0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->refreshOriginalRequest(J)V
    //         goto :goto_0
    //         :cond_2
    //         const-wide/16 v0, 0x0
    //         goto :goto_1
    */

}
