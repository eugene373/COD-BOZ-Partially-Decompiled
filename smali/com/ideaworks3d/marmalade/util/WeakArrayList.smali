.class public Lcom/ideaworks3d/marmalade/util/WeakArrayList;
.super Ljava/util/AbstractList;
.source "WeakArrayList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private m_list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;

    .line 10
    return-void
.end method

.method static synthetic access$000(Lcom/ideaworks3d/marmalade/util/WeakArrayList;)Ljava/util/List;
    .locals 1

    .prologue
    .line 4
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 25
    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 27
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public expunge()V
    .locals 2

    .prologue
    .line 13
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 32
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 33
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 43
    new-instance v0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;-><init>(Lcom/ideaworks3d/marmalade/util/WeakArrayList;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
