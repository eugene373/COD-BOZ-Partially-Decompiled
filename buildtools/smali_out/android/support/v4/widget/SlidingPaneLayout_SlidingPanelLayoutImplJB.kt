package android.support.v4.widget

// Auto-emitted from smali source: SlidingPaneLayout.java.
// 2 fields, 2 methods.

open class SlidingPaneLayout_SlidingPanelLayoutImplJB: android.support.v4.widget.SlidingPaneLayout.SlidingPanelLayoutImplBase() {
    private var mGetDisplayList: java.lang.reflect.Method
    private var mRecreateDisplayList: java.lang.reflect.Field

    constructor()

    public fun invalidateChildRegion(parent: android.support.v4.widget.SlidingPaneLayout, child: android.view.View) { /* TODO(body): (Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, p2, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    //         iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;
    //         const/4 v1, 0x0
    //         check-cast v1, [Ljava/lang/Object;
    //         invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         invoke-super {p0, p1, p2}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;->invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
    //         :goto_1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         const-string v1, "SlidingPaneLayout"
    //         const-string v2, "Error refreshing display list state"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         .end local v0    # "e":Ljava/lang/Exception;
    //         :cond_0
    //         invoke-virtual {p2}, Landroid/view/View;->invalidate()V
    //         goto :goto_1
    */

}
