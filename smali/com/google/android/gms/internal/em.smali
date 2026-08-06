.class public final Lcom/google/android/gms/internal/em;
.super Lcom/google/android/gms/internal/eh$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/eh$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/em;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/eg;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/em;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    new-instance v1, Lcom/google/android/gms/internal/ep;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ep;-><init>(Lcom/google/android/gms/internal/eg;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;->onInAppPurchaseRequested(Lcom/google/android/gms/ads/purchase/InAppPurchase;)V

    return-void
.end method
