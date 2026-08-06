.class public Lcom/google/android/gms/internal/fc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fc$a;
    }
.end annotation


# instance fields
.field private final lf:I

.field private final lg:I

.field protected final md:Lcom/google/android/gms/internal/gv;

.field private final td:Landroid/os/Handler;

.field private final te:J

.field private tf:J

.field private tg:Lcom/google/android/gms/internal/gw$a;

.field protected th:Z

.field protected ti:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gw$a;Lcom/google/android/gms/internal/gv;II)V
    .locals 10

    const-wide/16 v6, 0xc8

    const-wide/16 v8, 0x32

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/fc;-><init>(Lcom/google/android/gms/internal/gw$a;Lcom/google/android/gms/internal/gv;IIJJ)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/gw$a;Lcom/google/android/gms/internal/gv;IIJJ)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p5, p0, Lcom/google/android/gms/internal/fc;->te:J

    iput-wide p7, p0, Lcom/google/android/gms/internal/fc;->tf:J

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fc;->td:Landroid/os/Handler;

    iput-object p2, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;

    iput-object p1, p0, Lcom/google/android/gms/internal/fc;->tg:Lcom/google/android/gms/internal/gw$a;

    iput-boolean v2, p0, Lcom/google/android/gms/internal/fc;->th:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/fc;->ti:Z

    iput p4, p0, Lcom/google/android/gms/internal/fc;->lg:I

    iput p3, p0, Lcom/google/android/gms/internal/fc;->lf:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/fc;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/fc;->lf:I

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/fc;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/fc;->lg:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/fc;)J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/fc;->tf:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/fc;->tf:J

    return-wide v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/fc;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/fc;->tf:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/fc;)Lcom/google/android/gms/internal/gw$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fc;->tg:Lcom/google/android/gms/internal/gw$a;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/fc;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/fc;->te:J

    return-wide v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/fc;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fc;->td:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/fk;Lcom/google/android/gms/internal/ha;)V
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/gv;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;

    iget-object v1, p1, Lcom/google/android/gms/internal/fk;->rP:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v5

    :goto_0
    iget-object v2, p1, Lcom/google/android/gms/internal/fk;->tG:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/gv;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p1, Lcom/google/android/gms/internal/fk;->rP:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/gj;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/fk;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ha;

    iget-object v1, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;

    iget-object v2, p1, Lcom/google/android/gms/internal/fk;->tP:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/ha;-><init>(Lcom/google/android/gms/internal/fc;Lcom/google/android/gms/internal/gv;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/fc;->a(Lcom/google/android/gms/internal/fk;Lcom/google/android/gms/internal/ha;)V

    return-void
.end method

.method public declared-synchronized cA()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/fc;->th:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public cB()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/fc;->ti:Z

    return v0
.end method

.method public cy()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/fc;->td:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/google/android/gms/internal/fc;->te:J

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public declared-synchronized cz()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/fc;->th:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fc;->cA()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fc;->tg:Lcom/google/android/gms/internal/gw$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/gw$a;->a(Lcom/google/android/gms/internal/gv;)V

    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/fc$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/fc$a;-><init>(Lcom/google/android/gms/internal/fc;Landroid/webkit/WebView;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fc$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method
