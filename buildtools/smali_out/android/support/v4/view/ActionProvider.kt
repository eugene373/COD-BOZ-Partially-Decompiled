package android.support.v4.view

// Auto-emitted from smali source: ActionProvider.java.
// 4 fields, 13 methods.

open class ActionProvider {
    private val mContext: android.content.Context
    private var mSubUiVisibilityListener: android.support.v4.view.ActionProvider.SubUiVisibilityListener
    private var mVisibilityListener: android.support.v4.view.ActionProvider.VisibilityListener

    public constructor(context: android.content.Context)

    public fun getContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    public fun hasSubMenu(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun onCreateActionView(): android.view.View

    public fun onCreateActionView(forItem: android.view.MenuItem): android.view.View { return TODO("body: (Landroid/view/MenuItem;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/view/ActionProvider;->onCreateActionView()Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onPerformDefaultAction(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onPrepareSubMenu(subMenu: android.view.SubMenu) { /* TODO(body): (Landroid/view/SubMenu;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun overridesItemVisibility(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun refreshVisibility() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
    //         invoke-virtual {p0}, Landroid/support/v4/view/ActionProvider;->isVisible()Z
    //         move-result v1
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/ActionProvider$VisibilityListener;->onActionProviderVisibilityChanged(Z)V
    //         :cond_0
    //         return-void
    */

    public fun setSubUiVisibilityListener(listener: android.support.v4.view.ActionProvider.SubUiVisibilityListener) { /* TODO(body): (Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/view/ActionProvider;->mSubUiVisibilityListener:Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
    //         return-void
    */

    public fun setVisibilityListener(listener: android.support.v4.view.ActionProvider.VisibilityListener) { /* TODO(body): (Landroid/support/v4/view/ActionProvider$VisibilityListener;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
    //         if-eqz v0, :cond_0
    //         if-eqz p1, :cond_0
    //         const-string v0, "ActionProvider(support)"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " instance while it is still in use somewhere else?"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iput-object p1, p0, Landroid/support/v4/view/ActionProvider;->mVisibilityListener:Landroid/support/v4/view/ActionProvider$VisibilityListener;
    //         return-void
    */

    public fun subUiVisibilityChanged(isVisible: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mSubUiVisibilityListener:Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/view/ActionProvider;->mSubUiVisibilityListener:Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;->onSubUiVisibilityChanged(Z)V
    //         :cond_0
    //         return-void
    */

    companion object {
    private val TAG: String = "ActionProvider(support)"
    }
}
