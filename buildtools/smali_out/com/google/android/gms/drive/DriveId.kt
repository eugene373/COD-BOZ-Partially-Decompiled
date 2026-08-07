package com.google.android.gms.drive

// Auto-emitted from smali.
// 6 fields, 14 methods.

open class DriveId: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Ni: String
    val Nj: Long
    val Nk: Long
    private var Nl: String

    constructor(versionCode: Int, resourceId: String, sqlId: Long, databaseInstanceId: Long)

    public constructor(resourceId: String, sqlId: Long, databaseInstanceId: Long)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun encodeToString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->Nl:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/DriveId;->hN()[B
    //         move-result-object v0
    //         const/16 v1, 0xa
    //         invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "DriveId:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/drive/DriveId;->Nl:Ljava/lang/String;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->Nl:Ljava/lang/String;
    //         return-object v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 8
    //         const-wide/16 v6, -0x1
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/drive/DriveId;
    //         if-nez v1, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/drive/DriveId;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-wide v2, p1, Lcom/google/android/gms/drive/DriveId;->Nk:J
    //         iget-wide v4, p0, Lcom/google/android/gms/drive/DriveId;->Nk:J
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_2
    //         const-string v1, "DriveId"
    //         const-string v2, "Attempt to compare invalid DriveId detected. Has local storage been cleared?"
    //         invoke-static {v1, v2}, Lcom/google/android/gms/drive/internal/v;->p(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         iget-wide v2, p1, Lcom/google/android/gms/drive/DriveId;->Nj:J
    //         cmp-long v1, v2, v6
    //         if-nez v1, :cond_3
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->Nj:J
    //         cmp-long v1, v2, v6
    //         if-nez v1, :cond_3
    //         iget-object v0, p1, Lcom/google/android/gms/drive/DriveId;->Ni:Ljava/lang/String;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/DriveId;->Ni:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_3
    //         iget-wide v2, p1, Lcom/google/android/gms/drive/DriveId;->Nj:J
    //         iget-wide v4, p0, Lcom/google/android/gms/drive/DriveId;->Nj:J
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun getResourceId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->Ni:Ljava/lang/String;
    //         return-object v0
    */

    fun hN(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 4
    //         new-instance v1, Lcom/google/android/gms/drive/internal/ah;
    //         invoke-direct {v1}, Lcom/google/android/gms/drive/internal/ah;-><init>()V
    //         iget v0, p0, Lcom/google/android/gms/drive/DriveId;->BR:I
    //         iput v0, v1, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->Ni:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, ""
    //         :goto_0
    //         iput-object v0, v1, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->Nj:J
    //         iput-wide v2, v1, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->Nk:J
    //         iput-wide v2, v1, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         invoke-static {v1}, Lcom/google/android/gms/internal/pn;->f(Lcom/google/android/gms/internal/pn;)[B
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->Ni:Ljava/lang/String;
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/drive/DriveId;->Nj:J
    //         const-wide/16 v2, -0x1
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->Ni:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->Nk:J
    //         invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->Nj:J
    //         invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/DriveId;->encodeToString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/c;->a(Lcom/google/android/gms/drive/DriveId;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun bg(p0: String): com.google.android.gms.drive.DriveId { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 6
    //         const-wide/16 v2, -0x1
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         new-instance v0, Lcom/google/android/gms/drive/DriveId;
    //         move-object v1, p0
    //         move-wide v4, v2
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/DriveId;-><init>(Ljava/lang/String;JJ)V
    //         return-object v0
    */

    public @JvmStatic fun decodeFromString(s: String): com.google.android.gms.drive.DriveId { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 3
    //         const-string v0, "DriveId:"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Invalid DriveId: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const-string v0, "DriveId:"
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         const/16 v1, 0xa
    //         invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/drive/DriveId;->f([B)Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun f(p0: ByteArray): com.google.android.gms.drive.DriveId { return TODO("body: ([B)Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 8
    //         :try_start_0
    //         invoke-static {p0}, Lcom/google/android/gms/drive/internal/ah;->g([B)Lcom/google/android/gms/drive/internal/ah;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/internal/pm; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         const-string v1, ""
    //         iget-object v2, v0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v3, 0x0
    //         :goto_0
    //         new-instance v1, Lcom/google/android/gms/drive/DriveId;
    //         iget v2, v0, Lcom/google/android/gms/drive/internal/ah;->versionCode:I
    //         iget-wide v4, v0, Lcom/google/android/gms/drive/internal/ah;->Pm:J
    //         iget-wide v6, v0, Lcom/google/android/gms/drive/internal/ah;->Pn:J
    //         invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/drive/DriveId;-><init>(ILjava/lang/String;JJ)V
    //         return-object v1
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
    //         throw v0
    //         :cond_0
    //         iget-object v3, v0, Lcom/google/android/gms/drive/internal/ah;->Pl:Ljava/lang/String;
    //         goto :goto_0
    */

    }
}
