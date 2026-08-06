.class Lcom/ideaworks3d/marmalade/s3eImagePicker$2;
.super Ljava/lang/Object;
.source "s3eImagePicker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eImagePicker;->convertUriToFile(Landroid/net/Uri;)Ljava/io/File;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eImagePicker;

.field final synthetic val$file:[Ljava/io/File;

.field final synthetic val$uriurl:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eImagePicker;[Ljava/io/File;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;->this$0:Lcom/ideaworks3d/marmalade/s3eImagePicker;

    iput-object p2, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;->val$file:[Ljava/io/File;

    iput-object p3, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;->val$uriurl:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 234
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;->val$file:[Ljava/io/File;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;->this$0:Lcom/ideaworks3d/marmalade/s3eImagePicker;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;->val$uriurl:Landroid/net/Uri;

    invoke-static {v1, v2}, Lcom/ideaworks3d/marmalade/s3eImagePicker;->access$000(Lcom/ideaworks3d/marmalade/s3eImagePicker;Landroid/net/Uri;)Ljava/io/File;

    move-result-object v1

    aput-object v1, v0, v3

    .line 235
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eImagePicker$2;->this$0:Lcom/ideaworks3d/marmalade/s3eImagePicker;

    invoke-static {v0, v3}, Lcom/ideaworks3d/marmalade/s3eImagePicker;->access$102(Lcom/ideaworks3d/marmalade/s3eImagePicker;Z)Z

    .line 236
    return-void
.end method
