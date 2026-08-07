package android.support.v4.view

// Auto-emitted from smali source: ViewCompat.java.
// 2 fields, 10 methods.

open class ViewCompat_ICSViewCompatImpl: android.support.v4.view.ViewCompat.HCViewCompatImpl() {
    constructor()

    public fun animate(view: android.view.View): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mViewPropertyAnimatorCompatMap:Ljava/util/WeakHashMap;
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/util/WeakHashMap;
    //         invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V
    //         iput-object v1, p0, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mViewPropertyAnimatorCompatMap:Ljava/util/WeakHashMap;
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mViewPropertyAnimatorCompatMap:Ljava/util/WeakHashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         .local v0, "vpa":Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         .end local v0    # "vpa":Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-direct {v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;-><init>(Landroid/view/View;)V
    //         .restart local v0    # "vpa":Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mViewPropertyAnimatorCompatMap:Ljava/util/WeakHashMap;
    //         invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         return-object v0
    */

    public fun canScrollHorizontally(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompatICS;->canScrollHorizontally(Landroid/view/View;I)Z
    //         move-result v0
    //         return v0
    */

    public fun canScrollVertically(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompatICS;->canScrollVertically(Landroid/view/View;I)Z
    //         move-result v0
    //         return v0
    */

    public fun hasAccessibilityDelegate(v: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         sget-boolean v3, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->accessibilityDelegateCheckFailed:Z
    //         if-eqz v3, :cond_0
    //         :goto_0
    //         return v2
    //         :cond_0
    //         sget-object v3, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mAccessibilityDelegateField:Ljava/lang/reflect/Field;
    //         if-nez v3, :cond_1
    //         :try_start_0
    //         const-class v3, Landroid/view/View;
    //         const-string v4, "mAccessibilityDelegate"
    //         invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v3
    //         sput-object v3, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mAccessibilityDelegateField:Ljava/lang/reflect/Field;
    //         sget-object v3, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mAccessibilityDelegateField:Ljava/lang/reflect/Field;
    //         const/4 v4, 0x1
    //         invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :try_start_1
    //         sget-object v3, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->mAccessibilityDelegateField:Ljava/lang/reflect/Field;
    //         invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_1
    //         .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    //         move-result-object v3
    //         if-eqz v3, :cond_2
    //         :goto_1
    //         move v2, v1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "t":Ljava/lang/Throwable;
    //         sput-boolean v1, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->accessibilityDelegateCheckFailed:Z
    //         goto :goto_0
    //         .end local v0    # "t":Ljava/lang/Throwable;
    //         :cond_2
    //         move v1, v2
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         .restart local v0    # "t":Ljava/lang/Throwable;
    //         sput-boolean v1, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;->accessibilityDelegateCheckFailed:Z
    //         goto :goto_0
    */

    public fun onInitializeAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompatICS;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(v: android.view.View, info: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompatICS;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ljava/lang/Object;)V
    //         return-void
    */

    public fun onPopulateAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompatICS;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun setAccessibilityDelegate(v: android.view.View, delegate: android.support.v4.view.AccessibilityDelegateCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->getBridge()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompatICS;->setAccessibilityDelegate(Landroid/view/View;Ljava/lang/Object;)V
    //         return-void
    */

    companion object {
    var accessibilityDelegateCheckFailed: Boolean
    var mAccessibilityDelegateField: java.lang.reflect.Field
    }
}
