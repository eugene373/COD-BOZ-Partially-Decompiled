package com.google.android.gms.common.data

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class c: java.util.Iterator {
    protected val JV: com.google.android.gms.common.data.DataBuffer
    protected var JW: Int

    public constructor(p0: com.google.android.gms.common.data.DataBuffer)

    public fun hasNext(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/data/c;->JW:I
    //         iget-object v1, p0, Lcom/google/android/gms/common/data/c;->JV:Lcom/google/android/gms/common/data/DataBuffer;
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/data/DataBuffer;->getCount()I
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x1
    //         if-ge v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun next(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/data/c;->hasNext()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/NoSuchElementException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Cannot advance the iterator beyond "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/common/data/c;->JW:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/data/c;->JV:Lcom/google/android/gms/common/data/DataBuffer;
    //         iget v1, p0, Lcom/google/android/gms/common/data/c;->JW:I
    //         add-int/lit8 v1, v1, 0x1
    //         iput v1, p0, Lcom/google/android/gms/common/data/c;->JW:I
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/data/DataBuffer;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun remove() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Cannot remove elements from a DataBufferIterator"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

}
