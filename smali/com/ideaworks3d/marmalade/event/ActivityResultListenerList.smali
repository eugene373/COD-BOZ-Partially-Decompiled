.class public Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;
.super Lcom/ideaworks3d/marmalade/event/ListenerList;
.source "ActivityResultListenerList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ideaworks3d/marmalade/event/ListenerList",
        "<",
        "Lcom/ideaworks3d/marmalade/event/ActivityResultListener;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 2
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/event/ListenerList;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyAll(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V
    .locals 2

    .prologue
    .line 6
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/event/ActivityResultListener;

    .line 8
    if-eqz v0, :cond_0

    .line 9
    invoke-interface {v0, p1}, Lcom/ideaworks3d/marmalade/event/ActivityResultListener;->onActivityResultEvent(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V

    goto :goto_0

    .line 11
    :cond_1
    return-void
.end method
