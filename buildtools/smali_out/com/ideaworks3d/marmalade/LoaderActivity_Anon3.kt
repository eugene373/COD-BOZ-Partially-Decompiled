package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderActivity.java.
// 4 fields, 2 methods.

open class LoaderActivity_Anon3: Runnable {
    val this$0: com.ideaworks3d.marmalade.LoaderActivity
    val val$completeCallback: com.ideaworks3d.marmalade.LoaderActivity.CursorCompleteListener
    val val$proj: Array<String>
    val val$uri: android.net.Uri

    constructor(p0: com.ideaworks3d.marmalade.LoaderActivity, p1: android.net.Uri, p2: Array<String>, p3: com.ideaworks3d.marmalade.LoaderActivity.CursorCompleteListener)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         const/16 v1, 0xb
    //         if-lt v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$uri:Landroid/net/Uri;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$proj:[Ljava/lang/String;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;
    //         invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/CursorLoaderHelper;->getCursor(Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$uri:Landroid/net/Uri;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$proj:[Ljava/lang/String;
    //         move-object v4, v3
    //         move-object v5, v3
    //         invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/LoaderActivity;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$3;->val$completeCallback:Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;
    //         invoke-interface {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;->cursorLoadComplete(Landroid/database/Cursor;)V
    //         goto :goto_0
    */

}
