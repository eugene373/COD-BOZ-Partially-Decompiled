package android.support.v4.app

// Auto-emitted from smali source: FragmentActivity.java.
// 1 fields, 3 methods.

open class FragmentActivity_Anon2: android.support.v4.app.FragmentContainer {
    val this$0: android.support.v4.app.FragmentActivity

    constructor(p0: android.support.v4.app.FragmentActivity)

    public fun findViewById(id: Int): android.view.View { return TODO("body: (I)Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$2;->this$0:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hasView(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentActivity$2;->this$0:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         .local v0, "window":Landroid/view/Window;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

}
