package com.ideaworks3d.marmalade

import android.content.pm.ApplicationInfo
import android.graphics.Bitmap
import android.os.Handler
import android.view.SurfaceHolder
import android.view.View

class s3eTest {
    private var m_Handler: Handler? = null
    var thread: Thread? = null
    private var suspendResumeCompletionFlag = false
    private val suspendResumeLock = Any()

    init {
        LoaderActivity.m_Activity!!.LoaderThread().runOnOSThread {
            m_Handler = Handler()
        }
    }

    fun PostSuspend() {
        LoaderAPI.trace("PostSuspend")
        m_Handler!!.post {
            LoaderActivity.m_Activity!!.onStop()
        }
    }

    fun PostResume() {
        LoaderAPI.trace("PostResume")
        m_Handler!!.post {
            LoaderActivity.m_Activity!!.onResume()
            synchronized(suspendResumeLock) {
                suspendResumeCompletionFlag = true
                (suspendResumeLock as java.lang.Object).notifyAll()
            }
        }
    }

    fun PostSetFocus(hasFocus: Boolean) {
        LoaderAPI.trace("PostSetFocus")
        m_Handler!!.post {
            LoaderActivity.m_Activity!!.m_View!!.onWindowFocusChanged(hasFocus)
        }
    }

    fun PostSuspendResume(delayMs: Int, iterations: Int) {
        thread = Thread {
            try {
                for (i in 0 until iterations) {
                    suspendResumeCompletionFlag = false
                    PostSuspend()
                    PostSetFocus(false)
                    Thread.sleep(delayMs.toLong())
                    PostResume()
                    PostSetFocus(true)
                    synchronized(suspendResumeLock) {
                        while (!suspendResumeCompletionFlag) {
                            (suspendResumeLock as java.lang.Object).wait()
                        }
                    }
                }
            } catch (_: InterruptedException) {
                // ignore
            } finally {
                PostResume()
                thread = null
            }
        }
        thread!!.start()
    }

    fun QueryThreadFinished(): Boolean = thread == null

    fun PostRotate(width: Int, height: Int) {
        LoaderAPI.trace("PostRotate")
        m_Handler!!.post {
            LoaderActivity.m_Activity!!.m_View!!.surfaceChanged(null as SurfaceHolder, 0, width, height)
        }
    }

    fun TakeScreenShot(out: IntArray): IntArray {
        LoaderAPI.trace("TakeScreenShot")
        val decorView = LoaderAPI.getActivity().window.decorView.findViewById<View>(android.R.id.content)
        decorView.isDrawingCacheEnabled = true
        val bmp = Bitmap.createBitmap(decorView.drawingCache)
        val w = bmp.width
        val h = bmp.height
        val pixels = IntArray(w * h)
        bmp.getPixels(pixels, 0, w, 0, 0, w, h)
        out[0] = w
        out[1] = h
        decorView.isDrawingCacheEnabled = false
        return pixels
    }

    fun GetAndroidTargetAPILevel(): Int {
        var target = 0
        try {
            val info: ApplicationInfo? = LoaderAPI.getActivity().applicationInfo
            if (info != null) {
                target = info.targetSdkVersion
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return target
    }
}
