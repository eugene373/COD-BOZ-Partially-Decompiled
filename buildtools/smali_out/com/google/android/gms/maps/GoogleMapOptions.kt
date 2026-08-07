package com.google.android.gms.maps

// Auto-emitted from smali.
// 12 fields, 35 methods.

class GoogleMapOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var aiG: Boolean
    private var aiH: Boolean
    private var aiI: Int
    private var aiJ: com.google.android.gms.maps.model.CameraPosition
    private var aiK: Boolean
    private var aiL: Boolean
    private var aiM: Boolean
    private var aiN: Boolean
    private var aiO: Boolean
    private var aiP: Boolean

    public constructor()

    constructor(versionCode: Int, zOrderOnTop: Byte, useViewLifecycleInFragment: Byte, mapType: Int, camera: com.google.android.gms.maps.model.CameraPosition, zoomControlsEnabled: Byte, compassEnabled: Byte, scrollGesturesEnabled: Byte, zoomGesturesEnabled: Byte, tiltGesturesEnabled: Byte, rotateGesturesEnabled: Byte)

    public fun camera(camera: com.google.android.gms.maps.model.CameraPosition): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiJ:Lcom/google/android/gms/maps/model/CameraPosition;
    //         return-object p0
    */

    public fun compassEnabled(enabled: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiL:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCamera(): com.google.android.gms.maps.model.CameraPosition { return TODO("body: ()Lcom/google/android/gms/maps/model/CameraPosition;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiJ:Lcom/google/android/gms/maps/model/CameraPosition;
    //         return-object v0
    */

    public fun getCompassEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiL:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getMapType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiI:I
    //         return v0
    */

    public fun getRotateGesturesEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiP:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getScrollGesturesEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiM:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getTiltGesturesEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiO:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getUseViewLifecycleInFragment(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiH:Ljava/lang/Boolean;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->BR:I
    //         return v0
    */

    public fun getZOrderOnTop(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiG:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getZoomControlsEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiK:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getZoomGesturesEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiN:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun mapType(mapType: Int): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (I)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiI:I
    //         return-object p0
    */

    fun mr(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiG:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun ms(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiH:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mt(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiK:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mu(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiL:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mv(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiM:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mw(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiN:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mx(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiO:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun my(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiP:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    public fun rotateGesturesEnabled(enabled: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiP:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun scrollGesturesEnabled(enabled: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiM:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun tiltGesturesEnabled(enabled: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiO:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun useViewLifecycleInFragment(useViewLifecycleInFragment: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiH:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/GoogleMapOptions;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/a;->a(Lcom/google/android/gms/maps/GoogleMapOptions;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    public fun zOrderOnTop(zOrderOnTop: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiG:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun zoomControlsEnabled(enabled: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiK:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun zoomGesturesEnabled(enabled: Boolean): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->aiN:Ljava/lang/Boolean;
    //         return-object p0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.a = null!!

    public @JvmStatic fun createFromAttributes(context: android.content.Context, attrs: android.util.AttributeSet): com.google.android.gms.maps.GoogleMapOptions { return TODO("body: (Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/GoogleMapOptions;") }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         const/4 v4, 0x1
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/R$styleable;->MapAttrs:[I
    //         invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v1
    //         new-instance v0, Lcom/google/android/gms/maps/GoogleMapOptions;
    //         invoke-direct {v0}, Lcom/google/android/gms/maps/GoogleMapOptions;-><init>()V
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_mapType:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_mapType:I
    //         const/4 v3, -0x1
    //         invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->mapType(I)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_1
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_zOrderOnTop:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_zOrderOnTop:I
    //         invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->zOrderOnTop(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_2
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_useViewLifecycle:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_useViewLifecycle:I
    //         invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->useViewLifecycleInFragment(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_3
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiCompass:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiCompass:I
    //         invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->compassEnabled(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_4
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiRotateGestures:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiRotateGestures:I
    //         invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->rotateGesturesEnabled(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_5
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiScrollGestures:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_6
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiScrollGestures:I
    //         invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->scrollGesturesEnabled(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_6
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiTiltGestures:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_7
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiTiltGestures:I
    //         invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->tiltGesturesEnabled(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_7
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomGestures:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_8
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomGestures:I
    //         invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->zoomGesturesEnabled(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_8
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomControls:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_9
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_uiZoomControls:I
    //         invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->zoomControlsEnabled(Z)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         :cond_9
    //         invoke-static {p0, p1}, Lcom/google/android/gms/maps/model/CameraPosition;->createFromAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/model/CameraPosition;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMapOptions;->camera(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/GoogleMapOptions;
    //         invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
    //         goto/16 :goto_0
    */

    }
}
