package com.google.android.gms.internal

// Auto-emitted from smali.
// 9 fields, 7 methods.

class hq_a {
    private val CA: java.util.List
    private var CB: java.util.BitSet
    private var CC: String
    private var Cv: String
    private var Cw: Boolean
    private var Cx: Int
    private var Cy: Boolean
    private var Cz: String
    private val mName: String

    public constructor(p0: String)

    public fun E(p0: Boolean): com.google.android.gms.internal.hq.a { return TODO("body: (Z)Lcom/google/android/gms/internal/hq$a;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/hq$a;->Cw:Z
    //         return-object p0
    */

    public fun F(p0: Boolean): com.google.android.gms.internal.hq.a { return TODO("body: (Z)Lcom/google/android/gms/internal/hq$a;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/hq$a;->Cy:Z
    //         return-object p0
    */

    public fun P(p0: Int): com.google.android.gms.internal.hq.a { return TODO("body: (I)Lcom/google/android/gms/internal/hq$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hq$a;->CB:Ljava/util/BitSet;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/BitSet;
    //         invoke-direct {v0}, Ljava/util/BitSet;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/hq$a;->CB:Ljava/util/BitSet;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hq$a;->CB:Ljava/util/BitSet;
    //         invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V
    //         return-object p0
    */

    public fun at(p0: String): com.google.android.gms.internal.hq.a { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/internal/hq$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/hq$a;->Cv:Ljava/lang/String;
    //         return-object p0
    */

    public fun au(p0: String): com.google.android.gms.internal.hq.a { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/internal/hq$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/hq$a;->CC:Ljava/lang/String;
    //         return-object p0
    */

    public fun fm(): com.google.android.gms.internal.hq { return TODO("body: ()Lcom/google/android/gms/internal/hq;") }
    /*
    //         .locals 10
    //         const/4 v1, 0x0
    //         const/4 v8, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hq$a;->CB:Ljava/util/BitSet;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hq$a;->CB:Ljava/util/BitSet;
    //         invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I
    //         move-result v0
    //         new-array v8, v0, [I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hq$a;->CB:Ljava/util/BitSet;
    //         invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I
    //         move-result v0
    //         :goto_0
    //         if-ltz v0, :cond_0
    //         add-int/lit8 v2, v1, 0x1
    //         aput v0, v8, v1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/hq$a;->CB:Ljava/util/BitSet;
    //         add-int/lit8 v0, v0, 0x1
    //         invoke-virtual {v1, v0}, Ljava/util/BitSet;->nextSetBit(I)I
    //         move-result v0
    //         move v1, v2
    //         goto :goto_0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/hq;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/hq$a;->mName:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/hq$a;->Cv:Ljava/lang/String;
    //         iget-boolean v3, p0, Lcom/google/android/gms/internal/hq$a;->Cw:Z
    //         iget v4, p0, Lcom/google/android/gms/internal/hq$a;->Cx:I
    //         iget-boolean v5, p0, Lcom/google/android/gms/internal/hq$a;->Cy:Z
    //         iget-object v6, p0, Lcom/google/android/gms/internal/hq$a;->Cz:Ljava/lang/String;
    //         iget-object v7, p0, Lcom/google/android/gms/internal/hq$a;->CA:Ljava/util/List;
    //         iget-object v9, p0, Lcom/google/android/gms/internal/hq$a;->CA:Ljava/util/List;
    //         invoke-interface {v9}, Ljava/util/List;->size()I
    //         move-result v9
    //         new-array v9, v9, [Lcom/google/android/gms/internal/hk;
    //         invoke-interface {v7, v9}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v7
    //         check-cast v7, [Lcom/google/android/gms/internal/hk;
    //         iget-object v9, p0, Lcom/google/android/gms/internal/hq$a;->CC:Ljava/lang/String;
    //         invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/hq;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/String;[Lcom/google/android/gms/internal/hk;[ILjava/lang/String;)V
    //         return-object v0
    */

}
