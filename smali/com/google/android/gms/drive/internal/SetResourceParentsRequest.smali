.class public Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final BR:I

.field final PA:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;"
        }
    .end annotation
.end field

.field final Pz:Lcom/google/android/gms/drive/DriveId;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/ba;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/ba;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/DriveId;Ljava/util/List;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "targetId"    # Lcom/google/android/gms/drive/DriveId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/drive/DriveId;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p3, "parentIds":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/DriveId;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->Pz:Lcom/google/android/gms/drive/DriveId;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->PA:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;Ljava/util/List;)V
    .locals 1
    .param p1, "targetId"    # Lcom/google/android/gms/drive/DriveId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/drive/DriveId;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "parentIds":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/DriveId;>;"
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;-><init>(ILcom/google/android/gms/drive/DriveId;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ba;->a(Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;Landroid/os/Parcel;I)V

    return-void
.end method
