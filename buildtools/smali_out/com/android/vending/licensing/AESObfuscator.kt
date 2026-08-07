package com.android.vending.licensing

// Auto-emitted from smali source: AESObfuscator.java.
// 7 fields, 4 methods.

open class AESObfuscator: com.android.vending.licensing.Obfuscator {
    private var mDecryptor: javax.crypto.Cipher
    private var mEncryptor: javax.crypto.Cipher

    public constructor(p0: ByteArray, p1: String, p2: String)

    public fun obfuscate(p0: String, p1: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/licensing/AESObfuscator;->mEncryptor:Ljavax/crypto/Cipher;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "com.android.vending.licensing.AESObfuscator-1|"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "UTF-8"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/android/vending/licensing/util/Base64;->encode([B)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         const-string v2, "Invalid environment"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         const-string v2, "Invalid environment"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun unobfuscate(p0: String, p1: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/ValidationException;
    //             }
    //         .end annotation
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         new-instance v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/android/vending/licensing/AESObfuscator;->mDecryptor:Ljavax/crypto/Cipher;
    //         invoke-static {p1}, Lcom/android/vending/licensing/util/Base64;->decode(Ljava/lang/String;)[B
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B
    //         move-result-object v1
    //         const-string v2, "UTF-8"
    //         invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "com.android.vending.licensing.AESObfuscator-1|"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         new-instance v0, Lcom/android/vending/licensing/ValidationException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Header not found (invalid data or key):"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/android/vending/licensing/ValidationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/android/vending/licensing/ValidationException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0}, Lcom/android/vending/licensing/util/Base64DecoderException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ":"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/android/vending/licensing/ValidationException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_1
    //         :try_start_1
    //         const-string v1, "com.android.vending.licensing.AESObfuscator-1|"
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v1
    //         invoke-virtual {p2}, Ljava/lang/String;->length()I
    //         move-result v2
    //         add-int/2addr v1, v2
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         :try_end_1
    //         .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_2
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_3
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Lcom/android/vending/licensing/ValidationException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ":"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/android/vending/licensing/ValidationException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :catch_2
    //         move-exception v0
    //         new-instance v1, Lcom/android/vending/licensing/ValidationException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ":"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/android/vending/licensing/ValidationException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :catch_3
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         const-string v2, "Invalid environment"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    companion object {
    private val CIPHER_ALGORITHM: String = "AES/CBC/PKCS5Padding"
    private val IV: ByteArray = null!!
    private val KEYGEN_ALGORITHM: String = "PBEWITHSHAAND256BITAES-CBC-BC"
    private val UTF8: String = "UTF-8"
    private val header: String = "com.android.vending.licensing.AESObfuscator-1|"
    }
}
