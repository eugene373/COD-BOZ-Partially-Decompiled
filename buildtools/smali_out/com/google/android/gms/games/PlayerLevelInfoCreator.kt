package com.google.android.gms.games

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class PlayerLevelInfoCreator: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(parcel: android.os.Parcel): com.google.android.gms.games.PlayerLevelInfo { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/games/PlayerLevelInfo;") }
    /*
    //         .locals 10
    //         const-wide/16 v4, 0x0
    //         const/4 v7, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v8
    //         const/4 v1, 0x0
    //         move-object v6, v7
    //         move-wide v2, v4
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v8, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v9
    //         sparse-switch v9, :sswitch_data_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v2
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v4
    //         goto :goto_0
    //         :sswitch_3
    //         sget-object v6, Lcom/google/android/gms/games/PlayerLevel;->CREATOR:Lcom/google/android/gms/games/PlayerLevelCreator;
    //         invoke-static {p1, v0, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/PlayerLevel;
    //         move-object v6, v0
    //         goto :goto_0
    //         :sswitch_4
    //         sget-object v7, Lcom/google/android/gms/games/PlayerLevel;->CREATOR:Lcom/google/android/gms/games/PlayerLevelCreator;
    //         invoke-static {p1, v0, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/PlayerLevel;
    //         move-object v7, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-eq v0, v8, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Overread allowed size end="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/games/PlayerLevelInfo;
    //         invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/games/PlayerLevelInfo;-><init>(IJJLcom/google/android/gms/games/PlayerLevel;Lcom/google/android/gms/games/PlayerLevel;)V
    //         return-object v0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/PlayerLevelInfoCreator;->createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/games/PlayerLevelInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(size: Int): Array<com.google.android.gms.games.PlayerLevelInfo> { return TODO("body: (I)[Lcom/google/android/gms/games/PlayerLevelInfo;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/games/PlayerLevelInfo;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/PlayerLevelInfoCreator;->newArray(I)[Lcom/google/android/gms/games/PlayerLevelInfo;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val CONTENT_DESCRIPTION: Int = 0

    @JvmStatic fun a(p0: com.google.android.gms.games.PlayerLevelInfo, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/games/PlayerLevelInfo;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevelInfo;->getCurrentXpTotal()J
    //         move-result-wide v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/16 v1, 0x3e8
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevelInfo;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevelInfo;->getLastLevelUpTimestamp()J
    //         move-result-wide v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x3
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevelInfo;->getCurrentLevel()Lcom/google/android/gms/games/PlayerLevel;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, p2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/4 v1, 0x4
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevelInfo;->getNextLevel()Lcom/google/android/gms/games/PlayerLevel;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, p2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
