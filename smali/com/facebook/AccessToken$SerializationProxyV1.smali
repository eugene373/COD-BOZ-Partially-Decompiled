.class Lcom/facebook/AccessToken$SerializationProxyV1;
.super Ljava/lang/Object;
.source "AccessToken.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AccessToken;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SerializationProxyV1"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2288d511ce8549edL


# instance fields
.field private final expires:Ljava/util/Date;

.field private final lastRefresh:Ljava/util/Date;

.field private final permissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final source:Lcom/facebook/AccessTokenSource;

.field private final token:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/AccessTokenSource;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    .prologue
    .line 352
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    iput-object p2, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->expires:Ljava/util/Date;

    .line 354
    iput-object p3, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->permissions:Ljava/util/List;

    .line 355
    iput-object p1, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->token:Ljava/lang/String;

    .line 356
    iput-object p4, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->source:Lcom/facebook/AccessTokenSource;

    .line 357
    iput-object p5, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->lastRefresh:Ljava/util/Date;

    .line 358
    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 7

    .prologue
    .line 361
    new-instance v0, Lcom/facebook/AccessToken;

    iget-object v1, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->token:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->expires:Ljava/util/Date;

    iget-object v3, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->permissions:Ljava/util/List;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->source:Lcom/facebook/AccessTokenSource;

    iget-object v6, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->lastRefresh:Ljava/util/Date;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V

    return-object v0
.end method
