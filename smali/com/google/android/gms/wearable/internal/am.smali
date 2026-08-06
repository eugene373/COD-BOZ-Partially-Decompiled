.class public Lcom/google/android/gms/wearable/internal/am;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/am;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final avN:J

.field public final label:Ljava/lang/String;

.field public final packageName:Ljava/lang/String;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/an;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/an;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/am;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/am;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/am;->packageName:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/am;->label:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/wearable/internal/am;->avN:J

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
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/an;->a(Lcom/google/android/gms/wearable/internal/am;Landroid/os/Parcel;I)V

    return-void
.end method
