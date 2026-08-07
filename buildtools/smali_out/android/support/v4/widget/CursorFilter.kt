package android.support.v4.widget

// Auto-emitted from smali source: CursorFilter.java.
// 1 fields, 4 methods.

open class CursorFilter: android.widget.Filter() {
    var mClient: android.support.v4.widget.CursorFilter.CursorFilterClient

    constructor(client: android.support.v4.widget.CursorFilter.CursorFilterClient)

    public fun convertResultToString(resultValue: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
    //         check-cast p1, Landroid/database/Cursor;
    //         .end local p1    # "resultValue":Ljava/lang/Object;
    //         invoke-interface {v0, p1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun performFiltering(constraint: CharSequence): android.widget.Filter.FilterResults { return TODO("body: (Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;") }
    /*
    //         .locals 3
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
    //         invoke-interface {v2, p1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->runQueryOnBackgroundThread(Ljava/lang/CharSequence;)Landroid/database/Cursor;
    //         move-result-object v0
    //         .local v0, "cursor":Landroid/database/Cursor;
    //         new-instance v1, Landroid/widget/Filter$FilterResults;
    //         invoke-direct {v1}, Landroid/widget/Filter$FilterResults;-><init>()V
    //         .local v1, "results":Landroid/widget/Filter$FilterResults;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    //         move-result v2
    //         iput v2, v1, Landroid/widget/Filter$FilterResults;->count:I
    //         iput-object v0, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v2, 0x0
    //         iput v2, v1, Landroid/widget/Filter$FilterResults;->count:I
    //         const/4 v2, 0x0
    //         iput-object v2, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
    //         goto :goto_0
    */

    protected fun publishResults(constraint: CharSequence, results: android.widget.Filter.FilterResults) { /* TODO(body): (Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
    //         invoke-interface {v1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->getCursor()Landroid/database/Cursor;
    //         move-result-object v0
    //         .local v0, "oldCursor":Landroid/database/Cursor;
    //         iget-object v1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
    //         if-eq v1, v0, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
    //         iget-object v1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
    //         check-cast v1, Landroid/database/Cursor;
    //         invoke-interface {v2, v1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->changeCursor(Landroid/database/Cursor;)V
    //         :cond_0
    //         return-void
    */

}
