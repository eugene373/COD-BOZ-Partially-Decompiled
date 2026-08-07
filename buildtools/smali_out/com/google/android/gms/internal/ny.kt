package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 14 methods.

class ny: com.google.android.gms.common.data.d(), com.google.android.gms.plus.model.moments.Moment {
    private var amZ: com.google.android.gms.internal.nw

    public constructor(p0: com.google.android.gms.common.data.DataHolder, p1: Int)

    private fun nt(): com.google.android.gms.internal.nw { return TODO("body: ()Lcom/google/android/gms/internal/nw;") }
    /*
    //         .locals 4
    //         monitor-enter p0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ny;->amZ:Lcom/google/android/gms/internal/nw;
    //         if-nez v0, :cond_0
    //         const-string v0, "momentImpl"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ny;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         array-length v3, v0
    //         invoke-virtual {v1, v0, v2, v3}, Landroid/os/Parcel;->unmarshall([BII)V
    //         const/4 v0, 0x0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V
    //         sget-object v0, Lcom/google/android/gms/internal/nw;->CREATOR:Lcom/google/android/gms/internal/nx;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nx;->dc(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/ny;->amZ:Lcom/google/android/gms/internal/nw;
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         :cond_0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ny;->amZ:Lcom/google/android/gms/internal/nw;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ny;->ns()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getResult(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->getResult()Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getStartDate(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->getStartDate()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTarget(): com.google.android.gms.plus.model.moments.ItemScope { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/ItemScope;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->getTarget()Lcom/google/android/gms/plus/model/moments/ItemScope;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->getType()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hasId(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->hasId()Z
    //         move-result v0
    //         return v0
    */

    public fun hasResult(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->hasResult()Z
    //         move-result v0
    //         return v0
    */

    public fun hasStartDate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->hasStartDate()Z
    //         move-result v0
    //         return v0
    */

    public fun hasTarget(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->hasTarget()Z
    //         move-result v0
    //         return v0
    */

    public fun hasType(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nw;->hasType()Z
    //         move-result v0
    //         return v0
    */

    public fun ns(): com.google.android.gms.internal.nw { return TODO("body: ()Lcom/google/android/gms/internal/nw;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ny;->nt()Lcom/google/android/gms/internal/nw;
    //         move-result-object v0
    //         return-object v0
    */

}
