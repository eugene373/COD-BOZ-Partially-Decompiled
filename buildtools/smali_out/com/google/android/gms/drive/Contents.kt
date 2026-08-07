package com.google.android.gms.drive

// Auto-emitted from smali.
// 10 fields, 13 methods.

open class Contents: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val KE: android.os.ParcelFileDescriptor
    val MV: Int
    val MW: com.google.android.gms.drive.DriveId
    val MX: Boolean
    private var MY: Boolean
    private var MZ: Boolean
    private var mClosed: Boolean
    val uQ: Int

    constructor(versionCode: Int, parcelFileDescriptor: android.os.ParcelFileDescriptor, requestId: Int, mode: Int, driveId: com.google.android.gms.drive.DriveId, validForConflictDetection: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDriveId(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/Contents;->MW:Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun getInputStream(): java.io.InputStream { return TODO("body: ()Ljava/io/InputStream;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->mClosed:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Contents have been closed, cannot access the input stream."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/drive/Contents;->MV:I
    //         const/high16 v1, 0x10000000
    //         if-eq v0, v1, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "getInputStream() can only be used with contents opened with MODE_READ_ONLY."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->MY:Z
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "getInputStream() can only be called once per Contents instance."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->MY:Z
    //         new-instance v0, Ljava/io/FileInputStream;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/Contents;->KE:Landroid/os/ParcelFileDescriptor;
    //         invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    //         return-object v0
    */

    public fun getMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/drive/Contents;->MV:I
    //         return v0
    */

    public fun getOutputStream(): java.io.OutputStream { return TODO("body: ()Ljava/io/OutputStream;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->mClosed:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Contents have been closed, cannot access the output stream."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/drive/Contents;->MV:I
    //         const/high16 v1, 0x20000000
    //         if-eq v0, v1, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->MZ:Z
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "getOutputStream() can only be called once per Contents instance."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->MZ:Z
    //         new-instance v0, Ljava/io/FileOutputStream;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/Contents;->KE:Landroid/os/ParcelFileDescriptor;
    //         invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    //         return-object v0
    */

    public fun getParcelFileDescriptor(): android.os.ParcelFileDescriptor { return TODO("body: ()Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->mClosed:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Contents have been closed, cannot access the output stream."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/Contents;->KE:Landroid/os/ParcelFileDescriptor;
    //         return-object v0
    */

    public fun getRequestId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/drive/Contents;->uQ:I
    //         return v0
    */

    public fun hJ() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->mClosed:Z
    //         return-void
    */

    public fun hK(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->mClosed:Z
    //         return v0
    */

    public fun hL(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->MX:Z
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/a;->a(Lcom/google/android/gms/drive/Contents;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
