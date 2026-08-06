.class public Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;
.super Lcom/ideaworks3d/marmalade/event/ListenerList;
.source "RequestPermissionsResultListenerList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ideaworks3d/marmalade/event/ListenerList",
        "<",
        "Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/event/ListenerList;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyAll(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V
    .locals 2

    .prologue
    .line 7
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;

    .line 9
    if-eqz v0, :cond_0

    .line 10
    invoke-interface {v0, p1}, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;->onRequestPermissionsResultEvent(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V

    goto :goto_0

    .line 12
    :cond_1
    return-void
.end method
