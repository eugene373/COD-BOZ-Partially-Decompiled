.class public final Lcom/google/android/gms/internal/pq;
.super Ljava/lang/Object;


# static fields
.field public static final awW:[I

.field public static final awX:[J

.field public static final awY:[F

.field public static final awZ:[D

.field public static final axa:[Z

.field public static final axb:[Ljava/lang/String;

.field public static final axc:[[B

.field public static final axd:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/pq;->awW:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/pq;->awX:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/pq;->awY:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/pq;->awZ:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/pq;->axa:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/pq;->axb:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/pq;->axc:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/pq;->axd:[B

    return-void
.end method

.method public static final b(Lcom/google/android/gms/internal/pf;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pf;->getPosition()I

    move-result v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pf;->gn(I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/pf;->qi()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pf;->gn(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/pf;->gr(I)V

    return v0
.end method

.method static gH(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method public static gI(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method

.method static x(II)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method
