package android.support.v4.app

// Auto-emitted from smali source: Fragment.java.
// 1 fields, 3 methods.

open class Fragment_Anon1: android.support.v4.app.FragmentContainer {
    val this$0: android.support.v4.app.Fragment

    constructor(p0: android.support.v4.app.Fragment)

    public fun findViewById(id: Int): android.view.View { return TODO("body: (I)Landroid/view/View;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment$1;->this$0:Landroid/support/v4/app/Fragment;
    //         iget-object v0, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Fragment does not have a view"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment$1;->this$0:Landroid/support/v4/app/Fragment;
    //         iget-object v0, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hasView(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment$1;->this$0:Landroid/support/v4/app/Fragment;
    //         iget-object v0, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
