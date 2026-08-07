package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 13 methods.

open class ip {
    private var GY: Boolean
    private var GZ: Boolean
    private var Ha: String
    private val mTag: String

    public constructor(p0: String)

    public constructor(p0: String, p1: Boolean)

    private fun e(p0: String, p1: Array<Object>): String { return TODO("body: (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         array-length v0, p2
    //         if-nez v0, :cond_1
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ip;->Ha:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ip;->Ha:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p1
    //         :cond_0
    //         return-object p1
    //         :cond_1
    //         invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object p1
    //         goto :goto_0
    */

    public fun a(p0: String, p1: Array<Object>) { /* TODO(body): (Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ip;->fR()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ip;->mTag:Ljava/lang/String;
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ip;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

    public fun a(p0: Throwable, p1: String, p2: Array<Object>) { /* TODO(body): (Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ip;->fQ()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-boolean v0, Lcom/google/android/gms/internal/ip;->GX:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ip;->mTag:Ljava/lang/String;
    //         invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ip;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :cond_1
    //         return-void
    */

    public fun aK(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ip;->Ha:Ljava/lang/String;
    //         return-void
    //         :cond_0
    //         const-string v0, "[%s] "
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun b(p0: String, p1: Array<Object>) { /* TODO(body): (Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ip;->fQ()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-boolean v0, Lcom/google/android/gms/internal/ip;->GX:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ip;->mTag:Ljava/lang/String;
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ip;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_1
    //         return-void
    */

    public fun c(p0: String, p1: Array<Object>) { /* TODO(body): (Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ip;->mTag:Ljava/lang/String;
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ip;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun d(p0: String, p1: Array<Object>) { /* TODO(body): (Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ip;->mTag:Ljava/lang/String;
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ip;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun fQ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ip;->GY:Z
    //         return v0
    */

    public fun fR(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ip;->GZ:Z
    //         return v0
    */

    companion object {
    private var GX: Boolean

    public @JvmStatic fun fS(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-boolean v0, Lcom/google/android/gms/internal/ip;->GX:Z
    //         return v0
    */

    }
}
