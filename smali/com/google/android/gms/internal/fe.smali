.class public Lcom/google/android/gms/internal/fe;
.super Lcom/google/android/gms/internal/gg;

# interfaces
.implements Lcom/google/android/gms/internal/gw$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fe$a;
    }
.end annotation


# instance fields
.field private final lq:Lcom/google/android/gms/internal/ct;

.field private final mContext:Landroid/content/Context;

.field private final md:Lcom/google/android/gms/internal/gv;

.field private final mw:Ljava/lang/Object;

.field private pR:Lcom/google/android/gms/internal/cm;

.field private final sV:Ljava/lang/Object;

.field private sZ:Lcom/google/android/gms/internal/fk;

.field private final tm:Lcom/google/android/gms/internal/fd$a;

.field private final tn:Lcom/google/android/gms/internal/fz$a;

.field private to:Z

.field private tp:Lcom/google/android/gms/internal/ck;

.field private tq:Lcom/google/android/gms/internal/cq;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fz$a;Lcom/google/android/gms/internal/gv;Lcom/google/android/gms/internal/ct;Lcom/google/android/gms/internal/fd$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/gg;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fe;->sV:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fe;->mw:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/fe;->to:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/fe;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/fe;->tn:Lcom/google/android/gms/internal/fz$a;

    iget-object v0, p2, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;

    iput-object v0, p0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iput-object p3, p0, Lcom/google/android/gms/internal/fe;->md:Lcom/google/android/gms/internal/gv;

    iput-object p4, p0, Lcom/google/android/gms/internal/fe;->lq:Lcom/google/android/gms/internal/ct;

    iput-object p5, p0, Lcom/google/android/gms/internal/fe;->tm:Lcom/google/android/gms/internal/fd$a;

    iget-object v0, p2, Lcom/google/android/gms/internal/fz$a;->vq:Lcom/google/android/gms/internal/cm;

    iput-object v0, p0, Lcom/google/android/gms/internal/fe;->pR:Lcom/google/android/gms/internal/cm;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/fe;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->mw:Ljava/lang/Object;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/fi;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/fe$a;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/fe;->sV:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ck;

    iget-object v2, p0, Lcom/google/android/gms/internal/fe;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/fe;->lq:Lcom/google/android/gms/internal/ct;

    iget-object v4, p0, Lcom/google/android/gms/internal/fe;->pR:Lcom/google/android/gms/internal/cm;

    invoke-direct {v0, v2, p1, v3, v4}, Lcom/google/android/gms/internal/ck;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/ct;Lcom/google/android/gms/internal/cm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fe;->tp:Lcom/google/android/gms/internal/ck;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->tp:Lcom/google/android/gms/internal/ck;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, p2, p3, v2, v3}, Lcom/google/android/gms/internal/ck;->a(JJ)Lcom/google/android/gms/internal/cq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    iget v0, v0, Lcom/google/android/gms/internal/cq;->qx:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/fe$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mediation result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    iget v2, v2, Lcom/google/android/gms/internal/cq;->qx:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fe$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/fe$a;

    const-string v1, "No fill from any mediation ad networks."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fe$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fd$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->tm:Lcom/google/android/gms/internal/fd$a;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    return-object v0
.end method

.method private c(J)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/fe$a;
        }
    .end annotation

    const-wide/32 v0, 0xea60

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/fe;->mw:Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/fe$a;

    const-string v1, "Ad request cancelled."

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fe$a;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->md:Lcom/google/android/gms/internal/gv;

    return-object v0
.end method

.method private f(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/fe$a;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/fe$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/fe$3;-><init>(Lcom/google/android/gms/internal/fe;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/fe;->h(J)V

    return-void
.end method

.method private h(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/fe$a;
        }
    .end annotation

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/fe;->c(J)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/fe$a;

    const-string v1, "Timed out waiting for WebView to finish loading."

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fe$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/fe;->to:Z

    if-eqz v0, :cond_0

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/gv;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/fe;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "WebView finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/fe;->to:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->mw:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public co()V
    .locals 32

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->mw:Ljava/lang/Object;

    move-object/from16 v31, v0

    monitor-enter v31

    :try_start_0
    const-string v2, "AdRendererBackgroundTask started."

    invoke-static {v2}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/fe;->tn:Lcom/google/android/gms/internal/fz$a;

    iget-object v12, v2, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/fe;->tn:Lcom/google/android/gms/internal/fz$a;

    iget v6, v2, Lcom/google/android/gms/internal/fz$a;->errorCode:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-boolean v4, v4, Lcom/google/android/gms/internal/fk;->tI:Z

    if-eqz v4, :cond_0

    move-object/from16 v0, p0

    invoke-direct {v0, v12, v2, v3}, Lcom/google/android/gms/internal/fe;->a(Lcom/google/android/gms/internal/fi;J)V
    :try_end_1
    .catch Lcom/google/android/gms/internal/fe$a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    new-instance v2, Lcom/google/android/gms/internal/fz;

    iget-object v3, v12, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/fe;->md:Lcom/google/android/gms/internal/gv;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-object v5, v5, Lcom/google/android/gms/internal/fk;->qf:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-object v7, v7, Lcom/google/android/gms/internal/fk;->qg:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-object v8, v8, Lcom/google/android/gms/internal/fk;->tK:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget v9, v9, Lcom/google/android/gms/internal/fk;->orientation:I

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-wide v10, v10, Lcom/google/android/gms/internal/fk;->qj:J

    iget-object v12, v12, Lcom/google/android/gms/internal/fi;->tA:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-boolean v13, v13, Lcom/google/android/gms/internal/fk;->tI:Z

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    if-eqz v14, :cond_5

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    iget-object v14, v14, Lcom/google/android/gms/internal/cq;->qy:Lcom/google/android/gms/internal/cl;

    :goto_1
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    if-eqz v15, :cond_6

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    iget-object v15, v15, Lcom/google/android/gms/internal/cq;->qz:Lcom/google/android/gms/internal/cu;

    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    move-object/from16 v16, v0

    if-eqz v16, :cond_7

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/google/android/gms/internal/cq;->qA:Ljava/lang/String;

    move-object/from16 v16, v0

    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->pR:Lcom/google/android/gms/internal/cm;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    move-object/from16 v18, v0

    if-eqz v18, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->tq:Lcom/google/android/gms/internal/cq;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/google/android/gms/internal/cq;->qB:Lcom/google/android/gms/internal/co;

    move-object/from16 v18, v0

    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/google/android/gms/internal/fk;->tJ:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->tn:Lcom/google/android/gms/internal/fz$a;

    move-object/from16 v21, v0

    move-object/from16 v0, v21

    iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->lH:Lcom/google/android/gms/internal/ay;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/google/android/gms/internal/fk;->tH:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->tn:Lcom/google/android/gms/internal/fz$a;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    iget-wide v0, v0, Lcom/google/android/gms/internal/fz$a;->vs:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-wide v0, v0, Lcom/google/android/gms/internal/fk;->tM:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lcom/google/android/gms/internal/fk;->tN:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/fe;->tn:Lcom/google/android/gms/internal/fz$a;

    move-object/from16 v29, v0

    move-object/from16 v0, v29

    iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->vp:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    const/16 v30, 0x0

    invoke-direct/range {v2 .. v30}, Lcom/google/android/gms/internal/fz;-><init>(Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/gv;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/cm;Lcom/google/android/gms/internal/co;JLcom/google/android/gms/internal/ay;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/bq$a;)V

    sget-object v3, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/fe$2;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/fe$2;-><init>(Lcom/google/android/gms/internal/fe;Lcom/google/android/gms/internal/fz;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v31
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :cond_0
    :try_start_3
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-boolean v4, v4, Lcom/google/android/gms/internal/fk;->tO:Z

    if-eqz v4, :cond_2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/fe;->g(J)V
    :try_end_3
    .catch Lcom/google/android/gms/internal/fe$a; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    :catch_0
    move-exception v2

    :try_start_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/fe$a;->getErrorCode()I

    move-result v6

    const/4 v3, 0x3

    if-eq v6, v3, :cond_1

    const/4 v3, -0x1

    if-ne v6, v3, :cond_3

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/fe$a;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V

    :goto_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    if-nez v2, :cond_4

    new-instance v2, Lcom/google/android/gms/internal/fk;

    invoke-direct {v2, v6}, Lcom/google/android/gms/internal/fk;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    :goto_6
    sget-object v2, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/fe$1;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/fe$1;-><init>(Lcom/google/android/gms/internal/fe;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v31
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v2

    :cond_2
    :try_start_5
    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/fe;->f(J)V
    :try_end_5
    .catch Lcom/google/android/gms/internal/fe$a; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    :cond_3
    :try_start_6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/fe$a;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    new-instance v2, Lcom/google/android/gms/internal/fk;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    iget-wide v4, v3, Lcom/google/android/gms/internal/fk;->qj:J

    invoke-direct {v2, v6, v4, v5}, Lcom/google/android/gms/internal/fk;-><init>(IJ)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/internal/fe;->sZ:Lcom/google/android/gms/internal/fk;

    goto :goto_6

    :cond_5
    const/4 v14, 0x0

    goto/16 :goto_1

    :cond_6
    const/4 v15, 0x0

    goto/16 :goto_2

    :cond_7
    const-class v16, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v16

    goto/16 :goto_3

    :cond_8
    const/16 v18, 0x0

    goto/16 :goto_4
.end method

.method protected g(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/fe$a;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->Y()Lcom/google/android/gms/internal/ay;

    move-result-object v0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ay;->og:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/fc;

    iget-object v3, p0, Lcom/google/android/gms/internal/fe;->md:Lcom/google/android/gms/internal/gv;

    invoke-direct {v2, p0, v3, v1, v0}, Lcom/google/android/gms/internal/fc;-><init>(Lcom/google/android/gms/internal/gw$a;Lcom/google/android/gms/internal/gv;II)V

    sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/fe$4;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/fe$4;-><init>(Lcom/google/android/gms/internal/fe;Lcom/google/android/gms/internal/fc;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/fe;->h(J)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/fc;->cA()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Ad-Network indicated no fill with passback URL."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/fe$a;

    const-string v1, "AdNetwork sent passback url"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fe$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    iget v1, v0, Lcom/google/android/gms/internal/ay;->widthPixels:I

    iget v0, v0, Lcom/google/android/gms/internal/ay;->heightPixels:I

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/fc;->cB()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/fe$a;

    const-string v1, "AdNetwork timed out"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fe$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    return-void
.end method

.method public onStop()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/fe;->sV:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->md:Lcom/google/android/gms/internal/gv;

    invoke-static {v0}, Lcom/google/android/gms/internal/gj;->a(Landroid/webkit/WebView;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->tp:Lcom/google/android/gms/internal/ck;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fe;->tp:Lcom/google/android/gms/internal/ck;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ck;->cancel()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
