package com.google.android.gms.internal

// Auto-emitted from smali.
// 10 fields, 11 methods.

open class fv {
    private var tc: Int
    private val uJ: java.util.List
    private val uK: java.util.List
    private val uL: String
    private val uM: String
    private val uN: String
    private val uO: String
    private val uP: Boolean
    private val uQ: Int
    private var uR: String

    public constructor(p0: Int, p1: java.util.Map)

    private fun J(p0: String): java.util.List { return TODO("body: (Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, ","
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_0
    */

    private fun parseInt(i: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         goto :goto_0
    */

    public fun cL(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fv;->uJ:Ljava/util/List;
    //         return-object v0
    */

    public fun cM(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fv;->uN:Ljava/lang/String;
    //         return-object v0
    */

    public fun cN(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/fv;->uP:Z
    //         return v0
    */

    public fun getErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/fv;->tc:I
    //         return v0
    */

    public fun getType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fv;->uO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fv;->uR:Ljava/lang/String;
    //         return-object v0
    */

    public fun setUrl(url: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/fv;->uR:Ljava/lang/String;
    //         return-void
    */

    companion object {
    private @JvmStatic fun parseBoolean(bool: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_1
    //         const-string v0, "1"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "true"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
