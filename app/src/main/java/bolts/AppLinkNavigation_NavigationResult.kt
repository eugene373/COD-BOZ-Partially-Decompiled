package bolts

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 5 fields, 4 methods.

open class AppLinkNavigation_NavigationResult: java.lang.Enum<bolts.AppLinkNavigation.NavigationResult>() {
        private var code: String
        private var succeeded: Boolean

    public fun getCode(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun isSucceeded(): Boolean { return TODO("body: ()Z") }

    companion object {
        @JvmField public val FAILED: bolts.AppLinkNavigation$NavigationResult = null!!
        @JvmField public val WEB: bolts.AppLinkNavigation$NavigationResult = null!!
        @JvmField public val APP: bolts.AppLinkNavigation$NavigationResult = null!!

        public @JvmStatic fun values(): Array<bolts.AppLinkNavigation$NavigationResult> { return TODO("body: ()[Lbolts/AppLinkNavigation$NavigationResult;") }
        public @JvmStatic fun valueOf(p0: String): bolts.AppLinkNavigation$NavigationResult { return TODO("body: (Ljava/lang/String;)Lbolts/AppLinkNavigation$NavigationResult;") }
    }
}
