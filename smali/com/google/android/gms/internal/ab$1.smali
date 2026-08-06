.class Lcom/google/android/gms/internal/ab$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ab;-><init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/ab$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final mp:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/u;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic mq:Lcom/google/android/gms/internal/u;

.field final synthetic mr:Lcom/google/android/gms/internal/ab;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ab;Lcom/google/android/gms/internal/u;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ab$1;->mr:Lcom/google/android/gms/internal/ab;

    iput-object p2, p0, Lcom/google/android/gms/internal/ab$1;->mq:Lcom/google/android/gms/internal/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/android/gms/internal/ab$1;->mq:Lcom/google/android/gms/internal/u;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ab$1;->mp:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ab$1;->mr:Lcom/google/android/gms/internal/ab;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/ab;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ab$1;->mp:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/u;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ab$1;->mr:Lcom/google/android/gms/internal/ab;

    invoke-static {v1}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/ab;)Lcom/google/android/gms/internal/av;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u;->b(Lcom/google/android/gms/internal/av;)V

    :cond_0
    return-void
.end method
