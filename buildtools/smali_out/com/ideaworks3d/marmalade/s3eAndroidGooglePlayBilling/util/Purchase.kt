package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util

// Auto-emitted from smali source: Purchase.java.
// 10 fields, 13 methods.

open class Purchase {
    var mDeveloperPayload: String
    var mItemType: String
    var mOrderId: String
    var mOriginalJson: String
    var mPackageName: String
    var mPurchaseState: Int
    var mPurchaseTime: Long
    var mSignature: String
    var mSku: String
    var mToken: String

    public constructor(p0: String)

    public constructor(p0: String, p1: String, p2: String)

    public fun getDeveloperPayload(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mDeveloperPayload:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mItemType:Ljava/lang/String;
    //         return-object v0
    */

    public fun getOrderId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mOrderId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getOriginalJson(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mOriginalJson:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mPackageName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPurchaseState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mPurchaseState:I
    //         return v0
    */

    public fun getPurchaseTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mPurchaseTime:J
    //         return-wide v0
    */

    public fun getSignature(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mSignature:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSku(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mSku:Ljava/lang/String;
    //         return-object v0
    */

    public fun getToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mToken:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "PurchaseInfo(type:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mItemType:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "):"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->mOriginalJson:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
