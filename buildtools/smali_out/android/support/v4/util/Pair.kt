package android.support.v4.util

// Auto-emitted from smali source: Pair.java.
// 2 fields, 5 methods.

open class Pair {
    public val first: Object
    public val second: Object

    public constructor(p0: Object, p1: Object)

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         .local p0, "this":Landroid/support/v4/util/Pair;, "Landroid/support/v4/util/Pair<TF;TS;>;"
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Landroid/support/v4/util/Pair;
    //         if-nez v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         move-object v0, p1
    //         check-cast v0, Landroid/support/v4/util/Pair;
    //         .local v0, "p":Landroid/support/v4/util/Pair;, "Landroid/support/v4/util/Pair<**>;"
    //         iget-object v2, v0, Landroid/support/v4/util/Pair;->first:Ljava/lang/Object;
    //         iget-object v3, p0, Landroid/support/v4/util/Pair;->first:Ljava/lang/Object;
    //         invoke-static {v2, v3}, Landroid/support/v4/util/Pair;->objectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget-object v2, v0, Landroid/support/v4/util/Pair;->second:Ljava/lang/Object;
    //         iget-object v3, p0, Landroid/support/v4/util/Pair;->second:Ljava/lang/Object;
    //         invoke-static {v2, v3}, Landroid/support/v4/util/Pair;->objectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         const/4 v1, 0x1
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/util/Pair;, "Landroid/support/v4/util/Pair<TF;TS;>;"
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Landroid/support/v4/util/Pair;->first:Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         iget-object v2, p0, Landroid/support/v4/util/Pair;->second:Ljava/lang/Object;
    //         if-nez v2, :cond_1
    //         :goto_1
    //         xor-int/2addr v0, v1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/Pair;->first:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/util/Pair;->second:Ljava/lang/Object;
    //         invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
    //         move-result v1
    //         goto :goto_1
    */

    companion object {
    public @JvmStatic fun create(p0: Object, p1: Object): android.support.v4.util.Pair { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Landroid/support/v4/util/Pair;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<A:",
    //                 "Ljava/lang/Object;",
    //                 "B:",
    //                 "Ljava/lang/Object;",
    //                 ">(TA;TB;)",
    //                 "Landroid/support/v4/util/Pair",
    //                 "<TA;TB;>;"
    //             }
    //         .end annotation
    //         .local p0, "a":Ljava/lang/Object;, "TA;"
    //         .local p1, "b":Ljava/lang/Object;, "TB;"
    //         new-instance v0, Landroid/support/v4/util/Pair;
    //         invoke-direct {v0, p0, p1}, Landroid/support/v4/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-object v0
    */

    private @JvmStatic fun objectsEqual(a: Object, b: Object): Boolean { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         if-eqz p0, :cond_1
    //         invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
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
