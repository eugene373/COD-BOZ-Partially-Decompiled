.class Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;
.super Ljava/lang/Object;
.source "LoaderKeyboard.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

.field final synthetic val$imm:Landroid/view/inputmethod/InputMethodManager;

.field final synthetic val$show:Z


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderKeyboard;ZLandroid/view/inputmethod/InputMethodManager;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    iput-boolean p2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$show:Z

    iput-object p3, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 108
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$show:Z

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->requestFocus()Z

    .line 111
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$300(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;

    move-result-object v2

    invoke-virtual {v0, v1, v4, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)Z

    move-result v0

    .line 113
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderView;->onWindowFocusChanged(Z)V

    .line 116
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$300(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;

    move-result-object v2

    invoke-virtual {v0, v1, v4, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)Z

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderKeyboard;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->access$300(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;ILandroid/os/ResultReceiver;)Z

    move-result v0

    .line 123
    if-nez v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;->val$imm:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v3, v3}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    goto :goto_0
.end method
