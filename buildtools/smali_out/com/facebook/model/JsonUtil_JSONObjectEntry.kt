package com.facebook.model

// Auto-emitted from smali source: JsonUtil.java.
// 2 fields, 5 methods.

class JsonUtil_JSONObjectEntry: java.util.Map.Entry {
    private val key: String
    private val value: Object

    constructor(p0: String, p1: Object)

    public fun getKey(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/facebook/model/JsonUtil$JSONObjectEntry;->getKey()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getKey(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation build Landroid/annotation/SuppressLint;
    //             value = {
    //                 "FieldGetter"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/model/JsonUtil$JSONObjectEntry;->key:Ljava/lang/String;
    //         return-object v0
    */

    public fun getValue(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/model/JsonUtil$JSONObjectEntry;->value:Ljava/lang/Object;
    //         return-object v0
    */

    public fun setValue(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "JSONObjectEntry is immutable"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

}
