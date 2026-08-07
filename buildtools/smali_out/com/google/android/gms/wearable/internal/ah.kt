package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 6 fields, 9 methods.

open class ah: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.wearable.MessageEvent {
    val BR: Int
    private val acH: ByteArray
    private val avH: String
    private val avI: String
    private val uQ: Int

    constructor(p0: Int, p1: Int, p2: String, p3: ByteArray, p4: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ah;->acH:[B
    //         return-object v0
    */

    public fun getPath(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ah;->avH:Ljava/lang/String;
    //         return-object v0
    */

    public fun getRequestId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wearable/internal/ah;->uQ:I
    //         return v0
    */

    public fun getSourceNodeId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ah;->avI:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "MessageEventParcelable["
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/wearable/internal/ah;->uQ:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ","
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ah;->avH:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", size="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ah;->acH:[B
    //         if-nez v0, :cond_0
    //         const-string v0, "null"
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ah;->acH:[B
    //         array-length v0, v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/ai;->a(Lcom/google/android/gms/wearable/internal/ah;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
