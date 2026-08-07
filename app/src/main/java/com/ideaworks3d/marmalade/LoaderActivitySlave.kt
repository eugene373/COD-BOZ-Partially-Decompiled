package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.ideaworks3d.marmalade.event.ActivityResultEvent
import com.ideaworks3d.marmalade.event.ActivityResultListener
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent
import com.ideaworks3d.marmalade.event.RequestPermissionsResultListener

abstract class LoaderActivitySlave :
    ActivityResultListener,
    SuspendResumeListener,
    RequestPermissionsResultListener,
    NewIntentListener {

    protected constructor() {
        LoaderAPI.addSuspendResumeListener(this)
        LoaderAPI.addActivityResultListener(this)
        LoaderAPI.addRequestPermissionsResultListener(this)
        LoaderAPI.addNewIntentListener(this)
    }

    protected open fun onStart() {}
    protected open fun onCreate(savedInstanceState: Bundle?) {}
    protected open fun onStop() {}
    protected open fun onDestroy() {}
    protected open fun onPause() {}
    protected open fun onResume() {}
    protected open fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {}
    protected open fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {}
    protected open fun onNewIntent(intent: Intent?) {}

    protected open fun getActivity(): Activity = LoaderActivity.m_Activity!!

    override fun onActivityResultEvent(event: ActivityResultEvent) {
        Log.i("LoaderActivitySlave", "onActivityResultEvent request: ${event.m_requestCode} result: ${event.m_resultCode}")
        onActivityResult(event.m_requestCode, event.m_resultCode, event.m_intent)
    }

    override fun onRequestPermissionsResultEvent(event: RequestPermissionsResultEvent) {
        Log.i("LoaderActivitySlave", "onRequestPermissionsResult request: ${event.m_requestCode}")
        onRequestPermissionsResult(event.m_requestCode, event.m_permissions!!, event.m_grantResults!!)
    }

    override fun onSuspendResumeEvent(event: SuspendResumeEvent) {
        when (event.eventType) {
            SuspendResumeEvent.EventType.RESUME -> onResume()
            SuspendResumeEvent.EventType.SUSPEND -> onPause()
            SuspendResumeEvent.EventType.SHUTDOWN -> onDestroy()
        }
    }

    override fun onNewIntentEvent(event: NewIntentEvent) {
        if (event.eventType == NewIntentEvent.EventType.NEWINTENT) {
            onNewIntent(event.intent)
        }
    }
}
