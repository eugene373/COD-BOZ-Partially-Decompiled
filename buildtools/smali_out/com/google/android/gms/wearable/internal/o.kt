package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 1 fields, 7 methods.

class o: com.google.android.gms.common.data.d(), com.google.android.gms.wearable.DataItem {
    private val aaK: Int

    public constructor(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int)

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/o;->pY()Lcom/google/android/gms/wearable/DataItem;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAssets(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/wearable/DataItemAsset;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/HashMap;
    //         iget v0, p0, Lcom/google/android/gms/wearable/internal/o;->aaK:I
    //         invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget v2, p0, Lcom/google/android/gms/wearable/internal/o;->aaK:I
    //         if-ge v0, v2, :cond_1
    //         new-instance v2, Lcom/google/android/gms/wearable/internal/k;
    //         iget-object v3, p0, Lcom/google/android/gms/wearable/internal/o;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v4, p0, Lcom/google/android/gms/wearable/internal/o;->JX:I
    //         add-int/2addr v4, v0
    //         invoke-direct {v2, v3, v4}, Lcom/google/android/gms/wearable/internal/k;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         invoke-virtual {v2}, Lcom/google/android/gms/wearable/internal/k;->getDataItemKey()Ljava/lang/String;
    //         move-result-object v3
    //         if-nez v3, :cond_0
    //         :goto_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v2}, Lcom/google/android/gms/wearable/internal/k;->getDataItemKey()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_1
    //         :cond_1
    //         return-object v1
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         const-string v0, "data"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/o;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun getUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "path"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/o;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun pY(): com.google.android.gms.wearable.DataItem { return TODO("body: ()Lcom/google/android/gms/wearable/DataItem;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/l;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/l;-><init>(Lcom/google/android/gms/wearable/DataItem;)V
    //         return-object v0
    */

    public fun setData(data: ByteArray): com.google.android.gms.wearable.DataItem { return TODO("body: ([B)Lcom/google/android/gms/wearable/DataItem;") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

}
