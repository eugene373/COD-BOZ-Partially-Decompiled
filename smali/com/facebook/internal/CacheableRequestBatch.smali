.class public Lcom/facebook/internal/CacheableRequestBatch;
.super Lcom/facebook/RequestBatch;
.source "CacheableRequestBatch.java"


# instance fields
.field private cacheKey:Ljava/lang/String;

.field private forceRoundTrip:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/RequestBatch;-><init>()V

    .line 32
    return-void
.end method

.method public varargs constructor <init>([Lcom/facebook/Request;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/RequestBatch;-><init>([Lcom/facebook/Request;)V

    .line 36
    return-void
.end method


# virtual methods
.method public final getCacheKeyOverride()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/internal/CacheableRequestBatch;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getForceRoundTrip()Z
    .locals 1

    .prologue
    .line 50
    iget-boolean v0, p0, Lcom/facebook/internal/CacheableRequestBatch;->forceRoundTrip:Z

    return v0
.end method

.method public final setCacheKeyOverride(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/internal/CacheableRequestBatch;->cacheKey:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public final setForceRoundTrip(Z)V
    .locals 0

    .prologue
    .line 54
    iput-boolean p1, p0, Lcom/facebook/internal/CacheableRequestBatch;->forceRoundTrip:Z

    .line 55
    return-void
.end method
