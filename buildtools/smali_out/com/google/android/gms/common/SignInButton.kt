package com.google.android.gms.common

// Auto-emitted from smali.
// 9 fields, 11 methods.

class SignInButton: android.widget.FrameLayout(), android.view.View.OnClickListener {
    private var Im: android.view.View
    private var In: android.view.View.OnClickListener
    private var mColor: Int
    private var mSize: Int

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet, defStyle: Int)

    private fun G(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/SignInButton;->removeView(Landroid/view/View;)V
    //         :cond_0
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/common/SignInButton;->mSize:I
    //         iget v1, p0, Lcom/google/android/gms/common/SignInButton;->mColor:I
    //         invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/internal/p;->b(Landroid/content/Context;II)Landroid/view/View;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/dynamic/g$a; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/SignInButton;->addView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/SignInButton;->isEnabled()Z
    //         move-result v1
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "SignInButton"
    //         const-string v1, "Sign in button not found, using placeholder instead"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         iget v0, p0, Lcom/google/android/gms/common/SignInButton;->mSize:I
    //         iget v1, p0, Lcom/google/android/gms/common/SignInButton;->mColor:I
    //         invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/SignInButton;->a(Landroid/content/Context;II)Landroid/widget/Button;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         goto :goto_0
    */

    public fun onClick(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->In:Landroid/view/View$OnClickListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         if-ne p1, v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->In:Landroid/view/View$OnClickListener;
    //         invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
    //         :cond_0
    //         return-void
    */

    public fun setColorScheme(colorScheme: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/SignInButton;->mSize:I
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/SignInButton;->setStyle(II)V
    //         return-void
    */

    public fun setEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V
    //         return-void
    */

    public fun setOnClickListener(listener: android.view.View.OnClickListener) { /* TODO(body): (Landroid/view/View$OnClickListener;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/google/android/gms/common/SignInButton;->In:Landroid/view/View$OnClickListener;
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/SignInButton;->Im:Landroid/view/View;
    //         invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         :cond_0
    //         return-void
    */

    public fun setSize(buttonSize: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/SignInButton;->mColor:I
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/SignInButton;->setStyle(II)V
    //         return-void
    */

    public fun setStyle(buttonSize: Int, colorScheme: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-ltz p1, :cond_0
    //         const/4 v0, 0x3
    //         if-ge p1, v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Unknown button size %d"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-ltz p2, :cond_1
    //         const/4 v0, 0x2
    //         if-ge p2, v0, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Unknown color scheme %s"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput p1, p0, Lcom/google/android/gms/common/SignInButton;->mSize:I
    //         iput p2, p0, Lcom/google/android/gms/common/SignInButton;->mColor:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/SignInButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/SignInButton;->G(Landroid/content/Context;)V
    //         return-void
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    */

    companion object {
    @JvmField public val COLOR_DARK: Int = 0x0
    @JvmField public val COLOR_LIGHT: Int = 0x1
    @JvmField public val SIZE_ICON_ONLY: Int = 0x2
    @JvmField public val SIZE_STANDARD: Int = 0x0
    @JvmField public val SIZE_WIDE: Int = 0x1

    private @JvmStatic fun a(p0: android.content.Context, p1: Int, p2: Int): android.widget.Button { return TODO("body: (Landroid/content/Context;II)Landroid/widget/Button;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/common/internal/q;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/common/internal/q;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/common/internal/q;->a(Landroid/content/res/Resources;II)V
    //         return-object v0
    */

    }
}
