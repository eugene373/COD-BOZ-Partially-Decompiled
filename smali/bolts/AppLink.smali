.class public Lbolts/AppLink;
.super Ljava/lang/Object;
.source "AppLink.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbolts/AppLink$Target;
    }
.end annotation


# instance fields
.field private sourceUrl:Landroid/net/Uri;

.field private targets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lbolts/AppLink$Target;",
            ">;"
        }
    .end annotation
.end field

.field private webUrl:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;)V
    .locals 0
    .param p1, "sourceUrl"    # Landroid/net/Uri;
    .param p3, "webUrl"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/List",
            "<",
            "Lbolts/AppLink$Target;",
            ">;",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    .prologue
    .line 90
    .local p2, "targets":Ljava/util/List;, "Ljava/util/List<Lbolts/AppLink$Target;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Lbolts/AppLink;->sourceUrl:Landroid/net/Uri;

    .line 92
    if-nez p2, :cond_0

    .line 93
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 95
    :cond_0
    iput-object p2, p0, Lbolts/AppLink;->targets:Ljava/util/List;

    .line 96
    iput-object p3, p0, Lbolts/AppLink;->webUrl:Landroid/net/Uri;

    .line 97
    return-void
.end method


# virtual methods
.method public getSourceUrl()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lbolts/AppLink;->sourceUrl:Landroid/net/Uri;

    return-object v0
.end method

.method public getTargets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lbolts/AppLink$Target;",
            ">;"
        }
    .end annotation

    .prologue
    .line 110
    iget-object v0, p0, Lbolts/AppLink;->targets:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getWebUrl()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lbolts/AppLink;->webUrl:Landroid/net/Uri;

    return-object v0
.end method
