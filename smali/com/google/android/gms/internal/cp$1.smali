.class Lcom/google/android/gms/internal/cp$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/cp;->b(JJ)Lcom/google/android/gms/internal/cq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic qv:Lcom/google/android/gms/internal/co;

.field final synthetic qw:Lcom/google/android/gms/internal/cp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/cp;Lcom/google/android/gms/internal/co;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    iput-object p2, p0, Lcom/google/android/gms/internal/cp$1;->qv:Lcom/google/android/gms/internal/co;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    invoke-static {v0}, Lcom/google/android/gms/internal/cp;->a(Lcom/google/android/gms/internal/cp;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    invoke-static {v0}, Lcom/google/android/gms/internal/cp;->b(Lcom/google/android/gms/internal/cp;)I

    move-result v0

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    iget-object v2, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    invoke-static {v2}, Lcom/google/android/gms/internal/cp;->c(Lcom/google/android/gms/internal/cp;)Lcom/google/android/gms/internal/cu;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/cp;->a(Lcom/google/android/gms/internal/cp;Lcom/google/android/gms/internal/cu;)Lcom/google/android/gms/internal/cu;

    iget-object v0, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    invoke-static {v0}, Lcom/google/android/gms/internal/cp;->d(Lcom/google/android/gms/internal/cp;)Lcom/google/android/gms/internal/cu;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/cp;->j(I)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cp$1;->qv:Lcom/google/android/gms/internal/co;

    iget-object v2, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/co;->a(Lcom/google/android/gms/internal/cq$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cp$1;->qw:Lcom/google/android/gms/internal/cp;

    iget-object v2, p0, Lcom/google/android/gms/internal/cp$1;->qv:Lcom/google/android/gms/internal/co;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/cp;->a(Lcom/google/android/gms/internal/cp;Lcom/google/android/gms/internal/co;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
