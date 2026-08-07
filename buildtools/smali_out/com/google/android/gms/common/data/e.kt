package com.google.android.gms.common.data

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class e: com.google.android.gms.common.data.DataBuffer() {
    private val Ka: android.os.Parcelable.Creator

    public constructor(p0: com.google.android.gms.common.data.DataHolder, p1: android.os.Parcelable.Creator)

    public fun aq(p0: Int): com.google.android.gms.common.internal.safeparcel.SafeParcelable { return TODO("body: (I)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)TT;"
    //             }
    //         .end annotation
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/e;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         const-string v1, "data"
    //         invoke-virtual {v0, v1, p1, v3}, Lcom/google/android/gms/common/data/DataHolder;->f(Ljava/lang/String;II)[B
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         array-length v2, v0
    //         invoke-virtual {v1, v0, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/e;->Ka:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    */

    public fun get(x0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/common/data/e;, "Lcom/google/android/gms/common/data/e<TT;>;"
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/data/e;->aq(I)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val JZ: Array<String> = null!!
    }
}
