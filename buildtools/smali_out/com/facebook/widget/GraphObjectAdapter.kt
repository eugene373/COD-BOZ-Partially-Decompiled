package com.facebook.widget

// Auto-emitted from smali source: GraphObjectAdapter.java.
// 26 fields, 61 methods.

open class GraphObjectAdapter: android.widget.BaseAdapter(), android.widget.SectionIndexer {
    private var context: android.content.Context
    private var cursor: com.facebook.widget.GraphObjectCursor
    private var dataNeededListener: com.facebook.widget.GraphObjectAdapter.DataNeededListener
    private var displaySections: Boolean
    private var filter: com.facebook.widget.GraphObjectAdapter.Filter
    private var graphObjectsById: java.util.Map
    private var graphObjectsBySection: java.util.Map
    private var groupByField: String
    private val inflater: android.view.LayoutInflater
    private var onErrorListener: com.facebook.widget.GraphObjectAdapter.OnErrorListener
    private val pendingRequests: java.util.Map
    private var prefetchedPictureCache: java.util.Map
    private var prefetchedProfilePictureIds: java.util.ArrayList
    private var sectionKeys: java.util.List
    private var showCheckbox: Boolean
    private var showPicture: Boolean
    private var sortFields: java.util.List

    public constructor(p0: android.content.Context)

    private fun callOnErrorListener(p0: Exception) { /* TODO(body): (Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->onErrorListener:Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;
    //         if-eqz v0, :cond_0
    //         instance-of v0, p1, Lcom/facebook/FacebookException;
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         invoke-direct {v0, p1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         :goto_0
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->onErrorListener:Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;
    //         check-cast v0, Lcom/facebook/FacebookException;
    //         invoke-interface {v1, p0, v0}, Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;->onError(Lcom/facebook/widget/GraphObjectAdapter;Lcom/facebook/FacebookException;)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         move-object v0, p1
    //         goto :goto_0
    */

    private fun downloadProfilePicture(p0: String, p1: java.net.URI, p2: android.widget.ImageView) { /* TODO(body): (Ljava/lang/String;Ljava/net/URI;Landroid/widget/ImageView;)V */ }
    /*
    //         .locals 2
    //         if-nez p2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         if-nez p3, :cond_4
    //         const/4 v0, 0x1
    //         :goto_1
    //         if-nez v0, :cond_2
    //         invoke-virtual {p3}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {p2, v1}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :cond_2
    //         if-nez v0, :cond_3
    //         invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->getDefaultPicture()I
    //         move-result v0
    //         invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V
    //         :cond_3
    //         new-instance v0, Lcom/facebook/internal/ImageRequest$Builder;
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->context:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p2}, Lcom/facebook/internal/ImageRequest$Builder;-><init>(Landroid/content/Context;Ljava/net/URI;)V
    //         invoke-virtual {v0, p0}, Lcom/facebook/internal/ImageRequest$Builder;->setCallerTag(Ljava/lang/Object;)Lcom/facebook/internal/ImageRequest$Builder;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/widget/GraphObjectAdapter$2;
    //         invoke-direct {v1, p0, p1, p3}, Lcom/facebook/widget/GraphObjectAdapter$2;-><init>(Lcom/facebook/widget/GraphObjectAdapter;Ljava/lang/String;Landroid/widget/ImageView;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/ImageRequest$Builder;->setCallback(Lcom/facebook/internal/ImageRequest$Callback;)Lcom/facebook/internal/ImageRequest$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/internal/ImageRequest$Builder;->build()Lcom/facebook/internal/ImageRequest;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->pendingRequests:Ljava/util/Map;
    //         invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {v0}, Lcom/facebook/internal/ImageDownloader;->downloadAsync(Lcom/facebook/internal/ImageRequest;)V
    //         goto :goto_0
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    private fun getActivityCircleView(p0: android.view.View, p1: android.view.ViewGroup): android.view.View { return TODO("body: (Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         if-nez p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->inflater:Landroid/view/LayoutInflater;
    //         sget v1, Lcom/facebook/android/R$layout;->com_facebook_picker_activity_circle_row:I
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object p1
    //         :cond_0
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_row_activity_circle:I
    //         invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ProgressBar;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
    //         return-object p1
    */

    private fun processImageResponse(p0: com.facebook.internal.ImageResponse, p1: String, p2: android.widget.ImageView) { /* TODO(body): (Lcom/facebook/internal/ImageResponse;Ljava/lang/String;Landroid/widget/ImageView;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->pendingRequests:Ljava/util/Map;
    //         invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getError()Ljava/lang/Exception;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getError()Ljava/lang/Exception;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/GraphObjectAdapter;->callOnErrorListener(Ljava/lang/Exception;)V
    //         :cond_0
    //         if-nez p3, :cond_3
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getBitmap()Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedPictureCache:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->size()I
    //         move-result v0
    //         const/16 v1, 0x14
    //         if-lt v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedProfilePictureIds:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedPictureCache:Ljava/util/Map;
    //         invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedPictureCache:Ljava/util/Map;
    //         invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_2
    //         :goto_0
    //         return-void
    //         :cond_3
    //         invoke-virtual {p3}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getError()Ljava/lang/Exception;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getBitmap()Landroid/graphics/Bitmap;
    //         move-result-object v1
    //         if-nez v0, :cond_2
    //         if-eqz v1, :cond_2
    //         invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         invoke-virtual {p1}, Lcom/facebook/internal/ImageResponse;->getRequest()Lcom/facebook/internal/ImageRequest;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/internal/ImageRequest;->getImageUri()Ljava/net/URI;
    //         move-result-object v0
    //         invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V
    //         goto :goto_0
    */

    private fun rebuildSections() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         const/4 v3, 0x1
    //         const/4 v1, 0x0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsById:Ljava/util/Map;
    //         iput-boolean v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectCursor;->getCount()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectCursor;->moveToFirst()Z
    //         move v0, v1
    //         :goto_1
    //         iget-object v2, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v2}, Lcom/facebook/widget/GraphObjectCursor;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v4
    //         invoke-virtual {p0, v4}, Lcom/facebook/widget/GraphObjectAdapter;->filterIncludesItem(Lcom/facebook/model/GraphObject;)Z
    //         move-result v2
    //         if-nez v2, :cond_2
    //         move v2, v0
    //         :goto_2
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectCursor;->moveToNext()Z
    //         move-result v0
    //         if-nez v0, :cond_6
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sortFields:Ljava/util/List;
    //         if-eqz v0, :cond_4
    //         invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;
    //         move-result-object v4
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_3
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         new-instance v6, Lcom/facebook/widget/GraphObjectAdapter$1;
    //         invoke-direct {v6, p0, v4}, Lcom/facebook/widget/GraphObjectAdapter$1;-><init>(Lcom/facebook/widget/GraphObjectAdapter;Ljava/text/Collator;)V
    //         invoke-static {v0, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    //         goto :goto_3
    //         :cond_2
    //         add-int/lit8 v2, v0, 0x1
    //         invoke-virtual {p0, v4}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionKeyOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v5, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-nez v5, :cond_3
    //         iget-object v5, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         iget-object v5, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         new-instance v6, Ljava/util/ArrayList;
    //         invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_3
    //         iget-object v5, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsById:Ljava/util/Map;
    //         invoke-virtual {p0, v4}, Lcom/facebook/widget/GraphObjectAdapter;->getIdOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_2
    //         :cond_4
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;
    //         move-result-object v4
    //         invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-le v0, v3, :cond_5
    //         if-le v2, v3, :cond_5
    //         move v1, v3
    //         :cond_5
    //         iput-boolean v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         goto/16 :goto_0
    //         :cond_6
    //         move v0, v2
    //         goto/16 :goto_1
    */

    private fun shouldShowActivityCircleCell(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectCursor;->areMoreObjectsAvailable()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->dataNeededListener:Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun areAllItemsEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         return v0
    */

    public fun changeCursor(p0: com.facebook.widget.GraphObjectCursor): Boolean { return TODO("body: (Lcom/facebook/widget/GraphObjectCursor;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectCursor",
    //                 "<TT;>;)Z"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         if-ne v0, p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectCursor;->close()V
    //         :cond_1
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->rebuildAndNotify()V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    protected fun createGraphObjectView(p0: com.facebook.model.GraphObject): android.view.View { return TODO("body: (Lcom/facebook/model/GraphObject;)Landroid/view/View;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)",
    //                 "Landroid/view/View;"
    //             }
    //         .end annotation
    //         const/16 v4, 0x8
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->inflater:Landroid/view/LayoutInflater;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->getGraphObjectRowLayoutId(Lcom/facebook/model/GraphObject;)I
    //         move-result v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v1
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_checkbox_stub:I
    //         invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/ViewStub;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->getShowCheckbox()Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         invoke-virtual {v0, v4}, Landroid/view/ViewStub;->setVisibility(I)V
    //         :cond_0
    //         :goto_0
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_profile_pic_stub:I
    //         invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/ViewStub;
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->getShowPicture()Z
    //         move-result v2
    //         if-nez v2, :cond_2
    //         invoke-virtual {v0, v4}, Landroid/view/ViewStub;->setVisibility(I)V
    //         :goto_1
    //         return-object v1
    //         :cond_1
    //         invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/CheckBox;
    //         invoke-virtual {p0, v0, v3}, Lcom/facebook/widget/GraphObjectAdapter;->updateCheckboxState(Landroid/widget/CheckBox;Z)V
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ImageView;
    //         invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V
    //         goto :goto_1
    */

    fun filterIncludesItem(p0: com.facebook.model.GraphObject): Boolean { return TODO("body: (Lcom/facebook/model/GraphObject;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)Z"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->filter:Lcom/facebook/widget/GraphObjectAdapter$Filter;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->filter:Lcom/facebook/widget/GraphObjectAdapter$Filter;
    //         invoke-interface {v0, p1}, Lcom/facebook/widget/GraphObjectAdapter$Filter;->includeItem(Ljava/lang/Object;)Z
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

    public fun getCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-boolean v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         if-eqz v1, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         move v1, v0
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         add-int/2addr v0, v1
    //         move v1, v0
    //         goto :goto_1
    //         :cond_2
    //         invoke-direct {p0}, Lcom/facebook/widget/GraphObjectAdapter;->shouldShowActivityCircleCell()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         add-int/lit8 v1, v1, 0x1
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getCursor(): com.facebook.widget.GraphObjectCursor { return TODO("body: ()Lcom/facebook/widget/GraphObjectCursor;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/GraphObjectCursor",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         return-object v0
    */

    public fun getDataNeededListener(): com.facebook.widget.GraphObjectAdapter.DataNeededListener { return TODO("body: ()Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->dataNeededListener:Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;
    //         return-object v0
    */

    protected fun getDefaultPicture(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_profile_default_icon:I
    //         return v0
    */

    fun getFilter(): com.facebook.widget.GraphObjectAdapter.Filter { return TODO("body: ()Lcom/facebook/widget/GraphObjectAdapter$Filter;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/GraphObjectAdapter$Filter",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->filter:Lcom/facebook/widget/GraphObjectAdapter$Filter;
    //         return-object v0
    */

    protected fun getGraphObjectRowLayoutId(p0: com.facebook.model.GraphObject): Int { return TODO("body: (Lcom/facebook/model/GraphObject;)I") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)I"
    //             }
    //         .end annotation
    //         sget v0, Lcom/facebook/android/R$layout;->com_facebook_picker_list_row:I
    //         return v0
    */

    protected fun getGraphObjectView(p0: com.facebook.model.GraphObject, p1: android.view.View, p2: android.view.ViewGroup): android.view.View { return TODO("body: (Lcom/facebook/model/GraphObject;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;",
    //                 "Landroid/view/View;",
    //                 "Landroid/view/ViewGroup;",
    //                 ")",
    //                 "Landroid/view/View;"
    //             }
    //         .end annotation
    //         if-nez p2, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->createGraphObjectView(Lcom/facebook/model/GraphObject;)Landroid/view/View;
    //         move-result-object p2
    //         :cond_0
    //         invoke-virtual {p0, p2, p1}, Lcom/facebook/widget/GraphObjectAdapter;->populateGraphObjectView(Landroid/view/View;Lcom/facebook/model/GraphObject;)V
    //         return-object p2
    */

    public fun getGraphObjectsById(p0: java.util.Collection): java.util.List { return TODO("body: (Ljava/util/Collection;)Ljava/util/List;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/HashSet;
    //         invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
    //         invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-interface {v0}, Ljava/util/Set;->size()I
    //         move-result v2
    //         invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v3, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsById:Ljava/util/Map;
    //         invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_1
    //         return-object v1
    */

    public fun getGroupByField(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->groupByField:Ljava/lang/String;
    //         return-object v0
    */

    fun getIdOfGraphObject(p0: com.facebook.model.GraphObject): String { return TODO("body: (Lcom/facebook/model/GraphObject;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Lcom/facebook/model/GraphObject;->asMap()Ljava/util/Map;
    //         move-result-object v0
    //         const-string v1, "id"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "id"
    //         invoke-interface {p1, v0}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v1, v0, Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Received an object without an ID."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getItem(p0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->getType()Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         move-result-object v1
    //         sget-object v2, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->GRAPH_OBJECT:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         if-ne v1, v2, :cond_0
    //         iget-object v0, v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getItemId(p0: Int): Long { return TODO("body: (I)J") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-eqz v1, :cond_0
    //         iget-object v0, v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getIdOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :catch_0
    //         move-exception v0
    //         :cond_0
    //         const-wide/16 v0, 0x0
    //         goto :goto_0
    */

    public fun getItemViewType(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/widget/GraphObjectAdapter$3;->$SwitchMap$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type:[I
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->getType()Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->ordinal()I
    //         move-result v0
    //         aget v0, v1, v0
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Unexpected type of section and item."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :pswitch_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :pswitch_2
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun getOnErrorListener(): com.facebook.widget.GraphObjectAdapter.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->onErrorListener:Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;
    //         return-object v0
    */

    fun getPictureFieldSpecifier(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->createGraphObjectView(Lcom/facebook/model/GraphObject;)Landroid/view/View;
    //         move-result-object v0
    //         sget v2, Lcom/facebook/android/R$id;->com_facebook_picker_image:I
    //         invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ImageView;
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v2, "picture.height(%d).width(%d)"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget v5, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x1
    //         iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         aput-object v0, v3, v4
    //         invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun getPictureUriOfGraphObject(p0: com.facebook.model.GraphObject): java.net.URI { return TODO("body: (Lcom/facebook/model/GraphObject;)Ljava/net/URI;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)",
    //                 "Ljava/net/URI;"
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         const-string v0, "picture"
    //         invoke-interface {p1, v0}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v2, v0, Ljava/lang/String;
    //         if-eqz v2, :cond_0
    //         check-cast v0, Ljava/lang/String;
    //         move-object v2, v0
    //         :goto_0
    //         if-eqz v2, :cond_1
    //         :try_start_0
    //         new-instance v0, Ljava/net/URI;
    //         invoke-direct {v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         instance-of v2, v0, Lorg/json/JSONObject;
    //         if-eqz v2, :cond_2
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/model/GraphObject$Factory;->create(Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         const-class v2, Lcom/facebook/widget/GraphObjectAdapter$ItemPicture;
    //         invoke-interface {v0, v2}, Lcom/facebook/model/GraphObject;->cast(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/GraphObjectAdapter$ItemPicture;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectAdapter$ItemPicture;->getData()Lcom/facebook/widget/GraphObjectAdapter$ItemPictureData;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectAdapter$ItemPictureData;->getUrl()Ljava/lang/String;
    //         move-result-object v0
    //         move-object v2, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_2
    //         move-object v2, v1
    //         goto :goto_0
    */

    fun getPosition(p0: String, p1: com.facebook.model.GraphObject): Int { return TODO("body: (Ljava/lang/String;Lcom/facebook/model/GraphObject;)I") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "TT;)I"
    //             }
    //         .end annotation
    //         const/4 v3, 0x1
    //         const/4 v4, -0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         move v1, v2
    //         :goto_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-boolean v6, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         if-eqz v6, :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         :cond_0
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v6
    //         if-eqz v6, :cond_2
    //         move v0, v3
    //         :goto_1
    //         if-nez v0, :cond_3
    //         move v1, v4
    //         :cond_1
    //         :goto_2
    //         return v1
    //         :cond_2
    //         iget-object v6, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         add-int/2addr v0, v1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_3
    //         if-nez p2, :cond_5
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         if-eqz v0, :cond_4
    //         move v2, v3
    //         :cond_4
    //         sub-int/2addr v1, v2
    //         goto :goto_2
    //         :cond_5
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         invoke-static {v0, p2}, Lcom/facebook/model/GraphObject$Factory;->hasSameId(Lcom/facebook/model/GraphObject;Lcom/facebook/model/GraphObject;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_3
    //         :cond_6
    //         move v1, v4
    //         goto :goto_2
    //         :cond_7
    //         move v0, v2
    //         goto :goto_1
    */

    public fun getPositionForSection(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-boolean v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x1
    //         invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v1
    //         iget-object v2, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v2
    //         if-ge v1, v2, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->getPosition(Ljava/lang/String;Lcom/facebook/model/GraphObject;)I
    //         move-result v0
    //         :cond_0
    //         return v0
    */

    fun getSectionAndItem(p0: Int): com.facebook.widget.GraphObjectAdapter.SectionAndItem { return TODO("body: (I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)",
    //                 "Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         move-object v0, v2
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         if-nez v0, :cond_4
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/List;
    //         if-ltz p1, :cond_1
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v1
    //         if-ge p1, v1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/ArrayList;
    //         invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/facebook/model/GraphObject;
    //         move-object v2, v0
    //         :goto_1
    //         if-eqz v2, :cond_7
    //         new-instance v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         invoke-direct {v0, v2, v1}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;-><init>(Ljava/lang/String;Lcom/facebook/model/GraphObject;)V
    //         goto :goto_0
    //         :cond_1
    //         sget-boolean v0, Lcom/facebook/widget/GraphObjectAdapter;->$assertionsDisabled:Z
    //         if-nez v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->dataNeededListener:Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectCursor;->areMoreObjectsAvailable()Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         :cond_2
    //         new-instance v0, Ljava/lang/AssertionError;
    //         invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
    //         throw v0
    //         :cond_3
    //         new-instance v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         invoke-direct {v0, v2, v2}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;-><init>(Ljava/lang/String;Lcom/facebook/model/GraphObject;)V
    //         goto :goto_0
    //         :cond_4
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         add-int/lit8 v4, p1, -0x1
    //         if-nez p1, :cond_5
    //         move-object v1, v2
    //         move-object v2, v0
    //         goto :goto_1
    //         :cond_5
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->graphObjectsBySection:Ljava/util/Map;
    //         invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/util/List;
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v5
    //         if-ge v4, v5, :cond_6
    //         invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/facebook/model/GraphObject;
    //         move-object v2, v0
    //         goto :goto_1
    //         :cond_6
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v0
    //         sub-int p1, v4, v0
    //         goto :goto_2
    //         :cond_7
    //         new-instance v0, Ljava/lang/IndexOutOfBoundsException;
    //         const-string v1, "position"
    //         invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_8
    //         move-object v1, v2
    //         goto :goto_1
    */

    public fun getSectionForPosition(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->getType()Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         move-result-object v2
    //         sget-object v3, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->ACTIVITY_CIRCLE:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         if-eq v2, v3, :cond_0
    //         iget-object v2, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         iget-object v1, v1, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->sectionKey:Ljava/lang/String;
    //         invoke-interface {v2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I
    //         move-result v1
    //         iget-object v2, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v2
    //         add-int/lit8 v2, v2, -0x1
    //         invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         :cond_0
    //         return v0
    */

    protected fun getSectionHeaderView(p0: String, p1: android.view.View, p2: android.view.ViewGroup): android.view.View { return TODO("body: (Ljava/lang/String;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         check-cast p2, Landroid/widget/TextView;
    //         if-nez p2, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->inflater:Landroid/view/LayoutInflater;
    //         sget v1, Lcom/facebook/android/R$layout;->com_facebook_picker_list_section_header:I
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/TextView;
    //         :goto_0
    //         invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         return-object v0
    //         :cond_0
    //         move-object v0, p2
    //         goto :goto_0
    */

    protected fun getSectionKeyOfGraphObject(p0: com.facebook.model.GraphObject): String { return TODO("body: (Lcom/facebook/model/GraphObject;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectAdapter;->groupByField:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->groupByField:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-lez v1, :cond_0
    //         const/4 v1, 0x0
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v0, ""
    //         goto :goto_0
    */

    public fun getSections(): Array<Object> { return TODO("body: ()[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->displaySections:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun getShowCheckbox(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->showCheckbox:Z
    //         return v0
    */

    public fun getShowPicture(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->showPicture:Z
    //         return v0
    */

    public fun getSortFields(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sortFields:Ljava/util/List;
    //         return-object v0
    */

    protected fun getSubTitleOfGraphObject(p0: com.facebook.model.GraphObject): CharSequence { return TODO("body: (Lcom/facebook/model/GraphObject;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)",
    //                 "Ljava/lang/CharSequence;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         return-object v0
    */

    protected fun getTitleOfGraphObject(p0: com.facebook.model.GraphObject): CharSequence { return TODO("body: (Lcom/facebook/model/GraphObject;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;)",
    //                 "Ljava/lang/CharSequence;"
    //             }
    //         .end annotation
    //         const-string v0, "name"
    //         invoke-interface {p1, v0}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun getView(p0: Int, p1: android.view.View, p2: android.view.ViewGroup): android.view.View { return TODO("body: (ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/widget/GraphObjectAdapter$3;->$SwitchMap$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type:[I
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->getType()Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->ordinal()I
    //         move-result v2
    //         aget v1, v1, v2
    //         packed-switch v1, :pswitch_data_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Unexpected type of section and item."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         iget-object v0, v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->sectionKey:Ljava/lang/String;
    //         invoke-virtual {p0, v0, p2, p3}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionHeaderView(Ljava/lang/String;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :pswitch_1
    //         iget-object v0, v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {p0, v0, p2, p3}, Lcom/facebook/widget/GraphObjectAdapter;->getGraphObjectView(Lcom/facebook/model/GraphObject;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_2
    //         sget-boolean v0, Lcom/facebook/widget/GraphObjectAdapter;->$assertionsDisabled:Z
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->cursor:Lcom/facebook/widget/GraphObjectCursor;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectCursor;->areMoreObjectsAvailable()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->dataNeededListener:Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/AssertionError;
    //         invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->dataNeededListener:Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;->onDataNeeded()V
    //         invoke-direct {p0, p2, p3}, Lcom/facebook/widget/GraphObjectAdapter;->getActivityCircleView(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun getViewTypeCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x3
    //         return v0
    */

    public fun hasStableIds(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isEnabled(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->getType()Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->GRAPH_OBJECT:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun isGraphObjectSelected(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    protected fun populateGraphObjectView(p0: android.view.View, p1: com.facebook.model.GraphObject) { /* TODO(body): (Landroid/view/View;Lcom/facebook/model/GraphObject;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/view/View;",
    //                 "TT;)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p2}, Lcom/facebook/widget/GraphObjectAdapter;->getIdOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    //         invoke-virtual {p0, p2}, Lcom/facebook/widget/GraphObjectAdapter;->getTitleOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/CharSequence;
    //         move-result-object v2
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_title:I
    //         invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/TextView;
    //         if-eqz v0, :cond_0
    //         sget-object v3, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;
    //         invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    //         :cond_0
    //         invoke-virtual {p0, p2}, Lcom/facebook/widget/GraphObjectAdapter;->getSubTitleOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/CharSequence;
    //         move-result-object v2
    //         sget v0, Lcom/facebook/android/R$id;->picker_subtitle:I
    //         invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/TextView;
    //         if-eqz v0, :cond_1
    //         if-eqz v2, :cond_4
    //         sget-object v3, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;
    //         invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
    //         :cond_1
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->getShowCheckbox()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_checkbox:I
    //         invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/CheckBox;
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->isGraphObjectSelected(Ljava/lang/String;)Z
    //         move-result v2
    //         invoke-virtual {p0, v0, v2}, Lcom/facebook/widget/GraphObjectAdapter;->updateCheckboxState(Landroid/widget/CheckBox;Z)V
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->getShowPicture()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p0, p2}, Lcom/facebook/widget/GraphObjectAdapter;->getPictureUriOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/net/URI;
    //         move-result-object v2
    //         if-eqz v2, :cond_3
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_image:I
    //         invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ImageView;
    //         iget-object v3, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedPictureCache:Ljava/util/Map;
    //         invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_5
    //         iget-object v2, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedPictureCache:Ljava/util/Map;
    //         invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/facebook/internal/ImageResponse;
    //         invoke-virtual {v1}, Lcom/facebook/internal/ImageResponse;->getBitmap()Landroid/graphics/Bitmap;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         invoke-virtual {v1}, Lcom/facebook/internal/ImageResponse;->getRequest()Lcom/facebook/internal/ImageRequest;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/internal/ImageRequest;->getImageUri()Ljava/net/URI;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V
    //         :cond_3
    //         :goto_1
    //         return-void
    //         :cond_4
    //         const/16 v2, 0x8
    //         invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
    //         goto :goto_0
    //         :cond_5
    //         invoke-direct {p0, v1, v2, v0}, Lcom/facebook/widget/GraphObjectAdapter;->downloadProfilePicture(Ljava/lang/String;Ljava/net/URI;Landroid/widget/ImageView;)V
    //         goto :goto_1
    */

    public fun prioritizeViewRange(p0: Int, p1: Int, p2: Int) { /* TODO(body): (III)V */ }
    /*
    //         .locals 5
    //         if-lt p2, p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectAdapter;->sectionKeys:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         move v1, p2
    //         :goto_0
    //         if-ltz v1, :cond_3
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v0
    //         iget-object v2, v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-eqz v2, :cond_2
    //         iget-object v0, v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getIdOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/facebook/widget/GraphObjectAdapter;->pendingRequests:Ljava/util/Map;
    //         invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/ImageRequest;
    //         if-eqz v0, :cond_2
    //         invoke-static {v0}, Lcom/facebook/internal/ImageDownloader;->prioritizeRequest(Lcom/facebook/internal/ImageRequest;)V
    //         :cond_2
    //         add-int/lit8 v0, v1, -0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_3
    //         const/4 v0, 0x0
    //         sub-int v1, p1, p3
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         add-int v1, p2, p3
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->getCount()I
    //         move-result v2
    //         add-int/lit8 v2, v2, -0x1
    //         invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         :goto_1
    //         if-ge v0, p1, :cond_5
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v3
    //         iget-object v4, v3, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-eqz v4, :cond_4
    //         iget-object v3, v3, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_4
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_5
    //         add-int/lit8 v0, p2, 0x1
    //         :goto_2
    //         if-gt v0, v1, :cond_7
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getSectionAndItem(I)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
    //         move-result-object v3
    //         iget-object v4, v3, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-eqz v4, :cond_6
    //         iget-object v3, v3, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_6
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_7
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_8
    //         :goto_3
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getPictureUriOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/net/URI;
    //         move-result-object v2
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectAdapter;->getIdOfGraphObject(Lcom/facebook/model/GraphObject;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v3, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedProfilePictureIds:Ljava/util/ArrayList;
    //         invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         move-result v3
    //         iget-object v4, p0, Lcom/facebook/widget/GraphObjectAdapter;->prefetchedProfilePictureIds:Ljava/util/ArrayList;
    //         invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         if-nez v3, :cond_8
    //         const/4 v3, 0x0
    //         invoke-direct {p0, v0, v2, v3}, Lcom/facebook/widget/GraphObjectAdapter;->downloadProfilePicture(Ljava/lang/String;Ljava/net/URI;Landroid/widget/ImageView;)V
    //         goto :goto_3
    */

    public fun rebuildAndNotify() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/facebook/widget/GraphObjectAdapter;->rebuildSections()V
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectAdapter;->notifyDataSetChanged()V
    //         return-void
    */

    public fun setDataNeededListener(p0: com.facebook.widget.GraphObjectAdapter.DataNeededListener) { /* TODO(body): (Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->dataNeededListener:Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;
    //         return-void
    */

    fun setFilter(p0: com.facebook.widget.GraphObjectAdapter.Filter) { /* TODO(body): (Lcom/facebook/widget/GraphObjectAdapter$Filter;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/GraphObjectAdapter$Filter",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->filter:Lcom/facebook/widget/GraphObjectAdapter$Filter;
    //         return-void
    */

    public fun setGroupByField(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->groupByField:Ljava/lang/String;
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.GraphObjectAdapter.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->onErrorListener:Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;
    //         return-void
    */

    public fun setShowCheckbox(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->showCheckbox:Z
    //         return-void
    */

    public fun setShowPicture(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->showPicture:Z
    //         return-void
    */

    public fun setSortFields(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectAdapter;->sortFields:Ljava/util/List;
    //         return-void
    */

    fun updateCheckboxState(p0: android.widget.CheckBox, p1: Boolean) { /* TODO(body): (Landroid/widget/CheckBox;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    companion object {
    val $assertionsDisabled: Boolean = false
    private val ACTIVITY_CIRCLE_VIEW_TYPE: Int = 0x2
    private val DISPLAY_SECTIONS_THRESHOLD: Int = 0x1
    private val GRAPH_OBJECT_VIEW_TYPE: Int = 0x1
    private val HEADER_VIEW_TYPE: Int = 0x0
    private val ID: String = "id"
    private val MAX_PREFETCHED_PICTURES: Int = 0x14
    private val NAME: String = "name"
    private val PICTURE: String = "picture"

    private @JvmStatic fun compareGraphObjects(p0: com.facebook.model.GraphObject, p1: com.facebook.model.GraphObject, p2: java.util.Collection, p3: java.text.Collator): Int { return TODO("body: (Lcom/facebook/model/GraphObject;Lcom/facebook/model/GraphObject;Ljava/util/Collection;Ljava/text/Collator;)I") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/text/Collator;",
    //                 ")I"
    //             }
    //         .end annotation
    //         invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-interface {p0, v0}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {p1, v0}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-eqz v1, :cond_1
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p3, v1, v0}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-nez v1, :cond_2
    //         if-eqz v0, :cond_0
    //         :cond_2
    //         if-nez v1, :cond_3
    //         const/4 v0, -0x1
    //         goto :goto_0
    //         :cond_3
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
