.class public final Lcom/google/android/gms/internal/fg$a;
.super Lcom/google/android/gms/internal/fg;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/ff$a;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/fg;-><init>(Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/ff$a;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/fg$a;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public cC()V
    .locals 0

    return-void
.end method

.method public cD()Lcom/google/android/gms/internal/fm;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/gb;->bD()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/bm;

    const-string v2, "gads:sdk_core_location"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "gads:sdk_core_experiment_id"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "gads:block_autoclicks_experiment_id"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/internal/bm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/fg$a;->mContext:Landroid/content/Context;

    new-instance v2, Lcom/google/android/gms/internal/cj;

    invoke-direct {v2}, Lcom/google/android/gms/internal/cj;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/fy;

    invoke-direct {v3}, Lcom/google/android/gms/internal/fy;-><init>()V

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/fr;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/fx;)Lcom/google/android/gms/internal/fr;

    move-result-object v0

    return-object v0
.end method
