.class Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy$1;
.super Ljava/lang/Object;
.source "PlacePickerFragment.java"

# interfaces
.implements Lcom/facebook/widget/GraphObjectAdapter$DataNeededListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;->attach(Lcom/facebook/widget/GraphObjectAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;


# direct methods
.method constructor <init>(Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;)V
    .locals 0

    .prologue
    .line 479
    iput-object p1, p0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy$1;->this$1:Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataNeeded()V
    .locals 1

    .prologue
    .line 484
    iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy$1;->this$1:Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;

    iget-object v0, v0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;

    invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->isLoading()Z

    move-result v0

    if-nez v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy$1;->this$1:Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;

    iget-object v0, v0, Lcom/facebook/widget/PlacePickerFragment$AsNeededLoadingStrategy;->loader:Lcom/facebook/widget/GraphObjectPagingLoader;

    invoke-virtual {v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->followNextLink()V

    .line 487
    :cond_0
    return-void
.end method
