package android.support.v4.util

// Auto-emitted from smali source: MapCollections.java.
// 5 fields, 4 methods.

class MapCollections_ArrayIterator: java.util.Iterator {
    var mCanRemove: Boolean
    var mIndex: Int
    val mOffset: Int
    var mSize: Int
    val this$0: android.support.v4.util.MapCollections

    constructor(offset: android.support.v4.util.MapCollections, p1: Int)

    public fun hasNext(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ArrayIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ArrayIterator<TT;>;"
    //         iget v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mSize:I
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
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ArrayIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ArrayIterator<TT;>;"
    //         iget-object v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v2, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
    //         iget v3, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mOffset:I
    //         invoke-virtual {v1, v2, v3}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "res":Ljava/lang/Object;
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
    //         add-int/lit8 v1, v1, 0x1
    //         iput v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mCanRemove:Z
    //         return-object v0
    */

    public fun remove() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ArrayIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ArrayIterator<TT;>;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mCanRemove:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
    //         throw v0
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
    //         iget v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mSize:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mSize:I
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mCanRemove:Z
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
    //         invoke-virtual {v0, v1}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
    //         return-void
    */

}
