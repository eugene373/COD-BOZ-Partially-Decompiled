.class Lcom/google/android/gms/internal/ck$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ck;->a(JJ)Lcom/google/android/gms/internal/cq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic pU:Lcom/google/android/gms/internal/cq;

.field final synthetic pV:Lcom/google/android/gms/internal/ck;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ck;Lcom/google/android/gms/internal/cq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ck$1;->pV:Lcom/google/android/gms/internal/ck;

    iput-object p2, p0, Lcom/google/android/gms/internal/ck$1;->pU:Lcom/google/android/gms/internal/cq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ck$1;->pU:Lcom/google/android/gms/internal/cq;

    iget-object v0, v0, Lcom/google/android/gms/internal/cq;->qz:Lcom/google/android/gms/internal/cu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cu;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not destroy mediation adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
