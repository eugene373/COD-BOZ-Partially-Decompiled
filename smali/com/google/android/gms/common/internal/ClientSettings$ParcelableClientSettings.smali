.class public final Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/internal/ClientSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ParcelableClientSettings"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/common/internal/ParcelableClientSettingsCreator;


# instance fields
.field private final BR:I

.field private final Dd:Ljava/lang/String;

.field private final IK:I

.field private final IM:Ljava/lang/String;

.field private final Jk:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/internal/ParcelableClientSettingsCreator;

    invoke-direct {v0}, Lcom/google/android/gms/common/internal/ParcelableClientSettingsCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->CREATOR:Lcom/google/android/gms/common/internal/ParcelableClientSettingsCreator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/util/List;ILjava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "accountName"    # Ljava/lang/String;
    .param p4, "gravityForPopups"    # I
    .param p5, "realClientPackageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p3, "scopes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Jk:Ljava/util/List;

    iput p1, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Dd:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Jk:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iput p4, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->IK:I

    iput-object p5, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->IM:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Collection;ILjava/lang/String;)V
    .locals 6
    .param p1, "accountName"    # Ljava/lang/String;
    .param p3, "gravityForPopups"    # I
    .param p4, "realClientPackageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "scopes":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    const/4 v1, 0x3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, p0

    move-object v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;-><init>(ILjava/lang/String;Ljava/util/List;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Dd:Ljava/lang/String;

    return-object v0
.end method

.method public getAccountNameOrDefault()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Dd:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Dd:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "<<default account>>"

    goto :goto_0
.end method

.method public getGravityForPopups()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->IK:I

    return v0
.end method

.method public getRealClientPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->IM:Ljava/lang/String;

    return-object v0
.end method

.method public getScopes()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Jk:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->BR:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/internal/ParcelableClientSettingsCreator;->a(Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;Landroid/os/Parcel;I)V

    return-void
.end method
