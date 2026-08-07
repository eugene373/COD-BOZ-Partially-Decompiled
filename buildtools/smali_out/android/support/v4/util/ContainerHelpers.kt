package android.support.v4.util

// Auto-emitted from smali source: ContainerHelpers.java.
// 3 fields, 8 methods.

open class ContainerHelpers {
    constructor()

    companion object {
    val EMPTY_INTS: IntArray = null!!
    val EMPTY_LONGS: LongArray = null!!
    val EMPTY_OBJECTS: Array<Object> = null!!

    @JvmStatic fun binarySearch(array: IntArray, size: Int, value: Int): Int { return TODO("body: ([III)I") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         .local v1, "lo":I
    //         add-int/lit8 v0, p1, -0x1
    //         .local v0, "hi":I
    //         :goto_0
    //         if-gt v1, v0, :cond_1
    //         add-int v4, v1, v0
    //         ushr-int/lit8 v2, v4, 0x1
    //         .local v2, "mid":I
    //         aget v3, p0, v2
    //         .local v3, "midVal":I
    //         if-ge v3, p2, :cond_0
    //         add-int/lit8 v1, v2, 0x1
    //         goto :goto_0
    //         :cond_0
    //         if-le v3, p2, :cond_2
    //         add-int/lit8 v0, v2, -0x1
    //         goto :goto_0
    //         .end local v2    # "mid":I
    //         .end local v3    # "midVal":I
    //         :cond_1
    //         xor-int/lit8 v2, v1, -0x1
    //         :cond_2
    //         return v2
    */

    @JvmStatic fun binarySearch(array: LongArray, size: Int, value: Long): Int { return TODO("body: ([JIJ)I") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         .local v1, "lo":I
    //         add-int/lit8 v0, p1, -0x1
    //         .local v0, "hi":I
    //         :goto_0
    //         if-gt v1, v0, :cond_1
    //         add-int v3, v1, v0
    //         ushr-int/lit8 v2, v3, 0x1
    //         .local v2, "mid":I
    //         aget-wide v4, p0, v2
    //         .local v4, "midVal":J
    //         cmp-long v3, v4, p2
    //         if-gez v3, :cond_0
    //         add-int/lit8 v1, v2, 0x1
    //         goto :goto_0
    //         :cond_0
    //         cmp-long v3, v4, p2
    //         if-lez v3, :cond_2
    //         add-int/lit8 v0, v2, -0x1
    //         goto :goto_0
    //         .end local v2    # "mid":I
    //         .end local v4    # "midVal":J
    //         :cond_1
    //         xor-int/lit8 v2, v1, -0x1
    //         :cond_2
    //         return v2
    */

    public @JvmStatic fun equal(a: Object, b: Object): Boolean { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Z") }
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

    public @JvmStatic fun idealByteArraySize(need: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         const/4 v0, 0x4
    //         .local v0, "i":I
    //         :goto_0
    //         const/16 v1, 0x20
    //         if-ge v0, v1, :cond_0
    //         shl-int v1, v2, v0
    //         add-int/lit8 v1, v1, -0xc
    //         if-gt p0, v1, :cond_1
    //         shl-int v1, v2, v0
    //         add-int/lit8 p0, v1, -0xc
    //         .end local p0    # "need":I
    //         :cond_0
    //         return p0
    //         .restart local p0    # "need":I
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    public @JvmStatic fun idealIntArraySize(need: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         mul-int/lit8 v0, p0, 0x4
    //         invoke-static {v0}, Landroid/support/v4/util/ContainerHelpers;->idealByteArraySize(I)I
    //         move-result v0
    //         div-int/lit8 v0, v0, 0x4
    //         return v0
    */

    public @JvmStatic fun idealLongArraySize(need: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         mul-int/lit8 v0, p0, 0x8
    //         invoke-static {v0}, Landroid/support/v4/util/ContainerHelpers;->idealByteArraySize(I)I
    //         move-result v0
    //         div-int/lit8 v0, v0, 0x8
    //         return v0
    */

    }
}
