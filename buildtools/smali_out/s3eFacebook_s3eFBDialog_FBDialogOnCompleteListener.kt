// Auto-emitted from smali source: s3eFacebook.java.
// 1 fields, 3 methods.

class s3eFacebook_s3eFBDialog_FBDialogOnCompleteListener: com.facebook.widget.WebDialog.OnCompleteListener {
    val this$1: s3eFacebook.s3eFBDialog

    private constructor(p0: s3eFacebook.s3eFBDialog)

    constructor(p0: s3eFacebook.s3eFBDialog, p1: s3eFacebook.1)

    public fun onComplete(p0: android.os.Bundle, p1: com.facebook.FacebookException) { /* TODO(body): (Landroid/os/Bundle;Lcom/facebook/FacebookException;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         const/4 v4, 0x0
    //         const/4 v3, 0x1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    //         iput-object v1, v0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Dialog onComplete: values: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Landroid/os/Bundle;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         if-nez p2, :cond_1
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "Dialog onComplete: success"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Complete:Z
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         instance-of v0, p2, Lcom/facebook/FacebookOperationCanceledException;
    //         if-eqz v0, :cond_2
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "Dialog onComplete: cancelled"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Cancelled:Z
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V
    //         goto :goto_0
    //         :cond_2
    //         instance-of v0, p2, Lcom/facebook/FacebookDialogException;
    //         if-eqz v0, :cond_3
    //         check-cast p2, Lcom/facebook/FacebookDialogException;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         new-instance v1, Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget-object v2, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         invoke-direct {v1, v2, v5}, Ls3eFacebook$s3eFBDialog$DialogErrorData;-><init>(Ls3eFacebook$s3eFBDialog;Ls3eFacebook$1;)V
    //         iput-object v1, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getErrorCode()I
    //         move-result v1
    //         iput v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorCode:I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         invoke-virtual {p2}, Lcom/facebook/FacebookDialogException;->getFailingUrl()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->failingURL:Ljava/lang/String;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Error:Z
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Dialog onComplete: exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v2, v2, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget-object v2, v2, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V
    //         goto :goto_0
    //         :cond_3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Dialog onComplete: error: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p2}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         new-instance v1, Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget-object v2, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         invoke-direct {v1, v2, v5}, Ls3eFacebook$s3eFBDialog$DialogErrorData;-><init>(Ls3eFacebook$s3eFBDialog;Ls3eFacebook$1;)V
    //         iput-object v1, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         invoke-virtual {p2}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iput-boolean v3, v0, Ls3eFacebook$s3eFBDialog;->m_Error:Z
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBDialog$FBDialogOnCompleteListener;->this$1:Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeDialogCallback(Ljava/lang/Object;Z)V
    //         goto/16 :goto_0
    */

}
