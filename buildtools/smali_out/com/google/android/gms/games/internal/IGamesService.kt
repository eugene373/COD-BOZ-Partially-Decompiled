package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 0 fields, 190 methods.

interface IGamesService: android.os.IInterface {
    public fun N(p0: Boolean)

    public fun O(p0: Boolean)

    public fun P(p0: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: ByteArray, p2: String, p3: String): Int

    public fun a(p0: Int, p1: Int, p2: Boolean): android.content.Intent

    public fun a(p0: Int, p1: ByteArray, p2: Int, p3: String): android.content.Intent

    public fun a(p0: com.google.android.gms.games.achievement.AchievementEntity): android.content.Intent

    public fun a(p0: com.google.android.gms.games.internal.multiplayer.ZInvitationCluster, p1: String, p2: String): android.content.Intent

    public fun a(p0: com.google.android.gms.games.internal.request.GameRequestCluster, p1: String): android.content.Intent

    public fun a(p0: com.google.android.gms.games.multiplayer.realtime.RoomEntity, p1: Int): android.content.Intent

    public fun a(p0: String, p1: Boolean, p2: Boolean, p3: Int): android.content.Intent

    public fun a(p0: Array<com.google.android.gms.games.multiplayer.ParticipantEntity>, p1: String, p2: String, p3: android.net.Uri, p4: android.net.Uri): android.content.Intent

    public fun a(p0: Long, p1: String)

    public fun a(p0: android.os.IBinder, p1: android.os.Bundle)

    public fun a(p0: com.google.android.gms.drive.Contents)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Int, p3: Int)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Int, p3: Boolean, p4: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Int, p3: Array<String>, p4: android.os.Bundle)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: IntArray)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: android.os.Bundle, p2: Int, p3: Int)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: android.os.IBinder, p2: Int, p3: Array<String>, p4: android.os.Bundle, p5: Boolean, p6: Long)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: android.os.IBinder, p2: String, p3: Boolean, p4: Long)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: android.os.IBinder, p4: android.os.Bundle)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean, p5: Boolean, p6: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: IntArray)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Long)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Long, p3: String)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: android.os.IBinder, p3: android.os.Bundle)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: com.google.android.gms.games.snapshot.SnapshotMetadataChange, p3: com.google.android.gms.drive.Contents)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int, p5: Int)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Boolean, p5: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: com.google.android.gms.games.snapshot.SnapshotMetadataChange, p4: com.google.android.gms.drive.Contents)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: IntArray, p4: Int, p5: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Array<String>)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Array<String>, p4: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: ByteArray, p3: String, p4: Array<com.google.android.gms.games.multiplayer.ParticipantResult>)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: ByteArray, p3: Array<com.google.android.gms.games.multiplayer.ParticipantResult>)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: IntArray)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Array<String>, p3: Int, p4: ByteArray, p5: Int)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean, p2: android.os.Bundle)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean, p2: Array<String>)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: IntArray)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: IntArray, p2: Int, p3: Boolean)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>)

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>, p2: Boolean)

    public fun a(p0: String, p1: android.os.IBinder, p2: android.os.Bundle)

    public fun b(p0: ByteArray, p1: String, p2: Array<String>): Int

    public fun b(p0: Int, p1: Int, p2: Boolean): android.content.Intent

    public fun b(p0: IntArray): android.content.Intent

    public fun b(p0: Long, p1: String)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: android.os.IBinder, p4: android.os.Bundle)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: android.os.IBinder, p3: android.os.Bundle)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Boolean, p5: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>)

    public fun b(p0: String, p1: String, p2: Int)

    public fun bC(p0: String): android.content.Intent

    public fun bE(p0: String): String

    public fun bF(p0: String): String

    public fun bG(p0: String)

    public fun bH(p0: String): Int

    public fun bI(p0: String): android.net.Uri

    public fun bJ(p0: String)

    public fun bK(p0: String): android.os.ParcelFileDescriptor

    public fun bx(p0: String): android.content.Intent

    public fun c(p0: Long, p1: String)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Boolean)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>)

    public fun c(p0: String, p1: String, p2: Int)

    public fun d(p0: Long, p1: String)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean)

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun dC(p0: Int)

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean)

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean)

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String)

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean)

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean)

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String)

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun fC(): android.os.Bundle

    public fun g(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun g(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun g(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun h(p0: android.net.Uri): android.os.ParcelFileDescriptor

    public fun h(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String): com.google.android.gms.games.multiplayer.realtime.RoomEntity

    public fun h(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun h(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean)

    public fun i(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun i(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun j(p0: com.google.android.gms.games.internal.IGamesCallbacks)

    public fun j(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun k(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun kA(): Boolean

    public fun kB(): com.google.android.gms.common.data.DataHolder

    public fun kC()

    public fun kD(): android.content.Intent

    public fun kE()

    public fun kF(): Boolean

    public fun ka(): String

    public fun kb(): String

    public fun ke(): android.content.Intent

    public fun kf(): android.content.Intent

    public fun kg(): android.content.Intent

    public fun kh(): android.content.Intent

    public fun km(): android.content.Intent

    public fun kn(): android.content.Intent

    public fun ko(): Int

    public fun kp(): String

    public fun kq(): Int

    public fun kr(): android.content.Intent

    public fun ks(): Int

    public fun kt(): Int

    public fun ku(): Int

    public fun kv(): Int

    public fun kx()

    public fun kz(): com.google.android.gms.common.data.DataHolder

    public fun l(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun m(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun n(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun n(p0: String, p1: Int)

    public fun o(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun o(p0: String, p1: Int)

    public fun p(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun p(p0: String, p1: Int)

    public fun q(p0: Long)

    public fun q(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun r(p0: Long)

    public fun r(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun r(p0: String, p1: Int)

    public fun s(p0: Long)

    public fun s(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun s(p0: String, p1: Int)

    public fun t(p0: Long)

    public fun t(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun u(p0: Long)

    public fun u(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String)

    public fun u(p0: String, p1: String)

    public fun v(p0: String, p1: String)

}
