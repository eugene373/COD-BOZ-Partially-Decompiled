.class Lcom/google/android/gms/analytics/q;
.super Lcom/google/android/gms/analytics/ae;


# static fields
.field private static final yc:Ljava/lang/Object;

.field private static yo:Lcom/google/android/gms/analytics/q;


# instance fields
.field private mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;

.field private yd:Lcom/google/android/gms/analytics/d;

.field private volatile ye:Lcom/google/android/gms/analytics/f;

.field private yf:I

.field private yg:Z

.field private yh:Z

.field private yi:Ljava/lang/String;

.field private yj:Z

.field private yk:Z

.field private yl:Lcom/google/android/gms/analytics/e;

.field private ym:Lcom/google/android/gms/analytics/p;

.field private yn:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/analytics/ae;-><init>()V

    const/16 v0, 0x708

    iput v0, p0, Lcom/google/android/gms/analytics/q;->yf:I

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/q;->yg:Z

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/q;->yj:Z

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/q;->yk:Z

    new-instance v0, Lcom/google/android/gms/analytics/q$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/q$1;-><init>(Lcom/google/android/gms/analytics/q;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/q;->yl:Lcom/google/android/gms/analytics/e;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/q;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yj:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/analytics/q;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/analytics/q;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/analytics/q;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public static dZ()Lcom/google/android/gms/analytics/q;
    .locals 1

    sget-object v0, Lcom/google/android/gms/analytics/q;->yo:Lcom/google/android/gms/analytics/q;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/q;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/analytics/q;->yo:Lcom/google/android/gms/analytics/q;

    :cond_0
    sget-object v0, Lcom/google/android/gms/analytics/q;->yo:Lcom/google/android/gms/analytics/q;

    return-object v0
.end method

.method private ea()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/analytics/p;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/p;-><init>(Lcom/google/android/gms/analytics/ae;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/q;->ym:Lcom/google/android/gms/analytics/p;

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ym:Lcom/google/android/gms/analytics/p;

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/p;->z(Landroid/content/Context;)V

    return-void
.end method

.method private eb()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/analytics/q$2;

    invoke-direct {v2, p0}, Lcom/google/android/gms/analytics/q$2;-><init>(Lcom/google/android/gms/analytics/q;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/analytics/q;->yf:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method static synthetic ee()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method declared-synchronized A(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/q;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Landroid/content/Context;Lcom/google/android/gms/analytics/f;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yg:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/q;->dispatchLocalHits()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yg:Z

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yh:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/q;->dN()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yh:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(ZZ)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    if-ne v0, p1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yj:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p2, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    :cond_1
    :try_start_1
    iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    :cond_2
    if-nez p1, :cond_3

    if-eqz p2, :cond_3

    iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/analytics/q;->yf:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PowerSaveMode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p1, :cond_4

    if-nez p2, :cond_5

    :cond_4
    const-string v0, "initiated."

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    iput-boolean p2, p0, Lcom/google/android/gms/analytics/q;->yj:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_5
    :try_start_2
    const-string v0, "terminated."
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method dN()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;

    if-nez v0, :cond_0

    const-string v0, "setForceLocalDispatch() queued. It will be called once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yh:Z

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/t$a;->Ak:Lcom/google/android/gms/analytics/t$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/f;->dN()V

    goto :goto_0
.end method

.method declared-synchronized dispatchLocalHits()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;

    if-nez v0, :cond_0

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yg:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/t$a;->zX:Lcom/google/android/gms/analytics/t$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/f;->dispatch()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized ec()Lcom/google/android/gms/analytics/d;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->yd:Lcom/google/android/gms/analytics/d;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cant get a store unless we have a context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/analytics/ab;

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->yl:Lcom/google/android/gms/analytics/e;

    iget-object v2, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/analytics/ab;-><init>(Lcom/google/android/gms/analytics/e;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/q;->yd:Lcom/google/android/gms/analytics/d;

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->yi:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->yd:Lcom/google/android/gms/analytics/d;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/d;->dM()Lcom/google/android/gms/analytics/m;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->yi:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/analytics/m;->af(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/analytics/q;->yi:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/analytics/q;->eb()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ym:Lcom/google/android/gms/analytics/p;

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yk:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/analytics/q;->ea()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->yd:Lcom/google/android/gms/analytics/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method

.method declared-synchronized ed()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yj:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized setLocalDispatchPeriod(I)V
    .locals 4
    .param p1, "dispatchPeriodInSeconds"    # I

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_1

    const-string v0, "Dispatch period set with null handler. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V

    iput p1, p0, Lcom/google/android/gms/analytics/q;->yf:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/t$a;->zY:Lcom/google/android/gms/analytics/t$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yj:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    :cond_2
    iput p1, p0, Lcom/google/android/gms/analytics/q;->yf:I

    if-lez p1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yj:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    mul-int/lit16 v2, p1, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
