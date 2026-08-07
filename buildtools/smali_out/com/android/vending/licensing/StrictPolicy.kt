package com.android.vending.licensing

// Auto-emitted from smali source: StrictPolicy.java.
// 1 fields, 3 methods.

open class StrictPolicy: com.android.vending.licensing.Policy {
    private var mLastResponse: Int

    public constructor()

    public fun allowAccess(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/android/vending/licensing/StrictPolicy;->mLastResponse:I
    //         const/16 v1, 0x100
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun processServerResponse(p0: Int, p1: com.android.vending.licensing.ResponseData) { /* TODO(body): (ILcom/android/vending/licensing/ResponseData;)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/android/vending/licensing/StrictPolicy;->mLastResponse:I
    //         return-void
    */

}
