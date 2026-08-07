package com.google.android.gms.drive

// Auto-emitted from smali.
// 2 fields, 4 methods.

class MetadataBuffer: com.google.android.gms.common.data.DataBuffer() {
    private val Nq: String
    private var Nr: com.google.android.gms.drive.MetadataBuffer.a

    public constructor(dataHolder: com.google.android.gms.common.data.DataHolder, nextPageToken: String)

    public fun get(row: Int): com.google.android.gms.drive.Metadata { return TODO("body: (I)Lcom/google/android/gms/drive/Metadata;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->Nr:Lcom/google/android/gms/drive/MetadataBuffer$a;
    //         if-eqz v0, :cond_0
    //         invoke-static {v0}, Lcom/google/android/gms/drive/MetadataBuffer$a;->a(Lcom/google/android/gms/drive/MetadataBuffer$a;)I
    //         move-result v1
    //         if-eq v1, p1, :cond_1
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/MetadataBuffer$a;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/MetadataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/drive/MetadataBuffer$a;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         iput-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->Nr:Lcom/google/android/gms/drive/MetadataBuffer$a;
    //         :cond_1
    //         return-object v0
    */

    public fun get(x0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/MetadataBuffer;->get(I)Lcom/google/android/gms/drive/Metadata;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getNextPageToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->Nq:Ljava/lang/String;
    //         return-object v0
    */

}
