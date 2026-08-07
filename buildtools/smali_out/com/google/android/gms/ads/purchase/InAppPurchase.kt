package com.google.android.gms.ads.purchase

// Auto-emitted from smali.
// 4 fields, 3 methods.

interface InAppPurchase {
    public fun getProductId(): String

    public fun recordPlayBillingResolution(p0: Int)

    public fun recordResolution(p0: Int)

    companion object {
    @JvmField public val RESOLUTION_CANCELED: Int = 0x2
    @JvmField public val RESOLUTION_FAILURE: Int = 0x0
    @JvmField public val RESOLUTION_INVALID_PRODUCT: Int = 0x3
    @JvmField public val RESOLUTION_SUCCESS: Int = 0x1
    }
}
