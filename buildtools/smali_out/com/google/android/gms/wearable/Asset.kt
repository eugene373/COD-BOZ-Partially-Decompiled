package com.google.android.gms.wearable

// Auto-emitted from smali.
// 6 fields, 15 methods.

open class Asset: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private var acH: ByteArray
    private var auQ: String
    public var auR: android.os.ParcelFileDescriptor
    public var uri: android.net.Uri

    constructor(versionCode: Int, data: ByteArray, digest: String, fd: android.os.ParcelFileDescriptor, uri: android.net.Uri)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/wearable/Asset;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/wearable/Asset;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->acH:[B
    //         iget-object v3, p1, Lcom/google/android/gms/wearable/Asset;->acH:[B
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->auQ:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/wearable/Asset;->auQ:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->auR:Landroid/os/ParcelFileDescriptor;
    //         iget-object v3, p1, Lcom/google/android/gms/wearable/Asset;->auR:Landroid/os/ParcelFileDescriptor;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->uri:Landroid/net/Uri;
    //         iget-object v3, p1, Lcom/google/android/gms/wearable/Asset;->uri:Landroid/net/Uri;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/Asset;->acH:[B
    //         return-object v0
    */

    public fun getDigest(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/Asset;->auQ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getFd(): android.os.ParcelFileDescriptor { return TODO("body: ()Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/Asset;->auR:Landroid/os/ParcelFileDescriptor;
    //         return-object v0
    */

    public fun getUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/Asset;->uri:Landroid/net/Uri;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->acH:[B
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->auQ:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->auR:Landroid/os/ParcelFileDescriptor;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/Asset;->uri:Landroid/net/Uri;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Asset[@"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/Asset;->hashCode()I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->auQ:Ljava/lang/String;
    //         if-nez v1, :cond_3
    //         const-string v1, ", nodigest"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->acH:[B
    //         if-eqz v1, :cond_0
    //         const-string v1, ", size="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->acH:[B
    //         array-length v1, v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->auR:Landroid/os/ParcelFileDescriptor;
    //         if-eqz v1, :cond_1
    //         const-string v1, ", fd="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->auR:Landroid/os/ParcelFileDescriptor;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->uri:Landroid/net/Uri;
    //         if-eqz v1, :cond_2
    //         const-string v1, ", uri="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->uri:Landroid/net/Uri;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         :cond_2
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_3
    //         const-string v1, ", "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/Asset;->auQ:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         or-int/lit8 v0, p2, 0x1
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/wearable/a;->a(Lcom/google/android/gms/wearable/Asset;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun createFromBytes(assetData: ByteArray): com.google.android.gms.wearable.Asset { return TODO("body: ([B)Lcom/google/android/gms/wearable/Asset;") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Asset data cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/wearable/Asset;
    //         const/4 v1, 0x1
    //         move-object v2, p0
    //         move-object v4, v3
    //         move-object v5, v3
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/Asset;-><init>(I[BLjava/lang/String;Landroid/os/ParcelFileDescriptor;Landroid/net/Uri;)V
    //         return-object v0
    */

    public @JvmStatic fun createFromFd(fd: android.os.ParcelFileDescriptor): com.google.android.gms.wearable.Asset { return TODO("body: (Landroid/os/ParcelFileDescriptor;)Lcom/google/android/gms/wearable/Asset;") }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Asset fd cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/wearable/Asset;
    //         const/4 v1, 0x1
    //         move-object v3, v2
    //         move-object v4, p0
    //         move-object v5, v2
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/Asset;-><init>(I[BLjava/lang/String;Landroid/os/ParcelFileDescriptor;Landroid/net/Uri;)V
    //         return-object v0
    */

    public @JvmStatic fun createFromRef(digest: String): com.google.android.gms.wearable.Asset { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;") }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Asset digest cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/wearable/Asset;
    //         const/4 v1, 0x1
    //         move-object v3, p0
    //         move-object v4, v2
    //         move-object v5, v2
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/Asset;-><init>(I[BLjava/lang/String;Landroid/os/ParcelFileDescriptor;Landroid/net/Uri;)V
    //         return-object v0
    */

    public @JvmStatic fun createFromUri(uri: android.net.Uri): com.google.android.gms.wearable.Asset { return TODO("body: (Landroid/net/Uri;)Lcom/google/android/gms/wearable/Asset;") }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Asset uri cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/wearable/Asset;
    //         const/4 v1, 0x1
    //         move-object v3, v2
    //         move-object v4, v2
    //         move-object v5, p0
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/Asset;-><init>(I[BLjava/lang/String;Landroid/os/ParcelFileDescriptor;Landroid/net/Uri;)V
    //         return-object v0
    */

    }
}
