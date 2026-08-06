.class Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;
.super Ljava/lang/Object;
.source "Session.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/Session$AuthorizationRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AuthRequestSerializationProxyV1"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x79685fde6eced24fL


# instance fields
.field private final applicationId:Ljava/lang/String;

.field private final defaultAudience:Ljava/lang/String;

.field private isLegacy:Z

.field private final loginBehavior:Lcom/facebook/SessionLoginBehavior;

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

.field private final requestCode:I

.field private final validateSameFbidAsToken:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/facebook/SessionLoginBehavior;ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/SessionLoginBehavior;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 2098
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2099
    iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->loginBehavior:Lcom/facebook/SessionLoginBehavior;

    .line 2100
    iput p2, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->requestCode:I

    .line 2101
    iput-object p3, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->permissions:Ljava/util/List;

    .line 2102
    iput-object p4, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->defaultAudience:Ljava/lang/String;

    .line 2103
    iput-boolean p5, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->isLegacy:Z

    .line 2104
    iput-object p6, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->applicationId:Ljava/lang/String;

    .line 2105
    iput-object p7, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->validateSameFbidAsToken:Ljava/lang/String;

    .line 2106
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/SessionLoginBehavior;ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/Session$1;)V
    .locals 0

    .prologue
    .line 2086
    invoke-direct/range {p0 .. p7}, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;-><init>(Lcom/facebook/SessionLoginBehavior;ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 9

    .prologue
    .line 2109
    new-instance v0, Lcom/facebook/Session$AuthorizationRequest;

    iget-object v1, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->loginBehavior:Lcom/facebook/SessionLoginBehavior;

    iget v2, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->requestCode:I

    iget-object v3, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->permissions:Ljava/util/List;

    iget-object v4, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->defaultAudience:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->isLegacy:Z

    iget-object v6, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->applicationId:Ljava/lang/String;

    iget-object v7, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->validateSameFbidAsToken:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/facebook/Session$AuthorizationRequest;-><init>(Lcom/facebook/SessionLoginBehavior;ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/Session$1;)V

    return-object v0
.end method
