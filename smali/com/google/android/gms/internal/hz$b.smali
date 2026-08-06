.class Lcom/google/android/gms/internal/hz$b;
.super Lcom/google/android/gms/internal/hz$a;

# interfaces
.implements Lcom/google/android/gms/internal/hu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hz$a",
        "<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;",
        "Lcom/google/android/gms/internal/hu$a;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hz$a;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;)V

    return-void
.end method
