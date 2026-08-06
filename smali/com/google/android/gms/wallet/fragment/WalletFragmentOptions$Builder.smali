.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Builder"
.end annotation


# instance fields
.field final synthetic aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;->aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    .param p2, "x1"    # Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;->aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    return-object v0
.end method

.method public setEnvironment(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    .locals 1
    .param p1, "environment"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;->aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I

    return-object p0
.end method

.method public setFragmentStyle(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    .locals 2
    .param p1, "styleResourceId"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;->aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->setStyleResourceId(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object p0
.end method

.method public setFragmentStyle(Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    .locals 1
    .param p1, "fragmentStyle"    # Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;->aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object p0
.end method

.method public setMode(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    .locals 1
    .param p1, "mode"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;->aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->c(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I

    return-object p0
.end method

.method public setTheme(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    .locals 1
    .param p1, "theme"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;->aun:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->b(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I

    return-object p0
.end method
