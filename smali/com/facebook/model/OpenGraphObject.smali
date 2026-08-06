.class public interface abstract Lcom/facebook/model/OpenGraphObject;
.super Ljava/lang/Object;
.source "OpenGraphObject.java"

# interfaces
.implements Lcom/facebook/model/GraphObject;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/model/OpenGraphObject$Factory;
    }
.end annotation


# virtual methods
.method public abstract getApplication()Lcom/facebook/model/GraphObject;
.end method

.method public abstract getAudio()Lcom/facebook/model/GraphObjectList;
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

.method public abstract getCreateObject()Z
    .annotation runtime Lcom/facebook/model/PropertyName;
        value = "fbsdk:create_object"
    .end annotation
.end method

.method public abstract getCreatedTime()Ljava/util/Date;
.end method

.method public abstract getData()Lcom/facebook/model/GraphObject;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getDeterminer()Ljava/lang/String;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getImage()Lcom/facebook/model/GraphObjectList;
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

.method public abstract getIsScraped()Z
.end method

.method public abstract getPostActionId()Ljava/lang/String;
.end method

.method public abstract getSeeAlso()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSiteName()Ljava/lang/String;
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getType()Ljava/lang/String;
.end method

.method public abstract getUpdatedTime()Ljava/util/Date;
.end method

.method public abstract getUrl()Ljava/lang/String;
.end method

.method public abstract getVideo()Lcom/facebook/model/GraphObjectList;
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

.method public abstract setApplication(Lcom/facebook/model/GraphObject;)V
.end method

.method public abstract setAudio(Lcom/facebook/model/GraphObjectList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/model/GraphObjectList",
            "<",
            "Lcom/facebook/model/GraphObject;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setCreateObject(Z)V
    .annotation runtime Lcom/facebook/model/PropertyName;
        value = "fbsdk:create_object"
    .end annotation
.end method

.method public abstract setCreatedTime(Ljava/util/Date;)V
.end method

.method public abstract setData(Lcom/facebook/model/GraphObject;)V
.end method

.method public abstract setDescription(Ljava/lang/String;)V
.end method

.method public abstract setDeterminer(Ljava/lang/String;)V
.end method

.method public abstract setId(Ljava/lang/String;)V
.end method

.method public abstract setImage(Lcom/facebook/model/GraphObjectList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/model/GraphObjectList",
            "<",
            "Lcom/facebook/model/GraphObject;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setImageUrls(Ljava/util/List;)V
    .annotation runtime Lcom/facebook/model/CreateGraphObject;
        value = "url"
    .end annotation

    .annotation runtime Lcom/facebook/model/PropertyName;
        value = "image"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setIsScraped(Z)V
.end method

.method public abstract setPostActionId(Ljava/lang/String;)V
.end method

.method public abstract setSeeAlso(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setSiteName(Ljava/lang/String;)V
.end method

.method public abstract setTitle(Ljava/lang/String;)V
.end method

.method public abstract setType(Ljava/lang/String;)V
.end method

.method public abstract setUpdatedTime(Ljava/util/Date;)V
.end method

.method public abstract setUrl(Ljava/lang/String;)V
.end method

.method public abstract setVideo(Lcom/facebook/model/GraphObjectList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/model/GraphObjectList",
            "<",
            "Lcom/facebook/model/GraphObject;",
            ">;)V"
        }
    .end annotation
.end method
