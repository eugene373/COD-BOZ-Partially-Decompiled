package com.ideaworks3d.marmalade.util

import java.lang.ref.WeakReference
import java.util.AbstractList
import java.util.Iterator
import java.util.NoSuchElementException
import kotlin.collections.MutableIterator

class WeakArrayList<E> : AbstractList<E>() {
    private val m_list: MutableList<WeakReference<E>> = mutableListOf()

    override val size: Int
        get() = m_list.size

    override fun add(element: E): Boolean {
        expunge()
        m_list.add(WeakReference(element))
        return true
    }

    override fun remove(element: E?): Boolean {
        if (element == null) return false
        val iter = m_list.iterator()
        while (iter.hasNext()) {
            val ref = iter.next()
            val value = ref.get()
            if (value == null) {
                iter.remove()
            } else if (value == element) {
                iter.remove()
                return true
            }
        }
        return false
    }

    override fun removeAt(index: Int): E {
        val ref = m_list.removeAt(index)
        return ref.get() ?: throw IndexOutOfBoundsException("Element at index $index is null")
    }

    override fun get(index: Int): E {
        val ref = m_list[index]
        return ref.get() ?: throw IndexOutOfBoundsException("Element at index $index is null")
    }

    fun expunge() {
        val iter = m_list.iterator()
        while (iter.hasNext()) {
            if (iter.next().get() == null) {
                iter.remove()
            }
        }
    }

    fun expungeSafeList(): List<E> {
        expunge()
        return m_list.mapNotNull { it.get() }
    }

    override fun iterator(): MutableIterator<E> {
        expunge()
        return object : MutableIterator<E> {
            private val iter = m_list.iterator()
            private var nextValue: E? = null
            private var hasNextCached = false

            override fun hasNext(): Boolean {
                while (hasNextCached || iter.hasNext()) {
                    if (hasNextCached) {
                        return true
                    }
                    val value = iter.next().get()
                    if (value != null) {
                        nextValue = value
                        hasNextCached = true
                        return true
                    }
                }
                return false
            }

            override fun next(): E {
                if (!hasNextCached && !hasNext()) {
                    throw NoSuchElementException()
                }
                hasNextCached = false
                return nextValue!!
            }

            override fun remove() {
                throw UnsupportedOperationException("remove() not supported")
            }
        }
    }

    fun getListeners(): List<E> {
        expunge()
        return m_list.mapNotNull { it.get() }
    }
}
