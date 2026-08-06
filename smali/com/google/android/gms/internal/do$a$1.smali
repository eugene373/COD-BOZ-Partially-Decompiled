.class Lcom/google/android/gms/internal/do$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/do$a;-><init>(Lcom/google/android/gms/internal/do;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final sd:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/do;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic se:Lcom/google/android/gms/internal/do;

.field final synthetic sf:Lcom/google/android/gms/internal/do$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/do$a;Lcom/google/android/gms/internal/do;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/do$a$1;->sf:Lcom/google/android/gms/internal/do$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/do$a$1;->se:Lcom/google/android/gms/internal/do;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/android/gms/internal/do$a$1;->se:Lcom/google/android/gms/internal/do;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/do$a$1;->sd:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/do$a$1;->sd:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/do;

    iget-object v1, p0, Lcom/google/android/gms/internal/do$a$1;->sf:Lcom/google/android/gms/internal/do$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/do$a;->a(Lcom/google/android/gms/internal/do$a;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/do;->ci()V

    iget-object v0, p0, Lcom/google/android/gms/internal/do$a$1;->sf:Lcom/google/android/gms/internal/do$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/do$a;->cj()V

    :cond_0
    return-void
.end method
