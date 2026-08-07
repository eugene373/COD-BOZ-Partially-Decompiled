package com.ideaworks3d.marmalade.util

// Auto-emitted from smali source: WeakArrayList.java.
// 2 fields, 4 methods.

open class WeakArrayList_Anon1: java.util.Iterator {
    private var it: java.util.Iterator
    val this$0: com.ideaworks3d.marmalade.util.WeakArrayList

    constructor(p0: com.ideaworks3d.marmalade.util.WeakArrayList)

    public fun hasNext(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->it:Ljava/util/Iterator;
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         return v0
    */

    public fun next(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->it:Ljava/util/Iterator;
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/ref/WeakReference;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun remove() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;->it:Ljava/util/Iterator;
    //         invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    //         return-void
    */

}
