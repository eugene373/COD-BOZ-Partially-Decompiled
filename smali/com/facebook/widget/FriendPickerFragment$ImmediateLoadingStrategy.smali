.class Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;
.super Lcom/facebook/widget/PickerFragment$LoadingStrategy;
.source "FriendPickerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FriendPickerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ImmediateLoadingStrategy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/PickerFragment",
        "<",
        "Lcom/facebook/model/GraphUser;",
        ">.",
        "LoadingStrategy;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/FriendPickerFragment;


# direct methods
.method private constructor <init>(Lcom/facebook/widget/FriendPickerFragment;)V
    .locals 0

    .prologue
    .line 329
    iput-object p1, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->this$0:Lcom/facebook/widget/FriendPickerFragment;

    invoke-direct {p0, p1}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;-><init>(Lcom/facebook/widget/PickerFragment;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/FriendPickerFragment;Lcom/facebook/widget/FriendPickerFragment$1;)V
    .locals 0

    .prologue
    .line 329
    invoke-direct {p0, p1}, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;-><init>(Lcom/facebook/widget/FriendPickerFragment;)V

    return-void
.end method

.method private followNextLink()V
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->this$0:Lcom/facebook/widget/FriendPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/widget/FriendPickerFragment;->displayActivityCircle()V

    .line 365
    iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;

    invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->followNextLink()V

    .line 366
    return-void
.end method


# virtual methods
.method protected canSkipRoundTripIfCached()Z
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->this$0:Lcom/facebook/widget/FriendPickerFragment;

    invoke-static {v0}, Lcom/facebook/widget/FriendPickerFragment;->access$100(Lcom/facebook/widget/FriendPickerFragment;)Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/FriendPickerFragment$FriendPickerType;->isCacheable()Z

    move-result v0

    return v0
.end method

.method protected onLoadFinished(Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/GraphObjectPagingLoader",
            "<",
            "Lcom/facebook/model/GraphUser;",
            ">;",
            "Lcom/facebook/widget/SimpleGraphObjectCursor",
            "<",
            "Lcom/facebook/model/GraphUser;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 333
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->onLoadFinished(Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/widget/SimpleGraphObjectCursor;)V

    .line 337
    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/facebook/widget/GraphObjectPagingLoader;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    :cond_0
    :goto_0
    return-void

    .line 341
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->areMoreObjectsAvailable()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 343
    invoke-direct {p0}, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->followNextLink()V

    goto :goto_0

    .line 346
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/FriendPickerFragment$ImmediateLoadingStrategy;->this$0:Lcom/facebook/widget/FriendPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/widget/FriendPickerFragment;->hideActivityCircle()V

    .line 350
    invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->isFromCache()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 351
    invoke-virtual {p2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I

    move-result v0

    if-nez v0, :cond_3

    const-wide/16 v0, 0x7d0

    :goto_1
    invoke-virtual {p1, v0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->refreshOriginalRequest(J)V

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x0

    goto :goto_1
.end method
