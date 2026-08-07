package android.support.v4.widget

// Auto-emitted from smali source: ResourceCursorAdapter.java.
// 3 fields, 7 methods.

open class ResourceCursorAdapter: android.support.v4.widget.CursorAdapter() {
    private var mDropDownLayout: Int
    private var mInflater: android.view.LayoutInflater
    private var mLayout: Int

    public constructor(context: android.content.Context, layout: Int, c: android.database.Cursor)

    public constructor(context: android.content.Context, layout: Int, c: android.database.Cursor, flags: Int)

    public constructor(context: android.content.Context, layout: Int, c: android.database.Cursor, autoRequery: Boolean)

    public fun newDropDownView(context: android.content.Context, cursor: android.database.Cursor, parent: android.view.ViewGroup): android.view.View { return TODO("body: (Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;
    //         iget v1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newView(context: android.content.Context, cursor: android.database.Cursor, parent: android.view.ViewGroup): android.view.View { return TODO("body: (Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;
    //         iget v1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setDropDownViewResource(dropDownLayout: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I
    //         return-void
    */

    public fun setViewResource(layout: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I
    //         return-void
    */

}
