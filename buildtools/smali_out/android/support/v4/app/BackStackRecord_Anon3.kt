package android.support.v4.app

// Auto-emitted from smali source: BackStackRecord.java.
// 5 fields, 2 methods.

open class BackStackRecord_Anon3: android.view.ViewTreeObserver.OnPreDrawListener {
    val this$0: android.support.v4.app.BackStackRecord
    val val$containerId: Int
    val val$sceneRoot: android.view.View
    val val$state: android.support.v4.app.BackStackRecord.TransitionState
    val val$transition: Object

    constructor(p0: android.support.v4.app.BackStackRecord, p1: android.view.View, p2: android.support.v4.app.BackStackRecord.TransitionState, p3: Int, p4: Object)

    public fun onPreDraw(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$3;->val$sceneRoot:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //         iget-object v0, p0, Landroid/support/v4/app/BackStackRecord$3;->this$0:Landroid/support/v4/app/BackStackRecord;
    //         iget-object v1, p0, Landroid/support/v4/app/BackStackRecord$3;->val$state:Landroid/support/v4/app/BackStackRecord$TransitionState;
    //         iget v2, p0, Landroid/support/v4/app/BackStackRecord$3;->val$containerId:I
    //         iget-object v3, p0, Landroid/support/v4/app/BackStackRecord$3;->val$transition:Ljava/lang/Object;
    //         invoke-static {v0, v1, v2, v3}, Landroid/support/v4/app/BackStackRecord;->access$300(Landroid/support/v4/app/BackStackRecord;Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V
    //         const/4 v0, 0x1
    //         return v0
    */

}
