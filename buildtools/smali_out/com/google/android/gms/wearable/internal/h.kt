package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 1 fields, 5 methods.

class h: com.google.android.gms.common.data.d(), com.google.android.gms.wearable.DataEvent {
    private val aaK: Int

    public constructor(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int)

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/h;->pW()Lcom/google/android/gms/wearable/DataEvent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDataItem(): com.google.android.gms.wearable.DataItem { return TODO("body: ()Lcom/google/android/gms/wearable/DataItem;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/o;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/h;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v2, p0, Lcom/google/android/gms/wearable/internal/h;->JX:I
    //         iget v3, p0, Lcom/google/android/gms/wearable/internal/h;->aaK:I
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/wearable/internal/o;-><init>(Lcom/google/android/gms/common/data/DataHolder;II)V
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "event_type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/h;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun pW(): com.google.android.gms.wearable.DataEvent { return TODO("body: ()Lcom/google/android/gms/wearable/DataEvent;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/g;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/g;-><init>(Lcom/google/android/gms/wearable/DataEvent;)V
    //         return-object v0
    */

}
