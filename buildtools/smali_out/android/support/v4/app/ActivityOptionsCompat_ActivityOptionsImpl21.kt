package android.support.v4.app

// Auto-emitted from smali source: ActivityOptionsCompat.java.
// 1 fields, 3 methods.

open class ActivityOptionsCompat_ActivityOptionsImpl21: android.support.v4.app.ActivityOptionsCompat() {
    private val mImpl: android.support.v4.app.ActivityOptionsCompat21

    constructor(impl: android.support.v4.app.ActivityOptionsCompat21)

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;->mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;
    //         invoke-virtual {v0}, Landroid/support/v4/app/ActivityOptionsCompat21;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun update(otherOptions: android.support.v4.app.ActivityOptionsCompat) { /* TODO(body): (Landroid/support/v4/app/ActivityOptionsCompat;)V */ }
    /*
    //         .locals 3
    //         instance-of v1, p1, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;
    //         if-eqz v1, :cond_0
    //         move-object v0, p1
    //         check-cast v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;
    //         .local v0, "otherImpl":Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;
    //         iget-object v1, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;->mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;
    //         iget-object v2, v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;->mImpl:Landroid/support/v4/app/ActivityOptionsCompat21;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/app/ActivityOptionsCompat21;->update(Landroid/support/v4/app/ActivityOptionsCompat21;)V
    //         .end local v0    # "otherImpl":Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImpl21;
    //         :cond_0
    //         return-void
    */

}
