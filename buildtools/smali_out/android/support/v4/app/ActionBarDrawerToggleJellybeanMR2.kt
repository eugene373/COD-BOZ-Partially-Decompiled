package android.support.v4.app

// Auto-emitted from smali source: ActionBarDrawerToggleJellybeanMR2.java.
// 2 fields, 5 methods.

open class ActionBarDrawerToggleJellybeanMR2 {
    constructor()

    companion object {
    private val TAG: String = "ActionBarDrawerToggleImplJellybeanMR2"
    private val THEME_ATTRS: IntArray = null!!

    public @JvmStatic fun getThemeUpIndicator(activity: android.app.Activity): android.graphics.drawable.Drawable { return TODO("body: (Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         invoke-virtual {p0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
    //         move-result-object v1
    //         .local v1, "actionBar":Landroid/app/ActionBar;
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;
    //         move-result-object v2
    //         .local v2, "context":Landroid/content/Context;
    //         :goto_0
    //         const/4 v4, 0x0
    //         sget-object v5, Landroid/support/v4/app/ActionBarDrawerToggleJellybeanMR2;->THEME_ATTRS:[I
    //         const v6, 0x10102ce
    //         invoke-virtual {v2, v4, v5, v6, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         .local v0, "a":Landroid/content/res/TypedArray;
    //         invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v3
    //         .local v3, "result":Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-object v3
    //         .end local v0    # "a":Landroid/content/res/TypedArray;
    //         .end local v2    # "context":Landroid/content/Context;
    //         .end local v3    # "result":Landroid/graphics/drawable/Drawable;
    //         :cond_0
    //         move-object v2, p0
    //         .restart local v2    # "context":Landroid/content/Context;
    //         goto :goto_0
    */

    public @JvmStatic fun setActionBarDescription(info: Object, activity: android.app.Activity, contentDescRes: Int): Object { return TODO("body: (Ljava/lang/Object;Landroid/app/Activity;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
    //         move-result-object v0
    //         .local v0, "actionBar":Landroid/app/ActionBar;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0, p2}, Landroid/app/ActionBar;->setHomeActionContentDescription(I)V
    //         :cond_0
    //         return-object p0
    */

    public @JvmStatic fun setActionBarUpIndicator(info: Object, activity: android.app.Activity, drawable: android.graphics.drawable.Drawable, contentDescRes: Int): Object { return TODO("body: (Ljava/lang/Object;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
    //         move-result-object v0
    //         .local v0, "actionBar":Landroid/app/ActionBar;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0, p2}, Landroid/app/ActionBar;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    //         invoke-virtual {v0, p3}, Landroid/app/ActionBar;->setHomeActionContentDescription(I)V
    //         :cond_0
    //         return-object p0
    */

    }
}
