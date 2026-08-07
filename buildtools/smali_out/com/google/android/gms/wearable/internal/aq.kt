package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class aq: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    public val avk: com.google.android.gms.wearable.internal.ae

    constructor(p0: Int, p1: android.os.IBinder)

    public constructor(p0: com.google.android.gms.wearable.internal.ae)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun pV(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aq;->avk:Lcom/google/android/gms/wearable/internal/ae;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aq;->avk:Lcom/google/android/gms/wearable/internal/ae;
    //         invoke-interface {v0}, Lcom/google/android/gms/wearable/internal/ae;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/wearable/internal/aq;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
