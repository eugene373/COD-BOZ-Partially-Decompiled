package com.android.vending.licensing

// Auto-emitted from smali source: ResponseData.java.
// 7 fields, 3 methods.

open class ResponseData {
    public var extra: String
    public var nonce: Int
    public var packageName: String
    public var responseCode: Int
    public var timestamp: Long
    public var userId: String
    public var versionCode: String

    public constructor()

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const-string v0, "|"
    //         const/4 v1, 0x6
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget v3, p0, Lcom/android/vending/licensing/ResponseData;->responseCode:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget v3, p0, Lcom/android/vending/licensing/ResponseData;->nonce:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/android/vending/licensing/ResponseData;->packageName:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         iget-object v3, p0, Lcom/android/vending/licensing/ResponseData;->versionCode:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x4
    //         iget-object v3, p0, Lcom/android/vending/licensing/ResponseData;->userId:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x5
    //         iget-wide v4, p0, Lcom/android/vending/licensing/ResponseData;->timestamp:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun parse(p0: String): com.android.vending.licensing.ResponseData { return TODO("body: (Ljava/lang/String;)Lcom/android/vending/licensing/ResponseData;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const/16 v0, 0x3a
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I
    //         move-result v0
    //         const/4 v1, -0x1
    //         if-ne v1, v0, :cond_0
    //         const-string v0, ""
    //         :goto_0
    //         const-string v1, "|"
    //         invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {p0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v1
    //         array-length v2, v1
    //         const/4 v3, 0x6
    //         if-ge v2, v3, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Wrong number of fields."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v2
    //         if-lt v0, v2, :cond_1
    //         const-string v0, ""
    //         :goto_1
    //         move-object p0, v1
    //         goto :goto_0
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_2
    //         new-instance v2, Lcom/android/vending/licensing/ResponseData;
    //         invoke-direct {v2}, Lcom/android/vending/licensing/ResponseData;-><init>()V
    //         iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->extra:Ljava/lang/String;
    //         aget-object v0, v1, v4
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         iput v0, v2, Lcom/android/vending/licensing/ResponseData;->responseCode:I
    //         const/4 v0, 0x1
    //         aget-object v0, v1, v0
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         iput v0, v2, Lcom/android/vending/licensing/ResponseData;->nonce:I
    //         const/4 v0, 0x2
    //         aget-object v0, v1, v0
    //         iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->packageName:Ljava/lang/String;
    //         const/4 v0, 0x3
    //         aget-object v0, v1, v0
    //         iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->versionCode:Ljava/lang/String;
    //         const/4 v0, 0x4
    //         aget-object v0, v1, v0
    //         iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->userId:Ljava/lang/String;
    //         const/4 v0, 0x5
    //         aget-object v0, v1, v0
    //         invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         iput-wide v0, v2, Lcom/android/vending/licensing/ResponseData;->timestamp:J
    //         return-object v2
    */

    }
}
