package android.support.v4.widget

// Auto-emitted from smali source: CursorAdapter.java.
// 1 fields, 3 methods.

open class CursorAdapter_ChangeObserver: android.database.ContentObserver() {
    val this$0: android.support.v4.widget.CursorAdapter

    public constructor(p0: android.support.v4.widget.CursorAdapter)

    public fun deliverSelfNotifications(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun onChange(selfChange: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$ChangeObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CursorAdapter;->onContentChanged()V
    //         return-void
    */

}
