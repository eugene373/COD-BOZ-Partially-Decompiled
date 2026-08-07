package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: HttpDateTime.java.
// 4 fields, 7 methods.

class HttpDateTime {
    public constructor()

    companion object {
    private val HTTP_DATE_ANSIC_PATTERN: java.util.regex.Pattern = null!!
    private val HTTP_DATE_ANSIC_REGEXP: String = "[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})"
    private val HTTP_DATE_RFC_PATTERN: java.util.regex.Pattern = null!!
    private val HTTP_DATE_RFC_REGEXP: String = "([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])"

    private @JvmStatic fun getDate(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x30
    //         mul-int/lit8 v0, v0, 0xa
    //         const/4 v1, 0x1
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         add-int/2addr v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x30
    //         goto :goto_0
    */

    private @JvmStatic fun getMonth(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 5
    //         const/4 v2, 0x2
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C
    //         move-result v3
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C
    //         move-result v4
    //         add-int/2addr v3, v4
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C
    //         move-result v4
    //         add-int/2addr v3, v4
    //         add-int/lit16 v3, v3, -0x123
    //         sparse-switch v3, :sswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
    //         throw v0
    //         :sswitch_0
    //         move v0, v1
    //         :goto_0
    //         :sswitch_1
    //         return v0
    //         :sswitch_2
    //         move v0, v2
    //         goto :goto_0
    //         :sswitch_3
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         :sswitch_4
    //         const/4 v0, 0x4
    //         goto :goto_0
    //         :sswitch_5
    //         const/4 v0, 0x5
    //         goto :goto_0
    //         :sswitch_6
    //         const/4 v0, 0x6
    //         goto :goto_0
    //         :sswitch_7
    //         const/4 v0, 0x7
    //         goto :goto_0
    //         :sswitch_8
    //         const/16 v0, 0x8
    //         goto :goto_0
    //         :sswitch_9
    //         const/16 v0, 0x9
    //         goto :goto_0
    //         :sswitch_a
    //         const/16 v0, 0xa
    //         goto :goto_0
    //         :sswitch_b
    //         const/16 v0, 0xb
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x9 -> :sswitch_b
    //             0xa -> :sswitch_0
    //             0x16 -> :sswitch_1
    //             0x1a -> :sswitch_7
    //             0x1d -> :sswitch_2
    //             0x20 -> :sswitch_3
    //             0x23 -> :sswitch_9
    //             0x24 -> :sswitch_4
    //             0x25 -> :sswitch_8
    //             0x28 -> :sswitch_6
    //             0x2a -> :sswitch_5
    //             0x30 -> :sswitch_a
    //         .end sparse-switch
    */

    private @JvmStatic fun getTime(p0: String): com.android.vending.expansion.downloader.impl.HttpDateTime.TimeOfDay { return TODO("body: (Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         const/4 v2, 0x1
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x30
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         const/16 v3, 0x3a
    //         if-eq v1, v3, :cond_0
    //         mul-int/lit8 v0, v0, 0xa
    //         const/4 v1, 0x2
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v2
    //         add-int/lit8 v2, v2, -0x30
    //         add-int/2addr v0, v2
    //         :goto_0
    //         add-int/lit8 v1, v1, 0x1
    //         add-int/lit8 v2, v1, 0x1
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         mul-int/lit8 v1, v1, 0xa
    //         add-int/lit8 v3, v2, 0x1
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v2
    //         add-int/lit8 v2, v2, -0x30
    //         add-int/2addr v1, v2
    //         add-int/lit8 v2, v3, 0x1
    //         add-int/lit8 v3, v2, 0x1
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v2
    //         add-int/lit8 v2, v2, -0x30
    //         mul-int/lit8 v2, v2, 0xa
    //         add-int/lit8 v4, v3, 0x1
    //         invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
    //         move-result v3
    //         add-int/lit8 v3, v3, -0x30
    //         add-int/2addr v2, v3
    //         new-instance v3, Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;
    //         invoke-direct {v3, v0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;-><init>(III)V
    //         return-object v3
    //         :cond_0
    //         move v1, v2
    //         goto :goto_0
    */

    private @JvmStatic fun getYear(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 6
    //         const/4 v5, 0x3
    //         const/4 v4, 0x2
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-ne v0, v4, :cond_1
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x30
    //         mul-int/lit8 v0, v0, 0xa
    //         invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         add-int/2addr v0, v1
    //         const/16 v1, 0x46
    //         if-lt v0, v1, :cond_0
    //         add-int/lit16 v0, v0, 0x76c
    //         :goto_0
    //         return v0
    //         :cond_0
    //         add-int/lit16 v0, v0, 0x7d0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-ne v0, v5, :cond_2
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x30
    //         mul-int/lit8 v0, v0, 0x64
    //         invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         mul-int/lit8 v1, v1, 0xa
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         add-int/2addr v0, v1
    //         add-int/lit16 v0, v0, 0x76c
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         const/4 v1, 0x4
    //         if-ne v0, v1, :cond_3
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x30
    //         mul-int/lit16 v0, v0, 0x3e8
    //         invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         mul-int/lit8 v1, v1, 0x64
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         mul-int/lit8 v1, v1, 0xa
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         add-int/lit8 v1, v1, -0x30
    //         add-int/2addr v0, v1
    //         goto :goto_0
    //         :cond_3
    //         const/16 v0, 0x7b2
    //         goto :goto_0
    */

    public @JvmStatic fun parse(p0: String): Long { return TODO("body: (Ljava/lang/String;)J") }
    /*
    //         .locals 9
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         const/4 v8, 0x4
    //         const/4 v6, 0x3
    //         const/4 v3, 0x2
    //         const/4 v7, 0x0
    //         const/4 v4, 0x1
    //         sget-object v0, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->HTTP_DATE_RFC_PATTERN:Ljava/util/regex/Pattern;
    //         invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getDate(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getMonth(Ljava/lang/String;)I
    //         move-result v5
    //         invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getYear(Ljava/lang/String;)I
    //         move-result v6
    //         invoke-virtual {v0, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getTime(Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;
    //         move-result-object v0
    //         move-object v3, v0
    //         move v0, v1
    //         :goto_0
    //         const/16 v1, 0x7f6
    //         if-lt v6, v1, :cond_2
    //         const/16 v6, 0x7f6
    //         move v5, v7
    //         :goto_1
    //         new-instance v0, Landroid/text/format/Time;
    //         const-string v1, "UTC"
    //         invoke-direct {v0, v1}, Landroid/text/format/Time;-><init>(Ljava/lang/String;)V
    //         iget v1, v3, Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;->second:I
    //         iget v2, v3, Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;->minute:I
    //         iget v3, v3, Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;->hour:I
    //         invoke-virtual/range {v0 .. v6}, Landroid/text/format/Time;->set(IIIIII)V
    //         invoke-virtual {v0, v7}, Landroid/text/format/Time;->toMillis(Z)J
    //         move-result-wide v0
    //         return-wide v0
    //         :cond_0
    //         sget-object v0, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->HTTP_DATE_ANSIC_PATTERN:Ljava/util/regex/Pattern;
    //         invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getMonth(Ljava/lang/String;)I
    //         move-result v5
    //         invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getDate(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getTime(Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/HttpDateTime$TimeOfDay;
    //         move-result-object v0
    //         invoke-virtual {v2, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->getYear(Ljava/lang/String;)I
    //         move-result v6
    //         move-object v3, v0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
    //         throw v0
    //         :cond_2
    //         move v4, v0
    //         goto :goto_1
    */

    }
}
