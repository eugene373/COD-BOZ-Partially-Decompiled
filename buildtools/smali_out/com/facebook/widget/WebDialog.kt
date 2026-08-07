package com.facebook.widget

// Auto-emitted from smali source: WebDialog.java.
// 23 fields, 26 methods.

open class WebDialog: android.app.Dialog() {
    private var contentFrameLayout: android.widget.FrameLayout
    private var crossImageView: android.widget.ImageView
    private var expectedRedirectUrl: String
    private var isDetached: Boolean
    private var isDismissed: Boolean
    private var listenerCalled: Boolean
    private var onCompleteListener: com.facebook.widget.WebDialog.OnCompleteListener
    private var spinner: android.app.ProgressDialog
    private var url: String
    private var webView: android.webkit.WebView

    public constructor(p0: android.content.Context, p1: String)

    public constructor(p0: android.content.Context, p1: String, p2: Int)

    public constructor(p0: android.content.Context, p1: String, p2: android.os.Bundle, p3: Int, p4: com.facebook.widget.WebDialog.OnCompleteListener)

    private fun calculateSize() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const/16 v5, 0x320
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         const-string v1, "window"
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/WindowManager;
    //         invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v0
    //         new-instance v2, Landroid/util/DisplayMetrics;
    //         invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V
    //         invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
    //         iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I
    //         iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I
    //         if-ge v0, v1, :cond_0
    //         iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I
    //         :goto_0
    //         iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I
    //         iget v3, v2, Landroid/util/DisplayMetrics;->heightPixels:I
    //         if-ge v1, v3, :cond_1
    //         iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I
    //         :goto_1
    //         iget v3, v2, Landroid/util/DisplayMetrics;->density:F
    //         const/16 v4, 0x1e0
    //         invoke-direct {p0, v0, v3, v4, v5}, Lcom/facebook/widget/WebDialog;->getScaledSize(IFII)I
    //         move-result v0
    //         iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I
    //         invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I
    //         move-result v0
    //         iget v3, v2, Landroid/util/DisplayMetrics;->density:F
    //         const/16 v4, 0x500
    //         invoke-direct {p0, v1, v3, v5, v4}, Lcom/facebook/widget/WebDialog;->getScaledSize(IFII)I
    //         move-result v1
    //         iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I
    //         invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getWindow()Landroid/view/Window;
    //         move-result-object v2
    //         invoke-virtual {v2, v0, v1}, Landroid/view/Window;->setLayout(II)V
    //         return-void
    //         :cond_0
    //         iget v0, v2, Landroid/util/DisplayMetrics;->heightPixels:I
    //         goto :goto_0
    //         :cond_1
    //         iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I
    //         goto :goto_1
    */

    private fun createCrossImage() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/widget/ImageView;
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/WebDialog;->crossImageView:Landroid/widget/ImageView;
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->crossImageView:Landroid/widget/ImageView;
    //         new-instance v1, Lcom/facebook/widget/WebDialog$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/WebDialog$2;-><init>(Lcom/facebook/widget/WebDialog;)V
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_close:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->crossImageView:Landroid/widget/ImageView;
    //         invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->crossImageView:Landroid/widget/ImageView;
    //         const/4 v1, 0x4
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
    //         return-void
    */

    private fun getScaledSize(p0: Int, p1: Float, p2: Int, p3: Int): Int { return TODO("body: (IFII)I") }
    /*
    //         .locals 6
    //         const-wide/high16 v0, 0x3fe0000000000000L    # 0.5
    //         int-to-float v2, p1
    //         div-float/2addr v2, p2
    //         float-to-int v2, v2
    //         if-gt v2, p3, :cond_1
    //         const-wide/high16 v0, 0x3ff0000000000000L    # 1.0
    //         :cond_0
    //         :goto_0
    //         int-to-double v2, p1
    //         mul-double/2addr v0, v2
    //         double-to-int v0, v0
    //         return v0
    //         :cond_1
    //         if-ge v2, p4, :cond_0
    //         sub-int v2, p4, v2
    //         int-to-double v2, v2
    //         sub-int v4, p4, p3
    //         int-to-double v4, v4
    //         div-double/2addr v2, v4
    //         mul-double/2addr v2, v0
    //         add-double/2addr v0, v2
    //         goto :goto_0
    */

    private fun setUpWebView(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 6
    //         .annotation build Landroid/annotation/SuppressLint;
    //             value = {
    //                 "SetJavaScriptEnabled"
    //             }
    //         .end annotation
    //         const/4 v5, -0x1
    //         const/4 v4, 0x0
    //         new-instance v0, Landroid/widget/LinearLayout;
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
    //         new-instance v1, Lcom/facebook/widget/WebDialog$3;
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-direct {v1, p0, v2}, Lcom/facebook/widget/WebDialog$3;-><init>(Lcom/facebook/widget/WebDialog;Landroid/content/Context;)V
    //         iput-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         invoke-virtual {v1, v4}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         invoke-virtual {v1, v4}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         new-instance v2, Lcom/facebook/widget/WebDialog$DialogWebViewClient;
    //         const/4 v3, 0x0
    //         invoke-direct {v2, p0, v3}, Lcom/facebook/widget/WebDialog$DialogWebViewClient;-><init>(Lcom/facebook/widget/WebDialog;Lcom/facebook/widget/WebDialog$1;)V
    //         invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
    //         move-result-object v1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         iget-object v2, p0, Lcom/facebook/widget/WebDialog;->url:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         new-instance v2, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v2, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         const/4 v2, 0x4
    //         invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setVisibility(I)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
    //         invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
    //         const/high16 v1, -0x34000000    # -3.3554432E7f
    //         invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->contentFrameLayout:Landroid/widget/FrameLayout;
    //         invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
    //         return-void
    */

    public fun dismiss() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/WebDialog;->isDismissed:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/WebDialog;->isDismissed:Z
    //         iget-boolean v0, p0, Lcom/facebook/widget/WebDialog;->listenerCalled:Z
    //         if-nez v0, :cond_2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->sendCancelToListener()V
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V
    //         :cond_3
    //         iget-boolean v0, p0, Lcom/facebook/widget/WebDialog;->isDetached:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->spinner:Landroid/app/ProgressDialog;
    //         invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->spinner:Landroid/app/ProgressDialog;
    //         invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
    //         :cond_4
    //         invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
    //         goto :goto_0
    */

    public fun getOnCompleteListener(): com.facebook.widget.WebDialog.OnCompleteListener { return TODO("body: ()Lcom/facebook/widget/WebDialog$OnCompleteListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->onCompleteListener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         return-object v0
    */

    protected fun getWebView(): android.webkit.WebView { return TODO("body: ()Landroid/webkit/WebView;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->webView:Landroid/webkit/WebView;
    //         return-object v0
    */

    protected fun isListenerCalled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/WebDialog;->listenerCalled:Z
    //         return v0
    */

    public fun onAttachedToWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/widget/WebDialog;->isDetached:Z
    //         invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V
    //         return-void
    */

    protected fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         const/4 v3, -0x2
    //         invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V
    //         new-instance v0, Landroid/app/ProgressDialog;
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/WebDialog;->spinner:Landroid/app/ProgressDialog;
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->spinner:Landroid/app/ProgressDialog;
    //         invoke-virtual {v0, v4}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->spinner:Landroid/app/ProgressDialog;
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$string;->com_facebook_loading:I
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->spinner:Landroid/app/ProgressDialog;
    //         new-instance v1, Lcom/facebook/widget/WebDialog$1;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/WebDialog$1;-><init>(Lcom/facebook/widget/WebDialog;)V
    //         invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
    //         invoke-virtual {p0, v4}, Lcom/facebook/widget/WebDialog;->requestWindowFeature(I)Z
    //         new-instance v0, Landroid/widget/FrameLayout;
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/WebDialog;->contentFrameLayout:Landroid/widget/FrameLayout;
    //         invoke-direct {p0}, Lcom/facebook/widget/WebDialog;->calculateSize()V
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         const/16 v1, 0x11
    //         invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         const/16 v1, 0x10
    //         invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V
    //         invoke-direct {p0}, Lcom/facebook/widget/WebDialog;->createCrossImage()V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->crossImageView:Landroid/widget/ImageView;
    //         invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
    //         move-result v0
    //         div-int/lit8 v0, v0, 0x2
    //         add-int/lit8 v0, v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/WebDialog;->setUpWebView(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->contentFrameLayout:Landroid/widget/FrameLayout;
    //         iget-object v1, p0, Lcom/facebook/widget/WebDialog;->crossImageView:Landroid/widget/ImageView;
    //         new-instance v2, Landroid/view/ViewGroup$LayoutParams;
    //         invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
    //         invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->contentFrameLayout:Landroid/widget/FrameLayout;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/WebDialog;->setContentView(Landroid/view/View;)V
    //         return-void
    */

    public fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/WebDialog;->isDetached:Z
    //         invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V
    //         return-void
    */

    protected fun parseResponseUri(p0: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->parseUrlQueryString(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->parseUrlQueryString(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    //         return-object v1
    */

    protected fun sendCancelToListener() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/FacebookOperationCanceledException;
    //         invoke-direct {v0}, Lcom/facebook/FacebookOperationCanceledException;-><init>()V
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/WebDialog;->sendErrorToListener(Ljava/lang/Throwable;)V
    //         return-void
    */

    protected fun sendErrorToListener(p0: Throwable) { /* TODO(body): (Ljava/lang/Throwable;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->onCompleteListener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/widget/WebDialog;->listenerCalled:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/WebDialog;->listenerCalled:Z
    //         instance-of v0, p1, Lcom/facebook/FacebookException;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/facebook/FacebookException;
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->onCompleteListener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1, p1}, Lcom/facebook/widget/WebDialog$OnCompleteListener;->onComplete(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->dismiss()V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         invoke-direct {v0, p1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         move-object p1, v0
    //         goto :goto_0
    */

    protected fun sendSuccessToListener(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->onCompleteListener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/widget/WebDialog;->listenerCalled:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/WebDialog;->listenerCalled:Z
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog;->onCompleteListener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, p1, v1}, Lcom/facebook/widget/WebDialog$OnCompleteListener;->onComplete(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog;->dismiss()V
    //         :cond_0
    //         return-void
    */

    protected fun setExpectedRedirectUrl(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/WebDialog;->expectedRedirectUrl:Ljava/lang/String;
    //         return-void
    */

    public fun setOnCompleteListener(p0: com.facebook.widget.WebDialog.OnCompleteListener) { /* TODO(body): (Lcom/facebook/widget/WebDialog$OnCompleteListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/WebDialog;->onCompleteListener:Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         return-void
    */

    companion object {
    private val API_EC_DIALOG_CANCEL: Int = 0x1069
    private val BACKGROUND_GRAY: Int = 0
    val CANCEL_URI: String = "fbconnect://cancel"
    @JvmField public val DEFAULT_THEME: Int = 0x1030010
    val DISABLE_SSL_CHECK_FOR_TESTING: Boolean = false
    private val DISPLAY_TOUCH: String = "touch"
    private val LOG_TAG: String = "FacebookSDK.WebDialog"
    private val MAX_PADDING_SCREEN_HEIGHT: Int = 0x500
    private val MAX_PADDING_SCREEN_WIDTH: Int = 0x320
    private val MIN_SCALE_FACTOR: Double = 0.0
    private val NO_PADDING_SCREEN_HEIGHT: Int = 0x320
    private val NO_PADDING_SCREEN_WIDTH: Int = 0x1e0
    val REDIRECT_URI: String = "fbconnect://success"
    }
}
