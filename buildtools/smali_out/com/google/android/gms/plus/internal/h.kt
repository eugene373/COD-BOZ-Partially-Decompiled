package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 11 fields, 19 methods.

open class h: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Dd: String
    private val alD: Array<String>
    private val alE: Array<String>
    private val alF: Array<String>
    private val alG: String
    private val alH: String
    private val alI: String
    private val alJ: String
    private val alK: com.google.android.gms.plus.internal.PlusCommonExtras

    constructor(p0: Int, p1: String, p2: Array<String>, p3: Array<String>, p4: Array<String>, p5: String, p6: String, p7: String, p8: String, p9: com.google.android.gms.plus.internal.PlusCommonExtras)

    public constructor(p0: String, p1: Array<String>, p2: Array<String>, p3: Array<String>, p4: String, p5: String, p6: String, p7: com.google.android.gms.plus.internal.PlusCommonExtras)

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
    //         instance-of v1, p1, Lcom/google/android/gms/plus/internal/h;
    //         if-nez v1, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/plus/internal/h;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget v1, p0, Lcom/google/android/gms/plus/internal/h;->BR:I
    //         iget v2, p1, Lcom/google/android/gms/plus/internal/h;->BR:I
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->Dd:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->Dd:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alD:[Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alD:[Ljava/lang/String;
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alE:[Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alE:[Ljava/lang/String;
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alF:[Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alF:[Ljava/lang/String;
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alG:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alG:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alH:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alH:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alI:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alI:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alJ:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alJ:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alK:Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         iget-object v2, p1, Lcom/google/android/gms/plus/internal/h;->alK:Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->Dd:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/plus/internal/h;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/16 v0, 0xa
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/plus/internal/h;->BR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->Dd:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alD:[Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alE:[Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alF:[Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alG:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alH:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alI:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x8
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alJ:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x9
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alK:Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun ng(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alD:[Ljava/lang/String;
    //         return-object v0
    */

    public fun nh(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alE:[Ljava/lang/String;
    //         return-object v0
    */

    public fun ni(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alF:[Ljava/lang/String;
    //         return-object v0
    */

    public fun nj(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alG:Ljava/lang/String;
    //         return-object v0
    */

    public fun nk(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alH:Ljava/lang/String;
    //         return-object v0
    */

    public fun nl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alI:Ljava/lang/String;
    //         return-object v0
    */

    public fun nm(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alJ:Ljava/lang/String;
    //         return-object v0
    */

    public fun nn(): com.google.android.gms.plus.internal.PlusCommonExtras { return TODO("body: ()Lcom/google/android/gms/plus/internal/PlusCommonExtras;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/h;->alK:Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         return-object v0
    */

    public fun no(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-class v1, Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/h;->alK:Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->o(Landroid/os/Bundle;)V
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "versionCode"
    //         iget v2, p0, Lcom/google/android/gms/plus/internal/h;->BR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "accountName"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->Dd:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "requestedScopes"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alD:[Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "visibleActivities"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alE:[Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "requiredFeatures"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alF:[Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "packageNameForAuth"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alG:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "callingPackageName"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alH:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "applicationName"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alI:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "extra"
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/h;->alK:Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         invoke-virtual {v2}, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/plus/internal/j;->a(Lcom/google/android/gms/plus/internal/h;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.plus.internal.j = null!!
    }
}
