.class interface abstract Lcom/facebook/TestSession$TestAccountsResponse;
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
    name = "TestAccountsResponse"
.end annotation


# virtual methods
.method public abstract getData()Lcom/facebook/model/GraphObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/model/GraphObjectList",
            "<",
            "Lcom/facebook/TestSession$TestAccount;",
            ">;"
        }
    .end annotation
.end method
