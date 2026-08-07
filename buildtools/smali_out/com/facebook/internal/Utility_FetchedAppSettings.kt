package com.facebook.internal

// Auto-emitted from smali source: Utility.java.
// 5 fields, 7 methods.

open class Utility_FetchedAppSettings {
    private var dialogConfigMap: java.util.Map
    private var nuxContent: String
    private var nuxEnabled: Boolean
    private var supportsAttribution: Boolean
    private var supportsImplicitLogging: Boolean

    private constructor(p0: Boolean, p1: Boolean, p2: String, p3: Boolean, p4: java.util.Map)

    constructor(p0: Boolean, p1: Boolean, p2: String, p3: Boolean, p4: java.util.Map, p5: com.facebook.internal.Utility.1)

    public fun getDialogConfigurations(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/facebook/internal/Utility$DialogFeatureConfig;",
    //                 ">;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->dialogConfigMap:Ljava/util/Map;
    //         return-object v0
    */

    public fun getNuxContent(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->nuxContent:Ljava/lang/String;
    //         return-object v0
    */

    public fun getNuxEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->nuxEnabled:Z
    //         return v0
    */

    public fun supportsAttribution(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->supportsAttribution:Z
    //         return v0
    */

    public fun supportsImplicitLogging(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->supportsImplicitLogging:Z
    //         return v0
    */

}
