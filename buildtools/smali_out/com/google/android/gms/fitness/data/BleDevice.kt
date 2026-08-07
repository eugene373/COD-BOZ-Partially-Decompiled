package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 6 fields, 13 methods.

open class BleDevice: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val SA: java.util.List
    private val SB: java.util.List
    private val Sz: String
    private val mName: String

    constructor(versionCode: Int, address: String, name: String, p3: java.util.List, p4: java.util.List)

    private fun a(p0: com.google.android.gms.fitness.data.BleDevice): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/BleDevice;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->mName:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/BleDevice;->mName:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->Sz:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/BleDevice;->Sz:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p1, Lcom/google/android/gms/fitness/data/BleDevice;->SA:Ljava/util/List;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SA:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ki;->a(Ljava/util/List;Ljava/util/List;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SB:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/BleDevice;->SB:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ki;->a(Ljava/util/List;Ljava/util/List;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p1, p0, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/BleDevice;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/BleDevice;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/BleDevice;->a(Lcom/google/android/gms/fitness/data/BleDevice;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getAddress(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->Sz:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDataTypes(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataType;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SB:Ljava/util/List;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSupportedProfiles(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SA:Ljava/util/List;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/BleDevice;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->mName:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->Sz:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SA:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SB:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "name"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->mName:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "address"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->Sz:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataTypes"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SB:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "supportedProfiles"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/BleDevice;->SA:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/c;->a(Lcom/google/android/gms/fitness/data/BleDevice;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
