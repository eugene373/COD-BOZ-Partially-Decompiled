.class final Lcom/facebook/AppEventsLogger$7;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"

# interfaces
.implements Lcom/facebook/Request$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/AppEventsLogger;->buildRequestForSession(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger$SessionEventsState;ZLcom/facebook/AppEventsLogger$FlushStatistics;)Lcom/facebook/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

.field final synthetic val$flushState:Lcom/facebook/AppEventsLogger$FlushStatistics;

.field final synthetic val$postRequest:Lcom/facebook/Request;

.field final synthetic val$sessionEventsState:Lcom/facebook/AppEventsLogger$SessionEventsState;


# direct methods
.method constructor <init>(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/Request;Lcom/facebook/AppEventsLogger$SessionEventsState;Lcom/facebook/AppEventsLogger$FlushStatistics;)V
    .locals 0

    .prologue
    .line 886
    iput-object p1, p0, Lcom/facebook/AppEventsLogger$7;->val$accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

    iput-object p2, p0, Lcom/facebook/AppEventsLogger$7;->val$postRequest:Lcom/facebook/Request;

    iput-object p3, p0, Lcom/facebook/AppEventsLogger$7;->val$sessionEventsState:Lcom/facebook/AppEventsLogger$SessionEventsState;

    iput-object p4, p0, Lcom/facebook/AppEventsLogger$7;->val$flushState:Lcom/facebook/AppEventsLogger$FlushStatistics;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/Response;)V
    .locals 4

    .prologue
    .line 889
    iget-object v0, p0, Lcom/facebook/AppEventsLogger$7;->val$accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

    iget-object v1, p0, Lcom/facebook/AppEventsLogger$7;->val$postRequest:Lcom/facebook/Request;

    iget-object v2, p0, Lcom/facebook/AppEventsLogger$7;->val$sessionEventsState:Lcom/facebook/AppEventsLogger$SessionEventsState;

    iget-object v3, p0, Lcom/facebook/AppEventsLogger$7;->val$flushState:Lcom/facebook/AppEventsLogger$FlushStatistics;

    invoke-static {v0, v1, p1, v2, v3}, Lcom/facebook/AppEventsLogger;->access$900(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/Request;Lcom/facebook/Response;Lcom/facebook/AppEventsLogger$SessionEventsState;Lcom/facebook/AppEventsLogger$FlushStatistics;)V

    .line 890
    return-void
.end method
