// Auto-emitted from smali source: s3eFacebook.java.
// 10 fields, 12 methods.

open class s3eFacebook_s3eFBDialog {
    var m_Action: String
    var m_Bundle: android.os.Bundle
    var m_Cancelled: Boolean
    var m_Complete: Boolean
    var m_Dialog: com.facebook.widget.WebDialog
    var m_DialogError: s3eFacebook.s3eFBDialog.DialogErrorData
    var m_Error: Boolean
    var m_Params: android.os.Bundle
    var m_s3eSession: s3eFacebook.s3eFBSession
    val this$0: s3eFacebook

    constructor(p0: s3eFacebook, p1: s3eFacebook.s3eFBSession, p2: String)

    private fun isSessionValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_s3eSession:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun AddParamLong(p0: String, p1: Long) { /* TODO(body): (Ljava/lang/String;J)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;
    //         invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    fun AddParamString(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Params:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    fun GetCancelled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Ls3eFacebook$s3eFBDialog;->m_Cancelled:Z
    //         return v0
    */

    fun GetComplete(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Ls3eFacebook$s3eFBDialog;->m_Complete:Z
    //         return v0
    */

    fun GetError(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Ls3eFacebook$s3eFBDialog;->m_Error:Z
    //         return v0
    */

    fun GetErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget v0, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorCode:I
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun GetErrorString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->errorMessage:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun GetFailureURL(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_DialogError:Ls3eFacebook$s3eFBDialog$DialogErrorData;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->failingURL:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun GetSuccessURL(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;
    //         if-nez v0, :cond_1
    //         const/4 v1, 0x0
    //         :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         if-nez p1, :cond_3
    //         const-string v1, ""
    //         const/4 v0, 0x0
    //         iget-object v2, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;
    //         invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         move v2, v0
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-lez v2, :cond_2
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v4, "&"
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         :cond_2
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v4, "="
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v4, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;
    //         invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         goto :goto_1
    //         :cond_3
    //         iget-object v0, p0, Ls3eFacebook$s3eFBDialog;->m_Bundle:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_0
    */

    fun Show(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         new-instance v1, Ls3eFacebook$s3eFBDialog$1;
    //         invoke-direct {v1, p0}, Ls3eFacebook$s3eFBDialog$1;-><init>(Ls3eFacebook$s3eFBDialog;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->runOnUiThread(Ljava/lang/Runnable;)V
    //         const/4 v0, 0x0
    //         return v0
    */

}
