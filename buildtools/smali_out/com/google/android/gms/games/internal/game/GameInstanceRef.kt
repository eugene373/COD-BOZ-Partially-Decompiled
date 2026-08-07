package com.google.android.gms.games.internal.game

// Auto-emitted from smali.
// 0 fields, 10 methods.

class GameInstanceRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.internal.game.GameInstance {
    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_game_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "instance_display_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "package_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun iR(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "platform_type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun le(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "real_time_support"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun lf(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "turn_based_support"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun lg(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "piracy_check"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun lh(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "installed"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ApplicationId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "DisplayName"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "SupportsRealTime"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->le()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "SupportsTurnBased"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->lf()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "PlatformType"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->iR()I
    //         move-result v2
    //         invoke-static {v2}, Lcom/google/android/gms/games/internal/constants/PlatformType;->dH(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "PackageName"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "PiracyCheckEnabled"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->lg()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Installed"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/game/GameInstanceRef;->lh()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
