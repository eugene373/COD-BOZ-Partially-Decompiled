package com.facebook.widget

// Auto-emitted from smali source: PickerFragment.java.
// 33 fields, 67 methods.

open class PickerFragment: android.support.v4.app.Fragment() {
    private var activityCircle: android.widget.ProgressBar
    var adapter: com.facebook.widget.GraphObjectAdapter
    private var appEventsLogged: Boolean
    private var doneButton: android.widget.Button
    private var doneButtonBackground: android.graphics.drawable.Drawable
    private var doneButtonText: String
    var extraFields: java.util.HashSet
    private var filter: com.facebook.widget.PickerFragment.GraphObjectFilter
    private val graphObjectClass: Class
    private val layout: Int
    private var listView: android.widget.ListView
    private var loadingStrategy: com.facebook.widget.PickerFragment.LoadingStrategy
    private var onDataChangedListener: com.facebook.widget.PickerFragment.OnDataChangedListener
    private var onDoneButtonClickedListener: com.facebook.widget.PickerFragment.OnDoneButtonClickedListener
    private var onErrorListener: com.facebook.widget.PickerFragment.OnErrorListener
    private var onScrollListener: android.widget.AbsListView.OnScrollListener
    private var onSelectionChangedListener: com.facebook.widget.PickerFragment.OnSelectionChangedListener
    private var selectionHint: java.util.Set
    private var selectionStrategy: com.facebook.widget.PickerFragment.SelectionStrategy
    private var sessionTracker: com.facebook.internal.SessionTracker
    private var showPictures: Boolean
    private var showTitleBar: Boolean
    private var titleBarBackground: android.graphics.drawable.Drawable
    private var titleText: String
    private var titleTextView: android.widget.TextView

    constructor(p0: Class, p1: Int, p2: android.os.Bundle)

    private fun clearResults() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_0
    //         iget-object v3, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v3}, Lcom/facebook/widget/GraphObjectAdapter;->isEmpty()Z
    //         move-result v3
    //         if-nez v3, :cond_3
    //         :goto_1
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->loadingStrategy:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         invoke-virtual {v2}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->clearResults()V
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         invoke-virtual {v2}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->clear()V
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v2}, Lcom/facebook/widget/GraphObjectAdapter;->notifyDataSetChanged()V
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->onDataChangedListener:Lcom/facebook/widget/PickerFragment$OnDataChangedListener;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->onDataChangedListener:Lcom/facebook/widget/PickerFragment$OnDataChangedListener;
    //         invoke-interface {v1, p0}, Lcom/facebook/widget/PickerFragment$OnDataChangedListener;->onDataChanged(Lcom/facebook/widget/PickerFragment;)V
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         invoke-interface {v0, p0}, Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;->onSelectionChanged(Lcom/facebook/widget/PickerFragment;)V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         move v0, v2
    //         goto :goto_0
    //         :cond_3
    //         move v1, v2
    //         goto :goto_1
    */

    private fun inflateTitleBar(p0: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 4
    //         const/4 v2, -0x1
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_title_bar_stub:I
    //         invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/ViewStub;
    //         if-eqz v0, :cond_3
    //         invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;
    //         move-result-object v0
    //         new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
    //         invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
    //         const/4 v2, 0x3
    //         sget v3, Lcom/facebook/android/R$id;->com_facebook_picker_title_bar:I
    //         invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v2, v1}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->titleBarBackground:Landroid/graphics/drawable/Drawable;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->titleBarBackground:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    //         :cond_0
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_done_button:I
    //         invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/Button;
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButton:Landroid/widget/Button;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButton:Landroid/widget/Button;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButton:Landroid/widget/Button;
    //         new-instance v1, Lcom/facebook/widget/PickerFragment$5;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/PickerFragment$5;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getDoneButtonText()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButton:Landroid/widget/Button;
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getDoneButtonText()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButtonBackground:Landroid/graphics/drawable/Drawable;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButton:Landroid/widget/Button;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->doneButtonBackground:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    //         :cond_2
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_title:I
    //         invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/TextView;
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleTextView:Landroid/widget/TextView;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleTextView:Landroid/widget/TextView;
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getTitleText()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleTextView:Landroid/widget/TextView;
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getTitleText()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         :cond_3
    //         return-void
    */

    private fun loadDataSkippingRoundTripIfCached() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/facebook/widget/PickerFragment;->clearResults()V
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PickerFragment;->getRequestForLoadData(Lcom/facebook/Session;)Lcom/facebook/Request;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->onLoadingData()V
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->loadingStrategy:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         invoke-virtual {v1, v0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->startLoading(Lcom/facebook/Request;)V
    //         :cond_0
    //         return-void
    */

    private fun onListItemClick(p0: android.widget.ListView, p1: android.view.View, p2: Int) { /* TODO(body): (Landroid/widget/ListView;Landroid/view/View;I)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1, p3}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v1, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getIdOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         invoke-virtual {v1, v0}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->toggleSelection(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter;->notifyDataSetChanged()V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         invoke-interface {v0, p0}, Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;->onSelectionChanged(Lcom/facebook/widget/PickerFragment;)V
    //         :cond_0
    //         return-void
    */

    private fun reprioritizeDownloads() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v0}, Landroid/widget/ListView;->getLastVisiblePosition()I
    //         move-result v0
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v1}, Landroid/widget/ListView;->getFirstVisiblePosition()I
    //         move-result v1
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         const/4 v3, 0x5
    //         invoke-virtual {v2, v1, v0, v3}, Lcom/facebook/widget/GraphObjectAdapter;->prioritizeViewRange(III)V
    //         :cond_0
    //         return-void
    */

    private fun setPickerFragmentSettingsFromBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_2
    //         const-string v0, "com.facebook.widget.PickerFragment.ShowPictures"
    //         iget-boolean v1, p0, Lcom/facebook/widget/PickerFragment;->showPictures:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/facebook/widget/PickerFragment;->showPictures:Z
    //         const-string v0, "com.facebook.widget.PickerFragment.ExtraFields"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v1, ","
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PickerFragment;->setExtraFields(Ljava/util/Collection;)V
    //         :cond_0
    //         const-string v0, "com.facebook.widget.PickerFragment.ShowTitleBar"
    //         iget-boolean v1, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         const-string v0, "com.facebook.widget.PickerFragment.TitleText"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleTextView:Landroid/widget/TextView;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleTextView:Landroid/widget/TextView;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         :cond_1
    //         const-string v0, "com.facebook.widget.PickerFragment.DoneButtonText"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButton:Landroid/widget/Button;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButton:Landroid/widget/Button;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    //         :cond_2
    //         return-void
    */

    fun createAdapter(): com.facebook.widget.PickerFragment.PickerFragmentAdapter

    fun createLoadingStrategy(): com.facebook.widget.PickerFragment.LoadingStrategy

    fun createSelectionStrategy(): com.facebook.widget.PickerFragment.SelectionStrategy

    fun displayActivityCircle() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->layoutActivityCircle()V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
    //         :cond_0
    //         return-void
    */

    fun filterIncludesItem(p0: com.facebook.model.GraphObject): Boolean { return TODO("body: (Lcom/facebook/model/GraphObject;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)Z"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->filter:Lcom/facebook/widget/PickerFragment$GraphObjectFilter;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->filter:Lcom/facebook/widget/PickerFragment$GraphObjectFilter;
    //         invoke-interface {v0, p1}, Lcom/facebook/widget/PickerFragment$GraphObjectFilter;->includeItem(Ljava/lang/Object;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    fun getDefaultDoneButtonText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$string;->com_facebook_picker_done_button_text:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PickerFragment;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    fun getDefaultTitleText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getDoneButtonText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getDefaultDoneButtonText()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         return-object v0
    */

    public fun getExtraFields(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/HashSet;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->extraFields:Ljava/util/HashSet;
    //         invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    public fun getFilter(): com.facebook.widget.PickerFragment.GraphObjectFilter { return TODO("body: ()Lcom/facebook/widget/PickerFragment$GraphObjectFilter;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/PickerFragment$GraphObjectFilter",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->filter:Lcom/facebook/widget/PickerFragment$GraphObjectFilter;
    //         return-object v0
    */

    public fun getOnDataChangedListener(): com.facebook.widget.PickerFragment.OnDataChangedListener { return TODO("body: ()Lcom/facebook/widget/PickerFragment$OnDataChangedListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onDataChangedListener:Lcom/facebook/widget/PickerFragment$OnDataChangedListener;
    //         return-object v0
    */

    public fun getOnDoneButtonClickedListener(): com.facebook.widget.PickerFragment.OnDoneButtonClickedListener { return TODO("body: ()Lcom/facebook/widget/PickerFragment$OnDoneButtonClickedListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onDoneButtonClickedListener:Lcom/facebook/widget/PickerFragment$OnDoneButtonClickedListener;
    //         return-object v0
    */

    public fun getOnErrorListener(): com.facebook.widget.PickerFragment.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/PickerFragment$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onErrorListener:Lcom/facebook/widget/PickerFragment$OnErrorListener;
    //         return-object v0
    */

    public fun getOnSelectionChangedListener(): com.facebook.widget.PickerFragment.OnSelectionChangedListener { return TODO("body: ()Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         return-object v0
    */

    fun getRequestForLoadData(p0: com.facebook.Session): com.facebook.Request

    fun getSelectedGraphObjects(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         invoke-virtual {v1}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->getSelectedIds()Ljava/util/Collection;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->getGraphObjectsById(Ljava/util/Collection;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSession(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getShowPictures(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/PickerFragment;->showPictures:Z
    //         return v0
    */

    public fun getShowTitleBar(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         return v0
    */

    public fun getTitleText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getDefaultTitleText()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         return-object v0
    */

    fun hideActivityCircle() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         invoke-virtual {v0}, Landroid/widget/ProgressBar;->clearAnimation()V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         const/4 v1, 0x4
    //         invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
    //         :cond_0
    //         return-void
    */

    fun layoutActivityCircle() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/high16 v0, 0x3e800000    # 0.25f
    //         :goto_0
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         invoke-static {v1, v0}, Lcom/facebook/widget/PickerFragment;->setAlpha(Landroid/view/View;F)V
    //         return-void
    //         :cond_0
    //         const/high16 v0, 0x3f800000    # 1.0f
    //         goto :goto_0
    */

    public fun loadData(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/PickerFragment;->loadData(ZLjava/util/Set;)V
    //         return-void
    */

    public fun loadData(p0: Boolean, p1: java.util.Set) { /* TODO(body): (ZLjava/util/Set;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(Z",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         if-nez p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->loadingStrategy:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->isDataPresentOrLoading()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput-object p2, p0, Lcom/facebook/widget/PickerFragment;->selectionHint:Ljava/util/Set;
    //         invoke-direct {p0}, Lcom/facebook/widget/PickerFragment;->loadDataSkippingRoundTripIfCached()V
    //         goto :goto_0
    */

    fun logAppEvents(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onActivityCreated(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
    //         new-instance v0, Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/widget/PickerFragment$4;
    //         invoke-direct {v2, p0}, Lcom/facebook/widget/PickerFragment$4;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/internal/SessionTracker;-><init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;)V
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/PickerFragment;->setSettingsFromBundle(Landroid/os/Bundle;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->createLoadingStrategy()Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->loadingStrategy:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->loadingStrategy:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->attach(Lcom/facebook/widget/GraphObjectAdapter;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->createSelectionStrategy()Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         const-string v1, "com.facebook.android.PickerFragment.Selection"
    //         invoke-virtual {v0, p1, v1}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->readSelectionFromBundle(Landroid/os/Bundle;Ljava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->getView()Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/ViewGroup;
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/PickerFragment;->inflateTitleBar(Landroid/view/ViewGroup;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         if-eqz v0, :cond_1
    //         if-eqz p1, :cond_1
    //         const-string v0, "com.facebook.android.PickerFragment.ActivityCircleShown"
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->displayActivityCircle()V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->hideActivityCircle()V
    //         goto :goto_0
    */

    public fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/PickerFragment;->createAdapter()Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         new-instance v1, Lcom/facebook/widget/PickerFragment$1;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/PickerFragment$1;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->setFilter(Lcom/facebook/widget/GraphObjectAdapter$Filter;)V
    //         return-void
    */

    public fun onCreateView(p0: android.view.LayoutInflater, p1: android.view.ViewGroup, p2: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         iget v0, p0, Lcom/facebook/widget/PickerFragment;->layout:I
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/ViewGroup;
    //         sget v1, Lcom/facebook/android/R$id;->com_facebook_picker_list_view:I
    //         invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
    //         move-result-object v1
    //         check-cast v1, Landroid/widget/ListView;
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         new-instance v2, Lcom/facebook/widget/PickerFragment$2;
    //         invoke-direct {v2, p0}, Lcom/facebook/widget/PickerFragment$2;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         new-instance v2, Lcom/facebook/widget/PickerFragment$3;
    //         invoke-direct {v2, p0}, Lcom/facebook/widget/PickerFragment$3;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->onScrollListener:Landroid/widget/AbsListView$OnScrollListener;
    //         invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    //         sget v1, Lcom/facebook/android/R$id;->com_facebook_picker_activity_circle:I
    //         invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
    //         move-result-object v1
    //         check-cast v1, Landroid/widget/ProgressBar;
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PickerFragment;->setupViews(Landroid/view/ViewGroup;)V
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
    //         return-object v0
    */

    public fun onDetach() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->loadingStrategy:Lcom/facebook/widget/PickerFragment$LoadingStrategy;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->detach()V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->stopTracking()V
    //         return-void
    */

    public fun onInflate(p0: android.app.Activity, p1: android.util.AttributeSet, p2: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    //         sget-object v0, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment:[I
    //         invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment_show_pictures:I
    //         iget-boolean v2, p0, Lcom/facebook/widget/PickerFragment;->showPictures:Z
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/PickerFragment;->setShowPictures(Z)V
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment_extra_fields:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const-string v2, ","
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/PickerFragment;->setExtraFields(Ljava/util/Collection;)V
    //         :cond_0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment_show_title_bar:I
    //         iget-boolean v2, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v1
    //         iput-boolean v1, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment_title_text:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment_done_button_text:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment_title_bar_background:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment;->titleBarBackground:Landroid/graphics/drawable/Drawable;
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_picker_fragment_done_button_background:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/PickerFragment;->doneButtonBackground:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-void
    */

    fun onLoadingData() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onSaveInstanceState(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/PickerFragment;->saveSettingsToBundle(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         const-string v1, "com.facebook.android.PickerFragment.Selection"
    //         invoke-virtual {v0, p1, v1}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->saveSelectionToBundle(Landroid/os/Bundle;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         if-eqz v0, :cond_0
    //         const-string v1, "com.facebook.android.PickerFragment.ActivityCircleShown"
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->activityCircle:Landroid/widget/ProgressBar;
    //         invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/PickerFragment;->appEventsLogged:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PickerFragment;->logAppEvents(Z)V
    //         :cond_0
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V
    //         return-void
    */

    fun saveSettingsToBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "com.facebook.widget.PickerFragment.ShowPictures"
    //         iget-boolean v1, p0, Lcom/facebook/widget/PickerFragment;->showPictures:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->extraFields:Ljava/util/HashSet;
    //         invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "com.facebook.widget.PickerFragment.ExtraFields"
    //         const-string v1, ","
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->extraFields:Ljava/util/HashSet;
    //         invoke-static {v1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         const-string v0, "com.facebook.widget.PickerFragment.ShowTitleBar"
    //         iget-boolean v1, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         const-string v0, "com.facebook.widget.PickerFragment.TitleText"
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.widget.PickerFragment.DoneButtonText"
    //         iget-object v1, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setArguments(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/PickerFragment;->setSettingsFromBundle(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun setDoneButtonText(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->doneButtonText:Ljava/lang/String;
    //         return-void
    */

    public fun setExtraFields(p0: java.util.Collection) { /* TODO(body): (Ljava/util/Collection;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/HashSet;
    //         invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/widget/PickerFragment;->extraFields:Ljava/util/HashSet;
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->extraFields:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
    //         :cond_0
    //         return-void
    */

    public fun setFilter(p0: com.facebook.widget.PickerFragment.GraphObjectFilter) { /* TODO(body): (Lcom/facebook/widget/PickerFragment$GraphObjectFilter;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/PickerFragment$GraphObjectFilter",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->filter:Lcom/facebook/widget/PickerFragment$GraphObjectFilter;
    //         return-void
    */

    public fun setOnDataChangedListener(p0: com.facebook.widget.PickerFragment.OnDataChangedListener) { /* TODO(body): (Lcom/facebook/widget/PickerFragment$OnDataChangedListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->onDataChangedListener:Lcom/facebook/widget/PickerFragment$OnDataChangedListener;
    //         return-void
    */

    public fun setOnDoneButtonClickedListener(p0: com.facebook.widget.PickerFragment.OnDoneButtonClickedListener) { /* TODO(body): (Lcom/facebook/widget/PickerFragment$OnDoneButtonClickedListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->onDoneButtonClickedListener:Lcom/facebook/widget/PickerFragment$OnDoneButtonClickedListener;
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.PickerFragment.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/PickerFragment$OnErrorListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->onErrorListener:Lcom/facebook/widget/PickerFragment$OnErrorListener;
    //         return-void
    */

    public fun setOnSelectionChangedListener(p0: com.facebook.widget.PickerFragment.OnSelectionChangedListener) { /* TODO(body): (Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         return-void
    */

    fun setSelectedGraphObjects(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         invoke-virtual {v2, v0}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->isSelected(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         invoke-virtual {v2, v0}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->toggleSelection(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    fun setSelectionStrategy(p0: com.facebook.widget.PickerFragment.SelectionStrategy) { /* TODO(body): (Lcom/facebook/widget/PickerFragment$SelectionStrategy;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/PickerFragment",
    //                 "<TT;>.SelectionStrategy;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         if-eq p1, v0, :cond_0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter;->notifyDataSetChanged()V
    //         :cond_0
    //         return-void
    */

    public fun setSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/SessionTracker;->setSession(Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setSettingsFromBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/facebook/widget/PickerFragment;->setPickerFragmentSettingsFromBundle(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun setShowPictures(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/widget/PickerFragment;->showPictures:Z
    //         return-void
    */

    public fun setShowTitleBar(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/widget/PickerFragment;->showTitleBar:Z
    //         return-void
    */

    public fun setTitleText(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/PickerFragment;->titleText:Ljava/lang/String;
    //         return-void
    */

    fun setupViews(p0: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    fun updateAdapter(p0: com.facebook.widget.SimpleGraphObjectCursor) { /* TODO(body): (Lcom/facebook/widget/SimpleGraphObjectCursor;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         const/4 v3, 0x1
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         if-eqz v0, :cond_8
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v0, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         :cond_0
    //         iget-object v4, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v4, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v4
    //         if-eqz v2, :cond_3
    //         invoke-virtual {v4}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->getType()Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         move-result-object v0
    //         sget-object v5, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->ACTIVITY_CIRCLE:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         if-eq v0, v5, :cond_3
    //         invoke-virtual {v2}, Landroid/view/View;->getTop()I
    //         move-result v0
    //         :goto_0
    //         iget-object v5, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v5, p1}, Lcom/facebook/widget/GraphObjectAdapter;->changeCursor(Lcom/facebook/widget/GraphObjectCursor;)Z
    //         move-result v5
    //         if-eqz v2, :cond_1
    //         if-eqz v4, :cond_1
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         iget-object v6, v4, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->sectionKey:Ljava/lang/String;
    //         iget-object v4, v4, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v2, v6, v4}, Lcom/facebook/widget/GraphObjectAdapter;->getPosition(Ljava/lang/String;Lcom/facebook/model/GraphObject;)I
    //         move-result v2
    //         const/4 v4, -0x1
    //         if-eq v2, v4, :cond_1
    //         iget-object v4, p0, Lcom/facebook/widget/PickerFragment;->listView:Landroid/widget/ListView;
    //         invoke-virtual {v4, v2, v0}, Landroid/widget/ListView;->setSelectionFromTop(II)V
    //         :cond_1
    //         if-eqz v5, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onDataChangedListener:Lcom/facebook/widget/PickerFragment$OnDataChangedListener;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onDataChangedListener:Lcom/facebook/widget/PickerFragment$OnDataChangedListener;
    //         invoke-interface {v0, p0}, Lcom/facebook/widget/PickerFragment$OnDataChangedListener;->onDataChanged(Lcom/facebook/widget/PickerFragment;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionHint:Ljava/util/Set;
    //         if-eqz v0, :cond_8
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionHint:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_8
    //         if-eqz p1, :cond_8
    //         invoke-virtual {p1}, Lcom/facebook/widget/SimpleGraphObjectCursor;->moveToFirst()Z
    //         move v2, v1
    //         :goto_1
    //         invoke-virtual {p1}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v0
    //         if-ge v1, v0, :cond_7
    //         invoke-virtual {p1, v1}, Lcom/facebook/widget/SimpleGraphObjectCursor;->moveToPosition(I)Z
    //         invoke-virtual {p1}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/facebook/model/GraphObject;->asMap()Ljava/util/Map;
    //         move-result-object v4
    //         const-string v5, "id"
    //         invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-nez v4, :cond_4
    //         move v0, v2
    //         :goto_2
    //         add-int/lit8 v1, v1, 0x1
    //         move v2, v0
    //         goto :goto_1
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         const-string v4, "id"
    //         invoke-interface {v0, v4}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v4, v0, Ljava/lang/String;
    //         if-nez v4, :cond_5
    //         move v0, v2
    //         goto :goto_2
    //         :cond_5
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v4, p0, Lcom/facebook/widget/PickerFragment;->selectionHint:Ljava/util/Set;
    //         invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_6
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->selectionStrategy:Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         invoke-virtual {v2, v0}, Lcom/facebook/widget/PickerFragment$SelectionStrategy;->toggleSelection(Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/facebook/widget/PickerFragment;->selectionHint:Ljava/util/Set;
    //         invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    //         move v2, v3
    //         :cond_6
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->selectionHint:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_9
    //         :cond_7
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         if-eqz v0, :cond_8
    //         if-eqz v2, :cond_8
    //         iget-object v0, p0, Lcom/facebook/widget/PickerFragment;->onSelectionChangedListener:Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;
    //         invoke-interface {v0, p0}, Lcom/facebook/widget/PickerFragment$OnSelectionChangedListener;->onSelectionChanged(Lcom/facebook/widget/PickerFragment;)V
    //         :cond_8
    //         return-void
    //         :cond_9
    //         move v0, v2
    //         goto :goto_2
    */

    companion object {
    private val ACTIVITY_CIRCLE_SHOW_KEY: String = "com.facebook.android.PickerFragment.ActivityCircleShown"
    @JvmField public val DONE_BUTTON_TEXT_BUNDLE_KEY: String = "com.facebook.widget.PickerFragment.DoneButtonText"
    @JvmField public val EXTRA_FIELDS_BUNDLE_KEY: String = "com.facebook.widget.PickerFragment.ExtraFields"
    private val PROFILE_PICTURE_PREFETCH_BUFFER: Int = 0x5
    private val SELECTION_BUNDLE_KEY: String = "com.facebook.android.PickerFragment.Selection"
    @JvmField public val SHOW_PICTURES_BUNDLE_KEY: String = "com.facebook.widget.PickerFragment.ShowPictures"
    @JvmField public val SHOW_TITLE_BAR_BUNDLE_KEY: String = "com.facebook.widget.PickerFragment.ShowTitleBar"
    @JvmField public val TITLE_TEXT_BUNDLE_KEY: String = "com.facebook.widget.PickerFragment.TitleText"

    private @JvmStatic fun setAlpha(p0: android.view.View, p1: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/view/animation/AlphaAnimation;
    //         invoke-direct {v0, p1, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
    //         const-wide/16 v2, 0x0
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V
    //         invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    //         return-void
    */

    }
}
