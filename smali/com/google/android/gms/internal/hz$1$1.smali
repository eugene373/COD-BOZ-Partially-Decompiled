.class Lcom/google/android/gms/internal/hz$1$1;
.super Lcom/google/android/gms/internal/hx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/hz$1;->a(Lcom/google/android/gms/internal/hv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hx",
        "<",
        "Lcom/google/android/gms/internal/hu$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic CI:Lcom/google/android/gms/internal/hz$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hz$1;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hz$1$1;->CI:Lcom/google/android/gms/internal/hz$1;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/hx;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hz$1$1;->CH:Lcom/google/android/gms/common/api/BaseImplementation$b;

    new-instance v1, Lcom/google/android/gms/internal/hz$b;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/hz$b;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V

    return-void
.end method
