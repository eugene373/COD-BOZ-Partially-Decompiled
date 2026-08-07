package android.support.v4.widget

// Auto-emitted from smali source: ExploreByTouchHelper.java.
// 11 fields, 30 methods.

open class ExploreByTouchHelper: android.support.v4.view.AccessibilityDelegateCompat() {
    private var mFocusedVirtualViewId: Int
    private var mHoveredVirtualViewId: Int
    private val mManager: android.view.accessibility.AccessibilityManager
    private var mNodeProvider: android.support.v4.widget.ExploreByTouchHelper.ExploreByTouchNodeProvider
    private val mTempGlobalRect: IntArray
    private val mTempParentRect: android.graphics.Rect
    private val mTempScreenRect: android.graphics.Rect
    private val mTempVisibleRect: android.graphics.Rect
    private val mView: android.view.View

    public constructor(forView: android.view.View)

    private fun clearAccessibilityFocus(virtualViewId: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->isAccessibilityFocused(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/high16 v0, -0x80000000
    //         iput v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
    //         iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->invalidate()V
    //         const/high16 v0, 0x10000
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun createEvent(virtualViewId: Int, eventType: Int): android.view.accessibility.AccessibilityEvent { return TODO("body: (II)Landroid/view/accessibility/AccessibilityEvent;") }
    /*
    //         .locals 1
    //         packed-switch p1, :pswitch_data_0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEventForChild(II)Landroid/view/accessibility/AccessibilityEvent;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         invoke-direct {p0, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEventForHost(I)Landroid/view/accessibility/AccessibilityEvent;
    //         move-result-object v0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch -0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    private fun createEventForChild(virtualViewId: Int, eventType: Int): android.view.accessibility.AccessibilityEvent { return TODO("body: (II)Landroid/view/accessibility/AccessibilityEvent;") }
    /*
    //         .locals 4
    //         invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;
    //         move-result-object v0
    //         .local v0, "event":Landroid/view/accessibility/AccessibilityEvent;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEnabled(Z)V
    //         sget-object v2, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;
    //         invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPopulateEventForVirtualView(ILandroid/view/accessibility/AccessibilityEvent;)V
    //         invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/List;->isEmpty()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getContentDescription()Ljava/lang/CharSequence;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         new-instance v2, Ljava/lang/RuntimeException;
    //         const-string v3, "Callbacks must add text or a content description in populateEventForVirtualViewId()"
    //         invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         move-result-object v1
    //         .local v1, "record":Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v1, v2, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setSource(Landroid/view/View;I)V
    //         return-object v0
    */

    private fun createEventForHost(eventType: Int): android.view.accessibility.AccessibilityEvent { return TODO("body: (I)Landroid/view/accessibility/AccessibilityEvent;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;
    //         move-result-object v0
    //         .local v0, "event":Landroid/view/accessibility/AccessibilityEvent;
    //         iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-static {v1, v0}, Landroid/support/v4/view/ViewCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-object v0
    */

    private fun createNode(virtualViewId: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 1
    //         packed-switch p1, :pswitch_data_0
    //         invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNodeForChild(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         invoke-direct {p0}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNodeForHost()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch -0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    private fun createNodeForChild(virtualViewId: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         const/4 v6, 0x1
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v1
    //         .local v1, "node":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setEnabled(Z)V
    //         sget-object v4, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPopulateNodeForVirtualView(ILandroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    //         invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getText()Ljava/lang/CharSequence;
    //         move-result-object v4
    //         if-nez v4, :cond_0
    //         invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getContentDescription()Ljava/lang/CharSequence;
    //         move-result-object v4
    //         if-nez v4, :cond_0
    //         new-instance v4, Ljava/lang/RuntimeException;
    //         const-string v5, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
    //         invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v4
    //         :cond_0
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInParent(Landroid/graphics/Rect;)V
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
    //         invoke-virtual {v4}, Landroid/graphics/Rect;->isEmpty()Z
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         new-instance v4, Ljava/lang/RuntimeException;
    //         const-string v5, "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
    //         invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v4
    //         :cond_1
    //         invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActions()I
    //         move-result v0
    //         .local v0, "actions":I
    //         and-int/lit8 v4, v0, 0x40
    //         if-eqz v4, :cond_2
    //         new-instance v4, Ljava/lang/RuntimeException;
    //         const-string v5, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
    //         invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v4
    //         :cond_2
    //         and-int/lit16 v4, v0, 0x80
    //         if-eqz v4, :cond_3
    //         new-instance v4, Ljava/lang/RuntimeException;
    //         const-string v5, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
    //         invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v4
    //         :cond_3
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setPackageName(Ljava/lang/CharSequence;)V
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v1, v4, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSource(Landroid/view/View;I)V
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V
    //         iget v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
    //         if-ne v4, p1, :cond_5
    //         invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V
    //         const/16 v4, 0x80
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
    //         :goto_0
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
    //         invoke-direct {p0, v4}, Landroid/support/v4/widget/ExploreByTouchHelper;->intersectVisibleToUser(Landroid/graphics/Rect;)Z
    //         move-result v4
    //         if-eqz v4, :cond_4
    //         invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setVisibleToUser(Z)V
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V
    //         :cond_4
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         iget-object v5, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I
    //         invoke-virtual {v4, v5}, Landroid/view/View;->getLocationOnScreen([I)V
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I
    //         aget v2, v4, v7
    //         .local v2, "offsetX":I
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I
    //         aget v3, v4, v6
    //         .local v3, "offsetY":I
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;
    //         iget-object v5, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
    //         invoke-virtual {v4, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;
    //         invoke-virtual {v4, v2, v3}, Landroid/graphics/Rect;->offset(II)V
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInScreen(Landroid/graphics/Rect;)V
    //         return-object v1
    //         .end local v2    # "offsetX":I
    //         .end local v3    # "offsetY":I
    //         :cond_5
    //         invoke-virtual {v1, v7}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V
    //         const/16 v4, 0x40
    //         invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
    //         goto :goto_0
    */

    private fun createNodeForHost(): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 6
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-static {v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v2
    //         .local v2, "node":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-static {v4, v2}, Landroid/support/v4/view/ViewCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    //         new-instance v3, Ljava/util/LinkedList;
    //         invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V
    //         .local v3, "virtualViewIds":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/Integer;>;"
    //         invoke-virtual {p0, v3}, Landroid/support/v4/widget/ExploreByTouchHelper;->getVisibleVirtualViews(Ljava/util/List;)V
    //         invoke-virtual {v3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         .local v1, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         .local v0, "childVirtualViewId":Ljava/lang/Integer;
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v5
    //         invoke-virtual {v2, v4, v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addChild(Landroid/view/View;I)V
    //         goto :goto_0
    //         .end local v0    # "childVirtualViewId":Ljava/lang/Integer;
    //         :cond_0
    //         return-object v2
    */

    private fun intersectVisibleToUser(localRect: android.graphics.Rect): Boolean { return TODO("body: (Landroid/graphics/Rect;)Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v2
    //         :cond_1
    //         iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v3}, Landroid/view/View;->getWindowVisibility()I
    //         move-result v3
    //         if-nez v3, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
    //         move-result-object v1
    //         .local v1, "viewParent":Landroid/view/ViewParent;
    //         :goto_1
    //         instance-of v3, v1, Landroid/view/View;
    //         if-eqz v3, :cond_2
    //         move-object v0, v1
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getAlpha(Landroid/view/View;)F
    //         move-result v3
    //         const/4 v4, 0x0
    //         cmpg-float v3, v3, v4
    //         if-lez v3, :cond_0
    //         invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
    //         move-result v3
    //         if-nez v3, :cond_0
    //         invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
    //         move-result-object v1
    //         goto :goto_1
    //         .end local v0    # "view":Landroid/view/View;
    //         :cond_2
    //         if-eqz v1, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;
    //         invoke-virtual {v3, v4}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;
    //         invoke-virtual {p1, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z
    //         move-result v2
    //         goto :goto_0
    */

    private fun isAccessibilityFocused(virtualViewId: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
    //         if-ne v0, p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun manageFocusForChild(virtualViewId: Int, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (IILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         sparse-switch p2, :sswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->requestAccessibilityFocus(I)Z
    //         move-result v0
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->clearAccessibilityFocus(I)Z
    //         move-result v0
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x40 -> :sswitch_0
    //             0x80 -> :sswitch_1
    //         .end sparse-switch
    */

    private fun performAction(virtualViewId: Int, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (IILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         packed-switch p1, :pswitch_data_0
    //         invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performActionForChild(IILandroid/os/Bundle;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         invoke-direct {p0, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performActionForHost(ILandroid/os/Bundle;)Z
    //         move-result v0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch -0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    private fun performActionForChild(virtualViewId: Int, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (IILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         sparse-switch p2, :sswitch_data_0
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPerformActionForVirtualView(IILandroid/os/Bundle;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->manageFocusForChild(IILandroid/os/Bundle;)Z
    //         move-result v0
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x40 -> :sswitch_0
    //             0x80 -> :sswitch_0
    //         .end sparse-switch
    */

    private fun performActionForHost(action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-static {v0, p1, p2}, Landroid/support/v4/view/ViewCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    private fun requestAccessibilityFocus(virtualViewId: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
    //         invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
    //         invoke-static {v1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->isAccessibilityFocused(I)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iput p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
    //         iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->invalidate()V
    //         const v0, 0x8000
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    private fun updateHoveredVirtualView(virtualViewId: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I
    //         if-ne v1, p1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I
    //         .local v0, "previousVirtualViewId":I
    //         iput p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I
    //         const/16 v1, 0x80
    //         invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
    //         const/16 v1, 0x100
    //         invoke-virtual {p0, v0, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
    //         goto :goto_0
    */

    public fun dispatchHoverEvent(event: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/high16 v5, -0x80000000
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
    //         invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
    //         invoke-static {v3}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
    //         move-result v3
    //         if-nez v3, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v2
    //         :cond_1
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v3
    //         packed-switch v3, :pswitch_data_0
    //         :pswitch_0
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    //         move-result v3
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    //         move-result v4
    //         invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/ExploreByTouchHelper;->getVirtualViewAt(FF)I
    //         move-result v0
    //         .local v0, "virtualViewId":I
    //         invoke-direct {p0, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->updateHoveredVirtualView(I)V
    //         if-eq v0, v5, :cond_2
    //         :goto_1
    //         move v2, v1
    //         goto :goto_0
    //         :cond_2
    //         move v1, v2
    //         goto :goto_1
    //         .end local v0    # "virtualViewId":I
    //         :pswitch_2
    //         iget v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
    //         if-eq v3, v5, :cond_0
    //         invoke-direct {p0, v5}, Landroid/support/v4/widget/ExploreByTouchHelper;->updateHoveredVirtualView(I)V
    //         move v2, v1
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x7
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun getAccessibilityNodeProvider(host: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;-><init>(Landroid/support/v4/widget/ExploreByTouchHelper;Landroid/support/v4/widget/ExploreByTouchHelper$1;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
    //         return-object v0
    */

    public fun getFocusedVirtualView(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
    //         return v0
    */

    protected fun getVirtualViewAt(p0: Float, p1: Float): Int

    protected fun getVisibleVirtualViews(p0: java.util.List)

    public fun invalidateRoot() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, -0x1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->invalidateVirtualView(I)V
    //         return-void
    */

    public fun invalidateVirtualView(virtualViewId: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         const/16 v0, 0x800
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
    //         return-void
    */

    protected fun onPerformActionForVirtualView(p0: Int, p1: Int, p2: android.os.Bundle): Boolean

    protected fun onPopulateEventForVirtualView(p0: Int, p1: android.view.accessibility.AccessibilityEvent)

    protected fun onPopulateNodeForVirtualView(p0: Int, p1: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat)

    public fun sendEventForVirtualView(virtualViewId: Int, eventType: Int): Boolean { return TODO("body: (II)Z") }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         const/high16 v3, -0x80000000
    //         if-eq p1, v3, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
    //         invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
    //         move-result v3
    //         if-nez v3, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v2
    //         :cond_1
    //         iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
    //         move-result-object v1
    //         .local v1, "parent":Landroid/view/ViewParent;
    //         if-eqz v1, :cond_0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEvent(II)Landroid/view/accessibility/AccessibilityEvent;
    //         move-result-object v0
    //         .local v0, "event":Landroid/view/accessibility/AccessibilityEvent;
    //         iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
    //         invoke-static {v1, v2, v0}, Landroid/support/v4/view/ViewParentCompat;->requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v2
    //         goto :goto_0
    */

    companion object {
    private val DEFAULT_CLASS_NAME: String = null!!
    @JvmField public val INVALID_ID: Int = 0
    }
}
