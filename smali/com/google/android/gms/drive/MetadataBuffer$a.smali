.class Lcom/google/android/gms/drive/MetadataBuffer$a;
.super Lcom/google/android/gms/drive/Metadata;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/MetadataBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final II:Lcom/google/android/gms/common/data/DataHolder;

.field private final JY:I

.field private final Ns:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/drive/Metadata;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->II:Lcom/google/android/gms/common/data/DataHolder;

    iput p2, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->Ns:I

    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->ar(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->JY:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/drive/MetadataBuffer$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->Ns:I

    return v0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/drive/metadata/MetadataField",
            "<TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->II:Lcom/google/android/gms/common/data/DataHolder;

    iget v1, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->Ns:I

    iget v2, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->JY:I

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/drive/metadata/MetadataField;->a(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/drive/MetadataBuffer$a;->hR()Lcom/google/android/gms/drive/Metadata;

    move-result-object v0

    return-object v0
.end method

.method public hR()Lcom/google/android/gms/drive/Metadata;
    .locals 6

    invoke-static {}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->io()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/drive/metadata/internal/e;->in()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/metadata/MetadataField;

    instance-of v3, v0, Lcom/google/android/gms/drive/metadata/b;

    if-nez v3, :cond_0

    sget-object v3, Lcom/google/android/gms/internal/kd;->Ql:Lcom/google/android/gms/drive/metadata/MetadataField;

    if-eq v0, v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->II:Lcom/google/android/gms/common/data/DataHolder;

    iget v4, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->Ns:I

    iget v5, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->JY:I

    invoke-interface {v0, v3, v1, v4, v5}, Lcom/google/android/gms/drive/metadata/MetadataField;->a(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;II)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/drive/internal/l;

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/l;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    return-object v0
.end method

.method public isDataValid()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->II:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
