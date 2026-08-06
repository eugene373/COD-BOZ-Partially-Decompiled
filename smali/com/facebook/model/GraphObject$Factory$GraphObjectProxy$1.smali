.class Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy$1;
.super Ljava/lang/Object;
.source "GraphObject.java"

# interfaces
.implements Ljava/lang/reflect/ParameterizedType;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->proxyGraphObjectMethods(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;

.field final synthetic val$expectedType:Ljava/lang/Class;


# direct methods
.method constructor <init>(Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 601
    iput-object p1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy$1;->this$0:Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;

    iput-object p2, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy$1;->val$expectedType:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActualTypeArguments()[Ljava/lang/reflect/Type;
    .locals 3

    .prologue
    .line 604
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy$1;->val$expectedType:Ljava/lang/Class;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public getOwnerType()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 609
    const/4 v0, 0x0

    return-object v0
.end method

.method public getRawType()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 614
    const-class v0, Lcom/facebook/model/GraphObjectList;

    return-object v0
.end method
