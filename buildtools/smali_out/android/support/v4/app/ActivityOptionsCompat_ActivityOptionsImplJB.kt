package android.support.v4.app

// Auto-emitted from smali source: ActivityOptionsCompat.java.
// 1 fields, 3 methods.

open class ActivityOptionsCompat_ActivityOptionsImplJB: android.support.v4.app.ActivityOptionsCompat() {
    private val mImpl: android.support.v4.app.ActivityOptionsCompatJB

    constructor(impl: android.support.v4.app.ActivityOptionsCompatJB)

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         invoke-virtual {v0}, Landroid/support/v4/app/ActivityOptionsCompatJB;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun update(otherOptions: android.support.v4.app.ActivityOptionsCompat) { /* TODO(body): (Landroid/support/v4/app/ActivityOptionsCompat;)V */ }
    /*
    //         .locals 3
    //         instance-of v1, p1, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    //         if-eqz v1, :cond_0
    //         move-object v0, p1
    //         check-cast v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    //         .local v0, "otherImpl":Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    //         iget-object v1, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         iget-object v2, v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/app/ActivityOptionsCompatJB;->update(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
    //         .end local v0    # "otherImpl":Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    //         :cond_0
    //         return-void
    */

}
