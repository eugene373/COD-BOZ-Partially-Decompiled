package android.support.v4.app

// Auto-emitted from smali source: FragmentTransitionCompat21.java.
// 11 fields, 2 methods.

class FragmentTransitionCompat21_Anon4: android.view.ViewTreeObserver.OnPreDrawListener {
    val val$enterTransition: android.transition.Transition
    val val$enteringViews: java.util.ArrayList
    val val$exitTransition: android.transition.Transition
    val val$exitingViews: java.util.ArrayList
    val val$hiddenViews: java.util.ArrayList
    val val$nonExistentView: android.view.View
    val val$overallTransition: android.transition.Transition
    val val$renamedViews: java.util.Map
    val val$sceneRoot: android.view.View
    val val$sharedElementTargets: java.util.ArrayList
    val val$sharedElementTransition: android.transition.Transition

    constructor(p0: android.view.View, p1: android.transition.Transition, p2: android.view.View, p3: java.util.ArrayList, p4: android.transition.Transition, p5: java.util.ArrayList, p6: android.transition.Transition, p7: java.util.ArrayList, p8: java.util.Map, p9: java.util.ArrayList, p10: android.transition.Transition)

    public fun onPreDraw(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 9
    //         const/4 v8, 0x0
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$sceneRoot:Landroid/view/View;
    //         invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v6
    //         invoke-virtual {v6, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$enterTransition:Landroid/transition/Transition;
    //         if-eqz v6, :cond_0
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$enterTransition:Landroid/transition/Transition;
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$nonExistentView:Landroid/view/View;
    //         invoke-virtual {v6, v7}, Landroid/transition/Transition;->removeTarget(Landroid/view/View;)Landroid/transition/Transition;
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$enterTransition:Landroid/transition/Transition;
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$enteringViews:Ljava/util/ArrayList;
    //         invoke-static {v6, v7}, Landroid/support/v4/app/FragmentTransitionCompat21;->removeTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         :cond_0
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$exitTransition:Landroid/transition/Transition;
    //         if-eqz v6, :cond_1
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$exitTransition:Landroid/transition/Transition;
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$exitingViews:Ljava/util/ArrayList;
    //         invoke-static {v6, v7}, Landroid/support/v4/app/FragmentTransitionCompat21;->removeTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         :cond_1
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$sharedElementTransition:Landroid/transition/Transition;
    //         if-eqz v6, :cond_2
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$sharedElementTransition:Landroid/transition/Transition;
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$sharedElementTargets:Ljava/util/ArrayList;
    //         invoke-static {v6, v7}, Landroid/support/v4/app/FragmentTransitionCompat21;->removeTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         :cond_2
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$renamedViews:Ljava/util/Map;
    //         invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v6
    //         invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         .local v2, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v6
    //         if-eqz v6, :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Landroid/view/View;>;"
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v5
    //         check-cast v5, Landroid/view/View;
    //         .local v5, "view":Landroid/view/View;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         .local v3, "name":Ljava/lang/String;
    //         invoke-virtual {v5, v3}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V
    //         goto :goto_0
    //         .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Landroid/view/View;>;"
    //         .end local v3    # "name":Ljava/lang/String;
    //         .end local v5    # "view":Landroid/view/View;
    //         :cond_3
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$hiddenViews:Ljava/util/ArrayList;
    //         invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
    //         move-result v4
    //         .local v4, "numViews":I
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_1
    //         if-ge v1, v4, :cond_4
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$overallTransition:Landroid/transition/Transition;
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$hiddenViews:Ljava/util/ArrayList;
    //         invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, Landroid/view/View;
    //         invoke-virtual {v7, v6, v8}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_4
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$overallTransition:Landroid/transition/Transition;
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$4;->val$nonExistentView:Landroid/view/View;
    //         invoke-virtual {v6, v7, v8}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;
    //         const/4 v6, 0x1
    //         return v6
    */

}
