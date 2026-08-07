package com.ideaworks3d.marmalade;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.ideaworks3d.marmalade.event.ActivityResultEvent;
import com.ideaworks3d.marmalade.event.ActivityResultListener;
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent;
import com.ideaworks3d.marmalade.event.RequestPermissionsResultListener;

public abstract class LoaderActivitySlave implements ActivityResultListener, SuspendResumeListener, RequestPermissionsResultListener, NewIntentListener {
      protected LoaderActivitySlave() {
            LoaderAPI.addSuspendResumeListener(this);
            LoaderAPI.addActivityResultListener(this);
            LoaderAPI.addRequestPermissionsResultListener(this);
            LoaderAPI.addNewIntentListener(this);
      }

      protected void onStart() {
      }

      protected void onCreate(Bundle var1) {
      }

      protected void onStop() {
      }

      protected void onDestroy() {
      }

      protected void onPause() {
      }

      protected void onResume() {
      }

      protected void onActivityResult(int var1, int var2, Intent var3) {
      }

      protected void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      }

      protected void onNewIntent(Intent var1) {
      }

      protected Activity getActivity() {
            return LoaderActivity.m_Activity;
      }

      public void onActivityResultEvent(ActivityResultEvent var1) {
            Log.i("LoaderActivitySlave", "onActivityResultEvent request: " + var1.m_requestCode + " result: " + var1.m_resultCode);
            this.onActivityResult(var1.m_requestCode, var1.m_resultCode, var1.m_intent);
      }

      public void onRequestPermissionsResultEvent(RequestPermissionsResultEvent var1) {
            Log.i("LoaderActivitySlave", "onRequestPermissionsResult request: " + var1.m_requestCode);
            this.onRequestPermissionsResult(var1.m_requestCode, var1.m_permissions, var1.m_grantResults);
      }

      public void onSuspendResumeEvent(SuspendResumeEvent var1) {
            if (var1.eventType == SuspendResumeEvent.EventType.RESUME) {
                  this.onResume();
            }

            if (var1.eventType == SuspendResumeEvent.EventType.SUSPEND) {
                  this.onPause();
            }

            if (var1.eventType == SuspendResumeEvent.EventType.SHUTDOWN) {
                  this.onDestroy();
            }

      }

      public void onNewIntentEvent(NewIntentEvent var1) {
            if (var1.eventType == NewIntentEvent.EventType.NEWINTENT) {
                  this.onNewIntent(var1.intent);
            }

      }
}
