// Auto-emitted from smali source: s3eFacebook.java.
// 7 fields, 5 methods.

enum class s3eFacebook_s3eFacebookAudience {
    EVERYONE,
    FRIENDS,
    NONE,
    ONLY_ME,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: Int, p1: com.facebook.SessionDefaultAudience)
    // instance fields (declare as constructor params or properties):
    //   private var _audience: Int
    //   private var _fbAudience: com.facebook.SessionDefaultAudience
    companion object {
    public @JvmStatic fun fromInt(p0: Int): com.facebook.SessionDefaultAudience { return TODO("body: (I)Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 5
    //         invoke-static {}, Ls3eFacebook$s3eFacebookAudience;->values()[Ls3eFacebook$s3eFacebookAudience;
    //         move-result-object v1
    //         array-length v2, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_1
    //         aget-object v3, v1, v0
    //         iget v4, v3, Ls3eFacebook$s3eFacebookAudience;->_audience:I
    //         if-ne v4, p0, :cond_0
    //         iget-object v0, v3, Ls3eFacebook$s3eFacebookAudience;->_fbAudience:Lcom/facebook/SessionDefaultAudience;
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         sget-object v0, Lcom/facebook/SessionDefaultAudience;->NONE:Lcom/facebook/SessionDefaultAudience;
    //         goto :goto_1
    */

    public @JvmStatic fun valueOf(p0: String): s3eFacebook.s3eFacebookAudience { return TODO("body: (Ljava/lang/String;)Ls3eFacebook$s3eFacebookAudience;") }
    /*
    //         .locals 1
    //         const-class v0, Ls3eFacebook$s3eFacebookAudience;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Ls3eFacebook$s3eFacebookAudience;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<s3eFacebook.s3eFacebookAudience> { return TODO("body: ()[Ls3eFacebook$s3eFacebookAudience;") }
    /*
    //         .locals 1
    //         sget-object v0, Ls3eFacebook$s3eFacebookAudience;->$VALUES:[Ls3eFacebook$s3eFacebookAudience;
    //         invoke-virtual {v0}, [Ls3eFacebook$s3eFacebookAudience;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ls3eFacebook$s3eFacebookAudience;
    //         return-object v0
    */

    }
}
