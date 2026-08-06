.class Lcom/ideaworks3d/marmalade/s3eCamera$2;
.super Ljava/lang/Object;
.source "s3eCamera.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eCamera;->s3eCameraStart(III)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eCamera;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eCamera;)V
    .locals 0

    .prologue
    .line 264
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eCamera$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera$2;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eCamera;->createPreview()I

    .line 268
    return-void
.end method
