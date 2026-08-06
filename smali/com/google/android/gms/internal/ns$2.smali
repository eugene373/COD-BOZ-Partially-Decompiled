.class Lcom/google/android/gms/internal/ns$2;
.super Lcom/google/android/gms/internal/ns$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ns;->load(Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic YN:I

.field final synthetic alO:Lcom/google/android/gms/internal/ns;

.field final synthetic alP:Ljava/lang/String;

.field final synthetic alQ:Landroid/net/Uri;

.field final synthetic alR:Ljava/lang/String;

.field final synthetic alS:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ns;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ns$2;->alO:Lcom/google/android/gms/internal/ns;

    iput p2, p0, Lcom/google/android/gms/internal/ns$2;->YN:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ns$2;->alP:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ns$2;->alQ:Landroid/net/Uri;

    iput-object p5, p0, Lcom/google/android/gms/internal/ns$2;->alR:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ns$2;->alS:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ns$a;-><init>(Lcom/google/android/gms/internal/ns$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/plus/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ns$2;->a(Lcom/google/android/gms/plus/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/plus/internal/e;)V
    .locals 7

    iget v2, p0, Lcom/google/android/gms/internal/ns$2;->YN:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ns$2;->alP:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ns$2;->alQ:Landroid/net/Uri;

    iget-object v5, p0, Lcom/google/android/gms/internal/ns$2;->alR:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ns$2;->alS:Ljava/lang/String;

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
