package com.google.android.gms.auth

// Auto-emitted from smali.
// 4 fields, 9 methods.

open class AccountChangeEventsRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    var Dd: String
    val Di: Int
    var Dl: Int

    public constructor()

    constructor(version: Int, eventIndex: Int, accountName: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dd:Ljava/lang/String;
    //         return-object v0
    */

    public fun getEventIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dl:I
    //         return v0
    */

    public fun setAccountName(accountName: String): com.google.android.gms.auth.AccountChangeEventsRequest { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/auth/AccountChangeEventsRequest;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dd:Ljava/lang/String;
    //         return-object p0
    */

    public fun setEventIndex(eventIndex: Int): com.google.android.gms.auth.AccountChangeEventsRequest { return TODO("body: (I)Lcom/google/android/gms/auth/AccountChangeEventsRequest;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->Dl:I
    //         return-object p0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/AccountChangeEventsRequestCreator;->a(Lcom/google/android/gms/auth/AccountChangeEventsRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.auth.AccountChangeEventsRequestCreator = null!!
    }
}
