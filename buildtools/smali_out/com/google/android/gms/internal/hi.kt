package com.google.android.gms.internal

// Auto-emitted from smali.
// 8 fields, 8 methods.

open class hi: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    public val Ce: String
    val Cf: com.google.android.gms.internal.hq
    public val Cg: Int
    public val Ch: ByteArray

    constructor(p0: Int, p1: String, p2: com.google.android.gms.internal.hq, p3: Int, p4: ByteArray)

    public constructor(p0: String, p1: com.google.android.gms.internal.hq)

    public constructor(p0: String, p1: com.google.android.gms.internal.hq, p2: String)

    public constructor(p0: ByteArray, p1: com.google.android.gms.internal.hq)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hi;->CREATOR:Lcom/google/android/gms/internal/hj;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun fk(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/internal/hi;->Cg:I
    //         sget v1, Lcom/google/android/gms/internal/hi;->Cc:I
    //         if-eq v0, v1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/internal/hi;->Cg:I
    //         invoke-static {v0}, Lcom/google/android/gms/internal/hp;->O(I)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Invalid section type "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/internal/hi;->Cg:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hi;->Ce:Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hi;->Ch:[B
    //         if-eqz v0, :cond_1
    //         const-string v0, "Both content and blobContent set"
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hi;->CREATOR:Lcom/google/android/gms/internal/hj;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hj;->a(Lcom/google/android/gms/internal/hi;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.hj = null!!
    @JvmField public val Cc: Int = 0
    private val Cd: com.google.android.gms.internal.hq = null!!
    }
}
