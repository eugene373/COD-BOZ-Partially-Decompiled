package android.support.v4.view

// Auto-emitted from smali source: ViewCompat.java.
// 4 fields, 81 methods.

open class ViewCompat_BaseViewCompatImpl: android.support.v4.view.ViewCompat.ViewCompatImpl {
    private var mDispatchFinishTemporaryDetach: java.lang.reflect.Method
    private var mDispatchStartTemporaryDetach: java.lang.reflect.Method
    private var mTempDetachBound: Boolean
    var mViewPropertyAnimatorCompatMap: java.util.WeakHashMap

    constructor()

    private fun bindTempDetach() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         const-class v1, Landroid/view/View;
    //         const-string v2, "dispatchStartTemporaryDetach"
    //         const/4 v3, 0x0
    //         new-array v3, v3, [Ljava/lang/Class;
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v1
    //         iput-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchStartTemporaryDetach:Ljava/lang/reflect/Method;
    //         const-class v1, Landroid/view/View;
    //         const-string v2, "dispatchFinishTemporaryDetach"
    //         const/4 v3, 0x0
    //         new-array v3, v3, [Ljava/lang/Class;
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v1
    //         iput-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchFinishTemporaryDetach:Ljava/lang/reflect/Method;
    //         :try_end_0
    //         .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mTempDetachBound:Z
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/NoSuchMethodException;
    //         const-string v1, "ViewCompat"
    //         const-string v2, "Couldn\'t find method"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public fun animate(view: android.view.View): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-direct {v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;-><init>(Landroid/view/View;)V
    //         return-object v0
    */

    public fun canScrollHorizontally(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun canScrollVertically(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun dispatchFinishTemporaryDetach(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         iget-boolean v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mTempDetachBound:Z
    //         if-nez v1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->bindTempDetach()V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchFinishTemporaryDetach:Ljava/lang/reflect/Method;
    //         if-eqz v1, :cond_1
    //         :try_start_0
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchFinishTemporaryDetach:Ljava/lang/reflect/Method;
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         const-string v1, "ViewCompat"
    //         const-string v2, "Error calling dispatchFinishTemporaryDetach"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         .end local v0    # "e":Ljava/lang/Exception;
    //         :cond_1
    //         invoke-virtual {p1}, Landroid/view/View;->onFinishTemporaryDetach()V
    //         goto :goto_0
    */

    public fun dispatchStartTemporaryDetach(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         iget-boolean v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mTempDetachBound:Z
    //         if-nez v1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->bindTempDetach()V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchStartTemporaryDetach:Ljava/lang/reflect/Method;
    //         if-eqz v1, :cond_1
    //         :try_start_0
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchStartTemporaryDetach:Ljava/lang/reflect/Method;
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         const-string v1, "ViewCompat"
    //         const-string v2, "Error calling dispatchStartTemporaryDetach"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         .end local v0    # "e":Ljava/lang/Exception;
    //         :cond_1
    //         invoke-virtual {p1}, Landroid/view/View;->onStartTemporaryDetach()V
    //         goto :goto_0
    */

    public fun getAccessibilityLiveRegion(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAccessibilityNodeProvider(view: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getAlpha(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/high16 v0, 0x3f800000    # 1.0f
    //         return v0
    */

    public fun getElevation(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getFitsSystemWindows(view: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getFrameTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-wide/16 v0, 0xa
    //         return-wide v0
    */

    public fun getImportantForAccessibility(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getLabelFor(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getLayerType(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getLayoutDirection(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getMeasuredHeightAndState(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
    //         move-result v0
    //         return v0
    */

    public fun getMeasuredState(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getMeasuredWidthAndState(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
    //         move-result v0
    //         return v0
    */

    public fun getMinimumHeight(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getMinimumWidth(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getOverScrollMode(v: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x2
    //         return v0
    */

    public fun getPaddingEnd(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I
    //         move-result v0
    //         return v0
    */

    public fun getPaddingStart(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I
    //         move-result v0
    //         return v0
    */

    public fun getParentForAccessibility(view: android.view.View): android.view.ViewParent { return TODO("body: (Landroid/view/View;)Landroid/view/ViewParent;") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPivotX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getPivotY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getRotation(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getRotationX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getRotationY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getScaleX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getScaleY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getTransitionName(view: android.view.View): String { return TODO("body: (Landroid/view/View;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getTranslationX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getTranslationY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getTranslationZ(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getWindowSystemUiVisibility(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun hasAccessibilityDelegate(v: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun hasTransientState(view: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isOpaque(view: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         .local v0, "bg":Landroid/graphics/drawable/Drawable;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
    //         move-result v2
    //         const/4 v3, -0x1
    //         if-ne v2, v3, :cond_0
    //         const/4 v1, 0x1
    //         :cond_0
    //         return v1
    */

    public fun jumpDrawablesToCurrentState(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onInitializeAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(v: android.view.View, info: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPopulateAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun performAccessibilityAction(view: android.view.View, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (Landroid/view/View;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun postInvalidateOnAnimation(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1}, Landroid/view/View;->invalidate()V
    //         return-void
    */

    public fun postInvalidateOnAnimation(view: android.view.View, left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->invalidate(IIII)V
    //         return-void
    */

    public fun postOnAnimation(view: android.view.View, action: Runnable) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->getFrameTime()J
    //         move-result-wide v0
    //         invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    //         return-void
    */

    public fun postOnAnimationDelayed(view: android.view.View, action: Runnable, delayMillis: Long) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;J)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->getFrameTime()J
    //         move-result-wide v0
    //         add-long/2addr v0, p3
    //         invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    //         return-void
    */

    public fun requestApplyInsets(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun resolveSizeAndState(size: Int, measureSpec: Int, childMeasuredState: Int): Int { return TODO("body: (III)I") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/view/View;->resolveSize(II)I
    //         move-result v0
    //         return v0
    */

    public fun setAccessibilityDelegate(v: android.view.View, delegate: android.support.v4.view.AccessibilityDelegateCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setAccessibilityLiveRegion(view: android.view.View, mode: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setAlpha(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setChildrenDrawingOrderEnabled(viewGroup: android.view.ViewGroup, enabled: Boolean) { /* TODO(body): (Landroid/view/ViewGroup;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setElevation(view: android.view.View, elevation: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setHasTransientState(view: android.view.View, hasTransientState: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setImportantForAccessibility(view: android.view.View, mode: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setLabelFor(view: android.view.View, id: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setLayerPaint(view: android.view.View, p: android.graphics.Paint) { /* TODO(body): (Landroid/view/View;Landroid/graphics/Paint;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setLayerType(view: android.view.View, layerType: Int, paint: android.graphics.Paint) { /* TODO(body): (Landroid/view/View;ILandroid/graphics/Paint;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setLayoutDirection(view: android.view.View, layoutDirection: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setOnApplyWindowInsetsListener(view: android.view.View, listener: android.support.v4.view.OnApplyWindowInsetsListener) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/OnApplyWindowInsetsListener;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setOverScrollMode(v: android.view.View, mode: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPaddingRelative(view: android.view.View, start: Int, top: Int, end: Int, bottom: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->setPadding(IIII)V
    //         return-void
    */

    public fun setPivotX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPivotY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setRotation(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setRotationX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setRotationY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setScaleX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setScaleY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setTransitionName(view: android.view.View, transitionName: String) { /* TODO(body): (Landroid/view/View;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setTranslationX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setTranslationY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setTranslationZ(view: android.view.View, translationZ: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
