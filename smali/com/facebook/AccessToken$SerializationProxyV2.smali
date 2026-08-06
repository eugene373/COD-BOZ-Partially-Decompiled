.class Lcom/facebook/AccessToken$SerializationProxyV2;
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
    name = "SerializationProxyV2"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2288d511ce8549ecL


# instance fields
.field private final declinedPermissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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
.method private constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
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
    .line 376
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 377
    iput-object p2, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->expires:Ljava/util/Date;

    .line 378
    iput-object p3, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->permissions:Ljava/util/List;

    .line 379
    iput-object p4, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->declinedPermissions:Ljava/util/List;

    .line 380
    iput-object p1, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->token:Ljava/lang/String;

    .line 381
    iput-object p5, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->source:Lcom/facebook/AccessTokenSource;

    .line 382
    iput-object p6, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->lastRefresh:Ljava/util/Date;

    .line 383
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Lcom/facebook/AccessToken$1;)V
    .locals 0

    .prologue
    .line 365
    invoke-direct/range {p0 .. p6}, Lcom/facebook/AccessToken$SerializationProxyV2;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 7

    .prologue
    .line 386
    new-instance v0, Lcom/facebook/AccessToken;

    iget-object v1, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->token:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->expires:Ljava/util/Date;

    iget-object v3, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->permissions:Ljava/util/List;

    iget-object v4, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->declinedPermissions:Ljava/util/List;

    iget-object v5, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->source:Lcom/facebook/AccessTokenSource;

    iget-object v6, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->lastRefresh:Ljava/util/Date;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V

    return-object v0
.end method
