package android.support.v4.accessibilityservice

// Auto-emitted from smali source: AccessibilityServiceInfoCompat.java.
// 13 fields, 11 methods.

open class AccessibilityServiceInfoCompat {
    private constructor()

    companion object {
    @JvmField public val CAPABILITY_CAN_FILTER_KEY_EVENTS: Int = 0x8
    @JvmField public val CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY: Int = 0x4
    @JvmField public val CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION: Int = 0x2
    @JvmField public val CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT: Int = 0x1
    @JvmField public val DEFAULT: Int = 0x1
    @JvmField public val FEEDBACK_ALL_MASK: Int = 0
    @JvmField public val FEEDBACK_BRAILLE: Int = 0x20
    @JvmField public val FLAG_INCLUDE_NOT_IMPORTANT_VIEWS: Int = 0x2
    @JvmField public val FLAG_REPORT_VIEW_IDS: Int = 0x10
    @JvmField public val FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY: Int = 0x8
    @JvmField public val FLAG_REQUEST_FILTER_KEY_EVENTS: Int = 0x20
    @JvmField public val FLAG_REQUEST_TOUCH_EXPLORATION_MODE: Int = 0x4
    private val IMPL: android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat.AccessibilityServiceInfoVersionImpl = null!!

    public @JvmStatic fun capabilityToString(capability: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         :pswitch_0
    //         const-string v0, "UNKNOWN"
    //         :goto_0
    //         return-object v0
    //         :pswitch_1
    //         const-string v0, "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT"
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION"
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v0, "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY"
    //         goto :goto_0
    //         :pswitch_4
    //         const-string v0, "CAPABILITY_CAN_FILTER_KEY_EVENTS"
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_4
    //         .end packed-switch
    */

    public @JvmStatic fun feedbackTypeToString(feedbackType: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         .local v0, "builder":Ljava/lang/StringBuilder;
    //         const-string v2, "["
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :goto_0
    //         if-lez p0, :cond_1
    //         invoke-static {p0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I
    //         move-result v2
    //         shl-int v1, v3, v2
    //         .local v1, "feedbackTypeFlag":I
    //         xor-int/lit8 v2, v1, -0x1
    //         and-int/2addr p0, v2
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
    //         move-result v2
    //         if-le v2, v3, :cond_0
    //         const-string v2, ", "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         sparse-switch v1, :sswitch_data_0
    //         goto :goto_0
    //         :sswitch_0
    //         const-string v2, "FEEDBACK_SPOKEN"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v2, "FEEDBACK_AUDIBLE"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v2, "FEEDBACK_HAPTIC"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v2, "FEEDBACK_GENERIC"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v2, "FEEDBACK_VISUAL"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         .end local v1    # "feedbackTypeFlag":I
    //         :cond_1
    //         const-string v2, "]"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         return-object v2
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x4 -> :sswitch_1
    //             0x8 -> :sswitch_4
    //             0x10 -> :sswitch_3
    //         .end sparse-switch
    */

    public @JvmStatic fun flagToString(flag: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sparse-switch p0, :sswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :sswitch_0
    //         const-string v0, "DEFAULT"
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS"
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "FLAG_REQUEST_TOUCH_EXPLORATION_MODE"
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY"
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "FLAG_REPORT_VIEW_IDS"
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "FLAG_REQUEST_FILTER_KEY_EVENTS"
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_1
    //             0x4 -> :sswitch_2
    //             0x8 -> :sswitch_3
    //             0x10 -> :sswitch_4
    //             0x20 -> :sswitch_5
    //         .end sparse-switch
    */

    public @JvmStatic fun getCanRetrieveWindowContent(info: android.accessibilityservice.AccessibilityServiceInfo): Boolean { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getCapabilities(info: android.accessibilityservice.AccessibilityServiceInfo): Int { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getCapabilities(Landroid/accessibilityservice/AccessibilityServiceInfo;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getDescription(info: android.accessibilityservice.AccessibilityServiceInfo): String { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getDescription(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getId(info: android.accessibilityservice.AccessibilityServiceInfo): String { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getId(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getResolveInfo(info: android.accessibilityservice.AccessibilityServiceInfo): android.content.pm.ResolveInfo { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getResolveInfo(Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getSettingsActivityName(info: android.accessibilityservice.AccessibilityServiceInfo): String { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getSettingsActivityName(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
