.class public final Lcom/google/android/gms/internal/ad;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final ms:Ljava/lang/String;

.field private final mt:Lorg/json/JSONObject;

.field private final mu:Ljava/lang/String;

.field private final mv:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/gt;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ad;->mv:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ad;->mt:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/google/android/gms/internal/ad;->mu:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ad;->ms:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public aA()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->mv:Ljava/lang/String;

    return-object v0
.end method

.method public aB()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->mt:Lorg/json/JSONObject;

    return-object v0
.end method

.method public aC()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->mu:Ljava/lang/String;

    return-object v0
.end method

.method public az()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->ms:Ljava/lang/String;

    return-object v0
.end method
