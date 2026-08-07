package bolts

// Auto-emitted from smali source: AppLinkNavigation.java.
// 6 fields, 6 methods.

enum class AppLinkNavigation_NavigationResult {
    APP,
    FAILED,
    WEB,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: String, p1: Boolean)
    // instance fields (declare as constructor params or properties):
    //   private var code: String
    //   private var succeeded: Boolean

    public fun getCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lbolts/AppLinkNavigation$NavigationResult;->code:Ljava/lang/String;
    //         return-object v0
    */

    public fun isSucceeded(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lbolts/AppLinkNavigation$NavigationResult;->succeeded:Z
    //         return v0
    */

    companion object {
    public @JvmStatic fun valueOf(name: String): bolts.AppLinkNavigation.NavigationResult { return TODO("body: (Ljava/lang/String;)Lbolts/AppLinkNavigation$NavigationResult;") }
    /*
    //         .locals 1
    //         const-class v0, Lbolts/AppLinkNavigation$NavigationResult;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lbolts/AppLinkNavigation$NavigationResult;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<bolts.AppLinkNavigation.NavigationResult> { return TODO("body: ()[Lbolts/AppLinkNavigation$NavigationResult;") }
    /*
    //         .locals 1
    //         sget-object v0, Lbolts/AppLinkNavigation$NavigationResult;->$VALUES:[Lbolts/AppLinkNavigation$NavigationResult;
    //         invoke-virtual {v0}, [Lbolts/AppLinkNavigation$NavigationResult;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lbolts/AppLinkNavigation$NavigationResult;
    //         return-object v0
    */

    }
}
