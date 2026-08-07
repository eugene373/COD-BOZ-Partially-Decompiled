package android.support.v4.app

// Auto-emitted from smali source: ActionBarDrawerToggleHoneycomb.java.
// 2 fields, 5 methods.

open class ActionBarDrawerToggleHoneycomb {
    constructor()

    companion object {
    private val TAG: String = "ActionBarDrawerToggleHoneycomb"
    private val THEME_ATTRS: IntArray = null!!

    public @JvmStatic fun getThemeUpIndicator(activity: android.app.Activity): android.graphics.drawable.Drawable { return TODO("body: (Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 3
    //         sget-object v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;->THEME_ATTRS:[I
    //         invoke-virtual {p0, v2}, Landroid/app/Activity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         .local v0, "a":Landroid/content/res/TypedArray;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v1
    //         .local v1, "result":Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-object v1
    */

    public @JvmStatic fun setActionBarDescription(info: Object, activity: android.app.Activity, contentDescRes: Int): Object { return TODO("body: (Ljava/lang/Object;Landroid/app/Activity;I)Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         if-nez p0, :cond_0
    //         new-instance p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;-><init>(Landroid/app/Activity;)V
    //         :cond_0
    //         move-object v2, p0
    //         check-cast v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
    //         .local v2, "sii":Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
    //         iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
    //         if-eqz v3, :cond_1
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
    //         move-result-object v0
    //         .local v0, "actionBar":Landroid/app/ActionBar;
    //         iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v4, 0x13
    //         if-gt v3, v4, :cond_1
    //         invoke-virtual {v0}, Landroid/app/ActionBar;->getSubtitle()Ljava/lang/CharSequence;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Landroid/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v0    # "actionBar":Landroid/app/ActionBar;
    //         :cond_1
    //         :goto_0
    //         return-object p0
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         const-string v3, "ActionBarDrawerToggleHoneycomb"
    //         const-string v4, "Couldn\'t set content description via JB-MR2 API"
    //         invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public @JvmStatic fun setActionBarUpIndicator(info: Object, activity: android.app.Activity, drawable: android.graphics.drawable.Drawable, contentDescRes: Int): Object { return TODO("body: (Ljava/lang/Object;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         if-nez p0, :cond_0
    //         new-instance p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;-><init>(Landroid/app/Activity;)V
    //         :cond_0
    //         move-object v2, p0
    //         check-cast v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
    //         .local v2, "sii":Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
    //         iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
    //         if-eqz v3, :cond_1
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
    //         move-result-object v0
    //         .local v0, "actionBar":Landroid/app/ActionBar;
    //         iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         aput-object p2, v4, v5
    //         invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v0    # "actionBar":Landroid/app/ActionBar;
    //         :goto_0
    //         return-object p0
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         const-string v3, "ActionBarDrawerToggleHoneycomb"
    //         const-string v4, "Couldn\'t set home-as-up indicator via JB-MR2 API"
    //         invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         .end local v1    # "e":Ljava/lang/Exception;
    //         :cond_1
    //         iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;
    //         if-eqz v3, :cond_2
    //         iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;
    //         invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    //         goto :goto_0
    //         :cond_2
    //         const-string v3, "ActionBarDrawerToggleHoneycomb"
    //         const-string v4, "Couldn\'t set home-as-up indicator"
    //         invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    }
}
