package bolts

// Auto-emitted from smali source: AppLinkNavigation.java.
// 1 fields, 3 methods.

class AppLinkNavigation_Anon1: bolts.Continuation {
    val val$context: android.content.Context

    constructor(p0: android.content.Context)

    public fun then(p0: bolts.Task): bolts.AppLinkNavigation.NavigationResult { return TODO("body: (Lbolts/Task;)Lbolts/AppLinkNavigation$NavigationResult;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Lbolts/AppLink;",
    //                 ">;)",
    //                 "Lbolts/AppLinkNavigation$NavigationResult;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<Lbolts/AppLink;>;"
    //         iget-object v1, p0, Lbolts/AppLinkNavigation$1;->val$context:Landroid/content/Context;
    //         invoke-virtual {p1}, Lbolts/Task;->getResult()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lbolts/AppLink;
    //         invoke-static {v1, v0}, Lbolts/AppLinkNavigation;->navigate(Landroid/content/Context;Lbolts/AppLink;)Lbolts/AppLinkNavigation$NavigationResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lbolts/AppLinkNavigation$1;->then(Lbolts/Task;)Lbolts/AppLinkNavigation$NavigationResult;
    //         move-result-object v0
    //         return-object v0
    */

}
