.class public final Lcom/google/android/gms/drive/MetadataBuffer;
.super Lcom/google/android/gms/common/data/DataBuffer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/MetadataBuffer$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/DataBuffer",
        "<",
        "Lcom/google/android/gms/drive/Metadata;",
        ">;"
    }
.end annotation


# instance fields
.field private final Nq:Ljava/lang/String;

.field private Nr:Lcom/google/android/gms/drive/MetadataBuffer$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V
    .locals 2
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;
    .param p2, "nextPageToken"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/DataBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object p2, p0, Lcom/google/android/gms/drive/MetadataBuffer;->Nq:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->gy()Landroid/os/Bundle;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/drive/MetadataBuffer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    return-void
.end method


# virtual methods
.method public get(I)Lcom/google/android/gms/drive/Metadata;
    .locals 2
    .param p1, "row"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->Nr:Lcom/google/android/gms/drive/MetadataBuffer$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/drive/MetadataBuffer$a;->a(Lcom/google/android/gms/drive/MetadataBuffer$a;)I

    move-result v1

    if-eq v1, p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/MetadataBuffer$a;

    iget-object v1, p0, Lcom/google/android/gms/drive/MetadataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/drive/MetadataBuffer$a;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->Nr:Lcom/google/android/gms/drive/MetadataBuffer$a;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/MetadataBuffer;->get(I)Lcom/google/android/gms/drive/Metadata;

    move-result-object v0

    return-object v0
.end method

.method public getNextPageToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->Nq:Ljava/lang/String;

    return-object v0
.end method
