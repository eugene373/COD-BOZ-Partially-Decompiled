package com.android.vending.billing

// Auto-emitted from smali source: IInAppBillingService.java.
// 0 fields, 5 methods.

interface IInAppBillingService: android.os.IInterface {
    public fun consumePurchase(p0: Int, p1: String, p2: String): Int

    public fun getBuyIntent(p0: Int, p1: String, p2: String, p3: String, p4: String): android.os.Bundle

    public fun getPurchases(p0: Int, p1: String, p2: String, p3: String): android.os.Bundle

    public fun getSkuDetails(p0: Int, p1: String, p2: String, p3: android.os.Bundle): android.os.Bundle

    public fun isBillingSupported(p0: Int, p1: String, p2: String): Int

}
