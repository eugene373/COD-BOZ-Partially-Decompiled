package com.ideaworks3d.marmalade

// Auto-emitted from smali source: CursorLoaderHelper.java.
// 0 fields, 2 methods.

open class CursorLoaderHelper {
    public constructor()

    companion object {
    public @JvmStatic fun getCursor(p0: android.net.Uri, p1: Array<String>, p2: com.ideaworks3d.marmalade.LoaderActivity.CursorCompleteListener): Boolean { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)Z") }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         :try_start_0
    //         new-instance v0, Landroid/content/CursorLoader;
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v1
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         move-object v2, p0
    //         move-object v3, p1
    //         invoke-direct/range {v0 .. v6}, Landroid/content/CursorLoader;-><init>(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v1, 0x0
    //         new-instance v2, Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;
    //         invoke-direct {v2, p2}, Lcom/ideaworks3d/marmalade/CursorLoaderHelper$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/content/CursorLoader;->registerListener(ILandroid/content/Loader$OnLoadCompleteListener;)V
    //         invoke-virtual {v0}, Landroid/content/CursorLoader;->startLoading()V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return v7
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not create cursorLoader "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         goto :goto_0
    */

    }
}
