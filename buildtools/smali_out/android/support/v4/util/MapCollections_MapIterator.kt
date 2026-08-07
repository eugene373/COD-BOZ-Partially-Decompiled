package android.support.v4.util

// Auto-emitted from smali source: MapCollections.java.
// 4 fields, 11 methods.

class MapCollections_MapIterator: java.util.Iterator, java.util.Map.Entry {
    var mEnd: Int
    var mEntryValid: Boolean
    var mIndex: Int
    val this$0: android.support.v4.util.MapCollections

    constructor(p0: android.support.v4.util.MapCollections)

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-boolean v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         if-nez v3, :cond_0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         const-string v2, "This container does not support retaining Map.Entry objects"
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         instance-of v3, p1, Ljava/util/Map$Entry;
    //         if-nez v3, :cond_1
    //         :goto_0
    //         return v2
    //         :cond_1
    //         move-object v0, p1
    //         check-cast v0, Ljava/util/Map$Entry;
    //         .local v0, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v3
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v5, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         invoke-virtual {v4, v5, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/support/v4/util/ContainerHelpers;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v3
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v5, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         invoke-virtual {v4, v5, v1}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/support/v4/util/ContainerHelpers;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         :goto_1
    //         move v2, v1
    //         goto :goto_0
    //         :cond_2
    //         move v1, v2
    //         goto :goto_1
    */

    public fun getKey(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TK;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "This container does not support retaining Map.Entry objects"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getValue(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TV;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "This container does not support retaining Map.Entry objects"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hasNext(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEnd:I
    //         if-ge v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 6
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         const/4 v2, 0x0
    //         iget-boolean v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         if-nez v3, :cond_0
    //         new-instance v2, Ljava/lang/IllegalStateException;
    //         const-string v3, "This container does not support retaining Map.Entry objects"
    //         invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_0
    //         iget-object v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         invoke-virtual {v3, v4, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "key":Ljava/lang/Object;
    //         iget-object v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         const/4 v5, 0x1
    //         invoke-virtual {v3, v4, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "value":Ljava/lang/Object;
    //         if-nez v0, :cond_1
    //         move v3, v2
    //         :goto_0
    //         if-nez v1, :cond_2
    //         :goto_1
    //         xor-int/2addr v2, v3
    //         return v2
    //         :cond_1
    //         invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
    //         move-result v3
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
    //         move-result v2
    //         goto :goto_1
    */

    public fun next(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         invoke-virtual {p0}, Landroid/support/v4/util/MapCollections$MapIterator;->next()Ljava/util/Map$Entry;
    //         move-result-object v0
    //         return-object v0
    */

    public fun next(): java.util.Map.Entry { return TODO("body: ()Ljava/util/Map$Entry;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map$Entry",
    //                 "<TK;TV;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         return-object p0
    */

    public fun remove() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         invoke-virtual {v0, v1}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
    //         iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEnd:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEnd:I
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         return-void
    */

    public fun setValue(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TV;)TV;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         .local p1, "object":Ljava/lang/Object;, "TV;"
    //         iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "This container does not support retaining Map.Entry objects"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
    //         iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
    //         invoke-virtual {v0, v1, p1}, Landroid/support/v4/util/MapCollections;->colSetValue(ILjava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p0}, Landroid/support/v4/util/MapCollections$MapIterator;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Landroid/support/v4/util/MapCollections$MapIterator;->getValue()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
