package com.google.android.gms.internal

// Auto-emitted from smali.
// 9 fields, 11 methods.

open class ma: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var UI: com.google.android.gms.location.LocationRequest
    var afi: Boolean
    var afj: Boolean
    var afk: Boolean
    var afl: java.util.List
    val mTag: String

    constructor(p0: Int, p1: com.google.android.gms.location.LocationRequest, p2: Boolean, p3: Boolean, p4: Boolean, p5: java.util.List, p6: String)

    private constructor(p0: String, p1: com.google.android.gms.location.LocationRequest)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/internal/ma;
    //         if-nez v1, :cond_1
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/internal/ma;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ma;->UI:Lcom/google/android/gms/location/LocationRequest;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/ma;->UI:Lcom/google/android/gms/location/LocationRequest;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/ma;->afi:Z
    //         iget-boolean v2, p1, Lcom/google/android/gms/internal/ma;->afi:Z
    //         if-ne v1, v2, :cond_0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/ma;->afj:Z
    //         iget-boolean v2, p1, Lcom/google/android/gms/internal/ma;->afj:Z
    //         if-ne v1, v2, :cond_0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/ma;->afk:Z
    //         iget-boolean v2, p1, Lcom/google/android/gms/internal/ma;->afk:Z
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ma;->afl:Ljava/util/List;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/ma;->afl:Ljava/util/List;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/ma;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ma;->UI:Lcom/google/android/gms/location/LocationRequest;
    //         invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ma;->UI:Lcom/google/android/gms/location/LocationRequest;
    //         invoke-virtual {v1}, Lcom/google/android/gms/location/LocationRequest;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, " requestNlpDebugInfo="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/ma;->afi:Z
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v1, " restorePendingIntentListeners="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/ma;->afj:Z
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v1, " triggerUpdate="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/ma;->afk:Z
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         const-string v1, " clients="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ma;->afl:Ljava/util/List;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ma;->mTag:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         const-string v1, " tag="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ma;->mTag:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/mb;->a(Lcom/google/android/gms/internal/ma;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.mb = null!!
    val afh: java.util.List = null!!

    public @JvmStatic fun a(p0: String, p1: com.google.android.gms.location.LocationRequest): com.google.android.gms.internal.ma { return TODO("body: (Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/ma;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ma;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ma;-><init>(Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)V
    //         return-object v0
    */

    public @JvmStatic fun b(p0: com.google.android.gms.location.LocationRequest): com.google.android.gms.internal.ma { return TODO("body: (Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/ma;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {v0, p0}, Lcom/google/android/gms/internal/ma;->a(Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/ma;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
