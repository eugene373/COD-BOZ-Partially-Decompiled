package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 8 methods.

open class iu {
    companion object {
    private val Gr: com.google.android.gms.internal.ip = null!!
    private val HA: Array<String> = null!!
    private val HB: String = null!!

    public @JvmStatic fun a(p0: java.util.Calendar): String { return TODO("body: (Ljava/util/Calendar;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         if-nez p0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "Calendar object cannot be null"
    //         new-array v2, v3, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         const/4 v0, 0x0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/iu;->HB:Ljava/lang/String;
    //         const/16 v1, 0xb
    //         invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I
    //         move-result v1
    //         if-nez v1, :cond_2
    //         const/16 v1, 0xc
    //         invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I
    //         move-result v1
    //         if-nez v1, :cond_2
    //         const/16 v1, 0xd
    //         invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I
    //         move-result v1
    //         if-nez v1, :cond_2
    //         const-string v0, "yyyyMMdd"
    //         :cond_2
    //         new-instance v1, Ljava/text/SimpleDateFormat;
    //         invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V
    //         invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "+0000"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "+0000"
    //         sget-object v2, Lcom/google/android/gms/internal/iu;->HA:[Ljava/lang/String;
    //         aget-object v2, v2, v3
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun a(p0: java.util.List, p1: org.json.JSONObject) { /* TODO(body): (Ljava/util/List;Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/common/images/WebImage;",
    //                 ">;",
    //                 "Lorg/json/JSONObject;",
    //                 ")V"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-interface {p0}, Ljava/util/List;->clear()V
    //         const-string v0, "images"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v3
    //         :try_start_1
    //         new-instance v4, Lcom/google/android/gms/common/images/WebImage;
    //         invoke-direct {v4, v3}, Lcom/google/android/gms/common/images/WebImage;-><init>(Lorg/json/JSONObject;)V
    //         invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_1
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    //         :goto_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :cond_0
    //         return-void
    //         :catch_1
    //         move-exception v3
    //         goto :goto_1
    */

    public @JvmStatic fun a(p0: org.json.JSONObject, p1: java.util.List) { /* TODO(body): (Lorg/json/JSONObject;Ljava/util/List;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lorg/json/JSONObject;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/common/images/WebImage;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/images/WebImage;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->bK()Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_0
    //         :cond_0
    //         :try_start_0
    //         const-string v0, "images"
    //         invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :goto_1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    */

    public @JvmStatic fun aL(p0: String): java.util.Calendar { return TODO("body: (Ljava/lang/String;)Ljava/util/Calendar;") }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         const/4 v5, 0x0
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "Input string is empty or null"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         move-object v0, v2
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {p0}, Lcom/google/android/gms/internal/iu;->aM(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "Invalid date format"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         move-object v0, v2
    //         goto :goto_0
    //         :cond_1
    //         invoke-static {p0}, Lcom/google/android/gms/internal/iu;->aN(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v0, "yyyyMMdd"
    //         invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v4
    //         if-nez v4, :cond_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "T"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v0
    //         const-string v3, "HHmmss"
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v3
    //         if-ne v0, v3, :cond_3
    //         const-string v0, "yyyyMMdd\'T\'HHmmss"
    //         :cond_2
    //         :goto_1
    //         invoke-static {}, Ljava/util/GregorianCalendar;->getInstance()Ljava/util/Calendar;
    //         move-result-object v3
    //         :try_start_0
    //         new-instance v4, Ljava/text/SimpleDateFormat;
    //         invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    //         :try_end_0
    //         .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
    //         move-object v0, v3
    //         goto :goto_0
    //         :cond_3
    //         sget-object v0, Lcom/google/android/gms/internal/iu;->HB:Ljava/lang/String;
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v3, "Error parsing string: %s"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         aput-object v0, v4, v5
    //         invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         move-object v0, v2
    //         goto :goto_0
    */

    private @JvmStatic fun aM(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         const/4 v5, 0x0
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         sget-object v1, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "Input string is empty or null"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v1, 0x0
    //         :try_start_0
    //         const-string v2, "yyyyMMdd"
    //         invoke-virtual {v2}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v3, "Error extracting the date: %s"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         invoke-virtual {v1}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         aput-object v1, v4, v5
    //         invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ip;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    */

    private @JvmStatic fun aN(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         const/4 v5, 0x0
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         sget-object v1, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "string is empty or null"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/16 v1, 0x54
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I
    //         move-result v1
    //         add-int/lit8 v2, v1, 0x1
    //         const-string v3, "yyyyMMdd"
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v3
    //         if-eq v1, v3, :cond_2
    //         sget-object v1, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "T delimeter is not found"
    //         new-array v3, v5, [Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_2
    //         :try_start_0
    //         invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         const-string v3, "HHmmss"
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v3
    //         if-ne v2, v3, :cond_3
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/google/android/gms/internal/iu;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v3, "Error extracting the time substring: %s"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         invoke-virtual {v1}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         aput-object v1, v4, v5
    //         invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_3
    //         const-string v2, "HHmmss"
    //         invoke-virtual {v2}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v2
    //         sparse-switch v2, :sswitch_data_0
    //         goto :goto_0
    //         :sswitch_0
    //         invoke-static {v1}, Lcom/google/android/gms/internal/iu;->aO(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         const-string v0, "([\\+\\-]\\d\\d):(\\d\\d)"
    //         const-string v2, "$1$2"
    //         invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         const-string v3, "HHmmss"
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v3
    //         sget-object v4, Lcom/google/android/gms/internal/iu;->HA:[Ljava/lang/String;
    //         aget-object v4, v4, v5
    //         invoke-virtual {v4}, Ljava/lang/String;->length()I
    //         move-result v4
    //         add-int/2addr v3, v4
    //         if-ne v2, v3, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         add-int/lit8 v2, v2, -0x1
    //         invoke-virtual {v1, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "+0000"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x2b -> :sswitch_0
    //             0x2d -> :sswitch_0
    //             0x5a -> :sswitch_1
    //         .end sparse-switch
    */

    private @JvmStatic fun aO(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v1
    //         const-string v2, "HHmmss"
    //         invoke-virtual {v2}, Ljava/lang/String;->length()I
    //         move-result v2
    //         sget-object v3, Lcom/google/android/gms/internal/iu;->HA:[Ljava/lang/String;
    //         aget-object v3, v3, v0
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v3
    //         add-int/2addr v3, v2
    //         if-eq v1, v3, :cond_0
    //         sget-object v3, Lcom/google/android/gms/internal/iu;->HA:[Ljava/lang/String;
    //         const/4 v4, 0x2
    //         aget-object v3, v3, v4
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v3
    //         add-int/2addr v3, v2
    //         if-eq v1, v3, :cond_0
    //         sget-object v3, Lcom/google/android/gms/internal/iu;->HA:[Ljava/lang/String;
    //         const/4 v4, 0x3
    //         aget-object v3, v3, v4
    //         invoke-virtual {v3}, Ljava/lang/String;->length()I
    //         move-result v3
    //         add-int/2addr v2, v3
    //         if-ne v1, v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
