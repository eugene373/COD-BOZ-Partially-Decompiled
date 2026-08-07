package android.support.v4.app

// Auto-emitted from smali source: BackStackRecord.java.
// 30 fields, 70 methods.

class BackStackRecord: android.support.v4.app.FragmentTransaction(), android.support.v4.app.FragmentManager.BackStackEntry, Runnable {
    var mAddToBackStack: Boolean
    var mAllowAddToBackStack: Boolean
    var mBreadCrumbShortTitleRes: Int
    var mBreadCrumbShortTitleText: CharSequence
    var mBreadCrumbTitleRes: Int
    var mBreadCrumbTitleText: CharSequence
    var mCommitted: Boolean
    var mEnterAnim: Int
    var mExitAnim: Int
    var mHead: android.support.v4.app.BackStackRecord.Op
    var mIndex: Int
    val mManager: android.support.v4.app.FragmentManagerImpl
    var mName: String
    var mNumOp: Int
    var mPopEnterAnim: Int
    var mPopExitAnim: Int
    var mSharedElementSourceNames: java.util.ArrayList
    var mSharedElementTargetNames: java.util.ArrayList
    var mTail: android.support.v4.app.BackStackRecord.Op
    var mTransition: Int
    var mTransitionStyle: Int

    public constructor(manager: android.support.v4.app.FragmentManagerImpl)

    private fun beginTransition(isBack: android.util.SparseArray, p1: android.util.SparseArray, p2: Boolean): android.support.v4.app.BackStackRecord.TransitionState { return TODO("body: (Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/BackStackRecord$TransitionState;") }
    /*
    //         .locals 8
    //         .local p1, "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         .local p2, "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         new-instance v2, Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         invoke-direct {v2, p0}, Landroid/support/v4/app/BackStackRecord$TransitionState;-><init>(Landroid/support/v4/app/BackStackRecord;)V
    //         .local v2, "state":Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         new-instance v0, Landroid/view/View;
    //         iget-object v3, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v3, v3, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         invoke-direct {v0, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V
    //         iput-object v0, v2, Landroid/support/v4/app/BackStackRecord$TransitionState;->nonExistentView:Landroid/view/View;
    //         const/4 v6, 0x0
    //         .local v6, "anyTransitionStarted":Z
    //         const/4 v7, 0x0
    //         .local v7, "i":I
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/util/SparseArray;->size()I
    //         move-result v0
    //         if-ge v7, v0, :cond_1
    //         invoke-virtual {p1, v7}, Landroid/util/SparseArray;->keyAt(I)I
    //         move-result v1
    //         .local v1, "containerId":I
    //         move-object v0, p0
    //         move v3, p3
    //         move-object v4, p1
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/BackStackRecord;->configureTransitions(ILandroid/support/v4/app/BackStackRecord$TransitionState;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v6, 0x1
    //         :cond_0
    //         add-int/lit8 v7, v7, 0x1
    //         goto :goto_0
    //         .end local v1    # "containerId":I
    //         :cond_1
    //         const/4 v7, 0x0
    //         :goto_1
    //         invoke-virtual {p2}, Landroid/util/SparseArray;->size()I
    //         move-result v0
    //         if-ge v7, v0, :cond_3
    //         invoke-virtual {p2, v7}, Landroid/util/SparseArray;->keyAt(I)I
    //         move-result v1
    //         .restart local v1    # "containerId":I
    //         invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         move-object v0, p0
    //         move v3, p3
    //         move-object v4, p1
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/BackStackRecord;->configureTransitions(ILandroid/support/v4/app/BackStackRecord$TransitionState;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const/4 v6, 0x1
    //         :cond_2
    //         add-int/lit8 v7, v7, 0x1
    //         goto :goto_1
    //         .end local v1    # "containerId":I
    //         :cond_3
    //         if-nez v6, :cond_4
    //         const/4 v2, 0x0
    //         :cond_4
    //         return-object v2
    */

    private fun calculateFragments(p0: android.util.SparseArray, p1: android.util.SparseArray) { /* TODO(body): (Landroid/util/SparseArray;Landroid/util/SparseArray;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/util/SparseArray",
    //                 "<",
    //                 "Landroid/support/v4/app/Fragment;",
    //                 ">;",
    //                 "Landroid/util/SparseArray",
    //                 "<",
    //                 "Landroid/support/v4/app/Fragment;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         .local p2, "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mContainer:Landroid/support/v4/app/FragmentContainer;
    //         invoke-interface {v4}, Landroid/support/v4/app/FragmentContainer;->hasView()Z
    //         move-result v4
    //         if-nez v4, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v3, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         .local v3, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         :goto_0
    //         if-eqz v3, :cond_0
    //         iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         packed-switch v4, :pswitch_data_0
    //         :goto_1
    //         iget-object v3, v3, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
    //         goto :goto_0
    //         :pswitch_0
    //         iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-direct {p0, p2, v4}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_1
    //         iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .local v0, "f":Landroid/support/v4/app/Fragment;
    //         iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         if-eqz v4, :cond_5
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_2
    //         iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
    //         move-result v4
    //         if-ge v1, v4, :cond_5
    //         iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/app/Fragment;
    //         .local v2, "old":Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_2
    //         iget v4, v2, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         iget v5, v0, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         if-ne v4, v5, :cond_3
    //         :cond_2
    //         if-ne v2, v0, :cond_4
    //         const/4 v0, 0x0
    //         :cond_3
    //         :goto_3
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_2
    //         :cond_4
    //         invoke-static {p1, v2}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_3
    //         .end local v1    # "i":I
    //         .end local v2    # "old":Landroid/support/v4/app/Fragment;
    //         :cond_5
    //         invoke-direct {p0, p2, v0}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         .end local v0    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_2
    //         iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {p1, v4}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_3
    //         iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {p1, v4}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_4
    //         iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-direct {p0, p2, v4}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_5
    //         iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {p1, v4}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_6
    //         iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-direct {p0, p2, v4}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //         .end packed-switch
    */

    private fun callSharedElementEnd(state: android.support.v4.app.BackStackRecord.TransitionState, inFragment: android.support.v4.app.Fragment, outFragment: android.support.v4.app.Fragment, isBack: Boolean, p4: android.support.v4.util.ArrayMap) { /* TODO(body): (Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;ZLandroid/support/v4/util/ArrayMap;)V */ }
    /*
    //         .locals 4
    //         .local p5, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         if-eqz p4, :cond_1
    //         iget-object v1, p3, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         .local v1, "sharedElementCallback":Landroid/support/v4/app/SharedElementCallback;
    //         :goto_0
    //         if-eqz v1, :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-virtual {p5}, Landroid/support/v4/util/ArrayMap;->keySet()Ljava/util/Set;
    //         move-result-object v3
    //         invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         .local v0, "names":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-virtual {p5}, Landroid/support/v4/util/ArrayMap;->values()Ljava/util/Collection;
    //         move-result-object v3
    //         invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         .local v2, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v0, v2, v3}, Landroid/support/v4/app/SharedElementCallback;->onSharedElementEnd(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    //         .end local v0    # "names":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         .end local v2    # "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         :cond_0
    //         return-void
    //         .end local v1    # "sharedElementCallback":Landroid/support/v4/app/SharedElementCallback;
    //         :cond_1
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         goto :goto_0
    */

    private fun configureTransitions(containerId: Int, state: android.support.v4.app.BackStackRecord.TransitionState, isBack: Boolean, p3: android.util.SparseArray, p4: android.util.SparseArray): Boolean { return TODO("body: (ILandroid/support/v4/app/BackStackRecord$TransitionState;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z") }
    /*
    //         .locals 38
    //         .local p4, "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         .local p5, "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         move-object/from16 v0, p0
    //         iget-object v4, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mContainer:Landroid/support/v4/app/FragmentContainer;
    //         move/from16 v0, p1
    //         invoke-interface {v4, v0}, Landroid/support/v4/app/FragmentContainer;->findViewById(I)Landroid/view/View;
    //         move-result-object v6
    //         check-cast v6, Landroid/view/ViewGroup;
    //         .local v6, "sceneRoot":Landroid/view/ViewGroup;
    //         if-nez v6, :cond_0
    //         const/4 v4, 0x0
    //         :goto_0
    //         return v4
    //         :cond_0
    //         move-object/from16 v0, p5
    //         move/from16 v1, p1
    //         invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
    //         move-result-object v8
    //         check-cast v8, Landroid/support/v4/app/Fragment;
    //         .local v8, "inFragment":Landroid/support/v4/app/Fragment;
    //         move-object/from16 v0, p4
    //         move/from16 v1, p1
    //         invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
    //         move-result-object v9
    //         check-cast v9, Landroid/support/v4/app/Fragment;
    //         .local v9, "outFragment":Landroid/support/v4/app/Fragment;
    //         move/from16 v0, p3
    //         invoke-static {v8, v0}, Landroid/support/v4/app/BackStackRecord;->getEnterTransition(Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;
    //         move-result-object v12
    //         .local v12, "enterTransition":Ljava/lang/Object;
    //         move/from16 v0, p3
    //         invoke-static {v8, v9, v0}, Landroid/support/v4/app/BackStackRecord;->getSharedElementTransition(Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;
    //         move-result-object v7
    //         .local v7, "sharedElementTransition":Ljava/lang/Object;
    //         move/from16 v0, p3
    //         invoke-static {v9, v0}, Landroid/support/v4/app/BackStackRecord;->getExitTransition(Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;
    //         move-result-object v25
    //         .local v25, "exitTransition":Ljava/lang/Object;
    //         if-nez v12, :cond_1
    //         if-nez v7, :cond_1
    //         if-nez v25, :cond_1
    //         const/4 v4, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/16 v35, 0x0
    //         .local v35, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         new-instance v11, Ljava/util/ArrayList;
    //         invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
    //         .local v11, "sharedElementTargets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         if-eqz v7, :cond_2
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p2
    //         move/from16 v2, p3
    //         invoke-direct {v0, v1, v9, v2}, Landroid/support/v4/app/BackStackRecord;->remapSharedElements(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/util/ArrayMap;
    //         move-result-object v35
    //         invoke-virtual/range {v35 .. v35}, Landroid/support/v4/util/ArrayMap;->isEmpty()Z
    //         move-result v4
    //         if-eqz v4, :cond_7
    //         move-object/from16 v0, p2
    //         iget-object v4, v0, Landroid/support/v4/app/BackStackRecord$TransitionState;->nonExistentView:Landroid/view/View;
    //         invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :goto_1
    //         if-eqz p3, :cond_8
    //         iget-object v0, v9, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         move-object/from16 v33, v0
    //         .local v33, "callback":Landroid/support/v4/app/SharedElementCallback;
    //         :goto_2
    //         if-eqz v33, :cond_2
    //         new-instance v36, Ljava/util/ArrayList;
    //         invoke-virtual/range {v35 .. v35}, Landroid/support/v4/util/ArrayMap;->keySet()Ljava/util/Set;
    //         move-result-object v4
    //         move-object/from16 v0, v36
    //         invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         .local v36, "names":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         new-instance v37, Ljava/util/ArrayList;
    //         invoke-virtual/range {v35 .. v35}, Landroid/support/v4/util/ArrayMap;->values()Ljava/util/Collection;
    //         move-result-object v4
    //         move-object/from16 v0, v37
    //         invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         .local v37, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         const/4 v4, 0x0
    //         move-object/from16 v0, v33
    //         move-object/from16 v1, v36
    //         move-object/from16 v2, v37
    //         invoke-virtual {v0, v1, v2, v4}, Landroid/support/v4/app/SharedElementCallback;->onSharedElementStart(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    //         .end local v33    # "callback":Landroid/support/v4/app/SharedElementCallback;
    //         .end local v36    # "names":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         .end local v37    # "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         :cond_2
    //         new-instance v26, Ljava/util/ArrayList;
    //         invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V
    //         .local v26, "exitingViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         move-object/from16 v0, v25
    //         move-object/from16 v1, v26
    //         move-object/from16 v2, v35
    //         invoke-static {v0, v9, v1, v2}, Landroid/support/v4/app/BackStackRecord;->captureExitingViews(Ljava/lang/Object;Landroid/support/v4/app/Fragment;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;)Ljava/lang/Object;
    //         move-result-object v25
    //         move-object/from16 v0, p0
    //         iget-object v4, v0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         if-eqz v4, :cond_4
    //         if-eqz v35, :cond_4
    //         move-object/from16 v0, p0
    //         iget-object v4, v0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         const/4 v5, 0x0
    //         invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v4
    //         move-object/from16 v0, v35
    //         invoke-virtual {v0, v4}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v34
    //         check-cast v34, Landroid/view/View;
    //         .local v34, "epicenterView":Landroid/view/View;
    //         if-eqz v34, :cond_4
    //         if-eqz v25, :cond_3
    //         move-object/from16 v0, v25
    //         move-object/from16 v1, v34
    //         invoke-static {v0, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->setEpicenter(Ljava/lang/Object;Landroid/view/View;)V
    //         :cond_3
    //         if-eqz v7, :cond_4
    //         move-object/from16 v0, v34
    //         invoke-static {v7, v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->setEpicenter(Ljava/lang/Object;Landroid/view/View;)V
    //         .end local v34    # "epicenterView":Landroid/view/View;
    //         :cond_4
    //         new-instance v15, Landroid/support/v4/app/BackStackRecord$1;
    //         move-object/from16 v0, p0
    //         invoke-direct {v15, v0, v8}, Landroid/support/v4/app/BackStackRecord$1;-><init>(Landroid/support/v4/app/BackStackRecord;Landroid/support/v4/app/Fragment;)V
    //         .local v15, "viewRetriever":Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;
    //         if-eqz v7, :cond_5
    //         move-object/from16 v4, p0
    //         move-object/from16 v5, p2
    //         move/from16 v10, p3
    //         invoke-direct/range {v4 .. v11}, Landroid/support/v4/app/BackStackRecord;->prepareSharedElementTransition(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/view/View;Ljava/lang/Object;Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;ZLjava/util/ArrayList;)V
    //         :cond_5
    //         new-instance v19, Ljava/util/ArrayList;
    //         invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V
    //         .local v19, "enteringViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         new-instance v20, Landroid/support/v4/util/ArrayMap;
    //         invoke-direct/range {v20 .. v20}, Landroid/support/v4/util/ArrayMap;-><init>()V
    //         .local v20, "renamedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         if-eqz p3, :cond_9
    //         invoke-virtual {v8}, Landroid/support/v4/app/Fragment;->getAllowReturnTransitionOverlap()Z
    //         move-result v32
    //         .local v32, "allowOverlap":Z
    //         :goto_3
    //         move-object/from16 v0, v25
    //         move/from16 v1, v32
    //         invoke-static {v12, v0, v7, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->mergeTransitions(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    //         move-result-object v29
    //         .local v29, "transition":Ljava/lang/Object;
    //         if-eqz v29, :cond_6
    //         move-object/from16 v0, p2
    //         iget-object v0, v0, Landroid/support/v4/app/BackStackRecord$TransitionState;->nonExistentView:Landroid/view/View;
    //         move-object/from16 v16, v0
    //         move-object/from16 v0, p2
    //         iget-object v0, v0, Landroid/support/v4/app/BackStackRecord$TransitionState;->enteringEpicenterView:Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;
    //         move-object/from16 v17, v0
    //         move-object/from16 v0, p2
    //         iget-object v0, v0, Landroid/support/v4/app/BackStackRecord$TransitionState;->nameOverrides:Landroid/support/v4/util/ArrayMap;
    //         move-object/from16 v18, v0
    //         move-object v13, v7
    //         move-object v14, v6
    //         move-object/from16 v21, v11
    //         invoke-static/range {v12 .. v21}, Landroid/support/v4/app/FragmentTransitionCompat21;->addTransitionTargets(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;Landroid/view/View;Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;)V
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p2
    //         move/from16 v2, p1
    //         move-object/from16 v3, v29
    //         invoke-direct {v0, v6, v1, v2, v3}, Landroid/support/v4/app/BackStackRecord;->excludeHiddenFragmentsAfterEnter(Landroid/view/View;Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V
    //         move-object/from16 v0, p2
    //         iget-object v4, v0, Landroid/support/v4/app/BackStackRecord$TransitionState;->nonExistentView:Landroid/view/View;
    //         const/4 v5, 0x1
    //         move-object/from16 v0, v29
    //         invoke-static {v0, v4, v5}, Landroid/support/v4/app/FragmentTransitionCompat21;->excludeTarget(Ljava/lang/Object;Landroid/view/View;Z)V
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p2
    //         move/from16 v2, p1
    //         move-object/from16 v3, v29
    //         invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/app/BackStackRecord;->excludeHiddenFragments(Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V
    //         move-object/from16 v0, v29
    //         invoke-static {v6, v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->beginDelayedTransition(Landroid/view/ViewGroup;Ljava/lang/Object;)V
    //         move-object/from16 v0, p2
    //         iget-object v0, v0, Landroid/support/v4/app/BackStackRecord$TransitionState;->nonExistentView:Landroid/view/View;
    //         move-object/from16 v22, v0
    //         move-object/from16 v0, p2
    //         iget-object v0, v0, Landroid/support/v4/app/BackStackRecord$TransitionState;->hiddenFragmentViews:Ljava/util/ArrayList;
    //         move-object/from16 v30, v0
    //         move-object/from16 v21, v6
    //         move-object/from16 v23, v12
    //         move-object/from16 v24, v19
    //         move-object/from16 v27, v7
    //         move-object/from16 v28, v11
    //         move-object/from16 v31, v20
    //         invoke-static/range {v21 .. v31}, Landroid/support/v4/app/FragmentTransitionCompat21;->cleanupTransitions(Landroid/view/View;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/Map;)V
    //         :cond_6
    //         if-eqz v29, :cond_a
    //         const/4 v4, 0x1
    //         goto/16 :goto_0
    //         .end local v15    # "viewRetriever":Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;
    //         .end local v19    # "enteringViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .end local v20    # "renamedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         .end local v26    # "exitingViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .end local v29    # "transition":Ljava/lang/Object;
    //         .end local v32    # "allowOverlap":Z
    //         :cond_7
    //         invoke-virtual/range {v35 .. v35}, Landroid/support/v4/util/ArrayMap;->values()Ljava/util/Collection;
    //         move-result-object v4
    //         invoke-virtual {v11, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         goto/16 :goto_1
    //         :cond_8
    //         iget-object v0, v8, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         move-object/from16 v33, v0
    //         goto/16 :goto_2
    //         .restart local v15    # "viewRetriever":Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;
    //         .restart local v19    # "enteringViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .restart local v20    # "renamedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         .restart local v26    # "exitingViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         :cond_9
    //         invoke-virtual {v8}, Landroid/support/v4/app/Fragment;->getAllowEnterTransitionOverlap()Z
    //         move-result v32
    //         goto :goto_3
    //         .restart local v29    # "transition":Ljava/lang/Object;
    //         .restart local v32    # "allowOverlap":Z
    //         :cond_a
    //         const/4 v4, 0x0
    //         goto/16 :goto_0
    */

    private fun doAddOp(containerViewId: Int, fragment: android.support.v4.app.Fragment, tag: String, opcmd: Int) { /* TODO(body): (ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iput-object v1, p2, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         if-eqz p3, :cond_1
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Can\'t change tag of fragment "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ": was "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " now "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         iput-object p3, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
    //         :cond_1
    //         if-eqz p1, :cond_3
    //         iget v1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         if-eqz v1, :cond_2
    //         iget v1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         if-eq v1, p1, :cond_2
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Can\'t change container ID of fragment "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ": was "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget v3, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " now "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_2
    //         iput p1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
    //         iput p1, p2, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         :cond_3
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
    //         invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
    //         .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         iput p4, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         iput-object p2, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    //         return-void
    */

    private fun excludeHiddenFragments(state: android.support.v4.app.BackStackRecord.TransitionState, containerId: Int, transition: Object) { /* TODO(body): (Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         if-eqz v2, :cond_2
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         if-ge v1, v2, :cond_2
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/Fragment;
    //         .local v0, "fragment":Landroid/support/v4/app/Fragment;
    //         iget-object v2, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         if-eqz v2, :cond_0
    //         iget-object v2, v0, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
    //         if-eqz v2, :cond_0
    //         iget v2, v0, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         if-ne v2, p2, :cond_0
    //         iget-boolean v2, v0, Landroid/support/v4/app/Fragment;->mHidden:Z
    //         if-eqz v2, :cond_1
    //         iget-object v2, p1, Landroid/support/v4/app/BackStackRecord$TransitionState;->hiddenFragmentViews:Ljava/util/ArrayList;
    //         iget-object v3, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         iget-object v2, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         const/4 v3, 0x1
    //         invoke-static {p3, v2, v3}, Landroid/support/v4/app/FragmentTransitionCompat21;->excludeTarget(Ljava/lang/Object;Landroid/view/View;Z)V
    //         iget-object v2, p1, Landroid/support/v4/app/BackStackRecord$TransitionState;->hiddenFragmentViews:Ljava/util/ArrayList;
    //         iget-object v3, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_1
    //         iget-object v2, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         const/4 v3, 0x0
    //         invoke-static {p3, v2, v3}, Landroid/support/v4/app/FragmentTransitionCompat21;->excludeTarget(Ljava/lang/Object;Landroid/view/View;Z)V
    //         iget-object v2, p1, Landroid/support/v4/app/BackStackRecord$TransitionState;->hiddenFragmentViews:Ljava/util/ArrayList;
    //         iget-object v3, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         .end local v0    # "fragment":Landroid/support/v4/app/Fragment;
    //         .end local v1    # "i":I
    //         :cond_2
    //         return-void
    */

    private fun excludeHiddenFragmentsAfterEnter(sceneRoot: android.view.View, state: android.support.v4.app.BackStackRecord.TransitionState, containerId: Int, transition: Object) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V */ }
    /*
    //         .locals 7
    //         invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v6
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$3;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move v4, p3
    //         move-object v5, p4
    //         invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/BackStackRecord$3;-><init>(Landroid/support/v4/app/BackStackRecord;Landroid/view/View;Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V
    //         invoke-virtual {v6, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         return-void
    */

    private fun mapEnteringSharedElements(state: android.support.v4.app.BackStackRecord.TransitionState, inFragment: android.support.v4.app.Fragment, isBack: Boolean): android.support.v4.util.ArrayMap { return TODO("body: (Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/util/ArrayMap;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/support/v4/util/ArrayMap;
    //         invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V
    //         .local v0, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "root":Landroid/view/View;
    //         if-eqz v1, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         if-eqz v2, :cond_0
    //         invoke-static {v0, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->findNamedViews(Ljava/util/Map;Landroid/view/View;)V
    //         if-eqz p3, :cond_1
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         iget-object v3, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-static {v2, v3, v0}, Landroid/support/v4/app/BackStackRecord;->remapNames(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;)Landroid/support/v4/util/ArrayMap;
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v2}, Landroid/support/v4/util/ArrayMap;->retainAll(Ljava/util/Collection;)Z
    //         goto :goto_0
    */

    private fun mapSharedElementsIn(state: android.support.v4.app.BackStackRecord.TransitionState, isBack: Boolean, inFragment: android.support.v4.app.Fragment): android.support.v4.util.ArrayMap { return TODO("body: (Landroid/support/v4/app/BackStackRecord$TransitionState;ZLandroid/support/v4/app/Fragment;)Landroid/support/v4/util/ArrayMap;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         invoke-direct {p0, p1, p3, p2}, Landroid/support/v4/app/BackStackRecord;->mapEnteringSharedElements(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/util/ArrayMap;
    //         move-result-object v0
    //         .local v0, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         if-eqz p2, :cond_1
    //         iget-object v1, p3, Landroid/support/v4/app/Fragment;->mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p3, Landroid/support/v4/app/Fragment;->mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
    //         :cond_0
    //         invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/BackStackRecord;->setBackNameOverrides(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, p3, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         if-eqz v1, :cond_2
    //         iget-object v1, p3, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
    //         :cond_2
    //         invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/BackStackRecord;->setNameOverrides(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
    //         goto :goto_0
    */

    private fun prepareSharedElementTransition(state: android.support.v4.app.BackStackRecord.TransitionState, sceneRoot: android.view.View, sharedElementTransition: Object, inFragment: android.support.v4.app.Fragment, outFragment: android.support.v4.app.Fragment, isBack: Boolean, p6: java.util.ArrayList) { /* TODO(body): (Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/view/View;Ljava/lang/Object;Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;ZLjava/util/ArrayList;)V */ }
    /*
    //         .locals 10
    //         .local p7, "sharedElementTargets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v9
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$2;
    //         move-object v1, p0
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object/from16 v4, p7
    //         move-object v5, p1
    //         move/from16 v6, p6
    //         move-object v7, p4
    //         move-object v8, p5
    //         invoke-direct/range {v0 .. v8}, Landroid/support/v4/app/BackStackRecord$2;-><init>(Landroid/support/v4/app/BackStackRecord;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Landroid/support/v4/app/BackStackRecord$TransitionState;ZLandroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;)V
    //         invoke-virtual {v9, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         return-void
    */

    private fun remapSharedElements(state: android.support.v4.app.BackStackRecord.TransitionState, outFragment: android.support.v4.app.Fragment, isBack: Boolean): android.support.v4.util.ArrayMap { return TODO("body: (Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/util/ArrayMap;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         new-instance v0, Landroid/support/v4/util/ArrayMap;
    //         invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V
    //         .local v0, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->findNamedViews(Ljava/util/Map;Landroid/view/View;)V
    //         if-eqz p3, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->retainAll(Ljava/util/Collection;)Z
    //         :cond_0
    //         :goto_0
    //         if-eqz p3, :cond_3
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
    //         :cond_1
    //         invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/BackStackRecord;->setBackNameOverrides(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
    //         :goto_1
    //         return-object v0
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-static {v1, v2, v0}, Landroid/support/v4/app/BackStackRecord;->remapNames(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;)Landroid/support/v4/util/ArrayMap;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         if-eqz v1, :cond_4
    //         iget-object v1, p2, Landroid/support/v4/app/Fragment;->mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
    //         :cond_4
    //         invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/BackStackRecord;->setNameOverrides(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
    //         goto :goto_1
    */

    private fun setBackNameOverrides(state: android.support.v4.app.BackStackRecord.TransitionState, isEnd: android.support.v4.util.ArrayMap, p2: Boolean) { /* TODO(body): (Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V */ }
    /*
    //         .locals 7
    //         .local p2, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         if-nez v6, :cond_1
    //         const/4 v0, 0x0
    //         .local v0, "count":I
    //         :goto_0
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_1
    //         if-ge v1, v0, :cond_3
    //         iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         .local v3, "source":Ljava/lang/String;
    //         iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "originalTarget":Ljava/lang/String;
    //         invoke-virtual {p2, v2}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v5
    //         check-cast v5, Landroid/view/View;
    //         .local v5, "view":Landroid/view/View;
    //         if-eqz v5, :cond_0
    //         invoke-static {v5}, Landroid/support/v4/app/FragmentTransitionCompat21;->getTransitionName(Landroid/view/View;)Ljava/lang/String;
    //         move-result-object v4
    //         .local v4, "target":Ljava/lang/String;
    //         if-eqz p3, :cond_2
    //         iget-object v6, p1, Landroid/support/v4/app/BackStackRecord$TransitionState;->nameOverrides:Landroid/support/v4/util/ArrayMap;
    //         invoke-static {v6, v3, v4}, Landroid/support/v4/app/BackStackRecord;->setNameOverride(Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V
    //         .end local v4    # "target":Ljava/lang/String;
    //         :cond_0
    //         :goto_2
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         .end local v0    # "count":I
    //         .end local v1    # "i":I
    //         .end local v2    # "originalTarget":Ljava/lang/String;
    //         .end local v3    # "source":Ljava/lang/String;
    //         .end local v5    # "view":Landroid/view/View;
    //         :cond_1
    //         iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         goto :goto_0
    //         .restart local v0    # "count":I
    //         .restart local v1    # "i":I
    //         .restart local v2    # "originalTarget":Ljava/lang/String;
    //         .restart local v3    # "source":Ljava/lang/String;
    //         .restart local v4    # "target":Ljava/lang/String;
    //         .restart local v5    # "view":Landroid/view/View;
    //         :cond_2
    //         iget-object v6, p1, Landroid/support/v4/app/BackStackRecord$TransitionState;->nameOverrides:Landroid/support/v4/util/ArrayMap;
    //         invoke-static {v6, v4, v3}, Landroid/support/v4/app/BackStackRecord;->setNameOverride(Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_2
    //         .end local v2    # "originalTarget":Ljava/lang/String;
    //         .end local v3    # "source":Ljava/lang/String;
    //         .end local v4    # "target":Ljava/lang/String;
    //         .end local v5    # "view":Landroid/view/View;
    //         :cond_3
    //         return-void
    */

    private fun setEpicenterIn(state: android.support.v4.util.ArrayMap, p1: android.support.v4.app.BackStackRecord.TransitionState) { /* TODO(body): (Landroid/support/v4/util/ArrayMap;Landroid/support/v4/app/BackStackRecord$TransitionState;)V */ }
    /*
    //         .locals 3
    //         .local p1, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p1}, Landroid/support/v4/util/ArrayMap;->isEmpty()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "epicenter":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p2, Landroid/support/v4/app/BackStackRecord$TransitionState;->enteringEpicenterView:Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;
    //         iput-object v0, v1, Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;->epicenter:Landroid/view/View;
    //         .end local v0    # "epicenter":Landroid/view/View;
    //         :cond_0
    //         return-void
    */

    private fun setLastIn(fragment: android.util.SparseArray, p1: android.support.v4.app.Fragment) { /* TODO(body): (Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V */ }
    /*
    //         .locals 1
    //         .local p1, "fragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         if-eqz p2, :cond_0
    //         iget v0, p2, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         .local v0, "containerId":I
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1, v0, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    //         .end local v0    # "containerId":I
    //         :cond_0
    //         return-void
    */

    private fun setNameOverrides(state: android.support.v4.app.BackStackRecord.TransitionState, isEnd: android.support.v4.util.ArrayMap, p2: Boolean) { /* TODO(body): (Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V */ }
    /*
    //         .locals 5
    //         .local p2, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         invoke-virtual {p2}, Landroid/support/v4/util/ArrayMap;->size()I
    //         move-result v0
    //         .local v0, "count":I
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v0, :cond_1
    //         invoke-virtual {p2, v1}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "source":Ljava/lang/String;
    //         invoke-virtual {p2, v1}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;
    //         move-result-object v4
    //         check-cast v4, Landroid/view/View;
    //         invoke-static {v4}, Landroid/support/v4/app/FragmentTransitionCompat21;->getTransitionName(Landroid/view/View;)Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "target":Ljava/lang/String;
    //         if-eqz p3, :cond_0
    //         iget-object v4, p1, Landroid/support/v4/app/BackStackRecord$TransitionState;->nameOverrides:Landroid/support/v4/util/ArrayMap;
    //         invoke-static {v4, v2, v3}, Landroid/support/v4/app/BackStackRecord;->setNameOverride(Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         iget-object v4, p1, Landroid/support/v4/app/BackStackRecord$TransitionState;->nameOverrides:Landroid/support/v4/util/ArrayMap;
    //         invoke-static {v4, v3, v2}, Landroid/support/v4/app/BackStackRecord;->setNameOverride(Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         .end local v2    # "source":Ljava/lang/String;
    //         .end local v3    # "target":Ljava/lang/String;
    //         :cond_1
    //         return-void
    */

    public fun add(containerViewId: Int, fragment: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction { return TODO("body: (ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         invoke-direct {p0, p1, p2, v0, v1}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun add(containerViewId: Int, fragment: android.support.v4.app.Fragment, tag: String): android.support.v4.app.FragmentTransaction { return TODO("body: (ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun add(fragment: android.support.v4.app.Fragment, tag: String): android.support.v4.app.FragmentTransaction { return TODO("body: (Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v0, p1, p2, v1}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
    //         return-object p0
    */

    fun addOp(op: android.support.v4.app.BackStackRecord.Op) { /* TODO(body): (Landroid/support/v4/app/BackStackRecord$Op;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         if-nez v0, :cond_0
    //         iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
    //         iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         :goto_0
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
    //         iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
    //         iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
    //         iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
    //         iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
    //         iput-object v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->prev:Landroid/support/v4/app/BackStackRecord$Op;
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
    //         iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
    //         iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
    //         goto :goto_0
    */

    public fun addSharedElement(sharedElement: android.view.View, name: String): android.support.v4.app.FragmentTransaction { return TODO("body: (Landroid/view/View;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 3
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x15
    //         if-lt v1, v2, :cond_2
    //         invoke-static {p1}, Landroid/support/v4/app/FragmentTransitionCompat21;->getTransitionName(Landroid/view/View;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "transitionName":Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         const-string v2, "Unique transitionNames are required for all sharedElements"
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         if-nez v1, :cond_1
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         .end local v0    # "transitionName":Ljava/lang/String;
    //         :cond_2
    //         return-object p0
    */

    public fun addToBackStack(name: String): android.support.v4.app.FragmentTransaction { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "This FragmentTransaction is not allowed to be added to the back stack."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
    //         return-object p0
    */

    public fun attach(fragment: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction { return TODO("body: (Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
    //         invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
    //         .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         const/4 v1, 0x7
    //         iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    //         return-object p0
    */

    fun bumpBackStackNesting(amt: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 6
    //         iget-boolean v3, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         if-nez v3, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v3, :cond_2
    //         const-string v3, "FragmentManager"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Bump nesting in "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " by "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         .local v1, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         :goto_0
    //         if-eqz v1, :cond_0
    //         iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         if-eqz v3, :cond_3
    //         iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         iget v4, v3, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         add-int/2addr v4, p1
    //         iput v4, v3, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v3, :cond_3
    //         const-string v3, "FragmentManager"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Bump nesting of "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         iget-object v5, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " to "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         iget-object v5, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         iget v5, v5, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_3
    //         iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         if-eqz v3, :cond_5
    //         iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         add-int/lit8 v0, v3, -0x1
    //         .local v0, "i":I
    //         :goto_1
    //         if-ltz v0, :cond_5
    //         iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/app/Fragment;
    //         .local v2, "r":Landroid/support/v4/app/Fragment;
    //         iget v3, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         add-int/2addr v3, p1
    //         iput v3, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v3, :cond_4
    //         const-string v3, "FragmentManager"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Bump nesting of "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, " to "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         iget v5, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_4
    //         add-int/lit8 v0, v0, -0x1
    //         goto :goto_1
    //         .end local v0    # "i":I
    //         .end local v2    # "r":Landroid/support/v4/app/Fragment;
    //         :cond_5
    //         iget-object v1, v1, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
    //         goto/16 :goto_0
    */

    public fun calculateBackFragments(p0: android.util.SparseArray, p1: android.util.SparseArray) { /* TODO(body): (Landroid/util/SparseArray;Landroid/util/SparseArray;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/util/SparseArray",
    //                 "<",
    //                 "Landroid/support/v4/app/Fragment;",
    //                 ">;",
    //                 "Landroid/util/SparseArray",
    //                 "<",
    //                 "Landroid/support/v4/app/Fragment;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         .local p2, "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mContainer:Landroid/support/v4/app/FragmentContainer;
    //         invoke-interface {v2}, Landroid/support/v4/app/FragmentContainer;->hasView()Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         .local v1, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         :goto_0
    //         if-eqz v1, :cond_0
    //         iget v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         packed-switch v2, :pswitch_data_0
    //         :goto_1
    //         iget-object v1, v1, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
    //         goto :goto_0
    //         :pswitch_0
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {p1, v2}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_1
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         if-eqz v2, :cond_2
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         add-int/lit8 v0, v2, -0x1
    //         .local v0, "i":I
    //         :goto_2
    //         if-ltz v0, :cond_2
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/app/Fragment;
    //         invoke-direct {p0, p2, v2}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         add-int/lit8 v0, v0, -0x1
    //         goto :goto_2
    //         .end local v0    # "i":I
    //         :cond_2
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {p1, v2}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_2
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-direct {p0, p2, v2}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_3
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-direct {p0, p2, v2}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_4
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {p1, v2}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_5
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-direct {p0, p2, v2}, Landroid/support/v4/app/BackStackRecord;->setLastIn(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         :pswitch_6
    //         iget-object v2, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {p1, v2}, Landroid/support/v4/app/BackStackRecord;->setFirstOut(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //         .end packed-switch
    */

    public fun commit(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->commitInternal(Z)I
    //         move-result v0
    //         return v0
    */

    public fun commitAllowingStateLoss(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->commitInternal(Z)I
    //         move-result v0
    //         return v0
    */

    fun commitInternal(allowStateLoss: Boolean): Int { return TODO("body: (Z)I") }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         iget-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z
    //         if-eqz v2, :cond_0
    //         new-instance v2, Ljava/lang/IllegalStateException;
    //         const-string v3, "commit already called"
    //         invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_0
    //         sget-boolean v2, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v2, :cond_1
    //         const-string v2, "FragmentManager"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Commit: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Landroid/support/v4/util/LogWriter;
    //         const-string v2, "FragmentManager"
    //         invoke-direct {v0, v2}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V
    //         .local v0, "logw":Landroid/support/v4/util/LogWriter;
    //         new-instance v1, Ljava/io/PrintWriter;
    //         invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    //         .local v1, "pw":Ljava/io/PrintWriter;
    //         const-string v2, "  "
    //         invoke-virtual {p0, v2, v5, v1, v5}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         .end local v0    # "logw":Landroid/support/v4/util/LogWriter;
    //         .end local v1    # "pw":Ljava/io/PrintWriter;
    //         :cond_1
    //         const/4 v2, 0x1
    //         iput-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z
    //         iget-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v2, p0}, Landroid/support/v4/app/FragmentManagerImpl;->allocBackStackIndex(Landroid/support/v4/app/BackStackRecord;)I
    //         move-result v2
    //         iput v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         :goto_0
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v2, p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->enqueueAction(Ljava/lang/Runnable;Z)V
    //         iget v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         return v2
    //         :cond_2
    //         const/4 v2, -0x1
    //         iput v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         goto :goto_0
    */

    public fun detach(fragment: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction { return TODO("body: (Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
    //         invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
    //         .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         const/4 v1, 0x6
    //         iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    //         return-object p0
    */

    public fun disallowAddToBackStack(): android.support.v4.app.FragmentTransaction { return TODO("body: ()Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "This transaction is already being added to the back stack"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z
    //         return-object p0
    */

    public fun dump(prefix: String, fd: java.io.FileDescriptor, writer: java.io.PrintWriter, args: Array<String>) { /* TODO(body): (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1, p3, v0}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    //         return-void
    */

    public fun dump(prefix: String, writer: java.io.PrintWriter, full: Boolean) { /* TODO(body): (Ljava/lang/String;Ljava/io/PrintWriter;Z)V */ }
    /*
    //         .locals 7
    //         if-eqz p3, :cond_8
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "mName="
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " mIndex="
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(I)V
    //         const-string v5, " mCommitted="
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v5, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Z)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
    //         if-eqz v5, :cond_0
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "mTransition=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " mTransitionStyle=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         :cond_0
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
    //         if-nez v5, :cond_1
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
    //         if-eqz v5, :cond_2
    //         :cond_1
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "mEnterAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " mExitAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         :cond_2
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
    //         if-nez v5, :cond_3
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
    //         if-eqz v5, :cond_4
    //         :cond_3
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "mPopEnterAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " mPopExitAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         :cond_4
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         if-nez v5, :cond_5
    //         iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         if-eqz v5, :cond_6
    //         :cond_5
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "mBreadCrumbTitleRes=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " mBreadCrumbTitleText="
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_6
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         if-nez v5, :cond_7
    //         iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         if-eqz v5, :cond_8
    //         :cond_7
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "mBreadCrumbShortTitleRes=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " mBreadCrumbShortTitleText="
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         :cond_8
    //         iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         if-eqz v5, :cond_10
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "Operations:"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v6, "    "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         .local v2, "innerPrefix":Ljava/lang/String;
    //         iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         .local v4, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         const/4 v3, 0x0
    //         .local v3, "num":I
    //         :goto_0
    //         if-eqz v4, :cond_10
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         packed-switch v5, :pswitch_data_0
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "cmd="
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "cmdStr":Ljava/lang/String;
    //         :goto_1
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "  Op #"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(I)V
    //         const-string v5, ": "
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " "
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         if-eqz p3, :cond_c
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
    //         if-nez v5, :cond_9
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
    //         if-eqz v5, :cond_a
    //         :cond_9
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "enterAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " exitAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         :cond_a
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
    //         if-nez v5, :cond_b
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
    //         if-eqz v5, :cond_c
    //         :cond_b
    //         invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "popEnterAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, " popExitAnim=#"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         :cond_c
    //         iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         if-eqz v5, :cond_f
    //         iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         if-lez v5, :cond_f
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_2
    //         iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         if-ge v1, v5, :cond_f
    //         invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         const/4 v6, 0x1
    //         if-ne v5, v6, :cond_d
    //         const-string v5, "Removed: "
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         :goto_3
    //         iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_2
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         .end local v1    # "i":I
    //         :pswitch_0
    //         const-string v0, "NULL"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         :pswitch_1
    //         const-string v0, "ADD"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         :pswitch_2
    //         const-string v0, "REPLACE"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         :pswitch_3
    //         const-string v0, "REMOVE"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         :pswitch_4
    //         const-string v0, "HIDE"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         :pswitch_5
    //         const-string v0, "SHOW"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         :pswitch_6
    //         const-string v0, "DETACH"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         :pswitch_7
    //         const-string v0, "ATTACH"
    //         .restart local v0    # "cmdStr":Ljava/lang/String;
    //         goto/16 :goto_1
    //         .restart local v1    # "i":I
    //         :cond_d
    //         if-nez v1, :cond_e
    //         const-string v5, "Removed:"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         :cond_e
    //         invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v5, "  #"
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V
    //         const-string v5, ": "
    //         invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         goto :goto_3
    //         .end local v1    # "i":I
    //         :cond_f
    //         iget-object v4, v4, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
    //         add-int/lit8 v3, v3, 0x1
    //         goto/16 :goto_0
    //         .end local v0    # "cmdStr":Ljava/lang/String;
    //         .end local v2    # "innerPrefix":Ljava/lang/String;
    //         .end local v3    # "num":I
    //         .end local v4    # "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         :cond_10
    //         return-void
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //         .end packed-switch
    */

    public fun getBreadCrumbShortTitle(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v0, v0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getText(I)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         goto :goto_0
    */

    public fun getBreadCrumbShortTitleRes(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         return v0
    */

    public fun getBreadCrumbTitle(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v0, v0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
    //         iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getText(I)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         goto :goto_0
    */

    public fun getBreadCrumbTitleRes(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         return v0
    */

    public fun getId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         return v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTransition(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
    //         return v0
    */

    public fun getTransitionStyle(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
    //         return v0
    */

    public fun hide(fragment: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction { return TODO("body: (Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
    //         invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
    //         .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         const/4 v1, 0x4
    //         iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    //         return-object p0
    */

    public fun isAddToBackStackAllowed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z
    //         return v0
    */

    public fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun popFromBackStack(doStateMove: Boolean, state: android.support.v4.app.BackStackRecord.TransitionState, p2: android.util.SparseArray, p3: android.util.SparseArray): android.support.v4.app.BackStackRecord.TransitionState { return TODO("body: (ZLandroid/support/v4/app/BackStackRecord$TransitionState;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/app/BackStackRecord$TransitionState;") }
    /*
    //         .locals 17
    //         .local p3, "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         .local p4, "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         sget-boolean v13, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v13, :cond_0
    //         const-string v13, "FragmentManager"
    //         new-instance v14, Ljava/lang/StringBuilder;
    //         invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v15, "popFromBackStack: "
    //         invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v14
    //         move-object/from16 v0, p0
    //         invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v14
    //         invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v14
    //         invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v5, Landroid/support/v4/util/LogWriter;
    //         const-string v13, "FragmentManager"
    //         invoke-direct {v5, v13}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V
    //         .local v5, "logw":Landroid/support/v4/util/LogWriter;
    //         new-instance v10, Ljava/io/PrintWriter;
    //         invoke-direct {v10, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    //         .local v10, "pw":Ljava/io/PrintWriter;
    //         const-string v13, "  "
    //         const/4 v14, 0x0
    //         const/4 v15, 0x0
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v13, v14, v10, v15}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         .end local v5    # "logw":Landroid/support/v4/util/LogWriter;
    //         .end local v10    # "pw":Ljava/io/PrintWriter;
    //         :cond_0
    //         if-nez p2, :cond_3
    //         invoke-virtual/range {p3 .. p3}, Landroid/util/SparseArray;->size()I
    //         move-result v13
    //         if-nez v13, :cond_1
    //         invoke-virtual/range {p4 .. p4}, Landroid/util/SparseArray;->size()I
    //         move-result v13
    //         if-eqz v13, :cond_2
    //         :cond_1
    //         const/4 v13, 0x1
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p3
    //         move-object/from16 v2, p4
    //         invoke-direct {v0, v1, v2, v13}, Landroid/support/v4/app/BackStackRecord;->beginTransition(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         move-result-object p2
    //         :cond_2
    //         :goto_0
    //         const/4 v13, -0x1
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v13}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V
    //         if-eqz p2, :cond_4
    //         const/4 v12, 0x0
    //         .local v12, "transitionStyle":I
    //         :goto_1
    //         if-eqz p2, :cond_5
    //         const/4 v11, 0x0
    //         .local v11, "transition":I
    //         :goto_2
    //         move-object/from16 v0, p0
    //         iget-object v7, v0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
    //         .local v7, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         :goto_3
    //         if-eqz v7, :cond_a
    //         if-eqz p2, :cond_6
    //         const/4 v8, 0x0
    //         .local v8, "popEnterAnim":I
    //         :goto_4
    //         if-eqz p2, :cond_7
    //         const/4 v9, 0x0
    //         .local v9, "popExitAnim":I
    //         :goto_5
    //         iget v13, v7, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         packed-switch v13, :pswitch_data_0
    //         new-instance v13, Ljava/lang/IllegalArgumentException;
    //         new-instance v14, Ljava/lang/StringBuilder;
    //         invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v15, "Unknown cmd: "
    //         invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v14
    //         iget v15, v7, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v14
    //         invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v14
    //         invoke-direct {v13, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v13
    //         .end local v7    # "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         .end local v8    # "popEnterAnim":I
    //         .end local v9    # "popExitAnim":I
    //         .end local v11    # "transition":I
    //         .end local v12    # "transitionStyle":I
    //         :cond_3
    //         if-nez p1, :cond_2
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mSharedElementTargetNames:Ljava/util/ArrayList;
    //         move-object/from16 v0, p0
    //         iget-object v14, v0, Landroid/support/v4/app/BackStackRecord;->mSharedElementSourceNames:Ljava/util/ArrayList;
    //         move-object/from16 v0, p2
    //         invoke-static {v0, v13, v14}, Landroid/support/v4/app/BackStackRecord;->setNameOverrides(Landroid/support/v4/app/BackStackRecord$TransitionState;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //         goto :goto_0
    //         :cond_4
    //         move-object/from16 v0, p0
    //         iget v12, v0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
    //         goto :goto_1
    //         .restart local v12    # "transitionStyle":I
    //         :cond_5
    //         move-object/from16 v0, p0
    //         iget v11, v0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
    //         goto :goto_2
    //         .restart local v7    # "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         .restart local v11    # "transition":I
    //         :cond_6
    //         iget v8, v7, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
    //         goto :goto_4
    //         .restart local v8    # "popEnterAnim":I
    //         :cond_7
    //         iget v9, v7, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
    //         goto :goto_5
    //         .restart local v9    # "popExitAnim":I
    //         :pswitch_0
    //         iget-object v3, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .local v3, "f":Landroid/support/v4/app/Fragment;
    //         iput v9, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-static {v11}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
    //         move-result v14
    //         invoke-virtual {v13, v3, v14, v12}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
    //         :cond_8
    //         :goto_6
    //         iget-object v7, v7, Landroid/support/v4/app/BackStackRecord$Op;->prev:Landroid/support/v4/app/BackStackRecord$Op;
    //         goto :goto_3
    //         .end local v3    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_1
    //         iget-object v3, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v3    # "f":Landroid/support/v4/app/Fragment;
    //         if-eqz v3, :cond_9
    //         iput v9, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-static {v11}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
    //         move-result v14
    //         invoke-virtual {v13, v3, v14, v12}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
    //         :cond_9
    //         iget-object v13, v7, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         if-eqz v13, :cond_8
    //         const/4 v4, 0x0
    //         .local v4, "i":I
    //         :goto_7
    //         iget-object v13, v7, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
    //         move-result v13
    //         if-ge v4, v13, :cond_8
    //         iget-object v13, v7, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, Landroid/support/v4/app/Fragment;
    //         .local v6, "old":Landroid/support/v4/app/Fragment;
    //         iput v8, v6, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         const/4 v14, 0x0
    //         invoke-virtual {v13, v6, v14}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_7
    //         .end local v3    # "f":Landroid/support/v4/app/Fragment;
    //         .end local v4    # "i":I
    //         .end local v6    # "old":Landroid/support/v4/app/Fragment;
    //         :pswitch_2
    //         iget-object v3, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v3    # "f":Landroid/support/v4/app/Fragment;
    //         iput v8, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         const/4 v14, 0x0
    //         invoke-virtual {v13, v3, v14}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
    //         goto :goto_6
    //         .end local v3    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_3
    //         iget-object v3, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v3    # "f":Landroid/support/v4/app/Fragment;
    //         iput v8, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-static {v11}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
    //         move-result v14
    //         invoke-virtual {v13, v3, v14, v12}, Landroid/support/v4/app/FragmentManagerImpl;->showFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto :goto_6
    //         .end local v3    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_4
    //         iget-object v3, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v3    # "f":Landroid/support/v4/app/Fragment;
    //         iput v9, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-static {v11}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
    //         move-result v14
    //         invoke-virtual {v13, v3, v14, v12}, Landroid/support/v4/app/FragmentManagerImpl;->hideFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto :goto_6
    //         .end local v3    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_5
    //         iget-object v3, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v3    # "f":Landroid/support/v4/app/Fragment;
    //         iput v8, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-static {v11}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
    //         move-result v14
    //         invoke-virtual {v13, v3, v14, v12}, Landroid/support/v4/app/FragmentManagerImpl;->attachFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto :goto_6
    //         .end local v3    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_6
    //         iget-object v3, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v3    # "f":Landroid/support/v4/app/Fragment;
    //         iput v8, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-static {v11}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
    //         move-result v14
    //         invoke-virtual {v13, v3, v14, v12}, Landroid/support/v4/app/FragmentManagerImpl;->detachFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto/16 :goto_6
    //         .end local v3    # "f":Landroid/support/v4/app/Fragment;
    //         .end local v8    # "popEnterAnim":I
    //         .end local v9    # "popExitAnim":I
    //         :cond_a
    //         if-eqz p1, :cond_b
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         move-object/from16 v0, p0
    //         iget-object v14, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget v14, v14, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
    //         invoke-static {v11}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
    //         move-result v15
    //         const/16 v16, 0x1
    //         move/from16 v0, v16
    //         invoke-virtual {v13, v14, v15, v12, v0}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IIIZ)V
    //         const/16 p2, 0x0
    //         :cond_b
    //         move-object/from16 v0, p0
    //         iget v13, v0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         if-ltz v13, :cond_c
    //         move-object/from16 v0, p0
    //         iget-object v13, v0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         move-object/from16 v0, p0
    //         iget v14, v0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         invoke-virtual {v13, v14}, Landroid/support/v4/app/FragmentManagerImpl;->freeBackStackIndex(I)V
    //         const/4 v13, -0x1
    //         move-object/from16 v0, p0
    //         iput v13, v0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         :cond_c
    //         return-object p2
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //         .end packed-switch
    */

    public fun remove(fragment: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction { return TODO("body: (Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
    //         invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
    //         .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         const/4 v1, 0x3
    //         iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    //         return-object p0
    */

    public fun replace(containerViewId: Int, fragment: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction { return TODO("body: (ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/BackStackRecord;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v0
    //         return-object v0
    */

    public fun replace(containerViewId: Int, fragment: android.support.v4.app.Fragment, tag: String): android.support.v4.app.FragmentTransaction { return TODO("body: (ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Must use non-zero containerViewId"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x2
    //         invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 14
    //         sget-boolean v11, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v11, :cond_0
    //         const-string v11, "FragmentManager"
    //         new-instance v12, Ljava/lang/StringBuilder;
    //         invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v13, "Run: "
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v12
    //         invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iget-boolean v11, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         if-eqz v11, :cond_1
    //         iget v11, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         if-gez v11, :cond_1
    //         new-instance v11, Ljava/lang/IllegalStateException;
    //         const-string v12, "addToBackStack() called after commit()"
    //         invoke-direct {v11, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v11
    //         :cond_1
    //         const/4 v11, 0x1
    //         invoke-virtual {p0, v11}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V
    //         const/4 v8, 0x0
    //         .local v8, "state":Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         const/4 v3, 0x0
    //         .local v3, "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         const/4 v5, 0x0
    //         .local v5, "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         sget v11, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v12, 0x15
    //         if-lt v11, v12, :cond_2
    //         new-instance v3, Landroid/util/SparseArray;
    //         .end local v3    # "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V
    //         .restart local v3    # "firstOutFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         new-instance v5, Landroid/util/SparseArray;
    //         .end local v5    # "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V
    //         .restart local v5    # "lastInFragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         invoke-direct {p0, v3, v5}, Landroid/support/v4/app/BackStackRecord;->calculateFragments(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    //         const/4 v11, 0x0
    //         invoke-direct {p0, v3, v5, v11}, Landroid/support/v4/app/BackStackRecord;->beginTransition(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         move-result-object v8
    //         :cond_2
    //         if-eqz v8, :cond_3
    //         const/4 v10, 0x0
    //         .local v10, "transitionStyle":I
    //         :goto_0
    //         if-eqz v8, :cond_4
    //         const/4 v9, 0x0
    //         .local v9, "transition":I
    //         :goto_1
    //         iget-object v7, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
    //         .local v7, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         :goto_2
    //         if-eqz v7, :cond_f
    //         if-eqz v8, :cond_5
    //         const/4 v0, 0x0
    //         .local v0, "enterAnim":I
    //         :goto_3
    //         if-eqz v8, :cond_6
    //         const/4 v1, 0x0
    //         .local v1, "exitAnim":I
    //         :goto_4
    //         iget v11, v7, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         packed-switch v11, :pswitch_data_0
    //         new-instance v11, Ljava/lang/IllegalArgumentException;
    //         new-instance v12, Ljava/lang/StringBuilder;
    //         invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v13, "Unknown cmd: "
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         iget v13, v7, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v12
    //         invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v11
    //         .end local v0    # "enterAnim":I
    //         .end local v1    # "exitAnim":I
    //         .end local v7    # "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         .end local v9    # "transition":I
    //         .end local v10    # "transitionStyle":I
    //         :cond_3
    //         iget v10, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
    //         goto :goto_0
    //         .restart local v10    # "transitionStyle":I
    //         :cond_4
    //         iget v9, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
    //         goto :goto_1
    //         .restart local v7    # "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         .restart local v9    # "transition":I
    //         :cond_5
    //         iget v0, v7, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
    //         goto :goto_3
    //         .restart local v0    # "enterAnim":I
    //         :cond_6
    //         iget v1, v7, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
    //         goto :goto_4
    //         .restart local v1    # "exitAnim":I
    //         :pswitch_0
    //         iget-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .local v2, "f":Landroid/support/v4/app/Fragment;
    //         iput v0, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         const/4 v12, 0x0
    //         invoke-virtual {v11, v2, v12}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
    //         :cond_7
    //         :goto_5
    //         iget-object v7, v7, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
    //         goto :goto_2
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_1
    //         iget-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v2    # "f":Landroid/support/v4/app/Fragment;
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v11, v11, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         if-eqz v11, :cond_e
    //         const/4 v4, 0x0
    //         .local v4, "i":I
    //         :goto_6
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v11, v11, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
    //         move-result v11
    //         if-ge v4, v11, :cond_e
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v11, v11, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
    //         invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, Landroid/support/v4/app/Fragment;
    //         .local v6, "old":Landroid/support/v4/app/Fragment;
    //         sget-boolean v11, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v11, :cond_8
    //         const-string v11, "FragmentManager"
    //         new-instance v12, Ljava/lang/StringBuilder;
    //         invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v13, "OP_REPLACE: adding="
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         const-string v13, " old="
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v12
    //         invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_8
    //         if-eqz v2, :cond_9
    //         iget v11, v6, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         iget v12, v2, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         if-ne v11, v12, :cond_a
    //         :cond_9
    //         if-ne v6, v2, :cond_b
    //         const/4 v2, 0x0
    //         iput-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         :cond_a
    //         :goto_7
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_6
    //         :cond_b
    //         iget-object v11, v7, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         if-nez v11, :cond_c
    //         new-instance v11, Ljava/util/ArrayList;
    //         invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v11, v7, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         :cond_c
    //         iget-object v11, v7, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
    //         invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         iput v1, v6, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-boolean v11, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         if-eqz v11, :cond_d
    //         iget v11, v6, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         add-int/lit8 v11, v11, 0x1
    //         iput v11, v6, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         sget-boolean v11, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         if-eqz v11, :cond_d
    //         const-string v11, "FragmentManager"
    //         new-instance v12, Ljava/lang/StringBuilder;
    //         invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v13, "Bump nesting of "
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         const-string v13, " to "
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         iget v13, v6, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
    //         invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v12
    //         invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v12
    //         invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_d
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v11, v6, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto :goto_7
    //         .end local v4    # "i":I
    //         .end local v6    # "old":Landroid/support/v4/app/Fragment;
    //         :cond_e
    //         if-eqz v2, :cond_7
    //         iput v0, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         const/4 v12, 0x0
    //         invoke-virtual {v11, v2, v12}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
    //         goto/16 :goto_5
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_2
    //         iget-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v2    # "f":Landroid/support/v4/app/Fragment;
    //         iput v1, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v11, v2, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto/16 :goto_5
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_3
    //         iget-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v2    # "f":Landroid/support/v4/app/Fragment;
    //         iput v1, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v11, v2, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->hideFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto/16 :goto_5
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_4
    //         iget-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v2    # "f":Landroid/support/v4/app/Fragment;
    //         iput v0, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v11, v2, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->showFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto/16 :goto_5
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_5
    //         iget-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v2    # "f":Landroid/support/v4/app/Fragment;
    //         iput v1, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v11, v2, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->detachFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto/16 :goto_5
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :pswitch_6
    //         iget-object v2, v7, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         .restart local v2    # "f":Landroid/support/v4/app/Fragment;
    //         iput v0, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v11, v2, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->attachFragment(Landroid/support/v4/app/Fragment;II)V
    //         goto/16 :goto_5
    //         .end local v0    # "enterAnim":I
    //         .end local v1    # "exitAnim":I
    //         .end local v2    # "f":Landroid/support/v4/app/Fragment;
    //         :cond_f
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v12, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget v12, v12, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
    //         const/4 v13, 0x1
    //         invoke-virtual {v11, v12, v9, v10, v13}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IIIZ)V
    //         iget-boolean v11, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
    //         if-eqz v11, :cond_10
    //         iget-object v11, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v11, p0}, Landroid/support/v4/app/FragmentManagerImpl;->addBackStackState(Landroid/support/v4/app/BackStackRecord;)V
    //         :cond_10
    //         return-void
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //         .end packed-switch
    */

    public fun setBreadCrumbShortTitle(res: Int): android.support.v4.app.FragmentTransaction { return TODO("body: (I)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setBreadCrumbShortTitle(text: CharSequence): android.support.v4.app.FragmentTransaction { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
    //         iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setBreadCrumbTitle(res: Int): android.support.v4.app.FragmentTransaction { return TODO("body: (I)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setBreadCrumbTitle(text: CharSequence): android.support.v4.app.FragmentTransaction { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
    //         iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setCustomAnimations(enter: Int, exit: Int): android.support.v4.app.FragmentTransaction { return TODO("body: (II)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0, v0}, Landroid/support/v4/app/BackStackRecord;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setCustomAnimations(enter: Int, exit: Int, popEnter: Int, popExit: Int): android.support.v4.app.FragmentTransaction { return TODO("body: (IIII)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
    //         iput p2, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
    //         iput p3, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
    //         iput p4, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
    //         return-object p0
    */

    public fun setTransition(transition: Int): android.support.v4.app.FragmentTransaction { return TODO("body: (I)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
    //         return-object p0
    */

    public fun setTransitionStyle(styleRes: Int): android.support.v4.app.FragmentTransaction { return TODO("body: (I)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
    //         return-object p0
    */

    public fun show(fragment: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction { return TODO("body: (Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
    //         invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
    //         .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
    //         const/4 v1, 0x5
    //         iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
    //         iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    //         return-object p0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const/16 v1, 0x80
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v0, "sb":Ljava/lang/StringBuilder;
    //         const-string v1, "BackStackEntry{"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         if-ltz v1, :cond_0
    //         const-string v1, " #"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
    //         if-eqz v1, :cond_1
    //         const-string v1, " "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

    companion object {
    val OP_ADD: Int = 0x1
    val OP_ATTACH: Int = 0x7
    val OP_DETACH: Int = 0x6
    val OP_HIDE: Int = 0x4
    val OP_NULL: Int = 0x0
    val OP_REMOVE: Int = 0x3
    val OP_REPLACE: Int = 0x2
    val OP_SHOW: Int = 0x5
    val TAG: String = "FragmentManager"

    private @JvmStatic fun captureExitingViews(exitTransition: Object, outFragment: android.support.v4.app.Fragment, p2: java.util.ArrayList, p3: android.support.v4.util.ArrayMap): Object { return TODO("body: (Ljava/lang/Object;Landroid/support/v4/app/Fragment;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p2, "exitingViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .local p3, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         if-eqz p0, :cond_0
    //         invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;
    //         move-result-object v0
    //         invoke-static {p0, v0, p2, p3}, Landroid/support/v4/app/FragmentTransitionCompat21;->captureExitingViews(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/Map;)Ljava/lang/Object;
    //         move-result-object p0
    //         :cond_0
    //         return-object p0
    */

    private @JvmStatic fun getEnterTransition(inFragment: android.support.v4.app.Fragment, isBack: Boolean): Object { return TODO("body: (Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getReenterTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_1
    //         invoke-static {v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->cloneTransition(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getEnterTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_1
    */

    private @JvmStatic fun getExitTransition(outFragment: android.support.v4.app.Fragment, isBack: Boolean): Object { return TODO("body: (Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getReturnTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_1
    //         invoke-static {v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->cloneTransition(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getExitTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_1
    */

    private @JvmStatic fun getSharedElementTransition(inFragment: android.support.v4.app.Fragment, outFragment: android.support.v4.app.Fragment, isBack: Boolean): Object { return TODO("body: (Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         if-eqz p2, :cond_2
    //         invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getSharedElementReturnTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_1
    //         invoke-static {v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->cloneTransition(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getSharedElementEnterTransition()Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_1
    */

    private @JvmStatic fun remapNames(p0: java.util.ArrayList, p1: java.util.ArrayList, p2: android.support.v4.util.ArrayMap): android.support.v4.util.ArrayMap { return TODO("body: (Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;)Landroid/support/v4/util/ArrayMap;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Landroid/support/v4/util/ArrayMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Landroid/view/View;",
    //                 ">;)",
    //                 "Landroid/support/v4/util/ArrayMap",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Landroid/view/View;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .local p0, "inMap":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         .local p1, "toGoInMap":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         .local p2, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         invoke-virtual {p2}, Landroid/support/v4/util/ArrayMap;->isEmpty()Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         .end local p2    # "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         :goto_0
    //         return-object p2
    //         .restart local p2    # "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         :cond_0
    //         new-instance v2, Landroid/support/v4/util/ArrayMap;
    //         invoke-direct {v2}, Landroid/support/v4/util/ArrayMap;-><init>()V
    //         .local v2, "remappedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         .local v1, "numKeys":I
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_1
    //         if-ge v0, v1, :cond_2
    //         invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-virtual {p2, v4}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Landroid/view/View;
    //         .local v3, "view":Landroid/view/View;
    //         if-eqz v3, :cond_1
    //         invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-virtual {v2, v4, v3}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         .end local v3    # "view":Landroid/view/View;
    //         :cond_2
    //         move-object p2, v2
    //         goto :goto_0
    */

    private @JvmStatic fun setFirstOut(fragment: android.util.SparseArray, p1: android.support.v4.app.Fragment) { /* TODO(body): (Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V */ }
    /*
    //         .locals 2
    //         .local p0, "fragments":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/support/v4/app/Fragment;>;"
    //         if-eqz p1, :cond_0
    //         iget v0, p1, Landroid/support/v4/app/Fragment;->mContainerId:I
    //         .local v0, "containerId":I
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->isHidden()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->isAdded()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    //         .end local v0    # "containerId":I
    //         :cond_0
    //         return-void
    */

    private @JvmStatic fun setNameOverride(source: android.support.v4.util.ArrayMap, target: String, p2: String) { /* TODO(body): (Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         .local p0, "overrides":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Ljava/lang/String;>;"
    //         if-eqz p1, :cond_0
    //         if-eqz p2, :cond_0
    //         invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         .local v0, "index":I
    //         :goto_0
    //         invoke-virtual {p0}, Landroid/support/v4/util/ArrayMap;->size()I
    //         move-result v1
    //         if-ge v0, v1, :cond_2
    //         invoke-virtual {p0, v0}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-virtual {p0, v0, p2}, Landroid/support/v4/util/ArrayMap;->setValueAt(ILjava/lang/Object;)Ljava/lang/Object;
    //         .end local v0    # "index":I
    //         :cond_0
    //         :goto_1
    //         return-void
    //         .restart local v0    # "index":I
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_1
    */

    private @JvmStatic fun setNameOverrides(state: android.support.v4.app.BackStackRecord.TransitionState, p1: java.util.ArrayList, p2: java.util.ArrayList) { /* TODO(body): (Landroid/support/v4/app/BackStackRecord$TransitionState;Ljava/util/ArrayList;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 4
    //         .local p1, "sourceNames":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         .local p2, "targetNames":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         if-ge v0, v3, :cond_0
    //         invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         .local v1, "source":Ljava/lang/String;
    //         invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "target":Ljava/lang/String;
    //         iget-object v3, p0, Landroid/support/v4/app/BackStackRecord$TransitionState;->nameOverrides:Landroid/support/v4/util/ArrayMap;
    //         invoke-static {v3, v1, v2}, Landroid/support/v4/app/BackStackRecord;->setNameOverride(Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         .end local v0    # "i":I
    //         .end local v1    # "source":Ljava/lang/String;
    //         .end local v2    # "target":Ljava/lang/String;
    //         :cond_0
    //         return-void
    */

    }
}
