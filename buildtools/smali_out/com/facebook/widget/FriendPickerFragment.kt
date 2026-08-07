package com.facebook.widget

// Auto-emitted from smali source: FriendPickerFragment.java.
// 9 fields, 25 methods.

open class FriendPickerFragment: com.facebook.widget.PickerFragment() {
    private var friendPickerType: com.facebook.widget.FriendPickerFragment.FriendPickerType
    private var multiSelect: Boolean
    private var preSelectedFriendIds: java.util.List
    private var userId: String

    public constructor()

    public constructor(p0: android.os.Bundle)

    private fun createRequest(p0: String, p1: java.util.Set, p2: com.facebook.Session): com.facebook.Request { return TODO("body: (Ljava/lang/String;Ljava/util/Set;Lcom/facebook/Session;)Lcom/facebook/Request;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
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
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/FriendPickerFragment;->friendPickerType:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         invoke-virtual {v1}, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->getRequestPath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-static {p3, v0, v1}, Lcom/facebook/Request;->newGraphPathRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-direct {v1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/String;
    //         const/4 v3, 0x0
    //         const-string v4, "id"
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         const-string v4, "name"
    //         aput-object v4, v2, v3
    //         invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    //         iget-object v2, p0, Lcom/facebook/widget/FriendPickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
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

    private fun setFriendPickerSettingsFromBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_1
    //         const-string v0, "com.facebook.widget.FriendPickerFragment.UserId"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "com.facebook.widget.FriendPickerFragment.UserId"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FriendPickerFragment;->setUserId(Ljava/lang/String;)V
    //         :cond_0
    //         const-string v0, "com.facebook.widget.FriendPickerFragment.MultiSelect"
    //         iget-boolean v1, p0, Lcom/facebook/widget/FriendPickerFragment;->multiSelect:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FriendPickerFragment;->setMultiSelect(Z)V
    //         const-string v0, "com.facebook.widget.FriendPickerFragment.FriendPickerType"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :try_start_0
    //         const-string v0, "com.facebook.widget.FriendPickerFragment.FriendPickerType"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->valueOf(Ljava/lang/String;)Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/FriendPickerFragment;->friendPickerType:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    fun createAdapter(): com.facebook.widget.PickerFragment.PickerFragmentAdapter { return TODO("body: ()Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/PickerFragment",
    //                 "<",
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">.PickerFragmentAdapter<",
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v2, 0x1
    //         new-instance v0, Lcom/facebook/widget/FriendPickerFragment$1;
    //         invoke-virtual {p0}, Lcom/facebook/widget/FriendPickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/widget/FriendPickerFragment$1;-><init>(Lcom/facebook/widget/FriendPickerFragment;Landroid/content/Context;)V
    //         invoke-virtual {v0, v2}, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->setShowCheckbox(Z)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/FriendPickerFragment;->getShowPictures()Z
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->setShowPicture(Z)V
    //         new-array v1, v2, [Ljava/lang/String;
    //         const/4 v2, 0x0
    //         const-string v3, "name"
    //         aput-object v3, v1, v2
    //         invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->setSortFields(Ljava/util/List;)V
    //         const-string v1, "name"
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;->setGroupByField(Ljava/lang/String;)V
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
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">.",
    //                 "LoadingStrategy;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;-><init>(Lcom/facebook/widget/FriendPickerFragment;Lcom/facebook/widget/FriendPickerFragment$1;)V
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
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">.SelectionStrategy;"
    //             }
    //         .end annotation
    //         iget-boolean v0, p0, Lcom/facebook/widget/FriendPickerFragment;->multiSelect:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;
    //         invoke-direct {v0, p0}, Lcom/facebook/widget/PickerFragment$MultiSelectionStrategy;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;
    //         invoke-direct {v0, p0}, Lcom/facebook/widget/PickerFragment$SingleSelectionStrategy;-><init>(Lcom/facebook/widget/PickerFragment;)V
    //         goto :goto_0
    */

    fun getDefaultTitleText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/android/R$string;->com_facebook_choose_friends:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FriendPickerFragment;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMultiSelect(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/FriendPickerFragment;->multiSelect:Z
    //         return v0
    */

    fun getRequestForLoadData(p0: com.facebook.Session): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;)Lcom/facebook/Request;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment;->adapter:Lcom/facebook/widget/GraphObjectAdapter;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Can\'t issue requests until Fragment has been created."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment;->userId:Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment;->userId:Ljava/lang/String;
    //         :goto_0
    //         iget-object v1, p0, Lcom/facebook/widget/FriendPickerFragment;->extraFields:Ljava/util/HashSet;
    //         invoke-direct {p0, v0, v1, p1}, Lcom/facebook/widget/FriendPickerFragment;->createRequest(Ljava/lang/String;Ljava/util/Set;Lcom/facebook/Session;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         const-string v0, "me"
    //         goto :goto_0
    */

    public fun getSelection(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/facebook/widget/FriendPickerFragment;->getSelectedGraphObjects()Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getUserId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment;->userId:Ljava/lang/String;
    //         return-object v0
    */

    public fun loadData(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Lcom/facebook/widget/PickerFragment;->loadData(Z)V
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment;->preSelectedFriendIds:Ljava/util/List;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FriendPickerFragment;->setSelectedGraphObjects(Ljava/util/List;)V
    //         return-void
    */

    fun logAppEvents(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/facebook/widget/FriendPickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/widget/FriendPickerFragment;->getSession()Lcom/facebook/Session;
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
    //         const-string v0, "num_friends_picked"
    //         invoke-virtual {p0}, Lcom/facebook/widget/FriendPickerFragment;->getSelection()Ljava/util/List;
    //         move-result-object v3
    //         invoke-interface {v3}, Ljava/util/List;->size()I
    //         move-result v3
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v0, "fb_friend_picker_usage"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v0, v3, v2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    //         :cond_0
    //         const-string v0, "Unknown"
    //         goto :goto_0
    */

    public fun onInflate(p0: android.app.Activity, p1: android.util.AttributeSet, p2: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1, p2, p3}, Lcom/facebook/widget/PickerFragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    //         sget-object v0, Lcom/facebook/android/R$styleable;->com_facebook_friend_picker_fragment:[I
    //         invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_friend_picker_fragment_multi_select:I
    //         iget-boolean v2, p0, Lcom/facebook/widget/FriendPickerFragment;->multiSelect:Z
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/FriendPickerFragment;->setMultiSelect(Z)V
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-void
    */

    fun saveSettingsToBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Lcom/facebook/widget/PickerFragment;->saveSettingsToBundle(Landroid/os/Bundle;)V
    //         const-string v0, "com.facebook.widget.FriendPickerFragment.UserId"
    //         iget-object v1, p0, Lcom/facebook/widget/FriendPickerFragment;->userId:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.widget.FriendPickerFragment.MultiSelect"
    //         iget-boolean v1, p0, Lcom/facebook/widget/FriendPickerFragment;->multiSelect:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         return-void
    */

    public fun setFriendPickerType(p0: com.facebook.widget.FriendPickerFragment.FriendPickerType) { /* TODO(body): (Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/FriendPickerFragment;->friendPickerType:Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;
    //         return-void
    */

    public fun setMultiSelect(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/FriendPickerFragment;->multiSelect:Z
    //         if-eq v0, p1, :cond_0
    //         iput-boolean p1, p0, Lcom/facebook/widget/FriendPickerFragment;->multiSelect:Z
    //         invoke-virtual {p0}, Lcom/facebook/widget/FriendPickerFragment;->createSelectionStrategy()Lcom/facebook/widget/PickerFragment$SelectionStrategy;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FriendPickerFragment;->setSelectionStrategy(Lcom/facebook/widget/PickerFragment$SelectionStrategy;)V
    //         :cond_0
    //         return-void
    */

    public fun setSelection(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphUser;
    //         invoke-interface {v0}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/FriendPickerFragment;->setSelectionByIds(Ljava/util/List;)V
    //         return-void
    */

    public fun setSelection(p0: Array<com.facebook.model.GraphUser>) { /* TODO(body): ([Lcom/facebook/model/GraphUser;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FriendPickerFragment;->setSelection(Ljava/util/List;)V
    //         return-void
    */

    public fun setSelectionByIds(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment;->preSelectedFriendIds:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    //         return-void
    */

    public fun setSelectionByIds(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FriendPickerFragment;->setSelectionByIds(Ljava/util/List;)V
    //         return-void
    */

    public fun setSettingsFromBundle(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/widget/PickerFragment;->setSettingsFromBundle(Landroid/os/Bundle;)V
    //         invoke-direct {p0, p1}, Lcom/facebook/widget/FriendPickerFragment;->setFriendPickerSettingsFromBundle(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun setUserId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/FriendPickerFragment;->userId:Ljava/lang/String;
    //         return-void
    */

    companion object {
    @JvmField public val FRIEND_PICKER_TYPE_KEY: String = "com.facebook.widget.FriendPickerFragment.FriendPickerType"
    private val ID: String = "id"
    @JvmField public val MULTI_SELECT_BUNDLE_KEY: String = "com.facebook.widget.FriendPickerFragment.MultiSelect"
    private val NAME: String = "name"
    @JvmField public val USER_ID_BUNDLE_KEY: String = "com.facebook.widget.FriendPickerFragment.UserId"
    }
}
