package com.google.android.gms.fitness.result

// Auto-emitted from smali.
// 4 fields, 13 methods.

open class SessionStopResult: com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val CM: com.google.android.gms.common.api.Status
    private val Ul: java.util.List

    constructor(versionCode: Int, status: com.google.android.gms.common.api.Status, p2: java.util.List)

    public constructor(status: com.google.android.gms.common.api.Status, p1: java.util.List)

    private fun b(p0: com.google.android.gms.fitness.result.SessionStopResult): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/result/SessionStopResult;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/SessionStopResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/Status;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->Ul:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/SessionStopResult;->Ul:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/result/SessionStopResult;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/result/SessionStopResult;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/result/SessionStopResult;->b(Lcom/google/android/gms/fitness/result/SessionStopResult;)Z
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

    public fun getSessions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/Session;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->Ul:Ljava/util/List;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->Ul:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "status"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "sessions"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/SessionStopResult;->Ul:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/result/g;->a(Lcom/google/android/gms/fitness/result/SessionStopResult;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun I(p0: com.google.android.gms.common.api.Status): com.google.android.gms.fitness.result.SessionStopResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/fitness/result/SessionStopResult;
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v1
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/result/SessionStopResult;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    //         return-object v0
    */

    }
}
