package com.ideaworks3d.marmalade

import android.util.Log
import android.view.View
import android.view.View.OnKeyListener
import android.widget.FrameLayout
import com.ideaworks3d.marmalade.event.ActivityResultEvent
import com.ideaworks3d.marmalade.event.ActivityResultListener
import com.ideaworks3d.marmalade.event.ListenerManager
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent
import com.ideaworks3d.marmalade.event.RequestPermissionsResultListener
import java.io.PrintWriter
import java.io.StringWriter

object LoaderAPI {
    const val S3E_RESULT_SUCCESS = 0
    const val S3E_RESULT_ERROR = 1

    @JvmStatic external fun s3eDebugTraceLine(msg: String)
    @JvmStatic external fun s3eDeviceYield(ms: Int)
    @JvmStatic external fun s3eConfigGetInt(section: String, name: String, out: IntArray): Int
    @JvmStatic external fun s3eConfigGetString(section: String, name: String, out: Array<String?>): Int
    @JvmStatic external fun s3eConfigGet(name: String, defaultValue: Int): Int

    @JvmStatic fun traceChan(channel: String, msg: String) {
        trace("$channel: $msg")
    }

    @JvmStatic fun trace(msg: String) {
        if (LoaderActivity.m_Activity != null) {
            s3eDebugTraceLine(msg)
        } else {
            Log.i("MARMALADE", msg)
        }
    }

    @JvmStatic fun getStackTrace(t: Throwable): String {
        val sw = StringWriter()
        val pw = PrintWriter(sw)
        t.printStackTrace(pw)
        return sw.toString()
    }

    @JvmStatic fun getStackTrace(): String {
        val t = Exception("Tracer")
        val sw = StringWriter()
        val pw = PrintWriter(sw)
        t.printStackTrace(pw)
        return sw.toString()
    }

    @JvmStatic fun getActivity(): LoaderActivity = LoaderActivity.m_Activity!!

    @JvmStatic fun getMainView(): View = LoaderActivity.m_Activity!!.m_View!!

    @JvmStatic fun getFrameLayout(): FrameLayout = LoaderActivity.m_Activity!!.m_FrameLayout!!

    @JvmStatic fun getListenerManager(): ListenerManager {
        if (LoaderActivity.m_Activity!!.m_ListenerManager == null) {
            LoaderActivity.m_Activity!!.m_ListenerManager = ListenerManager()
        }
        return LoaderActivity.m_Activity!!.m_ListenerManager!!
    }

    @JvmStatic fun addActivityResultListener(listener: ActivityResultListener) {
        getListenerManager().addActivityResultListener(listener)
    }

    @JvmStatic fun removeActivityResultListener(listener: ActivityResultListener): Boolean =
        getListenerManager().removeActivityResultListener(listener)

    @JvmStatic fun notifyActivityResultListeners(event: ActivityResultEvent) {
        getListenerManager().notifyActivityResultListeners(event)
    }

    @JvmStatic fun addRequestPermissionsResultListener(listener: RequestPermissionsResultListener) {
        getListenerManager().addRequestPermissionsResultListener(listener)
    }

    @JvmStatic fun removeRequestPermissionsResultListener(listener: RequestPermissionsResultListener): Boolean =
        getListenerManager().removeRequestPermissionsResultListener(listener)

    @JvmStatic fun notifyRequestPermissionsResultListeners(event: RequestPermissionsResultEvent) {
        getListenerManager().notifyRequestPermissionsResultListeners(event)
    }

    @JvmStatic fun addSuspendResumeListener(listener: SuspendResumeListener) {
        getListenerManager().addSuspendResumeListener(listener)
    }

    @JvmStatic fun removeSuspendResumeListener(listener: SuspendResumeListener): Boolean =
        getListenerManager().removeSuspendResumeListener(listener)

    @JvmStatic fun notifySuspendResumeListeners(event: SuspendResumeEvent) {
        getListenerManager().notifySuspendResumeListeners(event)
    }

    @JvmStatic fun addNewIntentListener(listener: NewIntentListener) {
        getListenerManager().addNewIntentListener(listener)
    }

    @JvmStatic fun removeNewIntentListener(listener: NewIntentListener): Boolean =
        getListenerManager().removeNewIntentListener(listener)

    @JvmStatic fun notifyNewIntentListeners(event: NewIntentEvent) {
        getListenerManager().notifyNewIntentListeners(event)
    }

    @JvmStatic fun pushKeyListener(listener: OnKeyListener) {
        getListenerManager().pushKeyListener(listener)
    }

    @JvmStatic fun popKeyListener(): OnKeyListener = getListenerManager().popKeyListener()
}
