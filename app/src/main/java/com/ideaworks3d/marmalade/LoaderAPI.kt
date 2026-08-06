package com.ideaworks3d.marmalade

import com.ideaworks3d.marmalade.event.ActivityResultEvent
import com.ideaworks3d.marmalade.event.ActivityResultListener
import com.ideaworks3d.marmalade.event.ListenerManager
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent
import com.ideaworks3d.marmalade.event.RequestPermissionsResultListener
import com.ideaworks3d.marmalade.SuspendResumeEvent
import com.ideaworks3d.marmalade.SuspendResumeListener

object LoaderAPI {
    const val S3E_RESULT_ERROR = 1
    const val S3E_RESULT_SUCCESS = 0

    private var m_ListenerManager: ListenerManager? = null

    external fun s3eConfigGet(name: String, defaultValue: Int): Int
    external fun s3eConfigGetInt(grp: String, name: String, out: IntArray): Int
    external fun s3eConfigGetString(grp: String, name: String, out: Array<String>): Int
    external fun s3eDebugTraceLine(msg: String)
    external fun s3eDeviceYield(ms: Int)

    @JvmStatic
    fun getActivity(): LoaderActivity? {
        return LoaderActivity.m_Activity
    }

    @JvmStatic
    fun getFrameLayout(): android.widget.FrameLayout? {
        return LoaderActivity.m_Activity?.m_FrameLayout
    }

    @JvmStatic
    fun getMainView(): LoaderView? {
        return LoaderActivity.m_Activity?.m_View
    }

    @JvmStatic
    fun getListenerManager(): ListenerManager {
        if (m_ListenerManager == null) {
            m_ListenerManager = ListenerManager()
        }
        return m_ListenerManager!!
    }

    @JvmStatic
    fun addActivityResultListener(listener: ActivityResultListener) {
        getListenerManager().addActivityResultListener(listener)
    }

    @JvmStatic
    fun removeActivityResultListener(listener: ActivityResultListener): Boolean {
        return getListenerManager().removeActivityResultListener(listener)
    }

    @JvmStatic
    fun notifyActivityResultListeners(event: ActivityResultEvent) {
        getListenerManager().notifyActivityResultListeners(event)
    }

    @JvmStatic
    fun addRequestPermissionsResultListener(listener: RequestPermissionsResultListener) {
        getListenerManager().addRequestPermissionsResultListener(listener)
    }

    @JvmStatic
    fun removeRequestPermissionsResultListener(listener: RequestPermissionsResultListener): Boolean {
        return getListenerManager().removeRequestPermissionsResultListener(listener)
    }

    @JvmStatic
    fun notifyRequestPermissionsResultListeners(event: RequestPermissionsResultEvent) {
        getListenerManager().notifyRequestPermissionsResultListeners(event)
    }

    @JvmStatic
    fun addSuspendResumeListener(listener: SuspendResumeListener) {
        getListenerManager().addSuspendResumeListener(listener)
    }

    @JvmStatic
    fun removeSuspendResumeListener(listener: SuspendResumeListener): Boolean {
        return getListenerManager().removeSuspendResumeListener(listener)
    }

    @JvmStatic
    fun notifySuspendResumeListeners(event: SuspendResumeEvent) {
        getListenerManager().notifySuspendResumeListeners(event)
    }

    @JvmStatic
    fun pushKeyListener(listener: android.view.View.OnKeyListener) {
        getListenerManager().pushKeyListener(listener)
    }

    @JvmStatic
    fun popKeyListener(): android.view.View.OnKeyListener {
        return getListenerManager().popKeyListener()
    }

    @JvmStatic
    fun trace(message: String) {
        s3eDebugTraceLine(message)
    }

    @JvmStatic
    fun traceChan(channel: String, message: String) {
        s3eDebugTraceLine("$channel: $message")
    }
}
