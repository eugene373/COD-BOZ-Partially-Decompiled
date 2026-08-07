package android.support.v4.app

// Auto-emitted from smali source: ActivityOptionsCompat.java.
// 0 fields, 8 methods.

open class ActivityOptionsCompat {
    protected constructor()

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun update(otherOptions: android.support.v4.app.ActivityOptionsCompat) { /* TODO(body): (Landroid/support/v4/app/ActivityOptionsCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    companion object {
    public @JvmStatic fun makeCustomAnimation(context: android.content.Context, enterResId: Int, exitResId: Int): android.support.v4.app.ActivityOptionsCompat { return TODO("body: (Landroid/content/Context;II)Landroid/support/v4/app/ActivityOptionsCompat;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x10
    //         if-lt v0, v1, :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    //         invoke-static {p0, p1, p2}, Landroid/support/v4/app/ActivityOptionsCompatJB;->makeCustomAnimation(Landroid/content/Context;II)Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;-><init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat;
    //         invoke-direct {v0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
    //         goto :goto_0
    */

    public @JvmStatic fun makeScaleUpAnimation(source: android.view.View, startX: Int, startY: Int, startWidth: Int, startHeight: Int): android.support.v4.app.ActivityOptionsCompat { return TODO("body: (Landroid/view/View;IIII)Landroid/support/v4/app/ActivityOptionsCompat;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x10
    //         if-lt v0, v1, :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    //         invoke-static {p0, p1, p2, p3, p4}, Landroid/support/v4/app/ActivityOptionsCompatJB;->makeScaleUpAnimation(Landroid/view/View;IIII)Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;-><init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat;
    //         invoke-direct {v0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
    //         goto :goto_0
    */

    public @JvmStatic fun makeSceneTransitionAnimation(activity: android.app.Activity, sharedElement: android.view.View, sharedElementName: String): android.support.v4.app.ActivityOptionsCompat { return TODO("body: (Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;
    //         invoke-static {p0, p1, p2}, Landroid/support/v4/app/ActivityOptionsCompat21;->makeSceneTransitionAnimation(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat21;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;-><init>(Landroid/support/v4/app/ActivityOptionsCompat21;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat;
    //         invoke-direct {v0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
    //         goto :goto_0
    */

    public @JvmStatic fun makeSceneTransitionAnimation(activity: android.app.Activity, p1: Array<android.support.v4.util.Pair>): android.support.v4.app.ActivityOptionsCompat { return TODO("body: (Landroid/app/Activity;[Landroid/support/v4/util/Pair;)Landroid/support/v4/app/ActivityOptionsCompat;") }
    /*
    //         .locals 5
    //         .local p1, "sharedElements":[Landroid/support/v4/util/Pair;, "[Landroid/support/v4/util/Pair<Landroid/view/View;Ljava/lang/String;>;"
    //         sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v4, 0x15
    //         if-lt v3, v4, :cond_1
    //         const/4 v2, 0x0
    //         .local v2, "views":[Landroid/view/View;
    //         const/4 v1, 0x0
    //         .local v1, "names":[Ljava/lang/String;
    //         if-eqz p1, :cond_0
    //         array-length v3, p1
    //         new-array v2, v3, [Landroid/view/View;
    //         array-length v3, p1
    //         new-array v1, v3, [Ljava/lang/String;
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         array-length v3, p1
    //         if-ge v0, v3, :cond_0
    //         aget-object v3, p1, v0
    //         iget-object v3, v3, Landroid/support/v4/util/Pair;->first:Ljava/lang/Object;
    //         check-cast v3, Landroid/view/View;
    //         aput-object v3, v2, v0
    //         aget-object v3, p1, v0
    //         iget-object v3, v3, Landroid/support/v4/util/Pair;->second:Ljava/lang/Object;
    //         check-cast v3, Ljava/lang/String;
    //         aput-object v3, v1, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         .end local v0    # "i":I
    //         :cond_0
    //         new-instance v3, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;
    //         invoke-static {p0, v2, v1}, Landroid/support/v4/app/ActivityOptionsCompat21;->makeSceneTransitionAnimation(Landroid/app/Activity;[Landroid/view/View;[Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat21;
    //         move-result-object v4
    //         invoke-direct {v3, v4}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;-><init>(Landroid/support/v4/app/ActivityOptionsCompat21;)V
    //         .end local v1    # "names":[Ljava/lang/String;
    //         .end local v2    # "views":[Landroid/view/View;
    //         :goto_1
    //         return-object v3
    //         :cond_1
    //         new-instance v3, Landroid/support/v4/app/ActivityOptionsCompat;
    //         invoke-direct {v3}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
    //         goto :goto_1
    */

    public @JvmStatic fun makeThumbnailScaleUpAnimation(source: android.view.View, thumbnail: android.graphics.Bitmap, startX: Int, startY: Int): android.support.v4.app.ActivityOptionsCompat { return TODO("body: (Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/support/v4/app/ActivityOptionsCompat;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x10
    //         if-lt v0, v1, :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    //         invoke-static {p0, p1, p2, p3}, Landroid/support/v4/app/ActivityOptionsCompatJB;->makeThumbnailScaleUpAnimation(Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;-><init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat;
    //         invoke-direct {v0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
    //         goto :goto_0
    */

    }
}
