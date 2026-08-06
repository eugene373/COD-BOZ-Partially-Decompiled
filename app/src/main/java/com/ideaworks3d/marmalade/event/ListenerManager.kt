package com.ideaworks3d.marmalade.event

import android.util.Log
import android.view.View
import com.ideaworks3d.marmalade.LoaderAPI
import com.ideaworks3d.marmalade.SuspendResumeEvent
import com.ideaworks3d.marmalade.SuspendResumeListener
import java.util.Stack

class ListenerManager {
    private var m_SuspendResumeListeners: SuspendResumeListenerList
    private var m_ActivityResultListeners: ActivityResultListenerList
    private var m_RequestPermissionsResultListeners: RequestPermissionsResultListenerList
    private var m_KeyListeners: Stack<View.OnKeyListener>

    init {
        Log.i("MARMALADE", "ListenerManager create lists")
        m_SuspendResumeListeners = SuspendResumeListenerList()
        m_ActivityResultListeners = ActivityResultListenerList()
        m_RequestPermissionsResultListeners = RequestPermissionsResultListenerList()
        m_KeyListeners = Stack()
    }

    fun addActivityResultListener(listener: ActivityResultListener) {
        m_ActivityResultListeners.add(listener)
    }

    fun addRequestPermissionsResultListener(listener: RequestPermissionsResultListener) {
        m_RequestPermissionsResultListeners.add(listener)
    }

    fun addSuspendResumeListener(listener: SuspendResumeListener) {
        m_SuspendResumeListeners.add(listener)
    }

    fun notifyActivityResultListeners(event: ActivityResultEvent) {
        m_ActivityResultListeners.notifyAll(event)
    }

    fun notifyRequestPermissionsResultListeners(event: RequestPermissionsResultEvent) {
        m_RequestPermissionsResultListeners.notifyAll(event)
    }

    fun notifySuspendResumeListeners(event: SuspendResumeEvent) {
        m_SuspendResumeListeners.notifyAll(event)
    }

    fun popKeyListener(): View.OnKeyListener {
        val result = m_KeyListeners.pop()
        val view = LoaderAPI.getMainView()
        view?.setOnKeyListener(result)
        return result
    }

    fun pushKeyListener(listener: View.OnKeyListener) {
        m_KeyListeners.push(listener)
        val view = LoaderAPI.getMainView()
        view?.setOnKeyListener(listener)
    }

    fun removeActivityResultListener(listener: ActivityResultListener): Boolean {
        return m_ActivityResultListeners.remove(listener)
    }

    fun removeRequestPermissionsResultListener(listener: RequestPermissionsResultListener): Boolean {
        return m_RequestPermissionsResultListeners.remove(listener)
    }

    fun removeSuspendResumeListener(listener: SuspendResumeListener): Boolean {
        return m_SuspendResumeListeners.remove(listener)
    }
}
