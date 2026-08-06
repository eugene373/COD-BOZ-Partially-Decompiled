.class Lcom/ideaworks3d/marmalade/s3eCamera$1;
.super Ljava/lang/Object;
.source "s3eCamera.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eCamera;->forceRefocus(Ljava/lang/String;)V
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
    .line 177
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eCamera$1;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 0

    .prologue
    .line 181
    return-void
.end method
