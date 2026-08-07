package com.google.android.gms.drive.metadata

// Auto-emitted from smali.
// 4 fields, 12 methods.

open class a: com.google.android.gms.drive.metadata.MetadataField {
    private val PB: String
    private val PC: java.util.Set
    private val PD: java.util.Set
    private val PE: Int

    protected constructor(p0: String, p1: Int)

    protected constructor(p0: String, p1: java.util.Collection, p2: java.util.Collection, p3: Int)

    public fun a(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): Object { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/data/DataHolder;",
    //                 "II)TT;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/drive/metadata/a;->b(Lcom/google/android/gms/common/data/DataHolder;II)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/drive/metadata/a;->c(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun a(p0: android.os.Bundle, p1: Object)

    public fun a(p0: com.google.android.gms.common.data.DataHolder, p1: com.google.android.gms.drive.metadata.internal.MetadataBundle, p2: Int, p3: Int) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;II)V */ }
    /*
    //         .locals 1
    //         const-string v0, "dataHolder"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "bundle"
    //         invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p3, p4}, Lcom/google/android/gms/drive/metadata/a;->a(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {p2, p0, v0}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->b(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)V
    //         return-void
    */

    public fun a(p0: Object, p1: android.os.Bundle) { /* TODO(body): (Ljava/lang/Object;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TT;",
    //                 "Landroid/os/Bundle;",
    //                 ")V"
    //             }
    //         .end annotation
    //         const-string v0, "bundle"
    //         invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         if-nez p1, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/a;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/drive/metadata/a;->a(Landroid/os/Bundle;Ljava/lang/Object;)V
    //         goto :goto_0
    */

    protected fun b(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): Boolean { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/a;->PC:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p1, v0, p2, p3}, Lcom/google/android/gms/common/data/DataHolder;->h(Ljava/lang/String;II)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    protected fun c(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): Object

    public fun f(p0: android.os.Bundle): Object { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         const-string v0, "bundle"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/a;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/metadata/a;->g(Landroid/os/Bundle;)Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun g(p0: android.os.Bundle): Object

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/a;->PB:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/a;->PB:Ljava/lang/String;
    //         return-object v0
    */

}
