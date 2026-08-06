.class public Lcom/google/android/gms/internal/he;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/he$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/hf;


# instance fields
.field final BR:I

.field final BS:[Lcom/google/android/gms/internal/hi;

.field public final BT:Ljava/lang/String;

.field public final BU:Z

.field public final account:Landroid/accounts/Account;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/he;->CREATOR:Lcom/google/android/gms/internal/hf;

    return-void
.end method

.method constructor <init>(I[Lcom/google/android/gms/internal/hi;Ljava/lang/String;ZLandroid/accounts/Account;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/he;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/internal/he;->BS:[Lcom/google/android/gms/internal/hi;

    iput-object p3, p0, Lcom/google/android/gms/internal/he;->BT:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/he;->BU:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/he;->account:Landroid/accounts/Account;

    return-void
.end method

.method varargs constructor <init>(Ljava/lang/String;ZLandroid/accounts/Account;[Lcom/google/android/gms/internal/hi;)V
    .locals 6

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p4

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/he;-><init>(I[Lcom/google/android/gms/internal/hi;Ljava/lang/String;ZLandroid/accounts/Account;)V

    new-instance v1, Ljava/util/BitSet;

    invoke-static {}, Lcom/google/android/gms/internal/hp;->fl()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    array-length v2, p4

    if-ge v0, v2, :cond_2

    aget-object v2, p4, v0

    iget v2, v2, Lcom/google/android/gms/internal/hi;->Cg:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Duplicate global search section type "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v2}, Lcom/google/android/gms/internal/hp;->O(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/he;->CREATOR:Lcom/google/android/gms/internal/hf;

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/he;->CREATOR:Lcom/google/android/gms/internal/hf;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hf;->a(Lcom/google/android/gms/internal/he;Landroid/os/Parcel;I)V

    return-void
.end method
