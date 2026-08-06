.class Lcom/facebook/widget/PickerFragment$2;
.super Ljava/lang/Object;
.source "PickerFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/PickerFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/PickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/widget/PickerFragment;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/facebook/widget/PickerFragment$2;->this$0:Lcom/facebook/widget/PickerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/widget/PickerFragment$2;->this$0:Lcom/facebook/widget/PickerFragment;

    check-cast p1, Landroid/widget/ListView;

    invoke-static {v0, p1, p2, p3}, Lcom/facebook/widget/PickerFragment;->access$000(Lcom/facebook/widget/PickerFragment;Landroid/widget/ListView;Landroid/view/View;I)V

    .line 161
    return-void
.end method
