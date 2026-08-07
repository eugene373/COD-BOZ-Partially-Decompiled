package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 13 fields, 9 methods.

class ParticipantResult: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Xr: String
    private val acj: Int
    private val ack: Int

    public constructor(versionCode: Int, participantId: String, result: Int, placing: Int)

    public constructor(participantId: String, result: Int, placing: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getParticipantId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantResult;->Xr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPlacing(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantResult;->ack:I
    //         return v0
    */

    public fun getResult(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantResult;->acj:I
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantResult;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/multiplayer/ParticipantResultCreator;->a(Lcom/google/android/gms/games/multiplayer/ParticipantResult;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.multiplayer.ParticipantResultCreator = null!!
    @JvmField public val MATCH_RESULT_DISAGREED: Int = 0x5
    @JvmField public val MATCH_RESULT_DISCONNECT: Int = 0x4
    @JvmField public val MATCH_RESULT_LOSS: Int = 0x1
    @JvmField public val MATCH_RESULT_NONE: Int = 0x3
    @JvmField public val MATCH_RESULT_TIE: Int = 0x2
    @JvmField public val MATCH_RESULT_UNINITIALIZED: Int = 0
    @JvmField public val MATCH_RESULT_WIN: Int = 0x0
    @JvmField public val PLACING_UNINITIALIZED: Int = 0
    }
}
