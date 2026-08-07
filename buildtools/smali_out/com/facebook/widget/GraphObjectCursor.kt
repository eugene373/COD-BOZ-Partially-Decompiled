package com.facebook.widget

// Auto-emitted from smali source: GraphObjectCursor.java.
// 0 fields, 17 methods.

interface GraphObjectCursor {
    public fun areMoreObjectsAvailable(): Boolean

    public fun close()

    public fun getCount(): Int

    public fun getGraphObject(): com.facebook.model.GraphObject

    public fun getPosition(): Int

    public fun isAfterLast(): Boolean

    public fun isBeforeFirst(): Boolean

    public fun isClosed(): Boolean

    public fun isFirst(): Boolean

    public fun isFromCache(): Boolean

    public fun isLast(): Boolean

    public fun move(p0: Int): Boolean

    public fun moveToFirst(): Boolean

    public fun moveToLast(): Boolean

    public fun moveToNext(): Boolean

    public fun moveToPosition(p0: Int): Boolean

    public fun moveToPrevious(): Boolean

}
