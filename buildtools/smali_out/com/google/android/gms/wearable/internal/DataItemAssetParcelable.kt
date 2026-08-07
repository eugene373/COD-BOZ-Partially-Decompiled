package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 4 fields, 11 methods.

open class DataItemAssetParcelable: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.wearable.DataItemAsset {
    private val BL: String
    val BR: Int
    private val JO: String

    constructor(versionCode: Int, id: String, key: String)

    public constructor(value: com.google.android.gms.wearable.DataItemAsset)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/DataItemAssetParcelable;->pX()Lcom/google/android/gms/wearable/DataItemAsset;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDataItemKey(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/DataItemAssetParcelable;->JO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/DataItemAssetParcelable;->BL:Ljava/lang/String;
    //         return-object v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun pX(): com.google.android.gms.wearable.DataItemAsset { return TODO("body: ()Lcom/google/android/gms/wearable/DataItemAsset;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "DataItemAssetParcelable["
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, "@"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/DataItemAssetParcelable;->BL:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         const-string v1, ",noid"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :goto_0
    //         const-string v1, ", key="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/DataItemAssetParcelable;->JO:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v1, ","
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/DataItemAssetParcelable;->BL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/j;->a(Lcom/google/android/gms/wearable/internal/DataItemAssetParcelable;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
