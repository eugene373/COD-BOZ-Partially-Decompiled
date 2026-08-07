package com.google.android.gms.common.images

// Auto-emitted from smali.
// 1 fields, 4 methods.

class ImageManager_e: android.content.ComponentCallbacks2 {
    private val Kx: com.google.android.gms.common.images.ImageManager.b

    public constructor(p0: com.google.android.gms.common.images.ImageManager.b)

    public fun onConfigurationChanged(newConfig: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$e;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/images/ImageManager$b;->evictAll()V
    //         return-void
    */

    public fun onTrimMemory(level: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const/16 v0, 0x3c
    //         if-lt p1, v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$e;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/images/ImageManager$b;->evictAll()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/16 v0, 0x14
    //         if-lt p1, v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$e;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/ImageManager$e;->Kx:Lcom/google/android/gms/common/images/ImageManager$b;
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/images/ImageManager$b;->size()I
    //         move-result v1
    //         div-int/lit8 v1, v1, 0x2
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/images/ImageManager$b;->trimToSize(I)V
    //         goto :goto_0
    */

}
