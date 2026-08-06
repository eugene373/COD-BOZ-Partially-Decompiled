.class final enum Lcom/facebook/AppEventsLogger$FlushReason;
.super Ljava/lang/Enum;
.source "AppEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AppEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "FlushReason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/AppEventsLogger$FlushReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/AppEventsLogger$FlushReason;

.field public static final enum EAGER_FLUSHING_EVENT:Lcom/facebook/AppEventsLogger$FlushReason;

.field public static final enum EVENT_THRESHOLD:Lcom/facebook/AppEventsLogger$FlushReason;

.field public static final enum EXPLICIT:Lcom/facebook/AppEventsLogger$FlushReason;

.field public static final enum PERSISTED_EVENTS:Lcom/facebook/AppEventsLogger$FlushReason;

.field public static final enum SESSION_CHANGE:Lcom/facebook/AppEventsLogger$FlushReason;

.field public static final enum TIMER:Lcom/facebook/AppEventsLogger$FlushReason;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 595
    new-instance v0, Lcom/facebook/AppEventsLogger$FlushReason;

    const-string v1, "EXPLICIT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/AppEventsLogger$FlushReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->EXPLICIT:Lcom/facebook/AppEventsLogger$FlushReason;

    .line 596
    new-instance v0, Lcom/facebook/AppEventsLogger$FlushReason;

    const-string v1, "TIMER"

    invoke-direct {v0, v1, v4}, Lcom/facebook/AppEventsLogger$FlushReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->TIMER:Lcom/facebook/AppEventsLogger$FlushReason;

    .line 597
    new-instance v0, Lcom/facebook/AppEventsLogger$FlushReason;

    const-string v1, "SESSION_CHANGE"

    invoke-direct {v0, v1, v5}, Lcom/facebook/AppEventsLogger$FlushReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->SESSION_CHANGE:Lcom/facebook/AppEventsLogger$FlushReason;

    .line 598
    new-instance v0, Lcom/facebook/AppEventsLogger$FlushReason;

    const-string v1, "PERSISTED_EVENTS"

    invoke-direct {v0, v1, v6}, Lcom/facebook/AppEventsLogger$FlushReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->PERSISTED_EVENTS:Lcom/facebook/AppEventsLogger$FlushReason;

    .line 599
    new-instance v0, Lcom/facebook/AppEventsLogger$FlushReason;

    const-string v1, "EVENT_THRESHOLD"

    invoke-direct {v0, v1, v7}, Lcom/facebook/AppEventsLogger$FlushReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->EVENT_THRESHOLD:Lcom/facebook/AppEventsLogger$FlushReason;

    .line 600
    new-instance v0, Lcom/facebook/AppEventsLogger$FlushReason;

    const-string v1, "EAGER_FLUSHING_EVENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/AppEventsLogger$FlushReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->EAGER_FLUSHING_EVENT:Lcom/facebook/AppEventsLogger$FlushReason;

    .line 593
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/AppEventsLogger$FlushReason;

    sget-object v1, Lcom/facebook/AppEventsLogger$FlushReason;->EXPLICIT:Lcom/facebook/AppEventsLogger$FlushReason;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/AppEventsLogger$FlushReason;->TIMER:Lcom/facebook/AppEventsLogger$FlushReason;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/AppEventsLogger$FlushReason;->SESSION_CHANGE:Lcom/facebook/AppEventsLogger$FlushReason;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/AppEventsLogger$FlushReason;->PERSISTED_EVENTS:Lcom/facebook/AppEventsLogger$FlushReason;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/AppEventsLogger$FlushReason;->EVENT_THRESHOLD:Lcom/facebook/AppEventsLogger$FlushReason;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/AppEventsLogger$FlushReason;->EAGER_FLUSHING_EVENT:Lcom/facebook/AppEventsLogger$FlushReason;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->$VALUES:[Lcom/facebook/AppEventsLogger$FlushReason;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 594
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/AppEventsLogger$FlushReason;
    .locals 1

    .prologue
    .line 593
    const-class v0, Lcom/facebook/AppEventsLogger$FlushReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/AppEventsLogger$FlushReason;

    return-object v0
.end method

.method public static values()[Lcom/facebook/AppEventsLogger$FlushReason;
    .locals 1

    .prologue
    .line 593
    sget-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->$VALUES:[Lcom/facebook/AppEventsLogger$FlushReason;

    invoke-virtual {v0}, [Lcom/facebook/AppEventsLogger$FlushReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/AppEventsLogger$FlushReason;

    return-object v0
.end method
