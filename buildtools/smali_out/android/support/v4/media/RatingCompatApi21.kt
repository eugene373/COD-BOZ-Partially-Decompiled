package android.support.v4.media

// Auto-emitted from smali source: RatingCompatApi21.java.
// 0 fields, 12 methods.

open class RatingCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun getPercentRating(ratingObj: Object): Float { return TODO("body: (Ljava/lang/Object;)F") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/Rating;
    //         .end local p0    # "ratingObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/Rating;->getPercentRating()F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getRatingStyle(ratingObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/Rating;
    //         .end local p0    # "ratingObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/Rating;->getRatingStyle()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getStarRating(ratingObj: Object): Float { return TODO("body: (Ljava/lang/Object;)F") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/Rating;
    //         .end local p0    # "ratingObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/Rating;->getStarRating()F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun hasHeart(ratingObj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/Rating;
    //         .end local p0    # "ratingObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/Rating;->hasHeart()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isRated(ratingObj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/Rating;
    //         .end local p0    # "ratingObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/Rating;->isRated()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isThumbUp(ratingObj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/Rating;
    //         .end local p0    # "ratingObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/Rating;->isThumbUp()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun newHeartRating(hasHeart: Boolean): Object { return TODO("body: (Z)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Landroid/media/Rating;->newHeartRating(Z)Landroid/media/Rating;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newPercentageRating(percent: Float): Object { return TODO("body: (F)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Landroid/media/Rating;->newPercentageRating(F)Landroid/media/Rating;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newStarRating(starRatingStyle: Int, starRating: Float): Object { return TODO("body: (IF)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Landroid/media/Rating;->newStarRating(IF)Landroid/media/Rating;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newThumbRating(thumbIsUp: Boolean): Object { return TODO("body: (Z)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Landroid/media/Rating;->newThumbRating(Z)Landroid/media/Rating;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newUnratedRating(ratingStyle: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Landroid/media/Rating;->newUnratedRating(I)Landroid/media/Rating;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
