.class public Lcom/google/android/gms/internal/bp;
.super Lcom/google/android/gms/internal/bs$a;

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

.field private final pp:Ljava/lang/String;

.field private pt:Lcom/google/android/gms/internal/bq;

.field private final pu:Landroid/graphics/drawable/Drawable;

.field private final pv:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/bs$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->mw:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/bp;->pl:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/bp;->pm:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lcom/google/android/gms/internal/bp;->pn:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/bp;->pu:Landroid/graphics/drawable/Drawable;

    iput-object p5, p0, Lcom/google/android/gms/internal/bp;->pp:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/bp;->pv:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/bq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/bp;->pt:Lcom/google/android/gms/internal/bq;

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

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pt:Lcom/google/android/gms/internal/bq;

    if-nez v0, :cond_0

    const-string v0, "Attempt to record impression before content ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pt:Lcom/google/android/gms/internal/bq;

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

.method public bA()Lcom/google/android/gms/dynamic/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pu:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    return-object v0
.end method

.method public bB()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pv:Ljava/lang/String;

    return-object v0
.end method

.method public bt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pl:Ljava/lang/String;

    return-object v0
.end method

.method public bu()Lcom/google/android/gms/dynamic/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pm:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    return-object v0
.end method

.method public bw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pp:Ljava/lang/String;

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pn:Ljava/lang/String;

    return-object v0
.end method

.method public i(I)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pt:Lcom/google/android/gms/internal/bq;

    if-nez v0, :cond_0

    const-string v0, "Attempt to perform click before content ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->pt:Lcom/google/android/gms/internal/bq;

    const-string v2, "1"

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
