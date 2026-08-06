.class public Lcom/google/android/gms/drive/UserMetadata;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/UserMetadata;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final BR:I

.field final NG:Ljava/lang/String;

.field final NH:Ljava/lang/String;

.field final NI:Ljava/lang/String;

.field final NJ:Z

.field final NK:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/h;

    invoke-direct {v0}, Lcom/google/android/gms/drive/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/UserMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "permissionId"    # Ljava/lang/String;
    .param p3, "displayName"    # Ljava/lang/String;
    .param p4, "pictureUrl"    # Ljava/lang/String;
    .param p5, "isAuthenticatedUser"    # Z
    .param p6, "emailAddress"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/UserMetadata;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/drive/UserMetadata;->NG:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/drive/UserMetadata;->NH:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/UserMetadata;->NI:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/drive/UserMetadata;->NJ:Z

    iput-object p6, p0, Lcom/google/android/gms/drive/UserMetadata;->NK:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 7
    .param p1, "permissionId"    # Ljava/lang/String;
    .param p2, "displayName"    # Ljava/lang/String;
    .param p3, "pictureUrl"    # Ljava/lang/String;
    .param p4, "isAuthenticatedUser"    # Z
    .param p5, "emailAddress"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/drive/UserMetadata;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Permission ID: \'%s\', Display Name: \'%s\', Picture URL: \'%s\', Authenticated User: %b, Email: \'%s\'"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NG:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NH:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NI:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-boolean v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NJ:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NK:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/h;->a(Lcom/google/android/gms/drive/UserMetadata;Landroid/os/Parcel;I)V

    return-void
.end method
