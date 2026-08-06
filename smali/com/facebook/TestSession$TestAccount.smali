.class interface abstract Lcom/facebook/TestSession$TestAccount;
.super Ljava/lang/Object;
.source "TestSession.java"

# interfaces
.implements Lcom/facebook/model/GraphObject;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/TestSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "TestAccount"
.end annotation


# virtual methods
.method public abstract getAccessToken()Ljava/lang/String;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract setName(Ljava/lang/String;)V
.end method
