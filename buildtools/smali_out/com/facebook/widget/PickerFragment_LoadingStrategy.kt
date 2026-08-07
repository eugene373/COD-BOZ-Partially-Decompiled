package com.facebook.widget

// Auto-emitted from smali source: PickerFragment.java.
// 4 fields, 11 methods.

open class PickerFragment_LoadingStrategy {
    protected var adapter: com.facebook.widget.GraphObjectAdapter
    protected var loader: com.facebook.widget.GraphObjectPagingLoader
    val this$0: com.facebook.widget.PickerFragment

    constructor(p0: com.facebook.widget.PickerFragment)

    public fun attach(p0: com.facebook.widget.GraphObjectAdapter) { /* TODO(body): (Lcom/facebook/widget/GraphObjectAdapter;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectAdapter",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PickerFragment;->getLoaderManager()Landroid/support/v4/app/LoaderManager;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         const/4 v2, 0x0
    //         new-instance v3, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;
    //         invoke-direct {v3, p0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy$1;-><init>(Lcom/facebook/widget/PickerFragment$LoadingStrategy;)V
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/LoaderManager;->initLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/GraphObjectPagingLoader;
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         new-instance v1, Lcom/facebook/widget/PickerFragment$LoadingStrategy$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy$2;-><init>(Lcom/facebook/widget/PickerFragment$LoadingStrategy;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->setOnErrorListener(Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;)V
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->getCursor()Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->changeCursor(Lcom/facebook/widget/GraphObjectCursor;)Z
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         new-instance v1, Lcom/facebook/widget/PickerFragment$LoadingStrategy$3;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy$3;-><init>(Lcom/facebook/widget/PickerFragment$LoadingStrategy;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->setOnErrorListener(Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;)V
    //         return-void
    */

    protected fun canSkipRoundTripIfCached(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun clearResults() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->clearResults()V
    //         :cond_0
    //         return-void
    */

    public fun detach() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->setDataNeededListener(Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->setOnErrorListener(Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->setOnErrorListener(Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;)V
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         return-void
    */

    public fun isDataPresentOrLoading(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->isLoading()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun onCreateLoader(): com.facebook.widget.GraphObjectPagingLoader { return TODO("body: ()Lcom/facebook/widget/GraphObjectPagingLoader;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/GraphObjectPagingLoader",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/widget/GraphObjectPagingLoader;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    //         invoke-virtual {v1}, Lcom/facebook/widget/PickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    //         invoke-static {v2}, Lcom/facebook/widget/PickerFragment;->access$600(Lcom/facebook/widget/PickerFragment;)Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/widget/GraphObjectPagingLoader;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         return-object v0
    */

    protected fun onLoadFinished(p0: com.facebook.widget.GraphObjectPagingLoader, p1: com.facebook.widget.SimpleGraphObjectCursor) { /* TODO(body): (Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectPagingLoader",
    //                 "<TT;>;",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    //         invoke-virtual {v0, p2}, Lcom/facebook/widget/PickerFragment;->updateAdapter(Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         return-void
    */

    protected fun onLoadReset(p0: com.facebook.widget.GraphObjectPagingLoader) { /* TODO(body): (Lcom/facebook/widget/GraphObjectPagingLoader;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectPagingLoader",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->changeCursor(Lcom/facebook/widget/GraphObjectCursor;)Z
    //         return-void
    */

    protected fun onStartLoading(p0: com.facebook.widget.GraphObjectPagingLoader, p1: com.facebook.Request) { /* TODO(body): (Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/Request;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectPagingLoader",
    //                 "<TT;>;",
    //                 "Lcom/facebook/Request;",
    //                 ")V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PickerFragment;->displayActivityCircle()V
    //         return-void
    */

    public fun startLoading(p0: com.facebook.Request) { /* TODO(body): (Lcom/facebook/Request;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->canSkipRoundTripIfCached()Z
    //         move-result v1
    //         invoke-virtual {v0, p1, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->startLoading(Lcom/facebook/Request;Z)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;
    //         invoke-virtual {p0, v0, p1}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->onStartLoading(Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/Request;)V
    //         :cond_0
    //         return-void
    */

    companion object {
    @JvmField protected val CACHED_RESULT_REFRESH_DELAY: Int = 0x7d0
    }
}
