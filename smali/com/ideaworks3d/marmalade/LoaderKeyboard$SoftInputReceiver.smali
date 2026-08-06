.class Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;
.super Landroid/os/ResultReceiver;
.source "LoaderKeyboard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderKeyboard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SoftInputReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/LoaderKeyboard;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    .line 23
    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 24
    return-void
.end method


# virtual methods
.method protected onReceiveResult(ILandroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 28
    .line 29
    packed-switch p1, :pswitch_data_0

    :cond_0
    move v0, v1

    .line 46
    :goto_0
    if-eqz v0, :cond_1

    .line 49
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 51
    invoke-virtual {v0, v1, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 53
    :cond_1
    return-void

    .line 33
    :pswitch_0
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$000(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z

    move-result v2

    if-eq v2, v0, :cond_0

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$100(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 40
    :pswitch_1
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$000(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$100(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
