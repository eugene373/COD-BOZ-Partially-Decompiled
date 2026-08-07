package com.google.android.gms.plus

// Auto-emitted from smali.
// 14 fields, 14 methods.

class PlusOneButton: android.widget.FrameLayout() {
    private var all: android.view.View
    private var alm: Int
    private var aln: Int
    private var alo: com.google.android.gms.plus.PlusOneButton.OnPlusOneClickListener
    private var mSize: Int
    private var uR: String

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    private fun G(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->removeView(Landroid/view/View;)V
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->mSize:I
    //         iget v1, p0, Lcom/google/android/gms/plus/PlusOneButton;->alm:I
    //         iget-object v2, p0, Lcom/google/android/gms/plus/PlusOneButton;->uR:Ljava/lang/String;
    //         iget v3, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I
    //         invoke-static {p1, v0, v1, v2, v3}, Lcom/google/android/gms/plus/internal/g;->a(Landroid/content/Context;IILjava/lang/String;I)Landroid/view/View;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->alo:Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->setOnPlusOneClickListener(Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->addView(Landroid/view/View;)V
    //         return-void
    */

    public fun initialize(url: String, activityRequestCode: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         instance-of v0, v0, Landroid/app/Activity;
    //         const-string v1, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener)."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->uR:Ljava/lang/String;
    //         iput p2, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V
    //         return-void
    */

    public fun initialize(url: String, plusOneClickListener: com.google.android.gms.plus.PlusOneButton.OnPlusOneClickListener) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->uR:Ljava/lang/String;
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/plus/PlusOneButton;->setOnPlusOneClickListener(Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V
    //         return-void
    */

    protected fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (ZIIII)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         sub-int v1, p4, p2
    //         sub-int v2, p5, p3
    //         invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V
    //         return-void
    */

    protected fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/plus/PlusOneButton;->measureChild(Landroid/view/View;II)V
    //         invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
    //         move-result v0
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/plus/PlusOneButton;->setMeasuredDimension(II)V
    //         return-void
    */

    public fun setAnnotation(annotation: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iput p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->alm:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V
    //         return-void
    */

    public fun setOnPlusOneClickListener(listener: com.google.android.gms.plus.PlusOneButton.OnPlusOneClickListener) { /* TODO(body): (Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V */ }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->alo:Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;-><init>(Lcom/google/android/gms/plus/PlusOneButton;Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;)V
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         return-void
    */

    public fun setSize(size: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iput p1, p0, Lcom/google/android/gms/plus/PlusOneButton;->mSize:I
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->G(Landroid/content/Context;)V
    //         return-void
    */

    companion object {
    @JvmField public val ANNOTATION_BUBBLE: Int = 0x1
    @JvmField public val ANNOTATION_INLINE: Int = 0x2
    @JvmField public val ANNOTATION_NONE: Int = 0x0
    @JvmField public val DEFAULT_ACTIVITY_REQUEST_CODE: Int = 0
    @JvmField public val SIZE_MEDIUM: Int = 0x1
    @JvmField public val SIZE_SMALL: Int = 0x0
    @JvmField public val SIZE_STANDARD: Int = 0x3
    @JvmField public val SIZE_TALL: Int = 0x2

    @JvmStatic fun a(p0: com.google.android.gms.plus.PlusOneButton): android.view.View { return TODO("body: (Lcom/google/android/gms/plus/PlusOneButton;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->all:Landroid/view/View;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.plus.PlusOneButton): Int { return TODO("body: (Lcom/google/android/gms/plus/PlusOneButton;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->aln:I
    //         return v0
    */

    protected @JvmStatic fun getAnnotation(context: android.content.Context, attrs: android.util.AttributeSet): Int { return TODO("body: (Landroid/content/Context;Landroid/util/AttributeSet;)I") }
    /*
    //         .locals 7
    //         const/4 v4, 0x1
    //         const/4 v5, 0x0
    //         const-string v0, "http://schemas.android.com/apk/lib/com.google.android.gms.plus"
    //         const-string v1, "annotation"
    //         const-string v6, "PlusOneButton"
    //         move-object v2, p0
    //         move-object v3, p1
    //         invoke-static/range {v0 .. v6}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZLjava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "INLINE"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         const/4 v5, 0x2
    //         :cond_0
    //         :goto_0
    //         return v5
    //         :cond_1
    //         const-string v1, "NONE"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         move v5, v4
    //         goto :goto_0
    */

    protected @JvmStatic fun getSize(context: android.content.Context, attrs: android.util.AttributeSet): Int { return TODO("body: (Landroid/content/Context;Landroid/util/AttributeSet;)I") }
    /*
    //         .locals 7
    //         const/4 v4, 0x1
    //         const/4 v5, 0x0
    //         const-string v0, "http://schemas.android.com/apk/lib/com.google.android.gms.plus"
    //         const-string v1, "size"
    //         const-string v6, "PlusOneButton"
    //         move-object v2, p0
    //         move-object v3, p1
    //         invoke-static/range {v0 .. v6}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZLjava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "SMALL"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return v5
    //         :cond_0
    //         const-string v1, "MEDIUM"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         move v5, v4
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "TALL"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const/4 v5, 0x2
    //         goto :goto_0
    //         :cond_2
    //         const/4 v5, 0x3
    //         goto :goto_0
    */

    }
}
