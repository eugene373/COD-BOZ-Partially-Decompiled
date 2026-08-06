.class public Lcom/google/android/gms/internal/ab;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ab$a;
    }
.end annotation


# instance fields
.field private final mj:Lcom/google/android/gms/internal/ab$a;

.field private final mk:Ljava/lang/Runnable;

.field private ml:Lcom/google/android/gms/internal/av;

.field private mm:Z

.field private mn:Z

.field private mo:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/u;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ab$a;

    sget-object v1, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ab$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ab;-><init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/ab$a;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/ab$a;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mn:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ab;->mo:J

    iput-object p2, p0, Lcom/google/android/gms/internal/ab;->mj:Lcom/google/android/gms/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/internal/ab$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ab$1;-><init>(Lcom/google/android/gms/internal/ab;Lcom/google/android/gms/internal/u;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ab;->mk:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ab;)Lcom/google/android/gms/internal/av;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ab;->ml:Lcom/google/android/gms/internal/av;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ab;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    return p1
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/av;J)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    if-eqz v0, :cond_1

    const-string v0, "An ad refresh is already scheduled."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ab;->ml:Lcom/google/android/gms/internal/av;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    iput-wide p2, p0, Lcom/google/android/gms/internal/ab;->mo:J

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mn:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scheduling ad refresh "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " milliseconds from now."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ab;->mj:Lcom/google/android/gms/internal/ab$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ab;->mk:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p2, p3}, Lcom/google/android/gms/internal/ab$a;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public ay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    return v0
.end method

.method public c(Lcom/google/android/gms/internal/av;)V
    .locals 2

    const-wide/32 v0, 0xea60

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/av;J)V

    return-void
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ab;->mj:Lcom/google/android/gms/internal/ab$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ab;->mk:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab$a;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public pause()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mn:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ab;->mj:Lcom/google/android/gms/internal/ab$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ab;->mk:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab$a;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public resume()V
    .locals 4

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ab;->mn:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ab;->mm:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ab;->ml:Lcom/google/android/gms/internal/av;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ab;->mo:J

    invoke-virtual {p0, v0, v2, v3}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/av;J)V

    :cond_0
    return-void
.end method
