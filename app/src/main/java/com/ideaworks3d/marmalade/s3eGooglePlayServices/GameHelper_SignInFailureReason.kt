package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: GameHelper.java.
// 3 fields, 5 methods.

open class GameHelper_SignInFailureReason {
    var mActivityResultCode: Int = 0
    var mServiceErrorCode: Int = 0

    public constructor(p0: Int)

    public constructor(p0: Int, p1: Int)

    public fun getActivityResultCode(): Int { return 0 }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I
    //         return v0
    */

    public fun getServiceErrorCode(): Int { return 0 }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mServiceErrorCode:I
    //         return v0
    */

    override public fun toString(): String { return "" }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "SignInFailureReason(serviceErrorCode:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mServiceErrorCode:I
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I
    //         const/16 v2, -0x64
    //         if-ne v0, v2, :cond_0
    //         const-string v0, ")"
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, ",activityResultCode:"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ")"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val NO_ACTIVITY_RESULT_CODE: Int = 0
    }
}