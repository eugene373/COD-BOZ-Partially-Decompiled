package com.google.android.gms.drive.metadata.internal

// Auto-emitted from smali.
// 0 fields, 7 methods.

open class d: com.google.android.gms.drive.metadata.d() {
    public constructor(p0: String, p1: Int)

    protected fun a(p0: android.os.Bundle, p1: Object) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p2, Ljava/util/Date;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/d;->a(Landroid/os/Bundle;Ljava/util/Date;)V
    //         return-void
    */

    protected fun a(p0: android.os.Bundle, p1: java.util.Date) { /* TODO(body): (Landroid/os/Bundle;Ljava/util/Date;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/internal/d;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Ljava/util/Date;->getTime()J
    //         move-result-wide v2
    //         invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-void
    */

    protected fun c(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): Object { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/drive/metadata/internal/d;->f(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/util/Date;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun f(p0: com.google.android.gms.common.data.DataHolder, p1: Int, p2: Int): java.util.Date { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;II)Ljava/util/Date;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/util/Date;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/internal/d;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p1, v1, p2, p3}, Lcom/google/android/gms/common/data/DataHolder;->a(Ljava/lang/String;II)J
    //         move-result-wide v2
    //         invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         return-object v0
    */

    protected fun g(p0: android.os.Bundle): Object { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/metadata/internal/d;->i(Landroid/os/Bundle;)Ljava/util/Date;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun i(p0: android.os.Bundle): java.util.Date { return TODO("body: (Landroid/os/Bundle;)Ljava/util/Date;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/util/Date;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/metadata/internal/d;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         return-object v0
    */

}
