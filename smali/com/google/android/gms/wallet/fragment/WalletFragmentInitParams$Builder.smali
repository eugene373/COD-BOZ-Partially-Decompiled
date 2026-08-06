.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Builder"
.end annotation


# instance fields
.field final synthetic aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    .param p2, "x1"    # Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    .locals 4

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWallet;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->b(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWalletRequest;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWallet;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->b(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWalletRequest;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    move v0, v2

    :goto_0
    const-string v3, "Exactly one of MaskedWallet or MaskedWalletRequest is required"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->c(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)I

    move-result v0

    if-ltz v0, :cond_3

    :goto_1
    const-string v0, "masked wallet request code is required and must be non-negative"

    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    return-object v0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v2, v1

    goto :goto_1
.end method

.method public setAccountName(Ljava/lang/String;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;
    .locals 1
    .param p1, "accountName"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

.method public setMaskedWallet(Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;
    .locals 1
    .param p1, "maskedWallet"    # Lcom/google/android/gms/wallet/MaskedWallet;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet;

    return-object p0
.end method

.method public setMaskedWalletRequest(Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;
    .locals 1
    .param p1, "request"    # Lcom/google/android/gms/wallet/MaskedWalletRequest;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object p0
.end method

.method public setMaskedWalletRequestCode(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;
    .locals 1
    .param p1, "requestCode"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;I)I

    return-object p0
.end method
