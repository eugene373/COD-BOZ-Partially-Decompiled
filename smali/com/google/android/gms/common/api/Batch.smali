.class public final Lcom/google/android/gms/common/api/Batch;
.super Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/api/Batch$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult",
        "<",
        "Lcom/google/android/gms/common/api/BatchResult;",
        ">;"
    }
.end annotation


# instance fields
.field private IA:I

.field private IB:Z

.field private IC:Z

.field private final IE:[Lcom/google/android/gms/common/api/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<*>;"
        }
    .end annotation
.end field

.field private final mw:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/util/List;Landroid/os/Looper;)V
    .locals 3
    .param p2, "looper"    # Landroid/os/Looper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<*>;>;",
            "Landroid/os/Looper;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "pendingResultList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/common/api/PendingResult<*>;>;"
    new-instance v0, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    invoke-direct {v0, p2}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/Batch;->mw:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/common/api/Batch;->IA:I

    iget v0, p0, Lcom/google/android/gms/common/api/Batch;->IA:I

    new-array v0, v0, [Lcom/google/android/gms/common/api/PendingResult;

    iput-object v0, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/PendingResult;

    iget-object v2, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;

    aput-object v0, v2, v1

    new-instance v2, Lcom/google/android/gms/common/api/Batch$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/common/api/Batch$1;-><init>(Lcom/google/android/gms/common/api/Batch;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/PendingResult;->a(Lcom/google/android/gms/common/api/PendingResult$a;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Landroid/os/Looper;Lcom/google/android/gms/common/api/Batch$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/List;
    .param p2, "x1"    # Landroid/os/Looper;
    .param p3, "x2"    # Lcom/google/android/gms/common/api/Batch$1;

    .prologue
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/api/Batch;-><init>(Ljava/util/List;Landroid/os/Looper;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/common/api/Batch;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/Batch;->mw:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/common/api/Batch;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/Batch;->IC:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/common/api/Batch;)I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/common/api/Batch;->IA:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/google/android/gms/common/api/Batch;->IA:I

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/common/api/Batch;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/Batch;->IB:Z

    return p1
.end method

.method static synthetic c(Lcom/google/android/gms/common/api/Batch;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/Batch;->IA:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/common/api/Batch;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/Batch;->IC:Z

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/common/api/Batch;)V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->cancel()V

    return-void
.end method

.method static synthetic f(Lcom/google/android/gms/common/api/Batch;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/Batch;->IB:Z

    return v0
.end method

.method static synthetic g(Lcom/google/android/gms/common/api/Batch;)[Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;

    return-object v0
.end method


# virtual methods
.method public synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/Batch;->createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/BatchResult;

    move-result-object v0

    return-object v0
.end method

.method public cancel()V
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->cancel()V

    iget-object v1, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    invoke-interface {v3}, Lcom/google/android/gms/common/api/PendingResult;->cancel()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/BatchResult;
    .locals 2
    .param p1, "status"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    new-instance v0, Lcom/google/android/gms/common/api/BatchResult;

    iget-object v1, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/api/BatchResult;-><init>(Lcom/google/android/gms/common/api/Status;[Lcom/google/android/gms/common/api/PendingResult;)V

    return-object v0
.end method
