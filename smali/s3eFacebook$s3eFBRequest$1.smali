.class Ls3eFacebook$s3eFBRequest$1;
.super Ljava/lang/Object;
.source "s3eFacebook.java"

# interfaces
.implements Lcom/facebook/Request$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls3eFacebook$s3eFBRequest;->Send()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Ls3eFacebook$s3eFBRequest;


# direct methods
.method constructor <init>(Ls3eFacebook$s3eFBRequest;)V
    .locals 0

    .prologue
    .line 660
    iput-object p1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/Response;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 664
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Request.Callback onCompleted:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 665
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    if-nez v0, :cond_1

    .line 668
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iput-boolean v4, v0, Ls3eFacebook$s3eFBRequest;->m_Complete:Z

    .line 670
    invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v0

    .line 671
    if-nez v0, :cond_0

    .line 674
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-virtual {p1}, Lcom/facebook/Response;->getRawResponse()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseString:Ljava/lang/String;

    .line 675
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iput v3, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseType:I

    .line 676
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    const/4 v1, 0x0

    iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;

    .line 685
    :goto_0
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iget-object v0, v0, Ls3eFacebook$s3eFBRequest;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeRequestCallback(Ljava/lang/Object;Z)V

    .line 699
    :goto_1
    return-void

    .line 680
    :cond_0
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;

    .line 681
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    const/4 v1, 0x3

    iput v1, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseType:I

    .line 682
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iget-object v1, v1, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseString:Ljava/lang/String;

    goto :goto_0

    .line 687
    :cond_1
    if-eqz p1, :cond_2

    .line 689
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorCode()I

    move-result v1

    iput v1, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I

    .line 690
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorString:Ljava/lang/String;

    .line 691
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iget-object v0, v0, Ls3eFacebook$s3eFBRequest;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeRequestCallback(Ljava/lang/Object;Z)V

    goto :goto_1

    .line 695
    :cond_2
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iput v4, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I

    .line 696
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    const-string v1, "null response."

    iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorString:Ljava/lang/String;

    .line 697
    iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    iget-object v0, v0, Ls3eFacebook$s3eFBRequest;->this$0:Ls3eFacebook;

    iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;

    invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeRequestCallback(Ljava/lang/Object;Z)V

    goto :goto_1
.end method
