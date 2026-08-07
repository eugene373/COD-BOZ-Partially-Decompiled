package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderActivity.java.
// 3 fields, 2 methods.

open class ProgressDialogHandler: android.os.Handler() {
    private var progressDialog: android.app.ProgressDialog

    constructor()

    public fun handleMessage(p0: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 5
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         packed-switch v0, :pswitch_data_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, ""
    //         const-string v2, ""
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         invoke-static {v0, v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/ProgressDialogHandler;->progressDialog:Landroid/app/ProgressDialog;
    //         goto :goto_0
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/ProgressDialogHandler;->progressDialog:Landroid/app/ProgressDialog;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/ProgressDialogHandler;->progressDialog:Landroid/app/ProgressDialog;
    //         invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/ProgressDialogHandler;->progressDialog:Landroid/app/ProgressDialog;
    //         invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/ProgressDialogHandler;->progressDialog:Landroid/app/ProgressDialog;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    companion object {
    @JvmField public val PROGRESS_FINISH: Int = 0x1
    @JvmField public val PROGRESS_START: Int = 0
    }
}
