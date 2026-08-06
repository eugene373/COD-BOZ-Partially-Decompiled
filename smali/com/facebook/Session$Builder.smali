.class public final Lcom/facebook/Session$Builder;
.super Ljava/lang/Object;
.source "Session.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/Session;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private applicationId:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 1796
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1797
    iput-object p1, p0, Lcom/facebook/Session$Builder;->context:Landroid/content/Context;

    .line 1798
    return-void
.end method


# virtual methods
.method public build()Lcom/facebook/Session;
    .locals 4

    .prologue
    .line 1828
    new-instance v0, Lcom/facebook/Session;

    iget-object v1, p0, Lcom/facebook/Session$Builder;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/Session$Builder;->applicationId:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/Session$Builder;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/Session;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/TokenCachingStrategy;)V

    return-object v0
.end method

.method public setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;
    .locals 0

    .prologue
    .line 1807
    iput-object p1, p0, Lcom/facebook/Session$Builder;->applicationId:Ljava/lang/String;

    .line 1808
    return-object p0
.end method

.method public setTokenCachingStrategy(Lcom/facebook/TokenCachingStrategy;)Lcom/facebook/Session$Builder;
    .locals 0

    .prologue
    .line 1818
    iput-object p1, p0, Lcom/facebook/Session$Builder;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;

    .line 1819
    return-object p0
.end method
