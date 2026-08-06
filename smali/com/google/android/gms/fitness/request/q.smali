.class public Lcom/google/android/gms/fitness/request/q;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final BR:I

.field private final UA:Lcom/google/android/gms/fitness/data/k;

.field private final mPendingIntent:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/r;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/r;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/app/PendingIntent;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/q;->BR:I

    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/q;->mPendingIntent:Landroid/app/PendingIntent;

    return-void

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/fitness/data/k$a;->an(Landroid/os/IBinder;)Lcom/google/android/gms/fitness/data/k;

    move-result-object v0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/q;->BR:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/q;->mPendingIntent:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/q;->BR:I

    return v0
.end method

.method public jr()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/q;->mPendingIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method jw()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;

    invoke-interface {v0}, Lcom/google/android/gms/fitness/data/k;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "SensorUnregistrationRequest{%s}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/r;->a(Lcom/google/android/gms/fitness/request/q;Landroid/os/Parcel;I)V

    return-void
.end method
