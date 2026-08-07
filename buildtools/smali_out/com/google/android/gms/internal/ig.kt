package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 9 methods.

open class ig: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var Gn: String

    public constructor()

    constructor(p0: Int, p1: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         if-ne p1, p0, :cond_0
    //         const/4 v0, 0x1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/internal/ig;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/internal/ig;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ig;->Gn:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/internal/ig;->Gn:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun fy(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ig;->Gn:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/ig;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ig;->Gn:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ih;->a(Lcom/google/android/gms/internal/ig;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
