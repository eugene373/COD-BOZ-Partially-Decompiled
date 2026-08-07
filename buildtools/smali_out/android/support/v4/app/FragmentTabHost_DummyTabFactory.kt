package android.support.v4.app

// Auto-emitted from smali source: FragmentTabHost.java.
// 1 fields, 2 methods.

open class FragmentTabHost_DummyTabFactory: android.widget.TabHost.TabContentFactory {
    private val mContext: android.content.Context

    public constructor(context: android.content.Context)

    public fun createTabContent(tag: String): android.view.View { return TODO("body: (Ljava/lang/String;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         new-instance v0, Landroid/view/View;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;->mContext:Landroid/content/Context;
    //         invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
    //         .local v0, "v":Landroid/view/View;
    //         invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumWidth(I)V
    //         invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V
    //         return-object v0
    */

}
