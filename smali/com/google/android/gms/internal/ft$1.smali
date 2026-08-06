.class Lcom/google/android/gms/internal/ft$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/by;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic uu:Lcom/google/android/gms/internal/ft;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ft;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ft$1;->uu:Lcom/google/android/gms/internal/ft;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/gv;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/gv;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$1;->uu:Lcom/google/android/gms/internal/ft;

    invoke-static {v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ft;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ft$1;->uu:Lcom/google/android/gms/internal/ft;

    invoke-static {v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/ft;)Lcom/google/android/gms/internal/gk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gk;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/fv;

    const/4 v2, 0x1

    invoke-direct {v0, v2, p2}, Lcom/google/android/gms/internal/fv;-><init>(ILjava/util/Map;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fv;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fv;->cL()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$1;->uu:Lcom/google/android/gms/internal/ft;

    invoke-static {v2}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/ft;)Lcom/google/android/gms/internal/gk;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/gk;->a(Ljava/lang/Object;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
