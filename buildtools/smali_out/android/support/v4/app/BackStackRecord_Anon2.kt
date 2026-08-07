package android.support.v4.app

// Auto-emitted from smali source: BackStackRecord.java.
// 8 fields, 2 methods.

open class BackStackRecord_Anon2: android.view.ViewTreeObserver.OnPreDrawListener {
    val this$0: android.support.v4.app.BackStackRecord
    val val$inFragment: android.support.v4.app.Fragment
    val val$isBack: Boolean
    val val$outFragment: android.support.v4.app.Fragment
    val val$sceneRoot: android.view.View
    val val$sharedElementTargets: java.util.ArrayList
    val val$sharedElementTransition: Object
    val val$state: android.support.v4.app.BackStackRecord.TransitionState

    constructor(p0: android.support.v4.app.BackStackRecord, p1: android.view.View, p2: Object, p3: java.util.ArrayList, p4: android.support.v4.app.BackStackRecord.TransitionState, p5: Boolean, p6: android.support.v4.app.Fragment, p7: android.support.v4.app.Fragment)

    public fun onPreDraw(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sceneRoot:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTransition:Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTransition:Ljava/lang/Object;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTargets:Ljava/util/ArrayList;
    //         invoke-static {v0, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->removeTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTargets:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->this$0:Landroid/support/v4/app/BackStackRecord;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord$2;->val$state:Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         iget-boolean v2, p0, Landroid/support/v4/app/BackStackRecord$2;->val$isBack:Z
    //         iget-object v3, p0, Landroid/support/v4/app/BackStackRecord$2;->val$inFragment:Landroid/support/v4/app/Fragment;
    //         invoke-static {v0, v1, v2, v3}, Landroid/support/v4/app/BackStackRecord;->access$000(Landroid/support/v4/app/BackStackRecord;Landroid/support/v4/app/BackStackRecord$TransitionState;ZLandroid/support/v4/app/Fragment;)Landroid/support/v4/util/ArrayMap;
    //         move-result-object v5
    //         .local v5, "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         invoke-virtual {v5}, Landroid/support/v4/util/ArrayMap;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTargets:Ljava/util/ArrayList;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord$2;->val$state:Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         iget-object v1, v1, Landroid/support/v4/app/BackStackRecord$TransitionState;->nonExistentView:Landroid/view/View;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :goto_0
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTransition:Ljava/lang/Object;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTargets:Ljava/util/ArrayList;
    //         invoke-static {v0, v1}, Landroid/support/v4/app/FragmentTransitionCompat21;->addTargets(Ljava/lang/Object;Ljava/util/ArrayList;)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->this$0:Landroid/support/v4/app/BackStackRecord;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord$2;->val$state:Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         invoke-static {v0, v5, v1}, Landroid/support/v4/app/BackStackRecord;->access$100(Landroid/support/v4/app/BackStackRecord;Landroid/support/v4/util/ArrayMap;Landroid/support/v4/app/BackStackRecord$TransitionState;)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->this$0:Landroid/support/v4/app/BackStackRecord;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord$2;->val$state:Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         iget-object v2, p0, Landroid/support/v4/app/BackStackRecord$2;->val$inFragment:Landroid/support/v4/app/Fragment;
    //         iget-object v3, p0, Landroid/support/v4/app/BackStackRecord$2;->val$outFragment:Landroid/support/v4/app/Fragment;
    //         iget-boolean v4, p0, Landroid/support/v4/app/BackStackRecord$2;->val$isBack:Z
    //         invoke-static/range {v0 .. v5}, Landroid/support/v4/app/BackStackRecord;->access$200(Landroid/support/v4/app/BackStackRecord;Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;ZLandroid/support/v4/util/ArrayMap;)V
    //         .end local v5    # "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         :cond_0
    //         const/4 v0, 0x1
    //         return v0
    //         .restart local v5    # "namedViews":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<Ljava/lang/String;Landroid/view/View;>;"
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$2;->val$sharedElementTargets:Ljava/util/ArrayList;
    //         invoke-virtual {v5}, Landroid/support/v4/util/ArrayMap;->values()Ljava/util/Collection;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         goto :goto_0
    */

}
