.class public Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/DataSourcesRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private Ux:Z

.field private Uy:[Lcom/google/android/gms/fitness/data/DataType;

.field private Uz:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array v0, v1, [Lcom/google/android/gms/fitness/data/DataType;

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uz:[I

    iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Ux:Z

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)[Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)[I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uz:[I

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Ux:Z

    return v0
.end method


# virtual methods
.method public build()Lcom/google/android/gms/fitness/request/DataSourcesRequest;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;

    array-length v0, v0

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Must add at least one data type"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uz:[I

    array-length v0, v0

    if-lez v0, :cond_1

    :goto_1
    const-string v0, "Must add at least one data source type"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;Lcom/google/android/gms/fitness/request/DataSourcesRequest$1;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public varargs setDataSourceTypes([I)Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;
    .locals 0
    .param p1, "dataSourceTypes"    # [I

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uz:[I

    return-object p0
.end method

.method public varargs setDataTypes([Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;
    .locals 0
    .param p1, "dataTypes"    # [Lcom/google/android/gms/fitness/data/DataType;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;

    return-object p0
.end method
