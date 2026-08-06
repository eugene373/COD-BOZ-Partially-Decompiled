.class public final Lcom/google/android/gms/wallet/MaskedWallet$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/MaskedWallet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Builder"
.end annotation


# instance fields
.field final synthetic ato:Lcom/google/android/gms/wallet/MaskedWallet;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/MaskedWallet;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/MaskedWallet;Lcom/google/android/gms/wallet/MaskedWallet$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/wallet/MaskedWallet;
    .param p2, "x1"    # Lcom/google/android/gms/wallet/MaskedWallet$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;-><init>(Lcom/google/android/gms/wallet/MaskedWallet;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/wallet/MaskedWallet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    return-object v0
.end method

.method public setBillingAddress(Lcom/google/android/gms/wallet/Address;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "billingAddress"    # Lcom/google/android/gms/wallet/Address;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asF:Lcom/google/android/gms/wallet/Address;

    return-object p0
.end method

.method public setBuyerBillingAddress(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "buyerBillingAddress"    # Lcom/google/android/gms/identity/intents/model/UserAddress;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asI:Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object p0
.end method

.method public setBuyerShippingAddress(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "buyerShippingAddress"    # Lcom/google/android/gms/identity/intents/model/UserAddress;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asJ:Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object p0
.end method

.method public setEmail(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "email"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asE:Ljava/lang/String;

    return-object p0
.end method

.method public setGoogleTransactionId(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "googleTransactionId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asB:Ljava/lang/String;

    return-object p0
.end method

.method public setInstrumentInfos([Lcom/google/android/gms/wallet/InstrumentInfo;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "instrumentInfos"    # [Lcom/google/android/gms/wallet/InstrumentInfo;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asK:[Lcom/google/android/gms/wallet/InstrumentInfo;

    return-object p0
.end method

.method public setLoyaltyWalletObjects([Lcom/google/android/gms/wallet/LoyaltyWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "loyaltyWalletObjects"    # [Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->atm:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    return-object p0
.end method

.method public setMerchantTransactionId(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "merchantTransactionId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asC:Ljava/lang/String;

    return-object p0
.end method

.method public setOfferWalletObjects([Lcom/google/android/gms/wallet/OfferWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "offerWalletObjects"    # [Lcom/google/android/gms/wallet/OfferWalletObject;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->atn:[Lcom/google/android/gms/wallet/OfferWalletObject;

    return-object p0
.end method

.method public setPaymentDescriptions([Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "paymentDescriptions"    # [Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asH:[Ljava/lang/String;

    return-object p0
.end method

.method public setShippingAddress(Lcom/google/android/gms/wallet/Address;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 1
    .param p1, "shippingAddress"    # Lcom/google/android/gms/wallet/Address;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asG:Lcom/google/android/gms/wallet/Address;

    return-object p0
.end method
