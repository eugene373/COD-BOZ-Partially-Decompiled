package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 12 fields, 8 methods.

open class Operator: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val mTag: String

    constructor(versionCode: Int, tag: String)

    private constructor(tag: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         if-nez p1, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         if-eq v2, v3, :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         check-cast p1, Lcom/google/android/gms/drive/query/internal/Operator;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/Operator;->mTag:Ljava/lang/String;
    //         if-nez v2, :cond_4
    //         iget-object v2, p1, Lcom/google/android/gms/drive/query/internal/Operator;->mTag:Ljava/lang/String;
    //         if-eqz v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/Operator;->mTag:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/drive/query/internal/Operator;->mTag:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getTag(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/Operator;->mTag:Ljava/lang/String;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/Operator;->mTag:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         add-int/lit8 v0, v0, 0x1f
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/Operator;->mTag:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/l;->a(Lcom/google/android/gms/drive/query/internal/Operator;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val QZ: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Ra: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Rb: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Rc: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Rd: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Re: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Rf: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Rg: com.google.android.gms.drive.query.internal.Operator = null!!
    @JvmField public val Rh: com.google.android.gms.drive.query.internal.Operator = null!!
    }
}
