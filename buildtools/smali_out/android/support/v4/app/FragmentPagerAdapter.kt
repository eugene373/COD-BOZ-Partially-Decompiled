package android.support.v4.app

// Auto-emitted from smali source: FragmentPagerAdapter.java.
// 5 fields, 12 methods.

open class FragmentPagerAdapter: android.support.v4.view.PagerAdapter() {
    private var mCurTransaction: android.support.v4.app.FragmentTransaction
    private var mCurrentPrimaryItem: android.support.v4.app.Fragment
    private val mFragmentManager: android.support.v4.app.FragmentManager

    public constructor(fm: android.support.v4.app.FragmentManager)

    public fun destroyItem(container: android.view.ViewGroup, position: Int, object: Object) { /* TODO(body): (Landroid/view/ViewGroup;ILjava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         check-cast p3, Landroid/support/v4/app/Fragment;
    //         .end local p3    # "object":Ljava/lang/Object;
    //         invoke-virtual {v0, p3}, Landroid/support/v4/app/FragmentTransaction;->detach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //         return-void
    */

    public fun finishUpdate(container: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z
    //         :cond_0
    //         return-void
    */

    public fun getItem(p0: Int): android.support.v4.app.Fragment

    public fun getItemId(position: Int): Long { return TODO("body: (I)J") }
    /*
    //         .locals 2
    //         int-to-long v0, p1
    //         return-wide v0
    */

    public fun instantiateItem(container: android.view.ViewGroup, position: Int): Object { return TODO("body: (Landroid/view/ViewGroup;I)Ljava/lang/Object;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         if-nez v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v4
    //         iput-object v4, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         :cond_0
    //         invoke-virtual {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;->getItemId(I)J
    //         move-result-wide v2
    //         .local v2, "itemId":J
    //         invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
    //         move-result v4
    //         invoke-static {v4, v2, v3}, Landroid/support/v4/app/FragmentPagerAdapter;->makeFragmentName(IJ)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "name":Ljava/lang/String;
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;
    //         invoke-virtual {v4, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    //         move-result-object v0
    //         .local v0, "fragment":Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_2
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {v4, v0}, Landroid/support/v4/app/FragmentTransaction;->attach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //         :goto_0
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         if-eq v0, v4, :cond_1
    //         invoke-virtual {v0, v7}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
    //         invoke-virtual {v0, v7}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
    //         :cond_1
    //         return-object v0
    //         :cond_2
    //         invoke-virtual {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;->getItem(I)Landroid/support/v4/app/Fragment;
    //         move-result-object v0
    //         iget-object v4, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;
    //         invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
    //         move-result v5
    //         invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I
    //         move-result v6
    //         invoke-static {v6, v2, v3}, Landroid/support/v4/app/FragmentPagerAdapter;->makeFragmentName(IJ)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v4, v5, v0, v6}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
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
    //         .locals 0
    //         return-void
    */

    public fun saveState(): android.os.Parcelable { return TODO("body: ()Landroid/os/Parcelable;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun setPrimaryItem(container: android.view.ViewGroup, position: Int, object: Object) { /* TODO(body): (Landroid/view/ViewGroup;ILjava/lang/Object;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         move-object v0, p3
    //         check-cast v0, Landroid/support/v4/app/Fragment;
    //         .local v0, "fragment":Landroid/support/v4/app/Fragment;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         if-eq v0, v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0, v3}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V
    //         invoke-virtual {v0, v3}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V
    //         :cond_1
    //         iput-object v0, p0, Landroid/support/v4/app/FragmentPagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;
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
    private val TAG: String = "FragmentPagerAdapter"

    private @JvmStatic fun makeFragmentName(viewId: Int, id: Long): String { return TODO("body: (IJ)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "android:switcher:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
