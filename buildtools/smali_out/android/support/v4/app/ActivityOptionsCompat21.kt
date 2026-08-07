package android.support.v4.app

// Auto-emitted from smali source: ActivityOptionsCompat21.java.
// 1 fields, 5 methods.

open class ActivityOptionsCompat21 {
    private val mActivityOptions: android.app.ActivityOptions

    private constructor(activityOptions: android.app.ActivityOptions)

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat21;->mActivityOptions:Landroid/app/ActivityOptions;
    //         invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun update(otherOptions: android.support.v4.app.ActivityOptionsCompat21) { /* TODO(body): (Landroid/support/v4/app/ActivityOptionsCompat21;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat21;->mActivityOptions:Landroid/app/ActivityOptions;
    //         iget-object v1, p1, Landroid/support/v4/app/ActivityOptionsCompat21;->mActivityOptions:Landroid/app/ActivityOptions;
    //         invoke-virtual {v0, v1}, Landroid/app/ActivityOptions;->update(Landroid/app/ActivityOptions;)V
    //         return-void
    */

    companion object {
    public @JvmStatic fun makeSceneTransitionAnimation(activity: android.app.Activity, sharedElement: android.view.View, sharedElementName: String): android.support.v4.app.ActivityOptionsCompat21 { return TODO("body: (Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat21;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat21;
    //         invoke-static {p0, p1, p2}, Landroid/app/ActivityOptions;->makeSceneTransitionAnimation(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)Landroid/app/ActivityOptions;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat21;-><init>(Landroid/app/ActivityOptions;)V
    //         return-object v0
    */

    public @JvmStatic fun makeSceneTransitionAnimation(activity: android.app.Activity, sharedElements: Array<android.view.View>, sharedElementNames: Array<String>): android.support.v4.app.ActivityOptionsCompat21 { return TODO("body: (Landroid/app/Activity;[Landroid/view/View;[Ljava/lang/String;)Landroid/support/v4/app/ActivityOptionsCompat21;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         .local v1, "pairs":[Landroid/util/Pair;
    //         if-eqz p1, :cond_0
    //         array-length v2, p1
    //         new-array v1, v2, [Landroid/util/Pair;
    //         const/4 v0, 0x0
    //         .local v0, "i":I
    //         :goto_0
    //         array-length v2, v1
    //         if-ge v0, v2, :cond_0
    //         aget-object v2, p1, v0
    //         aget-object v3, p2, v0
    //         invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //         move-result-object v2
    //         aput-object v2, v1, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         .end local v0    # "i":I
    //         :cond_0
    //         new-instance v2, Landroid/support/v4/app/ActivityOptionsCompat21;
    //         invoke-static {p0, v1}, Landroid/app/ActivityOptions;->makeSceneTransitionAnimation(Landroid/app/Activity;[Landroid/util/Pair;)Landroid/app/ActivityOptions;
    //         move-result-object v3
    //         invoke-direct {v2, v3}, Landroid/support/v4/app/ActivityOptionsCompat21;-><init>(Landroid/app/ActivityOptions;)V
    //         return-object v2
    */

    }
}
