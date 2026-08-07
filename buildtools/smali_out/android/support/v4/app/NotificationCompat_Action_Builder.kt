package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 5 fields, 8 methods.

class NotificationCompat_Action_Builder {
    private val mExtras: android.os.Bundle
    private val mIcon: Int
    private val mIntent: android.app.PendingIntent
    private var mRemoteInputs: java.util.ArrayList
    private val mTitle: CharSequence

    public constructor(icon: Int, title: CharSequence, intent: android.app.PendingIntent)

    private constructor(icon: Int, title: CharSequence, intent: android.app.PendingIntent, extras: android.os.Bundle)

    public constructor(action: android.support.v4.app.NotificationCompat.Action)

    public fun addExtras(extras: android.os.Bundle): android.support.v4.app.NotificationCompat.Action.Builder { return TODO("body: (Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Action$Builder;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    //         :cond_0
    //         return-object p0
    */

    public fun addRemoteInput(remoteInput: android.support.v4.app.RemoteInput): android.support.v4.app.NotificationCompat.Action.Builder { return TODO("body: (Landroid/support/v4/app/RemoteInput;)Landroid/support/v4/app/NotificationCompat$Action$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun build(): android.support.v4.app.NotificationCompat.Action { return TODO("body: ()Landroid/support/v4/app/NotificationCompat$Action;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         new-array v1, v1, [Landroid/support/v4/app/RemoteInput;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Landroid/support/v4/app/RemoteInput;
    //         move-object v5, v0
    //         .local v5, "remoteInputs":[Landroid/support/v4/app/RemoteInput;
    //         :goto_0
    //         new-instance v0, Landroid/support/v4/app/NotificationCompat$Action;
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIcon:I
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mTitle:Ljava/lang/CharSequence;
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIntent:Landroid/app/PendingIntent;
    //         iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-direct/range {v0 .. v6}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;Landroid/support/v4/app/NotificationCompat$1;)V
    //         return-object v0
    //         .end local v5    # "remoteInputs":[Landroid/support/v4/app/RemoteInput;
    //         :cond_0
    //         move-object v5, v6
    //         goto :goto_0
    */

    public fun extend(extender: android.support.v4.app.NotificationCompat.Action.Extender): android.support.v4.app.NotificationCompat.Action.Builder { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Action$Extender;)Landroid/support/v4/app/NotificationCompat$Action$Builder;") }
    /*
    //         .locals 0
    //         invoke-interface {p1, p0}, Landroid/support/v4/app/NotificationCompat$Action$Extender;->extend(Landroid/support/v4/app/NotificationCompat$Action$Builder;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
    //         return-object p0
    */

    public fun getExtras(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;
    //         return-object v0
    */

}
