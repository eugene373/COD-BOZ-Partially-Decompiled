.class public Lcom/facebook/InsightsLogger;
.super Ljava/lang/Object;
.source "InsightsLogger.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final EVENT_NAME_LOG_CONVERSION_PIXEL:Ljava/lang/String; = "fb_log_offsite_pixel"

.field private static final EVENT_PARAMETER_PIXEL_ID:Ljava/lang/String; = "fb_offsite_pixel_id"

.field private static final EVENT_PARAMETER_PIXEL_VALUE:Ljava/lang/String; = "fb_offsite_pixel_value"


# instance fields
.field private appEventsLogger:Lcom/facebook/AppEventsLogger;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-static {p1, p2, p3}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/InsightsLogger;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    .line 40
    return-void
.end method

.method public static newLogger(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/InsightsLogger;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 46
    new-instance v0, Lcom/facebook/InsightsLogger;

    invoke-direct {v0, p0, v1, v1}, Lcom/facebook/InsightsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V

    return-object v0
.end method

.method public static newLogger(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/InsightsLogger;
    .locals 2

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/InsightsLogger;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lcom/facebook/InsightsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V

    return-object v0
.end method

.method public static newLogger(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/Session;)Lcom/facebook/InsightsLogger;
    .locals 1

    .prologue
    .line 60
    new-instance v0, Lcom/facebook/InsightsLogger;

    invoke-direct {v0, p0, p2, p3}, Lcom/facebook/InsightsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V

    return-object v0
.end method


# virtual methods
.method public logConversionPixel(Ljava/lang/String;D)V
    .locals 4

    .prologue
    .line 82
    if-nez p1, :cond_0

    .line 83
    sget-object v0, Lcom/facebook/LoggingBehavior;->DEVELOPER_ERRORS:Lcom/facebook/LoggingBehavior;

    const-string v1, "Insights"

    const-string v2, "pixelID cannot be null"

    invoke-static {v0, v1, v2}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_0
    return-void

    .line 87
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 88
    const-string v1, "fb_offsite_pixel_id"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v1, "fb_offsite_pixel_value"

    invoke-virtual {v0, v1, p2, p3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 91
    iget-object v1, p0, Lcom/facebook/InsightsLogger;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v2, "fb_log_offsite_pixel"

    invoke-virtual {v1, v2, p2, p3, v0}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;DLandroid/os/Bundle;)V

    .line 92
    invoke-static {}, Lcom/facebook/AppEventsLogger;->eagerFlush()V

    goto :goto_0
.end method

.method public logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;)V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/InsightsLogger;->logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V

    .line 68
    return-void
.end method

.method public logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/InsightsLogger;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/AppEventsLogger;->logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V

    .line 75
    return-void
.end method
