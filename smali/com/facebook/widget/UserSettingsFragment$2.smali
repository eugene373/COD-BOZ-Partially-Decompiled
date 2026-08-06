.class Lcom/facebook/widget/UserSettingsFragment$2;
.super Ljava/lang/Object;
.source "UserSettingsFragment.java"

# interfaces
.implements Lcom/facebook/internal/ImageRequest$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/UserSettingsFragment;->getImageRequest()Lcom/facebook/internal/ImageRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/UserSettingsFragment;


# direct methods
.method constructor <init>(Lcom/facebook/widget/UserSettingsFragment;)V
    .locals 0

    .prologue
    .line 425
    iput-object p1, p0, Lcom/facebook/widget/UserSettingsFragment$2;->this$0:Lcom/facebook/widget/UserSettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/internal/ImageResponse;)V
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment$2;->this$0:Lcom/facebook/widget/UserSettingsFragment;

    iget-object v1, p0, Lcom/facebook/widget/UserSettingsFragment$2;->this$0:Lcom/facebook/widget/UserSettingsFragment;

    invoke-static {v1}, Lcom/facebook/widget/UserSettingsFragment;->access$000(Lcom/facebook/widget/UserSettingsFragment;)Lcom/facebook/model/GraphUser;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/facebook/widget/UserSettingsFragment;->access$300(Lcom/facebook/widget/UserSettingsFragment;Ljava/lang/String;Lcom/facebook/internal/ImageResponse;)V

    .line 429
    return-void
.end method
