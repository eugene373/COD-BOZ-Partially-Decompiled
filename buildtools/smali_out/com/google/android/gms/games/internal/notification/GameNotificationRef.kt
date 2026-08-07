package com.google.android.gms.games.internal.notification

// Auto-emitted from smali.
// 0 fields, 11 methods.

class GameNotificationRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.internal.notification.GameNotification {
    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun getId(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "text"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "title"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun lk(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "notification_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun ll(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "ticker"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun lm(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "coalesced_text"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun ln(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "acknowledged"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun lo(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "alert_level"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Id"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getId()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "NotificationId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->lk()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Type"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getType()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Title"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getTitle()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Ticker"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->ll()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Text"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->getText()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "CoalescedText"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->lm()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "isAcknowledged"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->ln()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "isSilent"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/notification/GameNotificationRef;->lo()Z
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
