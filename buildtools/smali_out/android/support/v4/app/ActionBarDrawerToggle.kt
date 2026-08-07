package android.support.v4.app

// Auto-emitted from smali source: ActionBarDrawerToggle.java.
// 15 fields, 19 methods.

open class ActionBarDrawerToggle: android.support.v4.widget.DrawerLayout.DrawerListener {
    private val mActivity: android.app.Activity
    private val mActivityImpl: android.support.v4.app.ActionBarDrawerToggle.Delegate
    private val mCloseDrawerContentDescRes: Int
    private var mDrawerImage: android.graphics.drawable.Drawable
    private val mDrawerImageResource: Int
    private var mDrawerIndicatorEnabled: Boolean
    private val mDrawerLayout: android.support.v4.widget.DrawerLayout
    private var mHasCustomUpIndicator: Boolean
    private var mHomeAsUpIndicator: android.graphics.drawable.Drawable
    private val mOpenDrawerContentDescRes: Int
    private var mSetIndicatorInfo: Object
    private var mSlider: android.support.v4.app.ActionBarDrawerToggle.SlideDrawable

    public constructor(activity: android.app.Activity, drawerLayout: android.support.v4.widget.DrawerLayout, drawerImageRes: Int, openDrawerContentDescRes: Int, closeDrawerContentDescRes: Int)

    public constructor(activity: android.app.Activity, drawerLayout: android.support.v4.widget.DrawerLayout, animate: Boolean, drawerImageRes: Int, openDrawerContentDescRes: Int, closeDrawerContentDescRes: Int)

    fun getThemeUpIndicator(): android.graphics.drawable.Drawable { return TODO("body: ()Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
    //         invoke-interface {v0}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
    //         invoke-interface {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->getThemeUpIndicator(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun isDrawerIndicatorEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         return v0
    */

    public fun onConfigurationChanged(newConfig: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHasCustomUpIndicator:Z
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHomeAsUpIndicator:Landroid/graphics/drawable/Drawable;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
    //         iget v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImageResource:I
    //         invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImage:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->syncState()V
    //         return-void
    */

    public fun onDrawerClosed(drawerView: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarDescription(I)V
    //         :cond_0
    //         return-void
    */

    public fun onDrawerOpened(drawerView: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         const/high16 v1, 0x3f800000    # 1.0f
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarDescription(I)V
    //         :cond_0
    //         return-void
    */

    public fun onDrawerSlide(drawerView: android.view.View, slideOffset: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 4
    //         const/high16 v3, 0x40000000    # 2.0f
    //         const/high16 v2, 0x3f000000    # 0.5f
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         invoke-virtual {v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->getPosition()F
    //         move-result v0
    //         .local v0, "glyphOffset":F
    //         cmpl-float v1, p2, v2
    //         if-lez v1, :cond_0
    //         const/4 v1, 0x0
    //         sub-float v2, p2, v2
    //         invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F
    //         move-result v1
    //         mul-float/2addr v1, v3
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F
    //         move-result v0
    //         :goto_0
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         invoke-virtual {v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V
    //         return-void
    //         :cond_0
    //         mul-float v1, p2, v3
    //         invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F
    //         move-result v0
    //         goto :goto_0
    */

    public fun onDrawerStateChanged(newState: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onOptionsItemSelected(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 3
    //         const v2, 0x800003
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I
    //         move-result v0
    //         const v1, 0x102002c
    //         if-ne v0, v1, :cond_1
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(I)V
    //         :goto_0
    //         const/4 v0, 0x1
    //         :goto_1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(I)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    fun setActionBarDescription(contentDescRes: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
    //         invoke-interface {v0, p1}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->setActionBarDescription(I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
    //         iget-object v2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
    //         invoke-interface {v0, v1, v2, p1}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->setActionBarDescription(Ljava/lang/Object;Landroid/app/Activity;I)Ljava/lang/Object;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
    //         goto :goto_0
    */

    fun setActionBarUpIndicator(upDrawable: android.graphics.drawable.Drawable, contentDescRes: Int) { /* TODO(body): (Landroid/graphics/drawable/Drawable;I)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
    //         iget-object v2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
    //         invoke-interface {v0, v1, v2, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->setActionBarUpIndicator(Ljava/lang/Object;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Ljava/lang/Object;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun setDrawerIndicatorEnabled(enable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         if-eq p1, v0, :cond_0
    //         if-eqz p1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
    //         const v2, 0x800003
    //         invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I
    //         :goto_0
    //         invoke-virtual {p0, v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
    //         :goto_1
    //         iput-boolean p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHomeAsUpIndicator:Landroid/graphics/drawable/Drawable;
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
    //         goto :goto_1
    */

    public fun setHomeAsUpIndicator(resId: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "indicator":Landroid/graphics/drawable/Drawable;
    //         if-eqz p1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;
    //         invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    //         return-void
    */

    public fun setHomeAsUpIndicator(indicator: android.graphics.drawable.Drawable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         if-nez p1, :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHomeAsUpIndicator:Landroid/graphics/drawable/Drawable;
    //         iput-boolean v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHasCustomUpIndicator:Z
    //         :goto_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHomeAsUpIndicator:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iput-object p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHomeAsUpIndicator:Landroid/graphics/drawable/Drawable;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mHasCustomUpIndicator:Z
    //         goto :goto_0
    */

    public fun syncState() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const v2, 0x800003
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         const/high16 v1, 0x3f800000    # 1.0f
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V
    //         :goto_0
    //         iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I
    //         :goto_1
    //         invoke-virtual {p0, v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V
    //         goto :goto_0
    //         :cond_2
    //         iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I
    //         goto :goto_1
    */

    companion object {
    private val ID_HOME: Int = 0x102002c
    private val IMPL: android.support.v4.app.ActionBarDrawerToggle.ActionBarDrawerToggleImpl = null!!
    private val TOGGLE_DRAWABLE_OFFSET: Float = 0.0f

    private @JvmStatic fun assumeMaterial(context: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 2
    //         const/16 v1, 0x15
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v0
    //         iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    //         if-lt v0, v1, :cond_0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         if-lt v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
