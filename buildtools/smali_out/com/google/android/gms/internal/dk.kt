package com.google.android.gms.internal

// Auto-emitted from smali.
// 15 fields, 27 methods.

open class dk: com.google.android.gms.internal.ds.a() {
    private var md: com.google.android.gms.internal.gv
    private val nr: android.app.Activity
    private var rA: Boolean
    private var rB: android.widget.FrameLayout
    private var rC: android.webkit.WebChromeClient.CustomViewCallback
    private var rD: Boolean
    private var rE: Boolean
    private var rF: Boolean
    private var rG: android.widget.RelativeLayout
    private var rv: com.google.android.gms.internal.dm
    private var rw: com.google.android.gms.internal.do
    private var rx: com.google.android.gms.internal.dk.c
    private var ry: com.google.android.gms.internal.dp
    private var rz: Boolean

    public constructor(p0: android.app.Activity)

    public fun U() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rz:Z
    //         return-void
    */

    public fun a(p0: android.view.View, p1: android.webkit.WebChromeClient.CustomViewCallback) { /* TODO(body): (Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, -0x1
    //         new-instance v0, Landroid/widget/FrameLayout;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/dk;->rB:Landroid/widget/FrameLayout;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rB:Landroid/widget/FrameLayout;
    //         const/high16 v1, -0x1000000
    //         invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rB:Landroid/widget/FrameLayout;
    //         invoke-virtual {v0, p1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rB:Landroid/widget/FrameLayout;
    //         invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->U()V
    //         iput-object p2, p0, Lcom/google/android/gms/internal/dk;->rC:Landroid/webkit/WebChromeClient$CustomViewCallback;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rA:Z
    //         return-void
    */

    public fun b(p0: Int, p1: Int, p2: Int, p3: Int) { /* TODO(body): (IIII)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/dk;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/do;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         :cond_0
    //         return-void
    */

    public fun bV(): com.google.android.gms.internal.do { return TODO("body: ()Lcom/google/android/gms/internal/do;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         return-object v0
    */

    public fun bW() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rA:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget v0, v0, Lcom/google/android/gms/internal/dm;->orientation:I
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dk;->setRequestedOrientation(I)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rB:Landroid/widget/FrameLayout;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->U()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rB:Landroid/widget/FrameLayout;
    //         invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/dk;->rB:Landroid/widget/FrameLayout;
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rC:Landroid/webkit/WebChromeClient$CustomViewCallback;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rC:Landroid/webkit/WebChromeClient$CustomViewCallback;
    //         invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/dk;->rC:Landroid/webkit/WebChromeClient$CustomViewCallback;
    //         :cond_2
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rA:Z
    //         return-void
    */

    public fun bX() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->ry:Lcom/google/android/gms/internal/dp;
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dk;->n(Z)V
    //         return-void
    */

    fun bY() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rE:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rE:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->ca()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rx:Lcom/google/android/gms/internal/dk$c;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->x(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rx:Lcom/google/android/gms/internal/dk$c;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dk$c;->rJ:Landroid/view/ViewGroup;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dk;->rx:Lcom/google/android/gms/internal/dk$c;
    //         iget v2, v2, Lcom/google/android/gms/internal/dk$c;->index:I
    //         iget-object v3, p0, Lcom/google/android/gms/internal/dk;->rx:Lcom/google/android/gms/internal/dk$c;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/dk$c;->rI:Landroid/view/ViewGroup$LayoutParams;
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rM:Lcom/google/android/gms/internal/dn;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rM:Lcom/google/android/gms/internal/dn;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/dn;->ac()V
    //         goto :goto_0
    */

    fun bZ() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->bZ()V
    //         return-void
    */

    public fun c(p0: Int, p1: Int, p2: Int, p3: Int) { /* TODO(body): (IIII)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/do;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/do;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/gv;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/dk;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/gw;->y(Z)V
    //         :cond_0
    //         return-void
    */

    fun ca() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->ca()V
    //         return-void
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    //         return-void
    */

    public fun n(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         const/4 v3, -0x2
    //         if-eqz p1, :cond_0
    //         const/16 v0, 0x32
    //         :goto_0
    //         new-instance v1, Lcom/google/android/gms/internal/dp;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/dp;-><init>(Landroid/app/Activity;I)V
    //         iput-object v1, p0, Lcom/google/android/gms/internal/dk;->ry:Lcom/google/android/gms/internal/dp;
    //         new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
    //         invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
    //         const/16 v0, 0xa
    //         invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    //         if-eqz p1, :cond_1
    //         const/16 v0, 0xb
    //         :goto_1
    //         invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->ry:Lcom/google/android/gms/internal/dp;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-boolean v2, v2, Lcom/google/android/gms/internal/dm;->rQ:Z
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/dp;->o(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dk;->ry:Lcom/google/android/gms/internal/dp;
    //         invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         return-void
    //         :cond_0
    //         const/16 v0, 0x20
    //         goto :goto_0
    //         :cond_1
    //         const/16 v0, 0x9
    //         goto :goto_1
    */

    public fun o(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->ry:Lcom/google/android/gms/internal/dp;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->ry:Lcom/google/android/gms/internal/dp;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/dp;->o(Z)V
    //         :cond_0
    //         return-void
    */

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_0
    //         const-string v1, "com.google.android.gms.ads.internal.overlay.hasResumed"
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         :cond_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rD:Z
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/dm;->b(Landroid/content/Intent;)Lcom/google/android/gms/internal/dm;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         if-nez v0, :cond_2
    //         new-instance v0, Lcom/google/android/gms/internal/dk$a;
    //         const-string v1, "Could not get info for ad overlay."
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dk$a;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Lcom/google/android/gms/internal/dk$a; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dk$a;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rW:Lcom/google/android/gms/internal/x;
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rW:Lcom/google/android/gms/internal/x;
    //         iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->lX:Z
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rF:Z
    //         :goto_1
    //         if-nez p1, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rM:Lcom/google/android/gms/internal/dn;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rM:Lcom/google/android/gms/internal/dn;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/dn;->ad()V
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget v0, v0, Lcom/google/android/gms/internal/dm;->rT:I
    //         if-eq v0, v2, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rL:Lcom/google/android/gms/internal/t;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rL:Lcom/google/android/gms/internal/t;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/t;->onAdClicked()V
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget v0, v0, Lcom/google/android/gms/internal/dm;->rT:I
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Lcom/google/android/gms/internal/dk$a;
    //         const-string v1, "Could not determine ad overlay type."
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dk$a;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_5
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rF:Z
    //         goto :goto_1
    //         :pswitch_0
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dk;->p(Z)V
    //         goto :goto_0
    //         :pswitch_1
    //         new-instance v0, Lcom/google/android/gms/internal/dk$c;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/dm;->rN:Lcom/google/android/gms/internal/gv;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dk$c;-><init>(Lcom/google/android/gms/internal/gv;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/dk;->rx:Lcom/google/android/gms/internal/dk$c;
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dk;->p(Z)V
    //         goto :goto_0
    //         :pswitch_2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dk;->p(Z)V
    //         goto :goto_0
    //         :pswitch_3
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rD:Z
    //         if-eqz v0, :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    //         goto :goto_0
    //         :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/dm;->rK:Lcom/google/android/gms/internal/dj;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/dm;->rS:Lcom/google/android/gms/internal/dq;
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/dh;->a(Landroid/content/Context;Lcom/google/android/gms/internal/dj;Lcom/google/android/gms/internal/dq;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    //         :try_end_1
    //         .catch Lcom/google/android/gms/internal/dk$a; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //         .end packed-switch
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/do;->destroy()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->bY()V
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rw:Lcom/google/android/gms/internal/do;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/do;->pause()V
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->bW()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rx:Lcom/google/android/gms/internal/dk$c;
    //         if-nez v0, :cond_2
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gj;->a(Landroid/webkit/WebView;)V
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->bY()V
    //         return-void
    */

    public fun onRestart() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget v0, v0, Lcom/google/android/gms/internal/dm;->rT:I
    //         const/4 v1, 0x4
    //         if-ne v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rD:Z
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    //         :cond_0
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gj;->b(Landroid/webkit/WebView;)V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rD:Z
    //         goto :goto_0
    */

    public fun onSaveInstanceState(outBundle: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/dk;->rD:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         return-void
    */

    public fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->bY()V
    //         return-void
    */

    fun p(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 14
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/google/android/gms/internal/dk$a;
    //             }
    //         .end annotation
    //         const/16 v3, 0x400
    //         const/4 v13, -0x1
    //         const/4 v4, 0x0
    //         const/4 v2, 0x1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rz:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/dk;->rF:Z
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/dm;->rW:Lcom/google/android/gms/internal/x;
    //         iget-boolean v1, v1, Lcom/google/android/gms/internal/x;->mh:Z
    //         if-eqz v1, :cond_2
    //         :cond_1
    //         invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V
    //         :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget v1, v1, Lcom/google/android/gms/internal/dm;->orientation:I
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/dk;->setRequestedOrientation(I)V
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v3, 0xb
    //         if-lt v1, v3, :cond_3
    //         const-string v1, "Enabling hardware acceleration on the AdActivity window."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gn;->a(Landroid/view/Window;)V
    //         :cond_3
    //         new-instance v0, Lcom/google/android/gms/internal/dk$b;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/dm;->rV:Ljava/lang/String;
    //         invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/dk$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rF:Z
    //         if-nez v0, :cond_8
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         const/high16 v1, -0x1000000
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->U()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rN:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gw;->dE()Z
    //         move-result v3
    //         if-eqz p1, :cond_b
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/dm;->rN:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v1
    //         iget-object v5, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v5, v5, Lcom/google/android/gms/internal/dm;->lD:Lcom/google/android/gms/internal/gt;
    //         invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/gv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/gt;)Lcom/google/android/gms/internal/gv;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v8, v0, Lcom/google/android/gms/internal/dm;->rO:Lcom/google/android/gms/internal/bw;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v9, v0, Lcom/google/android/gms/internal/dm;->rS:Lcom/google/android/gms/internal/dq;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v11, v0, Lcom/google/android/gms/internal/dm;->rU:Lcom/google/android/gms/internal/bz;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rN:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gw;->dD()Lcom/google/android/gms/internal/v;
    //         move-result-object v12
    //         move-object v6, v4
    //         move-object v7, v4
    //         move v10, v2
    //         invoke-virtual/range {v5 .. v12}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;Lcom/google/android/gms/internal/v;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/dk$1;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/dk$1;-><init>(Lcom/google/android/gms/internal/dk;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/gw$a;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rq:Ljava/lang/String;
    //         if-eqz v0, :cond_9
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/dm;->rq:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->loadUrl(Ljava/lang/String;)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/dk;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->getParent()Landroid/view/ViewParent;
    //         move-result-object v0
    //         if-eqz v0, :cond_4
    //         instance-of v1, v0, Landroid/view/ViewGroup;
    //         if-eqz v1, :cond_4
    //         check-cast v0, Landroid/view/ViewGroup;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    //         :cond_4
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rF:Z
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         sget v1, Lcom/google/android/gms/internal/dk;->ru:I
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->setBackgroundColor(I)V
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0, v1, v13, v13}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V
    //         if-nez p1, :cond_6
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/dk;->bZ()V
    //         :cond_6
    //         invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/dk;->n(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dv()Z
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/dk;->o(Z)V
    //         :cond_7
    //         return-void
    //         :cond_8
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rG:Landroid/widget/RelativeLayout;
    //         sget v1, Lcom/google/android/gms/internal/dk;->ru:I
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
    //         goto/16 :goto_0
    //         :cond_9
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rR:Ljava/lang/String;
    //         if-eqz v0, :cond_a
    //         iget-object v5, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v6, v0, Lcom/google/android/gms/internal/dm;->rP:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v7, v0, Lcom/google/android/gms/internal/dm;->rR:Ljava/lang/String;
    //         const-string v8, "text/html"
    //         const-string v9, "UTF-8"
    //         move-object v10, v4
    //         invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/gv;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_a
    //         new-instance v0, Lcom/google/android/gms/internal/dk$a;
    //         const-string v1, "No URL or HTML to display in ad overlay."
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dk$a;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_b
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->rv:Lcom/google/android/gms/internal/dm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/dm;->rN:Lcom/google/android/gms/internal/gv;
    //         iput-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->setContext(Landroid/content/Context;)V
    //         goto :goto_1
    */

    public fun setRequestedOrientation(requestedOrientation: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dk;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    //         return-void
    */

    companion object {
    private val ru: Int = 0

    private @JvmStatic fun a(p0: Int, p1: Int, p2: Int, p3: Int): android.widget.RelativeLayout.LayoutParams { return TODO("body: (IIII)Landroid/widget/RelativeLayout$LayoutParams;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
    //         invoke-direct {v0, p2, p3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
    //         invoke-virtual {v0, p0, p1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
    //         const/16 v1, 0xa
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    //         const/16 v1, 0x9
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    //         return-object v0
    */

    public @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.internal.dm) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/internal/dm;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0}, Landroid/content/Intent;-><init>()V
    //         const-string v1, "com.google.android.gms.ads.AdActivity"
    //         invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"
    //         iget-object v2, p1, Lcom/google/android/gms/internal/dm;->lD:Lcom/google/android/gms/internal/gt;
    //         iget-boolean v2, v2, Lcom/google/android/gms/internal/gt;->wG:Z
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/dm;->a(Landroid/content/Intent;Lcom/google/android/gms/internal/dm;)V
    //         const/high16 v1, 0x80000
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         instance-of v1, p0, Landroid/app/Activity;
    //         if-nez v1, :cond_0
    //         const/high16 v1, 0x10000000
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         :cond_0
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         return-void
    */

    }
}
