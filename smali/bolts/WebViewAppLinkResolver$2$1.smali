.class Lbolts/WebViewAppLinkResolver$2$1;
.super Landroid/webkit/WebViewClient;
.source "WebViewAppLinkResolver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbolts/WebViewAppLinkResolver$2;->then(Lbolts/Task;)Lbolts/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private loaded:Z

.field final synthetic this$1:Lbolts/WebViewAppLinkResolver$2;


# direct methods
.method constructor <init>(Lbolts/WebViewAppLinkResolver$2;)V
    .locals 1

    .prologue
    .line 132
    iput-object p1, p0, Lbolts/WebViewAppLinkResolver$2$1;->this$1:Lbolts/WebViewAppLinkResolver$2;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 133
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->loaded:Z

    return-void
.end method

.method private runJavaScript(Landroid/webkit/WebView;)V
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 136
    iget-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->loaded:Z

    if-nez v0, :cond_0

    .line 139
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->loaded:Z

    .line 140
    const-string v0, "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName(\'meta\');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute(\'property\');    if (property && property.substring(0, \'al:\'.length) === \'al:\') {      var tag = { \"property\": metaTags[i].getAttribute(\'property\') };      if (metaTags[i].hasAttribute(\'content\')) {        tag[\'content\'] = metaTags[i].getAttribute(\'content\');      }      results.push(tag);    }  }  return JSON.stringify(results);})())"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 142
    :cond_0
    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 152
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 153
    invoke-direct {p0, p1}, Lbolts/WebViewAppLinkResolver$2$1;->runJavaScript(Landroid/webkit/WebView;)V

    .line 154
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 146
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 147
    invoke-direct {p0, p1}, Lbolts/WebViewAppLinkResolver$2$1;->runJavaScript(Landroid/webkit/WebView;)V

    .line 148
    return-void
.end method
