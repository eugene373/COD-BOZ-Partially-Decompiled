package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 3 fields, 9 methods.

open class StartBleScanRequest_Builder {
    private var UQ: com.google.android.gms.fitness.request.l
    private var UR: Int
    private var Uy: Array<com.google.android.gms.fitness.data.DataType>

    public constructor()

    public fun a(p0: com.google.android.gms.fitness.request.l): com.google.android.gms.fitness.request.StartBleScanRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/request/l;)Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->UQ:Lcom/google/android/gms/fitness/request/l;
    //         return-object p0
    */

    public fun build(): com.google.android.gms.fitness.request.StartBleScanRequest { return TODO("body: ()Lcom/google/android/gms/fitness/request/StartBleScanRequest;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->UQ:Lcom/google/android/gms/fitness/request/l;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Must set BleScanCallback"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/StartBleScanRequest;-><init>(Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;Lcom/google/android/gms/fitness/request/StartBleScanRequest$1;)V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setBleScanCallback(bleScanCallback: com.google.android.gms.fitness.request.BleScanCallback): com.google.android.gms.fitness.request.StartBleScanRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/request/BleScanCallback;)Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/fitness/request/a$a;->je()Lcom/google/android/gms/fitness/request/a$a;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/request/a$a;->a(Lcom/google/android/gms/fitness/request/BleScanCallback;)Lcom/google/android/gms/fitness/request/a;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->a(Lcom/google/android/gms/fitness/request/l;)Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;
    //         return-object p0
    */

    public fun setDataTypes(dataTypes: Array<com.google.android.gms.fitness.data.DataType>): com.google.android.gms.fitness.request.StartBleScanRequest.Builder { return TODO("body: ([Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;
    //         return-object p0
    */

    public fun setTimeoutSecs(stopTimeSecs: Int): com.google.android.gms.fitness.request.StartBleScanRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-lez p1, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Stop time must be greater than zero"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const/16 v0, 0x3c
    //         if-gt p1, v0, :cond_1
    //         :goto_1
    //         const-string v0, "Stop time must be less than 1 minute"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput p1, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->UR:I
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.StartBleScanRequest.Builder): Array<com.google.android.gms.fitness.data.DataType> { return TODO("body: (Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;)[Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.request.StartBleScanRequest.Builder): com.google.android.gms.fitness.request.l { return TODO("body: (Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;)Lcom/google/android/gms/fitness/request/l;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->UQ:Lcom/google/android/gms/fitness/request/l;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.request.StartBleScanRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest$Builder;->UR:I
    //         return v0
    */

    }
}
