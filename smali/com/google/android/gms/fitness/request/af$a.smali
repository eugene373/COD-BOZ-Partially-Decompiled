.class public Lcom/google/android/gms/fitness/request/af$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/af;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private US:Lcom/google/android/gms/fitness/data/Subscription;

.field private UT:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/af$a;->UT:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/af$a;)Lcom/google/android/gms/fitness/data/Subscription;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/af$a;->US:Lcom/google/android/gms/fitness/data/Subscription;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/af$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/af$a;->UT:Z

    return v0
.end method


# virtual methods
.method public b(Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/fitness/request/af$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/af$a;->US:Lcom/google/android/gms/fitness/data/Subscription;

    return-object p0
.end method

.method public jF()Lcom/google/android/gms/fitness/request/af;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/af$a;->US:Lcom/google/android/gms/fitness/data/Subscription;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Must call setSubscription()"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/request/af;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/af;-><init>(Lcom/google/android/gms/fitness/request/af$a;Lcom/google/android/gms/fitness/request/af$1;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
