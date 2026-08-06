.class Lcom/google/android/gms/wearable/internal/ag$1;
.super Lcom/google/android/gms/wearable/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/ag;->sendMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/d",
        "<",
        "Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic CY:[B

.field final synthetic avD:Ljava/lang/String;

.field final synthetic avE:Ljava/lang/String;

.field final synthetic avF:Lcom/google/android/gms/wearable/internal/ag;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/ag;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/ag$1;->avF:Lcom/google/android/gms/wearable/internal/ag;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/ag$1;->avD:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/ag$1;->avE:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/ag$1;->CY:[B

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/d;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/aw;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ag$1;->a(Lcom/google/android/gms/wearable/internal/aw;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/aw;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ag$1;->avD:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ag$1;->avE:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/ag$1;->CY:[B

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method

.method protected aJ(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/ag$a;

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/ag$a;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    return-object v0
.end method

.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ag$1;->aJ(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;

    move-result-object v0

    return-object v0
.end method
