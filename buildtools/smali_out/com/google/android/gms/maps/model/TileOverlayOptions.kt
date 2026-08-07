package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 7 fields, 16 methods.

class TileOverlayOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var ajL: Float
    private var ajM: Boolean
    private var akr: com.google.android.gms.maps.model.internal.i
    private var aks: com.google.android.gms.maps.model.TileProvider
    private var akt: Boolean

    public constructor()

    constructor(versionCode: Int, delegate: android.os.IBinder, visible: Boolean, zIndex: Float, fadeIn: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun fadeIn(fadeIn: Boolean): com.google.android.gms.maps.model.TileOverlayOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/TileOverlayOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->akt:Z
    //         return-object p0
    */

    public fun getFadeIn(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->akt:Z
    //         return v0
    */

    public fun getTileProvider(): com.google.android.gms.maps.model.TileProvider { return TODO("body: ()Lcom/google/android/gms/maps/model/TileProvider;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->aks:Lcom/google/android/gms/maps/model/TileProvider;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->BR:I
    //         return v0
    */

    public fun getZIndex(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->ajL:F
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->ajM:Z
    //         return v0
    */

    fun mR(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->akr:Lcom/google/android/gms/maps/model/internal/i;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/i;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun tileProvider(tileProvider: com.google.android.gms.maps.model.TileProvider): com.google.android.gms.maps.model.TileOverlayOptions { return TODO("body: (Lcom/google/android/gms/maps/model/TileProvider;)Lcom/google/android/gms/maps/model/TileOverlayOptions;") }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->aks:Lcom/google/android/gms/maps/model/TileProvider;
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->aks:Lcom/google/android/gms/maps/model/TileProvider;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->akr:Lcom/google/android/gms/maps/model/internal/i;
    //         return-object p0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;-><init>(Lcom/google/android/gms/maps/model/TileOverlayOptions;Lcom/google/android/gms/maps/model/TileProvider;)V
    //         goto :goto_0
    */

    public fun visible(visible: Boolean): com.google.android.gms.maps.model.TileOverlayOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/TileOverlayOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->ajM:Z
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/x;->a(Lcom/google/android/gms/maps/model/TileOverlayOptions;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/w;->a(Lcom/google/android/gms/maps/model/TileOverlayOptions;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    public fun zIndex(zIndex: Float): com.google.android.gms.maps.model.TileOverlayOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/TileOverlayOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->ajL:F
    //         return-object p0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.w = null!!

    @JvmStatic fun a(p0: com.google.android.gms.maps.model.TileOverlayOptions): com.google.android.gms.maps.model.internal.i { return TODO("body: (Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/internal/i;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->akr:Lcom/google/android/gms/maps/model/internal/i;
    //         return-object v0
    */

    }
}
