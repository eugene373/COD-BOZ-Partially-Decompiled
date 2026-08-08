package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: GameHelperUtils.java.
// 6 fields, 9 methods.

open class GameHelperUtils {
    constructor()

    companion object {
    private val FALLBACK_STRINGS: Array<String> = null!!
    private val RES_IDS: IntArray = null!!
    @JvmField public val R_APP_MISCONFIGURED: Int = 0x2
    @JvmField public val R_LICENSE_FAILED: Int = 0x3
    @JvmField public val R_SIGN_IN_FAILED: Int = 0x1
    @JvmField public val R_UNKNOWN_ERROR: Int = 0

    @JvmStatic fun activityResponseCodeToString(p0: Int): String { return "" }
    /*
    //         .locals 1
    //         sparse-switch p0, :sswitch_data_0
    //         invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :sswitch_0
    //         const-string v0, "RESULT_OK"
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "RESULT_CANCELED"
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "RESULT_APP_MISCONFIGURED"
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "RESULT_LEFT_ROOM"
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "RESULT_LICENSE_FAILED"
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "RESULT_RECONNECT_REQUIRED"
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "SIGN_IN_FAILED"
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             -0x1 -> :sswitch_0
    //             0x0 -> :sswitch_1
    //             0x2711 -> :sswitch_5
    //             0x2712 -> :sswitch_6
    //             0x2713 -> :sswitch_4
    //             0x2714 -> :sswitch_2
    //             0x2715 -> :sswitch_3
    //         .end sparse-switch
    */

    @JvmStatic fun byteToString(p0: StringBuilder, p1: Byte) { /* TODO(body): (Ljava/lang/StringBuilder;B)V */ }
    /*
    //         .locals 4
    //         if-gez p1, :cond_0
    //         add-int/lit16 p1, p1, 0x100
    //         :cond_0
    //         div-int/lit8 v0, p1, 0x10
    //         rem-int/lit8 v1, p1, 0x10
    //         const-string v2, "0123456789ABCDEF"
    //         add-int/lit8 v3, v0, 0x1
    //         invoke-virtual {v2, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, "0123456789ABCDEF"
    //         add-int/lit8 v2, v1, 0x1
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         return-void
    */

    @JvmStatic fun errorCodeToString(p0: Int): String { return "" }
    /*
    //         .locals 2
    //         packed-switch p0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Unknown error code "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "DEVELOPER_ERROR("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "INTERNAL_ERROR("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "INVALID_ACCOUNT("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "LICENSE_CHECK_FAILED("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "NETWORK_ERROR("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_5
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "RESOLUTION_REQUIRED("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_6
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "SERVICE_DISABLED("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_7
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "SERVICE_INVALID("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_8
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "SERVICE_MISSING("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_9
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "SERVICE_VERSION_UPDATE_REQUIRED("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_a
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "SIGN_IN_REQUIRED("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_b
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "SUCCESS("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_b
    //             :pswitch_8
    //             :pswitch_9
    //             :pswitch_6
    //             :pswitch_a
    //             :pswitch_2
    //             :pswitch_5
    //             :pswitch_4
    //             :pswitch_1
    //             :pswitch_7
    //             :pswitch_0
    //             :pswitch_3
    //         .end packed-switch
    */

    @JvmStatic fun getAppIdFromResource(p0: android.content.Context): String { return "" }
    /*
    //         .locals 4
    //         :try_start_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "gps_app_id"
    //         const-string v3, "string"
    //         invoke-virtual {v0, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         const-string v0, "??? (failed to retrieve APP ID)"
    //         goto :goto_0
    */

    @JvmStatic fun getSHA1CertFingerprint(p0: android.content.Context): String { return "" }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         const/16 v3, 0x40
    //         invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v1
    //         iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    //         array-length v2, v1
    //         if-nez v2, :cond_0
    //         const-string v0, "ERROR: NO SIGNATURE."
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         array-length v2, v1
    //         const/4 v3, 0x1
    //         if-le v2, v3, :cond_1
    //         const-string v0, "ERROR: MULTIPLE SIGNATURES"
    //         goto :goto_0
    //         :cond_1
    //         const-string v2, "SHA1"
    //         invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         aget-object v1, v1, v3
    //         invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Ljava/security/MessageDigest;->digest([B)[B
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         :goto_1
    //         array-length v3, v1
    //         if-ge v0, v3, :cond_3
    //         if-lez v0, :cond_2
    //         const-string v3, ":"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_2
    //         aget-byte v3, v1, v0
    //         invoke-static {v2, v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->byteToString(Ljava/lang/StringBuilder;B)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_3
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
    //         const-string v0, "(ERROR: package not found)"
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
    //         const-string v0, "(ERROR: SHA1 algorithm not found)"
    //         goto :goto_0
    */

    @JvmStatic fun getString(p0: android.content.Context, p1: Int): String { return "" }
    /*
    //         .locals 1
    //         if-ltz p1, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->FALLBACK_STRINGS:[Ljava/lang/String;
    //         array-length v0, v0
    //         if-ge p1, v0, :cond_0
    //         :goto_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->FALLBACK_STRINGS:[Ljava/lang/String;
    //         aget-object v0, v0, p1
    //         return-object v0
    //         :cond_0
    //         const/4 p1, 0x0
    //         goto :goto_0
    */

    @JvmStatic fun printMisconfiguredDebugInfo(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "GameHelper"
    //         const-string v1, "****"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** This is usually caused by one of these reasons:"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** (1) Your package name and certificate fingerprint do not match"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****     the client ID you registered in Developer Console."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** (2) Your App ID was incorrectly entered."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** (3) Your game settings have not been published and you are "
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****     trying to log in with an account that is not listed as"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****     a test account."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         if-nez p0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "*** (no Context, so can\'t print more debug info)"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** To help you debug, here is the information about this app"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "**** Package name         : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "**** Cert SHA1 fingerprint: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getSHA1CertFingerprint(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "**** App ID from          : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getAppIdFromResource(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** Check that the above information matches your setup in "
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** Developer Console. Also, check that you\'re logging in with the"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** right account (it should be listed in the Testers section if"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** your project is not yet published)."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "**** For more information, refer to the troubleshooting guide:"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "GameHelper"
    //         const-string v1, "****   http://developers.google.com/games/services/android/troubleshooting"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto/16 :goto_0
    */

    }
}