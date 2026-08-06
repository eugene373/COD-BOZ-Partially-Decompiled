.class public final Lcom/google/android/gms/internal/pg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/pg$a;
    }
.end annotation


# instance fields
.field private final awI:I

.field private final buffer:[B

.field private position:I


# direct methods
.method private constructor <init>([BII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pg;->buffer:[B

    iput p2, p0, Lcom/google/android/gms/internal/pg;->position:I

    add-int v0, p2, p3

    iput v0, p0, Lcom/google/android/gms/internal/pg;->awI:I

    return-void
.end method

.method public static D(J)I
    .locals 2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/pg;->G(J)I

    move-result v0

    return v0
.end method

.method public static E(J)I
    .locals 2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/pg;->I(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/pg;->G(J)I

    move-result v0

    return v0
.end method

.method public static G(J)I
    .locals 4

    const-wide/16 v2, 0x0

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 v0, 0x5

    goto :goto_0

    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 v0, 0x6

    goto :goto_0

    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    const/4 v0, 0x7

    goto :goto_0

    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    const/16 v0, 0x8

    goto :goto_0

    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    const/16 v0, 0x9

    goto :goto_0

    :cond_8
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static I(J)J
    .locals 4

    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long v2, p0, v2

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method public static V(Z)I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static b(ID)I
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->f(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(ILcom/google/android/gms/internal/pn;)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->d(Lcom/google/android/gms/internal/pn;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(I[B)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->s([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b([BII)Lcom/google/android/gms/internal/pg;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/pg;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/pg;-><init>([BII)V

    return-object v0
.end method

.method public static c(IF)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->e(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static c(ILcom/google/android/gms/internal/pn;)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->e(Lcom/google/android/gms/internal/pn;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static c(IZ)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->V(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(IJ)I
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->D(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(Lcom/google/android/gms/internal/pn;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pn;->qI()I

    move-result v0

    return v0
.end method

.method public static di(Ljava/lang/String;)I
    .locals 2

    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lcom/google/android/gms/internal/pg;->gB(I)I

    move-result v1

    array-length v0, v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v0, v1

    return v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "UTF-8 not supported."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(F)I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public static e(IJ)I
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->E(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static e(Lcom/google/android/gms/internal/pn;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pn;->qI()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static f(D)I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public static gB(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr v0, p0

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    :cond_3
    const/4 v0, 0x5

    goto :goto_0
.end method

.method public static gD(I)I
    .locals 2

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 v1, p0, 0x1f

    xor-int/2addr v0, v1

    return v0
.end method

.method public static gw(I)I
    .locals 1

    if-ltz p0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gB(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static gx(I)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gD(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I

    move-result v0

    return v0
.end method

.method public static gz(I)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/pq;->x(II)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I

    move-result v0

    return v0
.end method

.method public static j(ILjava/lang/String;)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->di(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static q([B)Lcom/google/android/gms/internal/pg;
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->b([BII)Lcom/google/android/gms/internal/pg;

    move-result-object v0

    return-object v0
.end method

.method public static s([B)I
    .locals 2

    array-length v0, p0

    invoke-static {v0}, Lcom/google/android/gms/internal/pg;->gB(I)I

    move-result v0

    array-length v1, p0

    add-int/2addr v0, v1

    return v0
.end method

.method public static u(II)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->gw(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static v(II)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/pg;->gz(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->gx(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public B(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pg;->F(J)V

    return-void
.end method

.method public C(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/pg;->I(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->F(J)V

    return-void
.end method

.method public F(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    long-to-int v0, p1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    return-void

    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public H(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    long-to-int v0, p1

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/16 v0, 0x8

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/16 v0, 0x10

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/16 v0, 0x18

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/16 v0, 0x28

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/16 v0, 0x30

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    const/16 v0, 0x38

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    return-void
.end method

.method public U(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(ID)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/pg;->e(D)V

    return-void
.end method

.method public a(ILcom/google/android/gms/internal/pn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->c(Lcom/google/android/gms/internal/pn;)V

    return-void
.end method

.method public a(I[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->r([B)V

    return-void
.end method

.method public b(B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/pg;->position:I

    iget v1, p0, Lcom/google/android/gms/internal/pg;->awI:I

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/pg$a;

    iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I

    iget v2, p0, Lcom/google/android/gms/internal/pg;->awI:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/pg$a;-><init>(II)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->buffer:[B

    iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/pg;->position:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public b(IF)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->d(F)V

    return-void
.end method

.method public b(IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/pg;->B(J)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->dh(Ljava/lang/String;)V

    return-void
.end method

.method public b(IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->U(Z)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/pn;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/pg;)V

    return-void
.end method

.method public c(IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/pg;->C(J)V

    return-void
.end method

.method public c(Lcom/google/android/gms/internal/pn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pn;->qH()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/pg;)V

    return-void
.end method

.method public c([BII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/pg;->awI:I

    iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->buffer:[B

    iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/google/android/gms/internal/pg;->position:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/google/android/gms/internal/pg;->position:I

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/pg$a;

    iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I

    iget v2, p0, Lcom/google/android/gms/internal/pg;->awI:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/pg$a;-><init>(II)V

    throw v0
.end method

.method public d(F)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gC(I)V

    return-void
.end method

.method public dh(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/pg;->gA(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->t([B)V

    return-void
.end method

.method public e(D)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->H(J)V

    return-void
.end method

.method public gA(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pg;->gy(I)V

    return-void

    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public gC(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit16 v0, p1, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gy(I)V

    return-void
.end method

.method public gu(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pg;->gA(I)V

    :goto_0
    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/pg;->F(J)V

    goto :goto_0
.end method

.method public gv(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/pg;->gD(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V

    return-void
.end method

.method public gy(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-byte v0, p1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->b(B)V

    return-void
.end method

.method public qx()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/pg;->awI:I

    iget v1, p0, Lcom/google/android/gms/internal/pg;->position:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public qy()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pg;->qx()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public r([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    array-length v0, p1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pg;->t([B)V

    return-void
.end method

.method public s(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->gu(I)V

    return-void
.end method

.method public t(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pg;->w(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/pg;->gv(I)V

    return-void
.end method

.method public t([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/pg;->c([BII)V

    return-void
.end method

.method public w(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/pq;->x(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/pg;->gA(I)V

    return-void
.end method
