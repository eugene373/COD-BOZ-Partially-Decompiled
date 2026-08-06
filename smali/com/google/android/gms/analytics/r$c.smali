.class Lcom/google/android/gms/analytics/r$c;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic yF:Lcom/google/android/gms/analytics/r;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/analytics/r;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/r$c;->yF:Lcom/google/android/gms/analytics/r;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/analytics/r;Lcom/google/android/gms/analytics/r$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/r$c;-><init>(Lcom/google/android/gms/analytics/r;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/r$c;->yF:Lcom/google/android/gms/analytics/r;

    invoke-static {v0}, Lcom/google/android/gms/analytics/r;->b(Lcom/google/android/gms/analytics/r;)Lcom/google/android/gms/analytics/r$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/r$a;->yH:Lcom/google/android/gms/analytics/r$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/r$c;->yF:Lcom/google/android/gms/analytics/r;

    invoke-static {v0}, Lcom/google/android/gms/analytics/r;->c(Lcom/google/android/gms/analytics/r;)V

    :cond_0
    return-void
.end method
