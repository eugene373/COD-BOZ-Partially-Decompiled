package bolts

// Auto-emitted from smali source: WebViewAppLinkResolver.java.
// 2 fields, 4 methods.

open class WebViewAppLinkResolver_2_Anon1: android.webkit.WebViewClient() {
    private var loaded: Boolean
    val this$1: bolts.WebViewAppLinkResolver.2

    constructor(p0: bolts.WebViewAppLinkResolver.2)

    private fun runJavaScript(view: android.webkit.WebView) { /* TODO(body): (Landroid/webkit/WebView;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->loaded:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->loaded:Z
    //         const-string v0, "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName(\'meta\');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute(\'property\');    if (property && property.substring(0, \'al:\'.length) === \'al:\') {      var tag = { \"property\": metaTags[i].getAttribute(\'property\') };      if (metaTags[i].hasAttribute(\'content\')) {        tag[\'content\'] = metaTags[i].getAttribute(\'content\');      }      results.push(tag);    }  }  return JSON.stringify(results);})())"
    //         invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public fun onLoadResource(view: android.webkit.WebView, url: String) { /* TODO(body): (Landroid/webkit/WebView;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    //         invoke-direct {p0, p1}, Lbolts/WebViewAppLinkResolver$2$1;->runJavaScript(Landroid/webkit/WebView;)V
    //         return-void
    */

    public fun onPageFinished(view: android.webkit.WebView, url: String) { /* TODO(body): (Landroid/webkit/WebView;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    //         invoke-direct {p0, p1}, Lbolts/WebViewAppLinkResolver$2$1;->runJavaScript(Landroid/webkit/WebView;)V
    //         return-void
    */

}
