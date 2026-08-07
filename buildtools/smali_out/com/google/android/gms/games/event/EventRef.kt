package com.google.android.gms.games.event

// Auto-emitted from smali.
// 0 fields, 20 methods.

class EventRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.event.Event {
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
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/event/EventEntity;->a(Lcom/google/android/gms/games/event/Event;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.event.Event { return TODO("body: ()Lcom/google/android/gms/games/event/Event;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/event/EventEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/event/EventEntity;-><init>(Lcom/google/android/gms/games/event/Event;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/event/EventRef;->freeze()Lcom/google/android/gms/games/event/Event;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/event/EventRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getEventId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_event_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getFormattedValue(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "formatted_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getFormattedValue(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "formatted_value"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/event/EventRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "icon_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/event/EventRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getPlayer(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/games/PlayerRef;
    //         iget-object v1, p0, Lcom/google/android/gms/games/event/EventRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v2, p0, Lcom/google/android/gms/games/event/EventRef;->JX:I
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         return-object v0
    */

    public fun getValue(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/event/EventEntity;->a(Lcom/google/android/gms/games/event/Event;)I
    //         move-result v0
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "visibility"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/event/EventRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/event/EventEntity;->b(Lcom/google/android/gms/games/event/Event;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/event/EventRef;->freeze()Lcom/google/android/gms/games/event/Event;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/event/EventEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/event/EventEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
