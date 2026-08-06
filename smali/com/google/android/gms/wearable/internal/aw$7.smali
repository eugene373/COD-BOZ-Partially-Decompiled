.class Lcom/google/android/gms/wearable/internal/aw$7;
.super Lcom/google/android/gms/wearable/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic avT:Lcom/google/android/gms/wearable/internal/aw;

.field final synthetic avV:Lcom/google/android/gms/common/api/BaseImplementation$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/aw$7;->avT:Lcom/google/android/gms/wearable/internal/aw;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/aw$7;->avV:Lcom/google/android/gms/common/api/BaseImplementation$b;

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/internal/as;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw$7;->avV:Lcom/google/android/gms/common/api/BaseImplementation$b;

    new-instance v1, Lcom/google/android/gms/wearable/internal/ag$a;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    iget v3, p1, Lcom/google/android/gms/wearable/internal/as;->statusCode:I

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget v3, p1, Lcom/google/android/gms/wearable/internal/as;->avO:I

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/wearable/internal/ag$a;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V

    return-void
.end method
