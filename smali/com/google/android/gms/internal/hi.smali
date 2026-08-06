.class public Lcom/google/android/gms/internal/hi;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/hj;

.field public static final Cc:I

.field private static final Cd:Lcom/google/android/gms/internal/hq;


# instance fields
.field final BR:I

.field public final Ce:Ljava/lang/String;

.field final Cf:Lcom/google/android/gms/internal/hq;

.field public final Cg:I

.field public final Ch:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "-1"

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/hi;->Cc:I

    new-instance v0, Lcom/google/android/gms/internal/hj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hi;->CREATOR:Lcom/google/android/gms/internal/hj;

    new-instance v0, Lcom/google/android/gms/internal/hq$a;

    const-string v1, "SsbContext"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/hq$a;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hq$a;->E(Z)Lcom/google/android/gms/internal/hq$a;

    move-result-object v0

    const-string v1, "blob"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hq$a;->at(Ljava/lang/String;)Lcom/google/android/gms/internal/hq$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hq$a;->fm()Lcom/google/android/gms/internal/hq;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/hi;->Cd:Lcom/google/android/gms/internal/hq;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/internal/hq;I[B)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/google/android/gms/internal/hi;->Cc:I

    if-eq p4, v0, :cond_0

    invoke-static {p4}, Lcom/google/android/gms/internal/hp;->O(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid section type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lcom/google/android/gms/internal/hi;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/internal/hi;->Ce:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/hi;->Cf:Lcom/google/android/gms/internal/hq;

    iput p4, p0, Lcom/google/android/gms/internal/hi;->Cg:I

    iput-object p5, p0, Lcom/google/android/gms/internal/hi;->Ch:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hi;->fk()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/hq;)V
    .locals 6

    const/4 v1, 0x1

    sget v4, Lcom/google/android/gms/internal/hi;->Cc:I

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hi;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/hq;I[B)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/hq;Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x1

    invoke-static {p3}, Lcom/google/android/gms/internal/hp;->as(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hi;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/hq;I[B)V

    return-void
.end method

.method public constructor <init>([BLcom/google/android/gms/internal/hq;)V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    sget v4, Lcom/google/android/gms/internal/hi;->Cc:I

    move-object v0, p0

    move-object v3, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hi;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/hq;I[B)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hi;->CREATOR:Lcom/google/android/gms/internal/hj;

    const/4 v0, 0x0

    return v0
.end method

.method public fk()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/hi;->Cg:I

    sget v1, Lcom/google/android/gms/internal/hi;->Cc:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/hi;->Cg:I

    invoke-static {v0}, Lcom/google/android/gms/internal/hp;->O(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid section type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/hi;->Cg:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hi;->Ce:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hi;->Ch:[B

    if-eqz v0, :cond_1

    const-string v0, "Both content and blobContent set"

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/hi;->CREATOR:Lcom/google/android/gms/internal/hj;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hj;->a(Lcom/google/android/gms/internal/hi;Landroid/os/Parcel;I)V

    return-void
.end method
