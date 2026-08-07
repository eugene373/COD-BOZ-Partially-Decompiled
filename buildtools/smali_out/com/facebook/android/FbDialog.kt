package com.facebook.android

// Auto-emitted from smali source: FbDialog.java.
// 1 fields, 7 methods.

open class FbDialog: com.facebook.widget.WebDialog() {
    private var mListener: com.facebook.android.Facebook.DialogListener

    public constructor(p0: android.content.Context, p1: String, p2: android.os.Bundle, p3: com.facebook.android.Facebook.DialogListener)

    public constructor(p0: android.content.Context, p1: String, p2: android.os.Bundle, p3: com.facebook.android.Facebook.DialogListener, p4: Int)

    public constructor(p0: android.content.Context, p1: String, p2: com.facebook.android.Facebook.DialogListener)

    public constructor(p0: android.content.Context, p1: String, p2: com.facebook.android.Facebook.DialogListener, p3: Int)

    private fun callDialogListener(p0: android.os.Bundle, p1: com.facebook.FacebookException) { /* TODO(body): (Landroid/os/Bundle;Lcom/facebook/FacebookException;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         iget-object v0, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;
    //         invoke-interface {v0, p1}, Lcom/facebook/android/Facebook$DialogListener;->onComplete(Landroid/os/Bundle;)V
    //         goto :goto_0
    //         :cond_1
    //         instance-of v0, p2, Lcom/facebook/FacebookDialogException;
    //         if-eqz v0, :cond_2
    //         check-cast p2, Lcom/facebook/FacebookDialogException;
    //         new-instance v0, Lcom/facebook/android/DialogError;
    //         invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getErrorCode()I
    //         move-result v2
    //         invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getFailingUrl()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v0, v1, v2, v3}, Lcom/facebook/android/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;
    //         invoke-interface {v1, v0}, Lcom/facebook/android/Facebook$DialogListener;->onError(Lcom/facebook/android/DialogError;)V
    //         goto :goto_0
    //         :cond_2
    //         instance-of v0, p2, Lcom/facebook/FacebookOperationCanceledException;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;
    //         invoke-interface {v0}, Lcom/facebook/android/Facebook$DialogListener;->onCancel()V
    //         goto :goto_0
    //         :cond_3
    //         new-instance v0, Lcom/facebook/android/FacebookError;
    //         invoke-virtual {p2}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;
    //         invoke-interface {v1, v0}, Lcom/facebook/android/Facebook$DialogListener;->onFacebookError(Lcom/facebook/android/FacebookError;)V
    //         goto :goto_0
    */

    private fun setDialogListener(p0: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Lcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;
    //         new-instance v0, Lcom/facebook/android/FbDialog$1;
    //         invoke-direct {v0, p0}, Lcom/facebook/android/FbDialog$1;-><init>(Lcom/facebook/android/FbDialog;)V
    //         invoke-virtual {p0, v0}, Lcom/facebook/android/FbDialog;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)V
    //         return-void
    */

}
