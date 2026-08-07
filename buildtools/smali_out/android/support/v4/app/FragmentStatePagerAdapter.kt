package android.support.v4.app

// Auto-emitted from smali source: FragmentStatePagerAdapter.java.
// 7 fields, 10 methods.

open class FragmentStatePagerAdapter: android.support.v4.view.PagerAdapter() {
    private var mCurTransaction: android.support.v4.app.FragmentTransaction
    private var mCurrentPrimaryItem: android.support.v4.app.Fragment
    private val mFragmentManager: android.support.v4.app.FragmentManager
    private var mFragments: java.util.ArrayList
    private var mSavedState: java.util.ArrayList

    public constructor(fm: android.support.v4.app.FragmentManager)

    public fun destroyItem(container: android.view.ViewGroup, position: Int, object: Object) { /* TODO(body): (Landroid/view/ViewGroup;ILjava/lang/Object;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         move-object v0, p3
    //         check-cast v0, Landroid/support/v4/app/Fragment;
    //         .local v0, "fragment":Landroid/support/v4/app/Fragment;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v1
    //         iput-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         :cond_0
    //         :goto_0
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-gt v1, p2, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->saveFragmentInstanceState(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment$SavedState;
    //         move-result-object v2
    //         invoke-virtual {v1, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v1, p2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //         return-void
    */

    public fun finishUpdate(container: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z
    //         :cond_0
    //         return-void
    */

    public fun getItem(p0: Int): android.support.v4.app.Fragment

    public fun instantiateItem(container: android.view.ViewGroup, position: Int): Object { return TODO("body: (Landroid/view/ViewGroup;I)Ljava/lang/Object;") }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         if-le v3, p2, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/Fragment;
    //         .local v0, "f":Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_0
    //         .end local v0    # "f":Landroid/support/v4/app/Fragment;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         if-nez v3, :cond_1
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v3
    //         iput-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         :cond_1
    //         invoke-virtual {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;->getItem(I)Landroid/support/v4/app/Fragment;
    //         move-result-object v1
    //         .local v1, "fragment":Landroid/support/v4/app/Fragment;
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         if-le v3, p2, :cond_2
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/app/Fragment$SavedState;
    //         .local v2, "fss":Landroid/support/v4/app/Fragment$SavedState;
    //         if-eqz v2, :cond_2
    //         invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setInitialSavedState(Landroid/support/v4/app/Fragment$SavedState;)V
    //         .end local v2    # "fss":Landroid/support/v4/app/Fragment$SavedState;
    //         :cond_2
    //         :goto_1
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         if-gt v3, p2, :cond_3
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         const/4 v4, 0x0
    //         invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_3
    //         invoke-virtual {v1, v5}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
    //         invoke-virtual {v1, v5}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v3, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
    //         move-result v4
    //         invoke-virtual {v3, v4, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun isViewFromObject(view: android.view.View, object: Object): Boolean { return TODO("body: (Landroid/view/View;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p2, Landroid/support/v4/app/Fragment;
    //         .end local p2    # "object":Ljava/lang/Object;
    //         invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;
    //         move-result-object v0
    //         if-ne v0, p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun restoreState(state: android.os.Parcelable, loader: ClassLoader) { /* TODO(body): (Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V */ }
    /*
    //         .locals 11
    //         if-eqz p1, :cond_4
    //         move-object v0, p1
    //         check-cast v0, Landroid/os/Bundle;
    //         .local v0, "bundle":Landroid/os/Bundle;
    //         invoke-virtual {v0, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         const-string v8, "states"
    //         invoke-virtual {v0, v8}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
    //         move-result-object v2
    //         .local v2, "fss":[Landroid/os/Parcelable;
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V
    //         if-eqz v2, :cond_0
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         :goto_0
    //         array-length v8, v2
    //         if-ge v3, v8, :cond_0
    //         iget-object v9, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         aget-object v8, v2, v3
    //         check-cast v8, Landroid/support/v4/app/Fragment$SavedState;
    //         invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v3    # "i":I
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v7
    //         .local v7, "keys":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Ljava/lang/String;>;"
    //         invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         .local v4, "i$":Ljava/util/Iterator;
    //         :cond_1
    //         :goto_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v8
    //         if-eqz v8, :cond_4
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, Ljava/lang/String;
    //         .local v6, "key":Ljava/lang/String;
    //         const-string v8, "f"
    //         invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v8
    //         if-eqz v8, :cond_1
    //         const/4 v8, 0x1
    //         invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v8
    //         invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v5
    //         .local v5, "index":I
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v8, v0, v6}, Landroid/support/v4/app/FragmentManager;->getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    //         move-result-object v1
    //         .local v1, "f":Landroid/support/v4/app/Fragment;
    //         if-eqz v1, :cond_3
    //         :goto_2
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
    //         move-result v8
    //         if-gt v8, v5, :cond_2
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         const/4 v9, 0x0
    //         invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_2
    //         :cond_2
    //         const/4 v8, 0x0
    //         invoke-virtual {v1, v8}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
    //         iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v8, v5, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_1
    //         :cond_3
    //         const-string v8, "FragmentStatePagerAdapter"
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v10, "Bad fragment at key "
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    //         .end local v0    # "bundle":Landroid/os/Bundle;
    //         .end local v1    # "f":Landroid/support/v4/app/Fragment;
    //         .end local v2    # "fss":[Landroid/os/Parcelable;
    //         .end local v4    # "i$":Ljava/util/Iterator;
    //         .end local v5    # "index":I
    //         .end local v6    # "key":Ljava/lang/String;
    //         .end local v7    # "keys":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Ljava/lang/String;>;"
    //         :cond_4
    //         return-void
    */

    public fun saveState(): android.os.Parcelable { return TODO("body: ()Landroid/os/Parcelable;") }
    /*
    //         .locals 7
    //         const/4 v4, 0x0
    //         .local v4, "state":Landroid/os/Bundle;
    //         iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         if-lez v5, :cond_0
    //         new-instance v4, Landroid/os/Bundle;
    //         .end local v4    # "state":Landroid/os/Bundle;
    //         invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    //         .restart local v4    # "state":Landroid/os/Bundle;
    //         iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         new-array v1, v5, [Landroid/support/v4/app/Fragment$SavedState;
    //         .local v1, "fss":[Landroid/support/v4/app/Fragment$SavedState;
    //         iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;
    //         invoke-virtual {v5, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         const-string v5, "states"
    //         invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //         .end local v1    # "fss":[Landroid/support/v4/app/Fragment$SavedState;
    //         :cond_0
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_0
    //         iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         if-ge v2, v5, :cond_3
    //         iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;
    //         invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/Fragment;
    //         .local v0, "f":Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_2
    //         if-nez v4, :cond_1
    //         new-instance v4, Landroid/os/Bundle;
    //         .end local v4    # "state":Landroid/os/Bundle;
    //         invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    //         .restart local v4    # "state":Landroid/os/Bundle;
    //         :cond_1
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "f"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "key":Ljava/lang/String;
    //         iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v5, v4, v3, v0}, Landroid/support/v4/app/FragmentManager;->putFragment(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    //         .end local v3    # "key":Ljava/lang/String;
    //         :cond_2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         .end local v0    # "f":Landroid/support/v4/app/Fragment;
    //         :cond_3
    //         return-object v4
    */

    public fun setPrimaryItem(container: android.view.ViewGroup, position: Int, object: Object) { /* TODO(body): (Landroid/view/ViewGroup;ILjava/lang/Object;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         move-object v0, p3
    //         check-cast v0, Landroid/support/v4/app/Fragment;
    //         .local v0, "fragment":Landroid/support/v4/app/Fragment;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         if-eq v0, v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0, v3}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
    //         invoke-virtual {v0, v3}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
    //         :cond_1
    //         iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         :cond_2
    //         return-void
    */

    public fun startUpdate(container: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    companion object {
    private val DEBUG: Boolean = false
    private val TAG: String = "FragmentStatePagerAdapter"
    }
}
