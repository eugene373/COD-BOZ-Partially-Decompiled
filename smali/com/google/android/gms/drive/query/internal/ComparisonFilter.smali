.class public Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
.super Lcom/google/android/gms/drive/query/internal/AbstractFilter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/drive/query/internal/AbstractFilter;"
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/drive/query/internal/a;


# instance fields
.field final BR:I

.field final QK:Lcom/google/android/gms/drive/query/internal/Operator;

.field final QL:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field final QM:Lcom/google/android/gms/drive/metadata/MetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/MetadataField",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/query/internal/a;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/internal/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->CREATOR:Lcom/google/android/gms/drive/query/internal/a;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "operator"    # Lcom/google/android/gms/drive/query/internal/Operator;
    .param p3, "value"    # Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .prologue
    .local p0, "this":Lcom/google/android/gms/drive/query/internal/ComparisonFilter;, "Lcom/google/android/gms/drive/query/internal/ComparisonFilter<TT;>;"
    invoke-direct {p0}, Lcom/google/android/gms/drive/query/internal/AbstractFilter;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->QK:Lcom/google/android/gms/drive/query/internal/Operator;

    iput-object p3, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->QL:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    invoke-static {p3}, Lcom/google/android/gms/drive/query/internal/e;->b(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)Lcom/google/android/gms/drive/metadata/MetadataField;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->QM:Lcom/google/android/gms/drive/metadata/MetadataField;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)V
    .locals 2
    .param p1, "operator"    # Lcom/google/android/gms/drive/query/internal/Operator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/drive/query/internal/Operator;",
            "Lcom/google/android/gms/drive/metadata/SearchableMetadataField",
            "<TT;>;TT;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/drive/query/internal/ComparisonFilter;, "Lcom/google/android/gms/drive/query/internal/ComparisonFilter<TT;>;"
    .local p2, "field":Lcom/google/android/gms/drive/metadata/SearchableMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableMetadataField<TT;>;"
    .local p3, "value":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x1

    invoke-static {p2, p3}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;-><init>(ILcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/drive/query/internal/f",
            "<TF;>;)TF;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->QK:Lcom/google/android/gms/drive/query/internal/Operator;

    iget-object v1, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->QM:Lcom/google/android/gms/drive/metadata/MetadataField;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/drive/query/internal/f;->b(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->QL:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    iget-object v1, p0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;->QM:Lcom/google/android/gms/drive/metadata/MetadataField;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .local p0, "this":Lcom/google/android/gms/drive/query/internal/ComparisonFilter;, "Lcom/google/android/gms/drive/query/internal/ComparisonFilter<TT;>;"
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/a;->a(Lcom/google/android/gms/drive/query/internal/ComparisonFilter;Landroid/os/Parcel;I)V

    return-void
.end method
