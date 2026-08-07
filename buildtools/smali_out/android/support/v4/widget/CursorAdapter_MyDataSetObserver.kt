package android.support.v4.widget

// Auto-emitted from smali source: CursorAdapter.java.
// 1 fields, 4 methods.

open class CursorAdapter_MyDataSetObserver: android.database.DataSetObserver() {
    val this$0: android.support.v4.widget.CursorAdapter

    private constructor(p0: android.support.v4.widget.CursorAdapter)

    constructor(x0: android.support.v4.widget.CursorAdapter, x1: android.support.v4.widget.CursorAdapter.1)

    public fun onChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
    //         const/4 v1, 0x1
    //         iput-boolean v1, v0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetChanged()V
    //         return-void
    */

    public fun onInvalidated() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
    //         const/4 v1, 0x0
    //         iput-boolean v1, v0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetInvalidated()V
    //         return-void
    */

}
