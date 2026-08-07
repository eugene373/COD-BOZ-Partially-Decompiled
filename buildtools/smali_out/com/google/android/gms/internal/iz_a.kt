package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

class iz_a {
    public val Lp: Int
    public val Lq: Int

    public constructor(p0: Int, p1: Int)

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/internal/iz$a;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/iz$a;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget v2, p1, Lcom/google/android/gms/internal/iz$a;->Lp:I
    //         iget v3, p0, Lcom/google/android/gms/internal/iz$a;->Lp:I
    //         if-ne v2, v3, :cond_2
    //         iget v2, p1, Lcom/google/android/gms/internal/iz$a;->Lq:I
    //         iget v3, p0, Lcom/google/android/gms/internal/iz$a;->Lq:I
    //         if-eq v2, v3, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/internal/iz$a;->Lp:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/internal/iz$a;->Lq:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

}
