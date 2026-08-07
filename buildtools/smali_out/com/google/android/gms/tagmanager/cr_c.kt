package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class cr_c {
    private val Sx: String
    private val aqF: java.util.List
    private val aqG: java.util.Map
    private val aqH: Int

    private constructor(p0: java.util.List, p1: java.util.Map, p2: String, p3: Int)

    constructor(p0: java.util.List, p1: java.util.Map, p2: String, p3: Int, p4: com.google.android.gms.tagmanager.cr.1)

    public fun getVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/cr$c;->Sx:Ljava/lang/String;
    //         return-object v0
    */

    public fun oY(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/tagmanager/cr$e;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/cr$c;->aqF:Ljava/util/List;
    //         return-object v0
    */

    public fun oZ(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/tagmanager/cr$a;",
    //                 ">;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/cr$c;->aqG:Ljava/util/Map;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Rules: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/cr$c;->oY()Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "  Macros: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/cr$c;->aqG:Ljava/util/Map;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun oX(): com.google.android.gms.tagmanager.cr.d { return TODO("body: ()Lcom/google/android/gms/tagmanager/cr$d;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/tagmanager/cr$d;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/tagmanager/cr$d;-><init>(Lcom/google/android/gms/tagmanager/cr$1;)V
    //         return-object v0
    */

    }
}
