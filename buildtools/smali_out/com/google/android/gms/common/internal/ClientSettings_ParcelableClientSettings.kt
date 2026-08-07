package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 6 fields, 11 methods.

class ClientSettings_ParcelableClientSettings: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Dd: String
    private val IK: Int
    private val IM: String
    private val Jk: java.util.List

    constructor(versionCode: Int, accountName: String, gravityForPopups: java.util.List, realClientPackageName: Int, p4: String)

    public constructor(accountName: String, gravityForPopups: java.util.Collection, realClientPackageName: Int, p3: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Dd:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAccountNameOrDefault(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Dd:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Dd:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "<<default account>>"
    //         goto :goto_0
    */

    public fun getGravityForPopups(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->IK:I
    //         return v0
    */

    public fun getRealClientPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->IM:Ljava/lang/String;
    //         return-object v0
    */

    public fun getScopes(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->Jk:Ljava/util/List;
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/internal/ParcelableClientSettingsCreator;->a(Lcom/google/android/gms/common/internal/ClientSettings$ParcelableClientSettings;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.common.internal.ParcelableClientSettingsCreator = null!!
    }
}
