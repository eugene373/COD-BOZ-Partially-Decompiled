package com.facebook.model

// Auto-emitted from smali source: GraphObject.java.
// 0 fields, 8 methods.

interface GraphObject {
    public fun asMap(): java.util.Map

    public fun cast(p0: Class): com.facebook.model.GraphObject

    public fun getInnerJSONObject(): org.json.JSONObject

    public fun getProperty(p0: String): Object

    public fun getPropertyAs(p0: String, p1: Class): com.facebook.model.GraphObject

    public fun getPropertyAsList(p0: String, p1: Class): com.facebook.model.GraphObjectList

    public fun removeProperty(p0: String)

    public fun setProperty(p0: String, p1: Object)

}
