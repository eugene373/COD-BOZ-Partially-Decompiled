.class public final Lcom/google/android/gms/internal/pd$a$a$a;
.super Lcom/google/android/gms/internal/ph;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/pd$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ph",
        "<",
        "Lcom/google/android/gms/internal/pd$a$a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public awi:[B

.field public awj:Ljava/lang/String;

.field public awk:D

.field public awl:F

.field public awm:J

.field public awn:I

.field public awo:I

.field public awp:Z

.field public awq:[Lcom/google/android/gms/internal/pd$a;

.field public awr:[Lcom/google/android/gms/internal/pd$a$a;

.field public aws:[Ljava/lang/String;

.field public awt:[J

.field public awu:[F

.field public awv:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ph;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pd$a$a$a;->qh()Lcom/google/android/gms/internal/pd$a$a$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pg;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    sget-object v2, Lcom/google/android/gms/internal/pq;->axd:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->a(I[B)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->a(ID)V

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    if-eq v0, v2, :cond_3

    const/4 v0, 0x4

    iget v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->b(IF)V

    :cond_3
    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->b(IJ)V

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    iget v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->s(II)V

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    iget v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->t(II)V

    :cond_6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    if-eqz v0, :cond_7

    const/16 v0, 0x8

    iget-boolean v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->b(IZ)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    array-length v0, v0

    if-lez v0, :cond_9

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    array-length v2, v2

    if-ge v0, v2, :cond_9

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_8

    const/16 v3, 0x9

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    array-length v0, v0

    if-lez v0, :cond_b

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    array-length v2, v2

    if-ge v0, v2, :cond_b

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_a

    const/16 v3, 0xa

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/pg;->a(ILcom/google/android/gms/internal/pn;)V

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_d

    move v0, v1

    :goto_2
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_d

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    aget-object v2, v2, v0

    if-eqz v2, :cond_c

    const/16 v3, 0xb

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/pg;->b(ILjava/lang/String;)V

    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    array-length v0, v0

    if-lez v0, :cond_e

    move v0, v1

    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    array-length v2, v2

    if-ge v0, v2, :cond_e

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    aget-wide v4, v3, v0

    invoke-virtual {p1, v2, v4, v5}, Lcom/google/android/gms/internal/pg;->b(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_e
    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_f

    const/16 v0, 0xd

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/pg;->b(IJ)V

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    array-length v0, v0

    if-lez v0, :cond_10

    :goto_4
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    array-length v0, v0

    if-ge v1, v0, :cond_10

    const/16 v0, 0xe

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    aget v2, v2, v1

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/pg;->b(IF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_10
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ph;->a(Lcom/google/android/gms/internal/pg;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pn;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pd$a$a$a;->t(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pd$a$a$a;

    move-result-object v0

    return-object v0
.end method

.method protected c()I
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/ph;->c()I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    sget-object v3, Lcom/google/android/gms/internal/pq;->axd:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/pg;->b(I[B)I

    move-result v2

    add-int/2addr v0, v2

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/pg;->j(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_2

    const/4 v2, 0x3

    iget-wide v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    invoke-static {v2, v4, v5}, Lcom/google/android/gms/internal/pg;->b(ID)I

    move-result v2

    add-int/2addr v0, v2

    :cond_2
    iget v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-eq v2, v3, :cond_3

    const/4 v2, 0x4

    iget v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/pg;->c(IF)I

    move-result v2

    add-int/2addr v0, v2

    :cond_3
    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    cmp-long v2, v2, v6

    if-eqz v2, :cond_4

    const/4 v2, 0x5

    iget-wide v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    invoke-static {v2, v4, v5}, Lcom/google/android/gms/internal/pg;->d(IJ)I

    move-result v2

    add-int/2addr v0, v2

    :cond_4
    iget v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    if-eqz v2, :cond_5

    const/4 v2, 0x6

    iget v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/pg;->u(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_5
    iget v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    if-eqz v2, :cond_6

    const/4 v2, 0x7

    iget v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/pg;->v(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_6
    iget-boolean v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    if-eqz v2, :cond_7

    const/16 v2, 0x8

    iget-boolean v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/pg;->c(IZ)I

    move-result v2

    add-int/2addr v0, v2

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    array-length v2, v2

    if-lez v2, :cond_a

    move v2, v0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    array-length v3, v3

    if-ge v0, v3, :cond_9

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    aget-object v3, v3, v0

    if-eqz v3, :cond_8

    const/16 v4, 0x9

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I

    move-result v3

    add-int/2addr v2, v3

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_9
    move v0, v2

    :cond_a
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    if-eqz v2, :cond_d

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    array-length v2, v2

    if-lez v2, :cond_d

    move v2, v0

    move v0, v1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    array-length v3, v3

    if-ge v0, v3, :cond_c

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    aget-object v3, v3, v0

    if-eqz v3, :cond_b

    const/16 v4, 0xa

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/pg;->c(ILcom/google/android/gms/internal/pn;)I

    move-result v3

    add-int/2addr v2, v3

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_c
    move v0, v2

    :cond_d
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    array-length v2, v2

    if-lez v2, :cond_10

    move v2, v1

    move v3, v1

    move v4, v1

    :goto_2
    iget-object v5, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    array-length v5, v5

    if-ge v2, v5, :cond_f

    iget-object v5, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    aget-object v5, v5, v2

    if-eqz v5, :cond_e

    add-int/lit8 v4, v4, 0x1

    invoke-static {v5}, Lcom/google/android/gms/internal/pg;->di(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v3, v5

    :cond_e
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_f
    add-int/2addr v0, v3

    mul-int/lit8 v2, v4, 0x1

    add-int/2addr v0, v2

    :cond_10
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    if-eqz v2, :cond_12

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    array-length v2, v2

    if-lez v2, :cond_12

    move v2, v1

    :goto_3
    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    array-length v3, v3

    if-ge v1, v3, :cond_11

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    aget-wide v4, v3, v1

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/pg;->D(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_11
    add-int/2addr v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_12
    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    cmp-long v1, v2, v6

    if-eqz v1, :cond_13

    const/16 v1, 0xd

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pg;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_13
    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    if-eqz v1, :cond_14

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    array-length v1, v1

    if-lez v1, :cond_14

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_14
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    .end local p1    # "o":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "o":Ljava/lang/Object;
    :cond_1
    instance-of v1, p1, Lcom/google/android/gms/internal/pd$a$a$a;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/pd$a$a$a;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    iget-object v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_2
    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    iget-wide v4, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    iget v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    iget v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    iget v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    iget-object v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    iget-object v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    iget-object v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    iget-object v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/pl;->equals([F[F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pd$a$a$a;->a(Lcom/google/android/gms/internal/ph;)Z

    move-result v0

    goto/16 :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    mul-int/lit8 v0, v0, 0x1f

    ushr-long v4, v2, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x4cf

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    invoke-static {v1}, Lcom/google/android/gms/internal/pl;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pd$a$a$a;->qz()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    const/16 v0, 0x4d5

    goto :goto_1
.end method

.method public qh()Lcom/google/android/gms/internal/pd$a$a$a;
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/pq;->axd:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    iput-wide v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    iput v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    iput v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    iput-boolean v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    invoke-static {}, Lcom/google/android/gms/internal/pd$a;->qd()[Lcom/google/android/gms/internal/pd$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    invoke-static {}, Lcom/google/android/gms/internal/pd$a$a;->qf()[Lcom/google/android/gms/internal/pd$a$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    sget-object v0, Lcom/google/android/gms/internal/pq;->axb:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/pq;->awX:[J

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    sget-object v0, Lcom/google/android/gms/internal/pq;->awY:[F

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    iput-wide v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awJ:Lcom/google/android/gms/internal/pj;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awU:I

    return-object p0
.end method

.method public t(Lcom/google/android/gms/internal/pf;)Lcom/google/android/gms/internal/pd$a$a$a;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/pd$a$a$a;->a(Lcom/google/android/gms/internal/pf;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awi:[B

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awj:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awk:D

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awl:F

    goto :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awm:J

    goto :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->ql()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awn:I

    goto :goto_0

    :sswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qn()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awo:I

    goto :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qm()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awp:Z

    goto :goto_0

    :sswitch_9
    const/16 v0, 0x4a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/pd$a;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/google/android/gms/internal/pd$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/pd$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/google/android/gms/internal/pd$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/pd$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awq:[Lcom/google/android/gms/internal/pd$a;

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x52

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    if-nez v0, :cond_5

    move v0, v1

    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/pd$a$a;

    if-eqz v0, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_6

    new-instance v3, Lcom/google/android/gms/internal/pd$a$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/pd$a$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    array-length v0, v0

    goto :goto_3

    :cond_6
    new-instance v3, Lcom/google/android/gms/internal/pd$a$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/pd$a$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->a(Lcom/google/android/gms/internal/pn;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awr:[Lcom/google/android/gms/internal/pd$a$a;

    goto/16 :goto_0

    :sswitch_b
    const/16 v0, 0x5a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    if-nez v0, :cond_8

    move v0, v1

    :goto_5
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    if-eqz v0, :cond_7

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    :goto_6
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_9

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->aws:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_c
    const/16 v0, 0x60

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    if-nez v0, :cond_b

    move v0, v1

    :goto_7
    add-int/2addr v2, v0

    new-array v2, v2, [J

    if-eqz v0, :cond_a

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_a
    :goto_8
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_c

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J

    move-result-wide v4

    aput-wide v4, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    array-length v0, v0

    goto :goto_7

    :cond_c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J

    move-result-wide v4

    aput-wide v4, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qp()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->gp(I)I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->getPosition()I

    move-result v2

    move v0, v1

    :goto_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qu()I

    move-result v4

    if-lez v4, :cond_d

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_d
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pf;->gr(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    if-nez v2, :cond_f

    move v2, v1

    :goto_a
    add-int/2addr v0, v2

    new-array v0, v0, [J

    if-eqz v2, :cond_e

    iget-object v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_e
    :goto_b
    array-length v4, v0

    if-ge v2, v4, :cond_10

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J

    move-result-wide v4

    aput-wide v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_f
    iget-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    array-length v2, v2

    goto :goto_a

    :cond_10
    iput-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awt:[J

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/pf;->gq(I)V

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qk()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awv:J

    goto/16 :goto_0

    :sswitch_f
    const/16 v0, 0x75

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/pq;->b(Lcom/google/android/gms/internal/pf;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    if-nez v0, :cond_12

    move v0, v1

    :goto_c
    add-int/2addr v2, v0

    new-array v2, v2, [F

    if-eqz v0, :cond_11

    iget-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_11
    :goto_d
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_13

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readFloat()F

    move-result v3

    aput v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qi()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_12
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    array-length v0, v0

    goto :goto_c

    :cond_13
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readFloat()F

    move-result v3

    aput v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->qp()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/pf;->gp(I)I

    move-result v2

    div-int/lit8 v3, v0, 0x4

    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    if-nez v0, :cond_15

    move v0, v1

    :goto_e
    add-int/2addr v3, v0

    new-array v3, v3, [F

    if-eqz v0, :cond_14

    iget-object v4, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    invoke-static {v4, v1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_14
    :goto_f
    array-length v4, v3

    if-ge v0, v4, :cond_16

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pf;->readFloat()F

    move-result v4

    aput v4, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    :cond_15
    iget-object v0, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    array-length v0, v0

    goto :goto_e

    :cond_16
    iput-object v3, p0, Lcom/google/android/gms/internal/pd$a$a$a;->awu:[F

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pf;->gq(I)V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x19 -> :sswitch_3
        0x25 -> :sswitch_4
        0x28 -> :sswitch_5
        0x30 -> :sswitch_6
        0x38 -> :sswitch_7
        0x40 -> :sswitch_8
        0x4a -> :sswitch_9
        0x52 -> :sswitch_a
        0x5a -> :sswitch_b
        0x60 -> :sswitch_c
        0x62 -> :sswitch_d
        0x68 -> :sswitch_e
        0x72 -> :sswitch_10
        0x75 -> :sswitch_f
    .end sparse-switch
.end method
