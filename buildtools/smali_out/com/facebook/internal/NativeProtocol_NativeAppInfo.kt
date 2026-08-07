package com.facebook.internal

// Auto-emitted from smali source: NativeProtocol.java.
// 4 fields, 6 methods.

open class NativeProtocol_NativeAppInfo {
    private constructor()

    constructor(p0: com.facebook.internal.NativeProtocol.1)

    protected fun getPackage(): String

    public fun validateSignature(p0: android.content.Context, p1: String): Boolean { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Z") }
    /*
    //         .locals 7
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v3
    //         iget v3, v3, Landroid/content/pm/ApplicationInfo;->flags:I
    //         const-string v4, "generic"
    //         invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         and-int/lit8 v2, v3, 0x2
    //         if-eqz v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v2
    //         const/16 v3, 0x40
    //         invoke-virtual {v2, p2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v2
    //         iget-object v3, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    //         array-length v4, v3
    //         move v2, v1
    //         :goto_1
    //         if-ge v2, v4, :cond_2
    //         aget-object v5, v3, v2
    //         invoke-virtual {v5}, Landroid/content/pm/Signature;->toByteArray()[B
    //         move-result-object v5
    //         invoke-static {v5}, Lcom/facebook/internal/Utility;->sha1hash([B)Ljava/lang/String;
    //         move-result-object v5
    //         sget-object v6, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->validAppSignatureHashes:Ljava/util/HashSet;
    //         invoke-virtual {v6, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-nez v5, :cond_0
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    companion object {
    private val FBI_HASH: String = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc"
    private val FBL_HASH: String = "5e8f16062ea3cd2c4a0d547876baa6f38cabf625"
    private val FBR_HASH: String = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9"
    private val validAppSignatureHashes: java.util.HashSet = null!!

    private @JvmStatic fun buildAppSignatureHashes(): java.util.HashSet { return TODO("body: ()Ljava/util/HashSet;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/HashSet",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/HashSet;
    //         invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
    //         const-string v1, "8a3c4b262d721acd49a4bf97d5213199c86fa2b9"
    //         invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         const-string v1, "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc"
    //         invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         const-string v1, "5e8f16062ea3cd2c4a0d547876baa6f38cabf625"
    //         invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         return-object v0
    */

    }
}
