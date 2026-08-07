package com.facebook.widget

// Auto-emitted from smali source: FriendPickerFragment.java.
// 1 fields, 5 methods.

open class FriendPickerFragment_ImmediateLoadingStrategy: com.facebook.widget.PickerFragment.LoadingStrategy() {
    val this$0: com.facebook.widget.FriendPickerFragment

    private constructor(p0: com.facebook.widget.FriendPickerFragment)

    constructor(p0: com.facebook.widget.FriendPickerFragment, p1: com.facebook.widget.FriendPickerFragment.1)

    private fun followNextLink() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->this$0:Lcom/facebook/widget/FriendPickerFragment;
    //         invoke-virtual {v0}, Lcom/facebook/widget/FriendPickerFragment;->displayActivityCircle()V
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->followNextLink()V
    //         return-void
    */

    protected fun canSkipRoundTripIfCached(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->this$0:Lcom/facebook/widget/FriendPickerFragment;
    //         invoke-static {v0}, Lcom/facebook/widget/FriendPickerFragment;->access$100(Lcom/facebook/widget/FriendPickerFragment;)Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->isCacheable()Z
    //         move-result v0
    //         return v0
    */

    protected fun onLoadFinished(p0: com.facebook.widget.GraphObjectPagingLoader, p1: com.facebook.widget.SimpleGraphObjectCursor) { /* TODO(body): (Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectPagingLoader",
    //                 "<",
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">;",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<",
    //                 "Lcom/facebook/model/GraphUser;",
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
    //         invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->areMoreObjectsAvailable()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-direct {p0}, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->followNextLink()V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->this$0:Lcom/facebook/widget/FriendPickerFragment;
    //         invoke-virtual {v0}, Lcom/facebook/widget/FriendPickerFragment;->hideActivityCircle()V
    //         invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->isFromCache()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v0
    //         if-nez v0, :cond_3
    //         const-wide/16 v0, 0x7d0
    //         :goto_1
    //         invoke-virtual {p1, v0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->refreshOriginalRequest(J)V
    //         goto :goto_0
    //         :cond_3
    //         const-wide/16 v0, 0x0
    //         goto :goto_1
    */

}
