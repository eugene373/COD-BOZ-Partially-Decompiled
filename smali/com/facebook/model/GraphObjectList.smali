.class public interface abstract Lcom/facebook/model/GraphObjectList;
.super Ljava/lang/Object;
.source "GraphObjectList.java"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/List",
        "<TT;>;"
    }
.end annotation


# virtual methods
.method public abstract castToListOf(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Lcom/facebook/model/GraphObject;",
            ">(",
            "Ljava/lang/Class",
            "<TU;>;)",
            "Lcom/facebook/model/GraphObjectList",
            "<TU;>;"
        }
    .end annotation
.end method

.method public abstract getInnerJSONArray()Lorg/json/JSONArray;
.end method
