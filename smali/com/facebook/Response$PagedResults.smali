.class interface abstract Lcom/facebook/Response$PagedResults;
.super Ljava/lang/Object;
.source "Response.java"

# interfaces
.implements Lcom/facebook/model/GraphObject;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "PagedResults"
.end annotation


# virtual methods
.method public abstract getData()Lcom/facebook/model/GraphObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/model/GraphObjectList",
            "<",
            "Lcom/facebook/model/GraphObject;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPaging()Lcom/facebook/Response$PagingInfo;
.end method
