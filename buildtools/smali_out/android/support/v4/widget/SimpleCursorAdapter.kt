package android.support.v4.widget

// Auto-emitted from smali source: SimpleCursorAdapter.java.
// 6 fields, 15 methods.

open class SimpleCursorAdapter: android.support.v4.widget.ResourceCursorAdapter() {
    private var mCursorToStringConverter: android.support.v4.widget.SimpleCursorAdapter.CursorToStringConverter
    protected var mFrom: IntArray
    var mOriginalFrom: Array<String>
    private var mStringConversionColumn: Int
    protected var mTo: IntArray
    private var mViewBinder: android.support.v4.widget.SimpleCursorAdapter.ViewBinder

    public constructor(context: android.content.Context, layout: Int, c: android.database.Cursor, from: Array<String>, to: IntArray)

    public constructor(context: android.content.Context, layout: Int, c: android.database.Cursor, from: Array<String>, to: IntArray, flags: Int)

    private fun findColumns(from: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursor:Landroid/database/Cursor;
    //         if-eqz v2, :cond_2
    //         array-length v0, p1
    //         .local v0, "count":I
    //         iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
    //         array-length v2, v2
    //         if-eq v2, v0, :cond_1
    //         :cond_0
    //         new-array v2, v0, [I
    //         iput-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
    //         :cond_1
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v0, :cond_3
    //         iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
    //         iget-object v3, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursor:Landroid/database/Cursor;
    //         aget-object v4, p1, v1
    //         invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
    //         move-result v3
    //         aput v3, v2, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         .end local v0    # "count":I
    //         .end local v1    # "i":I
    //         :cond_2
    //         const/4 v2, 0x0
    //         iput-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
    //         :cond_3
    //         return-void
    */

    public fun bindView(view: android.view.View, context: android.content.Context, cursor: android.database.Cursor) { /* TODO(body): (Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V */ }
    /*
    //         .locals 11
    //         iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mViewBinder:Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
    //         .local v0, "binder":Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
    //         iget-object v8, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
    //         array-length v2, v8
    //         .local v2, "count":I
    //         iget-object v3, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
    //         .local v3, "from":[I
    //         iget-object v6, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
    //         .local v6, "to":[I
    //         const/4 v4, 0x0
    //         .local v4, "i":I
    //         :goto_0
    //         if-ge v4, v2, :cond_5
    //         aget v8, v6, v4
    //         invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    //         move-result-object v7
    //         .local v7, "v":Landroid/view/View;
    //         if-eqz v7, :cond_2
    //         const/4 v1, 0x0
    //         .local v1, "bound":Z
    //         if-eqz v0, :cond_0
    //         aget v8, v3, v4
    //         invoke-interface {v0, v7, p3, v8}, Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;->setViewValue(Landroid/view/View;Landroid/database/Cursor;I)Z
    //         move-result v1
    //         :cond_0
    //         if-nez v1, :cond_2
    //         aget v8, v3, v4
    //         invoke-interface {p3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v5
    //         .local v5, "text":Ljava/lang/String;
    //         if-nez v5, :cond_1
    //         const-string v5, ""
    //         :cond_1
    //         instance-of v8, v7, Landroid/widget/TextView;
    //         if-eqz v8, :cond_3
    //         check-cast v7, Landroid/widget/TextView;
    //         .end local v7    # "v":Landroid/view/View;
    //         invoke-virtual {p0, v7, v5}, Landroid/support/v4/widget/SimpleCursorAdapter;->setViewText(Landroid/widget/TextView;Ljava/lang/String;)V
    //         .end local v1    # "bound":Z
    //         .end local v5    # "text":Ljava/lang/String;
    //         :cond_2
    //         :goto_1
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_0
    //         .restart local v1    # "bound":Z
    //         .restart local v5    # "text":Ljava/lang/String;
    //         .restart local v7    # "v":Landroid/view/View;
    //         :cond_3
    //         instance-of v8, v7, Landroid/widget/ImageView;
    //         if-eqz v8, :cond_4
    //         check-cast v7, Landroid/widget/ImageView;
    //         .end local v7    # "v":Landroid/view/View;
    //         invoke-virtual {p0, v7, v5}, Landroid/support/v4/widget/SimpleCursorAdapter;->setViewImage(Landroid/widget/ImageView;Ljava/lang/String;)V
    //         goto :goto_1
    //         .restart local v7    # "v":Landroid/view/View;
    //         :cond_4
    //         new-instance v8, Ljava/lang/IllegalStateException;
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v10
    //         invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v10
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         const-string v10, " is not a "
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         const-string v10, " view that can be bounds by this SimpleCursorAdapter"
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v8
    //         .end local v1    # "bound":Z
    //         .end local v5    # "text":Ljava/lang/String;
    //         .end local v7    # "v":Landroid/view/View;
    //         :cond_5
    //         return-void
    */

    public fun changeCursorAndColumns(c: android.database.Cursor, from: Array<String>, to: IntArray) { /* TODO(body): (Landroid/database/Cursor;[Ljava/lang/String;[I)V */ }
    /*
    //         .locals 1
    //         iput-object p2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
    //         iput-object p3, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
    //         invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->changeCursor(Landroid/database/Cursor;)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
    //         invoke-direct {p0, v0}, Landroid/support/v4/widget/SimpleCursorAdapter;->findColumns([Ljava/lang/String;)V
    //         return-void
    */

    public fun convertToString(cursor: android.database.Cursor): CharSequence { return TODO("body: (Landroid/database/Cursor;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
    //         invoke-interface {v0, p1}, Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
    //         const/4 v1, -0x1
    //         if-le v0, v1, :cond_1
    //         iget v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
    //         invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getCursorToStringConverter(): android.support.v4.widget.SimpleCursorAdapter.CursorToStringConverter { return TODO("body: ()Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
    //         return-object v0
    */

    public fun getStringConversionColumn(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
    //         return v0
    */

    public fun getViewBinder(): android.support.v4.widget.SimpleCursorAdapter.ViewBinder { return TODO("body: ()Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mViewBinder:Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
    //         return-object v0
    */

    public fun setCursorToStringConverter(cursorToStringConverter: android.support.v4.widget.SimpleCursorAdapter.CursorToStringConverter) { /* TODO(body): (Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
    //         return-void
    */

    public fun setStringConversionColumn(stringConversionColumn: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
    //         return-void
    */

    public fun setViewBinder(viewBinder: android.support.v4.widget.SimpleCursorAdapter.ViewBinder) { /* TODO(body): (Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mViewBinder:Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
    //         return-void
    */

    public fun setViewImage(v: android.widget.ImageView, value: String) { /* TODO(body): (Landroid/widget/ImageView;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "nfe":Ljava/lang/NumberFormatException;
    //         invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V
    //         goto :goto_0
    */

    public fun setViewText(v: android.widget.TextView, text: String) { /* TODO(body): (Landroid/widget/TextView;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun swapCursor(c: android.database.Cursor): android.database.Cursor { return TODO("body: (Landroid/database/Cursor;)Landroid/database/Cursor;") }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;
    //         move-result-object v0
    //         .local v0, "res":Landroid/database/Cursor;
    //         iget-object v1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
    //         invoke-direct {p0, v1}, Landroid/support/v4/widget/SimpleCursorAdapter;->findColumns([Ljava/lang/String;)V
    //         return-object v0
    */

}
