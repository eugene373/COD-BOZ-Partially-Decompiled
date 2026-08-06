.class public Lcom/ideaworks3d/marmalade/event/ListenerList;
.super Ljava/lang/Object;
.source "ListenerList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ideaworks3d/marmalade/util/WeakArrayList",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    .line 12
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 15
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->expunge()V

    .line 16
    if-eqz p1, :cond_0

    .line 17
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 18
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 22
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->expunge()V

    .line 23
    if-eqz p1, :cond_0

    .line 24
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 25
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
