package com.google.android.gms.common

// Auto-emitted from smali.
// 2 fields, 6 methods.

open class ErrorDialogFragment: android.app.DialogFragment() {
    private var HG: android.content.DialogInterface.OnCancelListener
    private var mDialog: android.app.Dialog

    public constructor()

    public fun onCancel(dialog: android.content.DialogInterface) { /* TODO(body): (Landroid/content/DialogInterface;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/ErrorDialogFragment;->HG:Landroid/content/DialogInterface$OnCancelListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/ErrorDialogFragment;->HG:Landroid/content/DialogInterface$OnCancelListener;
    //         invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V
    //         :cond_0
    //         return-void
    */

    public fun onCreateDialog(savedInstanceState: android.os.Bundle): android.app.Dialog { return TODO("body: (Landroid/os/Bundle;)Landroid/app/Dialog;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/ErrorDialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/ErrorDialogFragment;->setShowsDialog(Z)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/ErrorDialogFragment;->mDialog:Landroid/app/Dialog;
    //         return-object v0
    */

    public fun show(manager: android.app.FragmentManager, tag: String) { /* TODO(body): (Landroid/app/FragmentManager;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    public @JvmStatic fun newInstance(dialog: android.app.Dialog): com.google.android.gms.common.ErrorDialogFragment { return TODO("body: (Landroid/app/Dialog;)Lcom/google/android/gms/common/ErrorDialogFragment;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/ErrorDialogFragment;->newInstance(Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Lcom/google/android/gms/common/ErrorDialogFragment;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newInstance(dialog: android.app.Dialog, cancelListener: android.content.DialogInterface.OnCancelListener): com.google.android.gms.common.ErrorDialogFragment { return TODO("body: (Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Lcom/google/android/gms/common/ErrorDialogFragment;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         new-instance v1, Lcom/google/android/gms/common/ErrorDialogFragment;
    //         invoke-direct {v1}, Lcom/google/android/gms/common/ErrorDialogFragment;-><init>()V
    //         const-string v0, "Cannot display null dialog"
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/Dialog;
    //         invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
    //         invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    //         iput-object v0, v1, Lcom/google/android/gms/common/ErrorDialogFragment;->mDialog:Landroid/app/Dialog;
    //         if-eqz p1, :cond_0
    //         iput-object p1, v1, Lcom/google/android/gms/common/ErrorDialogFragment;->HG:Landroid/content/DialogInterface$OnCancelListener;
    //         :cond_0
    //         return-object v1
    */

    }
}
