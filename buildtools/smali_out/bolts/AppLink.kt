package bolts

// Auto-emitted from smali source: AppLink.java.
// 3 fields, 4 methods.

open class AppLink {
    private var sourceUrl: android.net.Uri
    private var targets: java.util.List
    private var webUrl: android.net.Uri

    public constructor(sourceUrl: android.net.Uri, webUrl: java.util.List, p2: android.net.Uri)

    public fun getSourceUrl(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lbolts/AppLink;->sourceUrl:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getTargets(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lbolts/AppLink$Target;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lbolts/AppLink;->targets:Ljava/util/List;
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getWebUrl(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lbolts/AppLink;->webUrl:Landroid/net/Uri;
    //         return-object v0
    */

}
