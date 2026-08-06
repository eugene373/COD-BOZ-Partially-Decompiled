.class final Lcom/google/android/gms/internal/lz$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/me;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/lz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/me",
        "<",
        "Lcom/google/android/gms/internal/lx;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic afc:Lcom/google/android/gms/internal/lz;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/lz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/lz$c;->afc:Lcom/google/android/gms/internal/lz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/lz;Lcom/google/android/gms/internal/lz$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/lz$c;-><init>(Lcom/google/android/gms/internal/lz;)V

    return-void
.end method


# virtual methods
.method public dJ()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lz$c;->afc:Lcom/google/android/gms/internal/lz;

    invoke-static {v0}, Lcom/google/android/gms/internal/lz;->b(Lcom/google/android/gms/internal/lz;)V

    return-void
.end method

.method public synthetic gS()Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz$c;->lZ()Lcom/google/android/gms/internal/lx;

    move-result-object v0

    return-object v0
.end method

.method public lZ()Lcom/google/android/gms/internal/lx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lz$c;->afc:Lcom/google/android/gms/internal/lz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lx;

    return-object v0
.end method
