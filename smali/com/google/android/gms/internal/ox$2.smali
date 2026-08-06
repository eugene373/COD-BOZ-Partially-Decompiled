.class Lcom/google/android/gms/internal/ox$2;
.super Lcom/google/android/gms/wallet/Wallet$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ox;->loadMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic adJ:I

.field final synthetic auq:Lcom/google/android/gms/internal/ox;

.field final synthetic aur:Lcom/google/android/gms/wallet/MaskedWalletRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ox;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ox$2;->auq:Lcom/google/android/gms/internal/ox;

    iput-object p2, p0, Lcom/google/android/gms/internal/ox$2;->aur:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput p3, p0, Lcom/google/android/gms/internal/ox$2;->adJ:I

    invoke-direct {p0}, Lcom/google/android/gms/wallet/Wallet$b;-><init>()V

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

    check-cast p1, Lcom/google/android/gms/internal/oy;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ox$2;->a(Lcom/google/android/gms/internal/oy;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/oy;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ox$2;->aur:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget v1, p0, Lcom/google/android/gms/internal/ox$2;->adJ:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/oy;->a(Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ox$2;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
