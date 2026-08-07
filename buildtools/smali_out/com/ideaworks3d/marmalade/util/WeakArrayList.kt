package com.ideaworks3d.marmalade.util

// Auto-emitted from smali source: WeakArrayList.java.
// 1 fields, 7 methods.

open class WeakArrayList: java.util.AbstractList() {
    private var m_list: java.util.List

    public constructor()

    public fun add(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TE;)Z"
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;
    //         new-instance v1, Ljava/lang/ref/WeakReference;
    //         invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun expunge() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    public fun get(p0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)TE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
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

    public fun iterator(): java.util.Iterator { return TODO("body: ()Ljava/util/Iterator;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Iterator",
    //                 "<TE;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;
    //         invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList$1;-><init>(Lcom/ideaworks3d/marmalade/util/WeakArrayList;)V
    //         return-object v0
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->m_list:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         return v0
    */

}
