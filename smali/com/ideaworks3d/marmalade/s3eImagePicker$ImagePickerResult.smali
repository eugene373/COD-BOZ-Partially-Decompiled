.class public Lcom/ideaworks3d/marmalade/s3eImagePicker$ImagePickerResult;
.super Ljava/lang/Object;
.source "s3eImagePicker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eImagePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ImagePickerResult"
.end annotation


# instance fields
.field format:I

.field path:Ljava/lang/String;

.field size:I

.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eImagePicker;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/s3eImagePicker;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$ImagePickerResult;->this$0:Lcom/ideaworks3d/marmalade/s3eImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
