package com.google.android.gms.games.multiplayer.realtime

// Auto-emitted from smali.
// 6 fields, 9 methods.

class RealTimeMessage: android.os.Parcelable {
    private val acl: String
    private val acm: ByteArray
    private val acn: Int

    private constructor(parcel: android.os.Parcel)

    constructor(x0: android.os.Parcel, x1: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.1)

    public constructor(senderParticipantId: String, messageData: ByteArray, isReliable: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getMessageData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->acm:[B
    //         return-object v0
    */

    public fun getSenderParticipantId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->acl:Ljava/lang/String;
    //         return-object v0
    */

    public fun isReliable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->acn:I
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flag: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->acl:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->acm:[B
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->acn:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val RELIABLE: Int = 0x1
    @JvmField public val UNRELIABLE: Int = 0
    }
}
