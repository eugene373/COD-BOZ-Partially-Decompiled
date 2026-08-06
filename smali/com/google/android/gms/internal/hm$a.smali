.class public Lcom/google/android/gms/internal/hm$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/hn;


# instance fields
.field final BR:I

.field public final Cj:Landroid/accounts/Account;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hm$a;->CREATOR:Lcom/google/android/gms/internal/hn;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hm$a;-><init>(Landroid/accounts/Account;)V

    return-void
.end method

.method constructor <init>(ILandroid/accounts/Account;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/hm$a;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/internal/hm$a;->Cj:Landroid/accounts/Account;

    return-void
.end method

.method public constructor <init>(Landroid/accounts/Account;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/hm$a;-><init>(ILandroid/accounts/Account;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hm$a;->CREATOR:Lcom/google/android/gms/internal/hn;

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/hm$a;->CREATOR:Lcom/google/android/gms/internal/hn;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hn;->a(Lcom/google/android/gms/internal/hm$a;Landroid/os/Parcel;I)V

    return-void
.end method
