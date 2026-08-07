// Auto-emitted from smali source: s3eFacebook.java.
// 16 fields, 45 methods.

open class s3eFacebook {
    val ARRAY_TYPE: Int
    val DICTIONARY_TYPE: Int
    val NUMBER_TYPE: Int
    val S3E_RESULT_ERROR: Int
    val S3E_RESULT_SUCCESS: Int
    val STRING_TYPE: Int
    val UNKNOWN: Int
    private var m_Prefs: android.content.SharedPreferences

    constructor()

    public external fun nativeDialogCallback(p0: Object, p1: Boolean)

    public external fun nativeLoginCallback(p0: Object, p1: Boolean)

    public external fun nativeReauthorizeCallback(p0: Object, p1: Boolean)

    public external fun nativeRequestCallback(p0: Object, p1: Boolean)

    public fun s3eFBDialog_AddParamNumber(p0: Object, p1: String, p2: Long): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;J)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBDialog_AddParamNumber: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1, p2, p3, p4}, Ls3eFacebook$s3eFBDialog;->AddParamLong(Ljava/lang/String;J)V
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eFBDialog_AddParamString(p0: Object, p1: String, p2: String): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBDialog_AddParamString: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1, p2, p3}, Ls3eFacebook$s3eFBDialog;->AddParamString(Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eFBDialog_Complete(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBDialog_Complete:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetComplete()Z
    //         move-result v0
    //         return v0
    */

    public fun s3eFBDialog_Delete(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eFBDialog_DidCompleteWithUrl(p0: Object, p1: String): String { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBDialog_DidCompleteWithUrl:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBDialog;->GetSuccessURL(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBDialog_DidNotCompleteWithUrl(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBDialog_DidNotCompleteWithUrl:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetFailureURL()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBDialog_Error(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetError()Z
    //         move-result v0
    //         return v0
    */

    public fun s3eFBDialog_ErrorCode(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetErrorCode()I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBDialog_ErrorString(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBDialog_ErrorString:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetErrorString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBDialog_Show(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 2
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "s3eFBDialog_Show"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBDialog;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->Show()I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBDialog_WithAction(p0: Object, p1: String): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "s3eDialog_WithAction"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         new-instance v0, Ls3eFacebook$s3eFBDialog;
    //         invoke-direct {v0, p0, p1, p2}, Ls3eFacebook$s3eFBDialog;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun s3eFBInit(p0: String): Object { return TODO("body: (Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBInit:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Ls3eFacebook$s3eFBSession;
    //         invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBSession;-><init>(Ls3eFacebook;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun s3eFBRequest_AddParamNumber(p0: Object, p1: String, p2: Long): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;J)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_AddParamNumber:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1, p2, p3, p4}, Ls3eFacebook$s3eFBRequest;->AddParamLong(Ljava/lang/String;J)V
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eFBRequest_AddParamString(p0: Object, p1: String, p2: String): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_AddParamString:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1, p2, p3}, Ls3eFacebook$s3eFBRequest;->AddParamString(Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eFBRequest_Complete(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_Complete:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetComplete()Z
    //         move-result v0
    //         return v0
    */

    public fun s3eFBRequest_Delete(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_Delete:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eFBRequest_Error(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_Error:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetError()Z
    //         move-result v0
    //         return v0
    */

    public fun s3eFBRequest_ErrorCode(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_ErrorCode:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetErrorCode()I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBRequest_ErrorString(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_ErrorString:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetErrorString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBRequest_ResponseArrayCount(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eFBRequest_ResponseArrayItemAsString(p0: Object, p1: Int): String { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun s3eFBRequest_ResponseAsNumber(p0: Object): Long { return TODO("body: (Ljava/lang/Object;)J") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_ResponseAsNumber:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseAsNumber()I
    //         move-result v0
    //         int-to-long v0, v0
    //         return-wide v0
    */

    public fun s3eFBRequest_ResponseAsString(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_ResponseAsString:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseAsString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBRequest_ResponseDictionaryContainsItem(p0: Object, p1: String): Boolean { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBRequest;->ResponseDictionaryContainsItem(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun s3eFBRequest_ResponseDictionaryItemAsString(p0: Object, p1: String): String { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBRequest;->GetResponseDictionaryItemAsString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBRequest_ResponseRaw(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_ResponseRaw:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseAsString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBRequest_ResponseType(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_ResponseType:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseType()I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBRequest_Send(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 2
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "calling req send"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->Send()I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBRequest_WithGraphPath(p0: Object, p1: String, p2: String): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_WithGraphPath:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         new-instance v0, Ls3eFacebook$s3eFBRequest;
    //         invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBRequest;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;)V
    //         invoke-virtual {v0, p2, p3}, Ls3eFacebook$s3eFBRequest;->SetGraph(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun s3eFBRequest_WithMethodName(p0: Object, p1: String, p2: String): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_WithMethodName:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         new-instance v0, Ls3eFacebook$s3eFBRequest;
    //         invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBRequest;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;)V
    //         invoke-virtual {v0, p2, p3}, Ls3eFacebook$s3eFBRequest;->SetMethod(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun s3eFBRequest_WithURL(p0: Object, p1: String, p2: String): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBRequest_WithURL:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ":"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         new-instance v0, Ls3eFacebook$s3eFBRequest;
    //         invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBRequest;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;)V
    //         invoke-virtual {v0, p2, p3}, Ls3eFacebook$s3eFBRequest;->SetURL(Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun s3eFBSession_AccessToken(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBSession_AccessToken:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->GetAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBSession_Close(p0: Object, p1: Int): Int { return TODO("body: (Ljava/lang/Object;I)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBSession_Logout:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " clear:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBSession;->Close(I)I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBSession_GetPermissions(p0: Object): Array<String> { return TODO("body: (Ljava/lang/Object;)[Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBSession_GetPermissions:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->GetPermissions()[Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s3eFBSession_IsActive(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBSession_IsActive:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->IsActive()Z
    //         move-result v0
    //         return v0
    */

    public fun s3eFBSession_LoggedIn(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eFBSession_LoggedIn:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->LoggedIn()Z
    //         move-result v0
    //         return v0
    */

    public fun s3eFBSession_Login(p0: Object, p1: Array<String>, p2: Int): Int { return TODO("body: (Ljava/lang/Object;[Ljava/lang/String;I)I") }
    /*
    //         .locals 2
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "s3eFBSession_Login"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1, p2, p3}, Ls3eFacebook$s3eFBSession;->Login([Ljava/lang/String;I)I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBSession_Reauthorize(p0: Object, p1: Array<String>, p2: Boolean, p3: Int): Int { return TODO("body: (Ljava/lang/Object;[Ljava/lang/String;ZI)I") }
    /*
    //         .locals 4
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         array-length v2, p2
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         aget-object v3, p2, v0
    //         invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, "s3eFacebook"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "s3eFBSession_Reauthorize publish: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " audience: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " permissions: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1, p2, p4, p3}, Ls3eFacebook$s3eFBSession;->ReauthorizeWithPermissions([Ljava/lang/String;IZ)I
    //         move-result v0
    //         return v0
    */

    public fun s3eFBTerminate(p0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "s3eFBTerminate"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         check-cast p1, Ls3eFacebook$s3eFBSession;
    //         invoke-virtual {p1, v2}, Ls3eFacebook$s3eFBSession;->Close(I)I
    //         return v2
    */

    companion object {
    private val TAG: String = "s3eFacebook"
    val s3eFBSessionBehaviourForcingWebView: Int = 0x2
    val s3eFBSessionBehaviourUseSystemAccountIfPresent: Int = 0x3
    val s3eFBSessionBehaviourUseWebView: Int = 0x4
    val s3eFBSessionBehaviourWithFallbackToWebView: Int = 0x0
    val s3eFBSessionBehaviourWithNoFallbackToWebView: Int = 0x1
    val s3eFBSessionCloseBehaviourClearToken: Int = 0x1
    val s3eFBSessionCloseBehaviourSimple: Int = 0
    }
}
