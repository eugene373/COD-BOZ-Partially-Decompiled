package com.facebook.widget

// Auto-emitted from smali source: PlacePickerFragment.java.
// 22 fields, 30 methods.

open class PlacePickerFragment: com.facebook.widget.PickerFragment() {
    private var hasSearchTextChangedSinceLastQuery: Boolean
    private var location: android.location.Location
    private var radiusInMeters: Int
    private var resultsLimit: Int
    private var searchBox: android.widget.EditText
    private var searchText: String
    private var searchTextTimer: java.util.Timer
    private var showSearchBox: Boolean

    public constructor()

    public constructor(p0: android.os.Bundle)

    private fun createRequest(p0: android.location.Location, p1: Int, p2: Int, p3: String, p4: java.util.Set, p5: com.facebook.Session): com.facebook.Request { return TODO("body: (Landroid/location/Location;IILjava/lang/String;Ljava/util/Set;Lcom/facebook/Session;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/location/Location;",
    //                 "II",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/Session;",
    //                 ")",
    //                 "Lcom/facebook/Request;"
    //             }
    //         .end annotation
    //         const/4 v5, 0x0
    //         move-object v0, p6
    //         move-object v1, p1
    //         move v2, p2
    //         move v3, p3
    //         move-object v4, p4
    //         invoke-static/range {v0 .. v5}, Lcom/facebook/Request;->newPlacesSearchRequest(Lcom/facebook/Session;Landroid/location/Location;IILjava/lang/String;Lcom/facebook/Request$GraphPlaceListCallback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-direct {v1, p5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         const/4 v2, 0x5
    //         new-array v2, v2, [Ljava/lang/String;
    //         const/4 v3, 0x0
    //         const-string v4, "id"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         const-string v4, "name"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x2
    //         const-string v4, "location"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x3
    //         const-string v4, "category"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x4
    //         const-string v4, "were_here_count"
    //         aput-object v4, v2, v3
    //         invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    //         iget-object v2, p0, Lcom/facebook/widget/PlacePickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         invoke-virtual {v2}, Lcom/facebook/widget/GraphObjectAdapter;->getPictureFieldSpecifier()Ljava/lang/String;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->getParameters()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "fields"
    //         const-string v4, ","
    //         invoke-static {v4, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v2}, Lcom/facebook/Request;->setParameters(Landroid/os/Bundle;)V
    //         return-object v0
    */

    private fun createSearchTextTimer(): java.util.Timer { return TODO("body: ()Ljava/util/Timer;") }
    /*
    //         .locals 6
    //         new-instance v0, Ljava/util/Timer;
    //         invoke-direct {v0}, Ljava/util/Timer;-><init>()V
    //         new-instance v1, Lcom/facebook/widget/PlacePickerFragment$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/PlacePickerFragment$2;-><init>(Lcom/facebook/widget/PlacePickerFragment;)V
    //         const-wide/16 v2, 0x0
    //         const-wide/16 v4, 0x7d0
    //         invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    //         return-object v0
    */

    private fun onSearchTextTimerTriggered() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/facebook/widget/PlacePickerFragment;->hasSearchTextChangedSinceLastQuery:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/os/Handler;
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         new-instance v1, Lcom/facebook/widget/PlacePickerFragment$3;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/PlacePickerFragment$3;-><init>(Lcom/facebook/widget/PlacePickerFragment;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchTextTimer:Ljava/util/Timer;
    //         invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchTextTimer:Ljava/util/Timer;
    //         goto :goto_0
    */

    private fun setPlacePickerSettingsFromBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_2
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.RadiusInMeters"
    //         iget v1, p0, Lcom/facebook/widget/PlacePickerFragment;->radiusInMeters:I
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PlacePickerFragment;->setRadiusInMeters(I)V
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.ResultsLimit"
    //         iget v1, p0, Lcom/facebook/widget/PlacePickerFragment;->resultsLimit:I
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PlacePickerFragment;->setResultsLimit(I)V
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.SearchText"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.SearchText"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PlacePickerFragment;->setSearchText(Ljava/lang/String;)V
    //         :cond_0
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.Location"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.Location"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/location/Location;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PlacePickerFragment;->setLocation(Landroid/location/Location;)V
    //         :cond_1
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.ShowSearchBox"
    //         iget-boolean v1, p0, Lcom/facebook/widget/PlacePickerFragment;->showSearchBox:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/facebook/widget/PlacePickerFragment;->showSearchBox:Z
    //         :cond_2
    //         return-void
    */

    fun createAdapter(): com.facebook.widget.PickerFragment.PickerFragmentAdapter { return TODO("body: ()Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/PickerFragment",
    //                 "<",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 ">.PickerFragmentAdapter<",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/widget/PlacePickerFragment$1;
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/widget/PlacePickerFragment$1;-><init>(Lcom/facebook/widget/PlacePickerFragment;Landroid/content/Context;)V
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->setShowCheckbox(Z)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getShowPictures()Z
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->setShowPicture(Z)V
    //         return-object v0
    */

    fun createLoadingStrategy(): com.facebook.widget.PickerFragment.LoadingStrategy { return TODO("body: ()Lcom/facebook/widget/PickerFragment$LoadingStrategy;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/PickerFragment",
    //                 "<",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 ">.",
    //                 "LoadingStrategy;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;-><init>(Lcom/facebook/widget/PlacePickerFragment;Lcom/facebook/widget/PlacePickerFragment$1;)V
    //         return-object v0
    */

    fun createSelectionStrategy(): com.facebook.widget.PickerFragment.SelectionStrategy { return TODO("body: ()Lcom/facebook/widget/PickerFragment$SelectionStrategy;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/PickerFragment",
    //                 "<",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 ">.SelectionStrategy;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;
    //         invoke-direct {v0, p0}, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         return-object v0
    */

    fun getDefaultTitleText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$string;->com_facebook_nearby:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/PlacePickerFragment;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->location:Landroid/location/Location;
    //         return-object v0
    */

    public fun getRadiusInMeters(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/PlacePickerFragment;->radiusInMeters:I
    //         return v0
    */

    fun getRequestForLoadData(p0: com.facebook.Session): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;)Lcom/facebook/Request;") }
    /*
    //         .locals 7
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment;->location:Landroid/location/Location;
    //         iget v2, p0, Lcom/facebook/widget/PlacePickerFragment;->radiusInMeters:I
    //         iget v3, p0, Lcom/facebook/widget/PlacePickerFragment;->resultsLimit:I
    //         iget-object v4, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment;->extraFields:Ljava/util/HashSet;
    //         move-object v0, p0
    //         move-object v6, p1
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/widget/PlacePickerFragment;->createRequest(Landroid/location/Location;IILjava/lang/String;Ljava/util/Set;Lcom/facebook/Session;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getResultsLimit(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/PlacePickerFragment;->resultsLimit:I
    //         return v0
    */

    public fun getSearchText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSelection(): com.facebook.model.GraphPlace { return TODO("body: ()Lcom/facebook/model/GraphPlace;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getSelectedGraphObjects()Ljava/util/List;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphPlace;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun logAppEvents(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v1
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         if-eqz p1, :cond_0
    //         const-string v0, "Completed"
    //         :goto_0
    //         const-string v3, "fb_dialog_outcome"
    //         invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v3, "num_places_picked"
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getSelection()Lcom/facebook/model/GraphPlace;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_1
    //         invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v0, "fb_place_picker_usage"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v0, v3, v2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    //         :cond_0
    //         const-string v0, "Unknown"
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun onAttach(p0: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1}, Lcom/facebook/widget/PickerFragment;->onAttach(Landroid/app/Activity;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         const-string v1, "input_method"
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/inputmethod/InputMethodManager;
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
    //         :cond_0
    //         return-void
    */

    public fun onDetach() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-super {p0}, Lcom/facebook/widget/PickerFragment;->onDetach()V
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         const-string v1, "input_method"
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/inputmethod/InputMethodManager;
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
    //         :cond_0
    //         return-void
    */

    public fun onInflate(p0: android.app.Activity, p1: android.util.AttributeSet, p2: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1, p2, p3}, Lcom/facebook/widget/PickerFragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    //         sget-object v0, Lcom/facebook/android/R$styleable;->com_facebook_place_picker_fragment:[I
    //         invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_place_picker_fragment_radius_in_meters:I
    //         iget v2, p0, Lcom/facebook/widget/PlacePickerFragment;->radiusInMeters:I
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/PlacePickerFragment;->setRadiusInMeters(I)V
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_place_picker_fragment_results_limit:I
    //         iget v2, p0, Lcom/facebook/widget/PlacePickerFragment;->resultsLimit:I
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/PlacePickerFragment;->setResultsLimit(I)V
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_place_picker_fragment_results_limit:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_place_picker_fragment_search_text:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/PlacePickerFragment;->setSearchText(Ljava/lang/String;)V
    //         :cond_0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_place_picker_fragment_show_search_box:I
    //         iget-boolean v2, p0, Lcom/facebook/widget/PlacePickerFragment;->showSearchBox:Z
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v1
    //         iput-boolean v1, p0, Lcom/facebook/widget/PlacePickerFragment;->showSearchBox:Z
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-void
    */

    fun onLoadingData() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/widget/PlacePickerFragment;->hasSearchTextChangedSinceLastQuery:Z
    //         return-void
    */

    public fun onSearchBoxTextChanged(p0: String, p1: Boolean) { /* TODO(body): (Ljava/lang/String;Z)V */ }
    /*
    //         .locals 1
    //         if-nez p2, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/facebook/internal/Utility;->stringsEqualOrEmpty(Ljava/lang/String;Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const/4 p1, 0x0
    //         :cond_2
    //         iput-object p1, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/PlacePickerFragment;->hasSearchTextChangedSinceLastQuery:Z
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchTextTimer:Ljava/util/Timer;
    //         if-nez v0, :cond_0
    //         invoke-direct {p0}, Lcom/facebook/widget/PlacePickerFragment;->createSearchTextTimer()Ljava/util/Timer;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchTextTimer:Ljava/util/Timer;
    //         goto :goto_0
    */

    fun saveSettingsToBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Lcom/facebook/widget/PickerFragment;->saveSettingsToBundle(Landroid/os/Bundle;)V
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.RadiusInMeters"
    //         iget v1, p0, Lcom/facebook/widget/PlacePickerFragment;->radiusInMeters:I
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.ResultsLimit"
    //         iget v1, p0, Lcom/facebook/widget/PlacePickerFragment;->resultsLimit:I
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.SearchText"
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.Location"
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment;->location:Landroid/location/Location;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         const-string v0, "com.facebook.widget.PlacePickerFragment.ShowSearchBox"
    //         iget-boolean v1, p0, Lcom/facebook/widget/PlacePickerFragment;->showSearchBox:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         return-void
    */

    public fun setLocation(p0: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/PlacePickerFragment;->location:Landroid/location/Location;
    //         return-void
    */

    public fun setRadiusInMeters(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/facebook/widget/PlacePickerFragment;->radiusInMeters:I
    //         return-void
    */

    public fun setResultsLimit(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/facebook/widget/PlacePickerFragment;->resultsLimit:I
    //         return-void
    */

    public fun setSearchText(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 p1, 0x0
    //         :cond_0
    //         iput-object p1, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    //         :cond_1
    //         return-void
    */

    public fun setSettingsFromBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/widget/PickerFragment;->setSettingsFromBundle(Landroid/os/Bundle;)V
    //         invoke-direct {p0, p1}, Lcom/facebook/widget/PlacePickerFragment;->setPlacePickerSettingsFromBundle(Landroid/os/Bundle;)V
    //         return-void
    */

    fun setupViews(p0: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const/4 v3, 0x0
    //         iget-boolean v0, p0, Lcom/facebook/widget/PlacePickerFragment;->showSearchBox:Z
    //         if-eqz v0, :cond_0
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_list_view:I
    //         invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ListView;
    //         invoke-virtual {p0}, Lcom/facebook/widget/PlacePickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$layout;->com_facebook_picker_search_box:I
    //         invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, v4, v3}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_picker_search_text:I
    //         invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/EditText;
    //         iput-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         new-instance v1, Lcom/facebook/widget/PlacePickerFragment$SearchTextWatcher;
    //         invoke-direct {v1, p0, v4}, Lcom/facebook/widget/PlacePickerFragment$SearchTextWatcher;-><init>(Lcom/facebook/widget/PlacePickerFragment;Lcom/facebook/widget/PlacePickerFragment$1;)V
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment;->searchBox:Landroid/widget/EditText;
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment;->searchText:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    //         :cond_0
    //         return-void
    */

    companion object {
    private val CATEGORY: String = "category"
    @JvmField public val DEFAULT_RADIUS_IN_METERS: Int = 0x3e8
    @JvmField public val DEFAULT_RESULTS_LIMIT: Int = 0x64
    private val ID: String = "id"
    private val LOCATION: String = "location"
    @JvmField public val LOCATION_BUNDLE_KEY: String = "com.facebook.widget.PlacePickerFragment.Location"
    private val NAME: String = "name"
    @JvmField public val RADIUS_IN_METERS_BUNDLE_KEY: String = "com.facebook.widget.PlacePickerFragment.RadiusInMeters"
    @JvmField public val RESULTS_LIMIT_BUNDLE_KEY: String = "com.facebook.widget.PlacePickerFragment.ResultsLimit"
    @JvmField public val SEARCH_TEXT_BUNDLE_KEY: String = "com.facebook.widget.PlacePickerFragment.SearchText"
    @JvmField public val SHOW_SEARCH_BOX_BUNDLE_KEY: String = "com.facebook.widget.PlacePickerFragment.ShowSearchBox"
    private val TAG: String = "PlacePickerFragment"
    private val WERE_HERE_COUNT: String = "were_here_count"
    private val searchTextTimerDelayInMilliseconds: Int = 0x7d0
    }
}
