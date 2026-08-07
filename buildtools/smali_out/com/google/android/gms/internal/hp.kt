package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class hp {
    companion object {
    private val Cm: Array<String> = null!!
    private val Cn: java.util.Map = null!!

    public @JvmStatic fun O(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         if-ltz p0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/hp;->Cm:[Ljava/lang/String;
    //         array-length v0, v0
    //         if-lt p0, v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/hp;->Cm:[Ljava/lang/String;
    //         aget-object v0, v0, p0
    //         goto :goto_0
    */

    public @JvmStatic fun as(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/internal/hp;->Cn:Ljava/util/Map;
    //         invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "["
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "] is not a valid global search section name"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun fl(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hp;->Cm:[Ljava/lang/String;
    //         array-length v0, v0
    //         return v0
    */

    }
}
