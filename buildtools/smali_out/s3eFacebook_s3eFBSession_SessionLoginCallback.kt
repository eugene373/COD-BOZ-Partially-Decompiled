// Auto-emitted from smali source: s3eFacebook.java.
// 1 fields, 3 methods.

open class s3eFacebook_s3eFBSession_SessionLoginCallback: com.facebook.Session.StatusCallback {
    val this$1: s3eFacebook.s3eFBSession

    private constructor(p0: s3eFacebook.s3eFBSession)

    constructor(p0: s3eFacebook.s3eFBSession, p1: s3eFacebook.1)

    public fun call(p0: com.facebook.Session, p1: com.facebook.SessionState, p2: Exception) { /* TODO(body): (Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "Login callback call"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-eqz p3, :cond_1
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Login exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p3}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
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
    //         sget-object v0, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;
    //         if-ne p2, v0, :cond_3
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v1
    //         const-string v0, "Opened with "
    //         invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         move-object v1, v0
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         move-object v1, v0
    //         goto :goto_1
    //         :cond_2
    //         const-string v0, "s3eFacebook"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V
    //         goto :goto_0
    //         :cond_3
    //         sget-object v0, Lcom/facebook/SessionState;->CLOSED_LOGIN_FAILED:Lcom/facebook/SessionState;
    //         if-ne p2, v0, :cond_0
    //         invoke-virtual {p1, p0}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;->this$1:Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V
    //         goto :goto_0
    */

}
