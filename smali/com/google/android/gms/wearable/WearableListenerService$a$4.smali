.class Lcom/google/android/gms/wearable/WearableListenerService$a$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/WearableListenerService$a;->b(Lcom/google/android/gms/wearable/internal/ak;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic avh:Lcom/google/android/gms/wearable/WearableListenerService$a;

.field final synthetic avj:Lcom/google/android/gms/wearable/internal/ak;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$a;Lcom/google/android/gms/wearable/internal/ak;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$a$4;->avh:Lcom/google/android/gms/wearable/WearableListenerService$a;

    iput-object p2, p0, Lcom/google/android/gms/wearable/WearableListenerService$a$4;->avj:Lcom/google/android/gms/wearable/internal/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$a$4;->avh:Lcom/google/android/gms/wearable/WearableListenerService$a;

    iget-object v0, v0, Lcom/google/android/gms/wearable/WearableListenerService$a;->avf:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$a$4;->avj:Lcom/google/android/gms/wearable/internal/ak;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/WearableListenerService;->onPeerDisconnected(Lcom/google/android/gms/wearable/Node;)V

    return-void
.end method
