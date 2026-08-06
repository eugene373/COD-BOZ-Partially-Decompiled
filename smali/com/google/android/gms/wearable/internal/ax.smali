.class public Lcom/google/android/gms/wearable/internal/ax;
.super Lcom/google/android/gms/wearable/internal/ae$a;


# instance fields
.field private final avX:Lcom/google/android/gms/wearable/DataApi$DataListener;

.field private final avY:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

.field private final avZ:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

.field private final awa:[Landroid/content/IntentFilter;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;[Landroid/content/IntentFilter;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/ae$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/ax;->avX:Lcom/google/android/gms/wearable/DataApi$DataListener;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/ax;->avY:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/ax;->avZ:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/ax;->awa:[Landroid/content/IntentFilter;

    return-void
.end method

.method public static a(Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ax;
    .locals 2

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/ax;

    invoke-direct {v0, p0, v1, v1, p1}, Lcom/google/android/gms/wearable/internal/ax;-><init>(Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;[Landroid/content/IntentFilter;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ax;
    .locals 2

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/ax;

    invoke-direct {v0, v1, p0, v1, p1}, Lcom/google/android/gms/wearable/internal/ax;-><init>(Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;[Landroid/content/IntentFilter;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/wearable/NodeApi$NodeListener;)Lcom/google/android/gms/wearable/internal/ax;
    .locals 2

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/ax;

    invoke-direct {v0, v1, v1, p0, v1}, Lcom/google/android/gms/wearable/internal/ax;-><init>(Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;[Landroid/content/IntentFilter;)V

    return-object v0
.end method


# virtual methods
.method public Z(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avX:Lcom/google/android/gms/wearable/DataApi$DataListener;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avX:Lcom/google/android/gms/wearable/DataApi$DataListener;

    new-instance v1, Lcom/google/android/gms/wearable/DataEventBuffer;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/DataEventBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/DataApi$DataListener;->onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/wearable/internal/ah;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avY:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avY:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/MessageApi$MessageListener;->onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/internal/ak;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avZ:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avZ:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/NodeApi$NodeListener;->onPeerConnected(Lcom/google/android/gms/wearable/Node;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/wearable/internal/ak;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avZ:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->avZ:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/NodeApi$NodeListener;->onPeerDisconnected(Lcom/google/android/gms/wearable/Node;)V

    :cond_0
    return-void
.end method

.method public qb()[Landroid/content/IntentFilter;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ax;->awa:[Landroid/content/IntentFilter;

    return-object v0
.end method
