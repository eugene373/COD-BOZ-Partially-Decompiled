package com.ideaworks3d.marmalade

// Auto-emitted from smali source: CursorLoaderHelper.java.
// 1 fields, 3 methods.

class CursorLoaderHelper_Anon1: android.content.Loader.OnLoadCompleteListener {
    val val$completeCallback: com.ideaworks3d.marmalade.LoaderActivity.CursorCompleteListener

    constructor(p0: com.ideaworks3d.marmalade.LoaderActivity.CursorCompleteListener)

    public fun onLoadComplete(p0: android.content.Loader, p1: android.database.Cursor) { /* TODO(body): (Landroid/content/Loader;Landroid/database/Cursor;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Loader",
    //                 "<",
    //                 "Landroid/database/Cursor;",
    //                 ">;",
    //                 "Landroid/database/Cursor;",
    //                 ")V"
    //             }
    //         .end annotation
    //         const-string v0, "CursorLoader onLoadComplete"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;
    //         invoke-interface {v0, p2}, Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;->cursorLoadComplete(Landroid/database/Cursor;)V
    //         return-void
    */

    public fun onLoadComplete(p0: android.content.Loader, p1: Object) { /* TODO(body): (Landroid/content/Loader;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p2, Landroid/database/Cursor;
    //         invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;->onLoadComplete(Landroid/content/Loader;Landroid/database/Cursor;)V
    //         return-void
    */

}
