package com.google.android.gms.common.data

// Auto-emitted from smali.
// 1 fields, 10 methods.

open class DataBuffer: com.google.android.gms.common.api.Releasable, Iterable {
    protected val II: com.google.android.gms.common.data.DataHolder

    protected constructor(dataHolder: com.google.android.gms.common.data.DataHolder)

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataBuffer;->release()V
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun get(p0: Int): Object

    public fun getCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->getCount()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun gy(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->gy()Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->isClosed()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun iterator(): java.util.Iterator { return TODO("body: ()Ljava/util/Iterator;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Iterator",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/common/data/c;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/common/data/c;-><init>(Lcom/google/android/gms/common/data/DataBuffer;)V
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/DataBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->close()V
    //         :cond_0
    //         return-void
    */

    public fun singleRefIterator(): java.util.Iterator { return TODO("body: ()Ljava/util/Iterator;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Iterator",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/common/data/h;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/common/data/h;-><init>(Lcom/google/android/gms/common/data/DataBuffer;)V
    //         return-object v0
    */

}
