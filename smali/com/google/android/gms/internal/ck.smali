.class public final Lcom/google/android/gms/internal/ck;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final lq:Lcom/google/android/gms/internal/ct;

.field private final mContext:Landroid/content/Context;

.field private final mw:Ljava/lang/Object;

.field private final pQ:Lcom/google/android/gms/internal/fi;

.field private final pR:Lcom/google/android/gms/internal/cm;

.field private pS:Z

.field private pT:Lcom/google/android/gms/internal/cp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/ct;Lcom/google/android/gms/internal/cm;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ck;->mw:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ck;->pS:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ck;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ck;->pQ:Lcom/google/android/gms/internal/fi;

    iput-object p3, p0, Lcom/google/android/gms/internal/ck;->lq:Lcom/google/android/gms/internal/ct;

    iput-object p4, p0, Lcom/google/android/gms/internal/ck;->pR:Lcom/google/android/gms/internal/cm;

    return-void
.end method


# virtual methods
.method public a(JJ)Lcom/google/android/gms/internal/cq;
    .locals 17

    const-string v4, "Starting mediation."

    invoke-static {v4}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/ck;->pR:Lcom/google/android/gms/internal/cm;

    iget-object v4, v4, Lcom/google/android/gms/internal/cm;->qd:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/cl;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Trying mediation network: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/internal/cl;->pX:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V

    iget-object v4, v9, Lcom/google/android/gms/internal/cl;->pY:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_1
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/ck;->mw:Ljava/lang/Object;

    monitor-enter v15

    :try_start_0
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ck;->pS:Z

    if-eqz v4, :cond_2

    new-instance v4, Lcom/google/android/gms/internal/cq;

    const/4 v5, -0x1

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/cq;-><init>(I)V

    monitor-exit v15

    :goto_1
    return-object v4

    :cond_2
    new-instance v4, Lcom/google/android/gms/internal/cp;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/ck;->mContext:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/ck;->lq:Lcom/google/android/gms/internal/ct;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/ck;->pR:Lcom/google/android/gms/internal/cm;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/ck;->pQ:Lcom/google/android/gms/internal/fi;

    iget-object v10, v10, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/android/gms/internal/ck;->pQ:Lcom/google/android/gms/internal/fi;

    iget-object v11, v11, Lcom/google/android/gms/internal/fi;->lH:Lcom/google/android/gms/internal/ay;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/internal/ck;->pQ:Lcom/google/android/gms/internal/fi;

    iget-object v12, v12, Lcom/google/android/gms/internal/fi;->lD:Lcom/google/android/gms/internal/gt;

    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/internal/cp;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ct;Lcom/google/android/gms/internal/cm;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/gt;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/google/android/gms/internal/ck;->pT:Lcom/google/android/gms/internal/cp;

    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/ck;->pT:Lcom/google/android/gms/internal/cp;

    move-wide/from16 v0, p1

    move-wide/from16 v2, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/cp;->b(JJ)Lcom/google/android/gms/internal/cq;

    move-result-object v4

    iget v5, v4, Lcom/google/android/gms/internal/cq;->qx:I

    if-nez v5, :cond_3

    const-string v5, "Adapter succeeded."

    invoke-static {v5}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v4

    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v4

    :cond_3
    iget-object v5, v4, Lcom/google/android/gms/internal/cq;->qz:Lcom/google/android/gms/internal/cu;

    if-eqz v5, :cond_1

    sget-object v5, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;

    new-instance v6, Lcom/google/android/gms/internal/ck$1;

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v4}, Lcom/google/android/gms/internal/ck$1;-><init>(Lcom/google/android/gms/internal/ck;Lcom/google/android/gms/internal/cq;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_4
    new-instance v4, Lcom/google/android/gms/internal/cq;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/cq;-><init>(I)V

    goto :goto_1
.end method

.method public cancel()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ck;->mw:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ck;->pS:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ck;->pT:Lcom/google/android/gms/internal/cp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ck;->pT:Lcom/google/android/gms/internal/cp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cp;->cancel()V

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
