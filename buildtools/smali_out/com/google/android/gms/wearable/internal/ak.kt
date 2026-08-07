package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 4 fields, 9 methods.

open class ak: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.wearable.Node {
    private val BL: String
    val BR: Int
    private val NH: String

    constructor(p0: Int, p1: String, p2: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/wearable/internal/ak;
    //         if-nez v1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/wearable/internal/ak;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v1, p1, Lcom/google/android/gms/wearable/internal/ak;->BL:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/ak;->BL:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p1, Lcom/google/android/gms/wearable/internal/ak;->NH:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/ak;->NH:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ak;->NH:Ljava/lang/String;
    //         return-object v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ak;->BL:Ljava/lang/String;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ak;->BL:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         add-int/lit16 v0, v0, 0x275
    //         mul-int/lit8 v0, v0, 0x25
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ak;->NH:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "NodeParcelable{"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ak;->BL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ","
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ak;->NH:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/al;->a(Lcom/google/android/gms/wearable/internal/ak;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
