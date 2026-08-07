package com.google.android.gms.drive.realtime.internal

// Auto-emitted from smali.
// 9 fields, 7 methods.

open class ParcelableCollaborator: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val NH: String
    val Rk: Boolean
    val Rl: Boolean
    val Rm: String
    val Rn: String
    val Ro: String
    val vL: String

    constructor(versionCode: Int, isMe: Boolean, isAnonymous: Boolean, sessionId: String, userId: String, displayName: String, color: String, photoUrl: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         if-ne p0, p1, :cond_0
    //         const/4 v0, 0x1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->vL:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->vL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->vL:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Collaborator [isMe="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-boolean v1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->Rk:Z
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", isAnonymous="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-boolean v1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->Rl:Z
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", sessionId="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->vL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", userId="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->Rm:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", displayName="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->NH:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", color="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->Rn:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", photoUrl="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;->Ro:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/p;->a(Lcom/google/android/gms/drive/realtime/internal/ParcelableCollaborator;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
