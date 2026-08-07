package com.google.android.gms.games.quest

// Auto-emitted from smali.
// 0 fields, 15 methods.

class MilestoneRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.quest.Milestone {
    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    private fun lI(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "initial_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/quest/MilestoneEntity;->a(Lcom/google/android/gms/games/quest/Milestone;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.quest.Milestone { return TODO("body: ()Lcom/google/android/gms/games/quest/Milestone;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/quest/MilestoneEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/quest/MilestoneEntity;-><init>(Lcom/google/android/gms/games/quest/Milestone;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/MilestoneRef;->freeze()Lcom/google/android/gms/games/quest/Milestone;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCompletionRewardData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         const-string v0, "completion_reward_data"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCurrentProgress(): Long { return TODO("body: ()J") }
    /*
    //         .locals 4
    //         const-wide/16 v0, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getState()I
    //         move-result v2
    //         packed-switch v2, :pswitch_data_0
    //         :goto_0
    //         :pswitch_0
    //         return-wide v0
    //         :pswitch_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getTargetProgress()J
    //         move-result-wide v0
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "current_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         invoke-direct {p0}, Lcom/google/android/gms/games/quest/MilestoneRef;->lI()J
    //         move-result-wide v2
    //         sub-long/2addr v0, v2
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun getEventId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_event_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMilestoneId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_milestone_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "milestone_state"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getTargetProgress(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "target_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/MilestoneRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/quest/MilestoneEntity;->a(Lcom/google/android/gms/games/quest/Milestone;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/quest/MilestoneEntity;->b(Lcom/google/android/gms/games/quest/Milestone;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/MilestoneRef;->freeze()Lcom/google/android/gms/games/quest/Milestone;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/quest/MilestoneEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/quest/MilestoneEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
