package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 8 fields, 9 methods.

class NotificationCompat_CarExtender: android.support.v4.app.NotificationCompat.Extender {
    private var mColor: Int
    private var mLargeIcon: android.graphics.Bitmap
    private var mUnreadConversation: android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation

    public constructor()

    public constructor(notif: android.app.Notification)

    public fun extend(builder: android.support.v4.app.NotificationCompat.Builder): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 4
    //         sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v3, 0x15
    //         if-ge v2, v3, :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         .local v1, "carExtensions":Landroid/os/Bundle;
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mLargeIcon:Landroid/graphics/Bitmap;
    //         if-eqz v2, :cond_1
    //         const-string v2, "large_icon"
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mLargeIcon:Landroid/graphics/Bitmap;
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         :cond_1
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mColor:I
    //         if-eqz v2, :cond_2
    //         const-string v2, "app_color"
    //         iget v3, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mColor:I
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_2
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mUnreadConversation:Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;
    //         if-eqz v2, :cond_3
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         move-result-object v2
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mUnreadConversation:Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;
    //         invoke-interface {v2, v3}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getBundleForUnreadConversation(Landroid/support/v4/app/NotificationCompatBase$UnreadConversation;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "b":Landroid/os/Bundle;
    //         const-string v2, "car_conversation"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         .end local v0    # "b":Landroid/os/Bundle;
    //         :cond_3
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "android.car.EXTENSIONS"
    //         invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun getColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mColor:I
    //         return v0
    */

    public fun getLargeIcon(): android.graphics.Bitmap { return TODO("body: ()Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mLargeIcon:Landroid/graphics/Bitmap;
    //         return-object v0
    */

    public fun getUnreadConversation(): android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation { return TODO("body: ()Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mUnreadConversation:Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;
    //         return-object v0
    */

    public fun setColor(color: Int): android.support.v4.app.NotificationCompat.CarExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$CarExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mColor:I
    //         return-object p0
    */

    public fun setLargeIcon(largeIcon: android.graphics.Bitmap): android.support.v4.app.NotificationCompat.CarExtender { return TODO("body: (Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$CarExtender;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mLargeIcon:Landroid/graphics/Bitmap;
    //         return-object p0
    */

    public fun setUnreadConversation(unreadConversation: android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation): android.support.v4.app.NotificationCompat.CarExtender { return TODO("body: (Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;)Landroid/support/v4/app/NotificationCompat$CarExtender;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$CarExtender;->mUnreadConversation:Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;
    //         return-object p0
    */

    companion object {
    private val EXTRA_CAR_EXTENDER: String = "android.car.EXTENSIONS"
    private val EXTRA_COLOR: String = "app_color"
    private val EXTRA_CONVERSATION: String = "car_conversation"
    private val EXTRA_LARGE_ICON: String = "large_icon"
    private val TAG: String = "CarExtender"
    }
}
