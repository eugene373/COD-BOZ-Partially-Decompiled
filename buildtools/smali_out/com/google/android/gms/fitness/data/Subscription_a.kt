package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 4 fields, 8 methods.

open class Subscription_a {
    private var Sp: com.google.android.gms.fitness.data.DataType
    private var Sq: com.google.android.gms.fitness.data.DataSource
    private var Tt: Long
    private var Tu: Int

    public constructor()

    public fun b(p0: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.data.Subscription.a { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/Subscription$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object p0
    */

    public fun b(p0: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.data.Subscription.a { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/Subscription$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object p0
    */

    public fun iZ(): com.google.android.gms.fitness.data.Subscription { return TODO("body: ()Lcom/google/android/gms/fitness/data/Subscription;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         if-eqz v0, :cond_3
    //         :cond_0
    //         move v0, v2
    //         :goto_0
    //         const-string v3, "Must call setDataSource() or setDataType()"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_1
    //         move v1, v2
    //         :cond_2
    //         const-string v0, "Specified data type is incompatible with specified data source"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/data/Subscription;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/Subscription;-><init>(Lcom/google/android/gms/fitness/data/Subscription$a;Lcom/google/android/gms/fitness/data/Subscription$1;)V
    //         return-object v0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.data.Subscription.a): com.google.android.gms.fitness.data.DataType { return TODO("body: (Lcom/google/android/gms/fitness/data/Subscription$a;)Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.data.Subscription.a): com.google.android.gms.fitness.data.DataSource { return TODO("body: (Lcom/google/android/gms/fitness/data/Subscription$a;)Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.data.Subscription.a): Long { return TODO("body: (Lcom/google/android/gms/fitness/data/Subscription$a;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Tt:J
    //         return-wide v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.fitness.data.Subscription.a): Int { return TODO("body: (Lcom/google/android/gms/fitness/data/Subscription$a;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription$a;->Tu:I
    //         return v0
    */

    }
}
