package com.ideaworks3d.marmalade.event

import com.ideaworks3d.marmalade.util.WeakArrayList

open class ListenerList {
    protected var m_Listeners: WeakArrayList = WeakArrayList()

    open fun add(listener: Any?): Boolean {
        m_Listeners.expunge()
        return if (listener != null) m_Listeners.add(listener) else false
    }

    open fun remove(listener: Any?): Boolean {
        m_Listeners.expunge()
        return if (listener != null) m_Listeners.remove(listener) else false
    }
}
