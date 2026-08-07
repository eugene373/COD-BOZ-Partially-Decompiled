package android.support.v4.util

// Auto-emitted from smali source: ArrayMap.java.
// 1 fields, 10 methods.

open class ArrayMap_Anon1: android.support.v4.util.MapCollections() {
    val this$0: android.support.v4.util.ArrayMap

    constructor(p0: android.support.v4.util.ArrayMap)

    protected fun colClear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V
    //         return-void
    */

    protected fun colGetEntry(index: Int, offset: Int): Object { return TODO("body: (II)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         iget-object v0, v0, Landroid/support/v4/util/ArrayMap;->mArray:[Ljava/lang/Object;
    //         shl-int/lit8 v1, p1, 0x1
    //         add-int/2addr v1, p2
    //         aget-object v0, v0, v1
    //         return-object v0
    */

    protected fun colGetMap(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<TK;TV;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         return-object v0
    */

    protected fun colGetSize(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         iget v0, v0, Landroid/support/v4/util/ArrayMap;->mSize:I
    //         return v0
    */

    protected fun colIndexOfKey(key: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/util/ArrayMap;->indexOfKey(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    protected fun colIndexOfValue(value: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/util/ArrayMap;->indexOfValue(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    protected fun colPut(p0: Object, p1: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TK;TV;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         .local p1, "key":Ljava/lang/Object;, "TK;"
    //         .local p2, "value":Ljava/lang/Object;, "TV;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    protected fun colRemoveAt(index: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/util/ArrayMap;->removeAt(I)Ljava/lang/Object;
    //         return-void
    */

    protected fun colSetValue(index: Int, p1: Object): Object { return TODO("body: (ILjava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
    //         .local p2, "value":Ljava/lang/Object;, "TV;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/ArrayMap;->setValueAt(ILjava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

}
