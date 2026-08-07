package com.google.android.gms.common.images

// Auto-emitted from smali.
// 12 fields, 23 methods.

class ImageManager {
    private val KA: java.util.Map
    private val KB: java.util.Map
    private val Kw: java.util.concurrent.ExecutorService
    private val Kx: com.google.android.gms.common.images.ImageManager.b
    private val Ky: com.google.android.gms.internal.iz
    private val Kz: java.util.Map
    private val mContext: android.content.Context
    private val mHandler: android.os.Handler

    private constructor(context: android.content.Context, withMemoryCache: Boolean)

    private fun a(p0: com.google.android.gms.common.images.a.a): android.graphics.Bitmap { return TODO("body: (Lcom/google/android/gms/common/images/a$a;)Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/images/ImageManager$b;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/Bitmap;
    //         goto :goto_0
    */

    private fun gG() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->mContext:Landroid/content/Context;
    //         new-instance v1, Lcom/google/android/gms/common/images/ImageManager$e;
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/ImageManager;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/common/images/ImageManager$e;-><init>(Lcom/google/android/gms/common/images/ImageManager$b;)V
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.images.a) { /* TODO(body): (Lcom/google/android/gms/common/images/a;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "ImageManager.loadImage() must be called in the main thread"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->aT(Ljava/lang/String;)V
    //         new-instance v0, Lcom/google/android/gms/common/images/ImageManager$d;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/common/images/ImageManager$d;-><init>(Lcom/google/android/gms/common/images/ImageManager;Lcom/google/android/gms/common/images/a;)V
    //         invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    //         return-void
    */

    public fun loadImage(imageView: android.widget.ImageView, resId: Int) { /* TODO(body): (Landroid/widget/ImageView;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/common/images/a$b;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/a$b;-><init>(Landroid/widget/ImageView;I)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/a;)V
    //         return-void
    */

    public fun loadImage(imageView: android.widget.ImageView, uri: android.net.Uri) { /* TODO(body): (Landroid/widget/ImageView;Landroid/net/Uri;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/common/images/a$b;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/a$b;-><init>(Landroid/widget/ImageView;Landroid/net/Uri;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/a;)V
    //         return-void
    */

    public fun loadImage(imageView: android.widget.ImageView, uri: android.net.Uri, defaultResId: Int) { /* TODO(body): (Landroid/widget/ImageView;Landroid/net/Uri;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/common/images/a$b;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/a$b;-><init>(Landroid/widget/ImageView;Landroid/net/Uri;)V
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/common/images/a;->aw(I)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/a;)V
    //         return-void
    */

    public fun loadImage(listener: com.google.android.gms.common.images.ImageManager.OnImageLoadedListener, uri: android.net.Uri) { /* TODO(body): (Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;Landroid/net/Uri;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/common/images/a$c;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/a$c;-><init>(Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;Landroid/net/Uri;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/a;)V
    //         return-void
    */

    public fun loadImage(listener: com.google.android.gms.common.images.ImageManager.OnImageLoadedListener, uri: android.net.Uri, defaultResId: Int) { /* TODO(body): (Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;Landroid/net/Uri;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/common/images/a$c;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/a$c;-><init>(Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;Landroid/net/Uri;)V
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/common/images/a;->aw(I)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/a;)V
    //         return-void
    */

    companion object {
    private val Ks: Object = null!!
    private var Kt: java.util.HashSet
    private var Ku: com.google.android.gms.common.images.ImageManager
    private var Kv: com.google.android.gms.common.images.ImageManager

    @JvmStatic fun a(p0: com.google.android.gms.common.images.ImageManager, p1: com.google.android.gms.common.images.a.a): android.graphics.Bitmap { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;Lcom/google/android/gms/common/images/a$a;)Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/a$a;)Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.images.ImageManager): java.util.Map { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->Kz:Ljava/util/Map;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.common.images.ImageManager): android.content.Context { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    public @JvmStatic fun c(p0: android.content.Context, p1: Boolean): com.google.android.gms.common.images.ImageManager { return TODO("body: (Landroid/content/Context;Z)Lcom/google/android/gms/common/images/ImageManager;") }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_1
    //         sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->Kv:Lcom/google/android/gms/common/images/ImageManager;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/images/ImageManager;
    //         const/4 v1, 0x1
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/common/images/ImageManager;-><init>(Landroid/content/Context;Z)V
    //         sput-object v0, Lcom/google/android/gms/common/images/ImageManager;->Kv:Lcom/google/android/gms/common/images/ImageManager;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->Kv:Lcom/google/android/gms/common/images/ImageManager;
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->Ku:Lcom/google/android/gms/common/images/ImageManager;
    //         if-nez v0, :cond_2
    //         new-instance v0, Lcom/google/android/gms/common/images/ImageManager;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/common/images/ImageManager;-><init>(Landroid/content/Context;Z)V
    //         sput-object v0, Lcom/google/android/gms/common/images/ImageManager;->Ku:Lcom/google/android/gms/common/images/ImageManager;
    //         :cond_2
    //         sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->Ku:Lcom/google/android/gms/common/images/ImageManager;
    //         goto :goto_0
    */

    @JvmStatic fun c(p0: com.google.android.gms.common.images.ImageManager): com.google.android.gms.internal.iz { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/internal/iz;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->Ky:Lcom/google/android/gms/internal/iz;
    //         return-object v0
    */

    public @JvmStatic fun create(context: android.content.Context): com.google.android.gms.common.images.ImageManager { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/common/images/ImageManager;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->c(Landroid/content/Context;Z)Lcom/google/android/gms/common/images/ImageManager;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.common.images.ImageManager): java.util.Map { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->KB:Ljava/util/Map;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.common.images.ImageManager): java.util.Map { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->KA:Ljava/util/Map;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.common.images.ImageManager): java.util.concurrent.ExecutorService { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/concurrent/ExecutorService;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->Kw:Ljava/util/concurrent/ExecutorService;
    //         return-object v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.common.images.ImageManager): android.os.Handler { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->mHandler:Landroid/os/Handler;
    //         return-object v0
    */

    @JvmStatic fun gH(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->Ks:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun gI(): java.util.HashSet { return TODO("body: ()Ljava/util/HashSet;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->Kt:Ljava/util/HashSet;
    //         return-object v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.common.images.ImageManager): com.google.android.gms.common.images.ImageManager.b { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/common/images/ImageManager$b;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         return-object v0
    */

    }
}
