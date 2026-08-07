package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 42 fields, 42 methods.

class NotificationCompat_WearableExtender: android.support.v4.app.NotificationCompat.Extender {
    private var mActions: java.util.ArrayList
    private var mBackground: android.graphics.Bitmap
    private var mContentActionIndex: Int
    private var mContentIcon: Int
    private var mContentIconGravity: Int
    private var mCustomContentHeight: Int
    private var mCustomSizePreset: Int
    private var mDisplayIntent: android.app.PendingIntent
    private var mFlags: Int
    private var mGravity: Int
    private var mHintScreenTimeout: Int
    private var mPages: java.util.ArrayList

    public constructor()

    public constructor(notif: android.app.Notification)

    private fun setFlag(mask: Int, value: Boolean) { /* TODO(body): (IZ)V */ }
    /*
    //         .locals 2
    //         if-eqz p2, :cond_0
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         or-int/2addr v0, p1
    //         iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         xor-int/lit8 v1, p1, -0x1
    //         and-int/2addr v0, v1
    //         iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         goto :goto_0
    */

    public fun addAction(action: android.support.v4.app.NotificationCompat.Action): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Action;)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addActions(p0: java.util.List): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Ljava/util/List;)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/support/v4/app/NotificationCompat$Action;",
    //                 ">;)",
    //                 "Landroid/support/v4/app/NotificationCompat$WearableExtender;"
    //             }
    //         .end annotation
    //         .local p1, "actions":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/app/NotificationCompat$Action;>;"
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun addPage(page: android.app.Notification): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Landroid/app/Notification;)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addPages(p0: java.util.List): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Ljava/util/List;)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/app/Notification;",
    //                 ">;)",
    //                 "Landroid/support/v4/app/NotificationCompat$WearableExtender;"
    //             }
    //         .end annotation
    //         .local p1, "pages":Ljava/util/List;, "Ljava/util/List<Landroid/app/Notification;>;"
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun clearActions(): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: ()Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    //         return-object p0
    */

    public fun clearPages(): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: ()Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    //         return-object p0
    */

    public fun clone(): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: ()Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;
    //         invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$WearableExtender;-><init>()V
    //         .local v0, "that":Landroid/support/v4/app/NotificationCompat$WearableExtender;
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
    //         iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
    //         iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mHintScreenTimeout:I
    //         iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mHintScreenTimeout:I
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
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->clone()Landroid/support/v4/app/NotificationCompat$WearableExtender;
    //         move-result-object v0
    //         return-object v0
    */

    public fun extend(builder: android.support.v4.app.NotificationCompat.Builder): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 5
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         .local v0, "wearableBundle":Landroid/os/Bundle;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v2, "actions"
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         move-result-object v3
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
    //         move-result v4
    //         new-array v4, v4, [Landroid/support/v4/app/NotificationCompat$Action;
    //         invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, [Landroid/support/v4/app/NotificationCompat$Action;
    //         invoke-interface {v3, v1}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompat$Action;)Ljava/util/ArrayList;
    //         move-result-object v1
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         :cond_0
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         const/4 v2, 0x1
    //         if-eq v1, v2, :cond_1
    //         const-string v1, "flags"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
    //         if-eqz v1, :cond_2
    //         const-string v1, "displayIntent"
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v1
    //         if-nez v1, :cond_3
    //         const-string v2, "pages"
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         new-array v3, v3, [Landroid/app/Notification;
    //         invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, [Landroid/os/Parcelable;
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //         :cond_3
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
    //         if-eqz v1, :cond_4
    //         const-string v1, "background"
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         :cond_4
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
    //         if-eqz v1, :cond_5
    //         const-string v1, "contentIcon"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_5
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
    //         const v2, 0x800005
    //         if-eq v1, v2, :cond_6
    //         const-string v1, "contentIconGravity"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_6
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
    //         const/4 v2, -0x1
    //         if-eq v1, v2, :cond_7
    //         const-string v1, "contentActionIndex"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_7
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
    //         if-eqz v1, :cond_8
    //         const-string v1, "customSizePreset"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_8
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
    //         if-eqz v1, :cond_9
    //         const-string v1, "customContentHeight"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_9
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
    //         const/16 v2, 0x50
    //         if-eq v1, v2, :cond_a
    //         const-string v1, "gravity"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_a
    //         iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mHintScreenTimeout:I
    //         if-eqz v1, :cond_b
    //         const-string v1, "hintScreenTimeout"
    //         iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mHintScreenTimeout:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_b
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         const-string v2, "android.wearable.EXTENSIONS"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-object p1
    */

    public fun getActions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/support/v4/app/NotificationCompat$Action;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getBackground(): android.graphics.Bitmap { return TODO("body: ()Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
    //         return-object v0
    */

    public fun getContentAction(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
    //         return v0
    */

    public fun getContentIcon(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
    //         return v0
    */

    public fun getContentIconGravity(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
    //         return v0
    */

    public fun getContentIntentAvailableOffline(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         and-int/lit8 v0, v0, 0x1
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getCustomContentHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
    //         return v0
    */

    public fun getCustomSizePreset(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
    //         return v0
    */

    public fun getDisplayIntent(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun getGravity(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
    //         return v0
    */

    public fun getHintAvoidBackgroundClipping(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         and-int/lit8 v0, v0, 0x10
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getHintHideIcon(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         and-int/lit8 v0, v0, 0x2
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getHintScreenTimeout(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mHintScreenTimeout:I
    //         return v0
    */

    public fun getHintShowBackgroundOnly(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         and-int/lit8 v0, v0, 0x4
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getPages(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/app/Notification;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getStartScrollBottom(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
    //         and-int/lit8 v0, v0, 0x8
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setBackground(background: android.graphics.Bitmap): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
    //         return-object p0
    */

    public fun setContentAction(actionIndex: Int): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
    //         return-object p0
    */

    public fun setContentIcon(icon: Int): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
    //         return-object p0
    */

    public fun setContentIconGravity(contentIconGravity: Int): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
    //         return-object p0
    */

    public fun setContentIntentAvailableOffline(contentIntentAvailableOffline: Boolean): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setCustomContentHeight(height: Int): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
    //         return-object p0
    */

    public fun setCustomSizePreset(sizePreset: Int): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
    //         return-object p0
    */

    public fun setDisplayIntent(intent: android.app.PendingIntent): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
    //         return-object p0
    */

    public fun setGravity(gravity: Int): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
    //         return-object p0
    */

    public fun setHintAvoidBackgroundClipping(hintAvoidBackgroundClipping: Boolean): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         const/16 v0, 0x10
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setHintHideIcon(hintHideIcon: Boolean): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x2
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setHintScreenTimeout(timeout: Int): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mHintScreenTimeout:I
    //         return-object p0
    */

    public fun setHintShowBackgroundOnly(hintShowBackgroundOnly: Boolean): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setStartScrollBottom(startScrollBottom: Boolean): android.support.v4.app.NotificationCompat.WearableExtender { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;") }
    /*
    //         .locals 1
    //         const/16 v0, 0x8
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
    //         return-object p0
    */

    companion object {
    private val DEFAULT_CONTENT_ICON_GRAVITY: Int = 0x800005
    private val DEFAULT_FLAGS: Int = 0x1
    private val DEFAULT_GRAVITY: Int = 0x50
    private val EXTRA_WEARABLE_EXTENSIONS: String = "android.wearable.EXTENSIONS"
    private val FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE: Int = 0x1
    private val FLAG_HINT_AVOID_BACKGROUND_CLIPPING: Int = 0x10
    private val FLAG_HINT_HIDE_ICON: Int = 0x2
    private val FLAG_HINT_SHOW_BACKGROUND_ONLY: Int = 0x4
    private val FLAG_START_SCROLL_BOTTOM: Int = 0x8
    private val KEY_ACTIONS: String = "actions"
    private val KEY_BACKGROUND: String = "background"
    private val KEY_CONTENT_ACTION_INDEX: String = "contentActionIndex"
    private val KEY_CONTENT_ICON: String = "contentIcon"
    private val KEY_CONTENT_ICON_GRAVITY: String = "contentIconGravity"
    private val KEY_CUSTOM_CONTENT_HEIGHT: String = "customContentHeight"
    private val KEY_CUSTOM_SIZE_PRESET: String = "customSizePreset"
    private val KEY_DISPLAY_INTENT: String = "displayIntent"
    private val KEY_FLAGS: String = "flags"
    private val KEY_GRAVITY: String = "gravity"
    private val KEY_HINT_SCREEN_TIMEOUT: String = "hintScreenTimeout"
    private val KEY_PAGES: String = "pages"
    @JvmField public val SCREEN_TIMEOUT_LONG: Int = 0
    @JvmField public val SCREEN_TIMEOUT_SHORT: Int = 0x0
    @JvmField public val SIZE_DEFAULT: Int = 0x0
    @JvmField public val SIZE_FULL_SCREEN: Int = 0x5
    @JvmField public val SIZE_LARGE: Int = 0x4
    @JvmField public val SIZE_MEDIUM: Int = 0x3
    @JvmField public val SIZE_SMALL: Int = 0x2
    @JvmField public val SIZE_XSMALL: Int = 0x1
    @JvmField public val UNSET_ACTION_INDEX: Int = 0
    }
}
