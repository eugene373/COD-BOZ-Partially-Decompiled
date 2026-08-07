package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 11 fields, 14 methods.

class NotificationCompat_Action_WearableExtender: android.support.v4.app.NotificationCompat.Action.Extender {
    private var mCancelLabel: CharSequence
    private var mConfirmLabel: CharSequence
    private var mFlags: Int
    private var mInProgressLabel: CharSequence

    public constructor()

    public constructor(action: android.support.v4.app.NotificationCompat.Action)

    private fun setFlag(mask: Int, value: Boolean) { /* TODO(body): (IZ)V */ }
    /*
    //         .locals 2
    //         if-eqz p2, :cond_0
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         or-int/2addr v0, p1
    //         iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         xor-int/lit8 v1, p1, -0x1
    //         and-int/2addr v0, v1
    //         iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         goto :goto_0
    */

    public fun clone(): android.support.v4.app.NotificationCompat.Action.WearableExtender { return TODO("body: ()Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
    //         invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;-><init>()V
    //         .local v0, "that":Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mInProgressLabel:Ljava/lang/CharSequence;
    //         iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mInProgressLabel:Ljava/lang/CharSequence;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mConfirmLabel:Ljava/lang/CharSequence;
    //         iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mConfirmLabel:Ljava/lang/CharSequence;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mCancelLabel:Ljava/lang/CharSequence;
    //         iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mCancelLabel:Ljava/lang/CharSequence;
    //         return-object v0
    */

    public fun clone(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/CloneNotSupportedException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->clone()Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
    //         move-result-object v0
    //         return-object v0
    */

    public fun extend(builder: android.support.v4.app.NotificationCompat.Action.Builder): android.support.v4.app.NotificationCompat.Action.Builder { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Action$Builder;)Landroid/support/v4/app/NotificationCompat$Action$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         .local v0, "wearableBundle":Landroid/os/Bundle;
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         const/4 v2, 0x1
    //         if-eq v1, v2, :cond_0
    //         const-string v1, "flags"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mInProgressLabel:Ljava/lang/CharSequence;
    //         if-eqz v1, :cond_1
    //         const-string v1, "inProgressLabel"
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mInProgressLabel:Ljava/lang/CharSequence;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mConfirmLabel:Ljava/lang/CharSequence;
    //         if-eqz v1, :cond_2
    //         const-string v1, "confirmLabel"
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mConfirmLabel:Ljava/lang/CharSequence;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mCancelLabel:Ljava/lang/CharSequence;
    //         if-eqz v1, :cond_3
    //         const-string v1, "cancelLabel"
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mCancelLabel:Ljava/lang/CharSequence;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
    //         :cond_3
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Action$Builder;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         const-string v2, "android.wearable.EXTENSIONS"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-object p1
    */

    public fun getCancelLabel(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mCancelLabel:Ljava/lang/CharSequence;
    //         return-object v0
    */

    public fun getConfirmLabel(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mConfirmLabel:Ljava/lang/CharSequence;
    //         return-object v0
    */

    public fun getInProgressLabel(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mInProgressLabel:Ljava/lang/CharSequence;
    //         return-object v0
    */

    public fun isAvailableOffline(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
    //         and-int/lit8 v0, v0, 0x1
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setAvailableOffline(availableOffline: Boolean): android.support.v4.app.NotificationCompat.Action.WearableExtender { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setCancelLabel(label: CharSequence): android.support.v4.app.NotificationCompat.Action.WearableExtender { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mCancelLabel:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setConfirmLabel(label: CharSequence): android.support.v4.app.NotificationCompat.Action.WearableExtender { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mConfirmLabel:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setInProgressLabel(label: CharSequence): android.support.v4.app.NotificationCompat.Action.WearableExtender { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mInProgressLabel:Ljava/lang/CharSequence;
    //         return-object p0
    */

    companion object {
    private val DEFAULT_FLAGS: Int = 0x1
    private val EXTRA_WEARABLE_EXTENSIONS: String = "android.wearable.EXTENSIONS"
    private val FLAG_AVAILABLE_OFFLINE: Int = 0x1
    private val KEY_CANCEL_LABEL: String = "cancelLabel"
    private val KEY_CONFIRM_LABEL: String = "confirmLabel"
    private val KEY_FLAGS: String = "flags"
    private val KEY_IN_PROGRESS_LABEL: String = "inProgressLabel"
    }
}
