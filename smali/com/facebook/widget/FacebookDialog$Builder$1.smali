.class Lcom/facebook/widget/FacebookDialog$Builder$1;
.super Ljava/lang/Object;
.source "FacebookDialog.java"

# interfaces
.implements Lcom/facebook/widget/FacebookDialog$OnPresentCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/FacebookDialog$Builder;->getOnPresentCallback()Lcom/facebook/widget/FacebookDialog$OnPresentCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/FacebookDialog$Builder;


# direct methods
.method constructor <init>(Lcom/facebook/widget/FacebookDialog$Builder;)V
    .locals 0

    .prologue
    .line 746
    iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPresent(Landroid/content/Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 750
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 751
    invoke-static {}, Lcom/facebook/widget/FacebookDialog;->access$900()Lcom/facebook/NativeAppCallAttachmentStore;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v1, v1, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;

    invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v2, v2, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/NativeAppCallAttachmentStore;->addAttachmentsForCall(Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;)V

    .line 753
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 754
    invoke-static {}, Lcom/facebook/widget/FacebookDialog;->access$900()Lcom/facebook/NativeAppCallAttachmentStore;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v1, v1, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;

    invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;

    iget-object v2, v2, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/NativeAppCallAttachmentStore;->addAttachmentFilesForCall(Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;)V

    .line 757
    :cond_1
    return-void
.end method
