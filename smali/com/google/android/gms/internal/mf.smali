.class public Lcom/google/android/gms/internal/mf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/mg;


# instance fields
.field final BR:I

.field private final afn:Z

.field private final afo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/mp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mf;->CREATOR:Lcom/google/android/gms/internal/mg;

    return-void
.end method

.method constructor <init>(IZLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/mp;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mf;->BR:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/mf;->afn:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/mf;->afo:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mf;->CREATOR:Lcom/google/android/gms/internal/mg;

    const/4 v0, 0x0

    return v0
.end method

.method public me()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mf;->afn:Z

    return v0
.end method

.method public mf()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/mp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mf;->afo:Ljava/util/List;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/mf;->CREATOR:Lcom/google/android/gms/internal/mg;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/mg;->a(Lcom/google/android/gms/internal/mf;Landroid/os/Parcel;I)V

    return-void
.end method
