package com.google.android.gms.common.images

// Auto-emitted from smali.
// 1 fields, 4 methods.

class a_c: com.google.android.gms.common.images.a() {
    private var KP: java.lang.ref.WeakReference

    public constructor(p0: com.google.android.gms.common.images.ImageManager.OnImageLoadedListener, p1: android.net.Uri)

    protected fun a(p0: android.graphics.drawable.Drawable, p1: Boolean, p2: Boolean, p3: Boolean) { /* TODO(body): (Landroid/graphics/drawable/Drawable;ZZZ)V */ }
    /*
    //         .locals 2
    //         if-nez p3, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/a$c;->KP:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/a$c;->KH:Lcom/google/android/gms/common/images/a$a;
    //         iget-object v1, v1, Lcom/google/android/gms/common/images/a$a;->uri:Landroid/net/Uri;
    //         invoke-interface {v0, v1, p1, p4}, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;->onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V
    //         :cond_0
    //         return-void
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         instance-of v0, p1, Lcom/google/android/gms/common/images/a$c;
    //         if-nez v0, :cond_0
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :goto_0
    //         return v3
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         if-ne p0, p1, :cond_1
    //         move v3, v2
    //         goto :goto_0
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/common/images/a$c;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/a$c;->KP:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;
    //         iget-object v1, p1, Lcom/google/android/gms/common/images/a$c;->KP:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;
    //         if-eqz v1, :cond_2
    //         if-eqz v0, :cond_2
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p1, Lcom/google/android/gms/common/images/a$c;->KH:Lcom/google/android/gms/common/images/a$a;
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/a$c;->KH:Lcom/google/android/gms/common/images/a$a;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         move v0, v2
    //         :goto_1
    //         move v3, v0
    //         goto :goto_0
    //         :cond_2
    //         move v0, v3
    //         goto :goto_1
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/a$c;->KH:Lcom/google/android/gms/common/images/a$a;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

}
