package com.ideaworks3d.marmalade.event

import android.view.View.OnKeyListener
import com.ideaworks3d.marmalade.LoaderAPI
import com.ideaworks3d.marmalade.NewIntentEvent
import com.ideaworks3d.marmalade.NewIntentListener
import com.ideaworks3d.marmalade.SuspendResumeEvent
import com.ideaworks3d.marmalade.SuspendResumeListener
import java.util.Stack

class ListenerManager {
    private var m_SuspendResumeListeners: SuspendResumeListenerList? = null
    private var m_ActivityResultListeners: ActivityResultListenerList? = null
    private var m_RequestPermissionsResultListeners: RequestPermissionsResultListenerList? = null
    private var m_NewIntentListeners: NewIntentListenerList? = null
    private var m_KeyListeners: Stack<OnKeyListener>? = null

    init {
        LoaderAPI.traceChan(
            className() + "-" + Thread.currentThread().name,
            "ListenerManager create lists",
        )
        m_SuspendResumeListeners = SuspendResumeListenerList()
        m_ActivityResultListeners = ActivityResultListenerList()
        m_RequestPermissionsResultListeners = RequestPermissionsResultListenerList()
        m_NewIntentListeners = NewIntentListenerList()
        m_KeyListeners = Stack()
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    fun addActivityResultListener(listener: ActivityResultListener) {
        m_ActivityResultListeners!!.add(listener)
    }

    fun removeActivityResultListener(listener: ActivityResultListener): Boolean {
        return m_ActivityResultListeners!!.remove(listener)
    }

    fun notifyActivityResultListeners(event: ActivityResultEvent) {
        m_ActivityResultListeners!!.notifyAll(event)
    }

    fun addRequestPermissionsResultListener(listener: RequestPermissionsResultListener) {
        m_RequestPermissionsResultListeners!!.add(listener)
    }

    fun removeRequestPermissionsResultListener(listener: RequestPermissionsResultListener): Boolean {
        return m_RequestPermissionsResultListeners!!.remove(listener)
    }

    fun notifyRequestPermissionsResultListeners(event: RequestPermissionsResultEvent) {
        m_RequestPermissionsResultListeners!!.notifyAll(event)
    }

    fun addSuspendResumeListener(listener: SuspendResumeListener) {
        m_SuspendResumeListeners!!.add(listener)
    }

    fun removeSuspendResumeListener(listener: SuspendResumeListener): Boolean {
        return m_SuspendResumeListeners!!.remove(listener)
    }

    fun notifySuspendResumeListeners(event: SuspendResumeEvent) {
        m_SuspendResumeListeners!!.notifyAll(event)
    }

    fun addNewIntentListener(listener: NewIntentListener) {
        m_NewIntentListeners!!.add(listener)
    }

    fun removeNewIntentListener(listener: NewIntentListener): Boolean {
        return m_NewIntentListeners!!.remove(listener)
    }

    fun notifyNewIntentListeners(event: NewIntentEvent) {
        m_NewIntentListeners!!.notifyAll(event)
    }

    fun pushKeyListener(listener: OnKeyListener) {
        m_KeyListeners!!.push(listener)
        LoaderAPI.getMainView().setOnKeyListener(listener)
    }

    fun popKeyListener(): OnKeyListener {
        val listener = m_KeyListeners!!.pop()
        LoaderAPI.getMainView().setOnKeyListener(listener)
        return listener
    }
}
