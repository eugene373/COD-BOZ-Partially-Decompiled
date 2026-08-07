package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 5 fields, 11 methods.

open class StartBleScanRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val SB: java.util.List
    private val UQ: com.google.android.gms.fitness.request.l
    private val UR: Int

    constructor(versionCode: Int, bleScanCallback: java.util.List, timeoutSecs: android.os.IBinder, p3: Int)

    private constructor(builder: com.google.android.gms.fitness.request.StartBleScanRequest.Builder)

    constructor(x0: com.google.android.gms.fitness.request.StartBleScanRequest.Builder, x1: com.google.android.gms.fitness.request.StartBleScanRequest.1)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->SB:Ljava/util/List;
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTimeoutSecs(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->UR:I
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->BR:I
    //         return v0
    */

    public fun jC(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->UQ:Lcom/google/android/gms/fitness/request/l;
    //         invoke-interface {v0}, Lcom/google/android/gms/fitness/request/l;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataTypes"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->SB:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "timeoutSecs"
    //         iget v2, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->UR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/ac;->a(Lcom/google/android/gms/fitness/request/StartBleScanRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
