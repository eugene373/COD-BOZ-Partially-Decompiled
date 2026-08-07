package android.support.v4.util

// Auto-emitted from smali source: ArrayMap.java.
// 1 fields, 11 methods.

open class ArrayMap: android.support.v4.util.SimpleArrayMap(), java.util.Map {
    var mCollections: android.support.v4.util.MapCollections

    public constructor()

    public constructor(capacity: Int)

    public constructor(map: android.support.v4.util.SimpleArrayMap)

    private fun getCollection(): android.support.v4.util.MapCollections { return TODO("body: ()Landroid/support/v4/util/MapCollections;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Landroid/support/v4/util/MapCollections",
    //                 "<TK;TV;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap;->mCollections:Landroid/support/v4/util/MapCollections;
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/support/v4/util/ArrayMap$1;
    //         invoke-direct {v0, p0}, Landroid/support/v4/util/ArrayMap$1;-><init>(Landroid/support/v4/util/ArrayMap;)V
    //         iput-object v0, p0, Landroid/support/v4/util/ArrayMap;->mCollections:Landroid/support/v4/util/MapCollections;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/ArrayMap;->mCollections:Landroid/support/v4/util/MapCollections;
    //         return-object v0
    */

    public fun containsAll(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<*>;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    //         invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->containsAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
    //         move-result v0
    //         return v0
    */

    public fun entrySet(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/util/Map$Entry",
    //                 "<TK;TV;>;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         invoke-direct {p0}, Landroid/support/v4/util/ArrayMap;->getCollection()Landroid/support/v4/util/MapCollections;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->getEntrySet()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    public fun keySet(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<TK;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         invoke-direct {p0}, Landroid/support/v4/util/ArrayMap;->getCollection()Landroid/support/v4/util/MapCollections;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->getKeySet()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    public fun putAll(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<+TK;+TV;>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<+TK;+TV;>;"
    //         iget v2, p0, Landroid/support/v4/util/ArrayMap;->mSize:I
    //         invoke-interface {p1}, Ljava/util/Map;->size()I
    //         move-result v3
    //         add-int/2addr v2, v3
    //         invoke-virtual {p0, v2}, Landroid/support/v4/util/ArrayMap;->ensureCapacity(I)V
    //         invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         .local v1, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-virtual {p0, v2, v3}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    //         :cond_0
    //         return-void
    */

    public fun removeAll(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<*>;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    //         invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->removeAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
    //         move-result v0
    //         return v0
    */

    public fun retainAll(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<*>;)Z"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    //         invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->retainAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
    //         move-result v0
    //         return v0
    */

    public fun values(): java.util.Collection { return TODO("body: ()Ljava/util/Collection;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Collection",
    //                 "<TV;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
    //         invoke-direct {p0}, Landroid/support/v4/util/ArrayMap;->getCollection()Landroid/support/v4/util/MapCollections;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->getValues()Ljava/util/Collection;
    //         move-result-object v0
    //         return-object v0
    */

}
