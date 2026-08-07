package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 2 fields, 6 methods.

open class aj_a {
    private var Sp: com.google.android.gms.fitness.data.DataType
    private var Sq: com.google.android.gms.fitness.data.DataSource

    public constructor()

    public fun d(p0: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.request.aj.a { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/aj$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/aj$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object p0
    */

    public fun d(p0: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.request.aj.a { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/aj$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/aj$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object p0
    */

    public fun jG(): com.google.android.gms.fitness.request.aj { return TODO("body: ()Lcom/google/android/gms/fitness/request/aj;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/aj$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/aj$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Cannot specify both dataType and dataSource"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/fitness/request/aj;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/aj;-><init>(Lcom/google/android/gms/fitness/request/aj$a;Lcom/google/android/gms/fitness/request/aj$1;)V
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.aj.a): com.google.android.gms.fitness.data.DataType { return TODO("body: (Lcom/google/android/gms/fitness/request/aj$a;)Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/aj$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.request.aj.a): com.google.android.gms.fitness.data.DataSource { return TODO("body: (Lcom/google/android/gms/fitness/request/aj$a;)Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/aj$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    }
}
