package android.support.v4.app

// Auto-emitted from smali source: Fragment.java.
// 59 fields, 116 methods.

open class Fragment: android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener {
    var mActivity: android.support.v4.app.FragmentActivity
    var mAdded: Boolean
    var mAllowEnterTransitionOverlap: Boolean
    var mAllowReturnTransitionOverlap: Boolean
    var mAnimatingAway: android.view.View
    var mArguments: android.os.Bundle
    var mBackStackNesting: Int
    var mCalled: Boolean
    var mCheckedForLoaderManager: Boolean
    var mChildFragmentManager: android.support.v4.app.FragmentManagerImpl
    var mContainer: android.view.ViewGroup
    var mContainerId: Int
    var mDeferStart: Boolean
    var mDetached: Boolean
    var mEnterTransition: Object
    var mEnterTransitionCallback: android.support.v4.app.SharedElementCallback
    var mExitTransition: Object
    var mExitTransitionCallback: android.support.v4.app.SharedElementCallback
    var mFragmentId: Int
    var mFragmentManager: android.support.v4.app.FragmentManagerImpl
    var mFromLayout: Boolean
    var mHasMenu: Boolean
    var mHidden: Boolean
    var mInLayout: Boolean
    var mIndex: Int
    var mInnerView: android.view.View
    var mLoaderManager: android.support.v4.app.LoaderManagerImpl
    var mLoadersStarted: Boolean
    var mMenuVisible: Boolean
    var mNextAnim: Int
    var mParentFragment: android.support.v4.app.Fragment
    var mReenterTransition: Object
    var mRemoving: Boolean
    var mRestored: Boolean
    var mResumed: Boolean
    var mRetainInstance: Boolean
    var mRetaining: Boolean
    var mReturnTransition: Object
    var mSavedFragmentState: android.os.Bundle
    var mSavedViewState: android.util.SparseArray
    var mSharedElementEnterTransition: Object
    var mSharedElementReturnTransition: Object
    var mState: Int
    var mStateAfterAnimating: Int
    var mTag: String
    var mTarget: android.support.v4.app.Fragment
    var mTargetIndex: Int
    var mTargetRequestCode: Int
    var mUserVisibleHint: Boolean
    var mView: android.view.View
    var mWho: String

    public constructor()

    public fun dump(prefix: String, fd: java.io.FileDescriptor, writer: java.io.PrintWriter, args: Array<String>) { /* TODO(body): (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mFragmentId=#"
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, " mContainerId=#"
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, " mTag="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mState="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
    //         const-string v0, " mIndex="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
    //         const-string v0, " mWho="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, " mBackStackNesting="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mAdded="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mAdded:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mRemoving="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRemoving:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mResumed="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mResumed:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mFromLayout="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mFromLayout:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mInLayout="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mInLayout:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mHidden="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mDetached="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mDetached:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mMenuVisible="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mHasMenu="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mRetainInstance="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mRetaining="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRetaining:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
    //         const-string v0, " mUserVisibleHint="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mFragmentManager="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mActivity="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mParentFragment="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mArguments="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
    //         if-eqz v0, :cond_4
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mSavedFragmentState="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_4
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
    //         if-eqz v0, :cond_5
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mSavedViewState="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_5
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_6
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mTarget="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
    //         const-string v0, " mTargetRequestCode="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
    //         :cond_6
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         if-eqz v0, :cond_7
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mNextAnim="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
    //         :cond_7
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
    //         if-eqz v0, :cond_8
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mContainer="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_8
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         if-eqz v0, :cond_9
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mView="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_9
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
    //         if-eqz v0, :cond_a
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mInnerView="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_a
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
    //         if-eqz v0, :cond_b
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mAnimatingAway="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mStateAfterAnimating="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mStateAfterAnimating:I
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
    //         :cond_b
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_c
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "Loader Manager:"
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "  "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         :cond_c
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_d
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Child "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "  "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/FragmentManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         :cond_d
    //         return-void
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    fun findFragmentByWho(who: String): android.support.v4.app.Fragment { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/app/Fragment;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         .end local p0    # "this":Landroid/support/v4/app/Fragment;
    //         :goto_0
    //         return-object p0
    //         .restart local p0    # "this":Landroid/support/v4/app/Fragment;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentByWho(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_1
    //         const/4 p0, 0x0
    //         goto :goto_0
    */

    public fun getActivity(): android.support.v4.app.FragmentActivity { return TODO("body: ()Landroid/support/v4/app/FragmentActivity;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         return-object v0
    */

    public fun getAllowEnterTransitionOverlap(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAllowEnterTransitionOverlap:Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAllowEnterTransitionOverlap:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun getAllowReturnTransitionOverlap(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAllowReturnTransitionOverlap:Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAllowReturnTransitionOverlap:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun getArguments(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getChildFragmentManager(): android.support.v4.app.FragmentManager { return TODO("body: ()Landroid/support/v4/app/FragmentManager;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->instantiateChildFragmentManager()V
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
    //         const/4 v1, 0x5
    //         if-lt v0, v1, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V
    //         :cond_0
    //         :goto_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         return-object v0
    //         :cond_1
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
    //         const/4 v1, 0x4
    //         if-lt v0, v1, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V
    //         goto :goto_0
    //         :cond_2
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
    //         const/4 v1, 0x2
    //         if-lt v0, v1, :cond_3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V
    //         goto :goto_0
    //         :cond_3
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
    //         const/4 v1, 0x1
    //         if-lt v0, v1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V
    //         goto :goto_0
    */

    public fun getEnterTransition(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mEnterTransition:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getExitTransition(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mExitTransition:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getFragmentManager(): android.support.v4.app.FragmentManager { return TODO("body: ()Landroid/support/v4/app/FragmentManager;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         return-object v0
    */

    public fun getId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         return v0
    */

    public fun getLayoutInflater(savedInstanceState: android.os.Bundle): android.view.LayoutInflater { return TODO("body: (Landroid/os/Bundle;)Landroid/view/LayoutInflater;") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
    //         move-result-object v1
    //         iget-object v2, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v1, v2}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //         move-result-object v0
    //         .local v0, "result":Landroid/view/LayoutInflater;
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->getLayoutInflaterFactory()Landroid/view/LayoutInflater$Factory;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V
    //         return-object v0
    */

    public fun getLoaderManager(): android.support.v4.app.LoaderManager { return TODO("body: ()Landroid/support/v4/app/LoaderManager;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " not attached to Activity"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iput-boolean v3, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         goto :goto_0
    */

    public fun getParentFragment(): android.support.v4.app.Fragment { return TODO("body: ()Landroid/support/v4/app/Fragment;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
    //         return-object v0
    */

    public fun getReenterTransition(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mReenterTransition:Ljava/lang/Object;
    //         sget-object v1, Landroid/support/v4/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getExitTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mReenterTransition:Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun getResources(): android.content.res.Resources { return TODO("body: ()Landroid/content/res/Resources;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " not attached to Activity"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRetainInstance(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
    //         return v0
    */

    public fun getReturnTransition(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mReturnTransition:Ljava/lang/Object;
    //         sget-object v1, Landroid/support/v4/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getEnterTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mReturnTransition:Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun getSharedElementEnterTransition(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSharedElementEnterTransition:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getSharedElementReturnTransition(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSharedElementReturnTransition:Ljava/lang/Object;
    //         sget-object v1, Landroid/support/v4/app/Fragment;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getSharedElementEnterTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSharedElementReturnTransition:Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun getString(resId: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getString(resId: Int, formatArgs: Array<Object>): String { return TODO("body: (I[Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTag(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTargetFragment(): android.support.v4.app.Fragment { return TODO("body: ()Landroid/support/v4/app/Fragment;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
    //         return-object v0
    */

    public fun getTargetRequestCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
    //         return v0
    */

    public fun getText(resId: Int): CharSequence { return TODO("body: (I)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getUserVisibleHint(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
    //         return v0
    */

    public fun getView(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 1
    //         .annotation build Landroid/support/annotation/Nullable;
    //         .end annotation
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         return-object v0
    */

    public fun hasOptionsMenu(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Ljava/lang/Object;->hashCode()I
    //         move-result v0
    //         return v0
    */

    fun initState() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         const/4 v1, 0x0
    //         const/4 v0, -0x1
    //         iput v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         iput-object v2, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mAdded:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mRemoving:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mResumed:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mFromLayout:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mInLayout:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mRestored:Z
    //         iput v1, p0, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         iput-object v2, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iput-object v2, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iput-object v2, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iput v1, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         iput v1, p0, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         iput-object v2, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mDetached:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mRetaining:Z
    //         iput-object v2, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         return-void
    */

    fun instantiateChildFragmentManager() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerImpl;-><init>()V
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         new-instance v2, Landroid/support/v4/app/Fragment$1;
    //         invoke-direct {v2, p0}, Landroid/support/v4/app/Fragment$1;-><init>(Landroid/support/v4/app/Fragment;)V
    //         invoke-virtual {v0, v1, v2, p0}, Landroid/support/v4/app/FragmentManagerImpl;->attachActivity(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V
    //         return-void
    */

    public fun isAdded(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mAdded:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isDetached(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mDetached:Z
    //         return v0
    */

    public fun isHidden(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         return v0
    */

    fun isInBackStack(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isInLayout(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mInLayout:Z
    //         return v0
    */

    public fun isMenuVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         return v0
    */

    public fun isRemoving(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRemoving:Z
    //         return v0
    */

    public fun isResumed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mResumed:Z
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isAdded()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isHidden()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onActivityCreated(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         .end param
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onActivityResult(requestCode: Int, resultCode: Int, data: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onAttach(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onConfigurationChanged(newConfig: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onContextItemSelected(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onCreateAnimation(transit: Int, enter: Boolean, nextAnim: Int): android.view.animation.Animation { return TODO("body: (IZI)Landroid/view/animation/Animation;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onCreateContextMenu(menu: android.view.ContextMenu, v: android.view.View, menuInfo: android.view.ContextMenu.ContextMenuInfo) { /* TODO(body): (Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    //         return-void
    */

    public fun onCreateOptionsMenu(menu: android.view.Menu, inflater: android.view.MenuInflater) { /* TODO(body): (Landroid/view/Menu;Landroid/view/MenuInflater;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onCreateView(inflater: android.view.LayoutInflater, container: android.view.ViewGroup, savedInstanceState: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         .end param
    //         .end param
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         if-nez v0, :cond_0
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
    //         :cond_1
    //         return-void
    */

    public fun onDestroyOptionsMenu() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onDestroyView() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onDetach() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onHiddenChanged(hidden: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onInflate(activity: android.app.Activity, attrs: android.util.AttributeSet, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onOptionsItemSelected(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onOptionsMenuClosed(menu: android.view.Menu) { /* TODO(body): (Landroid/view/Menu;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onPrepareOptionsMenu(menu: android.view.Menu) { /* TODO(body): (Landroid/view/Menu;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         if-nez v0, :cond_1
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         if-nez v0, :cond_0
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
    //         :cond_1
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    public fun onViewCreated(view: android.view.View, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/view/View;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         .end param
    //         return-void
    */

    public fun onViewStateRestored(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         .end param
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         return-void
    */

    fun performActivityCreated(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onActivityCreated()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V
    //         :cond_2
    //         return-void
    */

    fun performConfigurationChanged(newConfig: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
    //         :cond_0
    //         return-void
    */

    fun performContextItemSelected(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         if-nez v1, :cond_2
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onContextItemSelected(Landroid/view/MenuItem;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchContextItemSelected(Landroid/view/MenuItem;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun performCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         :cond_0
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v1, :cond_1
    //         new-instance v1, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Fragment "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " did not call through to super.onCreate()"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_1
    //         if-eqz p1, :cond_3
    //         const-string v1, "android:support:fragments"
    //         invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         .local v0, "p":Landroid/os/Parcelable;
    //         if-eqz v0, :cond_3
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-nez v1, :cond_2
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->instantiateChildFragmentManager()V
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentManagerImpl;->restoreAllState(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V
    //         .end local v0    # "p":Landroid/os/Parcelable;
    //         :cond_3
    //         return-void
    */

    fun performCreateOptionsMenu(menu: android.view.Menu, inflater: android.view.MenuInflater): Boolean { return TODO("body: (Landroid/view/Menu;Landroid/view/MenuInflater;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "show":Z
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         if-nez v1, :cond_1
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         if-eqz v1, :cond_0
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1, p1, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    //         move-result v1
    //         or-int/2addr v0, v1
    //         :cond_1
    //         return v0
    */

    fun performCreateView(inflater: android.view.LayoutInflater, container: android.view.ViewGroup, savedInstanceState: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         :cond_0
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    fun performDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroy()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onDestroy()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    fun performDestroyView() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroyView()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onDestroyView()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doReportNextStart()V
    //         :cond_2
    //         return-void
    */

    fun performLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onLowMemory()V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchLowMemory()V
    //         :cond_0
    //         return-void
    */

    fun performOptionsItemSelected(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         if-nez v1, :cond_2
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         if-eqz v1, :cond_1
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         if-eqz v1, :cond_1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun performOptionsMenuClosed(menu: android.view.Menu) { /* TODO(body): (Landroid/view/Menu;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         if-nez v0, :cond_1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsMenuClosed(Landroid/view/Menu;)V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsMenuClosed(Landroid/view/Menu;)V
    //         :cond_1
    //         return-void
    */

    fun performPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPause()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onPause()V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onPause()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    fun performPrepareOptionsMenu(menu: android.view.Menu): Boolean { return TODO("body: (Landroid/view/Menu;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "show":Z
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         if-nez v1, :cond_1
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         if-eqz v1, :cond_0
    //         iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onPrepareOptionsMenu(Landroid/view/Menu;)V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
    //         move-result v1
    //         or-int/2addr v0, v1
    //         :cond_1
    //         return v0
    */

    fun performReallyStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchReallyStop()V
    //         :cond_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         if-eqz v0, :cond_2
    //         iput-boolean v3, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iget-boolean v0, v0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
    //         if-nez v0, :cond_3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStop()V
    //         :cond_2
    //         :goto_0
    //         return-void
    //         :cond_3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doRetain()V
    //         goto :goto_0
    */

    fun performResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onResume()V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onResume()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
    //         :cond_2
    //         return-void
    */

    fun performSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->saveAllState()Landroid/os/Parcelable;
    //         move-result-object v0
    //         .local v0, "p":Landroid/os/Parcelable;
    //         if-eqz v0, :cond_0
    //         const-string v1, "android:support:fragments"
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         .end local v0    # "p":Landroid/os/Parcelable;
    //         :cond_0
    //         return-void
    */

    fun performStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onStart()V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onStart()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V
    //         :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doReportStart()V
    //         :cond_3
    //         return-void
    */

    fun performStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStop()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onStop()V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onStop()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    public fun registerForContextMenu(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1, p0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V
    //         return-void
    */

    fun restoreViewState(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
    //         invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onViewStateRestored(Landroid/os/Bundle;)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " did not call through to super.onViewStateRestored()"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    public fun setAllowEnterTransitionOverlap(allow: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mAllowEnterTransitionOverlap:Ljava/lang/Boolean;
    //         return-void
    */

    public fun setAllowReturnTransitionOverlap(allow: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mAllowReturnTransitionOverlap:Ljava/lang/Boolean;
    //         return-void
    */

    public fun setArguments(args: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         if-ltz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Fragment already active"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
    //         return-void
    */

    public fun setEnterSharedElementCallback(callback: android.support.v4.app.SharedElementCallback) { /* TODO(body): (Landroid/support/v4/app/SharedElementCallback;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         return-void
    */

    public fun setEnterTransition(transition: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mEnterTransition:Ljava/lang/Object;
    //         return-void
    */

    public fun setExitSharedElementCallback(callback: android.support.v4.app.SharedElementCallback) { /* TODO(body): (Landroid/support/v4/app/SharedElementCallback;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         return-void
    */

    public fun setExitTransition(transition: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mExitTransition:Ljava/lang/Object;
    //         return-void
    */

    public fun setHasOptionsMenu(hasMenu: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         if-eq v0, p1, :cond_0
    //         iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isAdded()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isHidden()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->supportInvalidateOptionsMenu()V
    //         :cond_0
    //         return-void
    */

    fun setIndex(index: Int, parent: android.support.v4.app.Fragment) { /* TODO(body): (ILandroid/support/v4/app/Fragment;)V */ }
    /*
    //         .locals 2
    //         iput p1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         if-eqz p2, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ":"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "android:fragment:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
    //         goto :goto_0
    */

    public fun setInitialSavedState(state: android.support.v4.app.Fragment.SavedState) { /* TODO(body): (Landroid/support/v4/app/Fragment$SavedState;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         if-ltz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Fragment already active"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         iget-object v0, p1, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p1, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
    //         :goto_0
    //         iput-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setMenuVisibility(menuVisible: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         if-eq v0, p1, :cond_0
    //         iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isAdded()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isHidden()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->supportInvalidateOptionsMenu()V
    //         :cond_0
    //         return-void
    */

    public fun setReenterTransition(transition: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mReenterTransition:Ljava/lang/Object;
    //         return-void
    */

    public fun setRetainInstance(retain: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Can\'t retain fragements that are nested in other fragments"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
    //         return-void
    */

    public fun setReturnTransition(transition: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mReturnTransition:Ljava/lang/Object;
    //         return-void
    */

    public fun setSharedElementEnterTransition(transition: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mSharedElementEnterTransition:Ljava/lang/Object;
    //         return-void
    */

    public fun setSharedElementReturnTransition(transition: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mSharedElementReturnTransition:Ljava/lang/Object;
    //         return-void
    */

    public fun setTargetFragment(fragment: android.support.v4.app.Fragment, requestCode: Int) { /* TODO(body): (Landroid/support/v4/app/Fragment;I)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
    //         iput p2, p0, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
    //         return-void
    */

    public fun setUserVisibleHint(isVisibleToUser: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
    //         if-nez v0, :cond_0
    //         if-eqz p1, :cond_0
    //         iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
    //         const/4 v1, 0x4
    //         if-ge v0, v1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentManagerImpl;->performPendingDeferredStart(Landroid/support/v4/app/Fragment;)V
    //         :cond_0
    //         iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
    //         if-nez p1, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mDeferStart:Z
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun startActivity(intent: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " not attached to Activity"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         const/4 v1, -0x1
    //         invoke-virtual {v0, p0, p1, v1}, Landroid/support/v4/app/FragmentActivity;->startActivityFromFragment(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
    //         return-void
    */

    public fun startActivityForResult(intent: android.content.Intent, requestCode: Int) { /* TODO(body): (Landroid/content/Intent;I)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Fragment "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " not attached to Activity"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->startActivityFromFragment(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const/16 v1, 0x80
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v0, "sb":Ljava/lang/StringBuilder;
    //         invoke-static {p0, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
    //         iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         if-ltz v1, :cond_0
    //         const-string v1, " #"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         :cond_0
    //         iget v1, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         if-eqz v1, :cond_1
    //         const-string v1, " id=0x"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget v1, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         if-eqz v1, :cond_2
    //         const-string v1, " "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_2
    //         const/16 v1, 0x7d
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

    public fun unregisterForContextMenu(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V
    //         return-void
    */

    companion object {
    val ACTIVITY_CREATED: Int = 0x2
    val CREATED: Int = 0x1
    val INITIALIZING: Int = 0x0
    val RESUMED: Int = 0x5
    val STARTED: Int = 0x4
    val STOPPED: Int = 0x3
    val USE_DEFAULT_TRANSITION: Object = null!!
    private val sClassMap: android.support.v4.util.SimpleArrayMap = null!!

    public @JvmStatic fun instantiate(context: android.content.Context, fname: String): android.support.v4.app.Fragment { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, p1, v0}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun instantiate(context: android.content.Context, fname: String, args: android.os.Bundle): android.support.v4.app.Fragment { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;") }
    /*
    //         .locals 6
    //         :try_start_0
    //         sget-object v3, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v3, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Class;
    //         .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v3
    //         invoke-virtual {v3, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         sget-object v3, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v3, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/app/Fragment;
    //         .local v2, "f":Landroid/support/v4/app/Fragment;
    //         if-eqz p2, :cond_1
    //         invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v3
    //         invoke-virtual {p2, v3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         iput-object p2, v2, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
    //         :try_end_0
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    //         :cond_1
    //         return-object v2
    //         .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/ClassNotFoundException;
    //         new-instance v3, Landroid/support/v4/app/Fragment$InstantiationException;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Unable to instantiate fragment "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ": make sure class name exists, is public, and has an"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " empty constructor that is public"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-direct {v3, v4, v1}, Landroid/support/v4/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V
    //         throw v3
    //         .end local v1    # "e":Ljava/lang/ClassNotFoundException;
    //         :catch_1
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/InstantiationException;
    //         new-instance v3, Landroid/support/v4/app/Fragment$InstantiationException;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Unable to instantiate fragment "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ": make sure class name exists, is public, and has an"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " empty constructor that is public"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-direct {v3, v4, v1}, Landroid/support/v4/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V
    //         throw v3
    //         .end local v1    # "e":Ljava/lang/InstantiationException;
    //         :catch_2
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/IllegalAccessException;
    //         new-instance v3, Landroid/support/v4/app/Fragment$InstantiationException;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Unable to instantiate fragment "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ": make sure class name exists, is public, and has an"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " empty constructor that is public"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-direct {v3, v4, v1}, Landroid/support/v4/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V
    //         throw v3
    */

    @JvmStatic fun isSupportFragmentClass(context: android.content.Context, fname: String): Boolean { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         :try_start_0
    //         sget-object v2, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v2, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Class;
    //         .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         sget-object v2, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
    //         invoke-virtual {v2, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         const-class v2, Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         :try_end_0
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v2
    //         .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         :goto_0
    //         return v2
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/ClassNotFoundException;
    //         const/4 v2, 0x0
    //         goto :goto_0
    */

    }
}
