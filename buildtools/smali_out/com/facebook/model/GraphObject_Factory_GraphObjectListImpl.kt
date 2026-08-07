package com.facebook.model

// Auto-emitted from smali source: GraphObject.java.
// 2 fields, 16 methods.

class GraphObject_Factory_GraphObjectListImpl: java.util.AbstractList(), com.facebook.model.GraphObjectList {
    private val itemType: Class
    private val state: org.json.JSONArray

    public constructor(p0: org.json.JSONArray, p1: Class)

    private fun checkIndex(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         if-ltz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-lt p1, v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IndexOutOfBoundsException;
    //         invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    private fun put(p0: Int, p1: Object) { /* TODO(body): (ILjava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(ITT;)V"
    //             }
    //         .end annotation
    //         invoke-static {p2}, Lcom/facebook/model/GraphObject$Factory;->access$200(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         invoke-virtual {v1, p1, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun add(p0: Int, p1: Object) { /* TODO(body): (ILjava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(ITT;)V"
    //             }
    //         .end annotation
    //         if-gez p1, :cond_0
    //         new-instance v0, Ljava/lang/IndexOutOfBoundsException;
    //         invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->size()I
    //         move-result v0
    //         if-ge p1, v0, :cond_1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Only adding items at the end of the list is supported."
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->put(ILjava/lang/Object;)V
    //         return-void
    */

    public fun castToListOf(p0: Class): com.facebook.model.GraphObjectList { return TODO("body: (Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<U::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TU;>;)",
    //                 "Lcom/facebook/model/GraphObjectList",
    //                 "<TU;>;"
    //             }
    //         .end annotation
    //         const-class v0, Lcom/facebook/model/GraphObject;
    //         iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;
    //         invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;
    //         invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         invoke-static {v0, p1}, Lcom/facebook/model/GraphObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Can\'t cast GraphObjectCollection of non-GraphObject type "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun equals(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-ne p0, p1, :cond_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         if-ne v1, v2, :cond_0
    //         check-cast p1, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         iget-object v1, p1, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         invoke-virtual {v0, v1}, Lorg/json/JSONArray;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun get(p0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)TT;"
    //             }
    //         .end annotation
    //         invoke-direct {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->checkIndex(I)V
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/facebook/model/GraphObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInnerJSONArray(): org.json.JSONArray { return TODO("body: ()Lorg/json/JSONArray;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun remove(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
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
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
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
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun set(p0: Int, p1: Object): Object { return TODO("body: (ILjava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(ITT;)TT;"
    //             }
    //         .end annotation
    //         invoke-direct {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->checkIndex(I)V
    //         invoke-virtual {p0, p1}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->put(ILjava/lang/Object;)V
    //         return-object v0
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "GraphObjectList{itemType=%s, state=%s}"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->itemType:Ljava/lang/Class;
    //         invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/facebook/model/GraphObject$Factory$GraphObjectListImpl;->state:Lorg/json/JSONArray;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
