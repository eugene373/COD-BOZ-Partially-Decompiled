.class public final Lcom/google/android/gms/internal/er;
.super Lcom/google/android/gms/internal/es$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final sM:Lcom/google/android/gms/internal/aa;

.field private final sN:Ljava/lang/String;

.field private final sO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/aa;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/es$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/er;->sM:Lcom/google/android/gms/internal/aa;

    iput-object p2, p0, Lcom/google/android/gms/internal/er;->sN:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/er;->sO:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ar()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/er;->sM:Lcom/google/android/gms/internal/aa;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aa;->ar()V

    return-void
.end method

.method public as()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/er;->sM:Lcom/google/android/gms/internal/aa;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aa;->as()V

    return-void
.end method

.method public c(Lcom/google/android/gms/dynamic/d;)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/er;->sM:Lcom/google/android/gms/internal/aa;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/aa;->b(Landroid/view/View;)V

    goto :goto_0
.end method

.method public cu()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/er;->sN:Ljava/lang/String;

    return-object v0
.end method

.method public cv()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/er;->sO:Ljava/lang/String;

    return-object v0
.end method
