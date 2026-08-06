.class Lcom/facebook/widget/FriendPickerFragment$1;
.super Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;
.source "FriendPickerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/FriendPickerFragment;->createAdapter()Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/PickerFragment",
        "<",
        "Lcom/facebook/model/GraphUser;",
        ">.PickerFragmentAdapter<",
        "Lcom/facebook/model/GraphUser;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/FriendPickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/widget/FriendPickerFragment;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lcom/facebook/widget/FriendPickerFragment$1;->this$0:Lcom/facebook/widget/FriendPickerFragment;

    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/PickerFragment$PickerFragmentAdapter;-><init>(Lcom/facebook/widget/PickerFragment;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected getDefaultPicture()I
    .locals 1

    .prologue
    .line 231
    sget v0, Lcom/facebook/android/R$drawable;->com_facebook_profile_default_icon:I

    return v0
.end method

.method protected bridge synthetic getGraphObjectRowLayoutId(Lcom/facebook/model/GraphObject;)I
    .locals 1

    .prologue
    .line 222
    check-cast p1, Lcom/facebook/model/GraphUser;

    invoke-virtual {p0, p1}, Lcom/facebook/widget/FriendPickerFragment$1;->getGraphObjectRowLayoutId(Lcom/facebook/model/GraphUser;)I

    move-result v0

    return v0
.end method

.method protected getGraphObjectRowLayoutId(Lcom/facebook/model/GraphUser;)I
    .locals 1

    .prologue
    .line 226
    sget v0, Lcom/facebook/android/R$layout;->com_facebook_picker_list_row:I

    return v0
.end method
