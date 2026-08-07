package com.google.android.gms.common.api

// Auto-emitted from smali.
// 17 fields, 2 methods.

open class CommonStatusCodes {
    public constructor()

    companion object {
    @JvmField public val CANCELED: Int = 0x10
    @JvmField public val DEVELOPER_ERROR: Int = 0xa
    @JvmField public val ERROR: Int = 0xd
    @JvmField public val INTERNAL_ERROR: Int = 0x8
    @JvmField public val INTERRUPTED: Int = 0xe
    @JvmField public val INVALID_ACCOUNT: Int = 0x5
    @JvmField public val LICENSE_CHECK_FAILED: Int = 0xb
    @JvmField public val NETWORK_ERROR: Int = 0x7
    @JvmField public val RESOLUTION_REQUIRED: Int = 0x6
    @JvmField public val SERVICE_DISABLED: Int = 0x3
    @JvmField public val SERVICE_INVALID: Int = 0x9
    @JvmField public val SERVICE_MISSING: Int = 0x1
    @JvmField public val SERVICE_VERSION_UPDATE_REQUIRED: Int = 0x2
    @JvmField public val SIGN_IN_REQUIRED: Int = 0x4
    @JvmField public val SUCCESS: Int = 0x0
    @JvmField public val SUCCESS_CACHE: Int = 0
    @JvmField public val TIMEOUT: Int = 0xf

    public @JvmStatic fun getStatusCodeString(statusCode: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         sparse-switch p0, :sswitch_data_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "unknown status code: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :sswitch_0
    //         const-string v0, "SUCCESS_CACHE"
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "SUCCESS"
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "SERVICE_MISSING"
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "SERVICE_VERSION_UPDATE_REQUIRED"
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "SERVICE_DISABLED"
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "SIGN_IN_REQUIRED"
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "INVALID_ACCOUNT"
    //         goto :goto_0
    //         :sswitch_7
    //         const-string v0, "RESOLUTION_REQUIRED"
    //         goto :goto_0
    //         :sswitch_8
    //         const-string v0, "NETWORK_ERROR"
    //         goto :goto_0
    //         :sswitch_9
    //         const-string v0, "INTERNAL_ERROR"
    //         goto :goto_0
    //         :sswitch_a
    //         const-string v0, "SERVICE_INVALID"
    //         goto :goto_0
    //         :sswitch_b
    //         const-string v0, "DEVELOPER_ERROR"
    //         goto :goto_0
    //         :sswitch_c
    //         const-string v0, "LICENSE_CHECK_FAILED"
    //         goto :goto_0
    //         :sswitch_d
    //         const-string v0, "ERROR"
    //         goto :goto_0
    //         :sswitch_e
    //         const-string v0, "INTERRUPTED"
    //         goto :goto_0
    //         :sswitch_f
    //         const-string v0, "TIMEOUT"
    //         goto :goto_0
    //         :sswitch_10
    //         const-string v0, "CANCELED"
    //         goto :goto_0
    //         :sswitch_11
    //         const-string v0, "AUTH_API_INVALID_CREDENTIALS"
    //         goto :goto_0
    //         :sswitch_12
    //         const-string v0, "AUTH_API_ACCESS_FORBIDDEN"
    //         goto :goto_0
    //         :sswitch_13
    //         const-string v0, "AUTH_API_CLIENT_ERROR"
    //         goto :goto_0
    //         :sswitch_14
    //         const-string v0, "AUTH_API_SERVER_ERROR"
    //         goto :goto_0
    //         :sswitch_15
    //         const-string v0, "AUTH_TOKEN_ERROR"
    //         goto :goto_0
    //         :sswitch_16
    //         const-string v0, "AUTH_URL_RESOLUTION"
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             -0x1 -> :sswitch_0
    //             0x0 -> :sswitch_1
    //             0x1 -> :sswitch_2
    //             0x2 -> :sswitch_3
    //             0x3 -> :sswitch_4
    //             0x4 -> :sswitch_5
    //             0x5 -> :sswitch_6
    //             0x6 -> :sswitch_7
    //             0x7 -> :sswitch_8
    //             0x8 -> :sswitch_9
    //             0x9 -> :sswitch_a
    //             0xa -> :sswitch_b
    //             0xb -> :sswitch_c
    //             0xd -> :sswitch_d
    //             0xe -> :sswitch_e
    //             0xf -> :sswitch_f
    //             0x10 -> :sswitch_10
    //             0xbb8 -> :sswitch_11
    //             0xbb9 -> :sswitch_12
    //             0xbba -> :sswitch_13
    //             0xbbb -> :sswitch_14
    //             0xbbc -> :sswitch_15
    //             0xbbd -> :sswitch_16
    //         .end sparse-switch
    */

    }
}
