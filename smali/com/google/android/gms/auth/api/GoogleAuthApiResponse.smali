.class public Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/auth/api/GoogleAuthApiResponseCreator;


# instance fields
.field final DA:[B

.field final Dz:Landroid/os/Bundle;

.field final responseCode:I

.field final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponseCreator;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/GoogleAuthApiResponseCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->CREATOR:Lcom/google/android/gms/auth/api/GoogleAuthApiResponseCreator;

    return-void
.end method

.method public constructor <init>(IILandroid/os/Bundle;[B)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "responseCode"    # I
    .param p3, "headers"    # Landroid/os/Bundle;
    .param p4, "body"    # [B

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->responseCode:I

    iput-object p3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->DA:[B

    return-void
.end method

.method public constructor <init>(ILandroid/os/Bundle;[B)V
    .locals 1
    .param p1, "responseCode"    # I
    .param p2, "headers"    # Landroid/os/Bundle;
    .param p3, "body"    # [B

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->versionCode:I

    iput p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->responseCode:I

    iput-object p2, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->DA:[B

    return-void
.end method

.method public constructor <init>(ILjava/util/Map;[B)V
    .locals 1
    .param p1, "responseCode"    # I
    .param p3, "body"    # [B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B)V"
        }
    .end annotation

    .prologue
    .local p2, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-static {p2}, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->B(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;-><init>(ILandroid/os/Bundle;[B)V

    return-void
.end method

.method private static B(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v2
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBody()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->DA:[B

    return-object v0
.end method

.method public getHeaders()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;

    return-object v0
.end method

.method public getHeadersAsMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->Dz:Landroid/os/Bundle;

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public getResponseCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;->responseCode:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/GoogleAuthApiResponseCreator;->a(Lcom/google/android/gms/auth/api/GoogleAuthApiResponse;Landroid/os/Parcel;I)V

    return-void
.end method
