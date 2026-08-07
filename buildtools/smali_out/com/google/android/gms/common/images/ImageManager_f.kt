package com.google.android.gms.common.images

// Auto-emitted from smali.
// 5 fields, 3 methods.

class ImageManager_f: Runnable {
    val KD: com.google.android.gms.common.images.ImageManager
    private var KG: Boolean
    private val mBitmap: android.graphics.Bitmap
    private val mUri: android.net.Uri
    private val mg: java.util.concurrent.CountDownLatch

    public constructor(p0: com.google.android.gms.common.images.ImageManager, p1: android.net.Uri, p2: android.graphics.Bitmap, p3: Boolean, p4: java.util.concurrent.CountDownLatch)

    private fun a(p0: com.google.android.gms.common.images.ImageManager.ImageReceiver, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;Z)V */ }
    /*
    //         .locals 10
    //         const/4 v2, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;->a(Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;)Ljava/util/ArrayList;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v4
    //         move v1, v2
    //         :goto_0
    //         if-ge v1, v4, :cond_2
    //         invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/a;
    //         if-eqz p2, :cond_1
    //         iget-object v5, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v5}, Lcom/google/android/gms/common/images/ImageManager;->b(Lcom/google/android/gms/common/images/ImageManager;)Landroid/content/Context;
    //         move-result-object v5
    //         iget-object v6, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mBitmap:Landroid/graphics/Bitmap;
    //         invoke-virtual {v0, v5, v6, v2}, Lcom/google/android/gms/common/images/a;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Z)V
    //         :goto_1
    //         instance-of v5, v0, Lcom/google/android/gms/common/images/a$c;
    //         if-nez v5, :cond_0
    //         iget-object v5, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v5}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;
    //         move-result-object v5
    //         invoke-interface {v5, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v5, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v5}, Lcom/google/android/gms/common/images/ImageManager;->d(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;
    //         move-result-object v5
    //         iget-object v6, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mUri:Landroid/net/Uri;
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v8
    //         invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v7
    //         invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v5, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v5}, Lcom/google/android/gms/common/images/ImageManager;->b(Lcom/google/android/gms/common/images/ImageManager;)Landroid/content/Context;
    //         move-result-object v5
    //         iget-object v6, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v6}, Lcom/google/android/gms/common/images/ImageManager;->c(Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/internal/iz;
    //         move-result-object v6
    //         invoke-virtual {v0, v5, v6, v2}, Lcom/google/android/gms/common/images/a;->a(Landroid/content/Context;Lcom/google/android/gms/internal/iz;Z)V
    //         goto :goto_1
    //         :cond_2
    //         return-void
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         const-string v0, "OnBitmapLoadedRunnable must be executed in the main thread"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->aT(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mBitmap:Landroid/graphics/Bitmap;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         move v1, v0
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v0}, Lcom/google/android/gms/common/images/ImageManager;->h(Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/common/images/ImageManager$b;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KG:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v0}, Lcom/google/android/gms/common/images/ImageManager;->h(Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/common/images/ImageManager$b;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/images/ImageManager$b;->evictAll()V
    //         invoke-static {}, Ljava/lang/System;->gc()V
    //         iput-boolean v2, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KG:Z
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v0}, Lcom/google/android/gms/common/images/ImageManager;->g(Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_1
    //         return-void
    //         :cond_0
    //         move v1, v2
    //         goto :goto_0
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v0}, Lcom/google/android/gms/common/images/ImageManager;->h(Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/common/images/ImageManager$b;
    //         move-result-object v0
    //         new-instance v2, Lcom/google/android/gms/common/images/a$a;
    //         iget-object v3, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mUri:Landroid/net/Uri;
    //         invoke-direct {v2, v3}, Lcom/google/android/gms/common/images/a$a;-><init>(Landroid/net/Uri;)V
    //         iget-object v3, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mBitmap:Landroid/graphics/Bitmap;
    //         invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/common/images/ImageManager$b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->KD:Lcom/google/android/gms/common/images/ImageManager;
    //         invoke-static {v0}, Lcom/google/android/gms/common/images/ImageManager;->e(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mUri:Landroid/net/Uri;
    //         invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;
    //         if-eqz v0, :cond_3
    //         invoke-direct {p0, v0, v1}, Lcom/google/android/gms/common/images/ImageManager$f;->a(Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;Z)V
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mg:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    //         invoke-static {}, Lcom/google/android/gms/common/images/ImageManager;->gH()Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {}, Lcom/google/android/gms/common/images/ImageManager;->gI()Ljava/util/HashSet;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/ImageManager$f;->mUri:Landroid/net/Uri;
    //         invoke-virtual {v0, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
