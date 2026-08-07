package android.support.v4.accessibilityservice

// Auto-emitted from smali source: AccessibilityServiceInfoCompat.java.
// 0 fields, 7 methods.

open class AccessibilityServiceInfoCompat_AccessibilityServiceInfoIcsImpl: android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat.AccessibilityServiceInfoStubImpl() {
    constructor()

    public fun getCanRetrieveWindowContent(info: android.accessibilityservice.AccessibilityServiceInfo): Boolean { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
    //         move-result v0
    //         return v0
    */

    public fun getCapabilities(info: android.accessibilityservice.AccessibilityServiceInfo): Int { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;->getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getDescription(info: android.accessibilityservice.AccessibilityServiceInfo): String { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getDescription(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getId(info: android.accessibilityservice.AccessibilityServiceInfo): String { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getId(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getResolveInfo(info: android.accessibilityservice.AccessibilityServiceInfo): android.content.pm.ResolveInfo { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getResolveInfo(Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSettingsActivityName(info: android.accessibilityservice.AccessibilityServiceInfo): String { return TODO("body: (Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getSettingsActivityName(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
