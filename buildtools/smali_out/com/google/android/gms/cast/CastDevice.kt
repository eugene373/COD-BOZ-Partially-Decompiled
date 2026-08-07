package com.google.android.gms.cast

// Auto-emitted from smali.
// 12 fields, 23 methods.

open class CastDevice: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var ER: String
    var ES: String
    private var ET: java.net.Inet4Address
    private var EU: String
    private var EV: String
    private var EW: String
    private var EX: Int
    private var EY: java.util.List
    private var EZ: Int
    private var Fa: Int

    private constructor()

    constructor(versionCode: Int, deviceId: String, hostAddress: String, friendlyName: String, modelName: String, deviceVersion: String, servicePort: Int, capabilities: java.util.List, status: Int, p9: Int)

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
    //         if-ne p1, p0, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/cast/CastDevice;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/cast/CastDevice;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getDeviceId()Ljava/lang/String;
    //         move-result-object v2
    //         if-nez v2, :cond_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/cast/CastDevice;->getDeviceId()Ljava/lang/String;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->ER:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->ER:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->ET:Ljava/net/Inet4Address;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->ET:Ljava/net/Inet4Address;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->EV:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->EV:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->EU:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->EU:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->EW:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->EW:Ljava/lang/String;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget v2, p0, Lcom/google/android/gms/cast/CastDevice;->EX:I
    //         iget v3, p1, Lcom/google/android/gms/cast/CastDevice;->EX:I
    //         if-ne v2, v3, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget v2, p0, Lcom/google/android/gms/cast/CastDevice;->EZ:I
    //         iget v3, p1, Lcom/google/android/gms/cast/CastDevice;->EZ:I
    //         if-ne v2, v3, :cond_4
    //         iget v2, p0, Lcom/google/android/gms/cast/CastDevice;->Fa:I
    //         iget v3, p1, Lcom/google/android/gms/cast/CastDevice;->Fa:I
    //         if-eq v2, v3, :cond_0
    //         :cond_4
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getCapabilities(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->EZ:I
    //         return v0
    */

    public fun getDeviceId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->ER:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDeviceVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EW:Ljava/lang/String;
    //         return-object v0
    */

    public fun getFriendlyName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EU:Ljava/lang/String;
    //         return-object v0
    */

    public fun getIcon(preferredWidth: Int, preferredHeight: Int): com.google.android.gms.common.images.WebImage { return TODO("body: (II)Lcom/google/android/gms/common/images/WebImage;") }
    /*
    //         .locals 9
    //         const/4 v7, 0x0
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         if-lez p1, :cond_1
    //         if-gtz p2, :cond_2
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/WebImage;
    //         move-object v1, v0
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         move-object v2, v1
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/WebImage;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->getWidth()I
    //         move-result v4
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->getHeight()I
    //         move-result v5
    //         if-lt v4, p1, :cond_4
    //         if-lt v5, p2, :cond_4
    //         if-eqz v2, :cond_3
    //         invoke-virtual {v2}, Lcom/google/android/gms/common/images/WebImage;->getWidth()I
    //         move-result v6
    //         if-le v6, v4, :cond_9
    //         invoke-virtual {v2}, Lcom/google/android/gms/common/images/WebImage;->getHeight()I
    //         move-result v4
    //         if-le v4, v5, :cond_9
    //         :cond_3
    //         move-object v8, v1
    //         move-object v1, v0
    //         move-object v0, v8
    //         :goto_2
    //         move-object v2, v1
    //         move-object v1, v0
    //         goto :goto_1
    //         :cond_4
    //         if-ge v4, p1, :cond_9
    //         if-ge v5, p2, :cond_9
    //         if-eqz v1, :cond_5
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/images/WebImage;->getWidth()I
    //         move-result v6
    //         if-ge v6, v4, :cond_9
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/images/WebImage;->getHeight()I
    //         move-result v4
    //         if-ge v4, v5, :cond_9
    //         :cond_5
    //         move-object v1, v2
    //         goto :goto_2
    //         :cond_6
    //         if-eqz v2, :cond_7
    //         :goto_3
    //         move-object v1, v2
    //         goto :goto_0
    //         :cond_7
    //         if-eqz v1, :cond_8
    //         move-object v2, v1
    //         goto :goto_3
    //         :cond_8
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/WebImage;
    //         move-object v2, v0
    //         goto :goto_3
    //         :cond_9
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto :goto_2
    */

    public fun getIcons(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/common/images/WebImage;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIpAddress(): java.net.Inet4Address { return TODO("body: ()Ljava/net/Inet4Address;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->ET:Ljava/net/Inet4Address;
    //         return-object v0
    */

    public fun getModelName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EV:Ljava/lang/String;
    //         return-object v0
    */

    public fun getServicePort(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->EX:I
    //         return v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->Fa:I
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/CastDevice;->BR:I
    //         return v0
    */

    public fun hasIcons(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->EY:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->ER:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/CastDevice;->ER:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun isSameDevice(castDevice: com.google.android.gms.cast.CastDevice): Boolean { return TODO("body: (Lcom/google/android/gms/cast/CastDevice;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getDeviceId()Ljava/lang/String;
    //         move-result-object v1
    //         if-nez v1, :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/cast/CastDevice;->getDeviceId()Ljava/lang/String;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getDeviceId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/cast/CastDevice;->getDeviceId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun putInBundle(bundle: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "com.google.android.gms.cast.EXTRA_CAST_DEVICE"
    //         invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "\"%s\" (%s)"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/cast/CastDevice;->EU:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/cast/CastDevice;->ER:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/b;->a(Lcom/google/android/gms/cast/CastDevice;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun getFromBundle(extras: android.os.Bundle): com.google.android.gms.cast.CastDevice { return TODO("body: (Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-class v0, Lcom/google/android/gms/cast/CastDevice;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         const-string v0, "com.google.android.gms.cast.EXTRA_CAST_DEVICE"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/cast/CastDevice;
    //         goto :goto_0
    */

    }
}
