.class public Lcom/google/android/gms/internal/hg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/hh;


# instance fields
.field final BR:I

.field final BZ:Ljava/lang/String;

.field final Ca:Ljava/lang/String;

.field final Cb:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hg;->CREATOR:Lcom/google/android/gms/internal/hh;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/hg;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/internal/hg;->BZ:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/hg;->Ca:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/hg;->Cb:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/hg;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hg;->CREATOR:Lcom/google/android/gms/internal/hh;

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "DocumentId[packageName=%s, corpusName=%s, uri=%s]"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/hg;->BZ:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/internal/hg;->Ca:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/hg;->Cb:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/hg;->CREATOR:Lcom/google/android/gms/internal/hh;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hh;->a(Lcom/google/android/gms/internal/hg;Landroid/os/Parcel;I)V

    return-void
.end method
