package com.google.android.gms.common.images

// Auto-emitted from smali.
// 3 fields, 6 methods.

class ImageManager_ImageReceiver: android.os.ResultReceiver() {
    private val KC: java.util.ArrayList
    val KD: com.google.android.gms.common.images.ImageManager
    private val mUri: android.net.Uri

    constructor(uri: com.google.android.gms.common.images.ImageManager, p1: android.net.Uri)

    public fun b(p0: com.google.android.gms.common.images.a) { /* TODO(body): (Lcom/google/android/gms/common/images/a;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "ImageReceiver.addImageRequest() must be called in the main thread"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->aT(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->KC:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun c(p0: com.google.android.gms.common.images.a) { /* TODO(body): (Lcom/google/android/gms/common/images/a;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "ImageReceiver.removeImageRequest() must be called in the main thread"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->aT(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->KC:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun gJ() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms.common.images.LOAD_IMAGE"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v1, "com.google.android.gms.extras.uri"
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->mUri:Landroid/net/Uri;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms.extras.resultReceiver"
    //         invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         const-string v1, "com.google.android.gms.extras.priority"
    //         const/4 v2, 0x3
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v1}, Lcom/google/android/gms/common/images/ImageManager;->b(Lcom/google/android/gms/common/images/ImageManager;)Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    //         return-void
    */

    public fun onReceiveResult(resultCode: Int, resultData: android.os.Bundle) { /* TODO(body): (ILandroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         const-string v0, "com.google.android.gms.extra.fileDescriptor"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/ParcelFileDescriptor;
    //         iget-object v1, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v1}, Lcom/google/android/gms/common/images/ImageManager;->f(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/concurrent/ExecutorService;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/common/images/ImageManager$c;
    //         iget-object v3, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         iget-object v4, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->mUri:Landroid/net/Uri;
    //         invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/common/images/ImageManager$c;-><init>(Lcom/google/android/gms/common/images/ImageManager;Landroid/net/Uri;Landroid/os/ParcelFileDescriptor;)V
    //         invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.common.images.ImageManager.ImageReceiver): java.util.ArrayList { return TODO("body: (Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;)Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->KC:Ljava/util/ArrayList;
    //         return-object v0
    */

    }
}
