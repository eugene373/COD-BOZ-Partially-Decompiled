.class public Lcom/google/android/gms/fitness/data/l;
.super Lcom/google/android/gms/fitness/data/k$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/data/l$1;,
        Lcom/google/android/gms/fitness/data/l$a;
    }
.end annotation


# instance fields
.field private final Ti:Lcom/google/android/gms/fitness/request/OnDataPointListener;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/fitness/request/OnDataPointListener;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/fitness/data/k$a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/request/OnDataPointListener;

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/l;->Ti:Lcom/google/android/gms/fitness/request/OnDataPointListener;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/OnDataPointListener;Lcom/google/android/gms/fitness/data/l$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/l;-><init>(Lcom/google/android/gms/fitness/request/OnDataPointListener;)V

    return-void
.end method


# virtual methods
.method public c(Lcom/google/android/gms/fitness/data/DataPoint;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/l;->Ti:Lcom/google/android/gms/fitness/request/OnDataPointListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/fitness/request/OnDataPointListener;->onDataPoint(Lcom/google/android/gms/fitness/data/DataPoint;)V

    return-void
.end method
