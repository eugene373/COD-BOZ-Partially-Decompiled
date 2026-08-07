package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityRecordCompat.java.
// 2 fields, 51 methods.

open class AccessibilityRecordCompat {
    private val mRecord: Object

    public constructor(record: Object)

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
    //         check-cast v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         .local v0, "other":Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         iget-object v3, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         if-nez v3, :cond_4
    //         iget-object v3, v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         if-eqz v3, :cond_0
    //         move v1, v2
    //         goto :goto_0
    //         :cond_4
    //         iget-object v3, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         iget-object v4, v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         move v1, v2
    //         goto :goto_0
    */

    public fun getAddedCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getAddedCount(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getBeforeText(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getBeforeText(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getClassName(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getClassName(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getContentDescription(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getContentDescription(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCurrentItemIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getCurrentItemIndex(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getFromIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getFromIndex(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getImpl(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getItemCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getItemCount(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getMaxScrollX(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getMaxScrollX(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getMaxScrollY(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getMaxScrollY(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getParcelableData(): android.os.Parcelable { return TODO("body: ()Landroid/os/Parcelable;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getParcelableData(Ljava/lang/Object;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRemovedCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getRemovedCount(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getScrollX(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getScrollX(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getScrollY(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getScrollY(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getSource(): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getSource(Ljava/lang/Object;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getText(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/CharSequence;",
    //                 ">;"
    //             }
    //         .end annotation
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getText(Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getToIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getToIndex(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getWindowId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->getWindowId(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun isChecked(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->isChecked(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->isEnabled(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isFullScreen(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->isFullScreen(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isPassword(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->isPassword(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isScrollable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->isScrollable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun recycle() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->recycle(Ljava/lang/Object;)V
    //         return-void
    */

    public fun setAddedCount(addedCount: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setAddedCount(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setBeforeText(beforeText: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setBeforeText(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setChecked(isChecked: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setChecked(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setClassName(className: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setClassName(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setContentDescription(contentDescription: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setContentDescription(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setCurrentItemIndex(currentItemIndex: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setCurrentItemIndex(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setEnabled(isEnabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setEnabled(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setFromIndex(fromIndex: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setFromIndex(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setFullScreen(isFullScreen: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setFullScreen(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setItemCount(itemCount: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setItemCount(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setMaxScrollX(maxScrollX: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setMaxScrollX(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setMaxScrollY(maxScrollY: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setMaxScrollY(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setParcelableData(parcelableData: android.os.Parcelable) { /* TODO(body): (Landroid/os/Parcelable;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setParcelableData(Ljava/lang/Object;Landroid/os/Parcelable;)V
    //         return-void
    */

    public fun setPassword(isPassword: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setPassword(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setRemovedCount(removedCount: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setRemovedCount(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setScrollX(scrollX: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setScrollX(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setScrollY(scrollY: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setScrollY(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setScrollable(scrollable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setScrollable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setSource(source: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setSource(Ljava/lang/Object;Landroid/view/View;)V
    //         return-void
    */

    public fun setSource(root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setSource(Ljava/lang/Object;Landroid/view/View;I)V
    //         return-void
    */

    public fun setToIndex(toIndex: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->setToIndex(Ljava/lang/Object;I)V
    //         return-void
    */

    companion object {
    private val IMPL: android.support.v4.view.accessibility.AccessibilityRecordCompat.AccessibilityRecordImpl = null!!

    public @JvmStatic fun obtain(): android.support.v4.view.accessibility.AccessibilityRecordCompat { return TODO("body: ()Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         sget-object v1, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         invoke-interface {v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->obtain()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;-><init>(Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun obtain(record: android.support.v4.view.accessibility.AccessibilityRecordCompat): android.support.v4.view.accessibility.AccessibilityRecordCompat { return TODO("body: (Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         sget-object v1, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;
    //         iget-object v2, p0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->mRecord:Ljava/lang/Object;
    //         invoke-interface {v1, v2}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat$AccessibilityRecordImpl;->obtain(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;-><init>(Ljava/lang/Object;)V
    //         return-object v0
    */

    }
}
