package android.support.v4.util

// Auto-emitted from smali source: MapCollections.java.
// 1 fields, 14 methods.

class MapCollections_ValuesCollection: java.util.Collection {
    val this$0: android.support.v4.util.MapCollections

    constructor(p0: android.support.v4.util.MapCollections)

    public fun add(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TV;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         .local p1, "object":Ljava/lang/Object;, "TV;"
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun addAll(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<+TV;>;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TV;>;"
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colClear()V
    //         return-void
    */

    public fun contains(object: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfValue(Ljava/lang/Object;)I
    //         move-result v0
    //         if-ltz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun containsAll(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<*>;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    //         invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    //         :cond_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Landroid/support/v4/util/MapCollections$ValuesCollection;->contains(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         const/4 v1, 0x1
    //         goto :goto_0
    */

    public fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetSize()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun iterator(): java.util.Iterator { return TODO("body: ()Ljava/util/Iterator;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Iterator",
    //                 "<TV;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         new-instance v0, Landroid/support/v4/util/MapCollections$ArrayIterator;
    //         iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         const/4 v2, 0x1
    //         invoke-direct {v0, v1, v2}, Landroid/support/v4/util/MapCollections$ArrayIterator;-><init>(Landroid/support/v4/util/MapCollections;I)V
    //         return-object v0
    */

    public fun remove(object: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfValue(Ljava/lang/Object;)I
    //         move-result v0
    //         .local v0, "index":I
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v1, v0}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
    //         const/4 v1, 0x1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun removeAll(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<*>;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v4}, Landroid/support/v4/util/MapCollections;->colGetSize()I
    //         move-result v0
    //         .local v0, "N":I
    //         const/4 v1, 0x0
    //         .local v1, "changed":Z
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         :goto_0
    //         if-ge v3, v0, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         const/4 v5, 0x1
    //         invoke-virtual {v4, v3, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v2
    //         .local v2, "cur":Ljava/lang/Object;
    //         invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v4, v3}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
    //         add-int/lit8 v3, v3, -0x1
    //         add-int/lit8 v0, v0, -0x1
    //         const/4 v1, 0x1
    //         :cond_0
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v2    # "cur":Ljava/lang/Object;
    //         :cond_1
    //         return v1
    */

    public fun retainAll(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<*>;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v4}, Landroid/support/v4/util/MapCollections;->colGetSize()I
    //         move-result v0
    //         .local v0, "N":I
    //         const/4 v1, 0x0
    //         .local v1, "changed":Z
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         :goto_0
    //         if-ge v3, v0, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         const/4 v5, 0x1
    //         invoke-virtual {v4, v3, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
    //         move-result-object v2
    //         .local v2, "cur":Ljava/lang/Object;
    //         invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v4, v3}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
    //         add-int/lit8 v3, v3, -0x1
    //         add-int/lit8 v0, v0, -0x1
    //         const/4 v1, 0x1
    //         :cond_0
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v2    # "cur":Ljava/lang/Object;
    //         :cond_1
    //         return v1
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetSize()I
    //         move-result v0
    //         return v0
    */

    public fun toArray(): Array<Object> { return TODO("body: ()[Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/support/v4/util/MapCollections;->toArrayHelper(I)[Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun toArray(p0: Array<Object>): Array<Object> { return TODO("body: ([Ljava/lang/Object;)[Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">([TT;)[TT;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    //         .local p1, "array":[Ljava/lang/Object;, "[TT;"
    //         iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, p1, v1}, Landroid/support/v4/util/MapCollections;->toArrayHelper([Ljava/lang/Object;I)[Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

}
