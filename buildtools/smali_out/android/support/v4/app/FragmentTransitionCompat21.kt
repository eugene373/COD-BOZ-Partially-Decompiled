package android.support.v4.app

// Auto-emitted from smali source: FragmentTransitionCompat21.java.
// 0 fields, 18 methods.

open class FragmentTransitionCompat21 {
    constructor()

    companion object {
    public @JvmStatic fun addTargets(transitionObject: Object, p1: java.util.ArrayList) { /* TODO(body): (Ljava/lang/Object;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 4
    //         .local p1, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         move-object v2, p0
    //         check-cast v2, Landroid/transition/Transition;
    //         .local v2, "transition":Landroid/transition/Transition;
    //         invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         .local v1, "numViews":I
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         if-ge v0, v1, :cond_0
    //         invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Landroid/view/View;
    //         invoke-virtual {v2, v3}, Landroid/transition/Transition;->addTarget(Landroid/view/View;)Landroid/transition/Transition;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun addTransitionTargets(enterTransitionObject: Object, sharedElementTransitionObject: Object, container: android.view.View, inFragment: android.support.v4.app.FragmentTransitionCompat21.ViewRetriever, nonExistentView: android.view.View, epicenterView: android.support.v4.app.FragmentTransitionCompat21.EpicenterView, p6: java.util.Map, p7: java.util.ArrayList, p8: java.util.Map, p9: java.util.ArrayList) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;Landroid/view/View;Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 10
    //         .local p6, "nameOverrides":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    //         .local p7, "enteringViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .local p8, "renamedViews":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Landroid/view/View;>;"
    //         .local p9, "sharedElementTargets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         if-nez p0, :cond_0
    //         if-eqz p1, :cond_4
    //         :cond_0
    //         move-object v6, p0
    //         check-cast v6, Landroid/transition/Transition;
    //         .local v6, "enterTransition":Landroid/transition/Transition;
    //         if-eqz v6, :cond_1
    //         invoke-virtual {v6, p4}, Landroid/transition/Transition;->addTarget(Landroid/view/View;)Landroid/transition/Transition;
    //         :cond_1
    //         if-eqz p1, :cond_2
    //         move-object v8, p1
    //         check-cast v8, Landroid/transition/Transition;
    //         .local v8, "sharedElementTransition":Landroid/transition/Transition;
    //         move-object/from16 v0, p9
    //         invoke-static {v8, v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->addTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         .end local v8    # "sharedElementTransition":Landroid/transition/Transition;
    //         :cond_2
    //         if-eqz p3, :cond_3
    //         invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v9
    //         new-instance v1, Landroid/support/v4/app/FragmentTransitionCompat21$2;
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object/from16 v4, p6
    //         move-object/from16 v5, p8
    //         move-object/from16 v7, p7
    //         invoke-direct/range {v1 .. v7}, Landroid/support/v4/app/FragmentTransitionCompat21$2;-><init>(Landroid/view/View;Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;Ljava/util/Map;Ljava/util/Map;Landroid/transition/Transition;Ljava/util/ArrayList;)V
    //         invoke-virtual {v9, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         :cond_3
    //         invoke-static {v6, p5}, Landroid/support/v4/app/FragmentTransitionCompat21;->setSharedElementEpicenter(Landroid/transition/Transition;Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;)V
    //         .end local v6    # "enterTransition":Landroid/transition/Transition;
    //         :cond_4
    //         return-void
    */

    public @JvmStatic fun beginDelayedTransition(sceneRoot: android.view.ViewGroup, transitionObject: Object) { /* TODO(body): (Landroid/view/ViewGroup;Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         move-object v0, p1
    //         check-cast v0, Landroid/transition/Transition;
    //         .local v0, "transition":Landroid/transition/Transition;
    //         invoke-static {p0, v0}, Landroid/transition/TransitionManager;->beginDelayedTransition(Landroid/view/ViewGroup;Landroid/transition/Transition;)V
    //         return-void
    */

    public @JvmStatic fun captureExitingViews(exitTransition: Object, root: android.view.View, p2: java.util.ArrayList, p3: java.util.Map): Object { return TODO("body: (Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/Map;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p2, "viewList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .local p3, "namedViews":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Landroid/view/View;>;"
    //         if-eqz p0, :cond_1
    //         invoke-static {p2, p1}, Landroid/support/v4/app/FragmentTransitionCompat21;->captureTransitioningViews(Ljava/util/ArrayList;Landroid/view/View;)V
    //         if-eqz p3, :cond_0
    //         invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-virtual {p2, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
    //         :cond_0
    //         invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const/4 p0, 0x0
    //         .end local p0    # "exitTransition":Ljava/lang/Object;
    //         :cond_1
    //         :goto_0
    //         return-object p0
    //         .restart local p0    # "exitTransition":Ljava/lang/Object;
    //         :cond_2
    //         move-object v0, p0
    //         check-cast v0, Landroid/transition/Transition;
    //         invoke-static {v0, p2}, Landroid/support/v4/app/FragmentTransitionCompat21;->addTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         goto :goto_0
    */

    private @JvmStatic fun captureTransitioningViews(view: java.util.ArrayList, p1: android.view.View) { /* TODO(body): (Ljava/util/ArrayList;Landroid/view/View;)V */ }
    /*
    //         .locals 5
    //         .local p0, "transitioningViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
    //         move-result v4
    //         if-nez v4, :cond_0
    //         instance-of v4, p1, Landroid/view/ViewGroup;
    //         if-eqz v4, :cond_2
    //         move-object v3, p1
    //         check-cast v3, Landroid/view/ViewGroup;
    //         .local v3, "viewGroup":Landroid/view/ViewGroup;
    //         invoke-virtual {v3}, Landroid/view/ViewGroup;->isTransitionGroup()Z
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         .end local v3    # "viewGroup":Landroid/view/ViewGroup;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         .restart local v3    # "viewGroup":Landroid/view/ViewGroup;
    //         :cond_1
    //         invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I
    //         move-result v1
    //         .local v1, "count":I
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_1
    //         if-ge v2, v1, :cond_0
    //         invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         invoke-static {p0, v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->captureTransitioningViews(Ljava/util/ArrayList;Landroid/view/View;)V
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_1
    //         .end local v0    # "child":Landroid/view/View;
    //         .end local v1    # "count":I
    //         .end local v2    # "i":I
    //         .end local v3    # "viewGroup":Landroid/view/ViewGroup;
    //         :cond_2
    //         invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    */

    public @JvmStatic fun cleanupTransitions(sceneRoot: android.view.View, nonExistentView: android.view.View, enterTransitionObject: Object, exitTransitionObject: java.util.ArrayList, sharedElementTransitionObject: Object, overallTransitionObject: java.util.ArrayList, p6: Object, p7: java.util.ArrayList, p8: Object, p9: java.util.ArrayList, p10: java.util.Map) { /* TODO(body): (Landroid/view/View;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/Map;)V */ }
    /*
    //         .locals 13
    //         .local p3, "enteringViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .local p5, "exitingViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .local p7, "sharedElementTargets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .local p9, "hiddenViews":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         .local p10, "renamedViews":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Landroid/view/View;>;"
    //         move-object v2, p2
    //         check-cast v2, Landroid/transition/Transition;
    //         .local v2, "enterTransition":Landroid/transition/Transition;
    //         move-object/from16 v5, p4
    //         check-cast v5, Landroid/transition/Transition;
    //         .local v5, "exitTransition":Landroid/transition/Transition;
    //         move-object/from16 v7, p6
    //         check-cast v7, Landroid/transition/Transition;
    //         .local v7, "sharedElementTransition":Landroid/transition/Transition;
    //         move-object/from16 v11, p8
    //         check-cast v11, Landroid/transition/Transition;
    //         .local v11, "overallTransition":Landroid/transition/Transition;
    //         if-eqz v11, :cond_0
    //         invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v12
    //         new-instance v0, Landroid/support/v4/app/FragmentTransitionCompat21$4;
    //         move-object v1, p0
    //         move-object v3, p1
    //         move-object/from16 v4, p3
    //         move-object/from16 v6, p5
    //         move-object/from16 v8, p7
    //         move-object/from16 v9, p10
    //         move-object/from16 v10, p9
    //         invoke-direct/range {v0 .. v11}, Landroid/support/v4/app/FragmentTransitionCompat21$4;-><init>(Landroid/view/View;Landroid/transition/Transition;Landroid/view/View;Ljava/util/ArrayList;Landroid/transition/Transition;Ljava/util/ArrayList;Landroid/transition/Transition;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;Landroid/transition/Transition;)V
    //         invoke-virtual {v12, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun cloneTransition(transition: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 0
    //         if-eqz p0, :cond_0
    //         check-cast p0, Landroid/transition/Transition;
    //         .end local p0    # "transition":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/transition/Transition;->clone()Landroid/transition/Transition;
    //         move-result-object p0
    //         :cond_0
    //         return-object p0
    */

    public @JvmStatic fun excludeTarget(transitionObject: Object, view: android.view.View, exclude: Boolean) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Z)V */ }
    /*
    //         .locals 1
    //         move-object v0, p0
    //         check-cast v0, Landroid/transition/Transition;
    //         .local v0, "transition":Landroid/transition/Transition;
    //         invoke-virtual {v0, p1, p2}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;
    //         return-void
    */

    public @JvmStatic fun findNamedViews(view: java.util.Map, p1: android.view.View) { /* TODO(body): (Ljava/util/Map;Landroid/view/View;)V */ }
    /*
    //         .locals 6
    //         .local p0, "namedViews":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Landroid/view/View;>;"
    //         invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
    //         move-result v5
    //         if-nez v5, :cond_1
    //         invoke-virtual {p1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "transitionName":Ljava/lang/String;
    //         if-eqz v3, :cond_0
    //         invoke-interface {p0, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         instance-of v5, p1, Landroid/view/ViewGroup;
    //         if-eqz v5, :cond_1
    //         move-object v4, p1
    //         check-cast v4, Landroid/view/ViewGroup;
    //         .local v4, "viewGroup":Landroid/view/ViewGroup;
    //         invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I
    //         move-result v1
    //         .local v1, "count":I
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_0
    //         if-ge v2, v1, :cond_1
    //         invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         invoke-static {p0, v0}, Landroid/support/v4/app/FragmentTransitionCompat21;->findNamedViews(Ljava/util/Map;Landroid/view/View;)V
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         .end local v0    # "child":Landroid/view/View;
    //         .end local v1    # "count":I
    //         .end local v2    # "i":I
    //         .end local v3    # "transitionName":Ljava/lang/String;
    //         .end local v4    # "viewGroup":Landroid/view/ViewGroup;
    //         :cond_1
    //         return-void
    */

    private @JvmStatic fun getBoundsOnScreen(view: android.view.View): android.graphics.Rect { return TODO("body: (Landroid/view/View;)Landroid/graphics/Rect;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         const/4 v4, 0x0
    //         new-instance v0, Landroid/graphics/Rect;
    //         invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
    //         .local v0, "epicenter":Landroid/graphics/Rect;
    //         const/4 v2, 0x2
    //         new-array v1, v2, [I
    //         .local v1, "loc":[I
    //         invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V
    //         aget v2, v1, v4
    //         aget v3, v1, v6
    //         aget v4, v1, v4
    //         invoke-virtual {p0}, Landroid/view/View;->getWidth()I
    //         move-result v5
    //         add-int/2addr v4, v5
    //         aget v5, v1, v6
    //         invoke-virtual {p0}, Landroid/view/View;->getHeight()I
    //         move-result v6
    //         add-int/2addr v5, v6
    //         invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/Rect;->set(IIII)V
    //         return-object v0
    */

    public @JvmStatic fun getTransitionName(view: android.view.View): String { return TODO("body: (Landroid/view/View;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->getTransitionName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun mergeTransitions(enterTransitionObject: Object, exitTransitionObject: Object, sharedElementTransitionObject: Object, allowOverlap: Boolean): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;") }
    /*
    //         .locals 10
    //         const/4 v2, 0x1
    //         .local v2, "overlap":Z
    //         move-object v0, p0
    //         check-cast v0, Landroid/transition/Transition;
    //         .local v0, "enterTransition":Landroid/transition/Transition;
    //         move-object v1, p1
    //         check-cast v1, Landroid/transition/Transition;
    //         .local v1, "exitTransition":Landroid/transition/Transition;
    //         move-object v3, p2
    //         check-cast v3, Landroid/transition/Transition;
    //         .local v3, "sharedElementTransition":Landroid/transition/Transition;
    //         if-eqz v0, :cond_0
    //         if-eqz v1, :cond_0
    //         move v2, p3
    //         :cond_0
    //         if-eqz v2, :cond_4
    //         new-instance v7, Landroid/transition/TransitionSet;
    //         invoke-direct {v7}, Landroid/transition/TransitionSet;-><init>()V
    //         .local v7, "transitionSet":Landroid/transition/TransitionSet;
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v7, v0}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-virtual {v7, v1}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
    //         :cond_2
    //         if-eqz v3, :cond_3
    //         invoke-virtual {v7, v3}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
    //         :cond_3
    //         move-object v6, v7
    //         .end local v7    # "transitionSet":Landroid/transition/TransitionSet;
    //         .local v6, "transition":Landroid/transition/Transition;
    //         :goto_0
    //         return-object v6
    //         .end local v6    # "transition":Landroid/transition/Transition;
    //         :cond_4
    //         const/4 v4, 0x0
    //         .local v4, "staggered":Landroid/transition/Transition;
    //         if-eqz v1, :cond_7
    //         if-eqz v0, :cond_7
    //         new-instance v8, Landroid/transition/TransitionSet;
    //         invoke-direct {v8}, Landroid/transition/TransitionSet;-><init>()V
    //         invoke-virtual {v8, v1}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
    //         move-result-object v8
    //         invoke-virtual {v8, v0}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
    //         move-result-object v8
    //         const/4 v9, 0x1
    //         invoke-virtual {v8, v9}, Landroid/transition/TransitionSet;->setOrdering(I)Landroid/transition/TransitionSet;
    //         move-result-object v4
    //         :cond_5
    //         :goto_1
    //         if-eqz v3, :cond_9
    //         new-instance v5, Landroid/transition/TransitionSet;
    //         invoke-direct {v5}, Landroid/transition/TransitionSet;-><init>()V
    //         .local v5, "together":Landroid/transition/TransitionSet;
    //         if-eqz v4, :cond_6
    //         invoke-virtual {v5, v4}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
    //         :cond_6
    //         invoke-virtual {v5, v3}, Landroid/transition/TransitionSet;->addTransition(Landroid/transition/Transition;)Landroid/transition/TransitionSet;
    //         move-object v6, v5
    //         .restart local v6    # "transition":Landroid/transition/Transition;
    //         goto :goto_0
    //         .end local v5    # "together":Landroid/transition/TransitionSet;
    //         .end local v6    # "transition":Landroid/transition/Transition;
    //         :cond_7
    //         if-eqz v1, :cond_8
    //         move-object v4, v1
    //         goto :goto_1
    //         :cond_8
    //         if-eqz v0, :cond_5
    //         move-object v4, v0
    //         goto :goto_1
    //         :cond_9
    //         move-object v6, v4
    //         .restart local v6    # "transition":Landroid/transition/Transition;
    //         goto :goto_0
    */

    public @JvmStatic fun removeTargets(transitionObject: Object, p1: java.util.ArrayList) { /* TODO(body): (Ljava/lang/Object;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 4
    //         .local p1, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    //         move-object v2, p0
    //         check-cast v2, Landroid/transition/Transition;
    //         .local v2, "transition":Landroid/transition/Transition;
    //         invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         .local v1, "numViews":I
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         if-ge v0, v1, :cond_0
    //         invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Landroid/view/View;
    //         invoke-virtual {v2, v3}, Landroid/transition/Transition;->removeTarget(Landroid/view/View;)Landroid/transition/Transition;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun setEpicenter(transitionObject: Object, view: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         move-object v1, p0
    //         check-cast v1, Landroid/transition/Transition;
    //         .local v1, "transition":Landroid/transition/Transition;
    //         invoke-static {p1}, Landroid/support/v4/app/FragmentTransitionCompat21;->getBoundsOnScreen(Landroid/view/View;)Landroid/graphics/Rect;
    //         move-result-object v0
    //         .local v0, "epicenter":Landroid/graphics/Rect;
    //         new-instance v2, Landroid/support/v4/app/FragmentTransitionCompat21$1;
    //         invoke-direct {v2, v0}, Landroid/support/v4/app/FragmentTransitionCompat21$1;-><init>(Landroid/graphics/Rect;)V
    //         invoke-virtual {v1, v2}, Landroid/transition/Transition;->setEpicenterCallback(Landroid/transition/Transition$EpicenterCallback;)V
    //         return-void
    */

    private @JvmStatic fun setSharedElementEpicenter(transition: android.transition.Transition, epicenterView: android.support.v4.app.FragmentTransitionCompat21.EpicenterView) { /* TODO(body): (Landroid/transition/Transition;Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;)V */ }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         new-instance v0, Landroid/support/v4/app/FragmentTransitionCompat21$3;
    //         invoke-direct {v0, p1}, Landroid/support/v4/app/FragmentTransitionCompat21$3;-><init>(Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;)V
    //         invoke-virtual {p0, v0}, Landroid/transition/Transition;->setEpicenterCallback(Landroid/transition/Transition$EpicenterCallback;)V
    //         :cond_0
    //         return-void
    */

    }
}
