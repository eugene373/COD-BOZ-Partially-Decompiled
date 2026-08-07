package com.google.android.gms.common.images

// Auto-emitted from smali.
// 7 fields, 10 methods.

open class a {
    val KH: com.google.android.gms.common.images.a.a
    protected var KI: Int
    protected var KJ: Int
    protected var KK: com.google.android.gms.common.images.ImageManager.OnImageLoadedListener
    private var KL: Boolean
    private var KM: Boolean
    protected var KN: Int

    public constructor(p0: android.net.Uri, p1: Int)

    private fun a(p0: android.content.Context, p1: com.google.android.gms.internal.iz, p2: Int): android.graphics.drawable.Drawable { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/internal/iz;I)Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         iget v0, p0, Lcom/google/android/gms/common/images/a;->KN:I
    //         if-lez v0, :cond_2
    //         new-instance v2, Lcom/google/android/gms/internal/iz$a;
    //         iget v0, p0, Lcom/google/android/gms/common/images/a;->KN:I
    //         invoke-direct {v2, p3, v0}, Lcom/google/android/gms/internal/iz$a;-><init>(II)V
    //         invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/iz;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/drawable/Drawable;
    //         if-nez v0, :cond_1
    //         invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         iget v3, p0, Lcom/google/android/gms/common/images/a;->KN:I
    //         and-int/lit8 v3, v3, 0x1
    //         if-eqz v3, :cond_0
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/images/a;->a(Landroid/content/res/Resources;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {p2, v2, v0}, Lcom/google/android/gms/internal/iz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         :goto_0
    //         return-object v0
    //         :cond_2
    //         invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun a(p0: android.content.res.Resources, p1: android.graphics.drawable.Drawable): android.graphics.drawable.Drawable { return TODO("body: (Landroid/content/res/Resources;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Lcom/google/android/gms/internal/ix;->a(Landroid/content/res/Resources;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun a(p0: android.graphics.drawable.Drawable, p1: android.graphics.drawable.Drawable): com.google.android.gms.internal.iw { return TODO("body: (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/google/android/gms/internal/iw;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_1
    //         instance-of v0, p1, Lcom/google/android/gms/internal/iw;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/iw;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/iw;->gK()Landroid/graphics/drawable/Drawable;
    //         move-result-object p1
    //         :cond_0
    //         :goto_0
    //         new-instance v0, Lcom/google/android/gms/internal/iw;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/iw;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //         return-object v0
    //         :cond_1
    //         move-object p1, v0
    //         goto :goto_0
    */

    fun a(p0: android.content.Context, p1: android.graphics.Bitmap, p2: Boolean) { /* TODO(body): (Landroid/content/Context;Landroid/graphics/Bitmap;Z)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         invoke-static {p2}, Lcom/google/android/gms/common/internal/a;->f(Ljava/lang/Object;)V
    //         iget v0, p0, Lcom/google/android/gms/common/images/a;->KN:I
    //         and-int/lit8 v0, v0, 0x1
    //         if-eqz v0, :cond_0
    //         invoke-static {p2}, Lcom/google/android/gms/internal/ix;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //         move-result-object p2
    //         :cond_0
    //         new-instance v0, Landroid/graphics/drawable/BitmapDrawable;
    //         invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/a;->KK:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/a;->KK:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/a;->KH:Lcom/google/android/gms/common/images/a$a;
    //         iget-object v2, v2, Lcom/google/android/gms/common/images/a$a;->uri:Landroid/net/Uri;
    //         invoke-interface {v1, v2, v0, v3}, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;->onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V
    //         :cond_1
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, p3, v1, v3}, Lcom/google/android/gms/common/images/a;->a(Landroid/graphics/drawable/Drawable;ZZZ)V
    //         return-void
    */

    fun a(p0: android.content.Context, p1: com.google.android.gms.internal.iz) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/internal/iz;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         const/4 v0, 0x0
    //         iget v1, p0, Lcom/google/android/gms/common/images/a;->KI:I
    //         if-eqz v1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/common/images/a;->KI:I
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/common/images/a;->a(Landroid/content/Context;Lcom/google/android/gms/internal/iz;I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         :cond_0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0, v0, v2, v1, v2}, Lcom/google/android/gms/common/images/a;->a(Landroid/graphics/drawable/Drawable;ZZZ)V
    //         return-void
    */

    fun a(p0: android.content.Context, p1: com.google.android.gms.internal.iz, p2: Boolean) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/internal/iz;Z)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         const/4 v0, 0x0
    //         iget v1, p0, Lcom/google/android/gms/common/images/a;->KJ:I
    //         if-eqz v1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/common/images/a;->KJ:I
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/common/images/a;->a(Landroid/content/Context;Lcom/google/android/gms/internal/iz;I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/a;->KK:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/a;->KK:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/a;->KH:Lcom/google/android/gms/common/images/a$a;
    //         iget-object v2, v2, Lcom/google/android/gms/common/images/a$a;->uri:Landroid/net/Uri;
    //         invoke-interface {v1, v2, v0, v3}, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;->onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V
    //         :cond_1
    //         invoke-virtual {p0, v0, p3, v3, v3}, Lcom/google/android/gms/common/images/a;->a(Landroid/graphics/drawable/Drawable;ZZZ)V
    //         return-void
    */

    protected fun a(p0: android.graphics.drawable.Drawable, p1: Boolean, p2: Boolean, p3: Boolean)

    public fun aw(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/common/images/a;->KJ:I
    //         return-void
    */

    protected fun b(p0: Boolean, p1: Boolean): Boolean { return TODO("body: (ZZ)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/images/a;->KL:Z
    //         if-eqz v0, :cond_1
    //         if-nez p2, :cond_1
    //         if-eqz p1, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/images/a;->KM:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
