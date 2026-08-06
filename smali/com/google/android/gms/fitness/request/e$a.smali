.class public Lcom/google/android/gms/fitness/request/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private Ts:Lcom/google/android/gms/fitness/data/DataSet;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/e$a;)Lcom/google/android/gms/fitness/data/DataSet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/e$a;->Ts:Lcom/google/android/gms/fitness/data/DataSet;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/fitness/request/e$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/e$a;->Ts:Lcom/google/android/gms/fitness/data/DataSet;

    return-object p0
.end method

.method public jj()Lcom/google/android/gms/fitness/request/e;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/e$a;->Ts:Lcom/google/android/gms/fitness/data/DataSet;

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Must set the data set"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/e$a;->Ts:Lcom/google/android/gms/fitness/data/DataSet;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSet;->getDataPoints()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Cannot use an empty data set"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/e$a;->Ts:Lcom/google/android/gms/fitness/data/DataSet;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSet;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->iM()Lcom/google/android/gms/fitness/data/a;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_2
    const-string v0, "Must set the app package name for the data source"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/request/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/e;-><init>(Lcom/google/android/gms/fitness/request/e$a;Lcom/google/android/gms/fitness/request/e$1;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_2
.end method
