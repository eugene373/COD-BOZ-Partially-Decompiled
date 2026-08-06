.class Lcom/google/android/gms/internal/gw$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gw;->bX()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic wW:Lcom/google/android/gms/internal/dk;

.field final synthetic wX:Lcom/google/android/gms/internal/gw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gw;Lcom/google/android/gms/internal/dk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gw$1;->wX:Lcom/google/android/gms/internal/gw;

    iput-object p2, p0, Lcom/google/android/gms/internal/gw$1;->wW:Lcom/google/android/gms/internal/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gw$1;->wW:Lcom/google/android/gms/internal/dk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dk;->bX()V

    return-void
.end method
