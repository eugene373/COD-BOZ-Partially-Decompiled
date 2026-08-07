package com.google.android.gms.drive.metadata

// Auto-emitted from smali.
// 5 fields, 9 methods.

open class CustomPropertyKey: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val JO: String
    val mVisibility: Int

    constructor(versionCode: Int, key: String, visibility: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-nez p1, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v1
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         if-ne p1, p0, :cond_2
    //         move v1, v0
    //         goto :goto_0
    //         :cond_2
    //         instance-of v2, p1, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;
    //         if-eqz v2, :cond_0
    //         check-cast p1, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->getKey()Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->JO:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->getVisibility()I
    //         move-result v2
    //         iget v3, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->mVisibility:I
    //         if-ne v2, v3, :cond_3
    //         :goto_1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_1
    */

    public fun getKey(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->JO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVisibility(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->mVisibility:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v1, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->JO:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->mVisibility:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "CustomPropertyKey("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->JO:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ","
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->mVisibility:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/c;->a(Lcom/google/android/gms/drive/metadata/CustomPropertyKey;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    private val PF: java.util.regex.Pattern = null!!
    }
}
