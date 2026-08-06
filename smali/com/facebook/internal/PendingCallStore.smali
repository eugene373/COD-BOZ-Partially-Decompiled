.class public Lcom/facebook/internal/PendingCallStore;
.super Ljava/lang/Object;
.source "PendingCallStore.java"


# static fields
.field private static final CALL_ID_ARRAY_KEY:Ljava/lang/String; = "com.facebook.internal.PendingCallStore.callIdArrayKey"

.field private static final CALL_KEY_PREFIX:Ljava/lang/String; = "com.facebook.internal.PendingCallStore."

.field private static mInstance:Lcom/facebook/internal/PendingCallStore;


# instance fields
.field private pendingCallMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/widget/FacebookDialog$PendingCall;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;

    return-void
.end method

.method private static declared-synchronized createInstance()V
    .locals 2

    .prologue
    .line 34
    const-class v1, Lcom/facebook/internal/PendingCallStore;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/internal/PendingCallStore;->mInstance:Lcom/facebook/internal/PendingCallStore;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Lcom/facebook/internal/PendingCallStore;

    invoke-direct {v0}, Lcom/facebook/internal/PendingCallStore;-><init>()V

    sput-object v0, Lcom/facebook/internal/PendingCallStore;->mInstance:Lcom/facebook/internal/PendingCallStore;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_0
    monitor-exit v1

    return-void

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static getInstance()Lcom/facebook/internal/PendingCallStore;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/facebook/internal/PendingCallStore;->mInstance:Lcom/facebook/internal/PendingCallStore;

    if-nez v0, :cond_0

    .line 27
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->createInstance()V

    .line 30
    :cond_0
    sget-object v0, Lcom/facebook/internal/PendingCallStore;->mInstance:Lcom/facebook/internal/PendingCallStore;

    return-object v0
.end method

.method private getSavedStateKeyForPendingCallId(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.facebook.internal.PendingCallStore."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;
    .locals 2

    .prologue
    .line 52
    if-nez p1, :cond_0

    .line 53
    const/4 v0, 0x0

    .line 55
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/FacebookDialog$PendingCall;

    goto :goto_0
.end method

.method public restoreFromSavedInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 69
    const-string v0, "com.facebook.internal.PendingCallStore.callIdArrayKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 72
    invoke-direct {p0, v0}, Lcom/facebook/internal/PendingCallStore;->getSavedStateKeyForPendingCallId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 73
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/FacebookDialog$PendingCall;

    .line 75
    if-eqz v0, :cond_0

    .line 76
    iget-object v2, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 80
    :cond_1
    return-void
.end method

.method public saveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 59
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    const-string v1, "com.facebook.internal.PendingCallStore.callIdArrayKey"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/FacebookDialog$PendingCall;

    .line 63
    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/internal/PendingCallStore;->getSavedStateKeyForPendingCallId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 66
    :cond_0
    return-void
.end method

.method public stopTrackingPendingCall(Ljava/util/UUID;)V
    .locals 2

    .prologue
    .line 46
    if-eqz p1, :cond_0

    .line 47
    iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    :cond_0
    return-void
.end method

.method public trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V
    .locals 2

    .prologue
    .line 40
    if-eqz p1, :cond_0

    .line 41
    iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    :cond_0
    return-void
.end method
