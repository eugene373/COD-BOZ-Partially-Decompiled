.class Ls3eFacebook;
.super Ljava/lang/Object;
.source "s3eFacebook.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3eFacebook$1;,
        Ls3eFacebook$s3eFBRequest;,
        Ls3eFacebook$s3eFBDialog;,
        Ls3eFacebook$s3eFBSession;,
        Ls3eFacebook$s3eFacebookAudience;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "s3eFacebook"

.field static final s3eFBSessionBehaviourForcingWebView:I = 0x2

.field static final s3eFBSessionBehaviourUseSystemAccountIfPresent:I = 0x3

.field static final s3eFBSessionBehaviourUseWebView:I = 0x4

.field static final s3eFBSessionBehaviourWithFallbackToWebView:I = 0x0

.field static final s3eFBSessionBehaviourWithNoFallbackToWebView:I = 0x1

.field static final s3eFBSessionCloseBehaviourClearToken:I = 0x1

.field static final s3eFBSessionCloseBehaviourSimple:I


# instance fields
.field final ARRAY_TYPE:I

.field final DICTIONARY_TYPE:I

.field final NUMBER_TYPE:I

.field final S3E_RESULT_ERROR:I

.field final S3E_RESULT_SUCCESS:I

.field final STRING_TYPE:I

.field final UNKNOWN:I

.field private m_Prefs:Landroid/content/SharedPreferences;


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput v0, p0, Ls3eFacebook;->S3E_RESULT_SUCCESS:I

    .line 65
    iput v1, p0, Ls3eFacebook;->S3E_RESULT_ERROR:I

    .line 67
    iput v0, p0, Ls3eFacebook;->STRING_TYPE:I

    .line 68
    iput v1, p0, Ls3eFacebook;->NUMBER_TYPE:I

    .line 69
    const/4 v0, 0x2

    iput v0, p0, Ls3eFacebook;->ARRAY_TYPE:I

    .line 70
    const/4 v0, 0x3

    iput v0, p0, Ls3eFacebook;->DICTIONARY_TYPE:I

    .line 71
    const/4 v0, 0x4

    iput v0, p0, Ls3eFacebook;->UNKNOWN:I

    .line 605
    return-void
.end method

.method static synthetic access$102(Ls3eFacebook;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences;
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Ls3eFacebook;->m_Prefs:Landroid/content/SharedPreferences;

    return-object p1
.end method


# virtual methods
.method public native nativeDialogCallback(Ljava/lang/Object;Z)V
.end method

.method public native nativeLoginCallback(Ljava/lang/Object;Z)V
.end method

.method public native nativeReauthorizeCallback(Ljava/lang/Object;Z)V
.end method

.method public native nativeRequestCallback(Ljava/lang/Object;Z)V
.end method

.method public s3eFBDialog_AddParamNumber(Ljava/lang/Object;Ljava/lang/String;J)I
    .locals 3

    .prologue
    .line 902
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBDialog_AddParamNumber: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 904
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 905
    invoke-virtual {p1, p2, p3, p4}, Ls3eFacebook$s3eFBDialog;->AddParamLong(Ljava/lang/String;J)V

    .line 906
    const/4 v0, 0x0

    return v0
.end method

.method public s3eFBDialog_AddParamString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 893
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBDialog_AddParamString: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 895
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 896
    invoke-virtual {p1, p2, p3}, Ls3eFacebook$s3eFBDialog;->AddParamString(Ljava/lang/String;Ljava/lang/String;)V

    .line 897
    const/4 v0, 0x0

    return v0
.end method

.method public s3eFBDialog_Complete(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 938
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBDialog_Complete:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 939
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 940
    invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetComplete()Z

    move-result v0

    return v0
.end method

.method public s3eFBDialog_Delete(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 888
    const/4 v0, 0x0

    return v0
.end method

.method public s3eFBDialog_DidCompleteWithUrl(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 952
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBDialog_DidCompleteWithUrl:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 953
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 954
    invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBDialog;->GetSuccessURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBDialog_DidNotCompleteWithUrl(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 945
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBDialog_DidNotCompleteWithUrl:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 946
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 947
    invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetFailureURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBDialog_Error(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 919
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 920
    invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetError()Z

    move-result v0

    return v0
.end method

.method public s3eFBDialog_ErrorCode(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 925
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 926
    invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetErrorCode()I

    move-result v0

    return v0
.end method

.method public s3eFBDialog_ErrorString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 931
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBDialog_ErrorString:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 932
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 933
    invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->GetErrorString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBDialog_Show(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 911
    const-string v0, "s3eFacebook"

    const-string v1, "s3eFBDialog_Show"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 913
    check-cast p1, Ls3eFacebook$s3eFBDialog;

    .line 914
    invoke-virtual {p1}, Ls3eFacebook$s3eFBDialog;->Show()I

    move-result v0

    return v0
.end method

.method public s3eFBDialog_WithAction(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 880
    const-string v0, "s3eFacebook"

    const-string v1, "s3eDialog_WithAction"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 881
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 882
    new-instance v0, Ls3eFacebook$s3eFBDialog;

    invoke-direct {v0, p0, p1, p2}, Ls3eFacebook$s3eFBDialog;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;Ljava/lang/String;)V

    .line 883
    return-object v0
.end method

.method public s3eFBInit(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 804
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBInit:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 805
    new-instance v0, Ls3eFacebook$s3eFBSession;

    invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBSession;-><init>(Ls3eFacebook;Ljava/lang/String;)V

    .line 806
    return-object v0
.end method

.method public s3eFBRequest_AddParamNumber(Ljava/lang/Object;Ljava/lang/String;J)I
    .locals 3

    .prologue
    .line 1003
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_AddParamNumber:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1004
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1005
    invoke-virtual {p1, p2, p3, p4}, Ls3eFacebook$s3eFBRequest;->AddParamLong(Ljava/lang/String;J)V

    .line 1006
    const/4 v0, 0x0

    return v0
.end method

.method public s3eFBRequest_AddParamString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 995
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_AddParamString:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 996
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 997
    invoke-virtual {p1, p2, p3}, Ls3eFacebook$s3eFBRequest;->AddParamString(Ljava/lang/String;Ljava/lang/String;)V

    .line 998
    const/4 v0, 0x0

    return v0
.end method

.method public s3eFBRequest_Complete(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 1039
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_Complete:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1040
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1041
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetComplete()Z

    move-result v0

    return v0
.end method

.method public s3eFBRequest_Delete(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 988
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_Delete:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 989
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 990
    const/4 v0, 0x0

    return v0
.end method

.method public s3eFBRequest_Error(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 1018
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_Error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1019
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1020
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetError()Z

    move-result v0

    return v0
.end method

.method public s3eFBRequest_ErrorCode(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 1025
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_ErrorCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1026
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1027
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetErrorCode()I

    move-result v0

    return v0
.end method

.method public s3eFBRequest_ErrorString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1032
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_ErrorString:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1033
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1034
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetErrorString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBRequest_ResponseArrayCount(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1076
    const/4 v0, 0x0

    return v0
.end method

.method public s3eFBRequest_ResponseArrayItemAsString(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1081
    const/4 v0, 0x0

    return-object v0
.end method

.method public s3eFBRequest_ResponseAsNumber(Ljava/lang/Object;)J
    .locals 3

    .prologue
    .line 1068
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_ResponseAsNumber:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1069
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1070
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseAsNumber()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public s3eFBRequest_ResponseAsString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1060
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_ResponseAsString:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1061
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1062
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseAsString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBRequest_ResponseDictionaryContainsItem(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1086
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1087
    invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBRequest;->ResponseDictionaryContainsItem(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public s3eFBRequest_ResponseDictionaryItemAsString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1092
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1093
    invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBRequest;->GetResponseDictionaryItemAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBRequest_ResponseRaw(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1053
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_ResponseRaw:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1054
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1055
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseAsString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBRequest_ResponseType(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 1046
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_ResponseType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1047
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1048
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->GetResponseType()I

    move-result v0

    return v0
.end method

.method public s3eFBRequest_Send(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 1011
    const-string v0, "s3eFacebook"

    const-string v1, "calling req send"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1012
    check-cast p1, Ls3eFacebook$s3eFBRequest;

    .line 1013
    invoke-virtual {p1}, Ls3eFacebook$s3eFBRequest;->Send()I

    move-result v0

    return v0
.end method

.method public s3eFBRequest_WithGraphPath(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 970
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_WithGraphPath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 971
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 972
    new-instance v0, Ls3eFacebook$s3eFBRequest;

    invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBRequest;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;)V

    .line 973
    invoke-virtual {v0, p2, p3}, Ls3eFacebook$s3eFBRequest;->SetGraph(Ljava/lang/String;Ljava/lang/String;)V

    .line 974
    return-object v0
.end method

.method public s3eFBRequest_WithMethodName(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 961
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_WithMethodName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 962
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 963
    new-instance v0, Ls3eFacebook$s3eFBRequest;

    invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBRequest;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;)V

    .line 964
    invoke-virtual {v0, p2, p3}, Ls3eFacebook$s3eFBRequest;->SetMethod(Ljava/lang/String;Ljava/lang/String;)V

    .line 965
    return-object v0
.end method

.method public s3eFBRequest_WithURL(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 979
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBRequest_WithURL:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 980
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 981
    new-instance v0, Ls3eFacebook$s3eFBRequest;

    invoke-direct {v0, p0, p1}, Ls3eFacebook$s3eFBRequest;-><init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;)V

    .line 982
    invoke-virtual {v0, p2, p3}, Ls3eFacebook$s3eFBRequest;->SetURL(Ljava/lang/String;Ljava/lang/String;)V

    .line 983
    const/4 v0, 0x0

    return-object v0
.end method

.method public s3eFBSession_AccessToken(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 871
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBSession_AccessToken:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 872
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 873
    invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->GetAccessToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBSession_Close(Ljava/lang/Object;I)I
    .locals 3

    .prologue
    .line 828
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBSession_Logout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " clear:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 829
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 830
    invoke-virtual {p1, p2}, Ls3eFacebook$s3eFBSession;->Close(I)I

    move-result v0

    return v0
.end method

.method public s3eFBSession_GetPermissions(Ljava/lang/Object;)[Ljava/lang/String;
    .locals 3

    .prologue
    .line 864
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBSession_GetPermissions:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 865
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 866
    invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->GetPermissions()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3eFBSession_IsActive(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 842
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBSession_IsActive:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 843
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 844
    invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->IsActive()Z

    move-result v0

    return v0
.end method

.method public s3eFBSession_LoggedIn(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 835
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eFBSession_LoggedIn:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 836
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 837
    invoke-virtual {p1}, Ls3eFacebook$s3eFBSession;->LoggedIn()Z

    move-result v0

    return v0
.end method

.method public s3eFBSession_Login(Ljava/lang/Object;[Ljava/lang/String;I)I
    .locals 2

    .prologue
    .line 821
    const-string v0, "s3eFacebook"

    const-string v1, "s3eFBSession_Login"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 822
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 823
    invoke-virtual {p1, p2, p3}, Ls3eFacebook$s3eFBSession;->Login([Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public s3eFBSession_Reauthorize(Ljava/lang/Object;[Ljava/lang/String;ZI)I
    .locals 4

    .prologue
    .line 849
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 850
    array-length v2, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p2, v0

    .line 852
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 850
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 855
    :cond_0
    const-string v0, "s3eFacebook"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "s3eFBSession_Reauthorize publish: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " audience: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " permissions: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 857
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 859
    invoke-virtual {p1, p2, p4, p3}, Ls3eFacebook$s3eFBSession;->ReauthorizeWithPermissions([Ljava/lang/String;IZ)I

    move-result v0

    return v0
.end method

.method public s3eFBTerminate(Ljava/lang/Object;)I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 811
    const-string v0, "s3eFacebook"

    const-string v1, "s3eFBTerminate"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 812
    check-cast p1, Ls3eFacebook$s3eFBSession;

    .line 813
    invoke-virtual {p1, v2}, Ls3eFacebook$s3eFBSession;->Close(I)I

    .line 814
    return v2
.end method
