.class Lbolts/WebViewAppLinkResolver$2;
.super Ljava/lang/Object;
.source "WebViewAppLinkResolver.java"

# interfaces
.implements Lbolts/Continuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbolts/WebViewAppLinkResolver;->getAppLinkFromUrlInBackground(Landroid/net/Uri;)Lbolts/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/Continuation",
        "<",
        "Ljava/lang/Void;",
        "Lbolts/Task",
        "<",
        "Lorg/json/JSONArray;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lbolts/WebViewAppLinkResolver;

.field final synthetic val$content:Lbolts/Capture;

.field final synthetic val$contentType:Lbolts/Capture;

.field final synthetic val$url:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lbolts/WebViewAppLinkResolver;Lbolts/Capture;Landroid/net/Uri;Lbolts/Capture;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lbolts/WebViewAppLinkResolver$2;->this$0:Lbolts/WebViewAppLinkResolver;

    iput-object p2, p0, Lbolts/WebViewAppLinkResolver$2;->val$contentType:Lbolts/Capture;

    iput-object p3, p0, Lbolts/WebViewAppLinkResolver$2;->val$url:Landroid/net/Uri;

    iput-object p4, p0, Lbolts/WebViewAppLinkResolver$2;->val$content:Lbolts/Capture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public then(Lbolts/Task;)Lbolts/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbolts/Task",
            "<",
            "Ljava/lang/Void;",
            ">;)",
            "Lbolts/Task",
            "<",
            "Lorg/json/JSONArray;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .local p1, "task":Lbolts/Task;, "Lbolts/Task<Ljava/lang/Void;>;"
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 128
    invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;

    move-result-object v6

    .line 129
    .local v6, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<Lorg/json/JSONArray;>.TaskCompletionSource;"
    new-instance v0, Landroid/webkit/WebView;

    iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->this$0:Lbolts/WebViewAppLinkResolver;

    invoke-static {v1}, Lbolts/WebViewAppLinkResolver;->access$200(Lbolts/WebViewAppLinkResolver;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 130
    .local v0, "webView":Landroid/webkit/WebView;
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 131
    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->setNetworkAvailable(Z)V

    .line 132
    new-instance v1, Lbolts/WebViewAppLinkResolver$2$1;

    invoke-direct {v1, p0}, Lbolts/WebViewAppLinkResolver$2$1;-><init>(Lbolts/WebViewAppLinkResolver$2;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 157
    new-instance v1, Lbolts/WebViewAppLinkResolver$2$2;

    invoke-direct {v1, p0, v6}, Lbolts/WebViewAppLinkResolver$2$2;-><init>(Lbolts/WebViewAppLinkResolver$2;Lbolts/Task$TaskCompletionSource;)V

    const-string v2, "boltsWebViewAppLinkResolverResult"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    const/4 v3, 0x0

    .line 168
    .local v3, "inferredContentType":Ljava/lang/String;
    iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->val$contentType:Lbolts/Capture;

    invoke-virtual {v1}, Lbolts/Capture;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 169
    iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->val$contentType:Lbolts/Capture;

    invoke-virtual {v1}, Lbolts/Capture;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v3, v1, v5

    .line 171
    :cond_0
    iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->val$url:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lbolts/WebViewAppLinkResolver$2;->val$content:Lbolts/Capture;

    invoke-virtual {v2}, Lbolts/Capture;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    invoke-virtual {v6}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic then(Lbolts/Task;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lbolts/Task;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 124
    invoke-virtual {p0, p1}, Lbolts/WebViewAppLinkResolver$2;->then(Lbolts/Task;)Lbolts/Task;

    move-result-object v0

    return-object v0
.end method
