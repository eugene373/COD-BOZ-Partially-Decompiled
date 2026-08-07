package com.ideaworks3d.marmalade.util

import java.lang.ref.WeakReference
import java.util.AbstractList
import java.util.ArrayList
import java.util.Iterator

class WeakArrayList : AbstractList<Any?>() {

    private val m_list: ArrayList<WeakReference<*>> = ArrayList()

    fun expunge() {
        val it = m_list.iterator()
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove()
            }
        }
    }

    override fun add(element: Any?): Boolean {
        return if (!contains(element)) {
            m_list.add(WeakReference(element))
        } else {
            false
        }
    }

    override fun get(index: Int): Any? {
        val ref = m_list[index]
        return ref?.get()
    }

    override fun size(): Int = m_list.size

    override fun iterator(): Iterator<Any?> = object : Iterator<Any?> {
        private val it: Iterator<WeakReference<*>> = m_list.iterator()

        override fun next(): Any? {
            val ref = it.next()
            return ref?.get()
        }

        override fun remove() {
            it.remove()
        }

        override fun hasNext(): Boolean = it.hasNext()
    }
}
