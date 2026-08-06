.class public Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
.super Ljava/lang/Object;
.source "ReceiptBuilder.java"


# instance fields
.field private cancelDate:Ljava/util/Date;

.field private productType:Lcom/amazon/device/iap/model/ProductType;

.field private purchaseDate:Ljava/util/Date;

.field private receiptId:Ljava/lang/String;

.field private sku:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/amazon/device/iap/model/Receipt;
    .locals 1

    .prologue
    .line 16
    new-instance v0, Lcom/amazon/device/iap/model/Receipt;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/Receipt;-><init>(Lcom/amazon/device/iap/internal/model/ReceiptBuilder;)V

    return-object v0
.end method

.method public getCancelDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->cancelDate:Ljava/util/Date;

    return-object v0
.end method

.method public getProductType()Lcom/amazon/device/iap/model/ProductType;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->productType:Lcom/amazon/device/iap/model/ProductType;

    return-object v0
.end method

.method public getPurchaseDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->purchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public getReceiptId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->receiptId:Ljava/lang/String;

    return-object v0
.end method

.method public getSku()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public setCancelDate(Ljava/util/Date;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->cancelDate:Ljava/util/Date;

    .line 61
    return-object p0
.end method

.method public setProductType(Lcom/amazon/device/iap/model/ProductType;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->productType:Lcom/amazon/device/iap/model/ProductType;

    .line 51
    return-object p0
.end method

.method public setPurchaseDate(Ljava/util/Date;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->purchaseDate:Ljava/util/Date;

    .line 56
    return-object p0
.end method

.method public setReceiptId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->receiptId:Ljava/lang/String;

    .line 41
    return-object p0
.end method

.method public setSku(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->sku:Ljava/lang/String;

    .line 46
    return-object p0
.end method
