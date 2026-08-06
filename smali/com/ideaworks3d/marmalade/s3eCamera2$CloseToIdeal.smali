.class Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;
.super Ljava/lang/Object;
.source "s3eCamera2.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eCamera2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CloseToIdeal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Landroid/util/Size;",
        ">;"
    }
.end annotation


# instance fields
.field m_IdealSize:Landroid/util/Size;


# direct methods
.method constructor <init>(Landroid/util/Size;)V
    .locals 0

    .prologue
    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;

    .line 197
    return-void
.end method


# virtual methods
.method public compare(Landroid/util/Size;Landroid/util/Size;)I
    .locals 4

    .prologue
    .line 201
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->m_IdealSize:Landroid/util/Size;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 191
    check-cast p1, Landroid/util/Size;

    check-cast p2, Landroid/util/Size;

    invoke-virtual {p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eCamera2$CloseToIdeal;->compare(Landroid/util/Size;Landroid/util/Size;)I

    move-result v0

    return v0
.end method
