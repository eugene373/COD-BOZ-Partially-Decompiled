.class public Lcom/amazon/device/iap/internal/model/ProductBuilder;
.super Ljava/lang/Object;
.source "ProductBuilder.java"


# instance fields
.field private description:Ljava/lang/String;

.field private price:Ljava/lang/String;

.field private productType:Lcom/amazon/device/iap/model/ProductType;

.field private sku:Ljava/lang/String;

.field private smallIconUrl:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/amazon/device/iap/model/Product;
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lcom/amazon/device/iap/model/Product;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/Product;-><init>(Lcom/amazon/device/iap/internal/model/ProductBuilder;)V

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->price:Ljava/lang/String;

    return-object v0
.end method

.method public getProductType()Lcom/amazon/device/iap/model/ProductType;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->productType:Lcom/amazon/device/iap/model/ProductType;

    return-object v0
.end method

.method public getSku()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public getSmallIconUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->smallIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->description:Ljava/lang/String;

    .line 30
    return-object p0
.end method

.method public setPrice(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->price:Ljava/lang/String;

    .line 35
    return-object p0
.end method

.method public setProductType(Lcom/amazon/device/iap/model/ProductType;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->productType:Lcom/amazon/device/iap/model/ProductType;

    .line 25
    return-object p0
.end method

.method public setSku(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->sku:Ljava/lang/String;

    .line 20
    return-object p0
.end method

.method public setSmallIconUrl(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->smallIconUrl:Ljava/lang/String;

    .line 40
    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductBuilder;->title:Ljava/lang/String;

    .line 45
    return-object p0
.end method
