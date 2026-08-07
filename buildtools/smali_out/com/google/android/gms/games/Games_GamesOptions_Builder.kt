package com.google.android.gms.games

// Auto-emitted from smali.
// 7 fields, 6 methods.

class Games_GamesOptions_Builder {
    var VD: Boolean
    var VE: Boolean
    var VF: Int
    var VG: Boolean
    var VH: Int
    var VI: String
    var VJ: java.util.ArrayList

    private constructor()

    constructor(x0: com.google.android.gms.games.Games.1)

    public fun build(): com.google.android.gms.games.Games.GamesOptions { return TODO("body: ()Lcom/google/android/gms/games/Games$GamesOptions;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/Games$GamesOptions;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/games/Games$GamesOptions;-><init>(Lcom/google/android/gms/games/Games$GamesOptions$Builder;Lcom/google/android/gms/games/Games$1;)V
    //         return-object v0
    */

    public fun setSdkVariant(variant: Int): com.google.android.gms.games.Games.GamesOptions.Builder { return TODO("body: (I)Lcom/google/android/gms/games/Games$GamesOptions$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->VH:I
    //         return-object p0
    */

    public fun setShowConnectingPopup(showConnectingPopup: Boolean): com.google.android.gms.games.Games.GamesOptions.Builder { return TODO("body: (Z)Lcom/google/android/gms/games/Games$GamesOptions$Builder;") }
    /*
    //         .locals 1
    //         iput-boolean p1, p0, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->VE:Z
    //         const/16 v0, 0x11
    //         iput v0, p0, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->VF:I
    //         return-object p0
    */

    public fun setShowConnectingPopup(showConnectingPopup: Boolean, gravity: Int): com.google.android.gms.games.Games.GamesOptions.Builder { return TODO("body: (ZI)Lcom/google/android/gms/games/Games$GamesOptions$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->VE:Z
    //         iput p2, p0, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->VF:I
    //         return-object p0
    */

}
