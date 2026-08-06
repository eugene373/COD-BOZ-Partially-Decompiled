package com.ideaworks3d.marmalade

import android.content.Context

object ResourceUtility {
    @JvmStatic
    fun getResId(resName: String, resType: String): Int {
        val activity = LoaderActivity.m_Activity
        return getResId(resName, resType, activity)
    }

    @JvmStatic
    fun getResId(resName: String, resType: String, context: Context?): Int {
        var result = 0
        try {
            val resources = context?.resources
            val packageName = context?.packageName
            if (resources != null && packageName != null) {
                result = resources.getIdentifier(resName, resType, packageName)
            }
        } catch (e: IllegalArgumentException) {
        } catch (e: SecurityException) {
        }
        return result
    }

    @JvmStatic
    fun getResourceDeclareStyleableIntArray(name: String): IntArray? {
        val activity = LoaderActivity.m_Activity
        try {
            val className = activity!!.packageName + ".R\$styleable"
            val cls = Class.forName(className)
            val fields = cls.fields
            for (field in fields) {
                if (field.name == name) {
                    return field.get(null) as IntArray
                }
            }
        } catch (e: Throwable) {
        }
        return null
    }
}
