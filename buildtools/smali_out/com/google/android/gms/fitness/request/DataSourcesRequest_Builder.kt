package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 3 fields, 7 methods.

open class DataSourcesRequest_Builder {
    private var Ux: Boolean
    private var Uy: Array<com.google.android.gms.fitness.data.DataType>
    private var Uz: IntArray

    public constructor()

    public fun build(): com.google.android.gms.fitness.request.DataSourcesRequest { return TODO("body: ()Lcom/google/android/gms/fitness/request/DataSourcesRequest;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;
    //         array-length v0, v0
    //         if-lez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Must add at least one data type"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uz:[I
    //         array-length v0, v0
    //         if-lez v0, :cond_1
    //         :goto_1
    //         const-string v0, "Must add at least one data source type"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;Lcom/google/android/gms/fitness/request/DataSourcesRequest$1;)V
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    public fun setDataSourceTypes(dataSourceTypes: IntArray): com.google.android.gms.fitness.request.DataSourcesRequest.Builder { return TODO("body: ([I)Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uz:[I
    //         return-object p0
    */

    public fun setDataTypes(dataTypes: Array<com.google.android.gms.fitness.data.DataType>): com.google.android.gms.fitness.request.DataSourcesRequest.Builder { return TODO("body: ([Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;
    //         return-object p0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.DataSourcesRequest.Builder): Array<com.google.android.gms.fitness.data.DataType> { return TODO("body: (Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)[Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uy:[Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.request.DataSourcesRequest.Builder): IntArray { return TODO("body: (Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)[I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Uz:[I
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.request.DataSourcesRequest.Builder): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->Ux:Z
    //         return v0
    */

    }
}
