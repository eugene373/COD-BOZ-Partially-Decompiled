package com.facebook.widget

// Auto-emitted from smali source: PickerFragment.java.
// 1 fields, 5 methods.

open class PickerFragment_LoadingStrategy_Anon1: android.support.v4.app.LoaderManager.LoaderCallbacks {
    val this$1: com.facebook.widget.PickerFragment.LoadingStrategy

    constructor(p0: com.facebook.widget.PickerFragment.LoadingStrategy)

    public fun onCreateLoader(p0: Int, p1: android.os.Bundle): android.support.v4.content.Loader { return TODO("body: (ILandroid/os/Bundle;)Landroid/support/v4/content/Loader;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I",
    //                 "Landroid/os/Bundle;",
    //                 ")",
    //                 "Landroid/support/v4/content/Loader",
    //                 "<",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->onCreateLoader()Lcom/facebook/widget/GraphObjectPagingLoader;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onLoadFinished(p0: android.support.v4.content.Loader, p1: com.facebook.widget.SimpleGraphObjectCursor) { /* TODO(body): (Landroid/support/v4/content/Loader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/support/v4/content/Loader",
    //                 "<",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;>;",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         iget-object v0, v0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         if-eq p1, v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Received callback for unknown loader."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         check-cast p1, Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {v0, p1, p2}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->onLoadFinished(Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         return-void
    */

    public fun onLoadFinished(p0: android.support.v4.content.Loader, p1: Object) { /* TODO(body): (Landroid/support/v4/content/Loader;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p2, Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         invoke-virtual {p0, p1, p2}, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;->onLoadFinished(Landroid/support/v4/content/Loader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         return-void
    */

    public fun onLoaderReset(p0: android.support.v4.content.Loader) { /* TODO(body): (Landroid/support/v4/content/Loader;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/support/v4/content/Loader",
    //                 "<",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;>;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         iget-object v0, v0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         if-eq p1, v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Received callback for unknown loader."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         check-cast p1, Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->onLoadReset(Lcom/facebook/widget/GraphObjectPagingLoader;)V
    //         return-void
    */

}
