.class public Lcom/google/android/gms/fitness/request/af;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/af$1;,
        Lcom/google/android/gms/fitness/request/af$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/af;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final BR:I

.field private final US:Lcom/google/android/gms/fitness/data/Subscription;

.field private final UT:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/ag;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/ag;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/af;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/Subscription;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/af;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/af;->US:Lcom/google/android/gms/fitness/data/Subscription;

    iput-boolean p3, p0, Lcom/google/android/gms/fitness/request/af;->UT:Z

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/af$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/fitness/request/af;->BR:I

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/af$a;->a(Lcom/google/android/gms/fitness/request/af$a;)Lcom/google/android/gms/fitness/data/Subscription;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/af;->US:Lcom/google/android/gms/fitness/data/Subscription;

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/af$a;->b(Lcom/google/android/gms/fitness/request/af$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/af;->UT:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/af$a;Lcom/google/android/gms/fitness/request/af$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/af;-><init>(Lcom/google/android/gms/fitness/request/af$a;)V

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

    iget v0, p0, Lcom/google/android/gms/fitness/request/af;->BR:I

    return v0
.end method

.method public jD()Lcom/google/android/gms/fitness/data/Subscription;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/af;->US:Lcom/google/android/gms/fitness/data/Subscription;

    return-object v0
.end method

.method public jE()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/af;->UT:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "subscription"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/af;->US:Lcom/google/android/gms/fitness/data/Subscription;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/ag;->a(Lcom/google/android/gms/fitness/request/af;Landroid/os/Parcel;I)V

    return-void
.end method
