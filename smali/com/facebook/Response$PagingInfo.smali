.class interface abstract Lcom/facebook/Response$PagingInfo;
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
    name = "PagingInfo"
.end annotation


# virtual methods
.method public abstract getNext()Ljava/lang/String;
.end method

.method public abstract getPrevious()Ljava/lang/String;
.end method
