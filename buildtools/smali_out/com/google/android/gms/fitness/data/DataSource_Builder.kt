package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 7 fields, 17 methods.

class DataSource_Builder {
    private var FD: Int
    private var SO: com.google.android.gms.fitness.data.Device
    private var SP: com.google.android.gms.fitness.data.a
    private var SQ: String
    private var SR: Boolean
    private var Sp: com.google.android.gms.fitness.data.DataType
    private var mName: String

    public constructor()

    public fun build(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Must set data type"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->FD:I
    //         if-ltz v0, :cond_1
    //         :goto_1
    //         const-string v0, "Must set data source type"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/DataSource;-><init>(Lcom/google/android/gms/fitness/data/DataSource$Builder;Lcom/google/android/gms/fitness/data/DataSource$1;)V
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    public fun setAppPackageName(appContext: android.content.Context): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setAppPackageName(packageName: String): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Lcom/google/android/gms/fitness/data/a;
    //         invoke-direct {v0, p1, v1, v1}, Lcom/google/android/gms/fitness/data/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SP:Lcom/google/android/gms/fitness/data/a;
    //         return-object p0
    */

    public fun setDataType(dataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object p0
    */

    public fun setDevice(device: com.google.android.gms.fitness.data.Device): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/Device;)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         return-object p0
    */

    public fun setName(name: String): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->mName:Ljava/lang/String;
    //         return-object p0
    */

    public fun setObfuscated(isObfuscated: Boolean): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (Z)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SR:Z
    //         return-object p0
    */

    public fun setStreamName(streamName: String): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Must specify a valid stream name"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SQ:Ljava/lang/String;
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setType(type: Int): com.google.android.gms.fitness.data.DataSource.Builder { return TODO("body: (I)Lcom/google/android/gms/fitness/data/DataSource$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->FD:I
    //         return-object p0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.data.DataSource.Builder): com.google.android.gms.fitness.data.DataType { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource$Builder;)Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.data.DataSource.Builder): Int { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->FD:I
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.data.DataSource.Builder): String { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->mName:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.fitness.data.DataSource.Builder): com.google.android.gms.fitness.data.Device { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource$Builder;)Lcom/google/android/gms/fitness/data/Device;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SO:Lcom/google/android/gms/fitness/data/Device;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.fitness.data.DataSource.Builder): com.google.android.gms.fitness.data.a { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource$Builder;)Lcom/google/android/gms/fitness/data/a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SP:Lcom/google/android/gms/fitness/data/a;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.fitness.data.DataSource.Builder): String { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SQ:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.fitness.data.DataSource.Builder): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource$Builder;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->SR:Z
    //         return v0
    */

    }
}
