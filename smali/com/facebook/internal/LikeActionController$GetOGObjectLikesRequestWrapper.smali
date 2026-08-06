.class Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;
.super Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
.source "LikeActionController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/LikeActionController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GetOGObjectLikesRequestWrapper"
.end annotation


# instance fields
.field objectIsLiked:Z

.field final synthetic this$0:Lcom/facebook/internal/LikeActionController;

.field unlikeToken:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 1219
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 1220
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 1216
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$2800(Lcom/facebook/internal/LikeActionController;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->objectIsLiked:Z

    .line 1222
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1223
    const-string v1, "fields"

    const-string v2, "id,application"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1224
    const-string v1, "object"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1226
    new-instance v1, Lcom/facebook/Request;

    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->access$2700(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/Session;

    move-result-object v2

    const-string v3, "me/og.likes"

    sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    invoke-virtual {p0, v1}, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->setRequest(Lcom/facebook/Request;)V

    .line 1227
    return-void
.end method


# virtual methods
.method protected processError(Lcom/facebook/FacebookRequestError;)V
    .locals 6

    .prologue
    .line 1250
    sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Error fetching like status for object \'%s\' : %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->objectId:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1253
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;

    const-string v1, "get_og_object_like"

    invoke-static {v0, v1, p1}, Lcom/facebook/internal/LikeActionController;->access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V

    .line 1254
    return-void
.end method

.method protected processSuccess(Lcom/facebook/Response;)V
    .locals 6

    .prologue
    .line 1231
    invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v0

    const-string v1, "data"

    invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->tryGetJSONArrayFromResponse(Lcom/facebook/model/GraphObject;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 1232
    if-eqz v1, :cond_1

    .line 1233
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 1234
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 1235
    if-eqz v2, :cond_0

    .line 1236
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->objectIsLiked:Z

    .line 1237
    const-string v3, "application"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 1238
    if-eqz v3, :cond_0

    .line 1239
    iget-object v4, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v4}, Lcom/facebook/internal/LikeActionController;->access$2700(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/Session;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/Session;->getApplicationId()Ljava/lang/String;

    move-result-object v4

    const-string v5, "id"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1240
    const-string v3, "id"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->unlikeToken:Ljava/lang/String;

    .line 1233
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1246
    :cond_1
    return-void
.end method
