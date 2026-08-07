package com.google.android.gms.games.internal.game

// Auto-emitted from smali.
// 0 fields, 12 methods.

class GameBadgeRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.internal.game.GameBadge {
    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->a(Lcom/google/android/gms/games/internal/game/GameBadge;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameBadgeRef;->ld()Lcom/google/android/gms/games/internal/game/GameBadge;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "badge_description"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameBadgeRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "badge_icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameBadgeRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "badge_title"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameBadgeRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "badge_type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameBadgeRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->a(Lcom/google/android/gms/games/internal/game/GameBadge;)I
    //         move-result v0
    //         return v0
    */

    public fun ld(): com.google.android.gms.games.internal.game.GameBadge { return TODO("body: ()Lcom/google/android/gms/games/internal/game/GameBadge;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;-><init>(Lcom/google/android/gms/games/internal/game/GameBadge;)V
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->b(Lcom/google/android/gms/games/internal/game/GameBadge;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameBadgeRef;->ld()Lcom/google/android/gms/games/internal/game/GameBadge;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
