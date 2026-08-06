.class Lcom/google/android/gms/internal/fn$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fn;->co()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic tW:Lcom/google/android/gms/internal/fn;

.field final synthetic ts:Lcom/google/android/gms/internal/fz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fn;Lcom/google/android/gms/internal/fz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fn$1;->tW:Lcom/google/android/gms/internal/fn;

    iput-object p2, p0, Lcom/google/android/gms/internal/fn$1;->ts:Lcom/google/android/gms/internal/fz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/fn$1;->tW:Lcom/google/android/gms/internal/fn;

    invoke-static {v0}, Lcom/google/android/gms/internal/fn;->a(Lcom/google/android/gms/internal/fn;)Lcom/google/android/gms/internal/fd$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/fn$1;->ts:Lcom/google/android/gms/internal/fz;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/fd$a;->a(Lcom/google/android/gms/internal/fz;)V

    return-void
.end method
