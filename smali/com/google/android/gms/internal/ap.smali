.class public Lcom/google/android/gms/internal/ap;
.super Ljava/lang/Object;


# instance fields
.field private final nJ:I

.field private final nK:I

.field private final nL:Lcom/google/android/gms/internal/ao;

.field private nM:Landroid/util/Base64OutputStream;

.field private nN:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ar;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ar;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ap;->nL:Lcom/google/android/gms/internal/ao;

    iput p1, p0, Lcom/google/android/gms/internal/ap;->nK:I

    const/4 v0, 0x6

    iput v0, p0, Lcom/google/android/gms/internal/ap;->nJ:I

    return-void
.end method

.method private m(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    array-length v0, v2

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ap;->nN:Ljava/io/ByteArrayOutputStream;

    new-instance v0, Landroid/util/Base64OutputStream;

    iget-object v1, p0, Lcom/google/android/gms/internal/ap;->nN:Ljava/io/ByteArrayOutputStream;

    const/16 v3, 0xa

    invoke-direct {v0, v1, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    new-instance v0, Lcom/google/android/gms/internal/ap$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ap$1;-><init>(Lcom/google/android/gms/internal/ap;)V

    invoke-static {v2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    :goto_1
    array-length v1, v2

    if-ge v0, v1, :cond_3

    iget v1, p0, Lcom/google/android/gms/internal/ap;->nK:I

    if-ge v0, v1, :cond_3

    aget-object v1, v2, v0

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    iget-object v3, p0, Lcom/google/android/gms/internal/ap;->nL:Lcom/google/android/gms/internal/ao;

    aget-object v4, v2, v0

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ao;->l(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Base64OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    const-string v3, "Error while writing hash to byteStream"

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    invoke-virtual {v0}, Landroid/util/Base64OutputStream;->flush()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    invoke-virtual {v0}, Landroid/util/Base64OutputStream;->close()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ap;->nN:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "HashManager: Unable to convert to base 64"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v0, ""

    :goto_1
    return-object v0

    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ap;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ap;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method n(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    array-length v0, v1

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ap;->nN:Ljava/io/ByteArrayOutputStream;

    new-instance v0, Landroid/util/Base64OutputStream;

    iget-object v2, p0, Lcom/google/android/gms/internal/ap;->nN:Ljava/io/ByteArrayOutputStream;

    const/16 v3, 0xa

    invoke-direct {v0, v2, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    new-instance v2, Ljava/util/PriorityQueue;

    iget v0, p0, Lcom/google/android/gms/internal/ap;->nK:I

    new-instance v3, Lcom/google/android/gms/internal/ap$2;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ap$2;-><init>(Lcom/google/android/gms/internal/ap;)V

    invoke-direct {v2, v0, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    const/4 v0, 0x0

    :goto_1
    array-length v3, v1

    if-ge v0, v3, :cond_3

    aget-object v3, v1, v0

    invoke-static {v3}, Lcom/google/android/gms/internal/aq;->p(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    iget v5, p0, Lcom/google/android/gms/internal/ap;->nJ:I

    if-ge v4, v5, :cond_2

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iget v4, p0, Lcom/google/android/gms/internal/ap;->nK:I

    iget v5, p0, Lcom/google/android/gms/internal/ap;->nJ:I

    invoke-static {v3, v4, v5, v2}, Lcom/google/android/gms/internal/as;->a([Ljava/lang/String;IILjava/util/PriorityQueue;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/as$a;

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    iget-object v3, p0, Lcom/google/android/gms/internal/ap;->nL:Lcom/google/android/gms/internal/ao;

    iget-object v0, v0, Lcom/google/android/gms/internal/as$a;->nQ:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ao;->l(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/util/Base64OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v2, "Error while writing hash to byteStream"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    invoke-virtual {v0}, Landroid/util/Base64OutputStream;->flush()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ap;->nM:Landroid/util/Base64OutputStream;

    invoke-virtual {v0}, Landroid/util/Base64OutputStream;->close()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ap;->nN:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "HashManager: unable to convert to base 64"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, ""

    goto :goto_0
.end method
