.class Ls3eFacebook$s3eFBRequest;
.super Ljava/lang/Object;
.source "s3eFacebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3eFacebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "s3eFBRequest"
.end annotation


# instance fields
.field m_Complete:Z

.field m_ErrorCode:I

.field m_ErrorString:Ljava/lang/String;

.field m_Graph:Ljava/lang/String;

.field m_HttpMethod:Ljava/lang/String;

.field m_Method:Ljava/lang/String;

.field m_Params:Landroid/os/Bundle;

.field m_Request:Lcom/facebook/Request;

.field m_Response:Lorg/json/JSONObject;

.field m_ResponseString:Ljava/lang/String;

.field m_ResponseType:I

.field m_URL:Ljava/lang/String;

.field m_s3eSession:Ls3eFacebook$s3eFBSession;

.field final synthetic this$0:Ls3eFacebook;


# direct methods
.method constructor <init>(Ls3eFacebook;Ls3eFacebook$s3eFBSession;)V
    .locals 1

    .prologue
    .line 624
    iput-object p1, p0, Ls3eFacebook$s3eFBRequest;->this$0:Ls3eFacebook;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 625
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;

    .line 626
    iput-object p2, p0, Ls3eFacebook$s3eFBRequest;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    .line 627
    return-void
.end method


# virtual methods
.method AddParamLong(Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 648
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 649
    return-void
.end method

.method AddParamString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 643
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    return-void
.end method

.method GetComplete()Z
    .locals 1

    .prologue
    .line 758
    iget-boolean v0, p0, Ls3eFacebook$s3eFBRequest;->m_Complete:Z

    return v0
.end method

.method GetError()Z
    .locals 1

    .prologue
    .line 743
    iget v0, p0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method GetErrorCode()I
    .locals 1

    .prologue
    .line 748
    iget v0, p0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I

    return v0
.end method

.method GetErrorString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 753
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_ErrorString:Ljava/lang/String;

    return-object v0
.end method

.method GetResponseAsNumber()I
    .locals 1

    .prologue
    .line 774
    const/4 v0, 0x0

    return v0
.end method

.method GetResponseAsString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 768
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_ResponseString:Ljava/lang/String;

    return-object v0
.end method

.method GetResponseDictionaryItemAsString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 793
    :try_start_0
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 797
    :goto_0
    return-object v0

    .line 795
    :catch_0
    move-exception v0

    .line 797
    const/4 v0, 0x0

    goto :goto_0
.end method

.method GetResponseType()I
    .locals 1

    .prologue
    .line 763
    iget v0, p0, Ls3eFacebook$s3eFBRequest;->m_ResponseType:I

    return v0
.end method

.method ResponseDictionaryContainsItem(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 781
    :try_start_0
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 785
    :goto_0
    return v0

    .line 783
    :catch_0
    move-exception v0

    .line 785
    const/4 v0, 0x0

    goto :goto_0
.end method

.method Send()I
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 659
    new-instance v5, Ls3eFacebook$s3eFBRequest$1;

    invoke-direct {v5, p0}, Ls3eFacebook$s3eFBRequest$1;-><init>(Ls3eFacebook$s3eFBRequest;)V

    .line 705
    :try_start_0
    iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/HttpMethod;->valueOf(Ljava/lang/String;)Lcom/facebook/HttpMethod;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 713
    iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_URL:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 715
    const-string v0, "s3eFacebook"

    const-string v1, "Calling request with url and http method"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 716
    new-instance v0, Lcom/facebook/Request;

    iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    iget-object v1, v1, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    iget-object v2, p0, Ls3eFacebook$s3eFBRequest;->m_URL:Ljava/lang/String;

    iget-object v3, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V

    iput-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Request:Lcom/facebook/Request;

    .line 736
    :goto_0
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Request:Lcom/facebook/Request;

    invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 738
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 707
    :catch_0
    move-exception v1

    .line 709
    const-string v1, "s3eFacebook"

    const-string v2, "Illegal http method."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 718
    :cond_0
    iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_Method:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 722
    const-string v1, "s3eFacebook"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Calling request with method: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Ls3eFacebook$s3eFBRequest;->m_Method:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 723
    const-string v1, "s3eFacebook"

    const-string v2, "Request.newRestRequest no longer supported - return error"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 731
    :cond_1
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calling request with graph: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ls3eFacebook$s3eFBRequest;->m_Graph:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 732
    new-instance v0, Lcom/facebook/Request;

    iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_s3eSession:Ls3eFacebook$s3eFBSession;

    iget-object v1, v1, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    iget-object v2, p0, Ls3eFacebook$s3eFBRequest;->m_Graph:Ljava/lang/String;

    iget-object v3, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V

    iput-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Request:Lcom/facebook/Request;

    goto :goto_0
.end method

.method SetGraph(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 637
    iput-object p1, p0, Ls3eFacebook$s3eFBRequest;->m_Graph:Ljava/lang/String;

    .line 638
    iput-object p2, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;

    .line 639
    return-void
.end method

.method SetMethod(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 631
    iput-object p1, p0, Ls3eFacebook$s3eFBRequest;->m_Method:Ljava/lang/String;

    .line 632
    iput-object p2, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;

    .line 633
    return-void
.end method

.method SetURL(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 653
    iput-object p1, p0, Ls3eFacebook$s3eFBRequest;->m_URL:Ljava/lang/String;

    .line 654
    iput-object p2, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;

    .line 655
    return-void
.end method
