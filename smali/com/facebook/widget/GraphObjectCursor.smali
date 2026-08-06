.class interface abstract Lcom/facebook/widget/GraphObjectCursor;
.super Ljava/lang/Object;
.source "GraphObjectCursor.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/facebook/model/GraphObject;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract areMoreObjectsAvailable()Z
.end method

.method public abstract close()V
.end method

.method public abstract getCount()I
.end method

.method public abstract getGraphObject()Lcom/facebook/model/GraphObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract getPosition()I
.end method

.method public abstract isAfterLast()Z
.end method

.method public abstract isBeforeFirst()Z
.end method

.method public abstract isClosed()Z
.end method

.method public abstract isFirst()Z
.end method

.method public abstract isFromCache()Z
.end method

.method public abstract isLast()Z
.end method

.method public abstract move(I)Z
.end method

.method public abstract moveToFirst()Z
.end method

.method public abstract moveToLast()Z
.end method

.method public abstract moveToNext()Z
.end method

.method public abstract moveToPosition(I)Z
.end method

.method public abstract moveToPrevious()Z
.end method
