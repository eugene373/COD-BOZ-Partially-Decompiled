package com.google.android.gms.games.quest

// Auto-emitted from smali.
// 2 fields, 28 methods.

class QuestRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.quest.Quest {
    private val aaK: Int
    private val abx: com.google.android.gms.games.Game

    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int, numChildren: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/quest/QuestEntity;->a(Lcom/google/android/gms/games/quest/Quest;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.quest.Quest { return TODO("body: ()Lcom/google/android/gms/games/quest/Quest;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/quest/QuestEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/quest/QuestEntity;-><init>(Lcom/google/android/gms/games/quest/Quest;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/QuestRef;->freeze()Lcom/google/android/gms/games/quest/Quest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAcceptedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "accepted_ts"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getBannerImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "quest_banner_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getBannerImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "quest_banner_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCurrentMilestone(): com.google.android.gms.games.quest.Milestone { return TODO("body: ()Lcom/google/android/gms/games/quest/Milestone;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/QuestRef;->lJ()Ljava/util/List;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/quest/Milestone;
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "quest_description"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "quest_description"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/quest/QuestRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getEndTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "quest_end_ts"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/quest/QuestRef;->abx:Lcom/google/android/gms/games/Game;
    //         return-object v0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "quest_icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "quest_icon_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLastUpdatedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "quest_last_updated_ts"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "quest_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "quest_name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/quest/QuestRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getQuestId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_quest_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getStartTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "quest_start_ts"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "quest_state"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "quest_type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/quest/QuestEntity;->a(Lcom/google/android/gms/games/quest/Quest;)I
    //         move-result v0
    //         return v0
    */

    public fun isEndingSoon(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/QuestRef;->lK()J
    //         move-result-wide v0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         const-wide/32 v4, 0x1b7740
    //         add-long/2addr v2, v4
    //         cmp-long v0, v0, v2
    //         if-gtz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun lJ(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/games/quest/Milestone;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget v0, p0, Lcom/google/android/gms/games/quest/QuestRef;->aaK:I
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget v2, p0, Lcom/google/android/gms/games/quest/QuestRef;->aaK:I
    //         if-ge v0, v2, :cond_0
    //         new-instance v2, Lcom/google/android/gms/games/quest/MilestoneRef;
    //         iget-object v3, p0, Lcom/google/android/gms/games/quest/QuestRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v4, p0, Lcom/google/android/gms/games/quest/QuestRef;->JX:I
    //         add-int/2addr v4, v0
    //         invoke-direct {v2, v3, v4}, Lcom/google/android/gms/games/quest/MilestoneRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun lK(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "notification_ts"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/quest/QuestRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/quest/QuestEntity;->b(Lcom/google/android/gms/games/quest/Quest;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/quest/QuestRef;->freeze()Lcom/google/android/gms/games/quest/Quest;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/quest/QuestEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/quest/QuestEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
