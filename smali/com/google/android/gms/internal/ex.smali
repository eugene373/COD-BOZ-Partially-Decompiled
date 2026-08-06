.class public final Lcom/google/android/gms/internal/ex;
.super Lcom/google/android/gms/internal/eu$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final oF:Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;

.field private final oG:Lcom/google/android/gms/ads/doubleclick/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/doubleclick/c;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/eu$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ex;->oG:Lcom/google/android/gms/ads/doubleclick/c;

    iput-object p2, p0, Lcom/google/android/gms/internal/ex;->oF:Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/es;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ex;->oG:Lcom/google/android/gms/ads/doubleclick/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/ex;->oF:Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;

    new-instance v2, Lcom/google/android/gms/internal/ev;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ev;-><init>(Lcom/google/android/gms/internal/es;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/ads/doubleclick/c;->a(Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;Lcom/google/android/gms/ads/doubleclick/a;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ex;->oG:Lcom/google/android/gms/ads/doubleclick/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/ex;->oF:Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/ads/doubleclick/c;->a(Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
