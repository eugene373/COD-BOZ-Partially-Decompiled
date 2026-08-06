.class public final Lcom/google/android/gms/internal/cq;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/cq$a;
    }
.end annotation


# instance fields
.field public final qA:Ljava/lang/String;

.field public final qB:Lcom/google/android/gms/internal/co;

.field public final qx:I

.field public final qy:Lcom/google/android/gms/internal/cl;

.field public final qz:Lcom/google/android/gms/internal/cu;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/cq;-><init>(Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/co;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/co;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/cq;->qy:Lcom/google/android/gms/internal/cl;

    iput-object p2, p0, Lcom/google/android/gms/internal/cq;->qz:Lcom/google/android/gms/internal/cu;

    iput-object p3, p0, Lcom/google/android/gms/internal/cq;->qA:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/cq;->qB:Lcom/google/android/gms/internal/co;

    iput p5, p0, Lcom/google/android/gms/internal/cq;->qx:I

    return-void
.end method
