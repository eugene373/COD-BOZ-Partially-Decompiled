package com.facebook.widget

// Auto-emitted from smali source: SimpleGraphObjectCursor.java.
// 5 fields, 22 methods.

open class SimpleGraphObjectCursor: com.facebook.widget.GraphObjectCursor {
    private var closed: Boolean
    private var fromCache: Boolean
    private var graphObjects: java.util.ArrayList
    private var moreObjectsAvailable: Boolean
    private var pos: Int

    constructor()

    constructor(p0: com.facebook.widget.SimpleGraphObjectCursor)

    public fun addGraphObjects(p0: java.util.Collection, p1: Boolean) { /* TODO(body): (Ljava/util/Collection;Z)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;Z)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->graphObjects:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         iget-boolean v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->fromCache:Z
    //         or-int/2addr v0, p2
    //         iput-boolean v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->fromCache:Z
    //         return-void
    */

    public fun areMoreObjectsAvailable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->moreObjectsAvailable:Z
    //         return v0
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->closed:Z
    //         return-void
    */

    public fun getCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->graphObjects:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         return v0
    */

    public fun getGraphObject(): com.facebook.model.GraphObject { return TODO("body: ()Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         if-gez v0, :cond_0
    //         new-instance v0, Landroid/database/CursorIndexOutOfBoundsException;
    //         const-string v1, "Before first object."
    //         invoke-direct {v0, v1}, Landroid/database/CursorIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         iget-object v1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->graphObjects:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-lt v0, v1, :cond_1
    //         new-instance v0, Landroid/database/CursorIndexOutOfBoundsException;
    //         const-string v1, "After last object."
    //         invoke-direct {v0, v1}, Landroid/database/CursorIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->graphObjects:Ljava/util/ArrayList;
    //         iget v1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         return-object v0
    */

    public fun getPosition(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         return v0
    */

    public fun isAfterLast(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         if-ne v1, v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isBeforeFirst(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->closed:Z
    //         return v0
    */

    public fun isFirst(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isFromCache(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->fromCache:Z
    //         return v0
    */

    public fun isLast(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v0
    //         iget v1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         add-int/lit8 v2, v0, -0x1
    //         if-ne v1, v2, :cond_0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun move(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         add-int/2addr v0, p1
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->moveToPosition(I)Z
    //         move-result v0
    //         return v0
    */

    public fun moveToFirst(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->moveToPosition(I)Z
    //         move-result v0
    //         return v0
    */

    public fun moveToLast(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->moveToPosition(I)Z
    //         move-result v0
    //         return v0
    */

    public fun moveToNext(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         add-int/lit8 v0, v0, 0x1
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->moveToPosition(I)Z
    //         move-result v0
    //         return v0
    */

    public fun moveToPosition(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->getCount()I
    //         move-result v1
    //         if-lt p1, v1, :cond_0
    //         iput v1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         :goto_0
    //         return v0
    //         :cond_0
    //         if-gez p1, :cond_1
    //         const/4 v1, -0x1
    //         iput v1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         goto :goto_0
    //         :cond_1
    //         iput p1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun moveToPrevious(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->pos:I
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->moveToPosition(I)Z
    //         move-result v0
    //         return v0
    */

    public fun setFromCache(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->fromCache:Z
    //         return-void
    */

    public fun setMoreObjectsAvailable(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/widget/SimpleGraphObjectCursor;->moreObjectsAvailable:Z
    //         return-void
    */

}
