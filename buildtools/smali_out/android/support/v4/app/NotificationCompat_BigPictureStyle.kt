package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 3 fields, 6 methods.

open class NotificationCompat_BigPictureStyle: android.support.v4.app.NotificationCompat.Style() {
    var mBigLargeIcon: android.graphics.Bitmap
    var mBigLargeIconSet: Boolean
    var mPicture: android.graphics.Bitmap

    public constructor()

    public constructor(builder: android.support.v4.app.NotificationCompat.Builder)

    public fun bigLargeIcon(b: android.graphics.Bitmap): android.support.v4.app.NotificationCompat.BigPictureStyle { return TODO("body: (Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;") }
    /*
    //         .locals 1
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIcon:Landroid/graphics/Bitmap;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIconSet:Z
    //         return-object p0
    */

    public fun bigPicture(b: android.graphics.Bitmap): android.support.v4.app.NotificationCompat.BigPictureStyle { return TODO("body: (Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mPicture:Landroid/graphics/Bitmap;
    //         return-object p0
    */

    public fun setBigContentTitle(title: CharSequence): android.support.v4.app.NotificationCompat.BigPictureStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigContentTitle:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setSummaryText(cs: CharSequence): android.support.v4.app.NotificationCompat.BigPictureStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryText:Ljava/lang/CharSequence;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryTextSet:Z
    //         return-object p0
    */

}
