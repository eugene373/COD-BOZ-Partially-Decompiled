package android.support.v4.widget

// Auto-emitted from smali source: CursorAdapter.java.
// 11 fields, 23 methods.

open class CursorAdapter: android.widget.BaseAdapter(), android.widget.Filterable, android.support.v4.widget.CursorFilter.CursorFilterClient {
    protected var mAutoRequery: Boolean
    protected var mChangeObserver: android.support.v4.widget.CursorAdapter.ChangeObserver
    protected var mContext: android.content.Context
    protected var mCursor: android.database.Cursor
    protected var mCursorFilter: android.support.v4.widget.CursorFilter
    protected var mDataSetObserver: android.database.DataSetObserver
    protected var mDataValid: Boolean
    protected var mFilterQueryProvider: android.widget.FilterQueryProvider
    protected var mRowIDColumn: Int

    public constructor(context: android.content.Context, c: android.database.Cursor)

    public constructor(context: android.content.Context, c: android.database.Cursor, flags: Int)

    public constructor(context: android.content.Context, c: android.database.Cursor, autoRequery: Boolean)

    public fun bindView(p0: android.view.View, p1: android.content.Context, p2: android.database.Cursor)

    public fun changeCursor(cursor: android.database.Cursor) { /* TODO(body): (Landroid/database/Cursor;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/CursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;
    //         move-result-object v0
    //         .local v0, "old":Landroid/database/Cursor;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         return-void
    */

    public fun convertToString(cursor: android.database.Cursor): CharSequence { return TODO("body: (Landroid/database/Cursor;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getCursor(): android.database.Cursor { return TODO("body: ()Landroid/database/Cursor;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         return-object v0
    */

    public fun getDropDownView(position: Int, convertView: android.view.View, parent: android.view.ViewGroup): android.view.View { return TODO("body: (ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         iget-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
    //         if-nez p2, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-virtual {p0, v1, v2, p3}, Landroid/support/v4/widget/CursorAdapter;->newDropDownView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "v":Landroid/view/View;
    //         :goto_0
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/CursorAdapter;->bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    //         .end local v0    # "v":Landroid/view/View;
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         move-object v0, p2
    //         .restart local v0    # "v":Landroid/view/View;
    //         goto :goto_0
    //         .end local v0    # "v":Landroid/view/View;
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun getFilter(): android.widget.Filter { return TODO("body: ()Landroid/widget/Filter;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursorFilter:Landroid/support/v4/widget/CursorFilter;
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/support/v4/widget/CursorFilter;
    //         invoke-direct {v0, p0}, Landroid/support/v4/widget/CursorFilter;-><init>(Landroid/support/v4/widget/CursorFilter$CursorFilterClient;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursorFilter:Landroid/support/v4/widget/CursorFilter;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursorFilter:Landroid/support/v4/widget/CursorFilter;
    //         return-object v0
    */

    public fun getFilterQueryProvider(): android.widget.FilterQueryProvider { return TODO("body: ()Landroid/widget/FilterQueryProvider;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
    //         return-object v0
    */

    public fun getItem(position: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getItemId(position: Int): Long { return TODO("body: (I)J") }
    /*
    //         .locals 3
    //         const-wide/16 v0, 0x0
    //         iget-boolean v2, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v2, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         iget v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
    //         invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J
    //         move-result-wide v0
    //         :cond_0
    //         return-wide v0
    */

    public fun getView(position: Int, convertView: android.view.View, parent: android.view.ViewGroup): android.view.View { return TODO("body: (ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 4
    //         iget-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         const-string v2, "this should only be called when the cursor is valid"
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "couldn\'t move cursor to position "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_1
    //         if-nez p2, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-virtual {p0, v1, v2, p3}, Landroid/support/v4/widget/CursorAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "v":Landroid/view/View;
    //         :goto_0
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/CursorAdapter;->bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    //         return-object v0
    //         .end local v0    # "v":Landroid/view/View;
    //         :cond_2
    //         move-object v0, p2
    //         .restart local v0    # "v":Landroid/view/View;
    //         goto :goto_0
    */

    public fun hasStableIds(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    fun init(context: android.content.Context, c: android.database.Cursor, flags: Int) { /* TODO(body): (Landroid/content/Context;Landroid/database/Cursor;I)V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         const/4 v3, 0x0
    //         const/4 v0, 0x1
    //         and-int/lit8 v2, p3, 0x1
    //         if-ne v2, v0, :cond_2
    //         or-int/lit8 p3, p3, 0x2
    //         iput-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mAutoRequery:Z
    //         :goto_0
    //         if-eqz p2, :cond_3
    //         .local v0, "cursorPresent":Z
    //         :goto_1
    //         iput-object p2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         iput-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
    //         if-eqz v0, :cond_4
    //         const-string v1, "_id"
    //         invoke-interface {p2, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
    //         move-result v1
    //         :goto_2
    //         iput v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
    //         and-int/lit8 v1, p3, 0x2
    //         const/4 v2, 0x2
    //         if-ne v1, v2, :cond_5
    //         new-instance v1, Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         invoke-direct {v1, p0}, Landroid/support/v4/widget/CursorAdapter$ChangeObserver;-><init>(Landroid/support/v4/widget/CursorAdapter;)V
    //         iput-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         new-instance v1, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;
    //         invoke-direct {v1, p0, v3}, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;-><init>(Landroid/support/v4/widget/CursorAdapter;Landroid/support/v4/widget/CursorAdapter$1;)V
    //         iput-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         :goto_3
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         invoke-interface {p2, v1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         invoke-interface {p2, v1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
    //         :cond_1
    //         return-void
    //         .end local v0    # "cursorPresent":Z
    //         :cond_2
    //         iput-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mAutoRequery:Z
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_1
    //         .restart local v0    # "cursorPresent":Z
    //         :cond_4
    //         const/4 v1, -0x1
    //         goto :goto_2
    //         :cond_5
    //         iput-object v3, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         iput-object v3, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         goto :goto_3
    */

    protected fun init(context: android.content.Context, c: android.database.Cursor, autoRequery: Boolean) { /* TODO(body): (Landroid/content/Context;Landroid/database/Cursor;Z)V */ }
    /*
    //         .locals 1
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/widget/CursorAdapter;->init(Landroid/content/Context;Landroid/database/Cursor;I)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x2
    //         goto :goto_0
    */

    public fun newDropDownView(context: android.content.Context, cursor: android.database.Cursor, parent: android.view.ViewGroup): android.view.View { return TODO("body: (Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/widget/CursorAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newView(p0: android.content.Context, p1: android.database.Cursor, p2: android.view.ViewGroup): android.view.View

    protected fun onContentChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mAutoRequery:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v0}, Landroid/database/Cursor;->requery()Z
    //         move-result v0
    //         iput-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         :cond_0
    //         return-void
    */

    public fun runQueryOnBackgroundThread(constraint: CharSequence): android.database.Cursor { return TODO("body: (Ljava/lang/CharSequence;)Landroid/database/Cursor;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
    //         invoke-interface {v0, p1}, Landroid/widget/FilterQueryProvider;->runQuery(Ljava/lang/CharSequence;)Landroid/database/Cursor;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         goto :goto_0
    */

    public fun setFilterQueryProvider(filterQueryProvider: android.widget.FilterQueryProvider) { /* TODO(body): (Landroid/widget/FilterQueryProvider;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
    //         return-void
    */

    public fun swapCursor(newCursor: android.database.Cursor): android.database.Cursor { return TODO("body: (Landroid/database/Cursor;)Landroid/database/Cursor;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         if-ne p1, v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         .local v0, "oldCursor":Landroid/database/Cursor;
    //         if-eqz v0, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterContentObserver(Landroid/database/ContentObserver;)V
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    //         :cond_2
    //         iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
    //         if-eqz p1, :cond_5
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         if-eqz v1, :cond_3
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
    //         invoke-interface {p1, v1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V
    //         :cond_3
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         if-eqz v1, :cond_4
    //         iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
    //         invoke-interface {p1, v1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
    //         :cond_4
    //         const-string v1, "_id"
    //         invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
    //         move-result v1
    //         iput v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetChanged()V
    //         goto :goto_0
    //         :cond_5
    //         const/4 v1, -0x1
    //         iput v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetInvalidated()V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val FLAG_AUTO_REQUERY: Int = 0x1
    @JvmField public val FLAG_REGISTER_CONTENT_OBSERVER: Int = 0x2
    }
}
