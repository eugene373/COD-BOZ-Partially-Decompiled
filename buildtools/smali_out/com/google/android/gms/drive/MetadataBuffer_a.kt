package com.google.android.gms.drive

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class MetadataBuffer_a: com.google.android.gms.drive.Metadata() {
    private val II: com.google.android.gms.common.data.DataHolder
    private val JY: Int
    private val Ns: Int

    public constructor(p0: com.google.android.gms.common.data.DataHolder, p1: Int)

    protected fun a(p0: com.google.android.gms.drive.metadata.MetadataField): Object { return TODO("body: (Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v1, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->Ns:I
    //         iget v2, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->JY:I
    //         invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/drive/metadata/MetadataField;->a(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/MetadataBuffer$a;->hR()Lcom/google/android/gms/drive/Metadata;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hR(): com.google.android.gms.drive.Metadata { return TODO("body: ()Lcom/google/android/gms/drive/Metadata;") }
    /*
    //         .locals 6
    //         invoke-static {}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->io()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         move-result-object v1
    //         invoke-static {}, Lcom/google/android/gms/drive/metadata/internal/e;->in()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/metadata/MetadataField;
    //         instance-of v3, v0, Lcom/google/android/gms/drive/metadata/b;
    //         if-nez v3, :cond_0
    //         sget-object v3, Lcom/google/android/gms/internal/kd;->Ql:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         if-eq v0, v3, :cond_0
    //         iget-object v3, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v4, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->Ns:I
    //         iget v5, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->JY:I
    //         invoke-interface {v0, v3, v1, v4, v5}, Lcom/google/android/gms/drive/metadata/MetadataField;->a(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;II)V
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/l;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/l;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    //         return-object v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.drive.MetadataBuffer.a): Int { return TODO("body: (Lcom/google/android/gms/drive/MetadataBuffer$a;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/drive/MetadataBuffer$a;->Ns:I
    //         return v0
    */

    }
}
