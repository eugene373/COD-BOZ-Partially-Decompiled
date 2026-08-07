package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 34 fields, 79 methods.

open class AccessibilityNodeInfoCompat {
    private val mInfo: Object

    public constructor(info: Object)

    public fun addAction(action: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->addAction(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun addChild(child: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->addChild(Ljava/lang/Object;Landroid/view/View;)V
    //         return-void
    */

    public fun addChild(root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->addChild(Ljava/lang/Object;Landroid/view/View;I)V
    //         return-void
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-ne p0, p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         if-nez p1, :cond_2
    //         move v1, v2
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v4
    //         if-eq v3, v4, :cond_3
    //         move v1, v2
    //         goto :goto_0
    //         :cond_3
    //         move-object v0, p1
    //         check-cast v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         .local v0, "other":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         iget-object v3, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         if-nez v3, :cond_4
    //         iget-object v3, v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         if-eqz v3, :cond_0
    //         move v1, v2
    //         goto :goto_0
    //         :cond_4
    //         iget-object v3, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         iget-object v4, v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         move v1, v2
    //         goto :goto_0
    */

    public fun findAccessibilityNodeInfosByText(text: String): java.util.List { return TODO("body: (Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 7
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    //         .local v4, "result":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;>;"
    //         sget-object v5, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v6, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v5, v6, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->findAccessibilityNodeInfosByText(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v3
    //         .local v3, "infos":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    //         invoke-interface {v3}, Ljava/util/List;->size()I
    //         move-result v2
    //         .local v2, "infoCount":I
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "info":Ljava/lang/Object;
    //         new-instance v5, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         invoke-direct {v5, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;-><init>(Ljava/lang/Object;)V
    //         invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         .end local v1    # "info":Ljava/lang/Object;
    //         :cond_0
    //         return-object v4
    */

    public fun findFocus(focus: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->findFocus(Ljava/lang/Object;I)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun focusSearch(direction: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->focusSearch(Ljava/lang/Object;I)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getActionList(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityActionCompat;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    //         .local v4, "result":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityActionCompat;>;"
    //         sget-object v5, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v6, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v5, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getActionList(Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v2
    //         .local v2, "actions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v1
    //         .local v1, "actionCount":I
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         :goto_0
    //         if-ge v3, v1, :cond_0
    //         invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "action":Ljava/lang/Object;
    //         new-instance v5, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityActionCompat;
    //         const/4 v6, 0x0
    //         invoke-direct {v5, v0, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityActionCompat;-><init>(Ljava/lang/Object;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$1;)V
    //         invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v0    # "action":Ljava/lang/Object;
    //         :cond_0
    //         return-object v4
    */

    public fun getActions(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getActions(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getBoundsInParent(outBounds: android.graphics.Rect) { /* TODO(body): (Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getBoundsInParent(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun getBoundsInScreen(outBounds: android.graphics.Rect) { /* TODO(body): (Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getBoundsInScreen(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun getChild(index: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getChild(Ljava/lang/Object;I)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getChildCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getChildCount(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getClassName(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getClassName(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCollectionInfo(): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         sget-object v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v3, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionInfo(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "info":Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         new-instance v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;
    //         invoke-direct {v2, v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;-><init>(Ljava/lang/Object;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$1;)V
    //         move-object v1, v2
    //         goto :goto_0
    */

    public fun getCollectionItemInfo(): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         sget-object v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v3, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionItemInfo(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "info":Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         new-instance v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
    //         invoke-direct {v2, v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;-><init>(Ljava/lang/Object;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$1;)V
    //         move-object v1, v2
    //         goto :goto_0
    */

    public fun getContentDescription(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getContentDescription(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInfo(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getLiveRegion(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getLiveRegion(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getMovementGranularities(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getMovementGranularities(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getPackageName(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getPackageName(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParent(): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getParent(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRangeInfo(): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         sget-object v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v3, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getRangeInfo(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "info":Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         new-instance v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;
    //         invoke-direct {v2, v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;-><init>(Ljava/lang/Object;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$1;)V
    //         move-object v1, v2
    //         goto :goto_0
    */

    public fun getText(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getText(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getViewIdResourceName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getViewIdResourceName(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getWindowId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getWindowId(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun isAccessibilityFocused(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isAccessibilityFocused(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isCheckable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isCheckable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isChecked(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isChecked(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isClickable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isClickable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isEnabled(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isFocusable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isFocusable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isFocused(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isFocused(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isLongClickable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isLongClickable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isPassword(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isPassword(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isScrollable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isScrollable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isSelected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isSelected(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isVisibleToUser(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isVisibleToUser(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun performAction(action: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->performAction(Ljava/lang/Object;I)Z
    //         move-result v0
    //         return v0
    */

    public fun performAction(action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->performAction(Ljava/lang/Object;ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    public fun recycle() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->recycle(Ljava/lang/Object;)V
    //         return-void
    */

    public fun setAccessibilityFocused(focused: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setAccessibilityFocused(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setBoundsInParent(bounds: android.graphics.Rect) { /* TODO(body): (Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setBoundsInParent(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun setBoundsInScreen(bounds: android.graphics.Rect) { /* TODO(body): (Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setBoundsInScreen(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun setCheckable(checkable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setCheckable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setChecked(checked: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setChecked(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setClassName(className: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setClassName(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setClickable(clickable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setClickable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setCollectionInfo(collectionInfo: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         check-cast p1, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;
    //         .end local p1    # "collectionInfo":Ljava/lang/Object;
    //         iget-object v2, p1, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setCollectionInfo(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

    public fun setCollectionItemInfo(collectionItemInfo: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         check-cast p1, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
    //         .end local p1    # "collectionItemInfo":Ljava/lang/Object;
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->access$200(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;)Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setCollectionItemInfo(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

    public fun setContentDescription(contentDescription: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setContentDescription(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setEnabled(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setFocusable(focusable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setFocusable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setFocused(focused: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setFocused(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setLiveRegion(mode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setLiveRegion(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setLongClickable(longClickable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setLongClickable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setMovementGranularities(granularities: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setMovementGranularities(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setPackageName(packageName: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setPackageName(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setParent(parent: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setParent(Ljava/lang/Object;Landroid/view/View;)V
    //         return-void
    */

    public fun setParent(root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setParent(Ljava/lang/Object;Landroid/view/View;I)V
    //         return-void
    */

    public fun setPassword(password: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setPassword(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setScrollable(scrollable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setScrollable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setSelected(selected: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setSelected(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setSource(source: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setSource(Ljava/lang/Object;Landroid/view/View;)V
    //         return-void
    */

    public fun setSource(root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setSource(Ljava/lang/Object;Landroid/view/View;I)V
    //         return-void
    */

    public fun setText(text: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setText(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setViewIdResourceName(viewId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setViewIdResourceName(Ljava/lang/Object;Ljava/lang/String;)V
    //         return-void
    */

    public fun setVisibleToUser(visibleToUser: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->setVisibleToUser(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         .local v3, "builder":Ljava/lang/StringBuilder;
    //         invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         new-instance v2, Landroid/graphics/Rect;
    //         invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V
    //         .local v2, "bounds":Landroid/graphics/Rect;
    //         invoke-virtual {p0, v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInParent(Landroid/graphics/Rect;)V
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "; boundsInParent: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0, v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInScreen(Landroid/graphics/Rect;)V
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "; boundsInScreen: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v4, "; packageName: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getPackageName()Ljava/lang/CharSequence;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //         const-string v4, "; className: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getClassName()Ljava/lang/CharSequence;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //         const-string v4, "; text: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getText()Ljava/lang/CharSequence;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //         const-string v4, "; contentDescription: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getContentDescription()Ljava/lang/CharSequence;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //         const-string v4, "; viewId: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getViewIdResourceName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v4, "; checkable: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isCheckable()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; checked: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isChecked()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; focusable: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocusable()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; focused: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocused()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; selected: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isSelected()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; clickable: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isClickable()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; longClickable: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isLongClickable()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; enabled: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isEnabled()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v4, "; password: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isPassword()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "; scrollable: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isScrollable()Z
    //         move-result v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v4, "; ["
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActions()I
    //         move-result v1
    //         .local v1, "actionBits":I
    //         :cond_0
    //         :goto_0
    //         if-eqz v1, :cond_1
    //         const/4 v4, 0x1
    //         invoke-static {v1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I
    //         move-result v5
    //         shl-int v0, v4, v5
    //         .local v0, "action":I
    //         xor-int/lit8 v4, v0, -0x1
    //         and-int/2addr v1, v4
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActionSymbolicName(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         if-eqz v1, :cond_0
    //         const-string v4, ", "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         .end local v0    # "action":I
    //         :cond_1
    //         const-string v4, "]"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         return-object v4
    */

    companion object {
    @JvmField public val ACTION_ACCESSIBILITY_FOCUS: Int = 0x40
    @JvmField public val ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN: String = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
    @JvmField public val ACTION_ARGUMENT_HTML_ELEMENT_STRING: String = "ACTION_ARGUMENT_HTML_ELEMENT_STRING"
    @JvmField public val ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT: String = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
    @JvmField public val ACTION_ARGUMENT_SELECTION_END_INT: String = "ACTION_ARGUMENT_SELECTION_END_INT"
    @JvmField public val ACTION_ARGUMENT_SELECTION_START_INT: String = "ACTION_ARGUMENT_SELECTION_START_INT"
    @JvmField public val ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE: String = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
    @JvmField public val ACTION_CLEAR_ACCESSIBILITY_FOCUS: Int = 0x80
    @JvmField public val ACTION_CLEAR_FOCUS: Int = 0x2
    @JvmField public val ACTION_CLEAR_SELECTION: Int = 0x8
    @JvmField public val ACTION_CLICK: Int = 0x10
    @JvmField public val ACTION_COPY: Int = 0x4000
    @JvmField public val ACTION_CUT: Int = 0x10000
    @JvmField public val ACTION_FOCUS: Int = 0x1
    @JvmField public val ACTION_LONG_CLICK: Int = 0x20
    @JvmField public val ACTION_NEXT_AT_MOVEMENT_GRANULARITY: Int = 0x100
    @JvmField public val ACTION_NEXT_HTML_ELEMENT: Int = 0x400
    @JvmField public val ACTION_PASTE: Int = 0x8000
    @JvmField public val ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY: Int = 0x200
    @JvmField public val ACTION_PREVIOUS_HTML_ELEMENT: Int = 0x800
    @JvmField public val ACTION_SCROLL_BACKWARD: Int = 0x2000
    @JvmField public val ACTION_SCROLL_FORWARD: Int = 0x1000
    @JvmField public val ACTION_SELECT: Int = 0x4
    @JvmField public val ACTION_SET_SELECTION: Int = 0x20000
    @JvmField public val ACTION_SET_TEXT: Int = 0x200000
    @JvmField public val FOCUS_ACCESSIBILITY: Int = 0x2
    @JvmField public val FOCUS_INPUT: Int = 0x1
    private val IMPL: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl = null!!
    @JvmField public val MOVEMENT_GRANULARITY_CHARACTER: Int = 0x1
    @JvmField public val MOVEMENT_GRANULARITY_LINE: Int = 0x4
    @JvmField public val MOVEMENT_GRANULARITY_PAGE: Int = 0x10
    @JvmField public val MOVEMENT_GRANULARITY_PARAGRAPH: Int = 0x8
    @JvmField public val MOVEMENT_GRANULARITY_WORD: Int = 0x2

    private @JvmStatic fun getActionSymbolicName(action: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sparse-switch p0, :sswitch_data_0
    //         const-string v0, "ACTION_UNKNOWN"
    //         :goto_0
    //         return-object v0
    //         :sswitch_0
    //         const-string v0, "ACTION_FOCUS"
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "ACTION_CLEAR_FOCUS"
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "ACTION_SELECT"
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "ACTION_CLEAR_SELECTION"
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "ACTION_CLICK"
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "ACTION_LONG_CLICK"
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "ACTION_ACCESSIBILITY_FOCUS"
    //         goto :goto_0
    //         :sswitch_7
    //         const-string v0, "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
    //         goto :goto_0
    //         :sswitch_8
    //         const-string v0, "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"
    //         goto :goto_0
    //         :sswitch_9
    //         const-string v0, "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"
    //         goto :goto_0
    //         :sswitch_a
    //         const-string v0, "ACTION_NEXT_HTML_ELEMENT"
    //         goto :goto_0
    //         :sswitch_b
    //         const-string v0, "ACTION_PREVIOUS_HTML_ELEMENT"
    //         goto :goto_0
    //         :sswitch_c
    //         const-string v0, "ACTION_SCROLL_FORWARD"
    //         goto :goto_0
    //         :sswitch_d
    //         const-string v0, "ACTION_SCROLL_BACKWARD"
    //         goto :goto_0
    //         :sswitch_e
    //         const-string v0, "ACTION_CUT"
    //         goto :goto_0
    //         :sswitch_f
    //         const-string v0, "ACTION_COPY"
    //         goto :goto_0
    //         :sswitch_10
    //         const-string v0, "ACTION_PASTE"
    //         goto :goto_0
    //         :sswitch_11
    //         const-string v0, "ACTION_SET_SELECTION"
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_1
    //             0x4 -> :sswitch_2
    //             0x8 -> :sswitch_3
    //             0x10 -> :sswitch_4
    //             0x20 -> :sswitch_5
    //             0x40 -> :sswitch_6
    //             0x80 -> :sswitch_7
    //             0x100 -> :sswitch_8
    //             0x200 -> :sswitch_9
    //             0x400 -> :sswitch_a
    //             0x800 -> :sswitch_b
    //             0x1000 -> :sswitch_c
    //             0x2000 -> :sswitch_d
    //             0x4000 -> :sswitch_f
    //             0x8000 -> :sswitch_10
    //             0x10000 -> :sswitch_e
    //             0x20000 -> :sswitch_11
    //         .end sparse-switch
    */

    public @JvmStatic fun obtain(): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         invoke-interface {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->obtain()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtain(info: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->obtain(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtain(source: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->obtain(Landroid/view/View;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtain(root: android.view.View, virtualDescendantId: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (Landroid/view/View;I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->obtain(Landroid/view/View;I)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->wrapNonNullInstance(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun wrapNonNullInstance(object: Object): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         invoke-direct {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;-><init>(Ljava/lang/Object;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
