package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderKeyboard.java.
// 3 fields, 2 methods.

open class LoaderKeyboard_Anon1: Runnable {
    val this$0: com.ideaworks3d.marmalade.LoaderKeyboard
    val val$imm: android.view.inputmethod.InputMethodManager
    val val$show: Boolean

    constructor(p0: com.ideaworks3d.marmalade.LoaderKeyboard, p1: Boolean, p2: android.view.inputmethod.InputMethodManager)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x2
    //         const/4 v3, 0x0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$show:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->requestFocus()Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$300(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v4, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->hasWindowFocus()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView;->onWindowFocusChanged(Z)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$300(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v4, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)Z
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderView;->getWindowToken()Landroid/os/IBinder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$300(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v3, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;ILandroid/os/ResultReceiver;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;
    //         invoke-virtual {v0, v3, v3}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V
    //         goto :goto_0
    */

}
