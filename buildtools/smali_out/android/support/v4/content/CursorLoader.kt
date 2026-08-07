package android.support.v4.content

// Auto-emitted from smali source: CursorLoader.java.
// 7 fields, 22 methods.

open class CursorLoader: android.support.v4.content.AsyncTaskLoader() {
    var mCursor: android.database.Cursor
    val mObserver: android.support.v4.content.Loader.ForceLoadContentObserver
    var mProjection: Array<String>
    var mSelection: String
    var mSelectionArgs: Array<String>
    var mSortOrder: String
    var mUri: android.net.Uri

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, uri: android.net.Uri, projection: Array<String>, selection: String, selectionArgs: Array<String>, sortOrder: String)

    public fun deliverResult(cursor: android.database.Cursor) { /* TODO(body): (Landroid/database/Cursor;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->isReset()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         .local v0, "oldCursor":Landroid/database/Cursor;
    //         iput-object p1, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->isStarted()Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-super {p0, p1}, Landroid/support/v4/content/AsyncTaskLoader;->deliverResult(Ljava/lang/Object;)V
    //         :cond_2
    //         if-eqz v0, :cond_0
    //         if-eq v0, p1, :cond_0
    //         invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-interface {v0}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    */

    public fun deliverResult(x0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/database/Cursor;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/support/v4/content/CursorLoader;->deliverResult(Landroid/database/Cursor;)V
    //         return-void
    */

    public fun dump(prefix: String, fd: java.io.FileDescriptor, writer: java.io.PrintWriter, args: Array<String>) { /* TODO(body): (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/content/AsyncTaskLoader;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mUri="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mUri:Landroid/net/Uri;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mProjection="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mProjection:[Ljava/lang/String;
    //         invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mSelection="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mSelection:Ljava/lang/String;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mSelectionArgs="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mSelectionArgs:[Ljava/lang/String;
    //         invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mSortOrder="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mSortOrder:Ljava/lang/String;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mCursor="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mContentChanged="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Landroid/support/v4/content/CursorLoader;->mContentChanged:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         return-void
    */

    public fun getProjection(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mProjection:[Ljava/lang/String;
    //         return-object v0
    */

    public fun getSelection(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mSelection:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSelectionArgs(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mSelectionArgs:[Ljava/lang/String;
    //         return-object v0
    */

    public fun getSortOrder(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mSortOrder:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mUri:Landroid/net/Uri;
    //         return-object v0
    */

    public fun loadInBackground(): android.database.Cursor { return TODO("body: ()Landroid/database/Cursor;") }
    /*
    //         .locals 7
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/content/CursorLoader;->mUri:Landroid/net/Uri;
    //         iget-object v2, p0, Landroid/support/v4/content/CursorLoader;->mProjection:[Ljava/lang/String;
    //         iget-object v3, p0, Landroid/support/v4/content/CursorLoader;->mSelection:Ljava/lang/String;
    //         iget-object v4, p0, Landroid/support/v4/content/CursorLoader;->mSelectionArgs:[Ljava/lang/String;
    //         iget-object v5, p0, Landroid/support/v4/content/CursorLoader;->mSortOrder:Ljava/lang/String;
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v6
    //         .local v6, "cursor":Landroid/database/Cursor;
    //         if-eqz v6, :cond_0
    //         invoke-interface {v6}, Landroid/database/Cursor;->getCount()I
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mObserver:Landroid/support/v4/content/Loader$ForceLoadContentObserver;
    //         invoke-interface {v6, v0}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V
    //         :cond_0
    //         return-object v6
    */

    public fun loadInBackground(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->loadInBackground()Landroid/database/Cursor;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onCanceled(cursor: android.database.Cursor) { /* TODO(body): (Landroid/database/Cursor;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-interface {p1}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         return-void
    */

    public fun onCanceled(x0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/database/Cursor;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/support/v4/content/CursorLoader;->onCanceled(Landroid/database/Cursor;)V
    //         return-void
    */

    protected fun onReset() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/content/AsyncTaskLoader;->onReset()V
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->onStopLoading()V
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         invoke-interface {v0}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         return-void
    */

    protected fun onStartLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/content/CursorLoader;->deliverResult(Landroid/database/Cursor;)V
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->takeContentChanged()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/content/CursorLoader;->mCursor:Landroid/database/Cursor;
    //         if-nez v0, :cond_2
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->forceLoad()V
    //         :cond_2
    //         return-void
    */

    protected fun onStopLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Landroid/support/v4/content/CursorLoader;->cancelLoad()Z
    //         return-void
    */

    public fun setProjection(projection: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/content/CursorLoader;->mProjection:[Ljava/lang/String;
    //         return-void
    */

    public fun setSelection(selection: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/content/CursorLoader;->mSelection:Ljava/lang/String;
    //         return-void
    */

    public fun setSelectionArgs(selectionArgs: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/content/CursorLoader;->mSelectionArgs:[Ljava/lang/String;
    //         return-void
    */

    public fun setSortOrder(sortOrder: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/content/CursorLoader;->mSortOrder:Ljava/lang/String;
    //         return-void
    */

    public fun setUri(uri: android.net.Uri) { /* TODO(body): (Landroid/net/Uri;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/content/CursorLoader;->mUri:Landroid/net/Uri;
    //         return-void
    */

}
