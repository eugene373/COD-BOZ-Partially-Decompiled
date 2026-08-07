package com.google.android.gms.auth

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class AccountChangeEventsResponse: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val Di: Int
    val me: java.util.List

    constructor(version: Int, p1: java.util.List)

    public constructor(p0: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getEvents(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/auth/AccountChangeEvent;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/auth/AccountChangeEventsResponse;->me:Ljava/util/List;
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/AccountChangeEventsResponseCreator;->a(Lcom/google/android/gms/auth/AccountChangeEventsResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.auth.AccountChangeEventsResponseCreator = null!!
    }
}
