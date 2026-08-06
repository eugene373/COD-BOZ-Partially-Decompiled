.class Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SerializationProxyV1"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2288d511ce8549edL


# instance fields
.field private final accessToken:Ljava/lang/String;

.field private final appId:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 219
    iput-object p1, p0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->accessToken:Ljava/lang/String;

    .line 220
    iput-object p2, p0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->appId:Ljava/lang/String;

    .line 221
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AppEventsLogger$1;)V
    .locals 0

    .prologue
    .line 213
    invoke-direct {p0, p1, p2}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 224
    new-instance v0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

    iget-object v1, p0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->accessToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->appId:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
