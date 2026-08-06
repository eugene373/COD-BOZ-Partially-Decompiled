.class Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/LikeActionController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SerializeToDiskWorkItem"
.end annotation


# instance fields
.field private cacheKey:Ljava/lang/String;

.field private controllerJson:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1438
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1439
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;->cacheKey:Ljava/lang/String;

    .line 1440
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;->controllerJson:Ljava/lang/String;

    .line 1441
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1445
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;->cacheKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;->controllerJson:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2900(Ljava/lang/String;Ljava/lang/String;)V

    .line 1446
    return-void
.end method
