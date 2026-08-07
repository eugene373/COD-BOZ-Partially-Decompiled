package com.android.vending.licensing.util

// Auto-emitted from smali source: Base64.java.
// 11 fields, 15 methods.

open class Base64 {
    private constructor()

    companion object {
    val $assertionsDisabled: Boolean = false
    private val ALPHABET: ByteArray = null!!
    private val DECODABET: ByteArray = null!!
    @JvmField public val DECODE: Boolean = false
    @JvmField public val ENCODE: Boolean = true
    private val EQUALS_SIGN: Byte = 0x3dt
    private val EQUALS_SIGN_ENC: Byte = 0
    private val NEW_LINE: Byte = 0xat
    private val WEBSAFE_ALPHABET: ByteArray = null!!
    private val WEBSAFE_DECODABET: ByteArray = null!!
    private val WHITE_SPACE_ENC: Byte = 0

    public @JvmStatic fun decode(p0: String): ByteArray { return TODO("body: (Ljava/lang/String;)[B") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/util/Base64DecoderException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         array-length v2, v0
    //         invoke-static {v0, v1, v2}, Lcom/android/vending/licensing/util/Base64;->decode([BII)[B
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun decode(p0: ByteArray): ByteArray { return TODO("body: ([B)[B") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/util/Base64DecoderException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         array-length v1, p0
    //         invoke-static {p0, v0, v1}, Lcom/android/vending/licensing/util/Base64;->decode([BII)[B
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun decode(p0: ByteArray, p1: Int, p2: Int): ByteArray { return TODO("body: ([BII)[B") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/util/Base64DecoderException;
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/android/vending/licensing/util/Base64;->DECODABET:[B
    //         invoke-static {p0, p1, p2, v0}, Lcom/android/vending/licensing/util/Base64;->decode([BII[B)[B
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun decode(p0: ByteArray, p1: Int, p2: Int, p3: ByteArray): ByteArray { return TODO("body: ([BII[B)[B") }
    /*
    //         .locals 12
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/util/Base64DecoderException;
    //             }
    //         .end annotation
    //         const/16 v11, 0x3d
    //         const/4 v10, 0x4
    //         const/4 v9, 0x1
    //         const/4 v1, 0x0
    //         mul-int/lit8 v0, p2, 0x3
    //         div-int/lit8 v0, v0, 0x4
    //         add-int/lit8 v0, v0, 0x2
    //         new-array v5, v0, [B
    //         new-array v6, v10, [B
    //         move v4, v1
    //         move v2, v1
    //         move v3, v1
    //         :goto_0
    //         if-ge v4, p2, :cond_7
    //         add-int v0, v4, p1
    //         aget-byte v0, p0, v0
    //         and-int/lit8 v0, v0, 0x7f
    //         int-to-byte v7, v0
    //         aget-byte v0, p3, v7
    //         const/4 v8, -0x5
    //         if-lt v0, v8, :cond_6
    //         const/4 v8, -0x1
    //         if-lt v0, v8, :cond_b
    //         if-ne v7, v11, :cond_5
    //         sub-int v0, p2, v4
    //         add-int/lit8 v7, p2, -0x1
    //         add-int/2addr v7, p1
    //         aget-byte v7, p0, v7
    //         and-int/lit8 v7, v7, 0x7f
    //         int-to-byte v7, v7
    //         if-eqz v2, :cond_0
    //         if-ne v2, v9, :cond_1
    //         :cond_0
    //         new-instance v0, Lcom/android/vending/licensing/util/Base64DecoderException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid padding byte \'=\' at byte offset "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/android/vending/licensing/util/Base64DecoderException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const/4 v8, 0x3
    //         if-ne v2, v8, :cond_2
    //         const/4 v8, 0x2
    //         if-gt v0, v8, :cond_3
    //         :cond_2
    //         if-ne v2, v10, :cond_4
    //         if-le v0, v9, :cond_4
    //         :cond_3
    //         new-instance v0, Lcom/android/vending/licensing/util/Base64DecoderException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "padding byte \'=\' falsely signals end of encoded value at offset "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/android/vending/licensing/util/Base64DecoderException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         if-eq v7, v11, :cond_7
    //         const/16 v0, 0xa
    //         if-eq v7, v0, :cond_7
    //         new-instance v0, Lcom/android/vending/licensing/util/Base64DecoderException;
    //         const-string v1, "encoded value has invalid trailing byte"
    //         invoke-direct {v0, v1}, Lcom/android/vending/licensing/util/Base64DecoderException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_5
    //         add-int/lit8 v0, v2, 0x1
    //         aput-byte v7, v6, v2
    //         if-ne v0, v10, :cond_a
    //         invoke-static {v6, v1, v5, v3, p3}, Lcom/android/vending/licensing/util/Base64;->decode4to3([BI[BI[B)I
    //         move-result v0
    //         add-int/2addr v0, v3
    //         move v2, v0
    //         move v0, v1
    //         :goto_1
    //         add-int/lit8 v3, v4, 0x1
    //         move v4, v3
    //         move v3, v2
    //         move v2, v0
    //         goto :goto_0
    //         :cond_6
    //         new-instance v0, Lcom/android/vending/licensing/util/Base64DecoderException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Bad Base64 input character at "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ": "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         add-int v2, v4, p1
    //         aget-byte v2, p0, v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "(decimal)"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/android/vending/licensing/util/Base64DecoderException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_7
    //         if-eqz v2, :cond_9
    //         if-ne v2, v9, :cond_8
    //         new-instance v0, Lcom/android/vending/licensing/util/Base64DecoderException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "single trailing character at offset "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         add-int/lit8 v2, p2, -0x1
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/android/vending/licensing/util/Base64DecoderException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_8
    //         add-int/lit8 v0, v2, 0x1
    //         aput-byte v11, v6, v2
    //         invoke-static {v6, v1, v5, v3, p3}, Lcom/android/vending/licensing/util/Base64;->decode4to3([BI[BI[B)I
    //         move-result v0
    //         add-int/2addr v3, v0
    //         :cond_9
    //         new-array v0, v3, [B
    //         invoke-static {v5, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         return-object v0
    //         :cond_a
    //         move v2, v3
    //         goto :goto_1
    //         :cond_b
    //         move v0, v2
    //         move v2, v3
    //         goto :goto_1
    */

    private @JvmStatic fun decode4to3(p0: ByteArray, p1: Int, p2: ByteArray, p3: Int, p4: ByteArray): Int { return TODO("body: ([BI[BI[B)I") }
    /*
    //         .locals 3
    //         const/16 v1, 0x3d
    //         add-int/lit8 v0, p1, 0x2
    //         aget-byte v0, p0, v0
    //         if-ne v0, v1, :cond_0
    //         aget-byte v0, p0, p1
    //         aget-byte v0, p4, v0
    //         shl-int/lit8 v0, v0, 0x18
    //         ushr-int/lit8 v0, v0, 0x6
    //         add-int/lit8 v1, p1, 0x1
    //         aget-byte v1, p0, v1
    //         aget-byte v1, p4, v1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0xc
    //         or-int/2addr v0, v1
    //         ushr-int/lit8 v0, v0, 0x10
    //         int-to-byte v0, v0
    //         aput-byte v0, p2, p3
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         add-int/lit8 v0, p1, 0x3
    //         aget-byte v0, p0, v0
    //         if-ne v0, v1, :cond_1
    //         aget-byte v0, p0, p1
    //         aget-byte v0, p4, v0
    //         shl-int/lit8 v0, v0, 0x18
    //         ushr-int/lit8 v0, v0, 0x6
    //         add-int/lit8 v1, p1, 0x1
    //         aget-byte v1, p0, v1
    //         aget-byte v1, p4, v1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0xc
    //         or-int/2addr v0, v1
    //         add-int/lit8 v1, p1, 0x2
    //         aget-byte v1, p0, v1
    //         aget-byte v1, p4, v1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0x12
    //         or-int/2addr v0, v1
    //         ushr-int/lit8 v1, v0, 0x10
    //         int-to-byte v1, v1
    //         aput-byte v1, p2, p3
    //         add-int/lit8 v1, p3, 0x1
    //         ushr-int/lit8 v0, v0, 0x8
    //         int-to-byte v0, v0
    //         aput-byte v0, p2, v1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :cond_1
    //         aget-byte v0, p0, p1
    //         aget-byte v0, p4, v0
    //         shl-int/lit8 v0, v0, 0x18
    //         ushr-int/lit8 v0, v0, 0x6
    //         add-int/lit8 v1, p1, 0x1
    //         aget-byte v1, p0, v1
    //         aget-byte v1, p4, v1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0xc
    //         or-int/2addr v0, v1
    //         add-int/lit8 v1, p1, 0x2
    //         aget-byte v1, p0, v1
    //         aget-byte v1, p4, v1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0x12
    //         or-int/2addr v0, v1
    //         add-int/lit8 v1, p1, 0x3
    //         aget-byte v1, p0, v1
    //         aget-byte v1, p4, v1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0x18
    //         or-int/2addr v0, v1
    //         shr-int/lit8 v1, v0, 0x10
    //         int-to-byte v1, v1
    //         aput-byte v1, p2, p3
    //         add-int/lit8 v1, p3, 0x1
    //         shr-int/lit8 v2, v0, 0x8
    //         int-to-byte v2, v2
    //         aput-byte v2, p2, v1
    //         add-int/lit8 v1, p3, 0x2
    //         int-to-byte v0, v0
    //         aput-byte v0, p2, v1
    //         const/4 v0, 0x3
    //         goto :goto_0
    */

    public @JvmStatic fun decodeWebSafe(p0: String): ByteArray { return TODO("body: (Ljava/lang/String;)[B") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/util/Base64DecoderException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         array-length v2, v0
    //         invoke-static {v0, v1, v2}, Lcom/android/vending/licensing/util/Base64;->decodeWebSafe([BII)[B
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun decodeWebSafe(p0: ByteArray): ByteArray { return TODO("body: ([B)[B") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/util/Base64DecoderException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         array-length v1, p0
    //         invoke-static {p0, v0, v1}, Lcom/android/vending/licensing/util/Base64;->decodeWebSafe([BII)[B
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun decodeWebSafe(p0: ByteArray, p1: Int, p2: Int): ByteArray { return TODO("body: ([BII)[B") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/licensing/util/Base64DecoderException;
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/android/vending/licensing/util/Base64;->WEBSAFE_DECODABET:[B
    //         invoke-static {p0, p1, p2, v0}, Lcom/android/vending/licensing/util/Base64;->decode([BII[B)[B
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun encode(p0: ByteArray): String { return TODO("body: ([B)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         array-length v1, p0
    //         sget-object v2, Lcom/android/vending/licensing/util/Base64;->ALPHABET:[B
    //         const/4 v3, 0x1
    //         invoke-static {p0, v0, v1, v2, v3}, Lcom/android/vending/licensing/util/Base64;->encode([BII[BZ)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun encode(p0: ByteArray, p1: Int, p2: Int, p3: ByteArray, p4: Boolean): String { return TODO("body: ([BII[BZ)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const v0, 0x7fffffff
    //         invoke-static {p0, p1, p2, p3, v0}, Lcom/android/vending/licensing/util/Base64;->encode([BII[BI)[B
    //         move-result-object v1
    //         array-length v0, v1
    //         :goto_0
    //         if-nez p4, :cond_0
    //         if-lez v0, :cond_0
    //         add-int/lit8 v2, v0, -0x1
    //         aget-byte v2, v1, v2
    //         const/16 v3, 0x3d
    //         if-eq v2, v3, :cond_1
    //         :cond_0
    //         new-instance v2, Ljava/lang/String;
    //         const/4 v3, 0x0
    //         invoke-direct {v2, v1, v3, v0}, Ljava/lang/String;-><init>([BII)V
    //         return-object v2
    //         :cond_1
    //         add-int/lit8 v0, v0, -0x1
    //         goto :goto_0
    */

    public @JvmStatic fun encode(p0: ByteArray, p1: Int, p2: Int, p3: ByteArray, p4: Int): ByteArray { return TODO("body: ([BII[BI)[B") }
    /*
    //         .locals 10
    //         const/16 v9, 0xa
    //         const/4 v1, 0x0
    //         add-int/lit8 v0, p2, 0x2
    //         div-int/lit8 v0, v0, 0x3
    //         mul-int/lit8 v0, v0, 0x4
    //         div-int v2, v0, p4
    //         add-int/2addr v0, v2
    //         new-array v3, v0, [B
    //         add-int/lit8 v5, p2, -0x2
    //         move v6, v1
    //         move v4, v1
    //         move v2, v1
    //         :goto_0
    //         if-ge v2, v5, :cond_1
    //         add-int v0, v2, p1
    //         aget-byte v0, p0, v0
    //         shl-int/lit8 v0, v0, 0x18
    //         ushr-int/lit8 v0, v0, 0x8
    //         add-int/lit8 v7, v2, 0x1
    //         add-int/2addr v7, p1
    //         aget-byte v7, p0, v7
    //         shl-int/lit8 v7, v7, 0x18
    //         ushr-int/lit8 v7, v7, 0x10
    //         or-int/2addr v0, v7
    //         add-int/lit8 v7, v2, 0x2
    //         add-int/2addr v7, p1
    //         aget-byte v7, p0, v7
    //         shl-int/lit8 v7, v7, 0x18
    //         ushr-int/lit8 v7, v7, 0x18
    //         or-int/2addr v0, v7
    //         ushr-int/lit8 v7, v0, 0x12
    //         aget-byte v7, p3, v7
    //         aput-byte v7, v3, v4
    //         add-int/lit8 v7, v4, 0x1
    //         ushr-int/lit8 v8, v0, 0xc
    //         and-int/lit8 v8, v8, 0x3f
    //         aget-byte v8, p3, v8
    //         aput-byte v8, v3, v7
    //         add-int/lit8 v7, v4, 0x2
    //         ushr-int/lit8 v8, v0, 0x6
    //         and-int/lit8 v8, v8, 0x3f
    //         aget-byte v8, p3, v8
    //         aput-byte v8, v3, v7
    //         add-int/lit8 v7, v4, 0x3
    //         and-int/lit8 v0, v0, 0x3f
    //         aget-byte v0, p3, v0
    //         aput-byte v0, v3, v7
    //         add-int/lit8 v0, v6, 0x4
    //         if-ne v0, p4, :cond_0
    //         add-int/lit8 v0, v4, 0x4
    //         aput-byte v9, v3, v0
    //         add-int/lit8 v4, v4, 0x1
    //         move v0, v1
    //         :cond_0
    //         add-int/lit8 v2, v2, 0x3
    //         add-int/lit8 v4, v4, 0x4
    //         move v6, v0
    //         goto :goto_0
    //         :cond_1
    //         if-ge v2, p2, :cond_3
    //         add-int v1, v2, p1
    //         sub-int v2, p2, v2
    //         move-object v0, p0
    //         move-object v5, p3
    //         invoke-static/range {v0 .. v5}, Lcom/android/vending/licensing/util/Base64;->encode3to4([BII[BI[B)[B
    //         add-int/lit8 v0, v6, 0x4
    //         if-ne v0, p4, :cond_2
    //         add-int/lit8 v0, v4, 0x4
    //         aput-byte v9, v3, v0
    //         add-int/lit8 v4, v4, 0x1
    //         :cond_2
    //         add-int/lit8 v4, v4, 0x4
    //         :cond_3
    //         sget-boolean v0, Lcom/android/vending/licensing/util/Base64;->$assertionsDisabled:Z
    //         if-nez v0, :cond_4
    //         array-length v0, v3
    //         if-eq v4, v0, :cond_4
    //         new-instance v0, Ljava/lang/AssertionError;
    //         invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
    //         throw v0
    //         :cond_4
    //         return-object v3
    */

    private @JvmStatic fun encode3to4(p0: ByteArray, p1: Int, p2: Int, p3: ByteArray, p4: Int, p5: ByteArray): ByteArray { return TODO("body: ([BII[BI[B)[B") }
    /*
    //         .locals 4
    //         const/16 v3, 0x3d
    //         const/4 v0, 0x0
    //         if-lez p2, :cond_1
    //         aget-byte v1, p0, p1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0x8
    //         move v2, v1
    //         :goto_0
    //         const/4 v1, 0x1
    //         if-le p2, v1, :cond_2
    //         add-int/lit8 v1, p1, 0x1
    //         aget-byte v1, p0, v1
    //         shl-int/lit8 v1, v1, 0x18
    //         ushr-int/lit8 v1, v1, 0x10
    //         :goto_1
    //         or-int/2addr v1, v2
    //         const/4 v2, 0x2
    //         if-le p2, v2, :cond_0
    //         add-int/lit8 v0, p1, 0x2
    //         aget-byte v0, p0, v0
    //         shl-int/lit8 v0, v0, 0x18
    //         ushr-int/lit8 v0, v0, 0x18
    //         :cond_0
    //         or-int/2addr v0, v1
    //         packed-switch p2, :pswitch_data_0
    //         :goto_2
    //         return-object p3
    //         :cond_1
    //         move v2, v0
    //         goto :goto_0
    //         :cond_2
    //         move v1, v0
    //         goto :goto_1
    //         :pswitch_0
    //         ushr-int/lit8 v1, v0, 0x12
    //         aget-byte v1, p5, v1
    //         aput-byte v1, p3, p4
    //         add-int/lit8 v1, p4, 0x1
    //         ushr-int/lit8 v2, v0, 0xc
    //         and-int/lit8 v2, v2, 0x3f
    //         aget-byte v2, p5, v2
    //         aput-byte v2, p3, v1
    //         add-int/lit8 v1, p4, 0x2
    //         ushr-int/lit8 v2, v0, 0x6
    //         and-int/lit8 v2, v2, 0x3f
    //         aget-byte v2, p5, v2
    //         aput-byte v2, p3, v1
    //         add-int/lit8 v1, p4, 0x3
    //         and-int/lit8 v0, v0, 0x3f
    //         aget-byte v0, p5, v0
    //         aput-byte v0, p3, v1
    //         goto :goto_2
    //         :pswitch_1
    //         ushr-int/lit8 v1, v0, 0x12
    //         aget-byte v1, p5, v1
    //         aput-byte v1, p3, p4
    //         add-int/lit8 v1, p4, 0x1
    //         ushr-int/lit8 v2, v0, 0xc
    //         and-int/lit8 v2, v2, 0x3f
    //         aget-byte v2, p5, v2
    //         aput-byte v2, p3, v1
    //         add-int/lit8 v1, p4, 0x2
    //         ushr-int/lit8 v0, v0, 0x6
    //         and-int/lit8 v0, v0, 0x3f
    //         aget-byte v0, p5, v0
    //         aput-byte v0, p3, v1
    //         add-int/lit8 v0, p4, 0x3
    //         aput-byte v3, p3, v0
    //         goto :goto_2
    //         :pswitch_2
    //         ushr-int/lit8 v1, v0, 0x12
    //         aget-byte v1, p5, v1
    //         aput-byte v1, p3, p4
    //         add-int/lit8 v1, p4, 0x1
    //         ushr-int/lit8 v0, v0, 0xc
    //         and-int/lit8 v0, v0, 0x3f
    //         aget-byte v0, p5, v0
    //         aput-byte v0, p3, v1
    //         add-int/lit8 v0, p4, 0x2
    //         aput-byte v3, p3, v0
    //         add-int/lit8 v0, p4, 0x3
    //         aput-byte v3, p3, v0
    //         goto :goto_2
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    public @JvmStatic fun encodeWebSafe(p0: ByteArray, p1: Boolean): String { return TODO("body: ([BZ)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         array-length v1, p0
    //         sget-object v2, Lcom/android/vending/licensing/util/Base64;->WEBSAFE_ALPHABET:[B
    //         invoke-static {p0, v0, v1, v2, p1}, Lcom/android/vending/licensing/util/Base64;->encode([BII[BZ)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
