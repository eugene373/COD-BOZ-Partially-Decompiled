.class public Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final BR:I

.field final Nw:Ljava/lang/String;

.field final Ny:Lcom/google/android/gms/drive/DriveId;

.field final Ol:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field final Om:Ljava/lang/Integer;

.field final uQ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/i;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/metadata/internal/MetadataBundle;ILjava/lang/String;Lcom/google/android/gms/drive/DriveId;Ljava/lang/Integer;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "metadata"    # Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    .param p3, "requestId"    # I
    .param p4, "title"    # Ljava/lang/String;
    .param p5, "startFolder"    # Lcom/google/android/gms/drive/DriveId;
    .param p6, "fileType"    # Ljava/lang/Integer;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;->Ol:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    iput p3, p0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;->uQ:I

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;->Nw:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;->Ny:Lcom/google/android/gms/drive/DriveId;

    iput-object p6, p0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;->Om:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;ILjava/lang/String;Lcom/google/android/gms/drive/DriveId;I)V
    .locals 7
    .param p1, "metadata"    # Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    .param p2, "requestId"    # I
    .param p3, "title"    # Ljava/lang/String;
    .param p4, "startFolder"    # Lcom/google/android/gms/drive/DriveId;
    .param p5, "fileType"    # I

    .prologue
    const/4 v1, 0x1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;-><init>(ILcom/google/android/gms/drive/metadata/internal/MetadataBundle;ILjava/lang/String;Lcom/google/android/gms/drive/DriveId;Ljava/lang/Integer;)V

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/i;->a(Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;Landroid/os/Parcel;I)V

    return-void
.end method
