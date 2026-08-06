.class public Lcom/google/android/gms/internal/bo;
.super Lcom/google/android/gms/internal/br$a;

# interfaces
.implements Lcom/google/android/gms/internal/bq$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final mw:Ljava/lang/Object;

.field private final pl:Ljava/lang/String;

.field private final pm:Landroid/graphics/drawable/Drawable;

.field private final pn:Ljava/lang/String;

.field private final po:Landroid/graphics/drawable/Drawable;

.field private final pp:Ljava/lang/String;

.field private final pq:D

.field private final pr:Ljava/lang/String;

.field private final ps:Ljava/lang/String;

.field private pt:Lcom/google/android/gms/internal/bq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/br$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/bo;->mw:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/bo;->pl:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/bo;->pm:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lcom/google/android/gms/internal/bo;->pn:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/bo;->po:Landroid/graphics/drawable/Drawable;

    iput-object p5, p0, Lcom/google/android/gms/internal/bo;->pp:Ljava/lang/String;

    iput-wide p6, p0, Lcom/google/android/gms/internal/bo;->pq:D

    iput-object p8, p0, Lcom/google/android/gms/internal/bo;->pr:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/bo;->ps:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/bq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bo;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public as()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bo;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;

    if-nez v0, :cond_0

    const-string v0, "Attempt to record impression before app install ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bq;->as()V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pl:Ljava/lang/String;

    return-object v0
.end method

.method public bu()Lcom/google/android/gms/dynamic/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pm:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    return-object v0
.end method

.method public bv()Lcom/google/android/gms/dynamic/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->po:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    return-object v0
.end method

.method public bw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pp:Ljava/lang/String;

    return-object v0
.end method

.method public bx()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/bo;->pq:D

    return-wide v0
.end method

.method public by()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pr:Ljava/lang/String;

    return-object v0
.end method

.method public bz()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->ps:Ljava/lang/String;

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pn:Ljava/lang/String;

    return-object v0
.end method

.method public i(I)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/bo;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;

    if-nez v0, :cond_0

    const-string v0, "Attempt to perform click before app install ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;

    const-string v2, "2"

    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/bq;->b(Ljava/lang/String;I)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
