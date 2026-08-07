package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util

// Auto-emitted from smali source: Security.java.
// 3 fields, 4 methods.

open class Security {
    public constructor()

    companion object {
    private val KEY_FACTORY_ALGORITHM: String = "RSA"
    private val SIGNATURE_ALGORITHM: String = "SHA1withRSA"
    private val TAG: String = "IABUtil/Security"

    public @JvmStatic fun generatePublicKey(p0: String): java.security.PublicKey { return TODO("body: (Ljava/lang/String;)Ljava/security/PublicKey;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Base64;->decode(Ljava/lang/String;)[B
    //         move-result-object v1
    //         const-string v2, "RSA"
    //         invoke-static {v2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;
    //         move-result-object v2
    //         new-instance v3, Ljava/security/spec/X509EncodedKeySpec;
    //         invoke-direct {v3, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V
    //         invoke-virtual {v2, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //         :try_end_0
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_2
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v1
    //         const-string v2, "IABUtil/Security"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Invalid key specification."
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v1}, Ljava/security/spec/InvalidKeySpecException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :catch_2
    //         move-exception v1
    //         const-string v2, "IABUtil/Security"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Base64 decoding failed."
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Base64DecoderException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public @JvmStatic fun verify(p0: java.security.PublicKey, p1: String, p2: String): Boolean { return TODO("body: (Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         :try_start_0
    //         const-string v1, "SHA1withRSA"
    //         invoke-static {v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    //         invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/security/Signature;->update([B)V
    //         invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Base64;->decode(Ljava/lang/String;)[B
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/security/Signature;->verify([B)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "IABUtil/Security"
    //         const-string v2, "Signature verification failed."
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_3
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "IABUtil/Security"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "NoSuchAlgorithmException."
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         const-string v2, "IABUtil/Security"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Invalid key specification."
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v1}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :catch_2
    //         move-exception v1
    //         const-string v2, "IABUtil/Security"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Signature exception."
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v1}, Ljava/security/SignatureException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :catch_3
    //         move-exception v1
    //         const-string v2, "IABUtil/Security"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Base64 decoding failed."
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Base64DecoderException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public @JvmStatic fun verifyPurchase(p0: String, p1: String, p2: String): Boolean { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         const-string v1, "IABUtil/Security"
    //         const-string v2, "data is null"
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Security;->generatePublicKey(Ljava/lang/String;)Ljava/security/PublicKey;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-static {v1, p1, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Security;->verify(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         const-string v1, "IABUtil/Security"
    //         const-string v2, "signature does not match data."
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    }
}
