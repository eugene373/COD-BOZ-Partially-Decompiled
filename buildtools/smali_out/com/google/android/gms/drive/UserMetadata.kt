package com.google.android.gms.drive

// Auto-emitted from smali.
// 7 fields, 6 methods.

open class UserMetadata: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val NG: String
    val NH: String
    val NI: String
    val NJ: Boolean
    val NK: String

    constructor(versionCode: Int, permissionId: String, displayName: String, pictureUrl: String, isAuthenticatedUser: Boolean, emailAddress: String)

    public constructor(permissionId: String, displayName: String, pictureUrl: String, isAuthenticatedUser: Boolean, emailAddress: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "Permission ID: \'%s\', Display Name: \'%s\', Picture URL: \'%s\', Authenticated User: %b, Email: \'%s\'"
    //         const/4 v1, 0x5
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NG:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NH:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NI:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         iget-boolean v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NJ:Z
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x4
    //         iget-object v3, p0, Lcom/google/android/gms/drive/UserMetadata;->NK:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/h;->a(Lcom/google/android/gms/drive/UserMetadata;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
