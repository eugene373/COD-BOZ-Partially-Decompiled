package com.ideaworks3d.marmalade

import android.content.Context
import android.util.Log
import java.lang.reflect.Field

object ResourceUtility {

    @JvmStatic
    fun getResId(resourceClass: String, name: String, context: Context): Int {
        var id = 0
        try {
            id = context.resources.getIdentifier(name, resourceClass, context.packageName)
        } catch (e: IllegalArgumentException) {
            Log.v("getResId", "unknown class/resourceName : $resourceClass/$name")
            e.printStackTrace()
        } catch (e: SecurityException) {
            Log.v("getResId", "unknown class/resourceName : $resourceClass/$name")
            e.printStackTrace()
        }
        return id
    }

    @JvmStatic
    fun getResId(resourceClass: String, name: String): Int {
        val activity = LoaderActivity.m_Activity
        return getResId(resourceClass, name, activity)
    }

    @JvmStatic
    fun getResourceDeclareStyleableIntArray(name: String): IntArray? {
        val activity = LoaderActivity.m_Activity
        return try {
            val fields: Array<Field> = Class.forName(activity.packageName + ".R\$styleable").fields
            for (field in fields) {
                if (field.name == name) {
                    return field.get(null) as IntArray
                }
            }
            null
        } catch (t: Throwable) {
            null
        }
    }
}
