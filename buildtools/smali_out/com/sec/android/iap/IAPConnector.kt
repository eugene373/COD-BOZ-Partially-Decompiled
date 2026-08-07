package com.sec.android.iap

// Auto-emitted from smali source: IAPConnector.java.
// 0 fields, 5 methods.

interface IAPConnector: android.os.IInterface {
    public fun getItemList(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String): android.os.Bundle

    public fun getItemsInbox(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): android.os.Bundle

    public fun init(p0: Int): android.os.Bundle

    public fun requestCmd(p0: com.sec.android.iap.IAPServiceCallback, p1: android.os.Bundle): Boolean

    public fun unregisterCallback(p0: com.sec.android.iap.IAPServiceCallback): Boolean

}
