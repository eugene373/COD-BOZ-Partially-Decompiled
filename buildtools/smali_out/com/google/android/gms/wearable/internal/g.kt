package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 2 fields, 6 methods.

open class g: com.google.android.gms.wearable.DataEvent {
    private var FD: Int
    private var avs: com.google.android.gms.wearable.DataItem

    public constructor(p0: com.google.android.gms.wearable.DataEvent)

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/g;->pW()Lcom/google/android/gms/wearable/DataEvent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDataItem(): com.google.android.gms.wearable.DataItem { return TODO("body: ()Lcom/google/android/gms/wearable/DataItem;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/g;->avs:Lcom/google/android/gms/wearable/DataItem;
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wearable/internal/g;->FD:I
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun pW(): com.google.android.gms.wearable.DataEvent { return TODO("body: ()Lcom/google/android/gms/wearable/DataEvent;") }
    /*
    //         .locals 0
    //         return-object p0
    */

}
