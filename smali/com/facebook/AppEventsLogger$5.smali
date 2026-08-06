.class final Lcom/facebook/AppEventsLogger$5;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/AppEventsLogger;->logEvent(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AppEvent;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$event:Lcom/facebook/AppEventsLogger$AppEvent;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger$AppEvent;)V
    .locals 0

    .prologue
    .line 705
    iput-object p1, p0, Lcom/facebook/AppEventsLogger$5;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/AppEventsLogger$5;->val$accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

    iput-object p3, p0, Lcom/facebook/AppEventsLogger$5;->val$event:Lcom/facebook/AppEventsLogger$AppEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 708
    iget-object v0, p0, Lcom/facebook/AppEventsLogger$5;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/AppEventsLogger$5;->val$accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

    invoke-static {v0, v1}, Lcom/facebook/AppEventsLogger;->access$600(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/AppEventsLogger$SessionEventsState;

    move-result-object v0

    .line 709
    iget-object v1, p0, Lcom/facebook/AppEventsLogger$5;->val$event:Lcom/facebook/AppEventsLogger$AppEvent;

    invoke-virtual {v0, v1}, Lcom/facebook/AppEventsLogger$SessionEventsState;->addEvent(Lcom/facebook/AppEventsLogger$AppEvent;)V

    .line 710
    invoke-static {}, Lcom/facebook/AppEventsLogger;->access$700()V

    .line 711
    return-void
.end method
