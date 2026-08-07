package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 5 fields, 12 methods.

open class PlusCommonExtras: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var alA: String
    private var alB: String

    public constructor()

    constructor(versionCode: Int, gpsrc: String, clientCallingPackage: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         if-nez v1, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget v1, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->BR:I
    //         iget v2, p1, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->BR:I
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alA:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alA:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alB:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alB:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->BR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alA:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alB:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun ne(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alA:Ljava/lang/String;
    //         return-object v0
    */

    public fun nf(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alB:Ljava/lang/String;
    //         return-object v0
    */

    public fun o(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "android.gms.plus.internal.PlusCommonExtras.extraPlusCommon"
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;)[B
    //         move-result-object v1
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "versionCode"
    //         iget v2, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->BR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Gpsrc"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alA:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ClientCallingPackage"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->alB:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/plus/internal/f;->a(Lcom/google/android/gms/plus/internal/PlusCommonExtras;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.plus.internal.f = null!!
    @JvmField public var TAG: String
    }
}
