// Auto-emitted from smali source: s3eFacebook.java.
// 1 fields, 2 methods.

open class s3eFacebook_s3eFBSession_Anon1: com.facebook.Session.StatusCallback {
    val this$1: s3eFacebook.s3eFBSession

    constructor(p0: s3eFacebook.s3eFBSession)

    public fun call(p0: com.facebook.Session, p1: com.facebook.SessionState, p2: Exception) { /* TODO(body): (Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_0
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "StatusCallback state: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p2}, Lcom/facebook/SessionState;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-nez p3, :cond_1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Ls3eFacebook;->nativeReauthorizeCallback(Ljava/lang/Object;Z)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p3}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession$1;->this$1:Ls3eFacebook$s3eFBSession;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Ls3eFacebook;->nativeReauthorizeCallback(Ljava/lang/Object;Z)V
    //         goto :goto_0
    */

}
