.class public Lbolts/AggregateException;
.super Ljava/lang/Exception;
.source "AggregateException.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private errors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Exception;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 23
    .local p1, "errors":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Exception;>;"
    const-string v0, "There were multiple errors."

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, Lbolts/AggregateException;->errors:Ljava/util/List;

    .line 26
    return-void
.end method


# virtual methods
.method public getErrors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation

    .prologue
    .line 32
    iget-object v0, p0, Lbolts/AggregateException;->errors:Ljava/util/List;

    return-object v0
.end method
