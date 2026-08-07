package com.google.android.gms.common

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class b {
    companion object {
    private var If: java.util.Set
    private var Ig: java.util.Set
    @JvmField public val Ih: java.util.Comparator = null!!

    private @JvmStatic fun a(p0: Array<ByteArray>): java.util.Set { return TODO("body: ([[B)Ljava/util/Set;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([[B)",
    //                 "Ljava/util/Set",
    //                 "<[B>;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/TreeSet;
    //         sget-object v0, Lcom/google/android/gms/common/b;->Ih:Ljava/util/Comparator;
    //         invoke-direct {v1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V
    //         array-length v2, p0
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         aget-object v3, p0, v0
    //         invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    private @JvmStatic fun aP(p0: String): ByteArray { return TODO("body: (Ljava/lang/String;)[B") }
    /*
    //         .locals 2
    //         :try_start_0
    //         const-string v0, "ISO-8859-1"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/AssertionError;
    //         invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V
    //         throw v1
    */

    @JvmStatic fun fY(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<[B>;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/common/b;->If:Ljava/util/Set;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/b;->Ie:[[B
    //         invoke-static {v0}, Lcom/google/android/gms/common/b;->a([[B)Ljava/util/Set;
    //         move-result-object v0
    //         sput-object v0, Lcom/google/android/gms/common/b;->If:Ljava/util/Set;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/b;->If:Ljava/util/Set;
    //         return-object v0
    */

    @JvmStatic fun fZ(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<[B>;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/common/b;->Ig:Ljava/util/Set;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/b;->Id:[[B
    //         invoke-static {v0}, Lcom/google/android/gms/common/b;->a([[B)Ljava/util/Set;
    //         move-result-object v0
    //         sput-object v0, Lcom/google/android/gms/common/b;->Ig:Ljava/util/Set;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/b;->Ig:Ljava/util/Set;
    //         return-object v0
    */

    }
}
