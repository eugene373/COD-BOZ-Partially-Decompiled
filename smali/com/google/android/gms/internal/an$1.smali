.class Lcom/google/android/gms/internal/an$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/an;->g(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nA:Landroid/view/View;

.field final synthetic nB:Lcom/google/android/gms/internal/an;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/an;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/an$1;->nB:Lcom/google/android/gms/internal/an;

    iput-object p2, p0, Lcom/google/android/gms/internal/an$1;->nA:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/an$1;->nB:Lcom/google/android/gms/internal/an;

    iget-object v1, p0, Lcom/google/android/gms/internal/an$1;->nA:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/an;->h(Landroid/view/View;)V

    return-void
.end method
