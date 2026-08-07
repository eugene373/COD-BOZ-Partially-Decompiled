package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 0 fields, 12 methods.

class o {
    companion object {
    public @JvmStatic fun I(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun K(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun a(p0: Boolean, p1: Object) { /* TODO(body): (ZLjava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun a(p0: Boolean, p1: String, p2: Array<Object>) { /* TODO(body): (ZLjava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun aT(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         if-eq v0, v1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun aU(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun aZ(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Given String is empty or null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-object p0
    */

    public @JvmStatic fun b(p0: Object, p1: Object): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(TT;",
    //                 "Ljava/lang/Object;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-object p0
    */

    public @JvmStatic fun b(p0: String, p1: Object): String { return TODO("body: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-object p0
    */

    public @JvmStatic fun b(p0: Boolean, p1: Object) { /* TODO(body): (ZLjava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun b(p0: Boolean, p1: String, p2: Array<Object>) { /* TODO(body): (ZLjava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun i(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(TT;)TT;"
    //             }
    //         .end annotation
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         const-string v1, "null reference"
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-object p0
    */

    }
}
