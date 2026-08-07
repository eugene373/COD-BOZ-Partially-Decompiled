package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class f_c: com.google.android.gms.wearable.DataApi.GetFdForAssetResult {
    private val CM: com.google.android.gms.common.api.Status
    private var XX: java.io.InputStream
    private var avu: android.os.ParcelFileDescriptor
    private var mClosed: Boolean

    public constructor(p0: com.google.android.gms.common.api.Status, p1: android.os.ParcelFileDescriptor)

    public fun getFd(): android.os.ParcelFileDescriptor { return TODO("body: ()Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->mClosed:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot access the file descriptor after release()."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->avu:Landroid/os/ParcelFileDescriptor;
    //         return-object v0
    */

    public fun getInputStream(): java.io.InputStream { return TODO("body: ()Ljava/io/InputStream;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->mClosed:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot access the input stream after release()."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->avu:Landroid/os/ParcelFileDescriptor;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->XX:Ljava/io/InputStream;
    //         if-nez v0, :cond_2
    //         new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/f$c;->avu:Landroid/os/ParcelFileDescriptor;
    //         invoke-direct {v0, v1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V
    //         iput-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->XX:Ljava/io/InputStream;
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->XX:Ljava/io/InputStream;
    //         goto :goto_0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->avu:Landroid/os/ParcelFileDescriptor;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->mClosed:Z
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "releasing an already released result."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->XX:Ljava/io/InputStream;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->XX:Ljava/io/InputStream;
    //         invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    //         :goto_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->mClosed:Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->avu:Landroid/os/ParcelFileDescriptor;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->XX:Ljava/io/InputStream;
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$c;->avu:Landroid/os/ParcelFileDescriptor;
    //         invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    */

}
