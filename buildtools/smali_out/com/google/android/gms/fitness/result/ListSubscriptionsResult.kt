package com.google.android.gms.fitness.result

// Auto-emitted from smali.
// 4 fields, 14 methods.

open class ListSubscriptionsResult: com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val CM: com.google.android.gms.common.api.Status
    private val UY: java.util.List

    constructor(versionCode: Int, status: java.util.List, p2: com.google.android.gms.common.api.Status)

    public constructor(status: java.util.List, p1: com.google.android.gms.common.api.Status)

    private fun b(p0: com.google.android.gms.fitness.result.ListSubscriptionsResult): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/Status;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->UY:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->UY:Ljava/util/List;
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

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->b(Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;)Z
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

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun getSubscriptions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/Subscription;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->UY:Ljava/util/List;
    //         return-object v0
    */

    public fun getSubscriptions(dataType: com.google.android.gms.fitness.data.DataType): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Ljava/util/List;") }
    /*
    //         .locals 4
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->UY:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/Subscription;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Subscription;->iY()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v3
    //         invoke-virtual {p1, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_1
    //         invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->UY:Ljava/util/List;
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
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "subscriptions"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;->UY:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/result/e;->a(Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun G(p0: com.google.android.gms.common.api.Status): com.google.android.gms.fitness.result.ListSubscriptionsResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p0}, Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;-><init>(Ljava/util/List;Lcom/google/android/gms/common/api/Status;)V
    //         return-object v0
    */

    }
}
