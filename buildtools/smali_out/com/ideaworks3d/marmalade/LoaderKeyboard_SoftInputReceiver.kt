package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderKeyboard.java.
// 1 fields, 2 methods.

open class LoaderKeyboard_SoftInputReceiver: android.os.ResultReceiver() {
    val this$0: com.ideaworks3d.marmalade.LoaderKeyboard

    public constructor(p0: com.ideaworks3d.marmalade.LoaderKeyboard, p1: android.os.Handler)

    protected fun onReceiveResult(p0: Int, p1: android.os.Bundle) { /* TODO(body): (ILandroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         packed-switch p1, :pswitch_data_0
    //         :cond_0
    //         move v0, v1
    //         :goto_0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v2, "input_method"
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/inputmethod/InputMethodManager;
    //         invoke-virtual {v0, v1, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V
    //         :cond_1
    //         return-void
    //         :pswitch_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$000(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z
    //         move-result v2
    //         if-eq v2, v0, :cond_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$100(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         goto :goto_0
    //         :pswitch_1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$000(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$100(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

}
