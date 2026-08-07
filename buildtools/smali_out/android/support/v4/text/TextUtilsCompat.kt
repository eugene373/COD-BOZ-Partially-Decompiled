package android.support.v4.text

// Auto-emitted from smali source: TextUtilsCompat.java.
// 3 fields, 5 methods.

open class TextUtilsCompat {
    public constructor()

    companion object {
    private var ARAB_SCRIPT_SUBTAG: String
    private var HEBR_SCRIPT_SUBTAG: String
    @JvmField public val ROOT: java.util.Locale = null!!

    private @JvmStatic fun getLayoutDirectionFromFirstChar(locale: java.util.Locale): Int { return TODO("body: (Ljava/util/Locale;)I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p0}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Character;->getDirectionality(C)B
    //         move-result v1
    //         packed-switch v1, :pswitch_data_0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_0
    //         .end packed-switch
    */

    public @JvmStatic fun getLayoutDirectionFromLocale(locale: java.util.Locale): Int { return TODO("body: (Ljava/util/Locale;)I") }
    /*
    //         .locals 2
    //         .end param
    //         if-eqz p0, :cond_2
    //         sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->ROOT:Ljava/util/Locale;
    //         invoke-virtual {p0, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         invoke-virtual {p0}, Ljava/util/Locale;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Landroid/support/v4/text/ICUCompat;->addLikelySubtags(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Landroid/support/v4/text/ICUCompat;->getScript(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "scriptSubtag":Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromFirstChar(Ljava/util/Locale;)I
    //         move-result v1
    //         .end local v0    # "scriptSubtag":Ljava/lang/String;
    //         :goto_0
    //         return v1
    //         .restart local v0    # "scriptSubtag":Ljava/lang/String;
    //         :cond_0
    //         sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->ARAB_SCRIPT_SUBTAG:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->HEBR_SCRIPT_SUBTAG:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         :cond_1
    //         const/4 v1, 0x1
    //         goto :goto_0
    //         .end local v0    # "scriptSubtag":Ljava/lang/String;
    //         :cond_2
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun htmlEncode(s: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .end param
    //         .annotation build Landroid/support/annotation/NonNull;
    //         .end annotation
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         .local v2, "sb":Ljava/lang/StringBuilder;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v3
    //         if-ge v1, v3, :cond_0
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         .local v0, "c":C
    //         sparse-switch v0, :sswitch_data_0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         :goto_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :sswitch_0
    //         const-string v3, "&lt;"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :sswitch_1
    //         const-string v3, "&gt;"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :sswitch_2
    //         const-string v3, "&amp;"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :sswitch_3
    //         const-string v3, "&#39;"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :sswitch_4
    //         const-string v3, "&quot;"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         .end local v0    # "c":C
    //         :cond_0
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         return-object v3
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x22 -> :sswitch_4
    //             0x26 -> :sswitch_2
    //             0x27 -> :sswitch_3
    //             0x3c -> :sswitch_0
    //             0x3e -> :sswitch_1
    //         .end sparse-switch
    */

    }
}
