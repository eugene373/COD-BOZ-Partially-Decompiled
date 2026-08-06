.class Lcom/google/android/gms/fitness/service/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/fitness/service/SensorEventDispatcher;


# instance fields
.field private final UA:Lcom/google/android/gms/fitness/data/k;


# direct methods
.method constructor <init>(Lcom/google/android/gms/fitness/data/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/k;

    iput-object v0, p0, Lcom/google/android/gms/fitness/service/b;->UA:Lcom/google/android/gms/fitness/data/k;

    return-void
.end method


# virtual methods
.method public publish(Lcom/google/android/gms/fitness/data/DataPoint;)V
    .locals 1
    .param p1, "dataPoint"    # Lcom/google/android/gms/fitness/data/DataPoint;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/fitness/service/b;->UA:Lcom/google/android/gms/fitness/data/k;

    invoke-interface {v0, p1}, Lcom/google/android/gms/fitness/data/k;->c(Lcom/google/android/gms/fitness/data/DataPoint;)V

    return-void
.end method

.method public publish(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .local p1, "dataPoints":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataPoint;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/service/b;->publish(Lcom/google/android/gms/fitness/data/DataPoint;)V

    goto :goto_0

    :cond_0
    return-void
.end method
