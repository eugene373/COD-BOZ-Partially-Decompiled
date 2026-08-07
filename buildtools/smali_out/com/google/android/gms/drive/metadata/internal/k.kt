package com.google.android.gms.drive.metadata.internal

// Auto-emitted from smali.
// 0 fields, 8 methods.

open class k: com.google.android.gms.drive.metadata.b() {
    public constructor(p0: String, p1: Int)

    protected fun a(p0: android.os.Bundle, p1: Object) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p2, Ljava/util/Collection;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/k;->a(Landroid/os/Bundle;Ljava/util/Collection;)V
    //         return-void
    */

    protected fun a(p0: android.os.Bundle, p1: java.util.Collection) { /* TODO(body): (Landroid/os/Bundle;Ljava/util/Collection;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/internal/k;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         return-void
    */

    protected fun c(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): Object { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/drive/metadata/internal/k;->d(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/util/Collection;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun d(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): java.util.Collection { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Ljava/util/Collection;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/data/DataHolder;",
    //                 "II)",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/internal/k;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0, p2, p3}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/drive/metadata/internal/k;->bk(Ljava/lang/String;)Ljava/util/Collection;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         const-string v2, "DataHolder supplied invalid JSON"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    protected fun g(p0: android.os.Bundle): Object { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/metadata/internal/k;->l(Landroid/os/Bundle;)Ljava/util/Collection;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun l(p0: android.os.Bundle): java.util.Collection { return TODO("body: (Landroid/os/Bundle;)Ljava/util/Collection;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 ")",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/internal/k;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun bk(p0: String): java.util.Collection { return TODO("body: (Ljava/lang/String;)Ljava/util/Collection;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         new-instance v2, Lorg/json/JSONArray;
    //         invoke-direct {v2, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_1
    //         invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
    //         move-result v3
    //         if-ge v0, v3, :cond_1
    //         invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_1
    //         invoke-static {v1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
