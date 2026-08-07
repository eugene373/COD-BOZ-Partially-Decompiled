package com.google.android.gms.location

// Auto-emitted from smali.
// 5 fields, 3 methods.

class LocationStatusCodes {
    private constructor()

    companion object {
    @JvmField public val ERROR: Int = 0x1
    @JvmField public val GEOFENCE_NOT_AVAILABLE: Int = 0x3e8
    @JvmField public val GEOFENCE_TOO_MANY_GEOFENCES: Int = 0x3e9
    @JvmField public val GEOFENCE_TOO_MANY_PENDING_INTENTS: Int = 0x3ea
    @JvmField public val SUCCESS: Int = 0

    public @JvmStatic fun ef(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         if-ltz p0, :cond_0
    //         if-le p0, v0, :cond_1
    //         :cond_0
    //         const/16 v1, 0x3e8
    //         if-gt v1, p0, :cond_2
    //         const/16 v1, 0x3ea
    //         if-gt p0, v1, :cond_2
    //         :cond_1
    //         :goto_0
    //         return p0
    //         :cond_2
    //         move p0, v0
    //         goto :goto_0
    */

    public @JvmStatic fun eg(p0: Int): com.google.android.gms.common.api.Status { return TODO("body: (I)Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         :goto_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         return-object v0
    //         :pswitch_0
    //         const/16 p0, 0xd
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    }
}
