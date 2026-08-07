package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 6 fields, 13 methods.

class CameraPosition: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    public val bearing: Float
    public val target: com.google.android.gms.maps.model.LatLng
    public val tilt: Float
    public val zoom: Float

    constructor(versionCode: Int, target: com.google.android.gms.maps.model.LatLng, zoom: Float, tilt: Float, bearing: Float)

    public constructor(target: com.google.android.gms.maps.model.LatLng, zoom: Float, tilt: Float, bearing: Float)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/maps/model/CameraPosition;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/maps/model/CameraPosition;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-object v3, p1, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F
    //         invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v2
    //         iget v3, p1, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F
    //         invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v3
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->tilt:F
    //         invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v2
    //         iget v3, p1, Lcom/google/android/gms/maps/model/CameraPosition;->tilt:F
    //         invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v3
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->bearing:F
    //         invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v2
    //         iget v3, p1, Lcom/google/android/gms/maps/model/CameraPosition;->bearing:F
    //         invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v3
    //         if-eq v2, v3, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/CameraPosition;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->tilt:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->bearing:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
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
    //         const-string v1, "target"
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "zoom"
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "tilt"
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->tilt:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "bearing"
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition;->bearing:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/b;->a(Lcom/google/android/gms/maps/model/CameraPosition;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/a;->a(Lcom/google/android/gms/maps/model/CameraPosition;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.a = null!!

    public @JvmStatic fun builder(): com.google.android.gms.maps.model.CameraPosition.Builder { return TODO("body: ()Lcom/google/android/gms/maps/model/CameraPosition$Builder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;
    //         invoke-direct {v0}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;-><init>()V
    //         return-object v0
    */

    public @JvmStatic fun builder(camera: com.google.android.gms.maps.model.CameraPosition): com.google.android.gms.maps.model.CameraPosition.Builder { return TODO("body: (Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/model/CameraPosition$Builder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;-><init>(Lcom/google/android/gms/maps/model/CameraPosition;)V
    //         return-object v0
    */

    public @JvmStatic fun createFromAttributes(context: android.content.Context, attrs: android.util.AttributeSet): com.google.android.gms.maps.model.CameraPosition { return TODO("body: (Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/model/CameraPosition;") }
    /*
    //         .locals 10
    //         const/4 v1, 0x0
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget-object v2, Lcom/google/android/gms/R$styleable;->MapAttrs:[I
    //         invoke-virtual {v0, p1, v2}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v3
    //         sget v0, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraTargetLat:I
    //         invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         sget v0, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraTargetLat:I
    //         invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
    //         move-result v0
    //         :goto_1
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraTargetLng:I
    //         invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraTargetLng:I
    //         invoke-virtual {v3, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
    //         move-result v2
    //         :goto_2
    //         new-instance v4, Lcom/google/android/gms/maps/model/LatLng;
    //         float-to-double v6, v0
    //         float-to-double v8, v2
    //         invoke-direct {v4, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V
    //         invoke-static {}, Lcom/google/android/gms/maps/model/CameraPosition;->builder()Lcom/google/android/gms/maps/model/CameraPosition$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->target(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraZoom:I
    //         invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraZoom:I
    //         invoke-virtual {v3, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->zoom(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
    //         :cond_1
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraBearing:I
    //         invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraBearing:I
    //         invoke-virtual {v3, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->bearing(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
    //         :cond_2
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraTilt:I
    //         invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         sget v2, Lcom/google/android/gms/R$styleable;->MapAttrs_cameraTilt:I
    //         invoke-virtual {v3, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->tilt(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
    //         :cond_3
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->build()Lcom/google/android/gms/maps/model/CameraPosition;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_4
    //         move v2, v1
    //         goto :goto_2
    //         :cond_5
    //         move v0, v1
    //         goto :goto_1
    */

    public @JvmStatic fun fromLatLngZoom(target: com.google.android.gms.maps.model.LatLng, zoom: Float): com.google.android.gms.maps.model.CameraPosition { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/model/CameraPosition;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition;
    //         invoke-direct {v0, p0, p1, v1, v1}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V
    //         return-object v0
    */

    }
}
