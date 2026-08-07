package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 14 fields, 29 methods.

class Device: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val FD: Int
    private val SZ: String
    private val Sx: String
    private val Ta: String
    private val Tb: String
    private val Tc: Int

    constructor(versionCode: Int, manufacturer: String, model: String, version: String, uid: String, type: Int, platformType: Int)

    public constructor(manufacturer: String, model: String, uid: String, type: Int)

    public constructor(manufacturer: String, model: String, version: String, uid: String, type: Int)

    public constructor(manufacturer: String, model: String, version: String, uid: String, type: Int, platformType: Int)

    private fun a(p0: com.google.android.gms.fitness.data.Device): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/Device;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->SZ:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Device;->SZ:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Ta:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Device;->Ta:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Sx:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Device;->Sx:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Device;->FD:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Device;->FD:I
    //         if-ne v0, v1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Device;->Tc:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Device;->Tc:I
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun iS(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/Device;->iR()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/Device;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/Device;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Device;->a(Lcom/google/android/gms/fitness/data/Device;)Z
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

    public fun getManufacturer(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->SZ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getModel(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Ta:Ljava/lang/String;
    //         return-object v0
    */

    fun getStreamIdentifier(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "%s:%s:%s"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/Device;->SZ:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/Device;->Ta:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Device;->FD:I
    //         return v0
    */

    public fun getUid(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Sx:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Device;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x5
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Device;->SZ:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Device;->Ta:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Device;->Sx:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Device;->FD:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iR(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Device;->Tc:I
    //         return v0
    */

    fun iT(): com.google.android.gms.fitness.data.Device { return TODO("body: ()Lcom/google/android/gms/fitness/data/Device;") }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/google/android/gms/fitness/data/Device;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/Device;->SZ:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Device;->Ta:Ljava/lang/String;
    //         invoke-static {v2}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/Device;->Sx:Ljava/lang/String;
    //         invoke-static {v3}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         iget v5, p0, Lcom/google/android/gms/fitness/data/Device;->FD:I
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/fitness/data/Device;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //         return-object v0
    */

    public fun iU(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/kw;->jc()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/fitness/data/Device;->iS()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Device;->Tb:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "Device{%s:%s:%s:%s}"
    //         const/4 v1, 0x4
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/Device;->getStreamIdentifier()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/Device;->Sx:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget v3, p0, Lcom/google/android/gms/fitness/data/Device;->FD:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         iget v3, p0, Lcom/google/android/gms/fitness/data/Device;->Tc:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/i;->a(Lcom/google/android/gms/fitness/data/Device;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val TYPE_CHEST_STRAP: Int = 0x4
    @JvmField public val TYPE_PHONE: Int = 0x1
    @JvmField public val TYPE_SCALE: Int = 0x5
    @JvmField public val TYPE_TABLET: Int = 0x2
    @JvmField public val TYPE_UNKNOWN: Int = 0x0
    @JvmField public val TYPE_WATCH: Int = 0x3

    private @JvmStatic fun M(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         const-string v1, "android_id"
    //         invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun N(p0: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-static {p0}, Lcom/google/android/gms/fitness/data/Device;->P(Landroid/content/Context;)I
    //         move-result v1
    //         packed-switch v1, :pswitch_data_0
    //         invoke-static {p0}, Lcom/google/android/gms/fitness/data/Device;->R(Landroid/content/Context;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         :cond_0
    //         :goto_0
    //         :pswitch_0
    //         return v0
    //         :pswitch_1
    //         invoke-static {p0}, Lcom/google/android/gms/fitness/data/Device;->O(Landroid/content/Context;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x8
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public @JvmStatic fun O(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
    //         move-result-object v0
    //         iget v0, v0, Landroid/content/res/Configuration;->uiMode:I
    //         and-int/lit8 v0, v0, 0xf
    //         const/4 v1, 0x6
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun P(p0: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/fitness/data/Device;->Q(Landroid/content/Context;)I
    //         move-result v0
    //         rem-int/lit16 v0, v0, 0x3e8
    //         div-int/lit8 v0, v0, 0x64
    //         add-int/lit8 v0, v0, 0x5
    //         return v0
    */

    private @JvmStatic fun Q(p0: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 3
    //         :try_start_0
    //         const-string v0, "com.google.android.gms"
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v0
    //         iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "Fitness"
    //         const-string v1, "Could not find package info for Google Play Services"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    private @JvmStatic fun R(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "phone"
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/telephony/TelephonyManager;
    //         invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneType()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun getLocalDevice(context: android.content.Context): com.google.android.gms.fitness.data.Device { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/fitness/data/Device;") }
    /*
    //         .locals 7
    //         invoke-static {p0}, Lcom/google/android/gms/fitness/data/Device;->N(Landroid/content/Context;)I
    //         move-result v5
    //         invoke-static {p0}, Lcom/google/android/gms/fitness/data/Device;->M(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v4
    //         new-instance v0, Lcom/google/android/gms/fitness/data/Device;
    //         sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
    //         sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
    //         sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
    //         const/4 v6, 0x2
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/fitness/data/Device;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    //         return-object v0
    */

    }
}
