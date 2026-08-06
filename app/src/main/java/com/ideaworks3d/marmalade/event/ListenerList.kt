package com.ideaworks3d.marmalade.event

import com.ideaworks3d.marmalade.util.WeakArrayList

open class ListenerList<T> {
    protected val m_Listeners: WeakArrayList<T> = WeakArrayList()

    fun add(listener: T): Boolean {
        m_Listeners.expunge()
        return if (listener != null) {
            m_Listeners.add(listener)
        } else {
            false
        }
    }

    fun remove(listener: T): Boolean {
        m_Listeners.expunge()
        return if (listener != null) {
            m_Listeners.remove(listener)
        } else {
            false
        }
    }

    protected fun getListeners(): List<T> {
        return m_Listeners.expungeSafeList()
    }
}
