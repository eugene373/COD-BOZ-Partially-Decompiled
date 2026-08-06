.class final Lcom/facebook/AppEventsLogger$1;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/AppEventsLogger;->activateApp(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$eventTime:J

.field final synthetic val$logger:Lcom/facebook/AppEventsLogger;

.field final synthetic val$sourceApplicationInfo:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/facebook/AppEventsLogger$1;->val$logger:Lcom/facebook/AppEventsLogger;

    iput-wide p2, p0, Lcom/facebook/AppEventsLogger$1;->val$eventTime:J

    iput-object p4, p0, Lcom/facebook/AppEventsLogger$1;->val$sourceApplicationInfo:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 295
    iget-object v0, p0, Lcom/facebook/AppEventsLogger$1;->val$logger:Lcom/facebook/AppEventsLogger;

    iget-wide v2, p0, Lcom/facebook/AppEventsLogger$1;->val$eventTime:J

    iget-object v1, p0, Lcom/facebook/AppEventsLogger$1;->val$sourceApplicationInfo:Ljava/lang/String;

    invoke-static {v0, v2, v3, v1}, Lcom/facebook/AppEventsLogger;->access$100(Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V

    .line 296
    return-void
.end method
