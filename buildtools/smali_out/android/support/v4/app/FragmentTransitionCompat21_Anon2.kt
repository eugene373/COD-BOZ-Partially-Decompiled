package android.support.v4.app

// Auto-emitted from smali source: FragmentTransitionCompat21.java.
// 6 fields, 2 methods.

class FragmentTransitionCompat21_Anon2: android.view.ViewTreeObserver.OnPreDrawListener {
    val val$container: android.view.View
    val val$enterTransition: android.transition.Transition
    val val$enteringViews: java.util.ArrayList
    val val$inFragment: android.support.v4.app.FragmentTransitionCompat21.ViewRetriever
    val val$nameOverrides: java.util.Map
    val val$renamedViews: java.util.Map

    constructor(p0: android.view.View, p1: android.support.v4.app.FragmentTransitionCompat21.ViewRetriever, p2: java.util.Map, p3: java.util.Map, p4: android.transition.Transition, p5: java.util.ArrayList)

    public fun onPreDraw(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 8
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$container:Landroid/view/View;
    //         invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v6
    //         invoke-virtual {v6, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$inFragment:Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;
    //         invoke-interface {v6}, Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;->getView()Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "fragmentView":Landroid/view/View;
    //         if-eqz v1, :cond_2
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$nameOverrides:Ljava/util/Map;
    //         invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z
    //         move-result v6
    //         if-nez v6, :cond_1
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$renamedViews:Ljava/util/Map;
    //         invoke-static {v6, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->findNamedViews(Ljava/util/Map;Landroid/view/View;)V
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$renamedViews:Ljava/util/Map;
    //         invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v6
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$nameOverrides:Ljava/util/Map;
    //         invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v7
    //         invoke-interface {v6, v7}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$nameOverrides:Ljava/util/Map;
    //         invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v6
    //         invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         .local v3, "i$":Ljava/util/Iterator;
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v6
    //         if-eqz v6, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v4
    //         check-cast v4, Ljava/lang/String;
    //         .local v4, "to":Ljava/lang/String;
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$renamedViews:Ljava/util/Map;
    //         invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v5
    //         check-cast v5, Landroid/view/View;
    //         .local v5, "view":Landroid/view/View;
    //         if-eqz v5, :cond_0
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "from":Ljava/lang/String;
    //         invoke-virtual {v5, v2}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V
    //         goto :goto_0
    //         .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    //         .end local v2    # "from":Ljava/lang/String;
    //         .end local v3    # "i$":Ljava/util/Iterator;
    //         .end local v4    # "to":Ljava/lang/String;
    //         .end local v5    # "view":Landroid/view/View;
    //         :cond_1
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$enterTransition:Landroid/transition/Transition;
    //         if-eqz v6, :cond_2
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$enteringViews:Ljava/util/ArrayList;
    //         invoke-static {v6, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->access$000(Ljava/util/ArrayList;Landroid/view/View;)V
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$enteringViews:Ljava/util/ArrayList;
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$renamedViews:Ljava/util/Map;
    //         invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v7
    //         invoke-virtual {v6, v7}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
    //         iget-object v6, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$enterTransition:Landroid/transition/Transition;
    //         iget-object v7, p0, Landroid/support/v4/app/FragmentTransitionCompat21$2;->val$enteringViews:Ljava/util/ArrayList;
    //         invoke-static {v6, v7}, Landroid/support/v4/app/FragmentTransitionCompat21;->addTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         :cond_2
    //         const/4 v6, 0x1
    //         return v6
    */

}
