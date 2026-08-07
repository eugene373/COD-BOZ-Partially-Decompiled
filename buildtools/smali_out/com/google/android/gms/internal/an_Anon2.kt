package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 2 methods.

open class an_Anon2: Runnable {
    val nB: com.google.android.gms.internal.an
    var nC: android.webkit.ValueCallback
    val nD: com.google.android.gms.internal.ak
    val nE: android.webkit.WebView

    constructor(p0: com.google.android.gms.internal.an, p1: com.google.android.gms.internal.ak, p2: android.webkit.WebView)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/an$2;->nE:Landroid/webkit/WebView;
    //         invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/an$2;->nE:Landroid/webkit/WebView;
    //         const-string v1, "(function() { return  {text:document.body.innerText}})();"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/an$2;->nC:Landroid/webkit/ValueCallback;
    //         invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    //         :cond_0
    //         return-void
    */

}
